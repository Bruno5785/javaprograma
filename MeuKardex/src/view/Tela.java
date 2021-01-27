package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import util.Configura;

public class Tela extends JFrame {

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
		initComponents();
		setTitle("Sistema de Controle de Estoque");
		setLocationRelativeTo(null);
		setTemas();
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
		btProdutos.setForeground(new Color(0, 0, 0));
		btProdutos.setContentAreaFilled(false);
		btProdutos.setBorderPainted(false);
		btProdutos.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btProdutos);
		
		btClientes = new JButton("Clientes");
		btClientes.setForeground(new Color(0, 0, 0));
		btClientes.setContentAreaFilled(false);
		btClientes.setBorderPainted(false);
		btClientes.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btClientes);
		
		btFornecedores = new JButton("Fornecedores");
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
		pnRodape.setPreferredSize(new Dimension(10, 45));
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
		btnListar.setFont(new Font("Calibri", Font.PLAIN, 14));
		pnRodape.add(btnListar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Calibri", Font.PLAIN, 14));
		pnRodape.add(btnLimpar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Calibri", Font.PLAIN, 14));
		pnRodape.add(btnCancelar);
		
		btnGravar = new JButton("Gravar");
		btnGravar.setFont(new Font("Calibri", Font.PLAIN, 14));
		pnRodape.add(btnGravar);
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
		}
		
		
	}

