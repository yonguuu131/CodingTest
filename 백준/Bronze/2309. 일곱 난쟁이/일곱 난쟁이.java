
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum_arr = 0;
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum_arr +=arr[i];
        }
        for(int i=0; i<8; i++){
            for(int j =i+1; j<9; j++){
                if(sum_arr - arr[i] - arr[j] == 100){
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for(int k=2; k<9; k++){
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}
