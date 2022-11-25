import java.util.*;
class palindromeCheckStrNum
{
	public static void main(String[] args) 
	{
		int count, k=0,size,n;
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t Program To Check A Number/String Is Palindrome Or Not");
		System.out.println("Enter any string/Number");
		s1=s.nextLine();
		char[] a=new char[s1.length()];
		char[] b=new char[s1.length()];
        size=s1.length();
        count=s1.length();
        n=s1.length()/2;
        System.out.println("Length is: "+n);
		for(int i=0;i<s1.length();i++)
		{
			a[i]=s1.charAt(i);
            b[i]=s1.charAt(i);
		}
		System.out.println("\nThe Original data is :");
		for(char ek:a)
		System.out.print(ek);
		System.out.println();
        if(size%2==0)
        {
		    for(int i=0,j=(count-1);i<n && j>=n;i++,j--)
                {
                    if(a[i]==b[j])
                        k=k+1;
                }
		}
        else
        {
            for(int i=0,j=(count-1);i<n && j>n;i++,j--)
		    {
                    if(a[i]==b[j])
                    k=k+1;
            }
        }
        if(k==n)
        System.out.println("\nThe Input "+s1+" Is A Palindrome");
        else
        System.out.println("\n The Input "+s1+" Is Not A Palindrome");
        // for(int i=0,j=(count-1);i<n && j>=n;i++,j--)
        //             System.out.println("a["+i+"] = "+a[i]+" ,b[ "+j+"] = "+b[j]);
        //     for(int i=0;i<n;i++)
		//     {
        //         for(int j=(count-1);j>n;j--)
        //         {
        //             System.out.println(a[j]+" , "+b[j]);
        //         }
        //     }
        s.close();
	}
}

