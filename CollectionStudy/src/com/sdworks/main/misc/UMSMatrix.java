package com.sdworks.main.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UMSMatrix {
	public UMSMatrix() throws IOException {
				
		int input = 7;
		if(input == 0){
			System.out.println(0);
			return;
		}
		
		int sqaure = input * input;
		int matrixValue = 0;

		// Initial variables
		int rowCount = input;
		int sprintCount = rowCount;
		int outputAry[][] = new int[rowCount][rowCount];
		int posX = 0, posY = 0, sprintX = 0, sprintY = 0;

		// Start sprinting here..
		while (sprintCount > 0) {

			// Step: Traverse thru right till end.
			while (sprintY < sprintCount) {
				outputAry[sprintX][sprintY] = ++matrixValue;
				sprintY++;
			}
			sprintY--;

			// Step: Traverse down till end.
			sprintX++;
			while (sprintX < sprintCount) {
				outputAry[sprintX][sprintY] = ++matrixValue;
				sprintX++;
			}
			sprintX--;

			// Step: Traverse back to left
			sprintY--;
			while (sprintY >= posY) {
				outputAry[sprintX][sprintY] = ++matrixValue;
				sprintY--;
			}
			sprintY++;

			// Step: Traverse up to the origin
			sprintX--;
			while (sprintX >= posX) {
				// Stop the sprint once we reach the starting position
				if (sprintX == posX && sprintY == posY) {
					// Move to the inner lap
					posX++;
					posY++;
					sprintCount--;
					break;
				}
				outputAry[sprintX][sprintY] = ++matrixValue;
				sprintX--;
			}

			if (matrixValue + 1 > sqaure) {
				break;
			}
			//Move the sprint to next iteration
			sprintX = posX;
			sprintY = posY;

		}

		//printing out the result
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < rowCount; j++) {
				System.out.print(outputAry[i][j] + " ");
			}
			System.out.println();
		}

	}
}
