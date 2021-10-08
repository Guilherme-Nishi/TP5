package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import controle.ControleDados;


/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface do menu
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 *
 *
 * 
 */
public class TelaMenu implements ActionListener {
	private static JFrame tela = new JFrame();
	private static JLabel titulo = new JLabel("Menu do programa");
	private static JButton func = new JButton("Funcionário");
	private static JButton user = new JButton ("Usuário");
	public static ControleDados dados = new ControleDados();
	/**
	 * Esta classe implementa a interface do menu. 
	 * Ela contem uma interface de menu onde possui
	 * 2 opções :funcionário e usuário
	 * 
	 * 
	 * 
	 * 
	 *
	 * 
	 */
	public TelaMenu (){
		
		tela.setLayout(null);
		
		titulo.setBounds(100,0,380,50);
		titulo.setFont(new Font("Arial",Font.BOLD,20));
		tela.add(titulo);
		
		func.setBounds(110,160,150,40);
		tela.add(func);
		
		user.setBounds(110,100,150,40);
		tela.add(user);
		tela.setSize(400,300);
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);
	}

	public static void main(String[] args) {
		TelaMenu novaTela = new TelaMenu();
		user.addActionListener(novaTela);
		func.addActionListener(novaTela);
		

	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src==user) {
			  new TelaLoginUser().TelaLoginUser1(dados);
			 
		}
		
		if(src==func) {
			new TelaFunc().TelaFunc1(dados);
			 
		}
		
		
		
	}

}