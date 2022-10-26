import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input word:");
        String w;
        char ch;
        w=in.next();
int vowels=0;

        for (int n=0;n<w.length();n++)
        {ch=w.charAt(n);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')
                ++vowels;
        }
        System.out.println("number vowels= "+vowels);
    }
}
