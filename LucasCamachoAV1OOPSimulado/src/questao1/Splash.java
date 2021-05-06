/*
 Nome: Lucas Camacho
 Matrícula: 0050015258
 */ 
package questao1;

import java.util.ArrayList;

public class Splash implements IJanela {
	
	private String abre;
	private String fecha;

	public String getOpen() {
        return abre;
    }
    public void setOpen(String abre) {
        this.abre = abre;
    }
    
    public String getClose() {
        return fecha;
    }
    public void setClose(String fecha) {
        this.fecha = fecha;
    }
    
	@Override
    public void open(ArrayList<Splash> state) {
        System.out.println("Abrindo Janela");
        for (Splash meuSplash : state) {
            System.out.println(meuSplash);
        }   
        
    }
	
	@Override
    public void close(ArrayList<Splash> state) {
        System.out.println("Fechando Janela");
        for (Splash meuSplash : state) {
            System.out.println(meuSplash);
        }   
        
    }

}
