import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int number,number2;
        Scanner in=new Scanner(System.in);
        System.out.println("Input number:");
        number=in.nextInt();
        System.out.println("binary:");
        if (number!=0){
            while (number!=0){
                number2=number%2;
                number=number/2;
                System.out.println(number2);
            }}
        else {

            System.out.println("0");
        }
    }
}
