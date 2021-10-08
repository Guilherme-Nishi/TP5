package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface de lista dos Produtos
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 *
 *
 * 
 */
public class TelaListaCompras implements ActionListener, ListSelectionListener {		
	private JFrame janelaLista2;
	private JLabel tituloLista2;
	private JButton cadastroProduto2;
	private JButton refreshProduto2;
	private static ControleDados dados;
	private JList<String> listaProdutosCadastrados2;
	private String[] listaNomes2 = new String[50];
	/**
	 * Esta classe implementa a interface de lista dos produtos. 
	 * Ela contem uma interface de listar o nome dos produtos da classe produto
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * 
	 * 
	 */
	public void ListaProdutosCliente(ControleDados d) {
		dados=d;
		Color minhaCor4 = new Color(192, 192, 192);
		listaNomes2 = new ControleProduto(dados).getNomeProduto();
		listaProdutosCadastrados2 = new JList <String> (listaNomes2);
		janelaLista2 = new JFrame("Lista de Produtos") ;
		tituloLista2 = new JLabel("Escolha seu produto");
		
		refreshProduto2 = new JButton("Atualizar");
		
		tituloLista2.setFont(new Font("Arial", Font.BOLD, 20));
		tituloLista2.setBounds(90, 10, 250, 30);
		listaProdutosCadastrados2.setBounds(20, 50, 340, 250);
		listaProdutosCadastrados2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaProdutosCadastrados2.setVisibleRowCount(10);
		listaProdutosCadastrados2.addListSelectionListener(this);
		
		
		refreshProduto2.setBounds(100, 320, 200, 30);

		janelaLista2.setLayout(null);

		janelaLista2.add(tituloLista2);
		janelaLista2.add(listaProdutosCadastrados2);
		janelaLista2.add(refreshProduto2);
		janelaLista2.setLocationRelativeTo(null);
		
		refreshProduto2.addActionListener(this);
		
		janelaLista2.setSize(400, 400);
		janelaLista2.setVisible(true);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == listaProdutosCadastrados2) {
			new TelaProduto().ComprarTela(dados, this, listaProdutosCadastrados2.getSelectedIndex());
		}
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == refreshProduto2) {
			listaProdutosCadastrados2.setListData(new ControleProduto(dados).getNomeProduto());			
			listaProdutosCadastrados2.updateUI();
		}
		
		
		
	}



}