package Acmicpc;


import java.util.*;
public class bj10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();		//�׽�Ʈ �������� ��
		int H=0;		//ȣ���� �� ��
		int W=0;		//�� ���� �� ��
		int N=0;		//N��° �մ�

		int layer=0;		//��
		int count=0;		//Ȫ��
		
		int[]arr = new int[T];

		for(int i=0; i<T; ++i) {
			H= input.nextInt();    
			W= input.nextInt();		
			N= input.nextInt();		

			layer= N%H;
			count= N/H+1;
			if(layer==0) {		//�� á�� ��
				
				arr[i]= H*100+count-1;
			}
			else {
				arr[i]= (layer*100)+count;
			}


			System.out.println(arr[i]);
		}


	}

}
