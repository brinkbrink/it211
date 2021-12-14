package com.BrinkFinal;

public class paycheck implements payroll {

private double hours;
private double rate;
private double overtime;
private double regular;
private double total;

public paycheck() {
	hours = 0;
	rate = 0;
	regular = 0;
	overtime = 0;
	total = 0;
	
}

public paycheck(double initHours, double initRate) {
	hours = initHours;
	rate = initRate;
	regular = regularPay();
	overtime = overTimepay();
	total = totalPay();
}

public double getHours() {
	return hours;
}

public double getRate() {
	return rate;
}

	@Override
	public double regularPay() {
		if (hours <=40) {
			regular = hours * rate;
		} else {
			regular = 40 * rate;
		}
		return regular;
	}

	@Override
	public double overTimepay() {
		if (hours > 40) {
			overtime = (hours - 40) * (rate * 1.5);
		}
		return overtime;
	}

	@Override
	public double totalPay() {
		total = overtime + regular;
		return total;
	}

	public void printCheck() {
		System.out.println("Regular pay: " + regular);
		System.out.println("Overtime pay: " + overtime);
		System.out.println("Total pay: " + total);
	}
}
