package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.loginModel;
import view.login;


public class loginController {

	private login view;
	private loginModel model;
	
	public loginController(login view, loginModel model){
		
		this.model = model;
		this.view = view;
		
		this.view.addLoginListener(new loginListener());
	}
	
	class loginListener implements ActionListener{

		public void actionPerformed(ActionEvent click) {
			
			model.setUsername(view.usernameTF.getText());
			model.setPassword(view.usernameTF.getText());
			
			if(model.getUsername().equals("admin") && model.getPassword().equals("admin")){
				JOptionPane.showMessageDialog(null, "Hello " + model.getUsername() + " you are now logged in!");
			}
			else{
				JOptionPane.showMessageDialog(null, "User does not exist");
			}
		}
		
	}
}
