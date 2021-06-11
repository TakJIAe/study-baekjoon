import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0; //소수의 개수
        int sosucnt = 0;

        for(int i =1; i<=N; i++)
        {
            int num = sc.nextInt();     
            sosucnt = 0;
            
            for(int j=1; j<=num; j++){
                if(num%j==0) sosucnt++;
            }
            if(sosucnt == 2) cnt++;
        }
        System.out.println(cnt);
    }
}