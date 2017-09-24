package piratasSaludables;

public class Pirata {

	private int puntos;
	private Estado estado;
	
	public Pirata(){
		puntos=0;
		estado = new Saludable();
	}
	
	public void beberJugo(){
		this.estado=this.estado.beberJugo();
	}
	public void beberGrog(){
		this.estado=this.estado.beberGrog();
	}
	public void atacar(Pirata that){
		if(this.estado.atacar()>that.estado.defender())
			this.puntos+=this.estado.atacar()-that.estado.defender();
	}
	public int getPuntos(){
		return this.puntos;
	}
	
	public char getSalud(){
		return this.estado.getStatus();
	}
	
}
