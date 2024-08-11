problem link -> [ https://codeforces.com/problemset/problem/71/A ] 
import java.util.Scanner;
 
public class WordAbb {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
		int n = scanner.nextInt(); 
        scanner.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine(); 
            
            if (word.length() > 10) {
                String abb = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abb);
            } else {
                System.out.println(word); 
            }
        }
        scanner.close();
    }
}
