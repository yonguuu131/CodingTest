import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int res=0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int i=0; i<n; i++){
            if(k-arr[i] >= 0){
                k-=arr[i];
                i-=1;
                res+=1;
            }
        }
        System.out.println(res);
    }
}