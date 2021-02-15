import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
class Students_Records
{
	private JFrame frame;
	private JTextField txtid;
	private JTextField txtname;
	private JTextField txtno;
	private JTextField txtcode;
	private JTextField txtcname;
	private JTextField txtdob;
	private JTextField txtaddress;
	private JTextField txtcontact;
	private JTextField txtadhar;
	private JTextField txtnationality;
	private JTextField txtdomecile;
	private JTextField txtcast;
	private JTextArea  txtreceipt;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() 
			{
				try 
				{
					Students_Records window = new Students_Records();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Students_Records() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 105, 180));
		frame.setBounds(10, 10, 1500, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(41, 67, 152, 36);
		frame.getContentPane().add(lblNewLabel);
		
	}
}