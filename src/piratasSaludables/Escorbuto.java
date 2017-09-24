package piratasSaludables;

public class Escorbuto implements Estado{
	
	private final int ataque=2;
	private final int defensa=0;
	private char status='e';

	public Escorbuto(){
	}
	
	public Estado beberGrog(){
		return this;
	}
	
	public Estado beberJugo(){
		return new Saludable();
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
