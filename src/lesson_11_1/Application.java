package lesson_11_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[20];
		Random rnd = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(101);
		}
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Array after sorting ASCENDING: " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Array after sorting DESCENDING: " + Arrays.toString(arr));

	}

}
