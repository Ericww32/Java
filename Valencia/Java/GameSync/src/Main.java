import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Path userPath = Paths.get("/Users/eric/Desktop/Test9000");

		try {
			System.out.println("*********************************");
			 dirFileList(userPath);
			System.out.println("*********************************");
			dirFileMerge(userPath);
			System.out.println("*********************************");
			 dirFileList(userPath);
			System.out.println("*********************************");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param pathToDir
	 */
	public static void dirFileList(Path pathToDir) {
		String strPath = pathToDir.toString();
		// create a file that is really a directory
		File userDir = new File(strPath);

		// Checking to see if directory is real
		if (userDir.exists()) {
			// get a listing of all files in the directory
			File[] listOfFiles = userDir.listFiles();
			// sort the list of files (optional)
			Arrays.sort(listOfFiles);
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					System.out.println("File " + listOfFiles[i].getName());
				} else if (listOfFiles[i].isDirectory()) {
					System.out.println("Directory " + listOfFiles[i].getName());
				}
			}
		}
	}

	/**
	 * 
	 * @param pathToDir
	 * @throws IOException
	 */
	public static void dirFileMerge(Path pathToDir) throws IOException {
		String strPath = pathToDir.toString();
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String outputFile = "0_Stream_" + timeStamp + ".txt";
		File dir = new File(strPath);
		// create object of PrintWriter for output file
		PrintWriter pw = new PrintWriter(strPath + "/" + outputFile);
		// Get list of all the files in form of String Array
		String[] fileNames = dir.list();
		Arrays.sort(fileNames);

		// loop through directory for file names
		for (int i = 0; i < fileNames.length; i++) {
			if (fileNames[i].contentEquals(".DS_Store")) {
				File file = new File(strPath + "/.DS_Store");
				file.delete();
				continue;
			}

			if (!(fileNames[i].contentEquals(outputFile))) {
				System.out.println("Reading: " + fileNames[i]);
				// create instance of file from Name of
				// the file stored in string Array
				File f = new File(dir, fileNames[i]);
				// create object of BufferedReader
				BufferedReader br = new BufferedReader(new FileReader(f));
				// Read from current file
				String line = br.readLine();

				while (line != null) {
					pw.println(line);
					line = br.readLine();
				}
				pw.flush();
				f.delete();
				System.out.println("Deleted: " + fileNames[i]);
			}
		}
		System.out.println("All files" + " in " + dir.getName() + " merged");
	}
}
