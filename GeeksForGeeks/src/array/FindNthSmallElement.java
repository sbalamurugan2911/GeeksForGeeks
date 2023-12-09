package array;

import java.util.Arrays;

public class FindNthSmallElement {
	
	public int find(int arr[],int k) {
		 Arrays.sort(arr);
	        
	        return arr[arr.length-(k+1)];
	}

	public static void main(String[] args) {
		
		int a[]= {7,10,4,3,20,15};
	
		FindNthSmallElement f=new FindNthSmallElement();
		
		System.out.println(f.find(a, 0));
		
	}

}
