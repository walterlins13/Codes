package modular;

import java.util.Scanner;

public class Mod {
    public static void menu() {
    	System.out.println("Opções de conversão:");
    	System.out.println("");
    	System.out.println("1 = Conversão para graus Celsius");
    	System.out.println("2 = Conversão para graus Farenheit");
    	System.out.println("");
    	System.out.println("Informe a opção de conversão:");
    }
	public static double conversaocelsius(double f) {
    	double c;
    	c = (f - 32) / 1.8;
    	return c;
    }
    public static double conversaofarenheit(double c) {
    	double f;
    	f = (c * 1.8) + 32;
	    return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        double c, f;
        char resp;
        int conversao;
        
        do {
        	System.out.println("");
        	System.out.println("Programa de conversão de temperaturas");
        	System.out.println("");
        	menu();
        	conversao = in.nextInt();
        	while(conversao != 1 && conversao != 2) {
        		System.out.println("Opção inválida. Por favor, tente novamente:");
        	    conversao = in.nextInt();
        	}
        	if(conversao == 1) {
        		System.out.println("Informe a temperatura em graus Farenheit:");
        		f = in.nextDouble();
        		System.out.println("Temperatura em graus Celsius: " + conversaocelsius(f));
        	}
        	if(conversao == 2) {
        		System.out.println("Informe a temperatura em graus Celsius:");
        		c = in.nextDouble();
        		System.out.println("Temperatura em graus Farenheit: " + conversaofarenheit(c));
        	}
        	System.out.println("");
        	System.out.println("Gostaria de finalizar a execução do programa? (S para sim / N para não)");
            resp = in.next().charAt(0);
            resp = Character.toLowerCase(resp);
            while(resp != 's' && resp != 'n') {
            	System.out.println("Resposta inválida. Por favor, tente novamente:");
            	resp = in.next().charAt(0);
                resp = Character.toLowerCase(resp);
            }
       }while(resp == 'n');
	}
}
