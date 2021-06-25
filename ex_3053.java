import java.util.Scanner;

class Main{
        public static final double PI = 3.14159265358979323846;
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double R = sc.nextDouble();

        System.out.println(R*R*Math.PI);
        System.out.println(2*R*R);

    }
}