import java.util.Scanner;

public class Table {
  private int minFactor = 0;

  public static void main(String args[]) {
    Table table = new Table();

    table.init();
  }

  private void init() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int multiplier = input.nextInt();

    System.out.println("Digite a quantidade máxima da tabuada: ");
    int maxFactor = input.nextInt();

    // for (int i = minFactor; i <= maxFactor; i++) {
    //   int result = multiplier * i;

    //   System.out.printf(multiplier + " x " + i + " = " + result + "\n");
    // }

    int i = minFactor;

    while (i <= maxFactor) {
      int result = multiplier * i;

      System.out.printf(multiplier + " x " + i + " = " + result + "\n");

      i++;
    }

    input.close();
  }
}
