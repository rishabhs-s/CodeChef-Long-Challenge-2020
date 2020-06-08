import java.util.*;
import java.lang.*;
import java.io.*;
public class Xystr{
public static void main(String[] args) throws java.lang.Exception
{
	try
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++){
		String s=sc.next();
		int pairs=0;
		for(int j=0;j<s.length()-1;){
			if(s.charAt(j)!=s.charAt(j+1)){
				pairs++;
				j+=2;
			}
			else j++;
		}
	System.out.println(pairs);
	}
	}
	
	catch (Exception e)
	{
	}
}
}
