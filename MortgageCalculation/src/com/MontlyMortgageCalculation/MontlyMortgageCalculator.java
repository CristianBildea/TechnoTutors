package com.MontlyMortgageCalculation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MontlyMortgageCalculator {

	private JFrame frame;
	private JTextField textPrinc;
	private JTextField textDownPay;
	private JTextField textRate;
	private JTextField textNumMont;
	private JTextField textMontPay;
	private double princ, downpay, rate, montpay;
	private int nummont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MontlyMortgageCalculator window = new MontlyMortgageCalculator();
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
	public MontlyMortgageCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monthly Mortgage Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(23, 0, 296, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Principal");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(23, 59, 111, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Down Payment");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(23, 111, 111, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rate %");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(23, 165, 111, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number of Months");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(23, 217, 121, 24);
		frame.getContentPane().add(lblNewLabel_4);

		
		JButton btnNewButton = new JButton("Monthly Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					princ= Double.parseDouble(textPrinc.getText());
					downpay= Double.parseDouble(textDownPay.getText());
					rate= Double.parseDouble(textRate.getText());
					nummont= Integer.parseInt(textNumMont.getText());
					montpay= ((princ-downpay)*(rate/100)+(princ-downpay))/nummont;
					textMontPay.setText(Double.toString(montpay));				
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(23, 268, 156, 42);
		frame.getContentPane().add(btnNewButton);
		
		textPrinc = new JTextField();
		textPrinc.setBounds(303, 62, 131, 29);
		frame.getContentPane().add(textPrinc);
		textPrinc.setColumns(10);
		
		textDownPay = new JTextField();
		textDownPay.setBounds(303, 114, 131, 29);
		frame.getContentPane().add(textDownPay);
		textDownPay.setColumns(10);
		
		textRate = new JTextField();
		textRate.setBounds(303, 168, 131, 29);
		frame.getContentPane().add(textRate);
		textRate.setColumns(10);
		
		textNumMont = new JTextField();
		textNumMont.setBounds(303, 220, 131, 29);
		frame.getContentPane().add(textNumMont);
		textNumMont.setColumns(10);
		
		textMontPay = new JTextField();
		textMontPay.setBounds(303, 268, 131, 29);
		frame.getContentPane().add(textMontPay);
		textMontPay.setColumns(10);
	}
}
