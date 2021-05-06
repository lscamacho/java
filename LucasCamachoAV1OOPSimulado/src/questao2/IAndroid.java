/*
 Nome: Lucas Camacho
 Matrícula: 0050015258
 */ 
package questao2;

//import java.util.ArrayList;

public class IAndroid extends CellPhone {

	private String marca;
	
	public String getMarca() {
        return marca;
    }
    public void setModel(String marca) {
        this.marca = marca;
    }

	@Override
	public void show_model() {
		
		System.out.println("Marca: "+this.marca);

	}
}
