import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class calci extends Applet
{
TextField a,b,ans;
Button b1, b2, b3, b4, b5, b6, b7;

public void init()
{
 a = new TextField(20);
 b = new TextField(20);
 ans = new TextField(20);
 b1 = new Button("Add");
 b2 = new Button("Subtract");
 b3 = new Button("Multiply");
 b4 = new Button("Divide");
 b5 = new Button("Remainder");
 b6 = new Button("Power");
 b7 = new Button("Log");
 Label aa = new Label("a: ");
 Label bb = new Label("b: ");
 Label answ = new Label("Ans: ");
 add(aa);
 add(a);
 add(bb);
 add(b);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(answ);
add(ans);

 
 b1.addActionListener( new java.awt.event.ActionListener()
{
 public void actionPerformed(java.awt.event.ActionEvent evt)
{
 b1ActionPerformed(evt);
}
});
 b2.addActionListener( new java.awt.event.ActionListener()
{
 public void actionPerformed(java.awt.event.ActionEvent evt)
{
 b2ActionPerformed(evt);
}
});
 b3.addActionListener( new java.awt.event.ActionListener()
{
 public void actionPerformed(java.awt.event.ActionEvent evt)
{
 b3ActionPerformed(evt);
}
});
b4.addActionListener( new java.awt.event.ActionListener()
{
 public void actionPerformed(java.awt.event.ActionEvent evt)
{
 b4ActionPerformed(evt);
}
});
b5.addActionListener( new java.awt.event.ActionListener()
{
 public void actionPerformed(java.awt.event.ActionEvent evt)
{
 b5ActionPerformed(evt);
}
});
b6.addActionListener( new java.awt.event.ActionListener()
{
 public void actionPerformed(java.awt.event.ActionEvent evt)
{
 b6ActionPerformed(evt);
}
});
 b7.addActionListener( new java.awt.event.ActionListener()
{
 public void actionPerformed(java.awt.event.ActionEvent evt)
{
 b7ActionPerformed(evt);
}
});
}
void b1ActionPerformed( java.awt.event.ActionEvent evt)
{
double d = Double.parseDouble(a.getText());
int ai = (int)d;
d = Double.parseDouble(b.getText());
int bi = (int)d;
ans.setText(""+(ai+bi));
}
void b2ActionPerformed( java.awt.event.ActionEvent evt)
{
double d = Double.parseDouble(a.getText());
int ai = (int)d;
d = Double.parseDouble(b.getText());
int bi = (int)d;
ans.setText(""+(ai-bi));
}
void b3ActionPerformed( java.awt.event.ActionEvent evt)
{
double d = Double.parseDouble(a.getText());
int ai = (int)d;
d = Double.parseDouble(b.getText());
int bi = (int)d;
ans.setText(""+(ai*bi));
}
void b4ActionPerformed( java.awt.event.ActionEvent evt)
{
double d = Double.parseDouble(a.getText());
int ai = (int)d;
d = Double.parseDouble(b.getText());
int bi = (int)d;
if(bi == 0)
ans.setText("Cannot Divide by 0");
else
ans.setText(""+(ai/bi));
}
void b5ActionPerformed( java.awt.event.ActionEvent evt)
{
double d = Double.parseDouble(a.getText());
int ai = (int)d;
d = Double.parseDouble(b.getText());
int bi = (int)d;
if(bi == 0)
ans.setText("Cannot Divide by 0");
else
ans.setText(""+(ai%bi));
}
void b6ActionPerformed( java.awt.event.ActionEvent evt)
{
double d = Double.parseDouble(a.getText());
int ai = (int)d;
d = Double.parseDouble(b.getText());
int bi = (int)d;
long p =1;
for(int i = 0; i<=bi;i++)
p*=ai;
ans.setText(""+p);
}

void b7ActionPerformed( java.awt.event.ActionEvent evt)
{
double d = Double.parseDouble(a.getText());
int ai = (int)d;

if(ai == 1)
ans.setText("Log(1) is not defined");
else
ans.setText(""+(Math.log(ai)));
}
public void paint(Graphics g)
{
 repaint();
}
}

 
 