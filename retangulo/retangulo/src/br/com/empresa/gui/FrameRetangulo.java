package br.com.empresa.gui;

import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameRetangulo {
	
	public void criarTela() {
		
		// *** Construir  a tela **//
		JFrame tela = new JFrame();
		tela.setTitle("Calculos com retângulo");
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(3);
		tela.setLayout(null);
		
		// *** Construir  um **//
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(10, 10, 60, 30);

		
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70, 10, 60, 30);
		
		tela.setVisible(true);
		tela.getContentPane().add(labelAltura);
		tela.getContentPane().add(textAltura);
	}
	

		
		
	

}
