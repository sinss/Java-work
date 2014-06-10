import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
    	File output = new File("Art/output");
    	File reverse = new File("Art/reverse");
    	if (!output.exists()) {
    		output.mkdir();
    	}
    	if (!reverse.exists()) {
    		reverse.mkdir();
    	}
    	/*
    	product the ascii files into number files
    	*/
    	File dir = new File("Art/");
    	File[] files = dir.listFiles();
		for (File file : files) {
			if (!file.isDirectory())
				listFileContent(file);
		}
		/*
		reverse the number files into ascii files
		*/
		File dir2 = new File("Art/output/");
		File[] files2 = dir2.listFiles();
		for (File file : files2) {
			if (!file.isDirectory())
				listReverseContent(file);
		}
    }
    
    public static void listFileContent(File file) {
		if (file.getName().contains(".DS_Store"))
			return;
    	String outputPath = String.format("Art/output/%s", file.getName());
    	File output = new File(outputPath);
    	/*
    	is file exist then delete, or the output will append at the end of the file
    	*/
    	if (output.exists()) {
    		output.delete();
    	}
    	System.out.println("File path : " + file.getParent());
		System.out.println("File name : " + file.getName());

		imageToNumRep(file, output);
    }
    
    public static void listReverseContent(File file) {
    	/*
    	ignore the mac auto generate files
    	*/
		if (file.getName().contains(".DS_Store"))
			return;
    	String outputPath = String.format("Art/reverse/%s", file.getName());
    	File output = new File(outputPath);
    	/*
    	is file exist then delete, or the output will append at the end of the file
    	*/
    	if (output.exists()) {
    		output.delete();
    	}
    	System.out.println("File path : " + file.getParent());
		System.out.println("File name : " + file.getName());
		numToImageRep(file, output);
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
		System.out.println("=============================== start processing ===============================");
		char[][] rep = imageToArrayRep(input);
		char[][] out = new char[rep.length][];
		int index = 0;
		for (char[] array : rep) {
			//initialize the array of each line
			out[index] = new char[array.length];
			/*
			print out the source for debugging
			*/
			for (char c : array) {
				System.out.print(c);
			}
			System.out.println("");
			/*
			the last line of the file is empty, so we use continue command to 
			jump to next line
			*/
			if (array.length == 0)
				continue;
			char current = array[0];
			int cnt = 0;
			StringBuilder sb = new StringBuilder();
			for (char c : array) {
				if (current == c) {
				/*
				the previous char is equal to current char then count + 1
				*/
					cnt ++;
				}
				else {
				/*
				if the previous char not equal to current char then means char changed, 
				so print the previous char and number of counts
				we can't use the comma to split the char and number or chars, so we add a 
				slash to determine the split symbol.
				*/
					sb.append(cnt + "/,/," + current + "/,/,");
					cnt = 1;
				}
				current = c;
			}
			//print the last char and number of counts
			//System.out.print(cnt + "," + current);
			sb.append(cnt + "/,/," + current);
			System.out.println(sb.toString());
			out[index] = sb.toString().toCharArray();
			index ++;
		}
		
		arrayToImageRep(out, output);
    }

    /**
     * Reverse the imageToNumRep function, go from the number representation to 
     * printing the ascii image.
     * @param input
     * @param output
     */
    public static void numToImageRep(File input, File output)
    {	
    	char[][] out = null;
    	try {
    		FileReader fileReader = new FileReader(input);
			LineNumberReader bufferedReader = new LineNumberReader(fileReader);
			String line;
			int counter = 0;
			while ((line = bufferedReader.readLine()) != null) {
				/*
				first line is line number
				*/
				if (counter > 0) {
					/*
					split for each line by ','
					*/
					String[] array = line.split("/,/,");
					StringBuilder sb = new StringBuilder();
					for (int i = 0 ; i < array.length; i+=2) {
						try {
							int numberOfItems = Integer.parseInt(array[i]);
							String item = array[i+1];
							for (int j = 0 ; j < numberOfItems; j++) {
								System.out.print(item);
								sb.append(item);
							}
						}
						catch (NumberFormatException e) {
							System.out.println("error in " + counter + " lines");
							System.exit(0);
						}	
					}
					System.out.println("");
					out[counter - 1] = sb.toString().toCharArray();
				}
				else {
					int numberoflines = Integer.parseInt(line);
					out = new char[numberoflines][];
				}
				counter ++;
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		arrayToImageRep(out, output);
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
    	BufferedWriter bw;
    	try {
    		bw = new BufferedWriter(new FileWriter(output, true));
    		/*
    		if direct print a integer would produce a error , because the integer 
    		can't direct print , It must covert to a String
    		*/
    		bw.write(arrayRep.length + "");
    		bw.newLine();
			for (char[] array : arrayRep) {
				try {
					StringBuilder sb = new StringBuilder();
					for (char c : array) {
						sb.append(c);
						System.out.print(c);
					}
				
					bw.write(sb.toString());
					bw.newLine();
				}
				catch (NullPointerException e) {
				/*
				avoid to print null or empty array
				*/
					System.out.println("this line is null");
				}
				finally {
					System.out.println("");
				}
			}
			bw.close();
		}
    	catch (IOException e) {
    		//catch the IOException while writing files
    		System.out.println("output file error");
    	}
    }
}