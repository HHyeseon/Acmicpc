package Acmicpc;



import java.io.*;
import java.util.StringTokenizer;
public class bj1193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a=0;   //�и�
		int b=0;   //����
		int line=0;
		int count=0;

		int n= Integer.parseInt(st.nextToken());


		while(true) {
			for(int i=0; i<line+1; ++i) {			//�Է��� ���ڿ� �ش��ϴ� ������ ����
				count++;
			}
			line++;

			if(count>=n)
				break;
		}

		int find=0;					//�ش� ������ �� ��° �������� ����
		for(int j=0; j<line; ++j) {
			find+=j;
		}


		a=n-find;		
		b=line+1-a;

		if(line%2 == 0) {
			System.out.print(a);
			System.out.print('/');
			System.out.print(b);
		}
		if(line%2 != 0) {
			System.out.print(b);
			System.out.print('/');
			System.out.print(a);
		}

		
	
	}
	

}
