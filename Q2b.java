import java.util.Scanner;

public class Q2b {
    public static void main(String[] args) {
        int sum=0,num1,num2;
        Scanner in=new Scanner(System.in);
        System.out.println("Input number 1:");
        num1=in.nextInt();
        System.out.println("Input number 2:");
        num2=in.nextInt();
        for (int n=num1+1;n<num2;n++){
            if (n%2!=0){
                sum=sum+n;
            }
        }
        System.out.println("the sum of all numbers between "+num1+" and "+num2+" :"+sum);
    }
}
