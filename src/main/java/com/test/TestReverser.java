package com.test;

import java.util.Scanner;

import com.main.Hasher;
import com.main.Reverser;

public class TestReverser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("||||||||||||||||||||||||||||||");
		System.out.println("\tUnhash or hash? U or H and press enter");
		char choice = scanner.nextLine().charAt(0);
		switch(choice) {
		case 'U': 
			System.out.println("");
			System.out.println("\tEnter a value to be unhashed and press enter");
			try {
				long hashed = Long.parseLong(scanner.nextLine());
				System.out.println("Unhashed value is ->"+new Reverser().reverseHash(hashed));
			} catch (Exception e) {
				System.out.println("Entered value couldn't be unhashed.");
			}
			break;
		case 'H':
			System.out.println("");
			System.out.println("\tEnter a value to be hashed and press enter");
			try {
				String unhashed = scanner.nextLine();
				System.out.println("Hashed value is ->"+new Hasher().hash(unhashed));
			} catch (Exception e) {
				System.out.println("Entered value couldn't be unhashed.");
			}
			break;
		default:
			System.out.println("");
			System.out.println("Invalid entry");
			System.out.println("Program will exit");
			break;
		}
	}

}
