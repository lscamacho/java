/*Aluno: Lucas da Silva Camacho 
RA: 0050015258*/

package Exercicio2;
import java.util.Scanner;

public class ExercicioTabuada2{
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num;
			
			System.out.println("Digite um numero:");
			num = sc.nextInt();
				
			for(int i=0; i<=10; i++) {
				
					int result = i+num;
					System.out.printf(" %d + %d = %d \n", num, i, result);
				
				}
			
		}
	
}
