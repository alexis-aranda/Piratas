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
	public void escorbutoTomaJugo(){
		pirata1.beberGrog();
		pirata1.beberGrog();
		pirata1.beberGrog();
		Assert.assertEquals('e',pirata1.getSalud());
		pirata1.beberJugo();
		Assert.assertEquals('s',pirata1.getSalud());
	}
	
	@Test
	public void escorbutoTomaGrog(){
		pirata1.beberGrog();
		pirata1.beberGrog();
		pirata1.beberGrog();
		Assert.assertEquals('e',pirata1.getSalud());
		pirata1.beberGrog();
		Assert.assertEquals('e',pirata1.getSalud());
	}
	
	@Test
	public void hipersaludableTomaGrog(){
		pirata1.beberJugo();
		Assert.assertEquals('h',pirata1.getSalud());
		pirata1.beberGrog();
		Assert.assertEquals('s',pirata1.getSalud());
	}
	
	@Test
	public void hipersaludableTomaJugo(){
		pirata1.beberJugo();
		Assert.assertEquals('h',pirata1.getSalud());
		pirata1.beberJugo();
		Assert.assertEquals('h',pirata1.getSalud());	
	}
	
	@Test
	public void peleaSaludableASaludable(){
		pirata1.atacar(pirata2);
		Assert.assertEquals(3, pirata1.getPuntos());
	}
	
	@Test
	public void peleaSaludableAEscorbuto(){
		pirata2.beberGrog();
		pirata2.beberGrog();
		pirata2.beberGrog();
		pirata1.atacar(pirata2);
		Assert.assertEquals(5, pirata1.getPuntos());
	}
	
	@Test
	public void peleaSaludableAHipersaludable(){
		pirata2.beberJugo();
		pirata1.atacar(pirata2);
		Assert.assertEquals(7, pirata1.getPuntos());
	}
	
	@Test
	public void peleaHiperaludableAHipersaludable(){
		pirata2.beberJugo();
		pirata1.beberJugo();
		pirata1.atacar(pirata2);
		Assert.assertEquals(12, pirata1.getPuntos());
	}
	
	@Test
	public void peleaHiperaludableASaludable(){
		pirata1.beberJugo();
		pirata1.atacar(pirata2);
		Assert.assertEquals(8, pirata1.getPuntos());
	}
	
	@Test
	public void peleaHiperaludableAEscorbuto(){
		pirata2.beberGrog();
		pirata2.beberGrog();
		pirata2.beberGrog();
		pirata1.beberJugo();
		pirata1.atacar(pirata2);
		Assert.assertEquals(10, pirata1.getPuntos());
	}
	
	@Test
	public void peleaescorbutoAHipersaludable(){
		pirata2.beberJugo();
		pirata1.beberGrog();
		pirata1.beberGrog();
		pirata1.beberGrog();
		pirata1.atacar(pirata2);
		Assert.assertEquals(4, pirata1.getPuntos());
	}
	
	@Test
	public void peleaEscorbutoASaludable(){
		pirata1.beberGrog();
		pirata1.beberGrog();
		pirata1.beberGrog();
		pirata1.atacar(pirata2);
		Assert.assertEquals(0, pirata1.getPuntos());
	}
	
	@Test
	public void peleaEscorbutoAEscorbuto(){
		pirata2.beberGrog();
		pirata2.beberGrog();
		pirata2.beberGrog();
		pirata1.beberGrog();
		pirata1.beberGrog();
		pirata1.beberGrog();
		pirata1.atacar(pirata2);
		Assert.assertEquals(2, pirata1.getPuntos());
	}
	
}
