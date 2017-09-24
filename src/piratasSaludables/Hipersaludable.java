package piratasSaludables;

public class Hipersaludable implements Estado {

	private final int ataque=10;
	private final int defensa=-2;
	private char status='h';
	
	public Hipersaludable(){
	}
	
	public Estado beberGrog(){
		return new Saludable();
	}
	
	public Estado beberJugo(){
		return this;
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
