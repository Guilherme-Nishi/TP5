package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import controle.ControleDados;

import java.awt.*;
/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface do funcionário
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 *
 *
 * 
 */
public class TelaFunc implements ActionListener {
	private static JFrame telaFunc = new JFrame();
	private static JLabel tituloFunc = new JLabel("Menu do funcionario");
	private static JButton buttonListaClientes = new JButton("Lista e edicao de clientes");
	private static JButton buttonListaProdutos = new JButton("Lista e cadastro de produtos");
	private static JButton buttonCadastrarVendas = new JButton("Lista e cadastro de vendas");
	private static JButton buttonPesquisaCliente = new JButton("Pesquisar cliente");
	private static JButton buttonPesquisaProduto = new JButton("Pesquisar Produto");
	private static JButton buttonPesquisaVenda = new JButton("Pesquisar venda");
	private static JButton buttonCadastrarFunc = new JButton("Cadastrar novo funcionario");
	public static ControleDados dados ;
	
	/**
	 * Esta classe implementa a interface do funcionário
	 * 
	 * @param d é um parâmetro da classe ControleDados que serve para referencia-la
	 * 
	 * 
	 * 
	 * 
	 */
	public void TelaFunc1(ControleDados d) {
		dados=d;
		
		telaFunc.setLayout(null);
		
		tituloFunc.setBounds(90, 0, 380, 50);
		tituloFunc.setFont(new Font("Arial",Font.BOLD,20));
		telaFunc.add(tituloFunc);
		
		buttonListaClientes.setBounds(45,70,300,40);
		telaFunc.add(buttonListaClientes);
		
		buttonListaProdutos.setBounds(45,130,300,40);
		telaFunc.add(buttonListaProdutos);
		
		
		
		buttonCadastrarVendas.setBounds(45,190,300,40);
		telaFunc.add(buttonCadastrarVendas);
		
		buttonPesquisaCliente.setBounds(45,250,300,40);
		telaFunc.add(buttonPesquisaCliente);
		
		buttonPesquisaProduto.setBounds(45,310,300,40);
		telaFunc.add(buttonPesquisaProduto);
		
		buttonPesquisaVenda.setBounds(45,370,300,40);
		telaFunc.add(buttonPesquisaVenda);
		
		buttonCadastrarFunc.setBounds(45,430,300,40);
		telaFunc.add(buttonCadastrarFunc);
		
		telaFunc.setSize(400,550);
	
		telaFunc.setVisible(true);
		telaFunc.setLocationRelativeTo(null);
		buttonListaClientes.addActionListener(this);
		buttonListaProdutos.addActionListener(this);
		buttonCadastrarVendas.addActionListener(this);
		buttonPesquisaCliente.addActionListener(this);
		buttonPesquisaVenda.addActionListener(this);
		buttonPesquisaProduto.addActionListener(this);
		buttonCadastrarFunc.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==buttonListaProdutos) {
			new TelaListaClientes().ListaProdutos(dados);
		}
		
		
		if(src==buttonListaClientes) {
			new TelaListaCons().ListaClientes(dados);
		}
		
		if(src==buttonCadastrarVendas) {
			new TelaListaVendas().ListaProdutos(dados);
		}
		
		
		if(src==buttonPesquisaCliente) {
			new PesquisaCliente().Pesquisa(dados);
		}
		
		if(src==buttonPesquisaProduto) {
			new PesquisarProduto().Pesquisa(dados);
		}
		
		if(src==buttonPesquisaVenda) {
			new PesquisaVenda().Pesquisa(dados);
		}
		
		if(src == buttonCadastrarFunc) {
			new TelaListaFunc().ListaFunc(dados);
		}
	}

}