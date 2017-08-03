package commandLineArguments;

import java.util.Arrays;

public class TestMain {
	public static void main(String args[]){
		int arr[] = new int[args.length];
		for(int i = 0; i < args.length; i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(arr);
		System.out.println("Second Largest Element: "+arr[arr.length-1]);
		System.out.println("Second Smallest Element: "+arr[1]);
	}
}
