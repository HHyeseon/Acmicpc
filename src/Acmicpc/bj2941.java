package Acmicpc;

import java.util.*;
public class bj2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] arr= {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String s = input.next();
		
		
		for(int i=0; i<arr.length; ++i) {
			s= s.replace(arr[i], "c"); 
			
		}
		
		System.out.print(s.length());
	}

}
