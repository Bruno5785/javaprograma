package aula15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;

public class TelaLayouts extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JTextField txtTextfield;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JTextField textField;
	private JButton btnNewButton_19;
	private JLabel lblNewLabel;
	private JTextField txtDigiteSeuLogin;
	private JLabel lblNewLabel_1;
	private JTextField txtDigiteSuaSenha;
	private JButton btnNewButton_20;
	private JButton btnNewButton_21;
	private JPanel panel_6;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JButton btnNewButton_22;
	private JButton btnNewButton_23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLayouts frame = new TelaLayouts();
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
	public TelaLayouts() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		tabbedPane.addTab("BorderLayout", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		btnNewButton = new JButton("Bot\u00E3o no topo");
		panel.add(btnNewButton, BorderLayout.NORTH);
		
		btnNewButton_1 = new JButton("Bot\u00E3o Esquerda");
		panel.add(btnNewButton_1, BorderLayout.WEST);
		
		btnNewButton_2 = new JButton("Bot\u00E3o rodap\u00E9");
		panel.add(btnNewButton_2, BorderLayout.SOUTH);
		
		btnNewButton_3 = new JButton("Bot\u00E3o Direita");
		panel.add(btnNewButton_3, BorderLayout.EAST);
		
		btnNewButton_4 = new JButton("Bot\u00E3o Central");
		panel.add(btnNewButton_4, BorderLayout.CENTER);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("GridLayout", null, panel_1, null);
		panel_1.setLayout(new GridLayout(3, 5, 20, 20));
		
		btnNewButton_5 = new JButton("Bot\u00E3o 1");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_8 = new JButton("Bot\u00E3o 4");
		panel_1.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("Bot\u00E3o 5");
		panel_1.add(btnNewButton_9);
		
		btnNewButton_7 = new JButton("Bot\u00E3o 3");
		panel_1.add(btnNewButton_7);
		
		btnNewButton_6 = new JButton("Bot\u00E3o 2");
		panel_1.add(btnNewButton_6);
		panel_1.add(btnNewButton_5);
		
		btnNewButton_11 = new JButton("Bot\u00E3o 7");
		panel_1.add(btnNewButton_11);
		
		btnNewButton_10 = new JButton("Bot\u00E3o 6");
		panel_1.add(btnNewButton_10);
		
		btnNewButton_12 = new JButton("Bot\u00E3o 8");
		panel_1.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("Bot\u00E3o 9");
		panel_1.add(btnNewButton_13);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("BoxLayout", null, panel_2, null);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		btnNewButton_14 = new JButton("Bot\u00E3o 1");
		panel_2.add(btnNewButton_14);
		
		txtTextfield = new JTextField();
		txtTextfield.setText("TextField 1");
		panel_2.add(txtTextfield);
		txtTextfield.setColumns(10);
		
		btnNewButton_15 = new JButton("Bot\u00E3o 2");
		panel_2.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("Bot\u00E3o 3");
		panel_2.add(btnNewButton_16);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("FlowLayout", null, panel_3, null);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton_17 = new JButton("Bot\u00E3o 1");
		panel_3.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("Bot\u00E3o 2");
		panel_3.add(btnNewButton_18);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		btnNewButton_19 = new JButton("Bot\u00E3o 3");
		panel_3.add(btnNewButton_19);
		
		panel_4 = new JPanel();
		tabbedPane.addTab("FormLayout", null, panel_4, null);
		
		panel_5 = new JPanel();
		tabbedPane.addTab("GroupLayout", null, panel_5, null);
		
		lblNewLabel = new JLabel("Login:");
		
		txtDigiteSeuLogin = new JTextField();
		txtDigiteSeuLogin.setText("Digite seu Login");
		txtDigiteSeuLogin.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Senha:");
		
		txtDigiteSuaSenha = new JTextField();
		txtDigiteSuaSenha.setText("Digite sua Senha");
		txtDigiteSuaSenha.setColumns(10);
		
		btnNewButton_20 = new JButton("Cancelar");
		
		btnNewButton_21 = new JButton("Acessar");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(78)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(txtDigiteSuaSenha))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)
									.addComponent(txtDigiteSeuLogin, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(212)
							.addComponent(btnNewButton_20)
							.addGap(68)
							.addComponent(btnNewButton_21)))
					.addContainerGap(404, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(102)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtDigiteSeuLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(72)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtDigiteSuaSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(133)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_20)
						.addComponent(btnNewButton_21))
					.addContainerGap(192, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		panel_6 = new JPanel();
		tabbedPane.addTab("SprinfLayout", null, panel_6, null);
		SpringLayout sl_panel_6 = new SpringLayout();
		panel_6.setLayout(sl_panel_6);
		
		lblNewLabel_2 = new JLabel("Senha:");
		panel_6.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 3, SpringLayout.NORTH, textField_1);
		sl_panel_6.putConstraint(SpringLayout.WEST, textField_1, 262, SpringLayout.WEST, panel_6);
		textField_1.setText("Digite sua Senha");
		textField_1.setColumns(10);
		panel_6.add(textField_1);
		
		lblNewLabel_3 = new JLabel("Login:");
		sl_panel_6.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel_3);
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 119, SpringLayout.NORTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.WEST, lblNewLabel_3, 205, SpringLayout.WEST, panel_6);
		panel_6.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		sl_panel_6.putConstraint(SpringLayout.WEST, textField_2, 262, SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_1, 76, SpringLayout.SOUTH, textField_2);
		sl_panel_6.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField_2);
		sl_panel_6.putConstraint(SpringLayout.NORTH, textField_2, 116, SpringLayout.NORTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.EAST, textField_2, -365, SpringLayout.EAST, panel_6);
		textField_2.setText("Digite seu Login");
		textField_2.setColumns(10);
		panel_6.add(textField_2);
		
		btnNewButton_22 = new JButton("Cancelar");
		sl_panel_6.putConstraint(SpringLayout.NORTH, btnNewButton_22, 118, SpringLayout.SOUTH, textField_1);
		panel_6.add(btnNewButton_22);
		
		btnNewButton_23 = new JButton("Acessar");
		sl_panel_6.putConstraint(SpringLayout.WEST, btnNewButton_23, 339, SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.EAST, btnNewButton_22, -59, SpringLayout.WEST, btnNewButton_23);
		sl_panel_6.putConstraint(SpringLayout.NORTH, btnNewButton_23, 0, SpringLayout.NORTH, btnNewButton_22);
		panel_6.add(btnNewButton_23);
	}
}
