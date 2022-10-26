import java.util.Scanner;

public class ClassQ8 {
    private int number;

    /***
     * default constructor.
     */

    /***
     * another constructor with initial balance
     * @param number the initial balance
     */
    public ClassQ8(int number) {

        this.number = number;
    }

    public ClassQ8() {
        this(0);
    }




    public void reads() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number:");
        number = in.nextInt();
    }

    public void PrintPrime() {
        System.out.println("number primes:");
        for (int n = 2; n <= number; n++) {
            int s = 0;
            for (int p = 1; p <=n; p++)
                if (n % p == 0)
                   s++;
                if (s == 2)
                    System.out.println(n);


          /* for( int x=2;x<=10000;x++)
            {int c=0;
                for(int z=1;z<=x;z++)
                    if(x%z==0)c++;
                if(c==2)
                    cout<<x<<endl;*/

            }

        }
    }
