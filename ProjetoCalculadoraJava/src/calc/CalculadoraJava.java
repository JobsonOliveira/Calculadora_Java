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

		//BUTTON PARA APAGAR APENAS OQUE ESTAVA SENDO DIGITADO NO MOMENTO
		JButton btnCE = new JButton("CE");
		btnCE.setBounds(81, 82, 63, 51);
		contentPane.add(btnCE);

		
		//----------------------------BUTTON NUMERO 1------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SE FOR O PRIMEIRO NÚMERO QUE ESTÁ SENDO DEIGITADO
				if(operacao == "") {
					numDigUm += "1";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "1";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					numDigUm += "2";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "2";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					numDigUm += "3";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "3";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					numDigUm += "4";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "4";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					numDigUm += "5";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "5";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					numDigUm += "6";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "6";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					numDigUm += "7";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "7";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					numDigUm += "8";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "8";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					numDigUm += "9";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "9";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					numDigUm += "0";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num1.clear();
					//ADICIONA O NOVO NÚMERO
					num1.add(numDigUm);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm);
				}
				
				//SE FOR O SEGUNDO NÚMERO QUE ESTÁ SENDO DIGITADO
				if(operacao != "") {
					numDigDois += "0";
					//ZERA O ARRAY PARA ADICIONAR O NOVO NÚMERO
					num2.clear();
					//ADICIONA O NOVO NÚMERO
					num2.add(numDigDois);
					//MOSTRA NA TELA O NUMERO
					Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
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
					
					Tela.setText(numDigUm + " / ");
					operacao = "/";
					
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
					
					Tela.setText(numDigUm + " * ");
					operacao = "*";
					
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
					
					Tela.setText(numDigUm + " - ");
					operacao = "-";
					
				}
			}
		});

		//------------------------------------BUTTON DE SOMA------------------------------------
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((num1.size() != 0) && (operacao == "")) {
					
					Tela.setText(numDigUm + " + ");
					operacao = "+";
					
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
					if((operacao == "") && (numDigUm != "")) {
						//VERIFICA SE JA TEM UM PONTO NO NÚMERO
							if(pontoNumUm == false) {
								numDigUm += ".";
								num1.clear();
								num1.add(numDigUm);
								Tela.setText(numDigUm);
								pontoNumUm = true;
							}
							//ADICIONA O PONTO
							else {
								return;
							}
					}
				//SEGUNDO NÚMERO DIGITADO
					if((operacao != "") && (numDigDois != "")) {
						//VERIFICA SE JA TEM UM PONTO NO NÚMERO
						if(pontoNumDois == false) {
							numDigDois += ".";
							num1.clear();
							num1.add(numDigDois);
							Tela.setText(numDigUm + " " + operacao + " " + numDigDois);
							pontoNumDois = true;
						}
						//ADICIONA O PONTO
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
