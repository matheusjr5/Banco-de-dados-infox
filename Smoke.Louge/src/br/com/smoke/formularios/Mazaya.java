package br.com.smoke.formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Mazaya extends JInternalFrame {
	private JTextField textField;
	private JTable table;
	private JLabel lblNewLabel_1;
	public Mazaya() {
		setClosable(true);
		setIconifiable(true);
		setTitle("Mazaya");
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
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "Ess\u00EAncias", "Valor", "Estoque"
			}
		));
		table.setBounds(10, 57, 304, 411);
		getContentPane().add(table);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Zomo.class.getResource("/br/com/smoke/icones/pesquisar.png")));
		lblNewLabel_1.setBounds(324, 20, 38, 37);
		getContentPane().add(lblNewLabel_1);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mazaya frame = new Mazaya();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		}
