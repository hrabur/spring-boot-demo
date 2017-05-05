package bg.proxiad.cours;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebCourseApplicationTests {
	
	@Autowired
	private Computer computer;

	@Test
	public void contextLoads() {
		CalculatorResult result = computer.getCalculator().add(1, 2);
		Assert.assertEquals(3, result.getResult());
	}

}
