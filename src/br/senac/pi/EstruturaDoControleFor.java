package br.senac.pi;
												
public class EstruturaDoControleFor {
	public static void main(String[] args) throws InterruptedException{
	 int i = 5;
      while(i > 0){
    	  System.out.println("contagem regressiva... "+ i );
    	  i--;
    	  Thread.sleep(1000);
      }
      System.out.println("BOOOOOOOOOM"); 
      
	}

}
