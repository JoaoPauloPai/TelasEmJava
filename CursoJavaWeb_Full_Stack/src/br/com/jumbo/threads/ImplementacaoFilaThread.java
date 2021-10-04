package br.com.jumbo.threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.JOptionPane;

public class ImplementacaoFilaThread extends Thread{
	
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
			            new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}	
	
	@Override
	public void run() {
		
		while(true) {
			
			Iterator interacao = pilha_fila.iterator();
			
		synchronized (interacao) {/*Bloqueia o acesso a lista por outros processos*/
			
			
			
			while(interacao.hasNext()) {/*Enquanto conter Dados na lista, irá processar*/
				
				ObjetoFilaThread procesar = (ObjetoFilaThread) interacao.next();/*Pega o objeto atual */
				
				/*Rotinas feitas 
				  Processar 10 mil notas Fiscais
				  Gerar um envio em massa de email
				  Gerar uma lista de PDF*/
				
				System.out.println("Processo N: "+procesar.getCod());
				System.out.println(procesar.getEmail());
				System.out.println(procesar.getNome());
				
				
		
				interacao.remove();/*Remove os dados da lista*/
			
				
				try {
					Thread.sleep(1000);/*Dar um tempo para descarga de memória*/
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		}
		try {	
			Thread.sleep(1000);/*Processou toda a lista, outro tempo para descarga de memória*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		}
		
	
		
		
		
	}
	


}
