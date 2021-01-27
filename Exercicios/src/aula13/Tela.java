package aula13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelTopo = new JPanel();
		panelTopo.setBackground(Color.RED);
		panelTopo.setForeground(Color.BLACK);
		panelTopo.setPreferredSize(new Dimension(10, 50));
		panelTopo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(panelTopo, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("T\u00EDtulo de Aplica\u00E7\u00E3o");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		panelTopo.add(lblNewLabel);
		
		JPanel painelCentral = new JPanel();
		painelCentral.setBackground(new Color(255, 204, 153));
		contentPane.add(painelCentral, BorderLayout.CENTER);
		SpringLayout sl_painelCentral = new SpringLayout();
		painelCentral.setLayout(sl_painelCentral);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		sl_painelCentral.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 67, SpringLayout.NORTH, painelCentral);
		sl_painelCentral.putConstraint(SpringLayout.WEST, lblNewLabel_1, 46, SpringLayout.WEST, painelCentral);
		painelCentral.add(lblNewLabel_1);
		
		textField = new JTextField();
		sl_painelCentral.putConstraint(SpringLayout.NORTH, textField, 69, SpringLayout.NORTH, painelCentral);
		sl_painelCentral.putConstraint(SpringLayout.WEST, textField, 8, SpringLayout.EAST, lblNewLabel_1);
		sl_painelCentral.putConstraint(SpringLayout.EAST, textField, 299, SpringLayout.EAST, lblNewLabel_1);
		painelCentral.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("CliqueAqui");
		sl_painelCentral.putConstraint(SpringLayout.EAST, btnNewButton, -145, SpringLayout.EAST, painelCentral);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaNome();
			}
		});
		painelCentral.add(btnNewButton);
		
		textField_1 = new JTextField();
		sl_painelCentral.putConstraint(SpringLayout.NORTH, textField_1, 32, SpringLayout.SOUTH, textField);
		sl_painelCentral.putConstraint(SpringLayout.WEST, textField_1, 106, SpringLayout.WEST, painelCentral);
		sl_painelCentral.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		painelCentral.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sbrenome:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		sl_painelCentral.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 0, SpringLayout.SOUTH, textField_1);
		sl_painelCentral.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel_1);
		painelCentral.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		sl_painelCentral.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 32, SpringLayout.SOUTH, lblNewLabel_2);
		sl_painelCentral.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, lblNewLabel_1);
		painelCentral.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("M\u00E3e:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		sl_painelCentral.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 33, SpringLayout.SOUTH, lblNewLabel_3);
		sl_painelCentral.putConstraint(SpringLayout.EAST, lblNewLabel_4, 0, SpringLayout.EAST, lblNewLabel_1);
		painelCentral.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pai:");
		sl_painelCentral.putConstraint(SpringLayout.NORTH, btnNewButton, -3, SpringLayout.NORTH, lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 18));
		sl_painelCentral.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 33, SpringLayout.SOUTH, lblNewLabel_4);
		sl_painelCentral.putConstraint(SpringLayout.EAST, lblNewLabel_5, 0, SpringLayout.EAST, lblNewLabel_1);
		painelCentral.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		sl_painelCentral.putConstraint(SpringLayout.NORTH, textField_2, 3, SpringLayout.NORTH, lblNewLabel_3);
		sl_painelCentral.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField);
		sl_painelCentral.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		painelCentral.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_painelCentral.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, lblNewLabel_4);
		sl_painelCentral.putConstraint(SpringLayout.WEST, textField_3, 8, SpringLayout.EAST, lblNewLabel_4);
		sl_painelCentral.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField);
		painelCentral.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		sl_painelCentral.putConstraint(SpringLayout.NORTH, textField_4, 6, SpringLayout.NORTH, btnNewButton);
		sl_painelCentral.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, textField);
		sl_painelCentral.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField);
		painelCentral.add(textField_4);
		textField_4.setColumns(10);
	}
	
	private void listaNome() {
		String nome = textField.getText();
		String sobrenome = textField_1.getText();
		String email = textField_2.getText();
		String mae = textField_3.getText();
		String pai = textField_4.getText();
		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(email);
		System.out.println(mae);
		System.out.println(pai);
		
	}
}
