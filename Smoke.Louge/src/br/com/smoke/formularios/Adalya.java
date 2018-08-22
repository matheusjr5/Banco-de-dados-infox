package br.com.smoke.formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Adalya extends JInternalFrame {
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adalya frame = new Adalya();
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
	public Adalya() {
		setIconifiable(true);
		setClosable(true);
		setTitle("Adalya");
		setBounds(100, 100, 409, 515);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 26, 304, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "Ess\u00EAncias", "Valor", "Estoque"
			}
		));
		table.setBounds(10, 57, 304, 417);
		getContentPane().add(table);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Adalya.class.getResource("/br/com/smoke/icones/pesquisar.png")));
		label.setBounds(324, 20, 32, 32);
		getContentPane().add(label);

	}

}
