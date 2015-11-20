package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class login extends JFrame {
	
	private JButton loginButton;
	private JLabel usernameL, passwordL;
	public JTextField usernameTF,passwordTF;
	private JPanel loginPanel;
	
	login(){
		
		setupFrame();
		initialize();
		setupLayout();
		setVisible(true);
	}
	
	public void setupFrame(){
			
		setSize(200,400);
		setTitle("Login");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public void initialize(){
		
		loginPanel = new JPanel();
		loginPanel.setLayout(null);
		getContentPane().add(loginPanel);
		loginButton = new JButton("Login");
		usernameL = new JLabel("Username");
		passwordL = new JLabel("Password");
		usernameTF = new JTextField(20);
		passwordTF = new JTextField(20);
		
	}
	
	public void setupLayout(){
		
		loginPanel.add(loginButton);
		loginPanel.add(usernameL);
		loginPanel.add(passwordL);
		loginPanel.add(usernameTF);
		loginPanel.add(passwordTF);
		
		loginButton.setBounds(43,188,100,25);
		usernameL.setBounds(43,96,100,15);
		passwordL.setBounds(43,138,100,10);
		usernameTF.setBounds(43,111,100,15);
		passwordTF.setBounds(43,149,100,15);
	}
	
	public void addLoginListener(ActionListener loginListener){
		loginButton.addActionListener(loginListener);
	}
	
	
}
