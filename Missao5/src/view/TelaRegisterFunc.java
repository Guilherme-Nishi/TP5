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
/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface de registro dos funcionários
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 *
 *
 * 
 */
public class TelaRegisterFunc implements ActionListener {
	
	private static JFrame telaFunc = new JFrame();
	private static JLabel tituloFunc = new JLabel("Cadastro de funcionarios");
	private static JLabel iDFunc = new JLabel("Novo iD:");
	private static JTextField iDText = new JTextField();
	private static JLabel nomeFunc = new JLabel("Nome do func:");
	private static JTextField nomeText = new JTextField();
	private static JLabel senhaFunc = new JLabel("Senha do func:");
	private static JTextField senhaText = new JTextField();
	private static JLabel cepFunc = new JLabel("CEP:");
	private static JTextField cepText = new JTextField();
	private static JLabel ruaFunc = new JLabel("Rua :");
	private static JTextField ruaText = new JTextField();
	private static JLabel compleFunc= new JLabel("Complemento:");
	private static JTextField compleText = new JTextField();
	private static JLabel numFunc = new JLabel("Num:");
	private static JTextField numText = new JTextField();
	private static JButton cadastro = new JButton("Salvar");
	private static ControleDados dados;
	private String[] novoDado = new String[13];
	/**
	 * Esta classe implementa a interface do registro do funcionário. 
	 * Ela contem uma interface de registro para registrar os dados da classe Funcionário.
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * 
	 * 
	 */
	public void RegistrarFunc(ControleDados d) {
		dados = d;
		telaFunc.setLayout(null);
		
		tituloFunc.setBounds(40,0,380,50);
		tituloFunc.setFont(new Font("Arial",Font.BOLD,20));
		telaFunc.add(tituloFunc);
		
		iDFunc.setBounds(10,50,100,30);
		telaFunc.add(iDFunc);
		iDText.setBounds(70,55,260,25);
		telaFunc.add(iDText);
		
		nomeFunc.setBounds(10,90,100,30);
		telaFunc.add(nomeFunc);
		nomeText.setBounds(100,95,230,25);
		telaFunc.add(nomeText);
		
		senhaFunc.setBounds(10, 130, 100, 30);
		telaFunc.add(senhaFunc);
		senhaText.setBounds(100,135,230,25);
		telaFunc.add(senhaText);
		
		cepFunc.setBounds(10,170,100,30);
		telaFunc.add(cepFunc);
		cepText.setBounds(50,175,130,25);
		telaFunc.add(cepText);
		
		numFunc.setBounds(190,170,100,30);
		telaFunc.add(numFunc);
		numText.setBounds(225,175,80,25);
		telaFunc.add(numText);
		
		ruaFunc.setBounds(10,220,100,30);
		telaFunc.add(ruaFunc);
		ruaText.setBounds(50,225,230,25);
		telaFunc.add(ruaText);
		
		compleFunc.setBounds(10,260,100,30);
		telaFunc.add(compleFunc);
		compleText.setBounds(100,265,100,25);
		telaFunc.add(compleText);
		
		cadastro.setBounds(220,265,100,40);
		telaFunc.add(cadastro);
		cadastro.addActionListener(this);
		
		telaFunc.setSize(350,350);
		telaFunc.setVisible(true);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastro) {
			
			boolean res;
			novoDado[0] = Integer.toString(dados.getqtdFunc());
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
	/**
	 * Esse método exibirá uma mensagem de dados salvos com sucesso
	 *
	 *
	 *
	 * 
	 */
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		telaFunc.dispose();
	}
}