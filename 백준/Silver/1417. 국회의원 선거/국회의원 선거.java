import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine())-1;
        int d = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<N;i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        int count = 0;
        while (!pq.isEmpty() && pq.peek() >= d ){
            ++d;
            pq.add(pq.poll() -1);
            ++count;
        }
        System.out.println(count);
    }
}
