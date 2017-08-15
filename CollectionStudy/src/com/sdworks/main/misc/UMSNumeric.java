package com.sdworks.main.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class UMSNumeric {

	public UMSNumeric() throws IOException {
		// Read input from command-line
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inp = "", numInp = "", solveInp = "";
		int inpCounter = 0;
		while ((inp = in.readLine()) != null) {
			if (inpCounter == 0) {
				numInp = inp;
			} else {
				solveInp = inp;
			}

			if (inp.isEmpty() || inpCounter == 1) {
				break;
			}
			inpCounter++;

		}

		// Convert string iputs to double for calculations
		double toSolve = 0;
		try {
			toSolve = Double.parseDouble(solveInp);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Inputs...");
			return;
		}

		String[] strAry = numInp.split("\\s+");
		if (strAry.length != 5) {
			System.out.println("Invalid Inputs: enter 5 numbers separted by space");
			return;
		}

		double[] inputAry = new double[5];
		for (int i = 0; i < strAry.length; i++) {
			inputAry[i] = Double.parseDouble(strAry[i]);
		}

		// Make the patterns combinations for the list of operators
		ArrayList<String> operatorList = new ArrayList<String>();
		operatorList.addAll(Arrays.asList(new String[] { "+", "-", "*", "/" }));
		String operatorPatternsAry[] = new String[256];
		int patternIdx = 0;

		for (String op1 : operatorList) {
			for (String op2 : operatorList) {
				for (String op3 : operatorList) {
					for (String op4 : operatorList) {
						operatorPatternsAry[patternIdx++] = op1 + '|' + op2 + '|' + op3 + '|' + op4;
					}
				}
			}
		}

		// Make numeric patterns that is valid for calculation using above
		// operator patterns
		ArrayList<Integer> numericPatterns = new ArrayList<Integer>();
		numericPatterns.addAll(Arrays.asList(new Integer[] { 0, 1, 2, 3, 4 }));
		ArrayList<String> solutionAry = new ArrayList<String>();

		for (Integer nv1 : numericPatterns) {
			for (Integer nv2 : numericPatterns) {
				for (Integer nv3 : numericPatterns) {
					for (Integer nv4 : numericPatterns) {
						for (Integer nv5 : numericPatterns) {
							if (nv2 != nv1 && nv3 != nv1 && nv3 != nv2 && nv4 != nv1 && nv4 != nv2 && nv4 != nv3
									&& nv5 != nv1 && nv5 != nv2 && nv5 != nv3 && nv5 != nv4) {
								String[] operators;
								double returnVal;

								for (String op : operatorPatternsAry) {
									operators = op.split("\\|");
									returnVal = inputAry[nv1];
									returnVal = calculate(returnVal, inputAry[nv2], operators[0]);
									returnVal = calculate(returnVal, inputAry[nv3], operators[1]);
									returnVal = calculate(returnVal, inputAry[nv4], operators[2]);
									returnVal = calculate(returnVal, inputAry[nv5], operators[3]);

									if (returnVal == toSolve) {
										String solution = inputAry[nv1] + operators[0] + inputAry[nv2] + operators[1]
												+ inputAry[nv3] + operators[2] + inputAry[nv4] + operators[3]
												+ inputAry[nv5];
										solution = solution + "=" + toSolve;
										solutionAry.add(solution);
										System.out.println(solution);
									}
								}
							}
						}
					}
				}
			}
		}

		if (solutionAry.isEmpty()) {
			System.out.println("No solution possible with given inputs");
		}

	}


	public static double calculate(double x1, double x2, String Operator) {
		switch (Operator.charAt(0)) {
		case '+':
			return x1 + x2;
		case '-':
			return x1 - x2;
		case '*':
			return x1 * x2;
		case '/':
			return x1 / x2;
		default:
			return x1 + x2;
		}
	}
}
