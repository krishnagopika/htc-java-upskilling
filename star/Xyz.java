package com.htc;
import java.util.*;

public class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=s.nextInt();
		String []sp=new String[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			sp[i]=s.next();
		}
		int count=0;
		for(String a:sp)
		{
			if(isPalindrome(a))
			{
				System.out.println(a);
				count++;
			}
		}
	System.out.println(count);
	}

	private static boolean isPalindrome(String a) {
		// TODO Auto-generated method stub
		int l=0;
		int r=a.length()-1;
		while(l<r)
		{
			if(l==0 && r==a.length()-1)
			{
				char s=Character.toUpperCase(a.charAt(r));
				if(a.charAt(l)==s)
					return true;
				else
					return false;
			}
			if(l>0 && a.charAt(l)==a.charAt(r))
			{
				return true;
			}
			l++;
			r--;
		}
		return true;
	}

}
