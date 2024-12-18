import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int res=0;
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int z=j+1; z<n; z++){
                    int k=arr[i]+arr[j]+arr[z];
                    if(k<=m){
                        if(k>res) res=k;
                    }
                }
            }
        }
        System.out.println(res);
    }
}