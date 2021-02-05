package aula22;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;
import java.awt.Color;

public class TelaMascara extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lbData;
	private JFormattedTextField tfData;
	private JLabel lbCelular;
	private JFormattedTextField tfCelular;
	private JLabel lbCEP;
	private JFormattedTextField tfCEP;
	private JLabel lbTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMascara frame = new TelaMascara();
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
	public TelaMascara() {
		initComponents();
		tfCelular.setFormatterFactory(
				new DefaultFormatterFactory(Mascara.Celular()));
		tfData.setFormatterFactory(
				new DefaultFormatterFactory(Mascara.data()));
		tfCEP.setFormatterFactory(
				new DefaultFormatterFactory(Mascara.CEP()));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(53)
					.addComponent(lbTitulo))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addComponent(lbData)
					.addGap(11)
					.addComponent(tfData, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(lbCelular)
					.addGap(11)
					.addComponent(tfCelular, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addComponent(lbCEP)
					.addGap(17)
					.addComponent(tfCEP, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(26)
					.addComponent(lbTitulo)
					.addGap(25)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(lbData))
						.addComponent(tfData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(lbCelular))
						.addComponent(tfCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(lbCEP))
						.addComponent(tfCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		contentPane.add(panel, BorderLayout.CENTER);
		
		lbData = new JLabel("Data:");
		lbData.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		tfData = new JFormattedTextField();
		
		lbCelular = new JLabel("Celular:");
		lbCelular.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		tfCelular = new JFormattedTextField();
		
		lbCEP = new JLabel("CEP:");
		lbCEP.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		tfCEP = new JFormattedTextField();
		
		lbTitulo = new JLabel("Mascara de Formata\u00E7\u00E3o");
		lbTitulo.setFont(new Font("Calibri", Font.PLAIN, 32));
	}
}
