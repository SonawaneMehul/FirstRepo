package fileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class First
{
	public static void main(String[] args)
	{	
		File myFile = new File("FirstFolder");
		myFile.mkdir();
		
		try	{
			myFile = new File("FirstFolderr\\FirstFile.txt");
			myFile.createNewFile();
		}
		catch (IOException e) {
			System.out.println("Error while creating file: " + e);
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("FirstFolder\\FirstFile.txt", true))) {
			bw.write("Mehul");
			bw.newLine();
			bw.write("Sonawane");
			bw.newLine();
			bw.close();
		}
		catch(IOException e) {
			System.out.println("Error while writing in file: " + e);
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(myFile));
			String line;
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found: " + e);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(myFile);
		
	
	}

}
