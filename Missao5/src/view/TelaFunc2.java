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
 * Esta classe implementa a interface do funcionário
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 *
 *
 * 
 */
public class TelaFunc2 implements ActionListener{
	private static JFrame telaFunc = new JFrame();
	private static JLabel tituloFunc2;
	private static JLabel nomeF;
	private static JLabel idF;
	private static JLabel senhaF;
	private static JLabel cepF;
	private static JLabel ruaF;
	private static JLabel compleF;
	private static JLabel numF;
	private static JButton saida1 = new JButton("Sair");
	private static JButton excluir = new JButton("Excluir");
	private static JButton editar = new JButton("Editar");
	private static ControleDados dados;
	private int posicao;
	
	/**
	 * Esta classe implementa a interface  funcionário. 
	 * Ela contem uma interface de r os dados da classe funcionário.
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * @param f é um parâmetro que  referencia a classe TelaListaFunc
	 * @param pos é um inteiro que serve para implementar a posição do vetor
	 * 
	 */
	public void TelaFunc (ControleDados d , TelaListaFunc f , int pos) {
		dados = d;
		posicao=pos;
		
		
		telaFunc.setLayout(null);
		telaFunc.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		tituloFunc2 = new JLabel(dados.getFuncionario()[pos].getNome());
		tituloFunc2.setFont(new Font("Arial",Font.BOLD,20));
		tituloFunc2.setBounds(70,0,380,50);
		telaFunc.add(tituloFunc2);
		
		nomeF = new JLabel("Nome: "+dados.getFuncionario()[pos].getNome());
		nomeF.setBounds(10,40,200,30);
		telaFunc.add(nomeF);
		
		idF = new JLabel("ID :" + dados.getFuncionario()[pos].getIdentificador());
		idF.setBounds(10,70,200,30);
		telaFunc.add(idF);
		
		senhaF = new JLabel("Senha: "+dados.getFuncionario()[pos].getSenha());
		senhaF.setBounds(10,100,200,30);
		telaFunc.add(senhaF);
		
		cepF = new JLabel("CEP: "+ dados.getFuncionario()[pos].getEndereço().getCep());
		cepF.setBounds(10,130,200,30);
		telaFunc.add(cepF);
		
		ruaF=new JLabel(dados.getFuncionario()[pos].getEndereço().getRua());
		ruaF.setBounds(10,160,200,30);
		telaFunc.add(ruaF);
		
		compleF = new JLabel("Complemeto: "+dados.getFuncionario()[pos].getEndereço().getComplemento());
		compleF.setBounds(10,190,200,30);
		telaFunc.add(compleF);
		
		numF = new JLabel("Num: "+dados.getFuncionario()[pos].getEndereço().getNumero());
		numF.setBounds(10,220,200,30);
		telaFunc.add(numF);
		
		editar.setBounds(30 , 250,100,30);
		editar.addActionListener(this);
		
		saida1.setBounds(150,250,100,30);
		saida1.addActionListener(this);
		
		excluir.setBounds(150,100,100,30);
		excluir.addActionListener(this);
		telaFunc.add(saida1);
		telaFunc.add(excluir);
		telaFunc.add(editar);
		
		
		
		
		
		
		
		telaFunc.setVisible(true);
		telaFunc.setSize(300,330);
		
	}


	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == saida1) {
			tituloFunc2.setText("");
			nomeF.setText("");
			idF.setText("");
			senhaF.setText("");
			cepF.setText("");
			ruaF.setText("");
			compleF.setText("");
			numF.setText("");
			
			telaFunc.dispose();
		}
		
		if(src == excluir) {
			boolean test= false;
			
			test=dados.removerF(posicao);
			if(test==true)
				mensagemSucessoExclusao() ;
		}
		
		if(src == editar) {
			new TelaEditarFunc().RegistrarFunc(dados, this, posicao);
		}
		
	}
	
	/**
	 * Esse método exibirá uma mensagem de erro ao salvar os dados
	 *
	 *
	 *
	 * 
	 */
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		telaFunc.dispose();
	}
}