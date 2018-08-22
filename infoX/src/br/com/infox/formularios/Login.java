package br.com.infox.formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
//importar recursos (java.sql.*) e ModuloConexao
import java.sql.*;
import br.com.infox.dal.ModuloConexao;

public class Login extends JFrame {
//variaveis e objetos
	Connection conexao = null;
	
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("infoX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(39, 29, 46, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(39, 71, 46, 14);
		contentPane.add(lblSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(105, 26, 254, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(105, 65, 254, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(327, 178, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Login.class.getResource("/br/com/infox/icones/dberror.png")));
		lblStatus.setBounds(110, 145, 32, 32);
		contentPane.add(lblStatus);
		//Establecer a conexão com o banco dentro do construtor apos criação de objetos
		conexao = ModuloConexao.conector();
		if(conexao != null) {	
			lblStatus.setIcon(new ImageIcon(Login.class.getResource("/br/com/infox/icones/dbok.png")));
			
		}else {
			lblStatus.setIcon(new ImageIcon(Login.class.getResource("/br/com/infox/icones/derror.png")));
		}
		
	}
}
