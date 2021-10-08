package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controle.ControleDados;

/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface do cliente
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 *
 */

public class TelaUser implements ActionListener {
	private static JFrame telaUser = new JFrame();
	private static JLabel tituloMenuUser = new JLabel("Menu do usuário");
	private static JButton pesquisarButton = new JButton("Pesquisar Produto");
	private static JButton listaButton = new JButton("Lista de produtos");
	public static ControleDados dados;
	/**
	 * Esta classe implementa a interface do cliente. 
	 * Ela contem uma interface do cliente em que é
	 * possível pesquisar e listar os produtos.
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * 
	 * 
	 */
	public void TelaUser1 (ControleDados d) {
		dados=d;
		
		telaUser.setLayout(null);
		
		tituloMenuUser.setBounds(100,0,380,50);
		tituloMenuUser.setFont(new Font("Arial",Font.BOLD,20));
		telaUser.add(tituloMenuUser);
		
		pesquisarButton.setBounds(110,70,150,40);
		telaUser.add(pesquisarButton);
		
		listaButton.setBounds(110,150,150,40);
		telaUser.add(listaButton);
		
		
		
		
		
		
		
		
		telaUser.setSize(400,300);
		telaUser.setLocationRelativeTo(null);
		telaUser.setVisible(true);
		listaButton.addActionListener(this);
		pesquisarButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==listaButton) {
			new TelaListaCompras().ListaProdutosCliente(dados);
		}
		
		if(src==pesquisarButton) {
			new PesquisarProduto().Pesquisa2(dados);
		}
		
	}

}