package view;

import model.loginModel;
import controller.loginController;

public class starter {
	public static void main(String[] args) {
		
		login log = new login();
		loginModel mod = new loginModel();
		loginController con = new loginController(log,mod);
	}
}
