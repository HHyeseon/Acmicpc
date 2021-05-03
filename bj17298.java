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
			while(!stack.isEmpty() && a[stack.peek()]<a[j]) {			//������ top�� �ִ� ���� a�� ���� ���ؼ� a�� ���� ũ�� top�� ��ġ�� �ִ� ���� a�� ������ �ٲ۴�.
				a[stack.pop()]= a[j];
			}
			
			stack.push(j);				//�ش� �ε����� ���ÿ� ����
		}
		
		while(!stack.isEmpty()) {			//���̻� ���� ���� ���� ���
			a[stack.pop()]= -1;
		}
		
		StringBuilder sb= new StringBuilder();
		for(int k=0; k<n; ++k) {
			sb.append(a[k]).append(' ');
		}
		
		System.out.println(sb);
	}

}
