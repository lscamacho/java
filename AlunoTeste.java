package exercicio3;

import java.util.Scanner;

public class AlunoTeste{
	
	public static void main (String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String mat, name, course;
		
		Aluno aluno = new Aluno();
		
    	//aluno.listar();
    	
    	System.out.print("Digite sua matricula: ");
    	mat = read.nextLine();
    	System.out.print("Digite seu nome: ");
    	name = read.nextLine();
    	System.out.print("Digite seu curso: ");
    	course = read.nextLine();
    	
    	if (course.equalsIgnoreCase("si")){
    		course = "Sistemas de Informacao";
    	}
    	
    	aluno.setMatricula(mat);
      	aluno.setNome(name);
    	aluno.setCurso(course);
    	aluno.listar();
    	
 
		
	}
}