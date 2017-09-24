package piratasSaludables;

public class Saludable implements Estado{

	private final int ataque=5;
	private final int defensa=2;
	private char status='s';
	
	private int contador;
	
	public Saludable(){
		this.contador=0;
	}
	
	public Estado beberGrog(){
		if(++contador==3)
			return new Escorbuto();
		return this;
	}
	
	public Estado beberJugo(){
		return new Hipersaludable();
	}
	
	public int atacar(){
		return ataque;
	}
	
	public int defender() {
		return defensa;
	}
	
	public char getStatus() {
		return status;
	}
	
}
