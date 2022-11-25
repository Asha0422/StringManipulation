import java.util.*;
class maxOccuringChar 
{
	public static void main(String[] args) 
	{
		int count=0;
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t Program To Find The Maximum Occuring Character Present In A String");
		System.out.println("Enter any string");
		s1=s.nextLine();
		char[] a=new char[s1.length()];
		char[] b=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			a[i]=s1.charAt(i);
		}
		System.out.println("The Original String is :");
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
		//System.out.println("The length of the string is: "+b.length);
		if(count==0)
			System.out.println("There is no duplicate character");
		else
		{
        System.out.println("Details Of Maximum Occuring Character is: ");
		int L[]=new int[s1.length()];
		int visited=-1;
		for(int i=0;i<s1.length();i++)
			{
			int q1=1;
			for(int j=i+1;j<s1.length();j++)
				{
				if(a[i]==a[j])
				{
					q1++;
				L[j]=visited;
				}
			}
			if(L[i]!=visited)
				L[i]=q1;
			}
            for(int i=0;i<L.length;i++)
            {
                for(int j=i+1;j<L.length;j++)
                {
                    if(L[i]<L[j])
                    {
                        int temp=L[i];
                        char t=a[i];
                        L[i]=L[j];
                        a[i]=a[j];
                        L[j]=temp;
                        a[j]=t;
                    }
                }
            }
            System.out.println("  "+a[0]+ " occurs "+L[0]+" times");
		}
			s.close();
	}
}
