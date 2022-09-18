package stringsAssignment;

import java.util.Scanner;

public class Alphabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string");
		String s =sc.nextLine();
		sc.close();
		s=s.toLowerCase();
		
		char temp=' ';
		char [] a = new char[s.length()]; 
		for(int i=0;i<s.length();i++)
		{
			a[i]=s.charAt(i);
			
		}
		for(int j=0;j<a.length;j++)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					
				}
				
			}
		}
		System.out.println(a);
		
	}

}
