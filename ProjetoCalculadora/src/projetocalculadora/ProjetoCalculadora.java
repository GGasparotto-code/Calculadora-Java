package projetocalculadora;

import java.util.Scanner;

public class ProjetoCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        //calc.valor1 = 10;
        //calc.valor2 = 20;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        calc.valor1 = scan.nextFloat();

        System.out.print("Digite o valor 2: ");
        calc.valor2 = scan.nextFloat();
        
        calc.somar();
        System.out.println(calc.resultado);
    }
}
