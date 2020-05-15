package Acmicpc;

import java.util.*;
public class bj10972{

	static boolean permutation(int[]a) { 
		int index= a.length-1;

		while(index>0 && a[index]<=a[index-1])
			index -=1;

		if(index<=0)		//������ ������ ���(������ ���� ���������ϰ��)
			return false;

		int j= a.length-1;
		
		while(a[j]<=a[j-1])
			j -=1;
		
		int temp= a[index-1];		//���� ������ �Ѿ�� ���ؼ� index��ġ�� j��ġ�� ��ȯ
		a[index-1]= a[j];
		a[j]= temp;
		
		j= a.length-1;
		
		while(index<j) {		//index�޺κ��� ��������->������������ �ٲٱ� ����
			temp= a[index];
			a[index]= a[j];
			a[j]= temp;
			
			index +=1;
			j -=1;
		}
		
		return true;		//���� ������ ���� ���
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		int[]a= new int[n];

		for(int i=0; i<n; ++i)
			a[i]= input.nextInt();
		
		if(permutation(a)) {
			for(int i=0; i<n; ++i)
				System.out.print(a[i]+" ");
			System.out.println();
		}
		else
			System.out.println(-1);
	}

}
