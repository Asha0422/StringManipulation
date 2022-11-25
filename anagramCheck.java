
import java.util.*;
class anagramCheck
{
	public static void main(String[] args) 
	{
		int count=0, c1=0;
		String s1, s2;
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t Program To Check The String Is Anagram");
		System.out.println("\nEnter first string");
		s1=s.nextLine();
		System.out.println("\nEnter second string");
		s2=s.nextLine();
		char[] a=new char[s1.length()];
		char[] b=new char[s2.length()];
		if(s1.length()!=s2.length())
		{
			System.out.println("\nNumber Of Characters Mismatch, Please Enter A Proper String");
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				a[i]=s1.charAt(i);
			}
			for(int j=0;j<s2.length();j++)
			{
				b[j]=s2.charAt(j);
			}
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<(s1.length())-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						char temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<(s2.length())-i-1;j++)
			{
				if(b[j]>b[j+1])
				{
					char temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
				{
				if(a[i]==b[i])
					{
					count++;
					continue;
					}
				}
				//System.out.println("Count= "+count);
			if(count==a.length)
				System.out.println("\nIt is an Anagram");
			else
				System.out.println("\nIt is not an Anagram");
		}
	}
}