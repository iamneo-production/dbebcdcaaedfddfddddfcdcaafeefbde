package controller;

public class CalculateBMI {

	public static double calculate(double height,double weight){
		height = height/100.0;
		double BMI = weight/(height*height);
		return BMI;
	}
	public static String description(double bmi){
		if(bmi<18.5){
			return "Under Weight"
		}
	}
}
