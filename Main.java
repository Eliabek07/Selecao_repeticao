import java.util.Scanner;
//Faça um programa que receba como entrada do usuário dois números inteiros, efetua a soma desses números e imprima somente se o valor da soma for maior do que 10.


class Main {
  public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);



    System.out.println("Digite o primeiro número:  ");
    int num1 = ent.nextInt();
    System.out.println("Digite o segundo número:  ");
    int num2 = ent.nextInt();

    int soma = num1 + num2;

    if (soma > 10){
      System.out.printf(" o valor da soma é %d",soma);
    } else{
      System.out.println(" sua soma é menor que 10");

    }
  }
}