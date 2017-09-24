package piratasSaludables;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class PirataTest {

	Pirata pirata1;
	Pirata pirata2;
	
	@Before
	public void startUp(){
		pirata1=new Pirata();
		pirata2=new Pirata();
	}
	
	@Test
	public void peleaNormal(){
		pirata1.atacar(pirata2);
		Assert.assertEquals(3, pirata1.getPuntos());
	}
	
	@Test
	public void saludableTomaGrog(){
		pirata1.beberGrog();
		Assert.assertEquals('s',pirata1.getSalud());
	}
	
	@Test
	public void saludableTomaJugo(){
		pirata1.beberJugo();
		Assert.assertEquals('h',pirata1.getSalud());
	}
	
	@Test
	public void saludableTomaMuchoGrog(){
		pirata1.beberGrog();
		pirata1.beberGrog();
		pirata1.beberGrog();
		Assert.assertEquals('e',pirata1.getSalud());
	}
	
	@Test
	public void peleaSaludableAEscorbuto(){
		pirata1.atacar(pirata2);
		Assert.assertEquals(3, pirata1.getPuntos());
	}
}
