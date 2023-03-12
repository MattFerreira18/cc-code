import java.util.Scanner;

public class StudentAverage {
  private int code;
  private String name;
  private double first_note;
  private double second_note;
  private double third_note;
  private double fourty_note;

  public static void main(String[] args) {
    StudentAverage studentAverage = new StudentAverage();

    studentAverage.init();
  }

  private void init() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o código do aluno:");
    code = input.nextInt();

    System.out.println("Digite o nome do aluno:");
    name = input.next();

    System.out.println("Digite a primeira nota:");
    first_note = input.nextDouble();

    System.out.println("Digite a segunda nota:");
    first_note = input.nextDouble();

    System.out.println("Digite a terceira nota:");
    first_note = input.nextDouble();

    System.out.println("Digite a quarta nota:");
    fourty_note = input.nextDouble();

    input.close();

    double average = getAverage();
    boolean isApproved = isApproved(average);
    String message = getMessage(isApproved);

    System.out.printf("Aluno: ", name);
    System.out.printf("Código: ", code);
    System.out.println(message);
  }

  private double getAverage() {
    double sum = first_note + second_note + third_note + fourty_note;
    double result = sum / 4;

    return result;
  }

  private boolean isApproved(double average) {
    return average >= 7;
  }

  private String getMessage(boolean isApproved) {
    String result = isApproved ? "Aluno aprovado!" : "Aluno reprovado";

    return result;
  }
}
