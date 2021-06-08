import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int A = Integer.parseInt(st.nextToken()); //낮에 올라가는
        int B = Integer.parseInt(st.nextToken()); //밤에 내려가는
        int V = Integer.parseInt(st.nextToken()); //막대길이

        int day = (V-B) / (A-B);

        if((V-B)%(A-B) != 0){
            day++;
        }

        System.out.println(day);
    }
}