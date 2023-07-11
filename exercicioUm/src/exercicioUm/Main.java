package exercicioUm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import SeparadorDeNumeros.Separador;



public class Main {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Separador separador = new Separador();
		
		List<Integer>pares = new ArrayList<Integer>();
	    List<Integer>impares = new ArrayList<Integer>();
		
		System.out.println("digite o total de numeros que deseja organizar:");
        Integer total = sc.nextInt();
		separador.setTotalDeNumeros(total);
        for( int i =1  ;  i<=separador.getTotalDeNumeros();i++) {
        	System.out.println("digite o " + i + "  numero que deseja adicionar na lista para verificaçao: ");
        	Integer num = sc.nextInt();
        	if(separador.verificador(num).equalsIgnoreCase("par")) {
        		pares.add(num);
        	}
        	else {
        		impares.add(num);
        	}
         }
       pares.sort(null);
       impares.sort(null);
       Collections.reverse(impares);
        
       
       System.out.println("numeros em ordem , dos pares para os impares:");
        for (Integer x : pares) {
			System.out.println(x);
		}
		for (Integer y : impares) {
			System.out.println(y);
		}
		
		
		
		
		sc.close();
	}

}
