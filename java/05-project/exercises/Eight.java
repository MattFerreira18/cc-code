package exercises;

import java.util.Scanner;

public class Eight {
  int id;
  int nascimento;
  int trabalho;
  int hoje;

  public void entrar() {
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o sexo (M/F): ");
    String genero = input.next();
    System.out.print("Digite seu ID: ");
    id = input.nextInt();
    System.out.println("Digite o ano de nascimento: ");
    nascimento = input.nextInt();
    System.out.println("Ano de ingresso na empresa: ");
    trabalho = input.nextInt();
    System.out.println("Ano atual: ");
    hoje = input.nextInt();
  }

  public void imprimir() {
    int idade = hoje - nascimento;
    int empregado = hoje - trabalho;
    // if (genero.equals("M") || genero.equals("m")) {
    // if ((idade >= 65) && (empregado >= 30)) {
    // System.out.println("Voce deve requerer sua aposentadoria");
    // }
    // }
    // if (genero.equals("F") || genero.equals("f")) {
    // if ((idade >= 60) && (empregado >= 25)) {
    // System.out.println("Voce deve requerer sua aposentadoria");
    // }
    // }
  }

  public static void main(String[] args) {
    Eight funcionario = new Eight();
    funcionario.entrar();
    funcionario.imprimir();
  }
}