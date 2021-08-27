package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//Sorting made easy in java 8 streams 
public class StreamSort {

	public static void main(String[] args) {
		List<String> lis = new ArrayList<String>();
		lis.add("Ashwini");
		lis.add("AArya");
		lis.add("Abishek");
		lis.add("Aradhya");
		System.out.println("Ascending sort results :-");
		lis.stream().sorted().forEach(System.out::println);
        //for descending order 
		System.out.println("Descending  sort results :-");
		lis.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
