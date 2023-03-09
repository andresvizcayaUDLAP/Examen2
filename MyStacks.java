package Ejercicio_4;
import java.util.Random;

public class MyStacks {
	Random random = new Random();
	private String[] names = {"Zenón de Citio", "Diógenes", "Panecio", "Cicerón", "Catón", "Porcia", "Helvidio", "Epicteto", "Séneca", "Marco Aurelio"};
	private String[] attributes = {"griego", "estoico", "político", "casado", "escritor", "adulto", "justo", "valiente", "sabio", "moderado", "honesto", "famoso", "militar", "lentes", "hijos", "pelirrojo", "bigote", "ojos azules", "sombrero", "guantes", "griego", "estoico", "político", "casado", "escritor", "adulto", "justo", "valiente", "sabio", "moderado", "honesto", "famoso", "militar", "lentes", "hijos", "pelirrojo", "bigote", "ojos azules", "sombrero", "guantes"};
	private String[][] myStacks = new String[10][5];
	int size, size1;
	int position, position1;
	String name, attribute;
	
	public MyStacks() {
		assignNames();
		assignAttributes();
	}
	
	private void assignNames() {
		size = names.length;
		for(int count = 0; count<names.length; count++) {
			position = random.nextInt(size);
			name = names[position];
			popName();
			myStacks[count][0] = name;
			
		}
	}
	
	private void popName() {
		for(int i=0; i<size; i++) {
			if(name.equals(names[i])) {
				for(int j=i; j<size-1; j++) {
					names[j] = names[j+1];
					
				}
				names[size-1] = null;
				size--;
			}
		}
	}
	
	private void assignAttributes() {
		size1 = attributes.length; 
		for(int i=0; i<10; i++) {
			for(int j=1; j<5; j++) {
				position1 = random.nextInt(size1);
				attribute = attributes[position1];
				boolean isIn;
				do {
					isIn = false;
					for(int m=0; m<5; m++) {
						if(attribute.equals(myStacks[i][m])) {
							isIn = true;
							position1 = random.nextInt(size1);
							attribute = attributes[position1];
						}
						
					}
				} while(isIn);
				popAttribute();
				myStacks[i][j] = attribute;
			}
		}
		
	}
	
	private void popAttribute() {
		for(int i=0; i<size1; i++) {
			if(attribute.equals(attributes[i])) {
				for(int j=i; j<size1-1; j++) {
					attributes[j] = attributes[j+1];
					
				}
				attributes[size1-1] = null;
				size1--;
				break;
			}
		}
	}
	
	public String[][] stacks(){
		return myStacks;
	}
}
