import java.util.*;
class pangramCheck
{
	public static void main(String[] args) 
	{
		int count=0, c1=0;
		String s1, s2;
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t Program To Check The Sentence Is Pangram");
		System.out.println("\nEnter first string");
		s1=s.nextLine();
		s2=s1.toUpperCase();
		char[] a=new char[s1.length()];
		int[] k=new int[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			a[i]=s1.charAt(i);
			k[i]=s2.charAt(i);
		}
		System.out.print("\nThe Original String is :");
		for(char k1:a)
			System.out.print(k1);
		System.out.println();
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<(s1.length())-i-1;j++)
				{
					if(k[j]>k[j+1])
					{
						int temp=k[j];
						k[j]=k[j+1];
						k[j+1]=temp;
					}
				}
			}
			for(int i=0;i<s2.length();i++)
		{
				if((k[i]>=65 && k[i]<=90) && k[i]!=32)
					count=count+1;
		}
		System.out.println();
		if(count >= 26)
		System.out.println("It is a Pangram");
		else
			System.out.println("It is not a Pangram");
		
	}
}