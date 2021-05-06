/**
 Aluno: Lucas Camacho 
RA: 0050015258
 */ 

package questao3;

import java.util.Scanner;

public class ClassTester {
		
	public static void main(String[] args) {
		
		Class1 type = new Class1();
		
		Class2 tipo = new Class2();
		
	    Scanner read = new Scanner(System.in);
	    	
	    String classe = "atribute";
	    
	    type.setAtribute(classe);
	    
	    System.out.println("Atributo original: " + classe);
	    
	    tipo.list();
	   	    
	    read.close();
	}

}
