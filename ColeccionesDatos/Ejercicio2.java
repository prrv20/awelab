package ColeccionesDatos;
import java.util.Scanner;

public class Ejercicio2 {
	
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int indice;
		int acum = 0;
		char palabra[] = new char[acum];
		char letra[] = new char[26];
		letra[0] = 'A';
		letra[1] = 'B';
		letra[2] = 'C';
		letra[3] = 'D';
		letra[4] = 'E';
		letra[5] = 'F';
		letra[6] = 'G';
		letra[7] = 'H';
		letra[8] = 'I';
		letra[9] = 'J';
		letra[10] = 'K';
		letra[11] = 'L';
		letra[12] = 'M';
		letra[13] = 'N';
		letra[14] = 'O';
		letra[15] = 'P';
		letra[16] = 'Q';
		letra[17] = 'R';
		letra[18] = 'S';
		letra[19] = 'T';
		letra[20] = 'U';
		letra[21] = 'V';
		letra[22] = 'W';
		letra[23] = 'X';
		letra[24] = 'Y';
		letra[25] = 'Z';
		
		int n;
		do{
			System.out.println("Ingresa el Indice");
			indice = entrada.nextInt();
			System.out.println("Seleccionaste la Letra"+ letra[indice]);
			acum ++;
			//palabra[indice] = letra[indice];
			//System.out.println("Seleccionatse "+indice);
			
		}while(indice != -1);
		System.out.println("Acumulador "+acum);
		for(int j = 0; j < acum; j++) {
			palabra[indice] = letra[indice];
		}
		for(int j = 0; j < acum; j++) {
			System.out.print( letra[indice]);
		}
	}

}
