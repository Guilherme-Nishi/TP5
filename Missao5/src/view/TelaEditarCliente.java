package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import controle.ControleDados;

/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface de edição do cliente
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 * 
 *
 *
 * 
 */
public class TelaEditarCliente implements ActionListener{

	private static JFrame telaRegistro = new JFrame();  
	private static JLabel tituloCli ;
	private static JLabel userName = new JLabel("Nome: ") ;
	private static JTextField nameText ;
	private static JLabel userEmail = new JLabel("Email: ") ;
	private static JTextField emailText ;
	private static JLabel userPass = new JLabel("Senha: ") ;
	private static JTextField passText ;
	private static JLabel userCep = new JLabel("CEP: ") ;
	private static JTextField cepText ;
	private static JLabel userRua = new JLabel("Rua: ");
	private static JTextField ruaText ;
	private static JLabel userNum = new JLabel("Num: ") ;
	private static JTextField numText ;
	private static JLabel userComple = new JLabel("Complemento :");
	private static JTextField compleText  ;
	private static JLabel cardNum = new JLabel("Num do cartão :") ;
	private static JTextField numCardText ;
	private static JLabel cardName = new JLabel("Nome no cartão :") ;
	private static JTextField nameCardText;
	private static JLabel cardCvc = new JLabel("CVC");
	private static JTextField cvcCardText ;
	private static JLabel cardData  = new JLabel("Data:");
	private static JTextField dataCardText ;
	private static JButton Salvar = new JButton("Salvar") ;
	private static JButton Saida = new JButton("Sair");
	private String[] novoDado2 = new String[13];
	private static ControleDados dados;
	private int posicao;
	
	/**
	 * Esta classe implementa a interface do Edição do cliente. 
	 * Ela contem uma interface de edição para editar os dados da classe Cliente.
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * @param r é um parâmetro que  referencia a classe TelaListaCons
	 * @param pos é um inteiro que serve para implementar a posição do vetor
	 * 
	 */
	public void RegisterView1(ControleDados d, TelaListaCons r,int pos){
		dados=d;
		posicao=pos;
		
		telaRegistro.setLayout(null);
		tituloCli = new JLabel(dados.getCliente()[pos].getNome());
		tituloCli.setFont(new Font("Arial",Font.BOLD,20));
		tituloCli.setBounds(150,0,380,50);
		telaRegistro.add(tituloCli);
		
		userName.setBounds(10,40,100,60);
		userName.setFont(new Font("Arial",Font.BOLD,12));
		telaRegistro.add(userName);
		nameText = new JTextField(dados.getCliente()[pos].getNome());
		nameText.setBounds(130,55,330,27);
		telaRegistro.add(nameText);
		
		userEmail.setBounds(35,85,100,60);
		telaRegistro.add(userEmail);
		emailText = new JTextField(dados.getCliente()[pos].getEmail());
		emailText.setBounds(130,100,330,27);
		telaRegistro.add(emailText);
		
		userPass.setBounds(20,140,100,60);
		telaRegistro.add(userPass);
		passText =  new JTextField(dados.getCliente()[pos].getSenha());
		passText.setBounds(130,155,163,27);
		telaRegistro.add(passText);
		
		userCep.setBounds(10,205,50,60);
		telaRegistro.add(userCep);
		cepText = new JTextField(dados.getCliente()[pos].getEndereco().getCep());
		cepText.setBounds(50,220,163,27);
		telaRegistro.add(cepText);
		
		userRua.setBounds(250,205,50,60);
		telaRegistro.add(userRua);
		ruaText = new JTextField(dados.getCliente()[pos].getEndereco().getRua());
		ruaText.setBounds(300,220,163,27);
		telaRegistro.add(ruaText);
		
		userNum.setBounds(10,260,100,60);
		telaRegistro.add(userNum);
		numText = new JTextField(dados.getCliente()[pos].getEndereco().getNumero());
		numText.setBounds(50,280,100,27);
		telaRegistro.add(numText);
		
		userComple.setBounds(200,260,100,60);
		telaRegistro.add(userComple);
		compleText = new JTextField(dados.getCliente()[pos].getEndereco().getComplemento());
		compleText.setBounds(300,275,163,27);
		telaRegistro.add(compleText);
		
		cardName.setBounds(30,310,130,60);
		telaRegistro.add(cardName);
		nameCardText = new JTextField(dados.getCliente()[pos].getCartao().getNomeCartao());
		nameCardText.setBounds(150,325,313,27);
		telaRegistro.add(nameCardText);
		
		cardNum.setBounds(30,360,100,60);
		telaRegistro.add(cardNum);
		numCardText = new JTextField(dados.getCliente()[pos].getCartao().getNomeCartao());
		numCardText.setBounds(150,375,313,27);
		telaRegistro.add(numCardText);
		
		cardCvc.setBounds(260, 410, 80, 60);
		telaRegistro.add(cardCvc);
		cvcCardText = new JTextField(dados.getCliente()[pos].getCartao().getNomeCartao());
		cvcCardText.setBounds(300,425,163,27);
		telaRegistro.add(cvcCardText);
		
		cardData.setBounds(10,410,80,60);
		telaRegistro.add(cardData);
		dataCardText = new JTextField(dados.getCliente()[pos].getCartao().getDataVenc());
		dataCardText.setBounds(50,425,100,27);
		telaRegistro.add(dataCardText);
		
		
		Salvar.setBounds(20,475,150,50);
		Saida.setBounds(325,475,150,50);
		Saida.addActionListener(this);
		telaRegistro.add(Saida);
		telaRegistro.add(Salvar);
		Salvar.addActionListener(this);
		
		
		telaRegistro.setVisible(true);
		telaRegistro.setSize(500,570);
		
		
	}
	/**
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * @param r é um parâmetro que  referencia a classe PesquisaCliente
	 * @param pos é um inteiro que serve para implementar a posição do vetor
	 * 
	 */
	public void RegisterView2(ControleDados d, PesquisaCliente r,int pos){
		dados=d;
		posicao=pos;
		
		telaRegistro.setLayout(null);
		tituloCli = new JLabel(dados.getCliente()[pos].getNome());
		tituloCli.setFont(new Font("Arial",Font.BOLD,20));
		tituloCli.setBounds(150,0,380,50);
		telaRegistro.add(tituloCli);
		
		userName.setBounds(10,40,100,60);
		userName.setFont(new Font("Arial",Font.BOLD,12));
		telaRegistro.add(userName);
		nameText = new JTextField(dados.getCliente()[pos].getNome());
		nameText.setBounds(130,55,330,27);
		telaRegistro.add(nameText);
		
		userEmail.setBounds(35,85,100,60);
		telaRegistro.add(userEmail);
		emailText = new JTextField(dados.getCliente()[pos].getEmail());
		emailText.setBounds(130,100,330,27);
		telaRegistro.add(emailText);
		
		userPass.setBounds(20,140,100,60);
		telaRegistro.add(userPass);
		passText =  new JTextField(dados.getCliente()[pos].getSenha());
		passText.setBounds(130,155,163,27);
		telaRegistro.add(passText);
		
		userCep.setBounds(10,205,50,60);
		telaRegistro.add(userCep);
		cepText = new JTextField(dados.getCliente()[pos].getEndereco().getCep());
		cepText.setBounds(50,220,163,27);
		telaRegistro.add(cepText);
		
		userRua.setBounds(250,205,50,60);
		telaRegistro.add(userRua);
		ruaText = new JTextField(dados.getCliente()[pos].getEndereco().getRua());
		ruaText.setBounds(300,220,163,27);
		telaRegistro.add(ruaText);
		
		userNum.setBounds(10,260,100,60);
		telaRegistro.add(userNum);
		numText = new JTextField(dados.getCliente()[pos].getEndereco().getNumero());
		numText.setBounds(50,280,100,27);
		telaRegistro.add(numText);
		
		userComple.setBounds(200,260,100,60);
		telaRegistro.add(userComple);
		compleText = new JTextField(dados.getCliente()[pos].getEndereco().getComplemento());
		compleText.setBounds(300,275,163,27);
		telaRegistro.add(compleText);
		
		cardName.setBounds(30,310,130,60);
		telaRegistro.add(cardName);
		nameCardText = new JTextField(dados.getCliente()[pos].getCartao().getNomeCartao());
		nameCardText.setBounds(150,325,313,27);
		telaRegistro.add(nameCardText);
		
		cardNum.setBounds(30,360,100,60);
		telaRegistro.add(cardNum);
		numCardText = new JTextField(dados.getCliente()[pos].getCartao().getNomeCartao());
		numCardText.setBounds(150,375,313,27);
		telaRegistro.add(numCardText);
		
		cardCvc.setBounds(260, 410, 80, 60);
		telaRegistro.add(cardCvc);
		cvcCardText = new JTextField(dados.getCliente()[pos].getCartao().getNomeCartao());
		cvcCardText.setBounds(300,425,163,27);
		telaRegistro.add(cvcCardText);
		
		cardData.setBounds(10,410,80,60);
		telaRegistro.add(cardData);
		dataCardText = new JTextField(dados.getCliente()[pos].getCartao().getDataVenc());
		dataCardText.setBounds(50,425,100,27);
		telaRegistro.add(dataCardText);
		
		
		Salvar.setBounds(20,475,150,50);
		Saida.setBounds(325,475,150,50);
		Saida.addActionListener(this);
		telaRegistro.add(Saida);
		telaRegistro.add(Salvar);
		Salvar.addActionListener(this);
		
		
		telaRegistro.setVisible(true);
		telaRegistro.setSize(500,570);
		
		
	}
	
	public void actionPerformed(ActionEvent e ) {
		Object src = e.getSource();
		
		if(src==Salvar) {
			
			if(nameText.getText()==null||nameText.getText().trim().equals("")||numText.getText()==null||numText.getText().trim().equals("")||
					emailText.getText()==null||emailText.getText().trim().equals("")||
				passText.getText()==null||cepText.getText().trim().equals("")|| cepText.getText()==null||ruaText.getText()==null||ruaText.getText().trim().equals("")||
				compleText.getText()==null||compleText.getText().trim().equals("")||nameCardText.getText()==null||nameCardText.getText().trim().equals("")
				||numCardText.getText()==null||numCardText.getText().trim().equals("")||cvcCardText.getText().trim().equals("")||cvcCardText.getText()==null||
				dataCardText.getText().trim().equals("")||dataCardText.getText()==null||passText.getText()==null||passText.getText().trim().equals("")) {
				
				 JOptionPane.showMessageDialog(null, "Voce precisa preencher todas as informacoes");
			}else {
				boolean ser;
				
				novoDado2[0] = Integer.toString(posicao);
				novoDado2[1] = nameText.getText();
				novoDado2[2] = emailText.getText();
				novoDado2[3] = passText.getText();
				novoDado2[4] = cepText.getText();
				novoDado2[5] =  ruaText.getText();
				novoDado2[6] = numText.getText();
				novoDado2[7] = compleText.getText();
				novoDado2[8] = nameCardText.getText();
				novoDado2[9]= cvcCardText.getText();
				novoDado2[10] = numCardText.getText();
				novoDado2[11] = dataCardText.getText();
				ser = dados.inserirEditarCliente(novoDado2);
				
				nameText.setText("");
				  emailText.setText("");
				 passText.setText("");
				 cepText.setText("");
				  ruaText.setText("");
				 numText.setText("");
				compleText.setText("");
				 nameCardText.setText("");
				 cvcCardText.setText("");
				 numCardText.setText("");
				 dataCardText.setText("");
				tituloCli.setText("");
				 
				if(ser==true) {
					mensagemSucessoCadastro();
					
				}
			}
		}
					
			if(src == Saida) {
				
				
				
				
				telaRegistro.dispose();
			}
			
				
		}
	/**
	 * Esse método exibirá uma mensagem de sucesso ao salvar os dados
	 *
	 *
	 *
	 * 
	 */
			public void mensagemSucessoCadastro() {
				JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
						JOptionPane.INFORMATION_MESSAGE);
				telaRegistro.dispose();
			}
			/**
			 * Esse método Tem como função fazer a interface sair da tela de edição
			 *
			 *@param pos é um inteiro que armazena a posição no vetor
			 *
			 * 
			 */
			public void Sair(int pos) {
				tituloCli = new JLabel(dados.getCliente()[pos].getNome());
				nameText = new JTextField(dados.getCliente()[pos].getNome());
			}

			
	}