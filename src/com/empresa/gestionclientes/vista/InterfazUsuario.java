package com.empresa.gestionclientes.vista;

import java.util.Scanner;

public class InterfazUsuario {
    private static final Scanner scanner = new Scanner(System.in);

    public static String solicitarTexto(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }

    public static Long solicitarNumero(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLong();
    }
}

