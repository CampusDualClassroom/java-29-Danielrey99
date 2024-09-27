package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        try {
            int valor = numeros[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El al acceder a index: " + e.getMessage());
        }
    }
}
