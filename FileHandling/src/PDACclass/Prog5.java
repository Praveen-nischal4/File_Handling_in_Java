package PDACclass;

import java.io.*;

public class Prog5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char u;
		do {
			u=(char)br.read();
			System.out.print(u);
		}while(u!='q');
	}

}
