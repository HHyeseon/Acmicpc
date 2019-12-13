package bj1016;

import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(r.readLine());
		long min=Long.parseLong(t.nextToken());
		long max=Long.parseLong(t.nextToken());
		r.close();
		
		boolean[]a = new boolean[(int)(max-min+1)];
		for(int i=2; true; ++i) {
			long square=i*i;
			if(square>max)
				break;
			
		}
		
	}

}
