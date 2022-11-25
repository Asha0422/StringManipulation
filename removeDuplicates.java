import java.util.*;
class removeDuplicates
{
	public static void main(String[] args) 
	{
		int count=0, c1=0;
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t Program To Remove The Duplicate Characters Present In A String");
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
					b[j]=a[j];
					count=count+1;
				}
			}
		}
		//System.out.println("\nThe length of the string is: "+b.length);
		if(count==0)
			System.out.println("\nThere is no duplicate character");
		else
		{
			System.out.println("\nString after removing the duplicates: ");
			for(int i=0;i<b.length;i++)
				{
				if(b[i]=='\u0000')
					{
					System.out.print(s1.charAt(i)+"  ");
					c1=c1+1;
					}
				}
				System.out.println("\n" +(s1.length()-c1)+" duplicate character(s) has been removed"); 
		}
	}
}
