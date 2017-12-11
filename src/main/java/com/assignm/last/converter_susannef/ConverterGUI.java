/**
 * @author susanne fridh
 * @version 1.0
 * 
 * This is the MainFrame class for the GUI called ConverterGUI.java
 * 
 * It is a converter there you convert from centimeter to other lengths
 */

package com.assignm.last.converter_susannef;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConverterGUI {
	// Declarations of the buttons, labels and text field
	BasicConverter bc = new BasicConverter();
	private JFrame frmConvertersusannef = new JFrame();
	private JTextField Input = new JTextField();
	private JLabel lblCm = new JLabel("cm");
	private JButton btnToMillimeter = new JButton("till millimeter");
	private JButton btnToCentimeter = new JButton("till centimeter");
	private JButton btnToDecimeter = new JButton("till decimeter");
	private JButton btnToMeter = new JButton("till meter");
	private JButton btnToKilometer = new JButton("till kilometer");
	private JButton btnToMil = new JButton("till mil");
	private JTextField Resultat = new JTextField();
	private JLabel lblResultat = new JLabel("Resultat");


	/**
	 * Create the converter.
	 */
	public ConverterGUI() {
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
		Input.setFont(new Font("Dialog", Font.PLAIN, 17));
		frmConvertersusannef.setVisible(true);
		
		
		Input.setBounds(24, 12, 325, 40);
		frmConvertersusannef.getContentPane().add(Input);
		Input.setColumns(10);
		lblCm.setFont(new Font("Dialog", Font.BOLD, 15));
		
		Resultat.setFont(new Font("Dialog", Font.PLAIN, 15));
		Resultat.setBounds(24, 77, 512, 40);
		Resultat.setColumns(10);
		
		lblCm.setBounds(363, 12, 70, 40);
		frmConvertersusannef.getContentPane().add(lblCm);
		
		btnToMillimeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(Input.getText());
				Resultat.setText(String.valueOf(bc.millimeter(number)));
			}
		});
		
		
		btnToMillimeter.setBounds(22, 163, 178, 25);
		frmConvertersusannef.getContentPane().add(btnToMillimeter);
		
		btnToCentimeter.setBounds(263, 163, 159, 25);
		frmConvertersusannef.getContentPane().add(btnToCentimeter);
		btnToCentimeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(Input.getText());
				Resultat.setText(String.valueOf(bc.centimeter(number)));
			}
		});
		
		
		btnToDecimeter.setBounds(22, 238, 168, 25);
		frmConvertersusannef.getContentPane().add(btnToDecimeter);
		btnToDecimeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(Input.getText());
				Resultat.setText(String.valueOf(bc.decimeter(number)));
			}
		});
		
		
		btnToMeter.setBounds(277, 238, 145, 25);
		frmConvertersusannef.getContentPane().add(btnToMeter);
		btnToMeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(Input.getText());
				Resultat.setText(String.valueOf(bc.meter(number)));
			}
		});
		
		
		btnToKilometer.setBounds(22, 320, 168, 25);
		frmConvertersusannef.getContentPane().add(btnToKilometer);
		btnToKilometer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(Input.getText());
				Resultat.setText(String.valueOf(bc.kilometer(number)));
			}
		});
		
		
		btnToMil.setBounds(277, 320, 117, 25);
		frmConvertersusannef.getContentPane().add(btnToMil);
		btnToMil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(Input.getText());
				Resultat.setText(String.valueOf(bc.mil(number)));
			}
		});
		
		frmConvertersusannef.getContentPane().add(Resultat);
		lblResultat.setFont(new Font("Dialog", Font.BOLD, 15));
		lblResultat.setBounds(554, 85, 95, 27);
		
		frmConvertersusannef.getContentPane().add(lblResultat);
	}
}
