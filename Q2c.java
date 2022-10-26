import java.util.Scanner;

public class Q2c {

    public static void main(String[] args) {
        int sum=0,num,n=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Input number:");
        num=in.nextInt();

     while (num%10!=0){
         n=num%10;
     num=num/10;
            if (n%2!=0){
                sum=sum+n;
            }
        }
        System.out.println("the sum of all odd digit :"+sum);
    }
}
