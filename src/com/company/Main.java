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
        System.out.printf("O salario de "+ numero+" sera : %.2f",salario   );
    }
}
