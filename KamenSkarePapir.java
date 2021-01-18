// Matej Gaspert - Java program
// Kamen, Skare i Papir
// 1-15-2021
// Zadnje uredivano 1-15-2021

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class KamenSkarePapir {
    // main
    public static void main(String[] args){
        List<Integer> kompPotezi = Arrays.asList(1, 2, 3); // generiranje random broja
        Scanner input = new Scanner(System.in);

        // Infinite loop dok korisnik ne odabere 'Kraj'
        loop : while(true){
            System.out.print("Kamen, Skare, Papir, Kraj >>> ");
            String potez = input.nextLine().toLowerCase();
            Collections.shuffle(kompPotezi); // Mijesanje kompjuterskih opcija kako bi bili nasumicni brojevi

            switch(potez){
                case "kamen": tkoJePobijedio(kompPotezi.get(0), "Izjednaceno", "Izgubili ste", "Pobijedili ste"); break; // ako je potez kamen
                case "papir": tkoJePobijedio(kompPotezi.get(0), "Pobijedili ste", "Izjednaceno", "Izgubili ste"); break; // ako je potez papir
                case "skare": tkoJePobijedio(kompPotezi.get(0), "Izgubili ste", "Pobijedili ste", "Izjednaceno"); break; // ako je potez skare
                case "kraj": break loop; // ako je potez 'kraj'
                case "": continue loop; // ako je potez prazan
                default: System.out.println("Nevaljani unos"); // ako potez nije nijedno od navedenoga ili nevazeci
            }
        }
        input.close();
    }

    private static void tkoJePobijedio(int kompovPotez, String p1, String p2, String p3){
        if(kompovPotez == 1){ // kompov potez je bio kamen
            System.out.printf("Kompjuter je odabrao Kamen, %s%n", p1);
        } else if(kompovPotez == 2){ // kompov potez je bio papir
            System.out.printf("Kompjuter je odabrao Papir, %s%n", p2);
        } else { // kompov potez je bio skare
            System.out.printf("Kompjuter je odabrao Skare, %s%n", p3);
        }
    }
    
}
