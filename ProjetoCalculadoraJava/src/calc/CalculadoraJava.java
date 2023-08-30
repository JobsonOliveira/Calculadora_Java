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

	String operacao = "";
	String num1 = "";
	String pontoNum1 = "";
	String num2 = "";
	String pontoNum2 = "";
	
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
				//preencher o primeiro número
				if(operacao == "") {
					
					Tela.setText(num1 + "1");
					num1 += "1";
					
				}
				//preencher o segundo número
				else if((num1 != "") && (operacao != "")) {
					
					num2 += "1";
					Tela.setText(num1 + " " + operacao + " " + num2);
					System.out.println("Num2: " + num2);
					
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
				
				//preencher o primeiro número
				if(operacao == "") {
					
					Tela.setText(num1 + "2");
					num1 += "2";
					
				}
				//preencher o segundo número
				else if((num1 != "") && (operacao != "")) {
					
					num2 += "2";
					Tela.setText(num1 + " " + operacao + " " + num2);
					System.out.println("Num2: " + num2);
				}
			}
		});
		
		//---------------------------BUTTON NBUMERO 3-----------------------------
		JButton btn3 = new JButton("3");
		btn3.setBounds(154, 268, 63, 51);
		contentPane.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//preencher o primeiro número
				if(operacao == "") {
					
					Tela.setText(num1 + "3");
					num1 += "3";
					
				}
				//preencher o segundo número
				else if((num1 != "") && (operacao != "")) {
					
					num2 += "3";
					Tela.setText(num1 + " " + operacao + " " + num2);
					System.out.println("Num2: " + num2);
					
				}
			}
		});

		//-----------------------------BUTTON NUMERO 4---------------------------
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 206, 63, 51);
		contentPane.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				//preencher o primeiro número
				if(operacao == "") {
					
					Tela.setText(num1 + "4");
					num1 += "4";
					
				}
				//preencher o segundo número
				else if((num1 != "") && (operacao != "")) {
					
					num2 += "4";
					Tela.setText(num1 + " " + operacao + " " + num2);
					System.out.println("Num2: " + num2);
					
				}
			}
		});

		//-----------------------------BUTTON NUMERO 5---------------------------
		JButton btn5 = new JButton("5");
		btn5.setBounds(81, 206, 63, 51);
		contentPane.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				//preencher o primeiro número
				if(operacao == "") {
					
					Tela.setText(num1 + "5");
					num1 += "5";
					
				}
				//preencher o segundo número
				else if((num1 != "") && (operacao != "")) {
					
					num2 += "5";
					Tela.setText(num1 + " " + operacao + " " + num2);
					System.out.println("Num2: " + num2);
					
				}
			}
		});

		//-----------------------------BUTTON NUMERO 6---------------------------
		JButton btn6 = new JButton("6");
		btn6.setBounds(154, 206, 63, 51);
		contentPane.add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//preencher o primeiro número
				if(operacao == "") {
					
					Tela.setText(num1 + "6");
					num1 += "6";
					
				}
				//preencher o segundo número
				else if((num1 != "") && (operacao != "")) {
					
					num2 += "6";
					Tela.setText(num1 + " " + operacao + " " + num2);
					System.out.println("Num2: " + num2);
					
				}
			}
		});

		//-----------------------------BUTTON NUMERO 7---------------------------
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 144, 63, 51);
		contentPane.add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				//preencher o primeiro número
				if(operacao == "") {
					
					Tela.setText(num1 + "7");
					num1 += "7";
					
				}
				//preencher o segundo número
				else if((num1 != "") && (operacao != "")) {
					
					num2 += "7";
					Tela.setText(num1 + " " + operacao + " " + num2);
					System.out.println("Num2: " + num2);
					
				}
			}
		});

		//-----------------------------BUTTON NUMERO 8---------------------------
		JButton btn8 = new JButton("8");
		btn8.setBounds(81, 144, 63, 51);
		contentPane.add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//preencher o primeiro número
				if(operacao == "") {
					
					Tela.setText(num1 + "8");
					num1 += "8";
					
				}
				//preencher o segundo número
				else if((num1 != "") && (operacao != "")) {
					
					num2 += "8";
					Tela.setText(num1 + " " + operacao + " " + num2);
					System.out.println("Num2: " + num2);
					
				}
			}
		});

		//-----------------------------BUTTON NUMERO 9---------------------------
		JButton btn9 = new JButton("9");
		btn9.setBounds(154, 144, 63, 51);
		contentPane.add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//preencher o primeiro número
				if(operacao == "") {
					
					Tela.setText(num1 + "9");
					num1 += "9";
					
				}
				//preencher o segundo número
				else if((num1 != "") && (operacao != "")) {
					
					num2 += "9";
					Tela.setText(num1 + " " + operacao + " " + num2);
					System.out.println("Num2: " + num2);
					
				}
			}
		});

		//-----------------------------BUTTON DE DIVISÃO-----------------------------
		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(154, 82, 63, 51);
		contentPane.add(btnDividir);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				if((num1 != "") && (operacao == "")) {
					
					Tela.setText(num1 + " / ");
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
				if((num1 != "") && (operacao == "")) {
					
					Tela.setText(num1 + " * ");
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
				if((num1 != "") && (operacao == "")) {
					
					Tela.setText(num1 + " - ");
					operacao = "-";
					
				}
			}
		});

		//------------------------------------BUTTON DE SOMA------------------------------------
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((num1 != "") && (operacao == "")) {
					
					Tela.setText(num1 + " + ");
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
				//se o ponto for para o primeiro número digitado
				if((pontoNum1 == "") && (operacao == "") && (num2 == "")) {
					
					Tela.setText(num1 + ".");
					pontoNum1 = ".";
					
				}
				
				//se o ponto for para o segundo número digitado
				if((pontoNum2 == "") && (operacao != "") && (num2 != "")) {
					
					Tela.setText(num1 + " " + operacao + " " + num2 + ".");
					
				}
					
			}
		});

		//------------------------------------BUTTON NUMERO 0-----------------------------------
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 330, 134, 51);
		contentPane.add(btn0);

		//---------------------------BUTTON PARA MOSTRAR O RESULTADO--------------------------
		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(154, 330, 136, 51);
		contentPane.add(btnIgual);
	}
}
