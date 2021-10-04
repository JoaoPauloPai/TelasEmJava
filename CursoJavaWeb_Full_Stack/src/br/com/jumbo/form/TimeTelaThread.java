package br.com.jumbo.form;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;


public class TimeTelaThread extends JDialog{
	
	private JPanel jPnael = new JPanel(new GridBagLayout());//Painel de componentes
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private Runnable thread1 = new Runnable() {
		@Override
		public void run() {
			while(true) {// Rodando enquanto condição for verdadeiro
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
			
			
		}
	};
	private Runnable thread2 = new Runnable() {
		@Override
		public void run() {
			while(true) {// Rodando enquanto condição for verdadeiro
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(2000);
				}catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
			
			
		}
	};

	private Thread thread1Time;
	private Thread thread2Time;

	public TimeTelaThread() {//Executa o que estiver dentro ou na abertuda desse objeto
	setTitle("Tela de Time com Thread");
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
	  
	descricaoHora.setPreferredSize(new Dimension(200, 25));
	jPnael.add(descricaoHora,gridBagConstraints);

	mostraTempo.setPreferredSize(new Dimension(200, 25));
	mostraTempo.setEditable(false);
	gridBagConstraints.gridy ++;
	jPnael.add(mostraTempo, gridBagConstraints);
	
	descricaoHora2.setPreferredSize(new Dimension(200, 25));
	gridBagConstraints.gridy ++;
	jPnael.add(descricaoHora2,gridBagConstraints);
	
	mostraTempo2.setPreferredSize(new Dimension(200, 25));
	mostraTempo2.setEditable(false);
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
			thread1Time = new Thread(thread1);
			thread1Time.start();
			thread2Time = new Thread(thread2);
			thread2Time.start();
			jButton.setEnabled(false);
			jButton2.setEnabled(true);
		}
	});
	
	
	jButton2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			thread1Time.stop();
			thread2Time.stop();
			jButton.setEnabled(true);
			jButton2.setEnabled(false);
		}
	});
	
	jButton2.setEnabled(false);
	
	add(jPnael, BorderLayout.WEST);	
	setVisible(true); // sempre o ultimo a ser executado, *torna a tela visivel*
	}
}
