// Matej Gaspert - Java program
// Palindrom
// 1-17-2021
// Zadnje uredivano 1-17-2021


import java.util.Scanner;



public class Palindrom {
    // main
    public static void main(String[] args){
        
        String original, reverse = "";
        Scanner input = new Scanner(System.in);   

        System.out.println("Unesite text kako bi provjerili radi li se o palindromu ili ne.");  
        original = input.nextLine();   

        String fixed = original.replaceAll("\\s|[^a-zA-Z0-9]",""); // izbaciti razmake i znakove

        int length = fixed.length();

        // Provjera teksta pomocu petlje
        for ( int i = length - 1; i >= 0; i-- ){
            reverse = reverse + fixed.charAt(i); 
        }

        if (fixed.equals(reverse))  
            System.out.println("Uneseni tekst je palindrom.");  
        else  
            System.out.println("Uneseni tekst nije palindrom.");   

        input.close();
    
    }
}
