import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.lang.Integer;

public class AsciiArtBuilder
{
    public static void main(String[] args)
    {
    	File dir = new File("Art/");
    	File[] files = dir.listFiles();
			for (File file : files) {
				listFileContent(file);
			}
    }
    
    public static void listFileContent(File file) {
    	
    	String outputPath = String.format("%s/%s_o.txt", file.getParent(), file.getName());
    	File output = new File(outputPath);
    	try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			System.out.println("File path : " + file.getParent());
			System.out.println("File name : " + file.getName());
			System.out.println("File name : " + file.getName());
			//System.out.println("Contents of file:");
			//System.out.println(stringBuffer.toString());

			imageToNumRep(file, output);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    /**
     * Take an ascii image in a file and change it to a number representation that
     * is a comma separated list with number of chars followed by the character.
     * For example the image:
     * 2
     * ----****
     * ++++----
     * would be represented as:
     * 2
     * 4,-,4,*
     * 4,+,4,-
     *
     * Take the first file as input, produce the second as a file in output.
     * The first line in the file is the number of lines the image is.
     * @param input
     * @param output
     */
    public static void imageToNumRep(File input, File output)
    {
		System.out.println("==========start processing========");
		char[][] rep = imageToArrayRep(input);
		for (char[] array : rep) {
			for (char c : array) {
				System.out.print(c);
			}
			System.out.println("");
		}
    }

    /**
     * Reverse the imageToNumRep function, go from the number representation to 
     * printing the ascii image.
     * @param input
     * @param output
     */
    public static void numToImageRep(File input, File output)
    {

    }

    /**
     * Change an ascii image to an array representation.
     * For example the following image:
     * 2
     * ****
     * ----
     * would produce a two dimensional array that contains
     * [*,*,*,*]
     * [-,-,-,-]
     * @param input
     * @return
     */
    public static char[][] imageToArrayRep(File input)
    {
    	char[][] rep = null;
    	try {
			FileReader fileReader = new FileReader(input);
			//BufferedReader bufferedReader = new BufferedReader(fileReader);
			LineNumberReader bufferedReader = new LineNumberReader(fileReader);
			String line;
			int counter = 0;
			while ((line = bufferedReader.readLine()) != null) {
				if (counter == 0) {
					rep = new char[Integer.valueOf(line)][];
				}
				else {
					rep[counter - 1] = line.toCharArray();
				}
				
				counter ++;
			}
			fileReader.close();
			
			return rep;
		} catch (IOException e) {
			e.printStackTrace();
		}
        return new char[1][];
    }

    /**
     * Reverse the imageToArrayRep function, produce the ascii image in a file
     * given the array representation.
     * @param arrayRep
     * @param output
     */
    public static void arrayToImageRep(char[][] arrayRep, File output)
    {

    }
}