package EQ1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame11B extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Village  Application  ");
	private JLabel l1 = new JLabel("Name ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l11 = new JLabel("County ");
	private JTextField t11=new JTextField(" ",8);
	private JLabel l2 = new JLabel("Population ");
	private JTextField t2=new JTextField("0",8);
	private JButton b1=new JButton("ChangePop");private JTextField t3=new JTextField("0",8);
	private String[] list1={"10","20","50","100"};
	//private JComboBox t3=new JComboBox(list1);
	
	
	private JButton b2=new JButton("changeCounty");private JTextField t4=new JTextField("Westmeath",8);
	//private JComboBox t4=new JComboBox(list1);
	private JLabel l3 = new JLabel("Message ");
	private JTextField t5=new JTextField("",8);
	private JPanel p1=new JPanel();
	
	private Village v=new Village("Doon","Offaly",30);
	
	public MyFrame11B(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(6,2));
		l0.setFont(f);  
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l11); p1.add(t11);
		p1.add(l2); p1.add(t2);
		p1.add(b1); p1.add(t3);
		p1.add(b2); p1.add(t4);
		p1.add(l3); p1.add(t5);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
 
		t1.setText("Doon");
		t11.setText(""+v.readCounty());t2.setText(""+ v.readPopulation());
		setSize(250,250);    setVisible(true);}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	t5.setText("");
	 	if (target==b1){
	          		int newPop=Integer.parseInt((String)t3.getText());
	          		boolean res=v.resetPopulation(newPop);
	             	t2.setText(""+v.readPopulation());
	             	if (res==false)t5.setText("Pop Negative");
	             	else           t5.setText("");
	             }
	 	if (target==b2){
      		v.changeCounty(t4.getText());
      		t11.setText(""+v.readCounty());
         }
	 	
	 }

}