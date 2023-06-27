import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class PrintIt {


public static void printit(Person guy[], Employee worker[], Manager associate[]) throws IOException {

	String horse = "Guyfi.txt";
	String pony = "Workfi.txt";
	String zebra = "Manfi.txt";

	try {
		FileWriter fileWriter = new FileWriter(horse);

		BufferedWriter out = new BufferedWriter(fileWriter);

		out.write("people list:");
		out.newLine();

		for (int i = 0; i < guy.length; i++) {
			out.write((i + 1) + ") " + guy.length);
			out.newLine();
		}out.close();
		}catch (IOException ex) {
				System.out.println("Error writing to file '" + horse + "'");
			}
		
		try {
			FileWriter fWriter = new FileWriter(pony);

			BufferedWriter output = new BufferedWriter(fWriter);

			output.write("worker list:");
			output.newLine();

			for (int i = 0; i < worker.length; i++) {
				output.write((i + 1) + ") " + worker.length);
				output.newLine();
			}output.close();
		}catch (IOException ex) {
				System.out.println("Error writing to file '" + pony + "'");
			}
			
			try {
				FileWriter flWriter = new FileWriter(zebra);

				BufferedWriter outed = new BufferedWriter(flWriter);

				outed.write("managment list:");
				outed.newLine();

				for (int i = 0; i < associate.length; i++) {
					outed.write((i + 1) + ") " + associate.length);
					outed.newLine();
				}

		outed.close();
	} catch (IOException ex) {
		System.out.println("Error writing to file '" + zebra + "'");
	}

}// end of printit 
}