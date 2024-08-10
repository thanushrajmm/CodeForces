problem link -> [ https://codeforces.com/contest/1999/problem/B ]
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t!=0){
			int a1, a2, b1, b2;
			int ans = 0; 
			a1 = sc.nextInt();
			a2 = sc.nextInt();
			b1 = sc.nextInt();
			b2 = sc.nextInt();

			if((a1>=b1 && a2>b2) || (a1>b1 && a2>=b2)) {
            ans+=2; 
        	}
        	if((a1>=b2 && a2>b1) || (a1>b2 && a2>=b1)) {
            ans+=2;
			}
			System.out.println(ans);
			t--;
		}
	}
}
