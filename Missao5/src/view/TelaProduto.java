package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controle.ControleDados;
/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface do produto
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 *
 *
 * 
 */
public class TelaProduto implements ActionListener {
	private static JFrame telaProduto = new JFrame();
	private static JLabel tituloProduto2;
	private static JLabel nomeP;
	private static JLabel precoP;
	private static JLabel corP;
	private static JLabel estoqueP;
	private static JLabel tamanhoP;
	private static JLabel catSexP;
	private static JLabel catProdEtaP;
	private static JLabel prodMarcaP;
	private static JLabel descricaoProdP;
	private static JButton comprar1 = new JButton("Comprar!");
	private static JButton comprar2 = new JButton("Comprar!");
	private static JButton saida1 = new JButton("Sair");
	private static ControleDados dados;
	private int posicao;
	
	/**
	 * Esta classe implementa a interface do produto. 
	 * Ela contem uma interface do produto em que sera possível
	 * comprar o produto.
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * @param c é um parâmetro que  referencia a classe TelaListaCompras
	 * @param pos é um inteiro que serve para implementar a posição do vetor
	 * 
	 */
	public void ComprarTela(ControleDados d , TelaListaCompras c,int pos) {
		dados=d;
		posicao=pos;
		
		telaProduto.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		telaProduto.setLayout(null);
		tituloProduto2 = new JLabel(dados.getProduto()[pos].getNomeproduto());
		tituloProduto2.setFont(new Font("Arial",Font.BOLD,20));
		tituloProduto2.setBounds(100,0,380,50);
		
		precoP = new JLabel("R$"+String.valueOf(dados.getProduto()[pos].getPreco()));
		precoP.setFont(new Font("Arial",Font.BOLD,40));
		precoP.setBounds(10,55,380,50);
		
		prodMarcaP = new JLabel("Marca: "+dados.getProduto()[pos].getMarca());
		prodMarcaP.setFont(new Font("Arial",Font.BOLD,20));
		prodMarcaP.setBounds(10,90,380,50);
		
		descricaoProdP = new JLabel(dados.getProduto()[pos].getDescricao());
		descricaoProdP.setFont(new Font("Arial",Font.BOLD,20));
		descricaoProdP.setBounds(10,110,200,50);
		
		tamanhoP = new JLabel("Tamanho: "+dados.getProduto()[pos].getCategoria().getTamanhoProduto());
		tamanhoP.setFont(new Font("Arial", Font.BOLD,20));
		tamanhoP.setBounds(10,145,200,50);
		
		catSexP = new JLabel("Sexo: "+dados.getProduto()[pos].getCategoria().getClassificaçaoProdutoSexo());
		catSexP.setFont(new Font("Arial", Font.BOLD,20));
		catSexP.setBounds(10,180,200,50);
		
		catProdEtaP = new JLabel("Idade: "+dados.getProduto()[pos].getCategoria().getClassificaçaoProdutoEtaria());
		catProdEtaP.setFont(new Font("Arial", Font.CENTER_BASELINE,20));
		catProdEtaP.setBounds(10,215,200,50);
		
		comprar1.setBounds(170,50,100,30);
		comprar1.addActionListener(this);
		saida1.setBounds(170,250,100,30);
		saida1.addActionListener(this);
		
		telaProduto.add(comprar1);
		telaProduto.add(catProdEtaP);
		telaProduto.add(catSexP);
		telaProduto.add(tamanhoP);
		telaProduto.add(descricaoProdP);
		telaProduto.add(prodMarcaP);
		telaProduto.add(tituloProduto2);
		telaProduto.add(saida1);
		telaProduto.add(precoP);
		
		telaProduto.setSize(300,330);
		telaProduto.setVisible(true);
		
	}
	
	/** 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * @param p é um parâmetro que  referencia a classe PesquisarProduto
	 * @param pos é um inteiro que serve para implementar a posição do vetor
	 * 
	 */
	public void ComprarTela2(ControleDados d , PesquisarProduto p,int pos) {
		dados=d;
		posicao=pos;
		
		telaProduto.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		telaProduto.setLayout(null);
		tituloProduto2 = new JLabel(dados.getProduto()[pos].getNomeproduto());
		tituloProduto2.setFont(new Font("Arial",Font.BOLD,20));
		tituloProduto2.setBounds(100,0,380,50);
		
		precoP = new JLabel("R$"+String.valueOf(dados.getProduto()[pos].getPreco()));
		precoP.setFont(new Font("Arial",Font.BOLD,40));
		precoP.setBounds(10,55,380,50);
		
		prodMarcaP = new JLabel("Marca: "+dados.getProduto()[pos].getMarca());
		prodMarcaP.setFont(new Font("Arial",Font.BOLD,20));
		prodMarcaP.setBounds(10,90,380,50);
		
		descricaoProdP = new JLabel(dados.getProduto()[pos].getDescricao());
		descricaoProdP.setFont(new Font("Arial",Font.BOLD,20));
		descricaoProdP.setBounds(10,110,200,50);
		
		tamanhoP = new JLabel("Tamanho: "+dados.getProduto()[pos].getCategoria().getTamanhoProduto());
		tamanhoP.setFont(new Font("Arial", Font.BOLD,20));
		tamanhoP.setBounds(10,145,200,50);
		
		catSexP = new JLabel("Sexo: "+dados.getProduto()[pos].getCategoria().getClassificaçaoProdutoSexo());
		catSexP.setFont(new Font("Arial", Font.BOLD,20));
		catSexP.setBounds(10,180,200,50);
		
		catProdEtaP = new JLabel("Idade: "+dados.getProduto()[pos].getCategoria().getClassificaçaoProdutoEtaria());
		catProdEtaP.setFont(new Font("Arial", Font.CENTER_BASELINE,20));
		catProdEtaP.setBounds(10,215,200,50);
		
		
		saida1.setBounds(170,250,100,30);
		saida1.addActionListener(this);
		
		
		telaProduto.add(catProdEtaP);
		telaProduto.add(catSexP);
		telaProduto.add(tamanhoP);
		telaProduto.add(descricaoProdP);
		telaProduto.add(prodMarcaP);
		telaProduto.add(tituloProduto2);
		telaProduto.add(saida1);
		telaProduto.add(precoP);
		
		telaProduto.setSize(300,330);
		telaProduto.setVisible(true);
		
	}
	 /** 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * @param p é um parâmetro que  referencia a classe PesquisarProduto
	 * @param pos é um inteiro que serve para implementar a posição do vetor
	 * 
	 */
	public void ComprarTela3(ControleDados d , PesquisarProduto p,int pos) {
		dados=d;
		posicao=pos;
		
		telaProduto.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		telaProduto.setLayout(null);
		tituloProduto2 = new JLabel(dados.getProduto()[pos].getNomeproduto());
		tituloProduto2.setFont(new Font("Arial",Font.BOLD,20));
		tituloProduto2.setBounds(100,0,380,50);
		
		precoP = new JLabel("R$"+String.valueOf(dados.getProduto()[pos].getPreco()));
		precoP.setFont(new Font("Arial",Font.BOLD,40));
		precoP.setBounds(10,55,380,50);
		
		prodMarcaP = new JLabel("Marca: "+dados.getProduto()[pos].getMarca());
		prodMarcaP.setFont(new Font("Arial",Font.BOLD,20));
		prodMarcaP.setBounds(10,90,380,50);
		
		descricaoProdP = new JLabel(dados.getProduto()[pos].getDescricao());
		descricaoProdP.setFont(new Font("Arial",Font.BOLD,20));
		descricaoProdP.setBounds(10,110,200,50);
		
		tamanhoP = new JLabel("Tamanho: "+dados.getProduto()[pos].getCategoria().getTamanhoProduto());
		tamanhoP.setFont(new Font("Arial", Font.BOLD,20));
		tamanhoP.setBounds(10,145,200,50);
		
		catSexP = new JLabel("Sexo: "+dados.getProduto()[pos].getCategoria().getClassificaçaoProdutoSexo());
		catSexP.setFont(new Font("Arial", Font.BOLD,20));
		catSexP.setBounds(10,180,200,50);
		
		catProdEtaP = new JLabel("Idade: "+dados.getProduto()[pos].getCategoria().getClassificaçaoProdutoEtaria());
		catProdEtaP.setFont(new Font("Arial", Font.CENTER_BASELINE,20));
		catProdEtaP.setBounds(10,215,200,50);
		
		comprar2.setBounds(170,50,100,30);
		saida1.setBounds(170,250,100,30);
		saida1.addActionListener(this);
		comprar2.addActionListener(this);
		telaProduto.add(comprar2);
		telaProduto.add(catProdEtaP);
		telaProduto.add(catSexP);
		telaProduto.add(tamanhoP);
		telaProduto.add(descricaoProdP);
		telaProduto.add(prodMarcaP);
		telaProduto.add(tituloProduto2);
		telaProduto.add(saida1);
		telaProduto.add(precoP);
		
		telaProduto.setSize(300,330);
		telaProduto.setVisible(true);
		
	}
	


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src==saida1) {
			descricaoProdP.setText("");
			prodMarcaP.setText("");
			tituloProduto2.setText("");
			precoP.setText("");
			tamanhoP.setText("");
			catSexP.setText("");
			catProdEtaP.setText("");
			telaProduto.dispose();
			comprar1.removeActionListener(this);
			comprar2.removeActionListener(this);
		}
		
		if(src==comprar1) {
			 JOptionPane.showMessageDialog(null, "Parabens pela compra !!!");
		}
		
		if(src==comprar2) {
			 JOptionPane.showMessageDialog(null, "Parabens pela compra !!!");
		}
		
	}
}
