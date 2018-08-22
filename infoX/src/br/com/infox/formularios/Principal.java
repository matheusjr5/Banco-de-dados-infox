package br.com.infox.formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel painelPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setTitle("infoX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmOs = new JMenuItem("OS");
		mntmOs.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/os.png")));
		mnCadastro.add(mntmOs);
		//menu Usuario
		JMenuItem mntmUsurio = new JMenuItem("Usu\u00E1rio");
		mntmUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Usuario usuario = new Usuario();
			usuario.setVisible(true);
			painelPrincipal.add(usuario);
			}
			
		});
		mntmUsurio.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/usuarios.png")));
		mnCadastro.add(mntmUsurio);
		//menu cliente
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// as linhas abaixo exibem o internal Jframe dentro do painel principal
				Cliente cliente = new Cliente();
				cliente.setVisible(true);
				painelPrincipal.add(cliente);
			}
		});
		mntmCliente.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/clientes.png")));
		mnCadastro.add(mntmCliente);
		
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		menuBar.add(mnRelatrios);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/relatorio.png")));
		mnRelatrios.add(mntmClientes);
		
		JMenuItem mntmServios = new JMenuItem("Servi\u00E7os");
		mntmServios.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/relatorio.png")));
		mnRelatrios.add(mntmServios);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmManual = new JMenuItem("Manual");
		mntmManual.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/manual.png")));
		mnAjuda.add(mntmManual);
		//Menu ->Sobre
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//as linhas abaixo exibem o Jframe
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
				
			}
		});
		mntmSobre.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/sobre.png")));
		mnAjuda.add(mntmSobre);
		
		JMenu mnOpes = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnOpes);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/sair.png")));
		mnOpes.add(mntmSair);
		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		painelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(painelPrincipal);
	}

}
