import java.util.Scanner;

class Main{
    public static boolean[] primeList = new boolean[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        isprime();

        int T = sc.nextInt();
       
        while(T-->0){
            int N = sc.nextInt();
            int p = N/2;
            int q = N/2;

            while(true){
                if(!primeList[p] && !primeList[q]){
                    System.out.println(p+" "+q);
                    break;
                }

                p--;
                q++;
            }
        }
    }
    public static void isprime(){
        primeList[0] = primeList[1] = true; //소수 X

        for(int i=2; i<=Math.sqrt(primeList.length); i++){
            if(primeList[i]) continue;

            for(int j=i*i; j<primeList.length; j+=i){
                primeList[j] = true;
            }
        }
    }
}