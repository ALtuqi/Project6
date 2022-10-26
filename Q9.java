import javax.swing.*;
import java.awt.*;

public class Q9 extends JFrame {
    @Override
    public void paint(Graphics g) {
        int row,col,x,y;
        for (row=0; row<9;row++)
        {for (col=0;col<8;col++) {
            x = col * 22;
            y = row * 22;
            if ((row % 2) == (col % 2))
                g.setColor(Color.white);
            else
                g.setColor(Color.black);
            g.fillRect(x, y, 22, 22);
        }}
    }

    public static void main(String[] args) {
        Q9 check=new Q9();
        check.setTitle("CheckBoard");
        check.setSize(160,190);
        check.setDefaultCloseOperation(EXIT_ON_CLOSE);
        check.setVisible(true);
    }
}
