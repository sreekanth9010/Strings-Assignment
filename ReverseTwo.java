package stringsAssignment;

public class ReverseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Think Twice";
		String s2=s1.toLowerCase();
		String s3="";
		String []s = s2.split(" ");
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length();j++)
			{
				s3+=s[i].charAt(s[i].length()-1-j);
			}
			s3+=" ";
		}
		System.out.println(s3);

	}

}
