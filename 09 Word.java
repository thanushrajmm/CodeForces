problem link -> [ https://codeforces.com/contest/59/problem/A ] 
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int n = s.length();
		int lowercase = 0;
		int uppercase = 0;
		for(int i = 0; i<n; i++){
			if(Character.isLowerCase(s.charAt(i))){
				lowercase++;
			}
			else{
				uppercase++;
			}
		}
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<n; i++){
		if(lowercase>=uppercase){
			result.append(Character.toLowerCase(s.charAt(i)));
		}
		else{
			result.append(Character.toUpperCase(s.charAt(i)));
		}
		}
		System.out.println(result.toString());
	}
}
