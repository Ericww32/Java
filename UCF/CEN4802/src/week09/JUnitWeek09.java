package week09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitWeek09
{
	private static String installerExeInput = "week09-installer.exe";
	private static String installerNsiInput = "week09-installer.nsi";
	private static String helloWorldClassName = "HelloWorld.class";

	private static String packageString = "week09\\";
	private static String srcString = "\\src\\";
	private static String binString = "\\bin\\";

	private static String installerExePath = "";
	private static String installerNsiPath = "";
	private static String installDir = "";
	private static String binDir = "";
	private static String helloWorldClassFilePath = "";

	private static File installerExeFile;
	private static File installerNsiFile;
	private static File sourceDirectory;
	private static File binDirectory;
	private static File helloWorldClassFile;
	

	String[] expectedFileNames = { installerExeInput, installerNsiInput };

	private static String makeNsisExe = "C:/Program Files (x86)/NSIS/makensis.exe";

	@BeforeClass
	public static void setUpFiles()
	{
		File curDirectory = new File(".");

		try
		{
			trace(curDirectory.getCanonicalPath());
			sourceDirectory = getSrcDirectory(curDirectory);
			binDirectory = getBinDirectory(curDirectory);
			String srcPath = sourceDirectory.getCanonicalPath();
			installerExePath = srcPath + "\\" + installerExeInput;
			installerNsiPath = srcPath + "\\" + installerNsiInput;

			installerExeFile = new File(installerExePath);
			installerNsiFile = new File(installerNsiPath);
			helloWorldClassFilePath = binDirectory.getCanonicalPath() + "\\" + packageString + helloWorldClassName;
			helloWorldClassFile = new File(helloWorldClassFilePath);
			installDir = sourceDirectory.getCanonicalPath() +"\\install";
			
			dumpConfiguration();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * This needs to coordinate the sequence Verify the files, compile, verify
	 * installer, run installer
	 */
	@Test
	public void checkInstaller()
	{
		cleanup();
		
		if(!verifyFilesSubmitted())
		{
			fail("verifyFilesSubmitted: File(s) not found");
		}

		if(!compileInstall())
		{
			fail("compileInstall: Didn't compile installer");
		}

		if(!verifyInstaller()) // checks the installer was created
		{
			fail("verifyInstaller: Installer not found");
		}

		if(!runInstaller())
		{
			fail("runInstaller: Installer failed");
		}
		
		if(!verifyInstallerExecutionDeployedFiles())
		{
			fail("verifyInstallerExecution: Installer failed execute as required");
		}
	}
	
	/**
	 * remove any previous install folders and content
	 */
	private void cleanup()
	{
		
	}

	private boolean verifyInstallerExecutionDeployedFiles()
	{
		// verify the installation directory is created 
		File installDirectory = new File(installDir);
		if( !installDirectory.exists())
		{
			trace(" installation folder doesn't exist: " + installDir);
			return false;
		}
		
		// and the class fail was installed
		String helloWorldInstalledPath = installDir + "\\" + helloWorldClassName;
		File helloWorldFileInstalledPath= new File(helloWorldInstalledPath);
		if(!helloWorldFileInstalledPath.exists())
		{
			trace(" helloWorldFileInstalledPath folder doesn't exist: " + installDir);
			
			trace("dump what is in this location");
			File[] list = installDirectory.listFiles();
			for(File f : list)
			{
				trace(" - " + f.getName());
			}
			
			return false;
		}
		
		return true;
	}
	private boolean runInstaller()
	{
		boolean installerExecuted = true;
		try
		{
			Runtime rt = Runtime.getRuntime();
			// Process pr = rt.exec("installer /S /D=<installdir>"); example
			String cmd = String.format("%s /S /D=%s",
					installerExeFile.getCanonicalPath(), installDir);
			trace("Running installer compile: " + cmd);

			Process pr = rt.exec(cmd);
			String cmdLineOutput = getCommandLineResponse(pr);
			trace(cmdLineOutput);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		return installerExecuted;
	}

	/**
	 * Verifies the installer was created during compilation
	 * @return true if it exists, otherwise false
	 */
	private boolean verifyInstaller()
	{
		boolean installerCreated = true;

		if(!installerExeFile.exists())
		{
			installerCreated = false;
		}

		return installerCreated;
	}

	/**
	 * Verifies the student submitted the expected files.
	 * @return
	 */
	private boolean verifyFilesSubmitted()
	{
		boolean fileExists = true;
		try
		{
			if(!installerExeFile.exists())
			{
				trace("Not found: " + installerExeFile.getCanonicalPath());
				fileExists = false;
			}

			if(!installerNsiFile.exists())
			{
				trace("Not found: " + installerNsiFile.getCanonicalPath());
				fileExists = false;
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
			fail(ex.getMessage());
		}

		return fileExists;
	}

	/**
	 * Copies the helloWorld class file to the source folder
	 * This is compiled from the Java source earlier.
	 * 
	 * The execute the makensis compiler on the script.
	 * 
	 * @return true on success otherwise false
	 */
	private boolean compileInstall()
	{
		boolean compiledInstall = true;

		try
		{
			//
			// prepare for compile - copy .class files to the installer script folder
			//
			File targetFile = new File(sourceDirectory.getCanonicalPath() + "\\" + helloWorldClassFile.getName());
			trace("target file: " + targetFile.getCanonicalPath());
			Files.copy(helloWorldClassFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING );
			
			//
			// Execute the installer script compiler
			//
			Runtime rt = Runtime.getRuntime();
			// Process pr = rt.exec("cmd /c dir");
			String cmd = String.format("%s /V1 %s", makeNsisExe,
					installerNsiFile.getCanonicalPath());
			trace("Running installer compile: " + cmd);
			Process pr = rt.exec(cmd);
			
			String cmdLineOutput = getCommandLineResponse(pr);
			trace(cmdLineOutput);

			compiledInstall = true;
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
			compiledInstall = false;
		}

		return compiledInstall;
	}

	/**
	 * when running in the IDE the parent directory is different than when
	 * running from the commandline for evaluation. This method detects that and
	 * applies the following hueristic
	 * 
	 * If the parent is bin, then find the sibling src. If the parent is not bin
	 * (IDE), then add src and the package as a parent
	 * 
	 * @return
	 */
	private static File getSrcDirectory(File curDir)
	{
		trace("getSrcDirectory");
		File result = curDir;
		try
		{
			String path = curDir.getCanonicalPath();
			trace("  " + path);
			String srcDir = "";
			if(path.endsWith("bin")) // command line run
			{
				// get the parent of this folder
				// and create the src folder path
				int endIndex = path.length() - "bin".length();
				String parentPath = path.substring(0, endIndex);
				trace("bin parentPath: " + parentPath);

				srcDir = parentPath + srcString;
			}
			else // IDE run (has the package in the path
			{
				srcDir = path + srcString + packageString;
			}

			result = new File(srcDir);
			installDir = result.getCanonicalPath();
			trace("Normalized source directory: " + installDir);
		}
		catch(IOException e)
		{
			trace(e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
	
	private static File getBinDirectory(File curDir)
	{
		trace("getBinDirectory");
		File result = curDir;
		try
		{
			String path = curDir.getCanonicalPath();
			trace("  " + path);
			if(!path.endsWith("bin")) 
			{
				binDir = path + binString;
				result = new File(binDir);
			}

			binDir = result.getCanonicalPath();
			trace("Normalized bin directory: " + binDir);			
		}
		catch(IOException e)
		{
			trace(e.getMessage());
			e.printStackTrace();
		}		
		
		return result;
	}

	private static void dumpConfiguration()
	{
		trace("String configuration values");
		trace("installer exe path: " + installerExePath);
		trace("installer NSI path: " + installerNsiPath);
		trace("installer dir path: " + installDir);
		trace("installer bin path: " + binDir);
		trace("installer HelloWorld.class path: " + helloWorldClassFilePath);

		try
		{
			trace("File configuration values");
			trace("installer exe File: " + installerExeFile.getCanonicalPath());		
			trace("installer NSI File: " + installerNsiFile.getCanonicalPath());
			trace("installer dir File: " + sourceDirectory.getCanonicalPath());
			trace("HelloWorld Class File: " + helloWorldClassFile.getCanonicalPath());
		}
		catch(IOException e)
		{
			trace("Error getting File configuration values");
			e.printStackTrace();
		}
	}
	
	private static String getCommandLineResponse(Process pr)
	{
		BufferedReader input = null;
		StringBuilder cmdLineInfo = new StringBuilder();

		// dump the command line response
		input = new BufferedReader(
				new InputStreamReader(pr.getInputStream()));

		String line = null;
		try
		{
			while((line = input.readLine()) != null)
			{
				System.out.println(line);
				cmdLineInfo.append(line);
				cmdLineInfo.append('\n');
			}
			
			int exitVal = pr.waitFor();
			trace("Exited with error code " + exitVal);
		}
		catch(IOException e)
		{
			trace(e.getMessage());
			e.printStackTrace();
		}
		catch(InterruptedException e)
		{
			trace(e.getMessage());
			e.printStackTrace();
		}

		return cmdLineInfo.toString();
	}
	
	private static void trace(String msg)
	{
		System.out.println(msg);
	}

}
