package aula14;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aula04.classeIMC;
import aula06.Mat;

import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Point;
import javax.swing.UIManager;

public class TelaIMC extends JFrame {

	private JPanel contentPane;
	private JLabel lbTitulo;
	private JPanel pnCenter;
	private JLabel lbNome;
	private JTextField tfNome;
	private JLabel lbPeso;
	private JSpinner spPeso;
	private JLabel lbAltura;
	private JTextField tfAltura;
	private JButton btCalculaIMC;
	private JTextArea txSaida;
	private JLabel lbResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIMC frame = new TelaIMC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaIMC() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnTitulo = new JPanel();
		pnTitulo.setBackground(new Color(204, 102, 0));
		pnTitulo.setPreferredSize(new Dimension(10, 60));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		
		lbTitulo = new JLabel("Calculadora IMC");
		lbTitulo.setFont(new Font("Arial", Font.PLAIN, 32));
		pnTitulo.add(lbTitulo);
		
		pnCenter = new JPanel();
		pnCenter.setBackground(new Color(255, 255, 204));
		contentPane.add(pnCenter, BorderLayout.CENTER);
		SpringLayout sl_pnCenter = new SpringLayout();
		pnCenter.setLayout(sl_pnCenter);
		
		lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Arial", Font.PLAIN, 18));
		sl_pnCenter.putConstraint(SpringLayout.NORTH, lbNome, 79, SpringLayout.NORTH, pnCenter);
		sl_pnCenter.putConstraint(SpringLayout.WEST, lbNome, 10, SpringLayout.WEST, pnCenter);
		pnCenter.add(lbNome);
		
		tfNome = new JTextField();
		tfNome.setBackground(UIManager.getColor("Button.light"));
		sl_pnCenter.putConstraint(SpringLayout.NORTH, tfNome, 79, SpringLayout.NORTH, pnCenter);
		sl_pnCenter.putConstraint(SpringLayout.WEST, tfNome, 6, SpringLayout.EAST, lbNome);
		sl_pnCenter.putConstraint(SpringLayout.EAST, tfNome, -272, SpringLayout.EAST, pnCenter);
		pnCenter.add(tfNome);
		tfNome.setColumns(10);
		
		lbPeso = new JLabel("Peso:");
		sl_pnCenter.putConstraint(SpringLayout.NORTH, lbPeso, 80, SpringLayout.SOUTH, lbNome);
		sl_pnCenter.putConstraint(SpringLayout.EAST, lbPeso, 0, SpringLayout.EAST, lbNome);
		lbPeso.setFont(new Font("Arial", Font.PLAIN, 18));
		pnCenter.add(lbPeso);
		
		spPeso = new JSpinner();
		spPeso.setBackground(UIManager.getColor("Button.light"));
		sl_pnCenter.putConstraint(SpringLayout.NORTH, spPeso, 82, SpringLayout.SOUTH, tfNome);
		sl_pnCenter.putConstraint(SpringLayout.WEST, spPeso, 6, SpringLayout.EAST, lbPeso);
		sl_pnCenter.putConstraint(SpringLayout.EAST, spPeso, -489, SpringLayout.EAST, pnCenter);
		pnCenter.add(spPeso);
		
		lbAltura = new JLabel("Altura:");
		sl_pnCenter.putConstraint(SpringLayout.NORTH, lbAltura, 0, SpringLayout.NORTH, lbPeso);
		lbAltura.setFont(new Font("Arial", Font.PLAIN, 18));
		pnCenter.add(lbAltura);
		
		tfAltura = new JTextField();
		tfAltura.setBackground(UIManager.getColor("Button.light"));
		sl_pnCenter.putConstraint(SpringLayout.EAST, lbAltura, -6, SpringLayout.WEST, tfAltura);
		sl_pnCenter.putConstraint(SpringLayout.NORTH, tfAltura, 0, SpringLayout.NORTH, lbPeso);
		sl_pnCenter.putConstraint(SpringLayout.EAST, tfAltura, 0, SpringLayout.EAST, tfNome);
		pnCenter.add(tfAltura);
		tfAltura.setColumns(10);
		
		btCalculaIMC = new JButton("CalculaIMC");
		sl_pnCenter.putConstraint(SpringLayout.SOUTH, btCalculaIMC, -10, SpringLayout.SOUTH, pnCenter);
		sl_pnCenter.putConstraint(SpringLayout.EAST, btCalculaIMC, -10, SpringLayout.EAST, pnCenter);
		btCalculaIMC.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btCalculaIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculaIMC();
			}
		});
		pnCenter.add(btCalculaIMC);
		
		lbResposta = new JLabel("Resposta:");
		lbResposta.setFont(new Font("Arial", Font.PLAIN, 14));
		sl_pnCenter.putConstraint(SpringLayout.WEST, lbResposta, 0, SpringLayout.WEST, lbNome);
		sl_pnCenter.putConstraint(SpringLayout.SOUTH, lbResposta, -10, SpringLayout.SOUTH, pnCenter);
		pnCenter.add(lbResposta);
		
		txSaida = new JTextArea();
		txSaida.setBackground(Color.LIGHT_GRAY);
		txSaida.setPreferredSize(new Dimension(2, 75));
		txSaida.setLocation(new Point(10, 60));
		txSaida.setSize(new Dimension(10, 60));
		contentPane.add(txSaida, BorderLayout.SOUTH);
	}
	private void calculaIMC() {
		String nome= tfNome.getText();
		int peso = Integer.parseInt(spPeso.getValue().toString());
		double altura = Double.parseDouble(tfAltura.getText());
		double imc = peso / Mat.pow(altura,2);
		String classe = classeIMC.classeIMC(imc);
		System.out.println(nome + "\n" +
						   "Índice IMC = " + imc + "\n" +
						   "Classificação IMC = " + classe);
		txSaida.setText("");
		txSaida.append(nome + "\n" + "Classificação IMC = " + classe);
		
	}

}
