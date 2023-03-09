package Ejercicio_4;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		MyStacks myStack = new MyStacks();
		String[][] stacks = myStack.stacks();
		String[] info = new String[10];
		String name, attribute1, attribute2, attribute3, attribute4;
		for(int i=0; i<stacks.length; i++) {
			name = stacks[i][0];
			attribute1 = stacks[i][1];
			attribute2 = stacks[i][2];
			attribute3 = stacks[i][3];
			attribute4 = stacks[i][4];
			Character character = new Character(name, attribute1, attribute2, attribute3, attribute4);
			info[i] = character.getInfo();
			System.out.println(character.getInfo());
		}
		
		int chosen = random.nextInt(10);
		String chosenCharacter = info[chosen];
		System.out.println(chosen);
		
		Scanner scan = new Scanner(System.in);
		
		int size = info.length;
		System.out.println("Primera característica: ");
		String respuesta1 = scan.next();
		if(info[chosen].contains(respuesta1)) {
			for(int i=size-1; i>=0; i--) {
				if(!info[i].contains(respuesta1)) {
					for(int j=i; j<size-1; j++) {
						
						info[j] = info[j+1];
					}
					info[size-1] = null;
					size--;
				} 
			}
		}
		
		for(int count=0; count<size; count++) {
			System.out.println(info[count]);
		}
		
		for(int m=0; m<size; m++) {
			if(chosenCharacter.equals(info[m])) {
				chosen = m;
			}
		}
		
		System.out.println("Segunda característica: ");
		String respuesta2 = scan.next();
		if(info[chosen].contains(respuesta2)) {
			for(int i=size-1; i>=0; i--) {

				if(!info[i].contains(respuesta2)) {
					for(int j=i; j<size-1; j++) {
						
						info[j] = info[j+1];
					}
					info[size-1] = null;
					size--;
				} 
			}
		}
		
		for(int count=0; count<size; count++) {
			System.out.println(info[count]);
		}
		
		for(int m=0; m<size; m++) {
			if(chosenCharacter.equals(info[m])) {
				chosen = m;
			}
		}
		
		System.out.println("Tercera característica: ");
		String respuesta3 = scan.next();
		if(info[chosen].contains(respuesta3)) {
			for(int i=size-1; i>=0; i--) {
				if(!info[i].contains(respuesta3)) {
					for(int j=i; j<size-1; j++) {
						
						info[j] = info[j+1];
					}
					info[size-1] = null;
					size--;
				} 
			}
		}
		
		for(int count=0; count<size; count++) {
			System.out.println(info[count]);
		}

		String finalAnswer;
		System.out.println("Indica el nombre del personaje");
		finalAnswer = scan.next();
		
		if(info[chosen].contains(finalAnswer)) {
			System.out.println("Ganaste");
			
		} else {
			System.out.println("Perdiste");
		}
		
	}
	
	
	
	
}