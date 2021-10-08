package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controle.ControleDados;

/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface da venda
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 *
 */


public class TelaVenda implements ActionListener  {

	private static JFrame telaVenda = new JFrame();
	private static JLabel tituloVenda ;
	private static JLabel numVenda;
	private static JLabel nomeCliente;
	private static JLabel nomeProduto;
	private static JButton saida = new JButton("Sair");
	private static ControleDados dados;
	private static int posicao;
	/**
	 * Esta classe implementa a interface da venda. 
	 * Ela contem uma interface de venda onde será possível
	 * fazer a venda do produto
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * @param v é um parâmetro que  referencia a classe TelaListaClientes
	 * @param pos é um inteiro que serve para implementar a posição do vetor
	 * 
	 */
public void TelaVenda1(ControleDados d , TelaListaVendas v , int pos) {
	dados=d;
	posicao = pos;
	
	telaVenda.setLayout(null);
	telaVenda.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	tituloVenda = new JLabel(dados.getVenda()[pos].getNumerovenda());
	tituloVenda.setFont(new Font("Arial",Font.BOLD,40));
	tituloVenda.setBounds(120,0,380,50);
	telaVenda.add(tituloVenda);
	
	numVenda = new JLabel("Num venda: "+dados.getVenda()[pos].getNumerovenda());
	numVenda.setFont(new Font("Arial",Font.BOLD,20));
	numVenda.setBounds(10,70,200,30);
	telaVenda.add(numVenda);
	
	nomeCliente = new JLabel("Nome do cliente: "+ dados.getVenda()[pos].getNomeCliente());
	nomeCliente.setFont(new Font("Arial",Font.BOLD,20));
	nomeCliente.setBounds(10,130,300,30);
	telaVenda.add(nomeCliente);
	
	nomeProduto = new JLabel("Nome do produto: " + dados.getVenda()[pos].getNomeProduto());
	nomeProduto.setFont(new Font("Arial",Font.BOLD,20));
	nomeProduto.setBounds(10,190,300,30);
	telaVenda.add(nomeProduto);

	saida.setBounds(130,250,100,30);
	saida.addActionListener(this);
	telaVenda.add(saida);
	
	
	
	
	
	
	
	
	
	
	telaVenda.setSize(400,330);
	telaVenda.setVisible(true);
}
/** 
* @param d é um parâmetro que  referencia a classe ControleDados
* @param v é um parâmetro que  referencia a classe TelaListaClientes
* @param pos é um inteiro que serve para implementar a posição do vetor
* 
*/
public void TelaVenda2(ControleDados d , PesquisaVenda v , int pos) {
	dados=d;
	posicao = pos;
	
	telaVenda.setLayout(null);
	telaVenda.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	tituloVenda = new JLabel(dados.getVenda()[pos].getNumerovenda());
	tituloVenda.setFont(new Font("Arial",Font.BOLD,40));
	tituloVenda.setBounds(120,0,380,50);
	telaVenda.add(tituloVenda);
	
	numVenda = new JLabel("Num venda: "+dados.getVenda()[pos].getNumerovenda());
	numVenda.setFont(new Font("Arial",Font.BOLD,20));
	numVenda.setBounds(10,70,200,30);
	telaVenda.add(numVenda);
	
	nomeCliente = new JLabel("Nome do cliente: "+ dados.getVenda()[pos].getNomeCliente());
	nomeCliente.setFont(new Font("Arial",Font.BOLD,20));
	nomeCliente.setBounds(10,130,300,30);
	telaVenda.add(nomeCliente);
	
	nomeProduto = new JLabel("Nome do produto: " + dados.getVenda()[pos].getNomeProduto());
	nomeProduto.setFont(new Font("Arial",Font.BOLD,20));
	nomeProduto.setBounds(10,190,300,30);
	telaVenda.add(nomeProduto);

	saida.setBounds(130,250,100,30);
	saida.addActionListener(this);
	telaVenda.add(saida);
	
	
	
	
	
	
	
	
	
	
	telaVenda.setSize(400,330);
	telaVenda.setVisible(true);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == saida) {
			
			
			tituloVenda.setText(""); 
			numVenda.setText("");
			nomeCliente.setText("");
			nomeProduto.setText("");
			
			telaVenda.dispose();
		}
		
	}
	
}