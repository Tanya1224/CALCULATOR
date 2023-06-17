import java.awt.*;
import java.awt.event.*;
class calculator2 implements ActionListener{
Frame f;
Font ff,ff1;
Panel p1,p2;
Label l1;
String op="";
double x=0,y=0;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
GridLayout g;
calculator2(){
f=new Frame();
f.setTitle("CALCULATOR");
ff=new Font("Times new Roman",Font.BOLD,40);
ff1=new Font("Times new Roman",Font.BOLD,25);
f.setLayout(null);
p1=new Panel();
p1.setBounds(10,50,600,100);
l1=new Label("");
f.add(l1);
l1.setFont(ff);

l1.setBounds(10,10,600,150);
l1.setBackground(Color.gray);
f.add(p1);


p2=new Panel();
p2.setBounds(10,150,600,450);

f.add(p2);
g=new GridLayout(4,4);
p2.setLayout(g);


b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("BACK");
b5=new Button("4");
b6=new Button("5");
b7=new Button("6");
b8=new Button("*");
b9=new Button("7");
b10=new Button("8");
b11=new Button("9");
b12=new Button("%");
b13=new Button("-");
b14=new Button("0");
b15=new Button("+");
b16=new Button("=");

p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b4); p2.add(b5); p2.add(b6); p2.add(b7); p2.add(b8); p2.add(b9); p2.add(b10); p2.add(b11);p2.add(b12); p2.add(b13); p2.add(b14); p2.add(b15); p2.add(b16);
b1.setFont(ff1);
b2.setFont(ff1);
b3.setFont(ff1);
b4.setFont(ff1);
b5.setFont(ff1);
b6.setFont(ff1);
b7.setFont(ff1);
b8.setFont(ff1);
b9.setFont(ff1);
b10.setFont(ff1);
b11.setFont(ff1);
b12.setFont(ff1);
b13.setFont(ff1);
b14.setFont(ff1);
b15.setFont(ff1);
b16.setFont(ff1);



b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b15.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b16.addActionListener(this);
b8.addActionListener(this);
b4.addActionListener(this);
b12.addActionListener(this);


f.setSize(600,600);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e){
String s1="";
String s2="";


if(e.getSource()==b1){
s2=l1.getText();
s1=s2+"1";
l1.setText(s1);
}
if(e.getSource()==b15)
{
x=Double.parseDouble(l1.getText());
l1.setText("");
op="add";
}
if(e.getSource()==b13)
{
x=Double.parseDouble(l1.getText());
l1.setText("");
op="sub";
}

if(e.getSource()==b12)
{
x=Double.parseDouble(l1.getText());
l1.setText("");
op="div";
}

if(e.getSource()==b8)
{
x=Double.parseDouble(l1.getText());
l1.setText("");
op="mul";
}

	

if(e.getSource()==b16)
{

	y=Double.parseDouble(l1.getText());
	if(op.equals("add"))
	{
	
		double z=x+y;
		l1.setText(String.valueOf(z));
	}

	if(op.equals("sub"))
	{
	
		double z=x-y;
		l1.setText(String.valueOf(z));
	}
	
	if(op.equals("div"))
	{
	
		double z=x/y;
		l1.setText(String.valueOf(z));
	}

	if(op.equals("mul"))
	{
	
		double z=x*y;
		l1.setText(String.valueOf(z));
	}
}

if(e.getSource()==b4){
	String xx=l1.getText();
	int ll=xx.length()-1;
	l1.setText(xx.substring(0,ll));
	}
if(e.getSource()==b2){
s2=l1.getText();
s1=s2+"2";
l1.setText(s1);
}
if(e.getSource()==b3){
l1.setText(l1.getText()+"3");
}
if(e.getSource()==b5){
s2=l1.getText();
s1=s2+"4";
l1.setText(s1);
}
if(e.getSource()==b6){
s2=l1.getText();
s1=s2+"5";
l1.setText(s1);
}
if(e.getSource()==b7){
s2=l1.getText();
s1=s2+"6";
l1.setText(s1);
}
if(e.getSource()==b9){
s2=l1.getText();
s1=s2+"7";
l1.setText(s1);
}
if(e.getSource()==b10){
s2=l1.getText();
s1=s2+"8";
l1.setText(s1);
}
if(e.getSource()==b11){
s2=l1.getText();
s1=s2+"9";
l1.setText(s1);
}
if(e.getSource()==b14){
s2=l1.getText();
s1=s2+"0";
l1.setText(s1);
}
}
public static void main(String[] args){
calculator2 obj=new calculator2();
}
}