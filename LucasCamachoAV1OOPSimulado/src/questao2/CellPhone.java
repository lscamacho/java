/*
 Nome: Lucas Camacho
 Matrícula: 0050015258
 */ 

package questao2;

abstract class CellPhone {

	private boolean ligado = true;

	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void ligar() {
		ligado = true;
		System.out.println("Estado do celular - ligado - "+this.isLigado());
	}
	public void desligar() {
		ligado = false;
		System.out.println("Estado do celular - desligado - "+this.isLigado());
	}


	public void show_model() {
		// TODO Auto-generated method stub
		
	}

}