import java.awt.*;
public class AWTExample2
{
AWTExample2()
{
Frame f = new Frame();
Button b= new Button("click");//create a button
b.setBounds(100,100,80,30);//set button position
f.setTitle("AWTExample2");
f.add(b);//adding button into frame
f.setSize(400,300);//set the size of frame
f.setVisible(true);
f.setLayout(null);
}
public static void main(String[] args)
{
AWTExample2 a = new AWTExample2();

}
}

