package Acmicpc;

import java.util.Scanner;

public class bj2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		int count=0;
		
		while(true) {
			if(n%5==0 && n>=0) {		//5�� ������ �������� ���� ���̾����
				System.out.println((n/5)+count);
				break;
			}
			
			if(n<0) {
				System.out.println(-1);
				break;
			}		//������� 4�� n-=3�� ���� ������ �Ǳ� ������ 0�� ��µ�
			
			n-= 3;
			count++;
		}
		
	}

}
