package com.assignm.last.converter_susannef;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ConverterGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterGUI window = new ConverterGUI();
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
	public ConverterGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Converter");
		frame.setBounds(100, 100, 679, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 12, 337, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCm = new JLabel("cm");
		lblCm.setBounds(363, 12, 70, 15);
		frame.getContentPane().add(lblCm);
		
		JButton btnToMillimeter = new JButton("till millimeter");
		btnToMillimeter.setBounds(12, 63, 178, 25);
		frame.getContentPane().add(btnToMillimeter);
		
		JButton btnToCentimeter = new JButton("till centimeter");
		btnToCentimeter.setBounds(256, 63, 159, 25);
		frame.getContentPane().add(btnToCentimeter);
		
		JButton btnToDecimeter = new JButton("till decimeter");
		btnToDecimeter.setBounds(22, 163, 168, 25);
		frame.getContentPane().add(btnToDecimeter);
		
		JButton btnToMeter = new JButton("till meter");
		btnToMeter.setBounds(270, 163, 145, 25);
		frame.getContentPane().add(btnToMeter);
		
		JButton btnToKilometer = new JButton("till kilometer");
		btnToKilometer.setBounds(22, 252, 168, 25);
		frame.getContentPane().add(btnToKilometer);
		
		JButton btnToMil = new JButton("till mil");
		btnToMil.setBounds(276, 252, 117, 25);
		frame.getContentPane().add(btnToMil);
		
		JButton btnTillTum = new JButton("till tum");
		btnTillTum.setBounds(28, 342, 117, 25);
		frame.getContentPane().add(btnTillTum);
		
		JButton btnTillFot = new JButton("till fot");
		btnTillFot.setBounds(276, 342, 117, 25);
		frame.getContentPane().add(btnTillFot);
		
		JButton btnTillAln = new JButton("till aln");
		btnTillAln.setBounds(28, 463, 117, 25);
		frame.getContentPane().add(btnTillAln);
		
		JButton btnTillFamn = new JButton("till famn");
		btnTillFamn.setBounds(287, 463, 117, 25);
		frame.getContentPane().add(btnTillFamn);
	}
}
