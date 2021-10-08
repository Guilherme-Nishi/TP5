package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface de lista dos funcionários
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 *
 *
 * 
 */
public class TelaListaFunc implements ActionListener, ListSelectionListener {		
	private JFrame janelaLista2;
	private JLabel tituloLista2;
	private JButton cadastroFunc;
	private JButton refreshFunc;
	private static ControleDados dados;
	private JList<String> listaFuncionariosCadastrados;
	private String[] listaNomesFunc = new String[50];
	/**
	 * Esta classe implementa a interface de lista dos funcionários. 
	 * Ela contem uma interface de listar o nome dos clientes da classe Funcionário
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * 
	 * 
	 */
	
	public void ListaFunc(ControleDados d) {
		dados=d;
		
		listaNomesFunc = new ControleFuncionario(dados).getNomeFunc();
		listaFuncionariosCadastrados = new JList <String> (listaNomesFunc);
		janelaLista2 = new JFrame("Lista de Funcionarios") ;
		tituloLista2 = new JLabel("Lista de Funcionarios");
		
		refreshFunc = new JButton("Atualizar");
		cadastroFunc = new JButton("Cadastrar");
		
		tituloLista2.setFont(new Font("Arial", Font.BOLD, 20));
		tituloLista2.setBounds(90, 10, 250, 30);
		listaFuncionariosCadastrados.setBounds(20, 50, 340, 250);
		listaFuncionariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaFuncionariosCadastrados.setVisibleRowCount(10);
		listaFuncionariosCadastrados.addListSelectionListener(this);
		
		refreshFunc.setBounds(280, 330, 100, 30);
		cadastroFunc.setBounds(10,330,100,30);
		
		janelaLista2.setLayout(null);

		janelaLista2.add(tituloLista2);
		janelaLista2.add(listaFuncionariosCadastrados);
		
		janelaLista2.add(refreshFunc);
		janelaLista2.add(cadastroFunc);
		janelaLista2.setLocationRelativeTo(null);
		
		cadastroFunc.addActionListener(this);
		refreshFunc.addActionListener(this);
		janelaLista2.setSize(400, 400);
		janelaLista2.setVisible(true);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == listaFuncionariosCadastrados) {
			new TelaFunc2().TelaFunc(dados, this, listaFuncionariosCadastrados.getSelectedIndex());
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == refreshFunc) {
			listaFuncionariosCadastrados.setListData(new ControleFuncionario(dados).getNomeFunc());			
			listaFuncionariosCadastrados.updateUI();
		}
		
		if(src == cadastroFunc) {
			new TelaRegisterFunc().RegistrarFunc(dados);
		}
	}



}