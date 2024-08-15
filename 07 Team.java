problem link -> [ https://codeforces.com/problemset/problem/231/A ]
import java.io.*;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[T];
 
		for(int i = 0; i<T; i++){
 
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
 
			arr[i] = x+y+z;
		}
 
		int ans = 0;
 
		for(int i = 0; i<T ; i++){
			if(arr[i]>=2){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
