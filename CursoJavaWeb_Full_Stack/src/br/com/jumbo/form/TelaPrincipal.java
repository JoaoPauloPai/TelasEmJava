package br.com.jumbo.form;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.jumbo.threads.ObjetoFilaThread;

public class TelaPrincipal extends JDialog{

	private JPanel jPnael = new JPanel(new GridBagLayout());//Painel de componentes
	
	private JLabel descricao1 = new JLabel("Chamar Tela ThreaTime");
	private JButton jButton = new JButton("THREAD");

	private JLabel descricao2 = new JLabel("Chamar Tela FilaTrhead");
	private JButton jButton2 = new JButton("THREAD");
	
	public TelaPrincipal() {
		setTitle("TELA PRINCIPAL DO SISTEMA");
		setSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		setResizable(false);
		

		
		GridBagConstraints 	gridBagConstraints = new GridBagConstraints();//Gerenciador/controlador de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5,10,5,5);
		gridBagConstraints.anchor = gridBagConstraints.EAST;
		
		
		  
		descricao1.setPreferredSize(new Dimension(200, 25));
		jPnael.add(descricao1,gridBagConstraints);
		jButton.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridy ++;
		jPnael.add(jButton,gridBagConstraints );
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.gridy ++;
		
		descricao2.setPreferredSize(new Dimension(200, 25));
		jPnael.add(descricao2,gridBagConstraints);
		gridBagConstraints.gridy ++;
		gridBagConstraints.gridwidth = 1;
		jButton.setPreferredSize(new Dimension(92,25));
		jPnael.add(jButton2,gridBagConstraints );
		
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.gridy ++;
		
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				TimeTelaThread telaThread = new TimeTelaThread();
			
			
					}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				TelaThreadFila telaThreadFila = new TelaThreadFila();
			}
		});
		
		
		  
	
		
		
		add(jPnael, BorderLayout.WEST);
		setVisible(true); // sempre o ultimo a ser executado, *torna a tela visivel*
	}
}
