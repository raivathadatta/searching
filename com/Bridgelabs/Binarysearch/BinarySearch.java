package com.Bridgelabs.Binarysearch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class BinarySearch {
	public static <T> void main(String[] args) throws IOException {

			FileReader reader = new FileReader("C:\\Users\\Lenovo\\Desktop\\data.txt");
			// TODO Auto-generated catch block
		Scanner scanner = new Scanner(reader);
		String i = "";
		T [] array = null;
		while (scanner.hasNextLine()) {
			i += scanner.nextLine();
		}


		array = (T[]) i.split(" ");
		for (int i1 = 0; i1 < array.length; i1++) {
			for (int j = 0; j < array.length; j++) {
				if (((String) array[i1]).compareTo((String) array[j]) < 0) {
					String temp = (String) array[i1];
					array[i1] = array[j];
					array[j] = (T) temp;
				}
			}
		}
		System.out.println("enter the word to search in the file");
		for (T string : array) {
			System.out.println(string+" ");
		}
		Scanner scanner1 = new Scanner(System.in);
		String check = scanner1.next();
		
		System.out.println(binarySearch(array, 0, array.length - 1, check));
		reader.close();
	}

	private static <T> int binarySearch(T[] array, int start, int ending, String check) {
		if (ending >= 1) {
			int mid = (start + ending) / 2;
			 System.out.println(mid);
			if (check.compareTo((String) array[mid]) == 0) {

				return mid;
			}

			if (((String) array[mid]).compareTo(check) <0) {
				System.out.println((check.compareTo((String) array[mid]) > 0 )+" "+"hhhhh");
				
				try {
					//return 0;
				return binarySearch(array, mid, ending, check);
				} catch (Exception e) {
					//System.err.println("reeor");
				}
				

			}
			if (((String) array[mid]).compareTo(check) < 0) {
				System.err.println("hehe");
				return binarySearch(array, start, mid, check);
			}
			
		}
		return -1;
	}
}