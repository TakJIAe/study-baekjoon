import java.util.Scanner;

class Main{

    public static boolean []primenum = new boolean[246912];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();

            isprime();

            if(N==0) break;

            int cnt=0;

            for(int i=N+1; i<=2*N; i++){
                if(!primenum[i]) cnt++;
            }
            System.out.println(cnt);
        }
    }

    public static void isprime(){

        primenum[0] = primenum[1] = true; //소수 X
        
        for(int i=2; i<=Math.sqrt(primenum.length); i++){
            if(primenum[i]) continue;

            for(int j=i*i; j<primenum.length; j+=i){
                primenum[j] = true;
            }
        }
    }
}