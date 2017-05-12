package bg.proxiad.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
	
	public static class CalculatorInput {
		private int op1;
		private int op2;

		public int getOp1() {
			return op1;
		}

		public void setOp1(int op1) {
			this.op1 = op1;
		}

		public int getOp2() {
			return op2;
		}

		public void setOp2(int op2) {
			this.op2 = op2;
		}
	}
	
	@Autowired
	private Computer computer;
	
	@RequestMapping(path = "/calculator", method=RequestMethod.GET)
	public String showCalculator() {
		return "calculator.jsp";
	}
			
	
	@RequestMapping(path = "/calculator", method=RequestMethod.POST)
	public ModelAndView addValues(CalculatorInput input) {
		return new ModelAndView("calculator.jsp")
			.addObject("result", computer.getCalculator().add(input.getOp1(), input.getOp2()));
	}

}
