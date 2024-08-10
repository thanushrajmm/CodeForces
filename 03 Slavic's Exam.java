problem link -> [ https://codeforces.com/contest/1999/problem/D ]
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        while (T != 0) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            int n = s.length();
            int m = t.length();
            int i = 0;
            int j = 0;
            char[] sArray = s.toCharArray();

            while (i < n && j < m) {
                if (sArray[i] == '?') {
                    sArray[i] = t.charAt(j);
                    i++;
                    j++;
                } else {
                    if (sArray[i] == t.charAt(j)) {
                        i++;
                        j++;
                    } else {
                        i++;
                    }
                }
            }

            T--;
            if (j == m) {
                System.out.println("YES");
                for (i = 0; i < n; i++) {
                    if (sArray[i] != '?') {
                        System.out.print(sArray[i]);
                    } else {
                        System.out.print('a');
                    }
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
    }
}
