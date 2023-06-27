import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test {

    public static void main(String[] args) throws IOException{
    	try{

    		FileReader file = new FileReader("Courses.txt");
    		BufferedReader reader = new BufferedReader(file);
    		String line = reader.readLine();

    	    while (line != null) {
        	    Searcher(line);

    	    }

    		reader.close();

    	}catch(FileNotFoundException e){
    		System.out.println("ERROR");
    	}

    }

    public static void Searcher(String stringy){

    	Pattern checkRegex = Pattern.compile("[A-Z]{3}\\s[\\d]{4}(\\w)?\\s3\\s[\\d]{1}\\s^[1-3]");//did this through trial and error
		Matcher regexMatcher = checkRegex.matcher(stringy);
		System.out.println("made it here");
		while(regexMatcher.find()) {
			if (regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
		}

    }
}
