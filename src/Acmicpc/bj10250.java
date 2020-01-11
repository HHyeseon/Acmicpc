package Acmicpc;


import java.util.*;
public class bj10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();		//테스트 데이터의 수
		int H=0;		//호텔의 층 수
		int W=0;		//각 층의 방 수
		int N=0;		//N번째 손님

		int layer=0;		//층
		int count=0;		//홋수
		
		int[]arr = new int[T];

		for(int i=0; i<T; ++i) {
			H= input.nextInt();    
			W= input.nextInt();		
			N= input.nextInt();		

			layer= N%H;
			count= N/H+1;
			if(layer==0) {		//다 찼을 때
				
				arr[i]= H*100+count-1;
			}
			else {
				arr[i]= (layer*100)+count;
			}


			System.out.println(arr[i]);
		}


	}

}
