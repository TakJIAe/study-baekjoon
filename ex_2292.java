import java.util.Scanner;

class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int room = 1; //방의 개수
        int cnt = 1; //벌집
        int sum = 6; //등차수열

        int N = sc.nextInt(); //N의 개수

        while(true){
            if(N <= cnt){
                break;
            }

            cnt += sum;
            sum += 6;
            room ++;

        }

        System.out.println(room);
    }
}
