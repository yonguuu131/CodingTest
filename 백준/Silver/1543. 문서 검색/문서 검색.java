import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String pattern = br.readLine();
        int res = 0;
        line = line.replaceAll(pattern, "1");
        for(int i=0; i<line.length(); i++){
            if(line.charAt(i) == '1') res+=1;
        }
        System.out.println(res);
    }
}