/*
 Nome: Lucas Camacho
 Matrícula: 0050015258
 */ 
package questao1;

import java.util.ArrayList;

public class JanelaTester {

	public static void main(String[] args) {
		   
		Splash janela1 = new Splash();
		        
        ArrayList<Splash> state = new ArrayList<Splash>();
        state.add(janela1);
       
        janela1.open(state);
        janela1.close(state);
        
	}

}
