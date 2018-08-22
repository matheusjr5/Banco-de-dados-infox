package br.com.infox.formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import br.com.infox.dal.ModuloConexao;





public class Usuario extends JInternalFrame {
	
	/* Objetos e variaveis para trabalhar com o sql */
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	/********* Métodos *******/
	/* Pesquisar Usuário */
	private void pesquisar() {
		String pesquisar = "select * from tb_usuarios where idusers=?";
		//tratamento de exceções
		try {
		//a linha abaixo prepara "digita" o comando sql
			pst = conexao.prepareStatement(pesquisar);
			//a linha abaixo substitui o parámetro ? pelo que foi digitado na caixa de texto txtUsuId
			
			pst.setString(1, txtUsuId.getText());
			//a linha abaixo executa o comando
			rs = pst.executeQuery();
			//estrutura que verifica se existe um usuário cadastro
			if (rs.next()) {
				//preencher os campos do formulario
				txtUsuNome.setText(rs.getString(2));
				txtUsuFone.setText(rs.getString(6));
				txtUsuLogin.setText(rs.getString(3));
				txtUsuSenha.setText(rs.getString(4));
				
				//combo box
				txtUsuPerfil.setText(rs.getString(5));
			}else {
				//mensagem se não existir um usuário cadastrado
				JOptionPane.showMessageDialog(null, "Usuarios não cadastrado");
				limpar();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/*método para adcionar usuarios*/
	private void adcionar() {
		String inserir = "insert into tb_usuarios(idusers,usuario,login,senha,perfil,fone) values (?,?,?,?,?,?)";
		try {
			
				pst = conexao.prepareStatement(inserir);
				pst.setString(1, txtUsuId.getText());
				pst.setString(2, txtUsuNome.getText());
				pst.setString(3, txtUsuLogin.getText());
				pst.setString(4, txtUsuSenha.getText());
				pst.setString(5, txtUsuPerfil.getText());
				pst.setString(6, txtUsuFone.getText());
				//criando uma variável para executar a query e exibir uma mensagem ao usuário
				pst.executeUpdate();
				
				
	} catch (Exception e) {
		System.out.println(e);
	}
	}
	/*Metodo para limpar os campos */
	private void limpar(){
	
	txtUsuId.setText(null);
	txtUsuNome.setText(null);
	txtUsuFone.setText(null);
	txtUsuLogin.setText(null);
	txtUsuSenha.setText(null);
	txtUsuPerfil.setText(null);
	
	}
	
	private JTextField txtUsuId;
	private JTextField txtUsuNome;
	private JTextField txtUsuFone;
	private JTextField txtUsuLogin;
	private JTextField txtUsuSenha;
	private JTextField txtUsuPerfil;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario() {
		setIconifiable(true);
		setClosable(true);
		setTitle("Usuario");
		setBounds(100, 100, 640, 480);
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(10, 42, 14, 14);
		getContentPane().add(lblId);
		
		txtUsuId = new JTextField();
		txtUsuId.setBounds(73, 39, 86, 20);
		getContentPane().add(txtUsuId);
		txtUsuId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 80, 46, 14);
		getContentPane().add(lblNome);
		
		txtUsuNome = new JTextField();
		txtUsuNome.setBounds(73, 77, 313, 20);
		getContentPane().add(txtUsuNome);
		txtUsuNome.setColumns(10);
		
		JLabel lblFone = new JLabel("Fone");
		lblFone.setBounds(10, 111, 46, 14);
		getContentPane().add(lblFone);
		
		txtUsuFone = new JTextField();
		txtUsuFone.setBounds(73, 108, 137, 20);
		getContentPane().add(txtUsuFone);
		txtUsuFone.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(17, 150, 46, 14);
		getContentPane().add(lblLogin);
		
		txtUsuLogin = new JTextField();
		txtUsuLogin.setBounds(73, 147, 101, 20);
		getContentPane().add(txtUsuLogin);
		txtUsuLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(255, 150, 46, 14);
		getContentPane().add(lblSenha);
		
		txtUsuSenha = new JTextField();
		txtUsuSenha.setBounds(300, 147, 101, 20);
		getContentPane().add(txtUsuSenha);
		txtUsuSenha.setColumns(10);
		
		JLabel lblPerfil = new JLabel("Perfil");
		lblPerfil.setBounds(457, 150, 46, 14);
		getContentPane().add(lblPerfil);
		
		JButton btnUsuAdicionar = new JButton("");
		btnUsuAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adcionar();
			}
		});
		btnUsuAdicionar.setIcon(new ImageIcon(Usuario.class.getResource("/br/com/infox/icones/create.png")));
		btnUsuAdicionar.setToolTipText("Adicionar Usu\u00E1rio");
		btnUsuAdicionar.setBounds(170, 297, 80, 80);
		getContentPane().add(btnUsuAdicionar);
		
		//botão pesuisar
		JButton btnUsuPesquisar = new JButton("");
		btnUsuPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisar();
			}
		});
		
		btnUsuPesquisar.setIcon(new ImageIcon(Usuario.class.getResource("/br/com/infox/icones/read.png")));
		btnUsuPesquisar.setToolTipText("Pesquisar Usu\u00E1rio");
		btnUsuPesquisar.setBounds(260, 297, 80, 80);
		getContentPane().add(btnUsuPesquisar);
		
		
		JButton btnUsuAtualizar = new JButton("");
		btnUsuAtualizar.setIcon(new ImageIcon(Usuario.class.getResource("/br/com/infox/icones/update.png")));
		btnUsuAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUsuAtualizar.setToolTipText("Alterar Usu\u00E1rio");
		btnUsuAtualizar.setBounds(350, 297, 80, 80);
		getContentPane().add(btnUsuAtualizar);
		
		JButton btnUsuDeletar = new JButton("");
		btnUsuDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnUsuDeletar.setIcon(new ImageIcon(Usuario.class.getResource("/br/com/infox/icones/delete.png")));
		btnUsuDeletar.setToolTipText("Remover Usu\u00E1rio");
		btnUsuDeletar.setBounds(440, 297, 80, 80);
		getContentPane().add(btnUsuDeletar);
		
		txtUsuPerfil = new JTextField();
		txtUsuPerfil.setBounds(487, 147, 86, 20);
		getContentPane().add(txtUsuPerfil);
		txtUsuPerfil.setColumns(10);
		
		//IMPORTANTE !!! -->Usar o metodo conector() do Módulo de Conexão
		conexao = ModuloConexao.conector();

	}
}
