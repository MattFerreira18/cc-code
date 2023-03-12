package exercises;
// 50 before and 50 after

import java.util.Scanner;

public class Second {
  int num;

  public void entrar() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    num = input.nextInt();

    // input.close();
  }

  public void imprimir() {
    for (int i = num - 50; i <= num + 50; i++) {
      System.out.println(i);
    }
  }

  public void execute() {
    this.entrar();
    this.imprimir();
  }

  public static void main(String[] args) {
    Second numero = new Second();

    numero.execute();
  }

}
