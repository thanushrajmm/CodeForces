problem link -> [ https://codeforces.com/contest/4/problem/A ] 

import java.io.*;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
		int weight = s.nextInt();
 
			if(weight==2){
				System.out.println("NO");
			}
			else if(weight % 2 == 0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}	
	}
