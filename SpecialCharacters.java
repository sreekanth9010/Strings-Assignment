package stringsAssignment;

import java.util.Scanner;

public class SpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string ..!");
		String s=sc.nextLine();
		sc.close();
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='!' || s.charAt(i)=='@' ||s.charAt(i)=='#' || s.charAt(i)=='$'|| s.charAt(i)=='%' ||s.charAt(i)=='^' || s.charAt(i)=='&'|| s.charAt(i)=='?' || s.charAt(i)=='*')
			{
				count++;
			}
		}
		System.out.println("The number of specila characters are :" +count);
	}

}
