package homework1;

import java.util.Random;

public class RandomDecimalNumber {

	public static void main(String[] args) {
		Random random = new Random();
		double randomDecimal = random.nextDouble() * 100;
		int integerDel = (int) randomDecimal;
		double decimalenDel = randomDecimal - integerDel;
		char charCode = (char) integerDel;
		
		System.out.println("Random decimal number = " + randomDecimal);
		System.out.println("Integer = " + integerDel);
		System.out.println("Decimal = " + decimalenDel);
		System.out.println("Character code = " + charCode);
	}

}

