package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setBounds(180, 30, 90, 25);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("BankGothic Md BT", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("How to play");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(162, 100, 126, 25);
		btnNewButton_1.setFont(new Font("BankGothic Md BT", Font.BOLD, 13));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Quit");
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setFont(new Font("BankGothic Md BT", Font.BOLD, 13));
		btnNewButton_2.setBounds(180, 170, 90, 25);
		frame.getContentPane().add(btnNewButton_2);
	}
}
