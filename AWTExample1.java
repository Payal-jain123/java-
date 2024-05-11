import java.awt.*;
public class AWTExample1 extends Frame{
AWTExample1()
{
Button b= new Button("click");//create a button
b.setBounds(30,100,80,30);//set button position
setTitle("AWTExample1");
add(b);//adding button into frame
setSize(3000,2000);//set the size of frame
setVisible(true);
setLayout(null);
}
public static void main(String[] args)
{
AWTExample1 f=new AWTExample1();
}
}


