package bg.proxiad.cours;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SimpleCalculator implements Calculator {
	
	@PostConstruct
	public void neshtoGotinoPriStart() {
		System.out.println("Inititializing ....");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying ....");
	}

	@Override
	public CalculatorResult add(int op1, int op2) {
		CalculatorResult result = new CalculatorResult();
		result.setOperand1(op1);
		result.setOperand2(op2);
		result.setResult(op1 + op2);
		return result;
	}
}
