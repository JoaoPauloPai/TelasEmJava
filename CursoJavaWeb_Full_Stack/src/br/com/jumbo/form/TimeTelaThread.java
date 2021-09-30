package br.com.jumbo.form;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.plaf.DimensionUIResource;

public class TimeTelaThread extends JDialog{

	public TimeTelaThread() {//Executa o que estiver dentro ou na abertuda desse objeto
	setTitle("Tela de Time com Thread");
	setSize(new Dimension(240, 240));
	setLocationRelativeTo(null);
	setResizable(false);
	//Primeira parte comcluida
	
	//GridBagConstraints 	gridBagConstraints = new GridBagConstraints();

	
		
	setVisible(true); // sempre o ultimo a ser executado, *torna a tela visivel*
	}
}
