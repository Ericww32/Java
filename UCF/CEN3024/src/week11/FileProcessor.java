package week11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {
	File fileName = new File("Week11.txt");

	public FileProcessor() {
	}

	public String saveTextContent(String text) throws FileProcessingException {
		File iAmBatman;
		iAmBatman = this.fileName;
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(iAmBatman);
			iAmBatman.createNewFile();
			writer.write(text);
		} catch (IOException e) {
			
		} finally{
			try {
				if (writer != null)
					writer.flush();
					writer.close();
			} catch (IOException e) {
				
			}
		} 
		
		String pathWay = iAmBatman.getAbsolutePath();
		
		return pathWay;
	}

}
