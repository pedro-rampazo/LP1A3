package aula_02.exercicios;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        String codigo_identificador;
        int LIMITE_DIGITOS = 7;

        System.out.println("Código Identificador: ");
        Scanner sc = new Scanner(System.in);     
        String cod = sc.nextLine();
        
        String br_var = cod.substring(0, 2);
        var num_var = cod.substring(2, 6);

        
        if (cod.length() == LIMITE_DIGITOS) {

        }

    }
}
