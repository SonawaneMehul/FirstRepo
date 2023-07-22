package fileOperations;

import java.io.File;

public class FileDeletion
{
	public static void main(String[] args)
	{
		File file = new File("FirstFolder\\SecondFile.txt");
		if(file.delete())
		{
			System.out.println("File successfully deleted");
		}
		else
		{
			System.out.println("Error in deleting");
		}
	}

}
