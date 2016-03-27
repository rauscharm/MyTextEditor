package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import controller.IMyController;

public class MyFrame extends JFrame {
	
	private JMenuBar menubar;
	private JMenu mFile;
	private JMenuItem miSave;
	private JMenuItem miLoad;
	private JMenuItem miExit;
	
	private JTextArea textArea;
	
	
	
	
	
	

	private IMyController controller;

	public MyFrame(IMyController controller) {
		
		this.controller = controller;
		setTitle("Editor");
		//setPreferredSize(new Dimension(800, 600));
		//setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initMenue();
		textArea = new JTextArea(30,80);
		this.add(textArea);
		
		this.setJMenuBar(menubar);
		
		initActions();
		pack();
		
		setVisible(true);

		
	}
	
	


	private void initActions() {
		miLoad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.read();
				
			}
		});
		
		miSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.save();
				
			}
		});
	}




	public void initMenue() {
		
		menubar = new JMenuBar();
		mFile = new JMenu("File");
		miSave = new JMenuItem("Save");
		miLoad = new JMenuItem("Load");
		
		mFile.add(miSave);
		mFile.add(miLoad);
		menubar.add(mFile);
		
		
		
	}




	public JTextArea getTextArea() {
		return textArea;
	}




	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	
	
}
