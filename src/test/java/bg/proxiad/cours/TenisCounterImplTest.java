package bg.proxiad.cours;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenisCounterImplTest {

	@Test
	public void test() {
		TenisCounterImpl counter = new TenisCounterImpl();
		counter.addPoint(new PointInfo(true));
		assertEquals(1, counter.currentScore[0]);
	}

}
