import java.util.Scanner;

class ex_2581 {

    public static boolean prime[];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        prime = new boolean[N+1];
        prime(M,N);
        
        int sum = 0;
        int Min = Integer.MAX_VALUE;

        for(int i=M; i<=N; i++){
            if(prime[i] == false) {
                sum+=i;
                
                if(Min == Integer.MAX_VALUE) Min=i;
            }
        }

        if(sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(Min);
        }
    }

    public static void prime(int M , int N){
        prime[0] = prime[1] = true; //소수 X

        for(int i=2; i<=N; i++){
            if(prime[i]==true) continue;

            for(int j=2*i; j<=N; j=j+i){
                prime[j]=true;
            }
        }

    }
}
