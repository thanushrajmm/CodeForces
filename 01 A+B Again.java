problem link -> [https://codeforces.com/contest/1999/problem/A]
import java.io.*;
import java.util.Scanner; 

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t!=0){
			int n = sc.nextInt();
			int sum = 0;
			while(n!=0){
				int lastDigit = n%10;
				sum = sum + lastDigit;
				n = n/10;
			}
			t--;
			System.out.println(sum);
		}
	}
}
