package bg.proxiad.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
	
	@Autowired
	private Computer computer;
	
	@RequestMapping(path = "/add", produces = MediaType.TEXT_XML_VALUE)
	public @ResponseBody CalculatorResult addValues(int op1, int op2) {
		return computer.getCalculator().add(op1, op2);
	}

}
