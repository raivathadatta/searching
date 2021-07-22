package com.Bridgelabs.programs;

import java.util.Scanner;

public class StringPermitatioins {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	String string =scanner.nextLine();
	/*Write static functions to return all permutations of a String using iterative method and
Recursion method. Check if the arrays returned by two string functions are equal.*/
	 // Permutation permutation = new Permutation();
    permute(string, 0, string.length()-1);
}
static void permute(String string,int start,int ending) {
	if(start ==ending) {
		System.out.println(string);
	}
	else
	for(int i=start;i<=ending;i++) {
		  string = swap(string,start,i);
          permute(string, start+1, ending);
          string = swap(string,start,i);
	}
}
 static String swap(String string, int position1, int position2) {
	  char temp;
      char[] charArray = string.toCharArray();
      temp = charArray[position1] ;
      charArray[position1] = charArray[position2];
      charArray[position2] = temp;
      return String.valueOf(charArray);
}
}
