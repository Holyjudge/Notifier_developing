package not_trial;
import javax.swing.JOptionPane;


import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;
import javax.sound.sampled.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
			
		



  

public class Main {

	
	public static void pM()
	{
		Scanner scanner = new Scanner(System.in);
		InputStream music;
		try {
			File file = new File("Buzzer-Wrong-Answer-Gaming-Sound-Effect-_HD_.wav");
			AudioInputStream audios = AudioSystem.getAudioInputStream(file);
			Clip clip=AudioSystem.getClip();
			clip.open(audios);
			clip.start();
			String response = scanner.next();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error");
			
		}
	}
	
	public static void checkAlarm(final int a, final int b, String[] task)
	{ 
		Thread t = new Thread() {
			public void run()
			{
				int w1 = 0;
				while(w1==0)
					
				{ 
				
					
					Calendar c = new GregorianCalendar();
					int hours = c.get(Calendar.HOUR_OF_DAY);
					int mins = c.get(Calendar.MINUTE);
					if(a == hours && b == mins)
					{
						
						JOptionPane.showMessageDialog(null, "Reminder ! ");
						
						break;
					}

				}
			}};
			t.setPriority(Thread.MIN_PRIORITY);
			t.start();
		};
		
		public static void checkAlarm2(final int a, final int b, String[] task)
		{ 
			Thread t2 = new Thread() {
				public void run()
				{
					int w1 = 0;
					while(w1==0)
					{
						Calendar c = new GregorianCalendar();
						int hours = c.get(Calendar.HOUR_OF_DAY);
						int mins = c.get(Calendar.MINUTE);
						if(a == hours && b == mins)
						{
							
							pM();						
							break;
						}

					}
				}
			};
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		
	}
	

	 static class Example extends JFrame implements ActionListener{		  
		  
		  
			
			
			JButton submit;
			JButton reset;
			JLabel name, time;
			JTextField namef;
			private JComboBox hour;
			private JComboBox min;
			private JTextArea tout;
			private JTextArea tadd;
			private JLabel res;
			private JTextArea resadd;
			private Container c;
			private JLabel title;
			private JCheckBox term;
			private JButton sub;
			private JRadioButton music;
			private JRadioButton not;		

				
		  	    
		  	   
			
			
			
		 	
		    public void  example( int in){
		    	Scanner scanner = new Scanner(System.in);
			   
			   
			    String hourss[]
						= { "00", "01", "02", "03", "04","05", "06", "07", "08", "09",
							"10","11", "12", "13", "14", "15","16", "17", "18", "19",
							"20","21", "22", "23"};
			   
			    String minss[]
						= { "00", "01", "02", "03", "04","05", "06", "07", "08", "09",
							"10","11", "12", "13", "14", "15", "16", "17", "18", "19",
							"20","21", "22", "23", "24", "25", "26", "27", "28", "29",
							"30","31", "32", "33", "34", "35", "36", "37", "38", "39",
							"40","41", "42", "43", "44", "45", "46", "47", "48", "49",
							"50","51", "52", "53", "54", "55", "56", "57", "58", "59",};
			    
			      
		    	  String[] task = new String[in];
		    	  
		    	  
			    c = getContentPane();
				c.setLayout(null);
			   
			   setLayout(null);
			   name = new JLabel("Task:");
			   name.setFont(new Font("Arial", Font.PLAIN, 20));
			   name.setSize(100, 20);
			   name.setLocation(100, 100);
			   c.add(name);
			   
			   namef = new JTextField();
			   namef.setFont(new Font("Arial", Font.PLAIN, 15));
			   namef.setSize(190, 20);
			   namef.setLocation(200, 100);
			   c.add(namef);
			   
			   time = new JLabel("Time:");
			   time.setFont(new Font("Arial", Font.PLAIN, 20));
			   time.setSize(100, 20);
			   time.setLocation(100, 200);
			  c.add(time);
			   
			   hour = new JComboBox(hourss);
			   hour.setFont(new Font("Arial", Font.PLAIN, 15));
			   hour.setSize(50, 20);
			   hour.setLocation(200, 200);
			  c.add(hour);

				min = new JComboBox(minss);
				min.setFont(new Font("Arial", Font.PLAIN, 15));
				min.setSize(60, 20);
				min.setLocation(260, 200);
				c.add(min);
				music = new JRadioButton("Notify");
				music.setFont(new Font("Arial", Font.PLAIN, 15));
				music.setSelected(true);
				music.setSize(75, 20);
				music.setLocation(200, 300);
				c.add(music);

				not = new JRadioButton("Buzzer");
				not.setFont(new Font("Arial", Font.PLAIN, 15));
				not.setSelected(false);
				not.setSize(80, 20);
				not.setLocation(275, 300);
				c.add(not);
				
				tout = new JTextArea();
				tout.setFont(new Font("Arial", Font.PLAIN, 15));
				tout.setSize(300, 400);
				tout.setLocation(500, 100);
				tout.setLineWrap(true);
				tout.setEditable(false);
				c.add(tout);

				res = new JLabel("");
				res.setFont(new Font("Arial", Font.PLAIN, 20));
				res.setSize(500, 25);
				res.setLocation(100, 500);
				c.add(res);

				resadd = new JTextArea();
				resadd.setFont(new Font("Arial", Font.PLAIN, 15));
				resadd.setSize(200, 75);
				resadd.setLocation(580, 175);
				resadd.setLineWrap(true);
				c.add(resadd);	
			

				


				sub = new JButton("Set");
				sub.setFont(new Font("Arial", Font.PLAIN, 15));
				sub.setSize(100, 20);
				sub.setLocation(150, 450);
				sub.addActionListener(this);
				c.add(sub);

				reset = new JButton("Reset");
				reset.setFont(new Font("Arial", Font.PLAIN, 15));
				reset.setSize(100, 20);
				reset.setLocation(270, 450);
				reset.addActionListener(this);
				c.add(reset);

				tout = new JTextArea();
				tout.setFont(new Font("Arial", Font.PLAIN, 15));
				tout.setSize(300, 400);
				tout.setLocation(500, 100);
				tout.setLineWrap(true);
				tout.setEditable(false);
				c.add(tout);

				res = new JLabel("");
				res.setFont(new Font("Arial", Font.PLAIN, 20));
				res.setSize(500, 25);
				res.setLocation(100, 500);
				c.add(res);
				
				

				resadd = new JTextArea();
				resadd.setFont(new Font("Arial", Font.PLAIN, 15));
				resadd.setSize(200, 75);
				resadd.setLocation(580, 175);
				resadd.setLineWrap(true);
				c.add(resadd);

				setVisible(true);
			   
			   setTitle("Task ");
			   
			   setLocationRelativeTo(null);
			   setDefaultCloseOperation(EXIT_ON_CLOSE);
			   
			   this.pack();
		   
		    }
			
		   public void actionPerformed(ActionEvent e)
			{
				if (e.getSource() == sub) {
					
						
						String data = namef.getText()+" is  set";
						tout.setText(data);
						tout.setEditable(false);
						res.setText("Set Successfully..");
					
				}

				else if (e.getSource() == reset) {
					String def = "";					
					namef.setText(def);					
					hour.setSelectedIndex(0);
					min.setSelectedIndex(0);
				}
				int i=1;
		    	  String[] task = new String[10];
			
		   task[i]=name.getText();
	    	  String hours = hour.getSelectedItem().toString();
	    	  String mins = min.getSelectedItem().toString();
	    	  int a = Integer.parseInt(hours);
	    	  int b = Integer.parseInt(mins);
	    	  if (music.isSelected())
	    	   checkAlarm(a, b, task);
	    	  
	    	  
				
				
	    	   if(not.isSelected())
	    		  checkAlarm2(a, b, task);
	    	  
	    	  
		    }
	  
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
System.out.println("Enter your schedule:\t\t");
	  System.out.printf("\n\t\t how many intervals?\t\t\n");
	  int in = scanner.nextInt();
	  
	  
	  for(int i=1; i<=in; i++)  
    	  
	  {  	  
	  
				  System.out.println("Enter task ");
				   scanner.next();
	
		  Example ex = new Example();
		  ex.example(in);
		 
		  

		
		  
		   		  
		  
  	
  	  
  	  
	  }
	  }   
}}

    	  
    	  
    	  
    	 
      
      

