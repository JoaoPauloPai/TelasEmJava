package br.com.jumbo.form;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.jumbo.threads.ImplementacaoFilaThread;
import br.com.jumbo.threads.ObjetoFilaThread;

public class TelaThreadFila extends JDialog {
	

	private JPanel jPnael = new JPanel(new GridBagLayout());//Painel de componentes
	private JButton jButton = new JButton("add Lista");
	private JButton jButton2 = new JButton("Stop");
	
	private JLabel descricao1 = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricao2 = new JLabel("Email");
	private JTextField mostraTempo2 = new JTextField();
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
    public TelaThreadFila(){//Executa o que estiver dentro ou na abertuda desse objeto
	setTitle("Tela de Fila com Thread");
	setSize(new Dimension(240, 240));
	setLocationRelativeTo(null);
	setResizable(false);
	//Primeira parte comcluida
	
	GridBagConstraints 	gridBagConstraints = new GridBagConstraints();//Gerenciador/controlador de componentes
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 0;
	gridBagConstraints.gridwidth = 2;
	gridBagConstraints.insets = new Insets(5,10,5,5);
	gridBagConstraints.anchor = GridBagConstraints.WEST;
	  
	descricao1.setPreferredSize(new Dimension(200, 25));
	jPnael.add(descricao1,gridBagConstraints);

	mostraTempo.setPreferredSize(new Dimension(200, 25));
	gridBagConstraints.gridy ++;
	jPnael.add(mostraTempo, gridBagConstraints);
	
	descricao2.setPreferredSize(new Dimension(200, 25));
	gridBagConstraints.gridy ++;
	jPnael.add(descricao2,gridBagConstraints);
	
	mostraTempo2.setPreferredSize(new Dimension(200, 25));
	gridBagConstraints.gridy ++;
	jPnael.add(mostraTempo2, gridBagConstraints);
	gridBagConstraints.gridwidth = 1;
	jButton.setPreferredSize(new Dimension(92,25));
	gridBagConstraints.gridy ++;
	jPnael.add(jButton,gridBagConstraints );
	
	jButton2.setPreferredSize(new Dimension(92,25));
	gridBagConstraints.gridx ++;
	jPnael.add(jButton2,gridBagConstraints );
	
	
	jButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			ObjetoFilaThread objetoFilaThread = new ObjetoFilaThread();
		
		
				}
	});
	
	
	jButton2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	
	
    fila.start();
	add(jPnael, BorderLayout.WEST);	
	setVisible(true); // sempre o ultimo a ser executado, *torna a tela visivel*
	}
}


