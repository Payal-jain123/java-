import java.awt.*;
class AWTExample3 extends Frame 
{
public static void main(String[] args) 
{
AWTExample3 t=new AWTExample3();
t.setVisible(true);
t.setSize(500,500);
t.setTitle("myframe");
t.setBackground(Color.red);
}
public void paint(Graphics g)
{
Font f=new Font("arial",Font.ITALIC,25);
g.setFont(f);
g.drawString("hi ratan how r u",100,100);
}
}