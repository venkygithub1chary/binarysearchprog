package basic_program;

import java.util.Arrays;

public class Binary_search {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10}; //should be sorted order
		System.out.println(Arrays.binarySearch(a, 8));// other approach is simple only single line
		Boolean flag=false;
		int key=5;
		int l=0;
		int h=a.length-1;
		while (l<=h) 
		{
			int m=(l+h)/2;
			if(a[m]==key)
			{
				System.out.println("element found...");
				flag=true;
				break;
			}
			if(a[m]<key)
			{
				l=m+1;
			}
			if(a[m]>key)
			{
				h=m-1;
			}
		}
		if(flag==false)
		{
			System.out.println("element not found.......");
		}

	}

}
