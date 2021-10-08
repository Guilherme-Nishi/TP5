package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface de lista de venda
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 *
 *
 * 
 */
public class TelaListaVendas implements ActionListener, ListSelectionListener {		
	private JFrame janelaListaV;
	private JLabel tituloListaV;
	private JButton cadastroVenda;
	private JButton refreshVenda;
	private static ControleDados dados;
	private JList<String> listaVendasCadastradas;
	private String[] listaNomesV = new String[50];
	/**
	 * Esta classe implementa a interface de lista das vendas. 
	 * Ela contem uma interface de listar as vendas da classe Venda
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * 
	 * 
	 *
	 * 
	 */
	public void ListaProdutos(ControleDados d) {
		dados=d;
		Color minhaCor4 = new Color(192, 192, 192);
		listaNomesV = new ControleVendas(dados).getNomeVenda();
		listaVendasCadastradas = new JList <String> (listaNomesV);
		janelaListaV = new JFrame("Lista de Vendas") ;
		tituloListaV = new JLabel("Lista de Vendas");
		cadastroVenda = new JButton("Cadastrar nova venda");
		refreshVenda = new JButton("Atualizar");
		
		tituloListaV.setFont(new Font("Arial", Font.BOLD, 20));
		tituloListaV.setBounds(90, 10, 250, 30);
		listaVendasCadastradas.setBounds(20, 50, 340, 250);
		listaVendasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaVendasCadastradas.setVisibleRowCount(10);
		listaVendasCadastradas.addListSelectionListener(this);
		
		cadastroVenda.setBounds(70, 330, 100, 30);
		refreshVenda.setBounds(200, 330, 100, 30);

		janelaListaV.setLayout(null);

		janelaListaV.add(tituloListaV );
		janelaListaV.add(listaVendasCadastradas);
		janelaListaV.add(cadastroVenda);
		janelaListaV.add(refreshVenda);
		janelaListaV.setLocationRelativeTo(null);
		
		refreshVenda.addActionListener(this);
		cadastroVenda.addActionListener(this);
		janelaListaV.setSize(400, 400);
		janelaListaV.setVisible(true);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == listaVendasCadastradas) {
			new TelaVenda().TelaVenda1(dados, this, listaVendasCadastradas.getSelectedIndex());
		}
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == refreshVenda) {
			listaVendasCadastradas.setListData(new ControleVendas(dados).getNomeVenda());			
			listaVendasCadastradas.updateUI();
		}
		
		if(src==cadastroVenda) {
			new CadastroVenda().TelaCadastroVendas(dados, this);

		}
		
	}



}