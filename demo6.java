import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RegistrationFrame extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7;
JTextField tf;
JPasswordField pf;
JCheckBox cb1,cb2,cb3;
JRadioButton rb1,rb2;
JList l;
JComboBox cb;
JTextArea ta;
JButton b;
String uname="",upwd="",uqual="",ugen="",utech="",uprof="",uaddr="";
RegistrationFrame()
{
setVisible(true);
setSize(500,600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBackground(Color.cyan);
setLayout(null);
l1=new JLabel("User Name");
l1.setBounds(50,100,100,10);
l2=new JLabel("Password");
l2.setBounds(50,150,100,10);
l3=new JLabel("Qualification");
l3.setBounds(50,200,100,10);
l4=new JLabel("Gender");
l4.setBounds(50,250,100,10);
l5=new JLabel("Technologies");
l5.setBounds(50,300,100,10);
l6=new JLabel("Proffession");
l6.setBounds(50,350,100,10);
l7=new JLabel("Address");
l7.setBounds(50,400,100,10);
tf=new JTextField(20);
tf.setBounds(150,90,100,30);
tf.setToolTipText("This Is Text Field");
pf=new JPasswordField(20);
pf.setBounds(150,140,100,30);
pf.setToolTipText("This Is Password Field");
cb1=new JCheckBox("BSC");
cb1.setBounds(150,190,60,30);
cb2=new JCheckBox("MCA");
cb2.setBounds(220,190,60,30);
cb3=new JCheckBox("PHD");
cb3.setBounds(290,190,60,30);
rb1=new JRadioButton("Male");
rb1.setBounds(150,240,80,30);
rb2=new JRadioButton("Female");
rb2.setBounds(250,240,80,30);
ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
String[] techs={"C","C++","JAVA"};
l=new JList(techs);
l.setBounds(150,280,60,60);
String[] prof={"Student","Business","Teacher"};
cb=new JComboBox(prof);
cb.setBounds(150,340,80,30);
ta=new JTextArea(5,25);
ta.setBounds(150,380,100,40);
b=new JButton("Registration");
b.setBounds(50,450,110,40);
b.addActionListener(this);
add(l1);
add(tf);
add(l2);
add(pf);
add(l3);
add(cb1);
add(cb2);
add(cb3);
add(l4);
add(rb1);
add(rb2);
add(l5);
add(l);
add(l6);
add(cb);
add(l7);
add(ta);
add(b);
}
public void actionPerformed(ActionEvent ae)
{
uname=tf.getText();
upwd=pf.getText();
if(cb1.isSelected()==true)
{
uqual=uqual+cb1.getLabel()+" ";
}
if(cb2.isSelected()==true)
{
uqual=uqual+cb2.getLabel()+" ";
}
if(cb3.isSelected()==true)
{
uqual=uqual+cb3.getLabel()+" ";
}
if(rb1.isSelected()==true)
{
ugen=rb1.getLabel();
}
if(rb2.isSelected()==true)
{
ugen=rb2.getLabel();
}
Object[] techs=l.getSelectedValues();
for(int i=0;i<techs.length;i++)
{
utech=utech+techs[i]+" ";
}
uprof=(String)cb.getSelectedItem();
uaddr=ta.getText();
class DisplayFrame extends JFrame
{
DisplayFrame()
{
this.setVisible(true);
this.setSize(500,500);
this.setBackground(Color.pink);
}
public void paint(Graphics g)
{
Font f=new Font("arial",Font.BOLD,25);
g.setFont(f);
g.drawString("User Name :"+uname,50,100);
g.drawString("Password :"+upwd,50,150);
g.drawString("Qualification :"+uqual,50,200);
g.drawString("User Gender :"+ugen,50,250);
g.drawString("Technologies :"+utech,50,300);
g.drawString("Proffession :"+uprof,50,350);
g.drawString("Address :"+uaddr,50,400);
}
}
DisplayFrame df=new DisplayFrame();
}
}
class demo6
{
public static void main(String[] args)
{
RegistrationFrame rf=new RegistrationFrame();
}
}
