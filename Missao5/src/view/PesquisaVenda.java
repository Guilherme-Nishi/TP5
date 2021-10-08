package view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import controle.ControleCliente;
import controle.ControleDados;
import controle.ControleProduto;
import controle.ControleVendas;

import java.util.*;
	 
	public class PesquisaVenda extends JFrame implements ActionListener , ListSelectionListener{
	
	private static JButton att = new JButton("Atualizar");
	JList lista;  
	 
	  private static ControleDados dados;
	  public void Pesquisa(ControleDados d) {
	   
	     dados = d;
	    Container c = getContentPane();
	    c.setLayout(null);
	     
	    
	    String vendas[] = new ControleVendas(dados).getNomeVenda();
	 
	   
	 
	   
	    lista = new JList(vendas);
	  
	
	    JLabel rotulo = new JLabel("Pesquisar na lista:");    
	    c.add(rotulo);
	    rotulo.setBounds(10, 5, 200, 20);
	    
	    att.setBounds(90,220,150,30);
	   
	    final JTextField pesquisa = new JTextField();    
	    pesquisa.getDocument().addDocumentListener(
	      new DocumentListener(){
	        public void insertUpdate(DocumentEvent e){
	          pesquisarLista(pesquisa.getText()); 
	        }
	    
	        public void removeUpdate(DocumentEvent e){
	          pesquisarLista(pesquisa.getText());  
	        }
	 
	        public void changedUpdate(DocumentEvent e){}
	      }
	    );   
	  
	    lista.addListSelectionListener(this);
	    
	    c.add(pesquisa);
	    pesquisa.setBounds(10, 27, 300, 20);
	 
	   
	    JScrollPane scroll = new JScrollPane(lista);
	    c.add(scroll);
	    scroll.setBounds(10, 49, 300, 150);  
	    
	    c.add(att);
	    att.addActionListener(this);
	    setSize(350, 300);
	    setVisible(true);
	  }
	   
	  
	 
	  public void pesquisarLista(String texto){
	    int pos = lista.getNextMatch(texto, 0, Position.Bias.Forward);
	    lista.setSelectedIndex(pos);
	    lista.ensureIndexIsVisible(pos);
	  }



	
	public void valueChanged(ListSelectionEvent e) {
		Object src  = e.getSource();
		
		if(e.getValueIsAdjusting() && src == lista) {
			new TelaVenda().TelaVenda2(dados, this, lista.getSelectedIndex());
		}
		
	}

	

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==att) {
			lista.setListData(new ControleVendas(dados).getNomeVenda());			
			lista.updateUI();
		
	}
	}
	}