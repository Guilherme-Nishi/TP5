package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface de lista dos clientes
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 *
 *
 * 
 */
public class TelaListaCons implements ActionListener, ListSelectionListener {		
	private JFrame janelaLista2;
	private JLabel tituloLista2;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private static ControleDados dados;
	private JList<String> listaClientesCadastrados;
	private String[] listaNomesClie = new String[50];
	/**
	 * Esta classe implementa a interface de lista dos clientes. 
	 * Ela contem uma interface de listar o nome dos clientes da classe Cliente
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * 
	 * 
	 */
	
	public void ListaClientes(ControleDados d) {
		dados=d;
		
		listaNomesClie = new ControleCliente(dados).getNomeCliente();
		listaClientesCadastrados = new JList <String> (listaNomesClie);
		janelaLista2 = new JFrame("Lista de Clientes") ;
		tituloLista2 = new JLabel("Lista de Clientes");
		
		refreshCliente = new JButton("Atualizar");
		
		tituloLista2.setFont(new Font("Arial", Font.BOLD, 20));
		tituloLista2.setBounds(90, 10, 250, 30);
		listaClientesCadastrados.setBounds(20, 50, 340, 250);
		listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaClientesCadastrados.setVisibleRowCount(10);
		listaClientesCadastrados.addListSelectionListener(this);
		
		refreshCliente.setBounds(150, 330, 100, 30);

		janelaLista2.setLayout(null);

		janelaLista2.add(tituloLista2);
		janelaLista2.add(listaClientesCadastrados);
		
		janelaLista2.add(refreshCliente);
		janelaLista2.setLocationRelativeTo(null);
		
		refreshCliente.addActionListener(this);
		janelaLista2.setSize(400, 400);
		janelaLista2.setVisible(true);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new TelaEditarCliente().RegisterView1(dados, this, listaClientesCadastrados.getSelectedIndex());
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == refreshCliente) {
			listaClientesCadastrados.setListData(new ControleCliente(dados).getNomeCliente());			
			listaClientesCadastrados.updateUI();
		}
		
	}



}