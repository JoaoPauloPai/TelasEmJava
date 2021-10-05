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

import br.com.jumbo.date.DataForm;
import br.com.jumbo.threads.ObjetoFilaThread;

public class TelaPrincipal extends JDialog{

	private JPanel jPnael = new JPanel(new GridBagLayout());//Painel1 de componentes
	
	private JLabel descricao1 = new JLabel("Trhead em Tempo Real");
	private JButton jButton1 = new JButton("THREAD");
	
	private JLabel descricao2 = new JLabel("Tela Fila Trhead");
	private JButton jButton2 = new JButton("THREAD");
	
	private JLabel descricao3 = new JLabel("    Datas");
	private JButton jButton3 = new JButton("Data");
	
	public TelaPrincipal() {
		setTitle("TELA PRINCIPAL DO SISTEMA");
		setSize(new Dimension(300, 500));
		setLocationRelativeTo(null);
		setResizable(false);
		

		
		GridBagConstraints 	gridBagConstraints = new GridBagConstraints();//Gerenciador/controlador de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5,10,5,5);
		gridBagConstraints.anchor = gridBagConstraints.EAST;
		
		gridBagConstraints . gridy ++ ;
		gridBagConstraints.gridwidth = 2;
		descricao1.setPreferredSize(new Dimension(200, 25));
	    jPnael.add(descricao1,gridBagConstraints);
	    jButton1.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy ++;
		gridBagConstraints.gridwidth = 1;
		jPnael.add(jButton1,gridBagConstraints );
		
		gridBagConstraints . gridy ++ ;
		gridBagConstraints.gridwidth = 2;
		descricao2.setPreferredSize(new Dimension(200, 25));
	    jPnael.add(descricao2,gridBagConstraints);
	    jButton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy ++;
		gridBagConstraints.gridwidth = 1;
		jPnael.add(jButton2,gridBagConstraints );
		
		gridBagConstraints . gridy ++ ;
		gridBagConstraints.gridwidth = 2;
		descricao3.setPreferredSize(new Dimension(200, 25));
	    jPnael.add(descricao3,gridBagConstraints);
	    jButton3.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy ++;
		gridBagConstraints.gridwidth = 1;
		jPnael.add(jButton3,gridBagConstraints );
		
		
		
		jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				TimeTelaThread telaThread = new TimeTelaThread();
			
			
					}
		});
	jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			//	TimeTelaThread timeTelaThread = new TimeTelaThread();
				TelaThreadFila telaThreadFila = new TelaThreadFila();
			
			}
		});
	
	jButton3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			DataForm dataForm = new DataForm();
		
		}
	});
		

		add(jPnael, BorderLayout.WEST);
		setVisible(true); // sempre o ultimo a ser executado, *torna a tela visivel*
	}
	
	
	
	
}
