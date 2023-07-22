package fileOperations;

import java.util.Scanner;

public class Fourth
{
	public static void main(String[] args)
	{
			try(Scanner sc = new Scanner(System.in))
			{				
				System.out.println("Enter a number");
				int inp = sc.nextInt();
				System.out.println(inp);
			}
	}

}
