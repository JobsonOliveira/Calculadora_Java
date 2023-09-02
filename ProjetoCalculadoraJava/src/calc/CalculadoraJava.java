package calc;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CalculadoraJava extends JFrame {

	private JPanel contentPane;
	private JTextField Tela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraJava frame = new CalculadoraJava();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	ArrayList<String> num1 = new ArrayList();
	ArrayList <String> num2 = new ArrayList();
	String operacao = "";
	String numDigUm = "";
	String numDigDois = "";
	Boolean pontoNumUm = false;
	Boolean pontoNumDois = false;
	
	/**
	 * Create the frame.
	 */
	public CalculadoraJava() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		//AONDE VAI APARECER OS NUMEROS DIGITADOS
		Tela = new JTextField();
		Tela.setBounds(10, 11, 280, 60);
		contentPane.add(Tela);
		Tela.setColumns(10);
		//-----------------------MUDAR O TAMANDO DO TEXTO
		Tela.setFont(new Font("Arial",Font.PLAIN ,30));
		//------------------------ALINHAR O TEXTO À DIREITA
		Tela.setHorizontalAlignment(JTextField.RIGHT);

		//BUTTON PARA APAGAR TUDO QUE FOI DIGITADO NA CALCULADORA
		JButton btnC = new JButton("C");
		btnC.setBounds(10, 82, 63, 51);
		contentPane.add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ZERANDO OS VALORES DENTRO DA VARIÁVEIS E ARRAYS
				num1.clear();
				num2.clear();
				operacao = "";
				numDigUm = "";
				numDigDois = "";
				pontoNumUm = false;
				pontoNumDois = false;
				Tela.setText("");
			}
		});

		//BUTTON PARA APAGAR APENAS OQUE ESTAVA SENDO DIGITADO NO MOMENTO
		JButton btnCE = new JButton("CE");
		btnCE.setBounds(81, 82, 63, 51);
		contentPane.add(btnCE);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//APAGAR CARACTERE DO PRIMEIRO NUMERO
				if((num1.size() != 0) && (operacao == "")) {
					for(int i = 0; i < num1.size(); i++) {
						//QUANDO ACHAR O ULTIMO NÚIMERO ELE REMOVE
						if((i + 1) == num1.size()) {
							//SE O CARACTERE QUE VAI SER REMOVIDO FOR UM PONTO
							if(num1.get(i) == ".") {
								pontoNumUm = false;
							}
							num1.remove(i);
						}
					}
					numDigUm = "";
					//PERCORRER O NÚMERO PARA APRESENTAR NA TELA
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//APAGAR A OPERAÇÃO
				if((num1.size() != 0) && (operacao != "") && (num2.size() == 0)) {
					numDigUm = "";
					operacao = "";
					//PERCORRER O ARRAY DO PRIMEIRO NÚMERO PARA MOSTRAR NA TELA
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//APAGAR CARACTERE  DO SEGUNDO NÚMERO
				if(num2.size() != 0){
					numDigUm = "";
					numDigDois = "";
					//PERCORRER O ARRAY DO PRIMEIRO NÚMERO E ADICIONAR NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//PERCORRER O ARRAY DO SEGUNDO NÚMERO E APAGAR O ULTIMO CARACTERE
					for(int  i =0; i < num2.size(); i++) {
						if((i + 1) == num2.size()) {
							num2.remove(i);
						}
					}
					//PERCORRER O ARRAY ATUALIZADO DO SEGUNDO NÚMERO E GARDAR NO numDigDois
					for(int i = 0; i < num2.size(); i++){
						numDigDois += num2.get(i);
					}
					
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigUm = "";
					numDigDois = "";
				}
			}
		});
		
		//----------------------------BUTTON NUMERO 1------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("1");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("1");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});
		btn1.setBounds(10, 268, 63, 51);
		contentPane.add(btn1);

		//----------------------------BUTTON NUMERO 2--------------------------------
		JButton btn2 = new JButton("2");
		btn2.setBounds(81, 268, 63, 51);
		contentPane.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("2");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("2");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});
		
		//---------------------------BUTTON NBUMERO 3-----------------------------
		JButton btn3 = new JButton("3");
		btn3.setBounds(154, 268, 63, 51);
		contentPane.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("3");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("3");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});

		//-----------------------------BUTTON NUMERO 4---------------------------
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 206, 63, 51);
		contentPane.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("4");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("4");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});

		//-----------------------------BUTTON NUMERO 5---------------------------
		JButton btn5 = new JButton("5");
		btn5.setBounds(81, 206, 63, 51);
		contentPane.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("5");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("5");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});

		//-----------------------------BUTTON NUMERO 6---------------------------
		JButton btn6 = new JButton("6");
		btn6.setBounds(154, 206, 63, 51);
		contentPane.add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("6");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("6");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});

		//-----------------------------BUTTON NUMERO 7---------------------------
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 144, 63, 51);
		contentPane.add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("7");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("7");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});

		//-----------------------------BUTTON NUMERO 8---------------------------
		JButton btn8 = new JButton("8");
		btn8.setBounds(81, 144, 63, 51);
		contentPane.add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("8");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("8");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});

		//-----------------------------BUTTON NUMERO 9---------------------------
		JButton btn9 = new JButton("9");
		btn9.setBounds(154, 144, 63, 51);
		contentPane.add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("9");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("9");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});

		//------------------------------------BUTTON NUMERO 0-----------------------------------
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 330, 134, 51);
		contentPane.add(btn0);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm = "";
					num1.add("0");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigUm
					Tela.setText(numDigUm);
					numDigUm = "";
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigUm = "";
					numDigDois = "";
					num2.add("0");
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigUm
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					//ADICIONAR O ARRAY INTEIRO DO PRIMEIRO NUMERO DIGITADO NO numDigDois
					for(int i = 0; i < num2.size(); i++) {
						numDigDois += num2.get(i);
					}
					//MOSTRAR O NUMERO NA TELA E ZERAR O numDigDois
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
					numDigDois = "";
					numDigUm = "";
				}
			}
		});
		
		//-----------------------------BUTTON DE DIVISÃO-----------------------------
		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(154, 82, 63, 51);
		contentPane.add(btnDividir);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				if((num1.size() != 0) && (operacao == "")) {
					
					numDigUm = "";
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					
					Tela.setText(numDigUm + " / ");
					operacao = "/";
					numDigUm = "";
					
				}
			}
		});

		//----------------------------BUTTON DE MULTIPLICAÇÃO---------------------------
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setBounds(227, 82, 63, 51);
		contentPane.add(btnMultiplicar);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((num1.size() != 0) && (operacao == "")) {
					
					numDigUm = "";
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					
					Tela.setText(numDigUm + " * ");
					operacao = "*";
					numDigUm = "";
					
				}
			}
		});
		
		//------------------------------------BUTTON DE SUBTRAÇÃO----------------------------------
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setBounds(227, 144, 63, 51);
		contentPane.add(btnSubtrair);
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((num1.size() != 0) && (operacao == "")) {
					
					numDigUm = "";
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					
					Tela.setText(numDigUm + " - ");
					operacao = "-";
					numDigUm = "";
					
				}
			}
		});

		//------------------------------------BUTTON DE SOMA------------------------------------
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((num1.size() != 0) && (operacao == "")) {
					
					numDigUm = "";
					for(int i = 0; i < num1.size(); i++) {
						numDigUm += num1.get(i);
					}
					
					Tela.setText(numDigUm + " + ");
					operacao = "+";
					numDigUm = "";
					
				}
			}
		});
		btnSoma.setBounds(227, 206, 63, 51);
		contentPane.add(btnSoma);

		//------------------------------------BUTTON DE PONTO----------------------------
		JButton btnPonto = new JButton(".");
		btnPonto.setBounds(227, 268, 63, 51);
		contentPane.add(btnPonto);
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//PRIMEIRO NÚMERO DIGITADO
					if((operacao == "") && (num1.size() != 0)) {
						//VERIFICA SE JA TEM UM PONTO NO NÚMERO
							if(pontoNumUm == false) {
								num1.add(".");
								numDigUm = "";
								//PERCORRER O PRIMEIRO NÚMERO DIGITADO E APRESENTAR NA TELA
								for(int i = 0; i < num1.size(); i++) {
									numDigUm += num1.get(i);
								}
								//MOSTRAR NA TELA
								Tela.setText(numDigUm);
								//ZERAR AS VARIÁVEIS
								numDigUm = "";
								pontoNumUm = true;
							}
							else {
								return;
							}
					}
				//SEGUNDO NÚMERO DIGITADO
					if((operacao != "") && (num2.size() != 0)) {
						//VERIFICA SE JA TEM UM PONTO NO NÚMERO
						if(pontoNumDois == false) {
							numDigUm = "";
							numDigDois = "";
							//ADICIONAR O PONTO AO num2
							num2.add(".");
							//PERCORRER O PRIMEIRO NÚMERO DIGITADO PARA APRESENTAR
							for(int i = 0; i < num1.size(); i++) {
								numDigUm += num1.get(i);
							}
							//PERCORRER O SEGUNDO NÚMERO DIGITADO PARA APRESENTAR
							for(int i = 0; i < num2.size(); i++) {
								numDigDois += num2.get(i);
							}
							//MOSTRAR NA TELA
							Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
							
							numDigUm = "";
							numDigDois = "";
							pontoNumDois = true;
						}
						else {
							return;
						}
					}
			}
		});

		//---------------------------BUTTON PARA MOSTRAR O RESULTADO--------------------------
		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(154, 330, 136, 51);
		contentPane.add(btnIgual);
	}
}
