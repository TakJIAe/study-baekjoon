import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        int [] location_1 = {sc.nextInt(), sc.nextInt() };
        int [] location_2 = {sc.nextInt(), sc.nextInt() };
        int [] location_3 = {sc.nextInt(), sc.nextInt() };

        if(location_1[0] == location_2[0]){
            x = location_3[0];
        }
        else if(location_2[0] == location_3[0]){
            x = location_1[0];
        }
        else{
            x = location_2[0];
        }


        if(location_1[1] == location_2[1]){
            y = location_3[1];
        }
        else if(location_2[1] == location_3[1]){
            y = location_1[1];
        }
        else{
            y = location_2[1];
        }

        System.out.println(x+" "+y);
    }   
}