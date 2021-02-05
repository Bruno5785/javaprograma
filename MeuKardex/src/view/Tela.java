package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
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
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultFormatterFactory;

import model.Fornecedor;
import model.Produto;
import util.Configura;
import util.Converte;

public class Tela extends JFrame {

	private Paineis painel;
	private JPanel contentPane;
	private JPanel pnTitulo;
	private JLabel lbTitulo;
	private JPanel pnMenu;
	private JButton btProdutos;
	private JButton btClientes;
	private JButton btFornecedores;
	private JButton btEntrada;
	private JButton btSaida;
	private JButton btMovimentacao;
	private JPanel pnRodape;
	private JButton btnGravar;
	private JButton btnCancelar;
	private JButton btnLimpar;
	private JButton btnListar;
	private JLabel lbLogo;
	private JComboBox cbTema;
	private JLabel lbTema;
	private JPanel pnCentral;
	private JPanel pnProdutos;
	private JLabel lbProdutos;
	private JPanel pnClientes;
	private JLabel lbClientes;
	private JPanel pnFornecedores;
	private JLabel lbFornecedores;
	private JLabel lbProdutoID;
	private JTextField tfProdutoID;
	private JLabel lbProdutoNome;
	private JTextField tfProdutoNome;
	private JLabel lbProdutoLocalizacao;
	private JTextField tfProdutoLocalizacao;
	private JPanel pnQtde;
	private JLabel lbProdutoQtdeMinima;
	private JTextField tfProdutoQtdeMinima;
	private JLabel lbprodutoQtdeMaxima;
	private JTextField tfProdutoQtdeMaxima;
	private JLabel lbProdutoQtdeEstoque;
	private JTextField tfProdutoQtdeEstoque;
	private JLabel lbFornecedoresNome;
	private JTextField tfFornecedorID;
	private JLabel lbFornecedoresCNPJ;
	private JTextField tfFornecedorNome;
	private JLabel lbFornecedoresTelefone;
	private JTextField tfFornecedorEmail;
	private JLabel lbFornecedoresEmail;
	private JLabel lbFornecedoresID;
	private JLabel lbClientesID;
	private JTextField tfClientesID;
	private JLabel lbClientesCPF;
	private JTextField tfClientesCPF;
	private JLabel lbClientesNome;
	private JTextField tfClientesNome;
	private JLabel lbClientesCelular;
	private JTextField tfClientesCelular;
	private JLabel lbClientesEmail;
	private JTextField tfClientesEmail;
	private JPanel pnEntrada;
	private JPanel pnSaida;
	private JPanel pnMovimentacao;
	private JFormattedTextField tfFornecedorCNPJ;
	private JFormattedTextField tfFornecedorTelefone;
	private SpringLayout sl_pnFornecedores;


	/**
	 * Create the frame.
	 */
	public Tela() {
		initComponents();
		
		tfFornecedorTelefone = new JFormattedTextField();
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, tfFornecedorTelefone, 24, SpringLayout.NORTH, lbFornecedoresTelefone);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, tfFornecedorTelefone, 19, SpringLayout.EAST, lbFornecedoresTelefone);
		sl_pnFornecedores.putConstraint(SpringLayout.EAST, tfFornecedorTelefone, 194, SpringLayout.EAST, lbFornecedoresTelefone);
		pnFornecedores.add(tfFornecedorTelefone);
		setTitle("Sistema de Controle de Estoque");
		setLocationRelativeTo(null);
		setTemas();
		setPainel(Paineis.PRODUTOS);
		limpaTelaProduto();
		tfFornecedorCNPJ.setFormatterFactory(
				new DefaultFormatterFactory(util.Mascara.cnpj()));
		tfFornecedorTelefone.setFormatterFactory(
				new DefaultFormatterFactory(util.Mascara.telefone()));
		
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 596);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnTitulo = new JPanel();
		pnTitulo.setPreferredSize(new Dimension(10, 70));
		pnTitulo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnTitulo.setBackground(new Color(204, 204, 153));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		pnTitulo.setLayout(null);
		
		lbLogo = new JLabel("");
		lbLogo.setBounds(53, 8, 64, 59);
		lbLogo.setIcon(new ImageIcon(Tela.class.getResource("/images/Logo3.png")));
		pnTitulo.add(lbLogo);
		
		lbTitulo = new JLabel("Sistema de Controle de Estoque");
		lbTitulo.setBounds(191, 16, 463, 39);
		lbTitulo.setForeground(Color.BLACK);
		lbTitulo.setBackground(Color.BLACK);
		lbTitulo.setFont(new Font("Georgia", Font.PLAIN, 33));
		pnTitulo.add(lbTitulo);
		
		pnMenu = new JPanel();
		pnMenu.setBorder(null);
		pnMenu.setBackground(new Color(255, 255, 153));
		contentPane.add(pnMenu, BorderLayout.WEST);
		pnMenu.setLayout(new GridLayout(6, 1, 0, 0));
		
		btProdutos = new JButton("Produtos");
		btProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPainel(Paineis.PRODUTOS);
			}
		});
		btProdutos.setForeground(new Color(0, 0, 0));
		btProdutos.setContentAreaFilled(false);
		btProdutos.setBorderPainted(false);
		btProdutos.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btProdutos);
		
		btClientes = new JButton("Clientes");
		btClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPainel(Paineis.CLIENTES);
				
			}
		});
		btClientes.setForeground(new Color(0, 0, 0));
		btClientes.setContentAreaFilled(false);
		btClientes.setBorderPainted(false);
		btClientes.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btClientes);
		
		btFornecedores = new JButton("Fornecedores");
		btFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPainel(Paineis.FORNECEDORES);
			}
		});
		btFornecedores.setForeground(new Color(0, 0, 0));
		btFornecedores.setContentAreaFilled(false);
		btFornecedores.setBorderPainted(false);
		btFornecedores.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btFornecedores);
		
		btEntrada = new JButton("Entrada");
		btEntrada.setForeground(new Color(0, 0, 0));
		btEntrada.setContentAreaFilled(false);
		btEntrada.setBorderPainted(false);
		btEntrada.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btEntrada);
		
		btSaida = new JButton("Sa\u00EDda");
		btSaida.setForeground(new Color(0, 0, 0));
		btSaida.setBorder(null);
		btSaida.setContentAreaFilled(false);
		btSaida.setBorderPainted(false);
		btSaida.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btSaida);
		
		btMovimentacao = new JButton("Movimenta\u00E7\u00E3o");
		btMovimentacao.setForeground(new Color(0, 0, 0));
		btMovimentacao.setContentAreaFilled(false);
		btMovimentacao.setBorderPainted(false);
		btMovimentacao.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btMovimentacao);
		
		pnRodape = new JPanel();
		pnRodape.setPreferredSize(new Dimension(13, 45));
		pnRodape.setBackground(new Color(51, 51, 51));
		contentPane.add(pnRodape, BorderLayout.SOUTH);
		pnRodape.setLayout(new FlowLayout(FlowLayout.RIGHT, 40, 6));
		
		lbTema = new JLabel("Tema:");
		lbTema.setForeground(new Color(255, 255, 255));
		pnRodape.add(lbTema);
		
		cbTema = new JComboBox();
		cbTema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLookAndFeel();
			}
		});
		cbTema.setModel(new DefaultComboBoxModel(new String[] {"Metal", "Nimbus", "CDE/Motif", "Windows", "Windows Classic"}));
		pnRodape.add(cbTema);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel == Paineis.PRODUTOS)listaProduto();
				else if (painel == Paineis.FORNECEDORES) listaFornecedor();
			}
		});
		btnListar.setFont(new Font("Calibri", Font.PLAIN, 14));
		pnRodape.add(btnListar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel == Paineis.PRODUTOS)listaProduto();
				else if (painel == Paineis.FORNECEDORES) listaFornecedor();
			}
		});
		btnLimpar.setFont(new Font("Calibri", Font.PLAIN, 14));
		pnRodape.add(btnLimpar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel == Paineis.PRODUTOS)limpaTelaProduto();
				else if (painel == Paineis.FORNECEDORES) limpaTelaFornecedor();
			}
		});
		btnCancelar.setFont(new Font("Calibri", Font.PLAIN, 14));
		pnRodape.add(btnCancelar);
		
		btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel == Paineis.PRODUTOS) gravaProduto();
				else if (painel == Paineis.FORNECEDORES) gravaFornecedor();
			}
		});
		btnGravar.setFont(new Font("Calibri", Font.PLAIN, 14));
		pnRodape.add(btnGravar);
		
		pnCentral = new JPanel();
		contentPane.add(pnCentral, BorderLayout.CENTER);
		pnCentral.setLayout(new CardLayout(0, 0));
		
		pnProdutos = new JPanel();
		pnCentral.add(pnProdutos,Paineis.PRODUTOS.toString());
		
		lbProdutos = new JLabel("Produtos");
		lbProdutos.setFont(new Font("Calibri", Font.BOLD, 34));
		
		lbProdutoID = new JLabel("C\u00F3digo:");
		lbProdutoID.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfProdutoID = new JTextField();
		tfProdutoID.setEnabled(false);
		tfProdutoID.setColumns(10);
		
		lbProdutoNome = new JLabel("Nome:");
		lbProdutoNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfProdutoNome = new JTextField();
		tfProdutoNome.setColumns(10);
		
		lbProdutoLocalizacao = new JLabel("Localiza\u00E7\u00E3o:");
		lbProdutoLocalizacao.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfProdutoLocalizacao = new JTextField();
		tfProdutoLocalizacao.setColumns(10);
		
		pnQtde = new JPanel();
		pnQtde.setFont(new Font("Calibri", Font.PLAIN, 14));
		pnQtde.setBorder(new TitledBorder(null, "Quantiades", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_pnProdutos = new GroupLayout(pnProdutos);
		gl_pnProdutos.setHorizontalGroup(
			gl_pnProdutos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnProdutos.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_pnProdutos.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbProdutoLocalizacao)
						.addComponent(lbProdutoNome))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnProdutos.createParallelGroup(Alignment.TRAILING)
						.addComponent(tfProdutoNome, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
						.addComponent(pnQtde, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
						.addComponent(tfProdutoLocalizacao, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
						.addGroup(gl_pnProdutos.createSequentialGroup()
							.addComponent(lbProdutoID)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfProdutoID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(100))
				.addGroup(gl_pnProdutos.createSequentialGroup()
					.addGap(226)
					.addComponent(lbProdutos)
					.addContainerGap(245, Short.MAX_VALUE))
		);
		gl_pnProdutos.setVerticalGroup(
			gl_pnProdutos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnProdutos.createSequentialGroup()
					.addGap(29)
					.addComponent(lbProdutos)
					.addGap(61)
					.addGroup(gl_pnProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfProdutoID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbProdutoID))
					.addGap(39)
					.addGroup(gl_pnProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfProdutoNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbProdutoNome))
					.addGap(34)
					.addGroup(gl_pnProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbProdutoLocalizacao)
						.addComponent(tfProdutoLocalizacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pnQtde, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		SpringLayout sl_pnQtde = new SpringLayout();
		pnQtde.setLayout(sl_pnQtde);
		
		lbProdutoQtdeMinima = new JLabel("M\u00EDnima");
		lbProdutoQtdeMinima.setFont(new Font("Calibri", Font.PLAIN, 15));
		sl_pnQtde.putConstraint(SpringLayout.WEST, lbProdutoQtdeMinima, 30, SpringLayout.WEST, pnQtde);
		pnQtde.add(lbProdutoQtdeMinima);
		
		tfProdutoQtdeMinima = new JTextField();
		sl_pnQtde.putConstraint(SpringLayout.WEST, tfProdutoQtdeMinima, 10, SpringLayout.WEST, pnQtde);
		sl_pnQtde.putConstraint(SpringLayout.EAST, tfProdutoQtdeMinima, 104, SpringLayout.WEST, pnQtde);
		pnQtde.add(tfProdutoQtdeMinima);
		tfProdutoQtdeMinima.setColumns(10);
		
		lbprodutoQtdeMaxima = new JLabel("M\u00E1xima");
		lbprodutoQtdeMaxima.setFont(new Font("Calibri", Font.PLAIN, 15));
		sl_pnQtde.putConstraint(SpringLayout.NORTH, lbProdutoQtdeMinima, 0, SpringLayout.NORTH, lbprodutoQtdeMaxima);
		pnQtde.add(lbprodutoQtdeMaxima);
		
		tfProdutoQtdeMaxima = new JTextField();
		sl_pnQtde.putConstraint(SpringLayout.WEST, tfProdutoQtdeMaxima, 22, SpringLayout.EAST, tfProdutoQtdeMinima);
		sl_pnQtde.putConstraint(SpringLayout.SOUTH, tfProdutoQtdeMaxima, -10, SpringLayout.SOUTH, pnQtde);
		sl_pnQtde.putConstraint(SpringLayout.NORTH, tfProdutoQtdeMinima, 0, SpringLayout.NORTH, tfProdutoQtdeMaxima);
		sl_pnQtde.putConstraint(SpringLayout.SOUTH, lbprodutoQtdeMaxima, -15, SpringLayout.NORTH, tfProdutoQtdeMaxima);
		pnQtde.add(tfProdutoQtdeMaxima);
		tfProdutoQtdeMaxima.setColumns(10);
		
		lbProdutoQtdeEstoque = new JLabel("Estoque");
		lbProdutoQtdeEstoque.setFont(new Font("Calibri", Font.PLAIN, 15));
		sl_pnQtde.putConstraint(SpringLayout.EAST, lbprodutoQtdeMaxima, -69, SpringLayout.WEST, lbProdutoQtdeEstoque);
		sl_pnQtde.putConstraint(SpringLayout.NORTH, lbProdutoQtdeEstoque, 0, SpringLayout.NORTH, lbProdutoQtdeMinima);
		sl_pnQtde.putConstraint(SpringLayout.EAST, lbProdutoQtdeEstoque, -68, SpringLayout.EAST, pnQtde);
		pnQtde.add(lbProdutoQtdeEstoque);
		
		tfProdutoQtdeEstoque = new JTextField();
		sl_pnQtde.putConstraint(SpringLayout.EAST, tfProdutoQtdeMaxima, -22, SpringLayout.WEST, tfProdutoQtdeEstoque);
		sl_pnQtde.putConstraint(SpringLayout.WEST, tfProdutoQtdeEstoque, 242, SpringLayout.WEST, pnQtde);
		sl_pnQtde.putConstraint(SpringLayout.EAST, tfProdutoQtdeEstoque, -40, SpringLayout.EAST, pnQtde);
		sl_pnQtde.putConstraint(SpringLayout.SOUTH, tfProdutoQtdeEstoque, -10, SpringLayout.SOUTH, pnQtde);
		pnQtde.add(tfProdutoQtdeEstoque);
		tfProdutoQtdeEstoque.setColumns(10);
		pnProdutos.setLayout(gl_pnProdutos);
		
		pnClientes = new JPanel();
		pnCentral.add(pnClientes,Paineis.CLIENTES.toString());
		
		lbClientes = new JLabel("Clientes");
		lbClientes.setFont(new Font("Calibri", Font.BOLD, 34));
		
		lbClientesID = new JLabel("C\u00F3digo:");
		lbClientesID.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfClientesID = new JTextField();
		tfClientesID.setColumns(10);
		
		lbClientesCPF = new JLabel("CPF:");
		lbClientesCPF.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfClientesCPF = new JTextField();
		tfClientesCPF.setColumns(10);
		
		lbClientesNome = new JLabel("Nome:");
		lbClientesNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfClientesNome = new JTextField();
		tfClientesNome.setColumns(10);
		
		lbClientesCelular = new JLabel("Celular:");
		lbClientesCelular.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfClientesCelular = new JTextField();
		tfClientesCelular.setColumns(10);
		
		lbClientesEmail = new JLabel("Email:");
		lbClientesEmail.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfClientesEmail = new JTextField();
		tfClientesEmail.setColumns(10);
		GroupLayout gl_pnClientes = new GroupLayout(pnClientes);
		gl_pnClientes.setHorizontalGroup(
			gl_pnClientes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnClientes.createSequentialGroup()
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnClientes.createSequentialGroup()
							.addGap(54)
							.addGroup(gl_pnClientes.createParallelGroup(Alignment.LEADING)
								.addComponent(lbClientesID)
								.addComponent(lbClientesCPF)
								.addComponent(lbClientesNome)
								.addComponent(lbClientesCelular)
								.addComponent(lbClientesEmail))
							.addGap(31)
							.addGroup(gl_pnClientes.createParallelGroup(Alignment.LEADING, false)
								.addComponent(tfClientesID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfClientesCPF, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfClientesNome, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
								.addComponent(tfClientesCelular, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfClientesEmail)))
						.addGroup(gl_pnClientes.createSequentialGroup()
							.addGap(234)
							.addComponent(lbClientes)))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_pnClientes.setVerticalGroup(
			gl_pnClientes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnClientes.createSequentialGroup()
					.addGap(27)
					.addComponent(lbClientes)
					.addGap(63)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbClientesID)
						.addComponent(tfClientesID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbClientesCPF)
						.addComponent(tfClientesCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbClientesNome)
						.addComponent(tfClientesNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbClientesCelular)
						.addComponent(tfClientesCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbClientesEmail)
						.addComponent(tfClientesEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		pnClientes.setLayout(gl_pnClientes);
		
		pnFornecedores = new JPanel();
		pnCentral.add(pnFornecedores,Paineis.FORNECEDORES.toString());
		
		lbFornecedores = new JLabel("Fornecedores");
		lbFornecedores.setFont(new Font("Calibri", Font.BOLD, 34));
		
		lbFornecedoresNome = new JLabel("Nome:");
		lbFornecedoresNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfFornecedorID = new JTextField();
		tfFornecedorID.setEnabled(false);
		tfFornecedorID.setColumns(10);
		
		lbFornecedoresCNPJ = new JLabel("CNPJ:");
		lbFornecedoresCNPJ.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfFornecedorNome = new JTextField();
		tfFornecedorNome.setColumns(10);
		
		lbFornecedoresTelefone = new JLabel("Telefone:");
		lbFornecedoresTelefone.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		tfFornecedorEmail = new JTextField();
		tfFornecedorEmail.setColumns(10);
		
		lbFornecedoresEmail = new JLabel("Email:");
		lbFornecedoresEmail.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		lbFornecedoresID = new JLabel("C\u00F3digo:");
		lbFornecedoresID.setFont(new Font("Calibri", Font.PLAIN, 18));
		sl_pnFornecedores = new SpringLayout();
		sl_pnFornecedores.putConstraint(SpringLayout.EAST, tfFornecedorNome, 489, SpringLayout.WEST, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, tfFornecedorEmail, 0, SpringLayout.NORTH, lbFornecedoresEmail);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, tfFornecedorEmail, 0, SpringLayout.WEST, tfFornecedorID);
		sl_pnFornecedores.putConstraint(SpringLayout.EAST, tfFornecedorEmail, 489, SpringLayout.WEST, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, tfFornecedorNome, 0, SpringLayout.NORTH, lbFornecedoresNome);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, tfFornecedorNome, 0, SpringLayout.WEST, tfFornecedorID);
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, tfFornecedorID, 0, SpringLayout.NORTH, lbFornecedoresID);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, tfFornecedorID, 17, SpringLayout.EAST, lbFornecedoresID);
		sl_pnFornecedores.putConstraint(SpringLayout.EAST, tfFornecedorID, 244, SpringLayout.WEST, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, lbFornecedores, 22, SpringLayout.NORTH, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, lbFornecedores, 187, SpringLayout.WEST, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, lbFornecedoresNome, 213, SpringLayout.NORTH, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, lbFornecedoresNome, 63, SpringLayout.WEST, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, lbFornecedoresCNPJ, 147, SpringLayout.NORTH, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, lbFornecedoresCNPJ, 71, SpringLayout.WEST, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, lbFornecedoresTelefone, 254, SpringLayout.NORTH, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, lbFornecedoresTelefone, 43, SpringLayout.WEST, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.SOUTH, lbFornecedoresTelefone, 324, SpringLayout.NORTH, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, lbFornecedoresID, 85, SpringLayout.NORTH, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, lbFornecedoresID, 57, SpringLayout.WEST, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, lbFornecedoresEmail, 342, SpringLayout.NORTH, pnFornecedores);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, lbFornecedoresEmail, 68, SpringLayout.WEST, pnFornecedores);
		pnFornecedores.setLayout(sl_pnFornecedores);
		pnFornecedores.add(lbFornecedoresEmail);
		pnFornecedores.add(lbFornecedoresID);
		pnFornecedores.add(lbFornecedoresTelefone);
		pnFornecedores.add(lbFornecedoresCNPJ);
		pnFornecedores.add(lbFornecedoresNome);
		pnFornecedores.add(tfFornecedorID);
		pnFornecedores.add(lbFornecedores);
		pnFornecedores.add(tfFornecedorNome);
		pnFornecedores.add(tfFornecedorEmail);
		
		tfFornecedorCNPJ = new JFormattedTextField();
		sl_pnFornecedores.putConstraint(SpringLayout.NORTH, tfFornecedorCNPJ, 42, SpringLayout.SOUTH, tfFornecedorID);
		sl_pnFornecedores.putConstraint(SpringLayout.WEST, tfFornecedorCNPJ, 17, SpringLayout.EAST, lbFornecedoresCNPJ);
		sl_pnFornecedores.putConstraint(SpringLayout.EAST, tfFornecedorCNPJ, 161, SpringLayout.EAST, lbFornecedoresCNPJ);
		pnFornecedores.add(tfFornecedorCNPJ);
		
		pnEntrada = new JPanel();
		pnCentral.add(pnEntrada, "name_1279885289016100");
		
		pnSaida = new JPanel();
		pnCentral.add(pnSaida, "name_1279969504573900");
		
		pnMovimentacao = new JPanel();
		pnCentral.add(pnMovimentacao, "name_1279988617614600");
	}

	private void setLookAndFeel() {
		String laf = (String) cbTema.getSelectedItem();
		Configura.LookAndFeel(laf);
		SwingUtilities.updateComponentTreeUI(this);
		this.repaint();
		
		
	}
	
	private void setTemas() {
		cbTema.removeAllItems();
		for (LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
			cbTema.addItem(info.getName());
			}
		cbTema.setSelectedItem("Windows");
		}
	
	private void setPainel(Paineis pn) {
		CardLayout cl = (CardLayout) pnCentral.getLayout();
		cl.show(pnCentral, pn.toString());
		painel = pn;
		
	}
	

	private void limpaTelaFornecedor() {
		tfFornecedorID.setText("");
		tfFornecedorCNPJ.setText("");
		tfFornecedorNome.setText("");
		tfFornecedorEmail.setText("");
		tfFornecedorTelefone.setText("");
		tfFornecedorCNPJ.requestFocus();
	}
	
	private void limpaTelaProduto() {
		tfProdutoID.setText("");
		tfProdutoNome.setText("");
		tfProdutoLocalizacao.setText("");
		tfProdutoQtdeMaxima.setText("");
		tfProdutoQtdeMinima.setText("");
		tfProdutoQtdeEstoque.setText("");
		tfProdutoID.requestFocus();
	}
	
	private void gravaFornecedor() {
		int id = Converte.toInt(tfFornecedorID.getText());
		String cnpj = tfFornecedorCNPJ.getText();
		String nome = tfFornecedorNome.getText();
		String email = tfFornecedorEmail.getText();
		String telefone = tfFornecedorTelefone.getText();
		new Fornecedor(cnpj,nome,telefone,email);
		limpaTelaFornecedor();
	}
	
	private void gravaProduto() {
		int id = Converte.toInt(tfProdutoID.getText());
		String nome = tfProdutoNome.getText();
		String localizacao = tfProdutoLocalizacao.getText();
		int qtdeMaxima = Integer.parseInt(tfProdutoQtdeMaxima.getText());
		int qtdeMinima = Integer.parseInt(tfProdutoQtdeMinima.getText());
		int qtdeEstoque = Integer.parseInt(tfProdutoQtdeEstoque.getText());
		Produto p = new Produto(id,nome,localizacao,
								qtdeMaxima,qtdeMinima,qtdeEstoque);
		//Principal.produtos.add(p);
		limpaTelaProduto();
	}
	
	private void listaProduto() {
		for (Produto p: Produto.getLista()) {
			System.out.println(p);
		}
	}
	private void listaFornecedor() {
		for (Fornecedor f: Fornecedor.getLista()) {
			System.out.println(f);
		}
		}
}

