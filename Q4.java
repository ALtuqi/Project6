import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Input word:");
            String w;
            w=in.next();


            for (int n=w.length()-1;n>=0;n--)
            {
                System.out.print(w.charAt(n));
            }
        }
    }

