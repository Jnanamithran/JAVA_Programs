import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame implements ActionListener
{
  private JTextField textField;
  private JButton[] numberButtons;
  private JButton[] functionButtons;
  private JButton addButton,subButton,mulButton,divButton,eqButton,clrButton,dotButton,delButton;
  private double num1,num2,result;
  private char operator;
  
  public CalculatorApp()
  {
    setTitle("calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,400);
    setLayout(new BorderLayout());
    
    //text
   textField=new JTextField();
   textField.setFont(new Font("Arial",Font.PLAIN,20));
   textField.setHorizontalAlignment(JTextField.RIGHT);
   textField.setEditable(false);
   add(textField,BorderLayout.NORTH);
   
   
   //buttons
  numberButtons=new JButton[10];
  for(int i=0;i<10;i++)
  {
      numberButtons[i]=new JButton(String.valueOf(i));
      numberButtons[i].setFont(new Font("Arial",Font.PLAIN,20));
      numberButtons[i].addActionListener(this);
  }
     addButton =new JButton("+");
     subButton =new JButton("-");
     mulButton =new JButton("*");
     divButton =new JButton("/");
     eqButton =new JButton("=");
     clrButton =new JButton("C");
     dotButton =new JButton(".");
     delButton =new JButton("del");
     
     
     functionButtons=new JButton[]{addButton,subButton,mulButton,divButton,eqButton,clrButton,dotButton,delButton};
     for(JButton button:functionButtons)
     {
     	button.setFont(new Font("Arial",Font.PLAIN,20));
     	button.addActionListener(this);
     }
     
     //pamnel for buttons
     JPanel buttonPanel=new JPanel();
     buttonPanel.setLayout(new GridLayout(4,4,10,10));
     
     //adding butttons to panel
     
     buttonPanel.add(numberButtons[1]);
     buttonPanel.add(numberButtons[2]);
     buttonPanel.add(numberButtons[3]);
     buttonPanel.add(addButton);
     buttonPanel.add(numberButtons[4]);
     buttonPanel.add(numberButtons[5]);
     buttonPanel.add(numberButtons[6]);
     buttonPanel.add(subButton);
     buttonPanel.add(numberButtons[7]);
     buttonPanel.add(numberButtons[8]);
     buttonPanel.add(numberButtons[9]);
     buttonPanel.add(mulButton);
     buttonPanel.add(dotButton);
     buttonPanel.add(numberButtons[0]);
     buttonPanel.add(eqButton);
     buttonPanel.add(divButton);
     
     //adding buttons panel to frame
     add(buttonPanel,BorderLayout.CENTER);
     
     //additional settings
     clrButton.setForeground(Color.RED);
     delButton.setForeground(Color.BLUE);
     clrButton.addActionListener(this);     
     delButton.addActionListener(this); 
     
     //make frame visible
     setVisible(true);
  }
  public static void main(String args[]) 
  {
  new CalculatorApp();
  }
 public void actionPerformed(ActionEvent e)
 {
 for(int i=0;i<10;i++)
 {
 if(e.getSource()==numberButtons[i])
 {
  textField.setText(textField.getText()+i);
 } 
}
 if(e.getSource()==dotButton)
 {
  if(!textField.getText().contains("."))
  {
   textField.setText(textField.getText()+".");
  }
 } 
 
 if(e.getSource()==addButton)
 {
  num1=Double.parseDouble(textField.getText());
  operator='+';
  textField.setText("");
 }
 
 if(e.getSource()==subButton)
 {
 num1=Double.parseDouble(textField.getText());
 operator='-';
 textField.setText("");
 }
 
 if(e.getSource()==mulButton)
 {
  num1=Double.parseDouble(textField.getText());
  operator='*';
  textField.setText("");
 }
 
 if(e.getSource()==divButton)
 {
  num1=Double.parseDouble(textField.getText());
  operator='/';
  textField.setText("");
 }
  
  if(e.getSource()==eqButton)
  {
  num2=Double.parseDouble(textField.getText());
   
   switch(operator)
   {
    case'+':
    	 result=num1+num2;
             break;    
             	    
    case'-': result=num1-num2;
             break;    
             
   
    case'*': result=num1*num2;
             break;  
             
    case'/': if(num2!=0)
    	      {
    	       result=num1/num2;
    	      }         
    	      else
    	      {
    	       textField.setText("Error");
    	       return;
    	      }
    	      break;
    }
    
    textField.setText(String.valueOf(result));
    num1=result;
   }
   
   if(e.getSource()==clrButton)
   {
    textField.setText("");
   }
   
   if(e.getSource()==delButton)
   {
   String currentText=textField.getText();
   if(!currentText.isEmpty())
     {
   	textField.setText(currentText.substring(0,currentText.length()-1));  
     }
   
   }
   
  
  
  }
 
 
 } 
  



