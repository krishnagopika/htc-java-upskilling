package com.htc;
import java.util.*;
public class Tie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the sequence of games won :");
		String sd=s.nextLine();
		String []as=sd.split(" ");
		int c=0,d=0;
		for(int i=1;i<as.length;i++)
		{
			if(Integer.parseInt(as[i])%2==0)
			{
				c++;
			}
			else
				d++;
		}
			if(c>d)
			{
				System.out.println("John");
			}
			else if(d>c)
			{
				System.out.println("Jacob");
				
			}
			else
				System.out.println("Tie");
		}

}
