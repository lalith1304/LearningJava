package day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		String [] s = {"java","automation","selenium","eclipse"};
		
		System.out.println("Before Sorting : "+Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After Sorting : "+Arrays.toString(s));

	}

}
