package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import model.Entrada;
import model.Fornecedor;
import model.Produto;
import util.Converte;
import util.Mascara;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEntradas extends JFrame {

	private JPanel contentPane;
	private JPanel pnTitulo;
	private JLabel lbLogo;
	private JLabel lblEntradas;
	private JPanel pnCentral;
	private JLabel lbProduto;
	private JComboBox cbProduto;
	private JLabel lbFornecor;
	private JComboBox cbFornecedor;
	private JLabel lbData;
	private JLabel lbDoc;
	private JTextField tfDoc;
	private JLabel tbQuantidade;
	private JFormattedTextField tfData;
	private JTextField tfQuantidade;
	private JLabel lbValor;
	private JTextField tfValor;
	private JButton btnNewButton;
	private ArrayList<Produto> produtos = new ArrayList();
	private ArrayList<Fornecedor> fornecedores = new ArrayList();

	

	/**
	 * Create the frame.
	 */
	public TelaEntradas() {
		initComponents();
		setCombobox();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 701, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnTitulo = new JPanel();
		pnTitulo.setLayout(null);
		pnTitulo.setPreferredSize(new Dimension(10, 70));
		pnTitulo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnTitulo.setBackground(new Color(204, 204, 153));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		
		lbLogo = new JLabel("");
		lbLogo.setIcon(new ImageIcon(TelaEntradas.class.getResource("/images/Logo3.png")));
		lbLogo.setBounds(53, 8, 64, 59);
		pnTitulo.add(lbLogo);
		
		lblEntradas = new JLabel("Entradas");
		lblEntradas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntradas.setForeground(Color.BLACK);
		lblEntradas.setFont(new Font("Georgia", Font.PLAIN, 33));
		lblEntradas.setBackground(Color.BLACK);
		lblEntradas.setBounds(10, 16, 655, 39);
		pnTitulo.add(lblEntradas);
		
		pnCentral = new JPanel();
		contentPane.add(pnCentral, BorderLayout.CENTER);
		
		lbProduto = new JLabel("Produto:");
		
		cbProduto = new JComboBox();
		
		lbFornecor = new JLabel("Fornecedor:");
		
		cbFornecedor = new JComboBox();
		
		lbData = new JLabel("Data:");
		
		lbDoc = new JLabel("Documento:");
		
		tfDoc = new JTextField();
		tfDoc.setColumns(10);
		
		tbQuantidade = new JLabel("Quantidade:");
		
		tfData = new JFormattedTextField(Mascara.Data());
		
		tfQuantidade = new JTextField();
		tfQuantidade.setColumns(10);
		
		lbValor = new JLabel("Valor:");
		lbValor.setFont(new Font("Calibri", Font.PLAIN, 15));
		
		tfValor = new JTextField();
		tfValor.setColumns(10);
		
		btnNewButton = new JButton("Gravar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gravaEntrada();
			}
		});
		GroupLayout gl_pnCentral = new GroupLayout(pnCentral);
		gl_pnCentral.setHorizontalGroup(
			gl_pnCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnCentral.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbValor)
						.addComponent(tbQuantidade)
						.addComponent(lbDoc)
						.addComponent(lbData)
						.addComponent(lbProduto)
						.addComponent(lbFornecor))
					.addGap(18)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnCentral.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(cbFornecedor, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(cbProduto, Alignment.LEADING, 0, 333, Short.MAX_VALUE))
						.addComponent(tfData, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfDoc, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(220))
				.addGroup(Alignment.TRAILING, gl_pnCentral.createSequentialGroup()
					.addContainerGap(502, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(84))
		);
		gl_pnCentral.setVerticalGroup(
			gl_pnCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnCentral.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbProduto)
						.addComponent(cbProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.TRAILING)
						.addComponent(cbFornecedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbFornecor))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbData)
						.addComponent(tfData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbDoc)
						.addComponent(tfDoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbQuantidade)
						.addComponent(tfQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_pnCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbValor)
						.addComponent(tfValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		pnCentral.setLayout(gl_pnCentral);
	}
	

	private void setCombobox() {
		produtos =  Produto.getLista();
		cbProduto.removeAllItems();
		for (Produto p: produtos) {
			cbProduto.addItem(p.getId() + ":  " + p.getNome());
		}
		fornecedores = Fornecedor.getLista();
		cbFornecedor.removeAllItems();
		for (Fornecedor f: fornecedores) {
			cbFornecedor.addItem(f.getNome());
		}
	}
	
	private void gravaEntrada() {
		Produto p = produtos.get(cbProduto.getSelectedIndex());
		Fornecedor f = fornecedores.get(cbFornecedor.getSelectedIndex());
		Date data = Converte.str2date(tfData.getText());
		String doc = tfDoc.getText();
		int qtde = Converte.toInt(tfQuantidade.getText());
		double valor = Double.parseDouble(tfValor.getText());
		new Entrada(p,f,data,doc,qtde,valor);
		limpaTela();
	}
	
	private void limpaTela() {
		tfData.setText("");
		tfDoc.setText("");
		tfQuantidade.setText("");
		tfValor.setText("");
		cbProduto.requestFocus();
	}
}
