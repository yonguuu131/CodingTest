import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N= in.nextInt();

        /**
         * 2 * N -1 의 공간이필요
         * 다만 index는 1부터 시작하므로 2*N 공간으로 생성
         */

        int[] q = new int[2 * N];
        for(int i=1; i<=N; i++){
            q[i] = i;
        }
        int prev_index = 1;
        int last_index = N;
        while(N-- >1){
            prev_index++;
            q[last_index + 1] = q[prev_index];
            last_index++;
            prev_index++;
        }

        System.out.println(q[prev_index]);
    }
}