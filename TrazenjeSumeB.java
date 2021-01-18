// Matej Gaspert - Java program
// Trazenje kombinacije brojeva za sumu B
// 1-17-2021
// Zadnje uredivano 1-18-2021


import java.util.Scanner;

class TrazenjeSumeB{
     
// Funkcija za pronaci kombinaciju najmanje iskoristenih brojeva za zbroj
static int Pronadi(int S[], int m, int b) 
{ 
    int [][]table = new int[m + 1][b + 1]; 
 
    // petlja za inicijalizaciju arraya na infinite za red 0
    for(int i = 1; i <= b; i++) 
    { 
    table[0][i] = Integer.MAX_VALUE - 1; 
    } 

    // petlja za pronalazenje rjesenja za kombinaciju 
    for(int i = 1; i <= m; i++) 
    { 
        for(int j = 1; j <= b; j++) { 
            if (S[i - 1] > j) 
            { 
                table[i][j] = table[i - 1][j]; 
            } 
            else
            { 
                    
                // najmanje moguce za prethodnu najmanju kombinaciju
                table[i][j] = Math.min(table[i - 1][j], table[i][j - S[i - 1]] + 1); 
            } 
        } 
    } 
    return table[m][b]; 
} 
 
// main
public static void main(String[] args) 
{ 
    int arr[] = { 2, 5, 15, 6}; 
    int m = arr.length; 
    Scanner input = new Scanner(System.in);

    System.out.println("Unesite trazeni broj B");
    int b = input.nextInt();
     
    int x = Pronadi(arr, m, b); 
    if (x < b)
        System.out.println("Najmanja kombinacija iskoristenih brojeva je " + x);
    else
        System.out.println("-1");


    input.close();
} 


}