import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
int  n=0;
        Scanner in =new Scanner(System.in);
        ClassQ1 b=new ClassQ1(1000,10);
        while ( b.getbalance()<1000000)
        {++n;
        b.addInsert();
        }
        System.out.println(b.getbalance()+"  years:"+n);
    }
}
