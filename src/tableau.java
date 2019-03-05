import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class tableau {
	public static <function> void main(String[] args){
		//les int représentés entre les crochets, représentent les lignes et colonnes
		//du tableau à deux dimensions, respectivement
		//int[][] tableau = new int[3][50];

		
 
		//Parcours lignes et colonnes pour les deux for, respectivement
		//for(int i=0; i<2; i++) 
		//{					   
		//	for(int j=0; j<tableau[i].length; j++)
		//	   {
			     //tableau[i][j] = "|" +""+j+" | "+i+"|";  
		//	     System.out.println(tableau[i][j]); 
		//	   }
int tour = 0;	
while (tour < 3){
int compteTour = ++tour;
System.out.print("tour : " + tour);

Random rand = new Random();
int n = rand.nextInt(19);
int n2 = rand.nextInt(19);
System.out.print(" premier : " +n);
System.out.print(" 2eme : " + n2);

int [][] twoDim = new int [20][20];


int a = (twoDim.length);//5
int b = (twoDim[0].length);//5

for(int i = 0; i < a; i++){ // 1 2 3 4 5
    for(int j = 0; j <b; j++) { // 1 2 3 4 5
        int x = 0;
        if(i % n == 0){ // placement des cellules de façon "aleatoire"
        	x = 1;
        	if (j % n2 == 0){
        		x = 0;
        	}
        }
        if ( tour >= 2){ // check le nombres de tours 
        	//System.out.print("le resulta est : " +twoDim[0][1]);
        	//if (twoDim[0][1] == 1){
        			// regarde si une cellule existe a cette case presente
		        //if(twoDim[0][2] == 0){ // regarde son voison 
		        	if (j == 0 && i == 1){ // tue la cellule
		        		x = 0;
		        	}
		        }
		        
        
        twoDim[i][j] = x;
        if (x == x) {
            System.out.print(" " + x + " ");
        } else {
        	x = 1;
            System.out.print(x + " ");
        }
    }//end of for J
    System.out.println();
}//end of for i
}// end of while


		}
		

		}