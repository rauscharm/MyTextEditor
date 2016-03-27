package myTextEditor;

import controller.IMyController;
import controller.MyController;

/**
 * Die Main Klasse
 * @author Toni
 *
 */
public class Main {

	public static void main(String[] args) {
	
		IMyController c = new MyController();
		c.startGui(c);

	}

}
