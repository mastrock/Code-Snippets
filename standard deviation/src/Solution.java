import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static double standardDeviation(float input[]) {

		float sum = 0;
		float Ux;
		float standardDev = 0;

		for (int i = 0; i < input.length; ++i) {

			sum += input[i];
		}

		Ux = sum / input.length;

		for (int i = 0; i < input.length; ++i) {

			standardDev += Math.pow(input[i] - Ux, 2);

		}
		return Math.sqrt(standardDev / input.length);

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println(" input the number of samples \n ");
		int n = in.nextInt();
		float Samples[] = new float[n];
		for (int i = 0; i < n; i++) {
			System.out.println(" input the " + (i + 1) + "th" + " element \n ");
			Samples[i] = in.nextFloat();

		}

		double SE = standardDeviation(Samples) / (Math.sqrt(Samples.length));

		System.out.println("the sandard deviation of the mean : " + SE);

	}
}
