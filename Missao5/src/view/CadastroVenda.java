package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.ControleDados;
/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface do cadastro de vendas
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 * 
 */

public class CadastroVenda implements ActionListener{
	
	private static JFrame telaRegistroVendas = new JFrame();
	private static JLabel tituloRegistroProdutos = new JLabel("Faça o registro da Venda");
	private static JLabel userNameProdutos = new JLabel("Num da venda:");
	private static JTextField nameTextVendas = new JTextField();
	private static JTextField prodText = new JTextField(20);
	private static JLabel corProduto = new JLabel("Produto:");
	private static JTextField nomeCliText = new JTextField(20);
	private static JLabel produtoNum = new JLabel("Nome do cliente:");
	private static JButton salvarVenda = new JButton("Cadastrar");
	private static ControleDados dados;
	private String[] novoDado3 = new String[5];
	private static JButton buttonRegisterProd = new JButton("Registrar");
	/**
	 * Esta classe implementa a interface do cadastro de vendas. 
	 * Ela contem uma interface de venda como nome do produto
	 * cadastrar,número da venda  e nome do cliente.
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * @param r é um parâmetro que  referencia a classe TelaListaVenda
	 * 
	 * 
	 */
	public void TelaCadastroVendas(ControleDados d , TelaListaVendas r) {
Color minhaCor2 = new Color(192, 192, 192);
		dados=d;
		telaRegistroVendas.setLayout(null);
		tituloRegistroProdutos.setFont(new Font("Arial",Font.BOLD,20));
		tituloRegistroProdutos.setBounds(90,0,380,50);
		telaRegistroVendas.add(tituloRegistroProdutos);
		
		userNameProdutos.setBounds(10,40,110,60);
		userNameProdutos.setFont(new Font("Arial",Font.BOLD,12));
		telaRegistroVendas.add(userNameProdutos);
		nameTextVendas.setBounds(110,55,200,27);
		telaRegistroVendas.add(nameTextVendas);
		
		corProduto.setBounds(50,100,110,60);
		prodText.setBounds(110, 115, 200, 27);
		telaRegistroVendas.add(corProduto);
		telaRegistroVendas.add(prodText);
		
		
		salvarVenda.addActionListener(this);
		telaRegistroVendas.add(salvarVenda);
		salvarVenda.setBounds(100,230,200,27);
		
		produtoNum.setBounds(10,160,110,60);
		nomeCliText.setBounds(110,175,200,27);
		telaRegistroVendas.add(produtoNum);
		telaRegistroVendas.add(nomeCliText);
		
		telaRegistroVendas.setSize(400,300);
		telaRegistroVendas.setVisible(true);
		buttonRegisterProd.addActionListener(this);
		
	
		
	}
	
	

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == salvarVenda) {
			boolean test;
			novoDado3[0] = Integer.toString(dados.getqtdvenda());
			novoDado3[1] =  nameTextVendas.getText();
			novoDado3[2] = prodText.getText();
			novoDado3[3] =  nomeCliText.getText();
			
			
			
			
			test = dados.inserirEditarVenda(novoDado3);
			
			nameTextVendas.setText("");
			prodText.setText("");
			nomeCliText.setText("");
			
			if(test==true) {
				mensagemSucessoCadastro();
			}
			
			
		}
		
	}
	
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		telaRegistroVendas.dispose();
	}
}
