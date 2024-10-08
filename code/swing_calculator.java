import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorAppextends JFrame implements ActionListener
{
	//componenets
	private JTextField textField;
	private JButton[] numberButtons;
	private JButton[] functionButtons;
	private JButton addButton,subButton,mulButton,divButton,eqButton,clrButton,dotButton,delButton;
	private double num1,num2,result;
	private char operator;
	
	public 
