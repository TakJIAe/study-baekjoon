package 정렬;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] num = new int[N];

        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(num[i]>num[j]){
                    int tmp = num[j];
                    num[j] = num[i];
                    num[i] = tmp;
                }
            }
        }

        for(int val:num){
            System.out.println(val);
        }
        
    }
}