//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

class exercicio8 {
  public static void main(String[] args) {

   //variaveis
    double ganhoporhora;
      double horastrabalhadas;
      double totalmes;
      
//passo 1: perguntar o ganho por hora e horas trabalhadas
    Scanner teclado = new Scanner(System.in);
System.out.println("ganho por hora ");
    ganhoporhora = teclado.nextDouble();

      System.out.println("horas trabalhadas no mês ");
    horastrabalhadas = teclado.nextDouble();

    teclado.close();

    //passo 2: calcular o salario
    totalmes = horastrabalhadas * ganhoporhora;

    //passo 3: exibir o salario
    System.out.println("recebido R$"); 
    System.out.println(totalmes);









    
  }
}