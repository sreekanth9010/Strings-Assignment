package stringsAssignment;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string1");
		String s1 =sc.nextLine();
		sc.close();
		s1=s1.toLowerCase();
		boolean result=false;

		//checking the length of string and each character  
		if(s1.length()>=26)
		{
			for (char ch = 'a'; ch <= 'z'; ch++)   
			{  
			String s2=""+ch;
			if (s1.contains(s2))   
			{  
			result = true;  
			break;  
			}  
			}  
			
		}
		else
		{
			result=false;
		}
		
		
		//checking whether pangram or not
		if(result==true)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not pangrams");
		}
		
	}
}
