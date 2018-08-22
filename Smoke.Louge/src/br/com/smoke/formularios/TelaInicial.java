package br.com.smoke.formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setResizable(false);
		setTitle("Smoke");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 530);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEssncias = new JMenu("Ess\u00EAncias");
		menuBar.add(mnEssncias);
		
		// Menu Zomo
		JMenuItem mntmZomo = new JMenuItem("Zomo");
		mntmZomo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Zomo zomo = new Zomo();
				zomo.setVisible(true);
				contentPane.add(zomo);
			}
		});
		mntmZomo.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/smoke/icones/zomo(1).png")));
		mnEssncias.add(mntmZomo);
		
		//menu Adalya
		JMenuItem mntmAdalya = new JMenuItem("Adalya");
		mntmAdalya.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Adalya adalya = new Adalya();
				adalya.setVisible(true);
				contentPane.add(adalya);
			
				
			}
		});
		mntmAdalya.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/smoke/icones/adalya(1).png")));
		mnEssncias.add(mntmAdalya);
		
		//menu Nay
		JMenuItem mntmNay = new JMenuItem("Nay");
		mntmNay.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Nay nay = new Nay();
				nay.setVisible(true);
				contentPane.add(nay);
			}
			
		});
		mntmNay.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/smoke/icones/nay(1).png")));
		mnEssncias.add(mntmNay);
		
		
		//Menu Mazaya
		JMenuItem mntmMazaya = new JMenuItem("Mazaya");
		mntmMazaya.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Mazaya mazaya = new Mazaya();
				mazaya.setVisible(true);
				contentPane.add(mazaya);
			
			}
		});
		mntmMazaya.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/smoke/icones/mazaya (1).png")));
		mnEssncias.add(mntmMazaya);
		
		JMenu mnNarguiles = new JMenu("Narguiles");
		menuBar.add(mnNarguiles);
		
		JMenuItem mntmGrande = new JMenuItem("Grande");
		mntmGrande.setIcon(null);
		mnNarguiles.add(mntmGrande);
		
		JMenuItem mntmMdio = new JMenuItem("M\u00E9dio");
		mntmMdio.setIcon(null);
		mnNarguiles.add(mntmMdio);
		
		JMenuItem mntmPequeno = new JMenuItem("Pequeno");
		mntmPequeno.setIcon(null);
		mnNarguiles.add(mntmPequeno);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/smoke/icones/sobre.png")));
		mnAjuda.add(mntmSobre);
		
		JMenuItem mntmContatenos = new JMenuItem("Contate-nos");
		mntmContatenos.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/smoke/icones/relatorio.png")));
		mnAjuda.add(mntmContatenos);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon(TelaInicial.class.getResource("/br/com/smoke/icones/sair.png")));
		mnAjuda.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
