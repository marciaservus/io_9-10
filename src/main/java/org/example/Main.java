package org.example;

public class Main {
    
    // BLAD 1: Publiczne pole statyczne (nie powinno być publiczne)
    public static String HASLO_DO_BAZY = "admin123"; 

    public static void main(String[] args) {
        System.out.println("Hello CI");
        
        // BLAD 2: wywolanie blednej metody
        zlaMetoda();
    }

    public static void zlaMetoda() {
        // BLAD 3: System.out.println, printy zasmiecaja output, utrudniaja odnalezienie prawdziwych bledow
        System.out.println("To jest debug, ktorego nie usunalem");

        try {
            int x = 10 / 0;
        } catch (Exception e) {
            // BLAD 4: Pusty blok catch, polkniecie bledow bez sladu. Mamy dzielenie przez 0, lapiemy ten blad, ale potem nic z nim nie robimy
        }
    }
}
