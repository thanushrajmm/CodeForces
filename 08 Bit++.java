problem link -> [ https://codeforces.com/problemset/problem/282/A ] 
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 0;
		while(n!=0){
			String st = sc.next();
			if(st.charAt(1)=='+'){
				x++;
			}
			else{
				x--;
			}
			n--;
		}
		System.out.println(x);
	}
}
