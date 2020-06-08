import java.util.*;
import java.lang.*;
import java.io.*;
public class Longcf2{
public static void main(String[] args) throws java.lang.Exception
{
	try
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	
	
	for (int i=0;i<t;i++){
		int sum=0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int j=0;j<n;j++)
		{
		int p=sc.nextInt();
		
		if(p>k)  sum=sum+(p-k);
		}
System.out.println(sum);
	}
	}
	catch (Exception e)
	{
	}
}
}
