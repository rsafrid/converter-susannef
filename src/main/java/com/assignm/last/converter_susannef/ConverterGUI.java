package com.assignm.last.converter_susannef;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ConverterGUI {

	private JFrame frmConvertersusannef;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterGUI window = new ConverterGUI();
					window.frmConvertersusannef.setVisible(true);
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
		frmConvertersusannef = new JFrame();
		frmConvertersusannef.setTitle("Converter-susannef");
		frmConvertersusannef.setBounds(100, 100, 679, 557);
		frmConvertersusannef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConvertersusannef.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 12, 337, 19);
		frmConvertersusannef.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCm = new JLabel("cm");
		lblCm.setBounds(363, 12, 70, 15);
		frmConvertersusannef.getContentPane().add(lblCm);
		
		JButton btnToMillimeter = new JButton("till millimeter");
		btnToMillimeter.setBounds(12, 63, 178, 25);
		frmConvertersusannef.getContentPane().add(btnToMillimeter);
		
		JButton btnToCentimeter = new JButton("till centimeter");
		btnToCentimeter.setBounds(256, 63, 159, 25);
		frmConvertersusannef.getContentPane().add(btnToCentimeter);
		
		JButton btnToDecimeter = new JButton("till decimeter");
		btnToDecimeter.setBounds(22, 163, 168, 25);
		frmConvertersusannef.getContentPane().add(btnToDecimeter);
		
		JButton btnToMeter = new JButton("till meter");
		btnToMeter.setBounds(270, 163, 145, 25);
		frmConvertersusannef.getContentPane().add(btnToMeter);
		
		JButton btnToKilometer = new JButton("till kilometer");
		btnToKilometer.setBounds(22, 252, 168, 25);
		frmConvertersusannef.getContentPane().add(btnToKilometer);
		
		JButton btnToMil = new JButton("till mil");
		btnToMil.setBounds(276, 252, 117, 25);
		frmConvertersusannef.getContentPane().add(btnToMil);
		
		JButton btnTillTum = new JButton("till tum");
		btnTillTum.setBounds(28, 342, 117, 25);
		frmConvertersusannef.getContentPane().add(btnTillTum);
		
		JButton btnTillFot = new JButton("till fot");
		btnTillFot.setBounds(276, 342, 117, 25);
		frmConvertersusannef.getContentPane().add(btnTillFot);
		
		JButton btnTillAln = new JButton("till aln");
		btnTillAln.setBounds(28, 463, 117, 25);
		frmConvertersusannef.getContentPane().add(btnTillAln);
		
		JButton btnTillFamn = new JButton("till famn");
		btnTillFamn.setBounds(287, 463, 117, 25);
		frmConvertersusannef.getContentPane().add(btnTillFamn);
		
		JLabel lblNedanrGamla = new JLabel("Nedan är gamla svenska mått från 1700-talet:");
		lblNedanrGamla.setBounds(33, 301, 360, 15);
		frmConvertersusannef.getContentPane().add(lblNedanrGamla);
	}
}
