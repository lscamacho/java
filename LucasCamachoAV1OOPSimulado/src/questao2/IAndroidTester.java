/*
 Nome: Lucas Camacho
 Matrícula: 0050015258
 */ 
package questao2;

import java.util.Scanner;


public class IAndroidTester {

	public static void main(String[] args) {
		CellPhone cp = new IAndroid();

		IAndroid mark = new IAndroid();
		
		Scanner read = new Scanner(System.in);
		
		String type;
		
		System.out.print("Digite a marca do celular: ");
	    type = read.nextLine();
	    
	    mark.setModel(type);
	    
	    mark.show_model();
		
		cp.ligar();
		cp.desligar();
		
		read.close();

	}

}
