
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MetodoMatematicoTest {
private MetodosMatematicos doubles;
	
	@Before
	public void setUp() {
		doubles = new MetodosMatematicos();
	}
	
	@Test
	public void deveRetornarMenorValor() {
		double menor = doubles.menorValor(30.2, 23.75);
		Assert.assertEquals(23.75, menor, 0.0001);
	}
	
	@Test
	public void deveRetornarMenorValorEntreTresValores() {
		double menor = doubles.menorValorEntreTresValores(30.2, 23.75, 25.98);
		Assert.assertEquals(23.75, menor, 0.0001);
	}
	@Test
	public void deveRetornarMedia() {
		double media = doubles.mediaTresValores(3.0, 2.0, 4.0);
		Assert.assertEquals(3.0, media, 0.0001);
	}
	@Test
	public void deveRetornarAreaDoTriangulo() {
		double area = doubles.areaDoTriangulo(5.0,4.0);
		Assert.assertEquals(10.0, area , 0.0001);
	}

}
