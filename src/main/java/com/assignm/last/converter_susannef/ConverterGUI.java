package com.assignm.last.converter_susannef;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class ConverterGUI {

	BasicConverter bc = new BasicConverter();
	private JFrame frmConvertersusannef = new JFrame();
	private JTextField textField = new JTextField();
	private JLabel lblCm = new JLabel("cm");
	private JButton btnToMillimeter = new JButton("till millimeter");
	private JButton btnToCentimeter = new JButton("till centimeter");
	private JButton btnToDecimeter = new JButton("till decimeter");
	private JButton btnToMeter = new JButton("till meter");
	private JButton btnToKilometer = new JButton("till kilometer");
	private JButton btnToMil = new JButton("till mil");
	private final JTextField textField_1 = new JTextField();
	private final JLabel lblResultat = new JLabel("Resultat");


	/**
	 * Create the application.
	 */
	public ConverterGUI() {
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_1.setBounds(24, 77, 512, 40);
		textField_1.setColumns(10);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmConvertersusannef.setTitle("Converter-susannef");
		frmConvertersusannef.setBounds(100, 100, 679, 557);
		frmConvertersusannef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConvertersusannef.getContentPane().setLayout(null);
		textField.setFont(new Font("Dialog", Font.PLAIN, 17));
		
		
		textField.setBounds(24, 12, 325, 40);
		frmConvertersusannef.getContentPane().add(textField);
		textField.setColumns(10);
		lblCm.setFont(new Font("Dialog", Font.BOLD, 15));
		
		
		lblCm.setBounds(363, 12, 70, 40);
		frmConvertersusannef.getContentPane().add(lblCm);
		
		
		btnToMillimeter.setBounds(22, 163, 178, 25);
		frmConvertersusannef.getContentPane().add(btnToMillimeter);
		
		
		btnToCentimeter.setBounds(263, 163, 159, 25);
		frmConvertersusannef.getContentPane().add(btnToCentimeter);
		
		
		btnToDecimeter.setBounds(22, 238, 168, 25);
		frmConvertersusannef.getContentPane().add(btnToDecimeter);
		
		
		btnToMeter.setBounds(277, 238, 145, 25);
		frmConvertersusannef.getContentPane().add(btnToMeter);
		
		
		btnToKilometer.setBounds(22, 320, 168, 25);
		frmConvertersusannef.getContentPane().add(btnToKilometer);
		
		
		btnToMil.setBounds(277, 320, 117, 25);
		frmConvertersusannef.getContentPane().add(btnToMil);
		
		frmConvertersusannef.getContentPane().add(textField_1);
		lblResultat.setFont(new Font("Dialog", Font.BOLD, 15));
		lblResultat.setBounds(554, 85, 95, 27);
		
		frmConvertersusannef.getContentPane().add(lblResultat);
	}
}
