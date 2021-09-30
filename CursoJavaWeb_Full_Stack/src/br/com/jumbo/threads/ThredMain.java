package br.com.jumbo.threads;

import java.lang.*;



public class ThredMain {
	public static void main(String[] args) throws Exception {
		
		               Thread threadEmail   =  new Thread(thread1);
		                threadEmail.start();
		                
		                Thread threadNotaFiscal   =  new Thread(thread1);
		                threadNotaFiscal.start();
		
		
	
		
	
		
		
		//Código do usuário no fluxo de trabalho
		System.out.println("Codigo Rodando");
		
		}
	
	    private static Runnable thread2 = new Runnable() {
			
			@Override
			public void run() {
				//Código da rotina rodando em paralelo 
				for(int pos = 0 ; pos <10; pos++) {
					
					try {
						//Executar com tempo de parada, ou tempo determinado;
						System.out.println("Executando rotinas, Envio de Nota Fiscal");
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				}

			}
				
			};
		
	     
	
		private static Runnable thread1 = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub

				//Código da rotina rodando em paralelo 
				for(int pos = 0 ; pos <10; pos++) {
					
					try {
						//Executar com tempo de parada, ou tempo determinado;
						System.out.println("Executando rotinas, Eviando Email");
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				}
				
				
			}
		};
		
	}



