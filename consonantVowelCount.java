import java.util.*;
class consonantVowelCount 
{
	public static void main(String[] args) 
	{
		int count=0, v1=0, c1=0;
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter any string");
		s1=s.nextLine();
		char[] a=new char[s1.length()];
		int[] k=new int[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			a[i]=s1.charAt(i);
			k[i]=s1.charAt(i);
		}
		System.out.print("\nThe Original String is :");
		for(char k1:a)
			System.out.print(k1);
			System.out.print("\nThe ASCII Value for the String is :");
		for(int b:k)
		System.out.print(b+ "  ");
		System.out.println();
		System.out.println("\nThe length of the string is: "+s1.length());
		for(int i=0;i<s1.length();i++)
		{
			if(a[i] == 65 || a[i]==69 || a[i]==73 || a[i]==79 || a[i]==85 || a[i]==97 || a[i]==101 || a[i]==105 || a[i]==111 || a[i]==117)
			{
				v1=v1+1;
			}
		}
		for(int i=0;i<s1.length();i++)
		{
			if((a[i]>=32 && a[i]<=47) || (a[i]>=58 && a[i]<=64) || (a[i]>=91 && a[i]<=96) || (a[i]>=123 && a[i]<=126))
			{
				count++;
			}
		}
		for(int i=0;i<k.length;i++)
		{
			if((a[i]>=66 && a[i]<=68) || (a[i]>=70 && a[i]<=72) || (a[i]>=74 && a[i]<=78) || (a[i]>=80 && a[i]<=84) || (a[i]>=86 && a[i]<=90) || 
				(a[i]>=98 && a[i]<=100) || (a[i]>=102 && a[i]<=104) || (a[i]>=106 && a[i]<=110) || (a[i]>=112 && a[i]<=116) || 
				(a[i]>=118 && a[i]<=122))
			{
				c1++;
			}
		}
			if(v1==0)
			System.out.println("\nNO vowels");
		else
			System.out.println("\nThere are "+v1+ " vowels present in the string");
		if(c1==0)
			System.out.println("\nNO Consonants");
		else
			System.out.println("\nThere are "+c1+ " Consonants present in the string");
		if(count==0)
			System.out.println("\nThere is no special character");
		else			
		System.out.println("\nThe number of special charaters: "+count);
		if(v1==0 && c1==0 && count==0)
			System.out.println("\nEnter A Proper String");
	}
}
