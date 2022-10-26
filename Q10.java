import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price, amount;
        System.out.print("Enter today's price in Yens for 1 $ :");
        price = in.nextDouble();


            System.out.print("Enter amount in dollars to convert: (0 to quit ) ");
            amount = in.nextDouble();

        while (amount != 0)
        {
            System.out.println(amount+" dollars ="+(amount*price)+" Yens ");
            System.out.print("Enter amount in dollars to convert: (0 to quit ) ");
            amount = in.nextDouble();
        }
    }
}