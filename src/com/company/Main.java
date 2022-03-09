package com.company;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.round;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        //ex 1
        System.out.println("Digite o primeiro numero");
        int a = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int b = sc.nextInt();
        int soma = a + b;
        System.out.println("A soma dos valores é: " + soma);
        //ex 2
        System.out.println("Digite o raio");
        double c = sc.nextDouble();
        double raio  = c * 3.14159;
        System.out.printf("A circunferencia e : %.2f",raio);
        //ex 3
        int A,B,C,D;
        System.out.println("\n Digite A: ");
        A = sc.nextInt();
        System.out.println("Digite B: ");
        B = sc.nextInt();
        System.out.println("Digite C: ");
        C = sc.nextInt();
        System.out.println("Digite D: ");
        D = sc.nextInt();
        int total = (A * B - C * D);
        System.out.println(" DIFERENCA = (A * B - C * D) = "+ total);
        //ex 4
        System.out.println("Digite o numero do funcionario");
        int numero = sc.nextInt();
        System.out.println(("Digite as horas trabalhadas"));
        int horas = sc.nextInt();
        System.out.println("Digite o valor do trabalho por hora");
        double trabalho = sc.nextDouble();
        double salario = trabalho*horas;
        System.out.printf("O salario de "+ numero+" sera : %.2f  \n",salario   );
        // ex 5
        System.out.println("Digite os dados");
        int peca1= sc.nextInt();
        int num1= sc.nextInt();
        double val1= sc.nextDouble();
        System.out.println("Digite os dados");
        int peca2= sc.nextInt();
        int num2= sc.nextInt();
        double val2= sc.nextDouble();
        double val = num1*val1+num2*val2;
        System.out.println("VAlor a pagar: "+ val );
        //ex 6
        double As, Bs, Cs, triangulo, circulo, trapezio, quadrado, retangulo;

        As = sc.nextDouble();
        Bs = sc.nextDouble();
        Cs = sc.nextDouble();

        triangulo = As * Cs / 2.0;
        circulo = 3.14159 * Cs * Cs;
        trapezio = (As + Bs) / 2.0 * Cs;
        quadrado = Bs * Bs;
        retangulo = As * Bs;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();



    }
}
