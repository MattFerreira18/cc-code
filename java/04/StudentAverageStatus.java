import java.util.Scanner;

public class StudentAverageStatus {
  private int code;
  private String name;
  private double first_note;
  private double second_note;
  private double third_note;
  private double fourty_note;

  public static void main(String[] args) {
    StudentAverageStatus studentAverageStatus = new StudentAverageStatus();

    studentAverageStatus.init();
  }

  private void init() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o código do aluno:");
    code = input.nextInt();

    System.out.println("Digite o nome do aluno:");
    name = input.next();

    // System.out.println("Digite a primeira nota:");
    first_note = getNote(input, 1);
    second_note = getNote(input, 2);
    third_note = getNote(input, 3);
    fourty_note = getNote(input, 4);

    // System.out.println("Digite a segunda nota:");
    // first_note = input.nextDouble();

    // System.out.println("Digite a terceira nota:");
    // first_note = input.nextDouble();

    // System.out.println("Digite a quarta nota:");
    // fourty_note = input.nextDouble();

    input.close();

    int average = (int) getAverage();
    String status = getAverageStatus(average);

    System.out.println(status);

    System.out.println("\n\n\n");
    System.out.println("Aluno: " + name);
    System.out.println("Código: " + code);
    System.out.println("Status: " + status);
  }

  private double getNote(Scanner input, int position) {
    while (true) {
      System.out.println("Digite a nota " + position);
      double note = input.nextDouble();

      if (note < 0 || note > 5) {
        System.out.println("Digite uma nota que seja entre 0 e 5");
        continue;
      }

      return note;
    }
  }

  private double getAverage() {
    double sum = first_note + second_note + third_note + fourty_note;
    double result = sum / 4;

    return result;
  }

  private String getAverageStatus(int average) {
    String result;

    switch (average) {
      case 0:
        result = "Péssimo";
        break;
      case 1:
        result = "Ruim";
        break;
      case 2:
        result = "Regular";
        break;
      case 3:
        result = "Bom";
        break;
      case 4:
        result = "Ótimo";
        break;
      case 5:
        result = "Excelente";
        break;
      default:
        result = "indefinido";
        break;
    }

    return result;
  }
}
