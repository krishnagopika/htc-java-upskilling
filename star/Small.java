package com.htc;
import java.util.*;
public class Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter nth smallest number:");
		int n=s.nextInt();
		System.out.println("Enter size of Array:");
		int ns=s.nextInt();
		int ds[]=new int[ns];
		for(int i=0;i<ns;i++)
		{
			ds[i]=s.nextInt();
		}
		Arrays.sort(ds);
		if(n>ds.length)
		{
			System.out.println("Invalid position");
		}
		else
			System.out.println(ds[n-1]);
	}

}
