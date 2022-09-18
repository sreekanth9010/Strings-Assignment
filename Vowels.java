package stringsAssignment;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="iNeuron";
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u' )
			{
				count++;
			}
		}
		System.out.println("The number of vowels are :"+count);
		System.out.println("The number of constantss are :"+(s.length()-count));
	}

}
