package bg.proxiad.cours;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TestConfig {
	
	@Bean
	@Qualifier("simple")
	public Calculator simpleCalculator() {
		return new SimpleCalculator();
	}
}
