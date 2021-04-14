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
		////////모두 역순으로 채움, 문자열로 입력받았으므로 숫자로 변환
		
		for(int i=0; i<max_length; ++i) {
			int value= a[i]+b[i];
			a[i]= value%10;		//반올림을 하기 때문에 10을 나눈 나머지가 자리값이 된다.
			a[i+1]+= (value/10);		//10을 나눈 몫이 올림값이 된다.		
		}
		
		StringBuilder sb= new StringBuilder();
		if(a[max_length]!= 0) {
			sb.append(a[max_length]);
		}	//가장 높은 자릿수가 0일 수도 있기때문에 0이 아닐경우에만 출력
		
		for(int i= max_length-1; i>=0; --i) {
			sb.append(a[i]);
		}
		
		
		System.out.print(sb);
	}

}




 
 