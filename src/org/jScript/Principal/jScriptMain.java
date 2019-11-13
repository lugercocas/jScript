package org.jScript.Principal;

import java.util.Scanner;

public class jScriptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		System.out.println("Consola jPowerSHell v1.0 Iniciada... ");
		Scanner in = new Scanner(System.in);
		Utility consola = new Utility();
		while (true) {
			System.out.print(">> ");
			input = in.nextLine();
			if (input.equalsIgnoreCase("Exit")) {
				in.close();
				System.out.println("Fin...");
				break;
			} else {				
				consola.interprete(input);
			}
		}
	}

}
