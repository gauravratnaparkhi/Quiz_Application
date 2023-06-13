package Quiz;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax .swing.*;
public class Rules extends JFrame implements ActionListener{
	    
       String name;
       JButton back,start;
	     Rules(String name){
	    	 this.name=name;
	    	 getContentPane().setBackground(Color.WHITE);
	    	 setLayout(null);
	    	 
	    	JLabel heading=new JLabel("Welcome "+name+ " to Quiz Master");
	 		heading.setBounds(180, 50, 700, 30);
	 		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
	 		heading.setForeground(new Color(30,144,254));
	 		add(heading);
	 		
	 		JLabel rules=new JLabel();
	 		rules.setBounds(20, 90, 700, 350);
	 		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
	 		rules.setText(
	 				"<html>"+
	 		"<br><br>"+
	 						"1. Time Limit: Set a specific time limit for each question. Once the time is up, automatically move to the next question. This adds a sense of urgency and keeps the game flowing." + "<br><br> "+

	 						"2. Answer Submission: Allow users to select their answer and submit it. Once submitted, lock the answer to prevent any changes or modifications." +"<br><br>" +

	 						"3. Scoring: Assign points for each correct answer. Keep track of the user's score throughout the quiz and display it at the end. scoring system like +10 for correct answers and 0 for incorrect answers."+ "<br><br>" +

	 						"4. Multiple Choice: Present questions in a multiple-choice format, providing users with a set of options to choose from. Display the options using radio buttons or checkboxes and ensure that only one option can be selected for single-choice questions."+ "<br><br>"+

	 						"5. Progress Tracking: Show the user's progress during the quiz by indicating the current question number and the total number of questions."+ "<br><br>"+
	 					"<html>"
	 				);
	 		add(rules);
	 		
	 		
	 		back=new JButton("Back");
			back.setBounds(250, 500, 100, 30);
			back.setBackground(new Color(30,144,254));
			back.setForeground(Color.white);
			back.addActionListener(this);
			add(back);
			
		    start=new JButton("Start");
			start.setBounds(400, 500, 100, 30);
			start.setBackground(new Color(30,144,254));
			start.setForeground(Color.white);
			start.addActionListener(this); 
			add(start);
	    	 
	    	 setSize(800,650);
	    	 setLocation(350,100);
	    	 setVisible(true);
	     }
	     
	     public void actionPerformed(ActionEvent ae) {
	    	 if(ae.getSource()==start) {
	    		 setVisible(false);
	    		 new Quiz(name);
	    	 }
	    	 else {
	    		 setVisible(false);
	    		 new Login();
	    	 }
	     }
	
	public static void main(String[]args) {
		new Rules("User");
	}
}
