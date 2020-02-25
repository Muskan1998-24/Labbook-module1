package lab3;

import java.util.Arrays;
public class Lab3_3 {

public static void main(String []args) {
	

		
		int array[]= {12,52,89024,275455,475246,76131,9868653};
		System.out.print(Arrays.toString(getSorted(array)));
		}
		static int[] getSorted(int arr[])
		{
		for (int i=0;i<arr.length;i++)
		{
		int reversed=0;
		for(;arr[i] != 0;  arr[i]/= 10) {
	    int digit = arr[i] % 10;
	    reversed = reversed * 10 + digit;
			            
		}
		arr[i]=reversed;
				}
			Arrays.sort(arr);
			return arr;
			}
	
		}



