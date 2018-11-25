package cypher;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;



public class main {

	public static void main(String[] args) {
		

	
	System.out.println(substitution.key);
	System.out.println(substitution.decrypt(substitution.key));
	

	
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Enter String:");
	System.out.println(substitution.encrypt("PICKUPATCIRCULATIONDESK"));
	String str = "arrc";
	char[] ipchar = str.toCharArray();
	System.out.println(substitution.decypher(str));

	}

	
}
