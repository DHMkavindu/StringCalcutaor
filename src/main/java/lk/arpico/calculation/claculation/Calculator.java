package lk.arpico.calculation.claculation;

public class Calculator {

	public double calculate(String equation) {
		if(equation.contains("+")) {
			return processAddition(equation);
		}
		if(equation.contains("-")) {
			return processMinus(equation);
		}
		if(equation.contains("*")) {
			return processMultipication(equation);
		}
		if(equation.matches("[0-9]+")) {
			return Double.parseDouble(equation);
		}
		return Double.BYTES;
	}

	private double processMinus(String equation) {
		String[] component=equation.split("\\-");
		return calculate(component[0]) - calculate(component[1]);
	}

	private double processMultipication(String equation) {
		String[] components = equation.split("\\*");
		return calculate(components[0]) * calculate(components[1]);
	}
	
	private double processAddition(String equation) {
		String[] components= equation.split("\\+");
		
		double result= 0.0;
		for(String component : components) {
			result +=calculate(component);
		}
		
		return result;
	}

}
