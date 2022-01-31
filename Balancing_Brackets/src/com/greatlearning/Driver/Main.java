package com.greatlearning.Driver;
import com.greatlearning.Service.*;

public class Main {

	public static void main(String args[]) {

		BalancingBrackets object = new BalancingBrackets();
		
		String bracketExpression = "([[{}]])";
		
		boolean result = object.checkingBracketsBalanced(bracketExpression);
		
		if(result) { System.out.println("The entered string has Balanced Brackets"); }
			
		else { System.out.println("The entered string do not contain Balanced Brackets"); }
	}	
}