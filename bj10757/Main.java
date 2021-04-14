package bj10757;
import java.util.*;
	
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String str1= input.next();
		String str2= input.next();
		
		int max_length= Math.max(str1.length(), str2.length());
		int []a= new int[max_length+1];
		int []b= new int[max_length+1];
		
		for(int i= str1.length()-1, idx=0; i>=0; --i, ++idx) {
			a[idx]= str1.charAt(i)-'0';		
		}
		
		for(int i= str2.length()-1, idx=0; i>=0; --i, ++idx) {
			b[idx]= str2.charAt(i)-'0';
		}
		////////��� �������� ä��, ���ڿ��� �Է¹޾����Ƿ� ���ڷ� ��ȯ
		
		for(int i=0; i<max_length; ++i) {
			int value= a[i]+b[i];
			a[i]= value%10;		//�ݿø��� �ϱ� ������ 10�� ���� �������� �ڸ����� �ȴ�.
			a[i+1]+= (value/10);		//10�� ���� ���� �ø����� �ȴ�.		
		}
		
		StringBuilder sb= new StringBuilder();
		if(a[max_length]!= 0) {
			sb.append(a[max_length]);
		}	//���� ���� �ڸ����� 0�� ���� �ֱ⶧���� 0�� �ƴҰ�쿡�� ���
		
		for(int i= max_length-1; i>=0; --i) {
			sb.append(a[i]);
		}
		
		
		System.out.print(sb);
	}

}




 
 