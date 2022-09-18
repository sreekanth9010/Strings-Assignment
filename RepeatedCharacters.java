package stringsAssignment;

import java.util.Scanner;

public class RepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string");
		String string = sc.nextLine();
		sc.close();
		string=string.toLowerCase();
		int count;
		char []a = new char[string.length()];
		for(int i=0;i<string.length();i++)
		{
			a[i]=string.charAt(i);
			
		}
		 for(int i = 0; i <a.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <a.length; j++) {  
	                if(a[i] == a[j] && a[i] != ' ') {  
	                    count++;  
	                     
	                    a[j] = '0';  
	                }  
	            }  
	            
	            if(count > 1 && a[i] != '0')  
	                System.out.println(a[i]);  
	        }  
		
		
		
		

	}

}
