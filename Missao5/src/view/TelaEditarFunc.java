package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControleDados;

public class TelaEditarFunc implements ActionListener {
	
	private static JFrame telaFunc = new JFrame();
	private static JLabel tituloFunc =new JLabel("Editor do funcionario") ;
	private static JLabel iDFunc = new JLabel("Novo iD:");
	private static JTextField iDText ;
	private static JLabel nomeFunc = new JLabel("Nome do func:");
	private static JTextField nomeText;
	private static JLabel senhaFunc = new JLabel("Senha do func:");
	private static JTextField senhaText ;
	private static JLabel cepFunc = new JLabel("CEP:");
	private static JTextField cepText ;
	private static JLabel ruaFunc = new JLabel("Rua :");
	private static JTextField ruaText ;
	private static JLabel compleFunc= new JLabel("Complemento:");
	private static JTextField compleText ;
	private static JLabel numFunc = new JLabel("Num:");
	private static JTextField numText ;
	private static JButton salvar = new JButton("Salvar");
	private static ControleDados dados;
	private String[] novoDado = new String[13];
	private int posicao;
	
	public void RegistrarFunc(ControleDados d,TelaFunc2 t , int pos) {
		dados = d;
		posicao=pos;
		telaFunc.setLayout(null);
		
		
		tituloFunc.setBounds(40,0,380,50);
		tituloFunc.setFont(new Font("Arial",Font.BOLD,20));
		telaFunc.add(tituloFunc);
		
		iDFunc.setBounds(10,50,100,30);
		telaFunc.add(iDFunc);
		iDText = new JTextField(dados.getFuncionario()[pos].getIdentificador());
		iDText.setBounds(70,55,260,25);
		telaFunc.add(iDText);
		
		nomeFunc.setBounds(10,90,100,30);
		telaFunc.add(nomeFunc);
		nomeText = new JTextField(dados.getFuncionario()[pos].getNome());
		nomeText.setBounds(100,95,230,25);
		
		telaFunc.add(nomeText);
		
		senhaFunc.setBounds(10, 130, 100, 30);
		telaFunc.add(senhaFunc);
		senhaText = new JTextField(dados.getFuncionario()[pos].getSenha());
		senhaText.setBounds(100,135,230,25);
		
		telaFunc.add(senhaText);
		
		cepFunc.setBounds(10,170,100,30);
		telaFunc.add(cepFunc);
		cepText = new JTextField(dados.getFuncionario()[pos].getEndereço().getCep());
		cepText.setBounds(50,175,130,25);
		
		telaFunc.add(cepText);
		
		numFunc.setBounds(190,170,100,30);
		telaFunc.add(numFunc);
		numText = new JTextField(dados.getFuncionario()[pos].getEndereço().getNumero());
		numText.setBounds(225,175,80,25);
		
		telaFunc.add(numText);
		
		ruaFunc.setBounds(10,220,100,30);
		telaFunc.add(ruaFunc);
		ruaText = new JTextField(dados.getFuncionario()[pos].getEndereço().getRua());
		ruaText.setBounds(50,225,230,25);
		
		telaFunc.add(ruaText);
		
		compleFunc.setBounds(10,260,100,30);
		telaFunc.add(compleFunc);
		compleText = new JTextField(dados.getFuncionario()[pos].getEndereço().getComplemento());
		compleText.setBounds(100,265,100,25);
		
		telaFunc.add(compleText);
		
		salvar.setBounds(220,265,100,40);
		telaFunc.add(salvar);
		salvar.addActionListener(this);
		
		telaFunc.setSize(350,350);
		telaFunc.setVisible(true);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == salvar) {
			
			boolean res;
			novoDado[0] = Integer.toString(posicao);
			novoDado[1] = nomeText.getText();
			novoDado[2] = iDText.getText();
			novoDado[3] = senhaText.getText();
			novoDado[4] = cepText.getText();
			novoDado[5] = ruaText.getText();
			novoDado[6] = numText.getText();
			novoDado[7] = compleText.getText();
			
			res=dados.inserirEditarFunc(novoDado);
			
			if(res == true) {
				mensagemSucessoCadastro();
			}
		}
		
	}
	
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		telaFunc.dispose();
	}
}