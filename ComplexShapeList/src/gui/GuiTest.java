package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ccollection.Ccvor;
import ccollection.CshapeCollection;
import ccollection2.CcollectionCollection;
import ccollection2.Ccvor2;
import cshape.Ccircle;
import cshape.CequilateralTriangle;
import cshape.Cshape;
import cshape.Csquare;




public class GuiTest {
	
	private static int counter=0;
	private static CcollectionCollection listaliste=new	CcollectionCollection();
	
	public static void main(String[] args) {
	
		JFrame window=new JFrame("GUI");
		window.setVisible(true);
		window.setSize(1000,1000);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		window.add(panel);
		
		JLabel numberOfLists=new JLabel();
		//numberOfLists.setName("Number of lists:");
		numberOfLists.setBounds(200,10,250,30);
		numberOfLists.setText("Number of lists:"+counter);
		numberOfLists.setFont(new Font("Courier", Font.BOLD,20	));
		panel.add(numberOfLists);
		
		JButton addList=new JButton("Add new list");
		addList.setBounds(20,50,150,50);
		
		addList.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 counter++;
	            numberOfLists.setText("Number of lists:"+ counter);
	            addList.setEnabled(false);
	            
	            
	            listaliste.caddLast2(new CshapeCollection());
	            //ovde se dodaje nova lista predmeta u listuliste
	            
	            JButton addSquare=new JButton("Add square");
	    		addSquare.setBounds(20,115,150,50);
	    		
	    		addSquare.addActionListener(new ActionListener() {
	     	         public void actionPerformed(ActionEvent e) {
	     	        	String number = JOptionPane.showInputDialog("Type shape defining number");
	      	        	int result = Integer.parseInt(number);
	      	        	
	      	        	listaliste.getLast().getInformation().caddLast(new Csquare(result));
	     	    		SwingUtilities.updateComponentTreeUI(window);
	     	         }
	     	    });
	    		
	    		panel.add(addSquare);
	    		
	    		JButton addCircle=new JButton("Add circle");
	    		addCircle.setBounds(180,115,150,50);
	    		
	    		addCircle.addActionListener(new ActionListener() {
	     	         public void actionPerformed(ActionEvent e) {
	     	        	String number = JOptionPane.showInputDialog("Type shape defining number");
	      	        	int result = Integer.parseInt(number);
	      	        	
	      	        	listaliste.getLast().getInformation().caddLast(new Ccircle(result));
	     	    		SwingUtilities.updateComponentTreeUI(window);
	     	         }
	     	    });
	    		
	    		panel.add(addCircle);
	    		
	    		JButton addTriangle=new JButton("Add triangle");
	    		addTriangle.setBounds(345,115,150,50);
	    		
	    		addTriangle.addActionListener(new ActionListener() {
	     	         public void actionPerformed(ActionEvent e) {
	     	        	String number = JOptionPane.showInputDialog("Type shape defining number");
	      	        	int result = Integer.parseInt(number);
	      	        	
	      	        	listaliste.getLast().getInformation().caddLast(new CequilateralTriangle(result));
	     	    		SwingUtilities.updateComponentTreeUI(window);
	     	         }
	     	    });
	    		
	    		panel.add(addTriangle);
	    		
	    		JButton done=new JButton("DONE");
	    		done.addActionListener(new ActionListener() {
	   	         public void actionPerformed(ActionEvent e) {
	   	       	 addList.setEnabled(true);
	   	    		panel.remove(done);
	   	    		panel.remove(addCircle);
	   	    		panel.remove(addSquare);
	   	    		panel.remove(addTriangle);
	   	    		SwingUtilities.updateComponentTreeUI(window);
	   	         }
	   	    });
	   	    		//POKRECE PONOVO DUGME I BRISE SVE
	   	    		done.setBounds(515,115,150,50);
	   	    		panel.add(done);
	   	    		SwingUtilities.updateComponentTreeUI(window);
	   	         }
	   	    });
	    		
	    		
		panel.add(addList);
		JTextPane finalPrint = new JTextPane ();
      	finalPrint.setBounds(20,250,900,500);
      	panel.add(finalPrint);
		JButton printSelectedList=new JButton("Print selected list");
		printSelectedList.setBounds(20,175,150,50);
		printSelectedList.addActionListener(new ActionListener() {
  	         public void actionPerformed(ActionEvent e) {
  	        	String number = JOptionPane.showInputDialog("Type in index number of wanted list");
  	        	int result = Integer.parseInt(number);
  	        	//stampa
  	        	
  	        	SwingUtilities.updateComponentTreeUI(window);
  	        	StringBuffer text=new StringBuffer();
  	        	int i=0;
  	        	Ccvor2 tek=listaliste.getFirst();
  	        	
  	        	if(result>counter){
  	        		text.append("The list doesent exist");
  	        	};
  	        	
  	        	while(i<result-1) {
  	        		i++;
  	        		tek=tek.getNext();
  	        		
  	        	}
  	        	Ccvor tek2=tek.getInformation().getFirst();
  	        	while(tek2!=null) {
  	        		
  	        		text.append(tek2.getInformation().getType()).append(System.getProperty("line.separator"));
  	        		
  	        		
  	        		tek2=tek2.getNext();
  	        	}
  	        	
  	        	finalPrint.setText(text.toString());
  	        	
  	    		SwingUtilities.updateComponentTreeUI(window);
  	         }
  	    });
		panel.add(printSelectedList);
	}
}
