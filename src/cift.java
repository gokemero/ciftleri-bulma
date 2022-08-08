import java.util.Scanner;
public class cift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int x = input.nextInt();
        for(int i=0;i<=x;i++){

            if(i%2 == 0){
                System.out.println(i);
            }


        }
    }
}
