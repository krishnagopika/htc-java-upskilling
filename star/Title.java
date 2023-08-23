package com.htc;
import java.util.*;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an input string: ");
	        String in = scanner.nextLine();
	        char []c=in.toCharArray();
	        boolean fs =true;
	       // String title = convertToTitleCase(in);
	        for(int i=0;i<c.length;i++)
	        {
	        	if(Character.isLetter(c[i]))
	        	{
	        		if(fs)
	        		{
	        			c[i]=Character.toUpperCase(c[i]);
	        			fs=false;
	        		}
	        	}
	        	else
	        		fs=true;
	        }
	        System.out.println("Title case output: " +String.valueOf(c));

	        scanner.close();
	    }

	   /* public static String convertToTitleCase(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        StringBuilder titleCase = new StringBuilder();
	        boolean nextTitleCase = true;

	        for (char c : str.toCharArray()) {
	            if (Character.isSpaceChar(c) || c == '\t' || c == '\n') {
	                nextTitleCase = true;
	            } else if (nextTitleCase) {
	                c = Character.toTitleCase(c);
	                nextTitleCase = false;
	            } else {
	                c = Character.toLowerCase(c);
	            }
	            titleCase.append(c);
	        }

	        return titleCase.toString();*/


}
