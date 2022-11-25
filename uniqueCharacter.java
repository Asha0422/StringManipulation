import java.util.*;
class uniqueCharacter
{
	public static void main(String[] args) 
	{
		int count=0;
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t Program To Check If The String Contains Only Unique Characters");
		System.out.println("Enter any string");
		s1=s.nextLine();
		char[] a=new char[s1.length()];
		char[] b=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			a[i]=s1.charAt(i);
		}
		System.out.println("\nThe Original String is :");
		for(char k:a)
		System.out.print(k);
		System.out.println();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(a[i]==a[j]  && j!=i)
				{
					b[i]=a[j];
					count=count+1;
				}
			}
		}
		if(count==0)
			System.out.println("\nYes, The String Contains Only Unique Characters");
		else
		{
			System.out.println("\nNo, The String Has Duplicates");
		}
	}
}
