package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.ControleDados;
/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa a interface de cadastro
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 *
 *
 * 
 */
public class TelaCadastroProdutos implements ActionListener{
	
	private static JFrame telaRegistroProdutos = new JFrame();
	private static JLabel tituloRegistroProdutos = new JLabel("Façaa o registro do produto");
	private static JLabel userNameProdutos = new JLabel("Nome do produto:");
	private static JTextField nameTextProdutos = new JTextField(20);
	private static JLabel precoProduto = new JLabel("Preço :");
	private static JTextField precoText = new JTextField(20);
	private static JLabel corProduto = new JLabel("Cor do produto:");
	private static JTextField corText = new JTextField(20);
	private static JLabel produtoEstoque = new JLabel("Quantidade em estoque:");
	private static JTextField estoqueText = new JTextField(20);
	private static JLabel tamanhoProduto = new JLabel("Tamanho do produto:");
	private static JTextField tamanhoText = new JTextField(20);
	private static JLabel produtoNum = new JLabel("Num:");
	private static JTextField produtoNumText = new JTextField(20);
	private static JLabel catSex = new JLabel("Categoria Sexo:");
	private static JTextField catSexText = new JTextField(20);
	private static JLabel catProdEta = new JLabel("Faixa Etária:");
	private static JTextField catEtaText = new JTextField(20);
	private static JLabel prodMarca = new JLabel("Marca do produto:");
	private static JTextField prodMarcaText = new JTextField(20);
	private static JLabel descricaoProd = new JLabel("Descrição:");
	private static JTextField descricaoProdText = new JTextField(20);
	private static ControleDados dados;
	private String[] novoDado = new String[13];
	
	
	private static JButton buttonRegisterProd = new JButton("Registrar");
	
	/**
	 * Esta classe implementa a interface de cadastro do produto. 
	 * Ela contem uma interface de cadastro para cadastrar os dados da classe Produto.
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * @param r é um parâmetro que  referencia a classe TelaFunc
	 * 
	 * 
	 */
	public void TelaCadastroProdutos1(ControleDados d , TelaFunc r) {

		dados=d;
		telaRegistroProdutos.setLayout(null);
		tituloRegistroProdutos.setFont(new Font("Arial",Font.BOLD,20));
		tituloRegistroProdutos.setBounds(120,0,380,50);
		telaRegistroProdutos.add(tituloRegistroProdutos);
		
		userNameProdutos.setBounds(10,40,110,60);
		userNameProdutos.setFont(new Font("Arial",Font.BOLD,12));
		telaRegistroProdutos.add(userNameProdutos);
		nameTextProdutos.setBounds(130,55,330,27);
		telaRegistroProdutos.add(nameTextProdutos);
		
		descricaoProd.setBounds(35,85,100,60);
		telaRegistroProdutos.add(descricaoProd);
		descricaoProdText.setBounds(130,100,330,27);
		telaRegistroProdutos.add(descricaoProdText);
		
		corProduto.setBounds(20,140,100,60);
		telaRegistroProdutos.add(corProduto);
		corText.setBounds(130,155,163,27);
		telaRegistroProdutos.add(corText);
		
		produtoEstoque.setBounds(10,205,150,60);
		telaRegistroProdutos.add(produtoEstoque);
		estoqueText.setBounds(158,220,70,27);
		telaRegistroProdutos.add(estoqueText);
		
		tamanhoProduto.setBounds(270,205,150,60);
		telaRegistroProdutos.add(tamanhoProduto);
		tamanhoText.setBounds(400,220,63,27);//463
		telaRegistroProdutos.add(tamanhoText);
		
		produtoNum.setBounds(10,260,100,60);
		telaRegistroProdutos.add(produtoNum);
		produtoNumText.setBounds(50,275,100,27);
		telaRegistroProdutos.add(produtoNumText);
		
		catSex.setBounds(200,260,100,60);
		telaRegistroProdutos.add(catSex);
		catSexText.setBounds(300,275,163,27);
		telaRegistroProdutos.add(catSexText);
		
		catProdEta.setBounds(10,310,130,60);
		telaRegistroProdutos.add(catProdEta);
		catEtaText.setBounds(90,325,100,27);
		telaRegistroProdutos.add(catEtaText);
		
		prodMarca.setBounds(220,310,110,60);
		telaRegistroProdutos.add(prodMarca);
		prodMarcaText.setBounds(330,325,133,27);
		telaRegistroProdutos.add(prodMarcaText);
		
		precoProduto.setBounds(10, 360, 80, 60);
		telaRegistroProdutos.add(precoProduto);
		precoText.setBounds(60,375,100,27);
		telaRegistroProdutos.add(precoText);
		
		
		
		buttonRegisterProd.setBounds(20,420,450,50);
		telaRegistroProdutos.add(buttonRegisterProd);
		
		
		
		telaRegistroProdutos.setVisible(true);
		telaRegistroProdutos.setSize(500,530);
		buttonRegisterProd.addActionListener(this);
		
	}
	
	public void TelaCadastroProdutos3(ControleDados d , TelaListaClientes x) {
		Color minhaCor2 = new Color(192, 192, 192);
				dados=d;
				telaRegistroProdutos.setLayout(null);
				tituloRegistroProdutos.setFont(new Font("Arial",Font.BOLD,20));
				tituloRegistroProdutos.setBounds(120,0,380,50);
				telaRegistroProdutos.add(tituloRegistroProdutos);
				
				userNameProdutos.setBounds(10,40,110,60);
				userNameProdutos.setFont(new Font("Arial",Font.BOLD,12));
				telaRegistroProdutos.add(userNameProdutos);
				nameTextProdutos.setBounds(130,55,330,27);
				telaRegistroProdutos.add(nameTextProdutos);
				
				descricaoProd.setBounds(35,85,100,60);
				telaRegistroProdutos.add(descricaoProd);
				descricaoProdText.setBounds(130,100,330,27);
				telaRegistroProdutos.add(descricaoProdText);
				
				corProduto.setBounds(20,140,100,60);
				telaRegistroProdutos.add(corProduto);
				corText.setBounds(130,155,163,27);
				telaRegistroProdutos.add(corText);
				
				produtoEstoque.setBounds(10,205,150,60);
				telaRegistroProdutos.add(produtoEstoque);
				estoqueText.setBounds(158,220,70,27);
				telaRegistroProdutos.add(estoqueText);
				
				tamanhoProduto.setBounds(270,205,150,60);
				telaRegistroProdutos.add(tamanhoProduto);
				tamanhoText.setBounds(400,220,63,27);//463
				telaRegistroProdutos.add(tamanhoText);
				
				produtoNum.setBounds(10,260,100,60);
				telaRegistroProdutos.add(produtoNum);
				produtoNumText.setBounds(50,275,100,27);
				telaRegistroProdutos.add(produtoNumText);
				
				catSex.setBounds(200,260,100,60);
				telaRegistroProdutos.add(catSex);
				catSexText.setBounds(300,275,163,27);
				telaRegistroProdutos.add(catSexText);
				
				catProdEta.setBounds(10,310,130,60);
				telaRegistroProdutos.add(catProdEta);
				catEtaText.setBounds(90,325,100,27);
				telaRegistroProdutos.add(catEtaText);
				
				prodMarca.setBounds(220,310,110,60);
				telaRegistroProdutos.add(prodMarca);
				prodMarcaText.setBounds(330,325,133,27);
				telaRegistroProdutos.add(prodMarcaText);
				
				precoProduto.setBounds(10, 360, 80, 60);
				telaRegistroProdutos.add(precoProduto);
				precoText.setBounds(60,375,100,27);
				telaRegistroProdutos.add(precoText);
				
				
				
				buttonRegisterProd.setBounds(20,420,450,50);
				telaRegistroProdutos.add(buttonRegisterProd);
				
				
				telaRegistroProdutos.getContentPane().setBackground(minhaCor2);
				telaRegistroProdutos.setVisible(true);
				telaRegistroProdutos.setSize(500,530);
				buttonRegisterProd.addActionListener(this);
				
			}
				
			
			
			
		
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==buttonRegisterProd) {
			boolean cad;
			novoDado[0] = Integer.toString(dados.getqtdProduto());
			novoDado[1] =  nameTextProdutos.getText();
			novoDado[2] = precoText.getText();
			novoDado[3] =  estoqueText.getText();
			novoDado[4] =  corText.getText();
			novoDado[5] =  catSexText.getText();
			novoDado[6] =  catEtaText.getText();
			novoDado[7] = prodMarcaText.getText();
			novoDado[8] = descricaoProdText.getText();
			novoDado[9] = tamanhoText.getText();
			novoDado[10] = produtoNumText.getText();
			
			cad=dados.inserirEditarProduto(novoDado);
			
			nameTextProdutos.setText("");
			descricaoProdText.setText("");
			corText.setText("");
			estoqueText.setText("");
			tamanhoText.setText("");
			produtoNumText.setText("");
			catSexText.setText("");
			catEtaText.setText("");
			prodMarcaText.setText("");
			precoText.setText("");
			
			if(cad==true)
				mensagemSucessoCadastro();
			else
				mensagemErroCadastro();
			
		
		
		}
		
	}

	
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		telaRegistroProdutos.dispose();
	}
	
	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemNULL(){
		JOptionPane.showMessageDialog(null, "nulo");
	}
}