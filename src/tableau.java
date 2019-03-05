import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class tableau {
	public static <function> void main(String[] args){
		
		int [][] twoDim = new int [15][15];
		
		//twoDim[8][8] = 1; 
		twoDim[7][9] = 1;
		twoDim[7][10] = 1;
		twoDim[7][11] = 1;
		//twoDim[9][9] = 1;
		//twoDim[9][10] = 1;
		//twoDim[9][11] = 1;
		//twoDim[8][12] = 1;
		int tour = 0;
		
		display(twoDim);
		
		while (tour < 6){
			
				
			int compteTour = ++tour;
			String ligne = System.getProperty("line.separator");
			System.out.print("tour : " + tour + ligne);
			
			
			twoDim = DonneLaVie(twoDim);
			
			display(twoDim);
		
		
		}

	}
	
	private static void display(int[][] table) {
		for (int[] row: table) {
			for (int cell: row) {
				if (cell == 0) {
					System.out.print(" " + 0 + " ");
				} else {
					System.out.print(" " + 1 + " ");
				}
			}
			System.out.println();
		}
	}
	
	
	private static int[][] DonneLaVie(int[][] Eltablo) {
		int [][] Eltablo2 = new int [15][15];
		
		for(int i = 0; i < Eltablo.length; i++){ // 1 2 3 4 5
			for(int j = 0; j <Eltablo[0].length; j++) { // 1 2 3 4 5
		        int pixelOn = 0;
		        for (int i2 = i-1; i2 <= i+1; i2++) {
		        	for (int j2 = j-1; j2 <= j+1; j2++) {
		        		if (i2 >= 0 && j2 >= 0 && i2 < 15 && j2 < 15) { // Verif sort pas du tableau
		        			if (Eltablo[i2][j2] == 1) {
		        				pixelOn++;
		        			}
		        		}
		        	}
		        }
		        if (pixelOn < 3 || pixelOn > 4) {
		        	Eltablo2[i][j] = 0;
		        } else {
		        	Eltablo2[i][j] = 1;
		        }
		        
			}
		}
		return Eltablo2;	        
	}
}

