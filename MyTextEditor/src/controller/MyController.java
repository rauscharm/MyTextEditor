package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import view.MyFrame;

public class MyController implements IMyController {

	private MyFrame meinFenster;


	@Override
	public void read() {
		JFileChooser fc = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
		fc.setFileFilter(filter);
		
		 int returnVal = fc.showOpenDialog(null);


		    if (returnVal == JFileChooser.APPROVE_OPTION) {
		        File file = fc.getSelectedFile();
		        System.out.println(file.getAbsolutePath() + " wurde ausgewaehlt");
		        
		     try {
				Scanner scanner = new Scanner (file);
				 while (scanner.hasNextLine()) {
		                String line = scanner.nextLine();
		         
		                meinFenster.getTextArea().append(line);
		                meinFenster.getTextArea().append("\n");
		            }
				 scanner.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
		    } else {
		      
		    }
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void startGui(IMyController controller) {
		
		 meinFenster = new MyFrame(controller); 
		
		
	}
	

}
