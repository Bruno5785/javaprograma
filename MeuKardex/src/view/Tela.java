package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

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
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnTitulo = new JPanel();
		pnTitulo.setBackground(new Color(102, 51, 153));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		
		lbTitulo = new JLabel("Sistema de Controle de Estoque");
		lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setBackground(Color.WHITE);
		lbTitulo.setFont(new Font("Georgia", Font.PLAIN, 33));
		pnTitulo.add(lbTitulo);
		
		pnMenu = new JPanel();
		pnMenu.setBackground(Color.WHITE);
		contentPane.add(pnMenu, BorderLayout.WEST);
		pnMenu.setLayout(new GridLayout(6, 1, 0, 0));
		
		btProdutos = new JButton("Produtos");
		btProdutos.setContentAreaFilled(false);
		btProdutos.setBorderPainted(false);
		btProdutos.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btProdutos);
		
		btClientes = new JButton("Clientes");
		btClientes.setContentAreaFilled(false);
		btClientes.setBorderPainted(false);
		btClientes.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btClientes);
		
		btFornecedores = new JButton("Fornecedores");
		btFornecedores.setContentAreaFilled(false);
		btFornecedores.setBorderPainted(false);
		btFornecedores.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btFornecedores);
		
		btEntrada = new JButton("Entrada");
		btEntrada.setContentAreaFilled(false);
		btEntrada.setBorderPainted(false);
		btEntrada.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btEntrada);
		
		btSaida = new JButton("Sa\u00EDda");
		btSaida.setContentAreaFilled(false);
		btSaida.setBorderPainted(false);
		btSaida.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btSaida);
		
		btMovimentacao = new JButton("Movimenta\u00E7\u00E3o");
		btMovimentacao.setContentAreaFilled(false);
		btMovimentacao.setBorderPainted(false);
		btMovimentacao.setFont(new Font("Calibri", Font.BOLD, 23));
		pnMenu.add(btMovimentacao);
		
		pnRodape = new JPanel();
		pnRodape.setBackground(Color.BLACK);
		contentPane.add(pnRodape, BorderLayout.SOUTH);
		pnRodape.setLayout(new FlowLayout(FlowLayout.RIGHT, 40, 6));
		
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

}