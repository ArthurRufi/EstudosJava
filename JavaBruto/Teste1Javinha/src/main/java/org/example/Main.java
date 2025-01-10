package org.example;

public class Main {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        
        System.out.println(java.util.Arrays.toString(copyTo));

    }
}

class MamaMia{
    public void fruta(int[] args){
        String avocado = "verde";

    }
}


