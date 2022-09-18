package stringsAssignment;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string1");
		String s1 =sc.nextLine();
		System.out.println("please enter the string1");
		String s2 =sc.nextLine();
		sc.close();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		boolean result = false;
		char temp1=' ';
		char [] a = new char[s1.length()]; 
		for(int i=0;i<s1.length();i++)
		{
			a[i]=s1.charAt(i);
			
		}
		for(int j=0;j<a.length;j++)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					temp1=a[i];
					a[i]=a[i+1];
					a[i+1]=temp1;
					
				}
				
			}
		}
		
		char temp2=' ';
		char [] a2 = new char[s2.length()]; 
		for(int i=0;i<s2.length();i++)
		{
			a2[i]=s2.charAt(i);
			
		}
		for(int j=0;j<a2.length;j++)
		{
			for(int i=0;i<a2.length-1;i++)
			{
				if(a2[i]>a2[i+1])
				{
					temp2=a2[i];
					a2[i]=a2[i+1];
					a2[i+1]=temp2;
					
				}
				
			}
		}
		
		if(a.length ==a2.length)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a2[j])
				{
					result=true;
				}
				else
				{
					result = false;
				}
			}
		}
		else
		{
			result=false;
		}
		
		if(result==true)
		{
			System.out.println(s1 +" and "+ s2 +"  are anagrams");
		}
		else
		{
			System.out.println(s1 +" and "+ s2 +"  are  not anagrams");
		}

	}

}
