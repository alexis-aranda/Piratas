package piratasSaludables;

public interface Estado {
	
	Estado beberGrog();
	Estado beberJugo();
	int atacar();
	int defender();
	default int pelea(Estado estado) {
		if(this.atacar()>this.defender())
			return this.atacar()-this.defender();
		return 0;
	}
	char getStatus();
	
	
	
}
