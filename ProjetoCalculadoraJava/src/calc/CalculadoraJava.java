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

	int numero1 = 11;
	int numero2;
	String operacao;
	
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
		//MUDAR O TAMANDO DO TEXTO
		Tela.setFont(new Font("Arial",Font.PLAIN ,30));
		//ALINHAR O TEXTO À DIREITA
		Tela.setHorizontalAlignment(JTextField.RIGHT);

		//BUTTON PARA APAGAR TUDO QUE FOI DIGITADO NA CALCULADORA
		JButton btnC = new JButton("C");
		btnC.setBounds(10, 82, 63, 51);
		contentPane.add(btnC);

		//BUTTON PARA APAGAR APENAS OQUE ESTAVA SENDO DIGITADO NO MOMENTO
		JButton btnCE = new JButton("CE");
		btnCE.setBounds(81, 82, 63, 51);
		contentPane.add(btnCE);

		//BUTTON NUMERO 1
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numero1 == 11) {
					
					numero1 = 1;
					Tela.setText("1");
					
				}else if(numero2 == 22) {
					
					numero2 = 1;
					Tela.setText("1");
				}else {
					
					return;
				}
				
			}
		});
		btn1.setBounds(10, 268, 63, 51);
		contentPane.add(btn1);

		//BUTTON NUMERO 2
		JButton btn2 = new JButton("2");
		btn2.setBounds(81, 268, 63, 51);
		contentPane.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela.setText("2");
			}
		});
		
		//BUTTON NBUMERO 3
		JButton btn3 = new JButton("3");
		btn3.setBounds(154, 268, 63, 51);
		contentPane.add(btn3);

		//BUTTON NUMERO 4
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 206, 63, 51);
		contentPane.add(btn4);

		//BUTTON NUMERO 5
		JButton btn5 = new JButton("5");
		btn5.setBounds(81, 206, 63, 51);
		contentPane.add(btn5);

		//BUTTON NUMERO 6
		JButton btn6 = new JButton("6");
		btn6.setBounds(154, 206, 63, 51);
		contentPane.add(btn6);

		//BUTTON NUMERO 7
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 144, 63, 51);
		contentPane.add(btn7);

		//BUTTON NUMERO 8
		JButton btn8 = new JButton("8");
		btn8.setBounds(81, 144, 63, 51);
		contentPane.add(btn8);

		//BUTTON NUMERO 9
		JButton btn9 = new JButton("9");
		btn9.setBounds(154, 144, 63, 51);
		contentPane.add(btn9);

		//BUTTON DE DIVISÃO
		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(154, 82, 63, 51);
		contentPane.add(btnDividir);

		//BUTTON DE MULTIPLICAÇÃO
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setBounds(227, 82, 63, 51);
		contentPane.add(btnMultiplicar);

		//BUTTON DE SUBTRAÇÃO
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setBounds(227, 144, 63, 51);
		contentPane.add(btnSubtrair);

		//BUTTON DE SOMA
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSoma.setBounds(227, 206, 63, 51);
		contentPane.add(btnSoma);

		//BUTTON DE PONTO
		JButton btnPonto = new JButton(".");
		btnPonto.setBounds(227, 268, 63, 51);
		contentPane.add(btnPonto);

		//BUTTON NUMERO 0
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 330, 134, 51);
		contentPane.add(btn0);

		//BUTTON PARA MOSTRAR O RESULTADO
		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(154, 330, 136, 51);
		contentPane.add(btnIgual);
	}
}
