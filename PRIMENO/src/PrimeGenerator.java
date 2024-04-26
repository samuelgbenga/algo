import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the prime limit : ");

        int x = sc.nextInt();
        int i, flag = 1 ;
        for(i = 0; i <= x; i++){
            if(i == 0 || i ==1) continue;
            for(int j = 2; j <= i/2; ++j){
                if(i%j == 0){
                    flag = 0;
                    break;}
                flag = 1;
            }
            if (flag == 1){
                System.out.printf("%d,",i);
            }
        }
    }
}