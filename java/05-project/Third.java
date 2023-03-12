// Get bigger than three nums
import java.util.Scanner;

public class Third {
  double firstNum;
  double secondNum;
  double thirdNum;
  double bigger;

  public static void main(String args[]) {
    Third biggerNum = new Third();

    biggerNum.input();
    biggerNum.getBigger();
    biggerNum.output();
  }

  private void input() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número:");
    firstNum = input.nextDouble();

    System.out.println("Digite outro número:");
    secondNum = input.nextDouble();

    System.out.println("Digite mais um número:");
    thirdNum = input.nextDouble();

    input.close();
  }

  private void getBigger() {
    if (firstNum >= secondNum && firstNum >= thirdNum) {
      bigger = firstNum;
    } else if (secondNum >= firstNum && secondNum >= thirdNum) {
      bigger = secondNum;
    } else {
      bigger = thirdNum;
    }
  }

  private void output() {
    System.out.println("O maior número deles é: " + bigger);
  }
}
