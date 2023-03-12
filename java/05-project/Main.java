
/**
 * To run:
 * - javac Main.java
 * - java Main.java
 */
import java.util.Scanner;

import exercises.*;

public class Main {
  private static Scanner input;

  public static void main(String args[]) {
    input = new Scanner(System.in);
    execute();
  }

  private static void execute() {
    int option = 0;

    while (option == 0) {
      printExercisesTable();
      System.out.println("\nDigite uma opção:");
      option = input.nextInt();

      if (option > 10 || option <= 0) {
        System.out.println("Opção digitada inválida");
        option = 0;
        continue;
      }
    }

    boolean isExerciseFinished = runSelectedExercise(option);

    if (isExerciseFinished) {
      execute();
      return;
    }

    input.close();
  }

  private static void printExercisesTable() {
    System.out.println("\n\n\n\n");
    // cleanup();
    System.out.println("1  - tabuada");
    System.out.println("2  - 50 primeiros e 50 posteriores");
    System.out.println("3  - maior número decimal");
    System.out.println("4  - menor número decimal");
    System.out.println("5  - idade em dias");
    System.out.println("6  - estatísticas de voto");
    System.out.println("7  - comissão de vendas");
    System.out.println("8  - qualificação de aposentadoria");
    System.out.println("9  - desconto de venda de produtos");
    System.out.println("10 - desconto de combustível");
  }

  // private static void cleanup() {
  // System.out.print("\033[H\033[2J");
  // System.out.flush();
  // }

  private static boolean runSelectedExercise(int option) {
    // TODO test all exercises
    switch (option) {
      case 1:
        First first = new First();
        first.execute();
        return true;
      case 2:
        Second second = new Second();
        second.execute();
        return true;
      case 3:
        Third third = new Third();
        third.execute();
        return true;
      case 4:
        // First exercise = new Four();
        Third four = new Third();
        four.execute();
        return true;
      case 5:
        Five five = new Five();
        five.execute();
        return true;
      case 6:
        Six six = new Six();
        six.execute();
        return true;
      case 7:
        // First exercise = new Seven();
        Six seven = new Six();
        seven.execute();
        return true;
      case 8:
        Eight eight = new Eight();
        // eight.execute();
        return true;
      case 9:
        Nine nine = new Nine();
        // nine.execute();
        return true;
      case 10:
        // First exercise = new Ten();
        Ten ten = new Ten();
        ten.execute();
        return true;
      default:
        return false;
    }
  }
}
