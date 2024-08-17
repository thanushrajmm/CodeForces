problem link -> [ https://codeforces.com/problemset/problem/158/A ]
import java.util.Scanner;
public class fc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a = new int [n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int j=0; j<n; j++){
            if((a[j]>=a[k-1])&&a[j]>0){
              sum = sum +1;  
            }
        }
        System.out.println(sum);
    }
}
