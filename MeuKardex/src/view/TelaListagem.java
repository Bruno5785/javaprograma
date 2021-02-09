package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import model.Produto;

public class TelaListagem extends JFrame {

	private JPanel contentPane;
	private JPanel pnTitulo;
	private JLabel lbLogo;
	private JLabel lbTitulo;
	private JPanel pnCentral;
	private JScrollPane scrollPane;
	private JTable tabela;

	
	/**
	 * Create the frame.
	 */
	public TelaListagem() {
		initComponents();
		setTitle("<<Sistema de Controle de Estoque>>");
		atualizaTabela();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 805, 555);
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
		lbLogo.setIcon(new ImageIcon(TelaListagem.class.getResource("/images/Logo3.png")));
		lbLogo.setBounds(53, 8, 64, 59);
		pnTitulo.add(lbLogo);
		
		lbTitulo = new JLabel("Sistema de Controle de Estoque");
		lbTitulo.setForeground(Color.BLACK);
		lbTitulo.setFont(new Font("Georgia", Font.PLAIN, 33));
		lbTitulo.setBackground(Color.BLACK);
		lbTitulo.setBounds(191, 16, 463, 39);
		pnTitulo.add(lbTitulo);
		
		pnCentral = new JPanel();
		contentPane.add(pnCentral, BorderLayout.CENTER);
		pnCentral.setLayout(new BoxLayout(pnCentral, BoxLayout.X_AXIS));
		
		scrollPane = new JScrollPane();
		pnCentral.add(scrollPane);
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(tabela);
	}
	
	private void atualizaTabela() {
		tabela.setModel(Produto.getTableModel());
		DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
		centro.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		tabela.getTableHeader().setDefaultRenderer(centro);
		
		tabela.getColumnModel().getColumn(0).setCellRenderer(centro);
		tabela.getColumnModel().getColumn(3).setCellRenderer(centro);
		tabela.getColumnModel().getColumn(1).setCellRenderer(centro);
		tabela.getColumnModel().getColumn(2).setCellRenderer(centro);
		tabela.getColumnModel().getColumn(4).setCellRenderer(centro);
		tabela.getColumnModel().getColumn(5).setCellRenderer(centro);
		tabela.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);
		tabela.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(260);
		tabela.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(260);
		tabela.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(70);
		tabela.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(70);
		tabela.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(70);
		
		
		
	}
	}

