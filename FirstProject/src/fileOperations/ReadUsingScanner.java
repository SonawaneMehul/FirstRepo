package fileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadUsingScanner
{
	public static void main(String[] args)
	{
		try
		{			
		Scanner sc = new Scanner(new File("FirstFolder\\FirstFile.txt"));
		String line;
		while(sc.hasNext()) 
		{
			line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: " + e);
			e.printStackTrace();
		}
	}

}
