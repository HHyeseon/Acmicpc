package Acmicpc;

import java.util.*;
public class bj17298 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		int []a = new int[n+1];
		Stack <Integer> stack= new Stack<>();
		
		for(int i=0; i<n; ++i)
			a[i]= input.nextInt();
		
		for(int j=0; j<n; ++j) {
			while(!stack.isEmpty() && a[stack.peek()]<a[j]) {			//스택의 top에 있는 값과 a의 값과 비교해서 a의 값이 크면 top의 위치에 있는 값을 a의 값으로 바꾼다.
				a[stack.pop()]= a[j];
			}
			
			stack.push(j);				//해당 인덱스를 스택에 저장
		}
		
		while(!stack.isEmpty()) {			//더이상 비교할 값이 없을 경우
			a[stack.pop()]= -1;
		}
		
		StringBuilder sb= new StringBuilder();
		for(int k=0; k<n; ++k) {
			sb.append(a[k]).append(' ');
		}
		
		System.out.println(sb);
	}

}
