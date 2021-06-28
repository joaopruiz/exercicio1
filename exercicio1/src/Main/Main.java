package Main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// comentario de commit 
		 System.out.println("teste 1");
		 
		 Scanner leitor = new Scanner(System.in);
	        int x = leitor.nextInt();
	        int cont = 0;
	        //int x = 0;

	//continue a solucao de acordo com o solicitado no enunciado
	        //System.out.println(" cont = " + cont);
	        
	        while (cont < 6) {
	        	//System.out.println("entrou");
	            if (  x % 2 == 1) {
	             System.out.println( x );
	             cont ++ ;
	            }
	         x++;
	        }
	}    
		
}
