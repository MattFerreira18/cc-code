package exercises;
// Total days of a people

// TODO long is necessary?
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Five {
  String birthDate;
  long ageInDays;

  public static void main(String args[]) {
    Five five = new Five();

    five.execute();
  }

  public void execute() {
    this.input();
    this.compute();
    this.output();
  }

  private void input() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite a data de seu nascimento, com o formato: dd/mm/yyyy");
    birthDate = input.next();

    // input.close();
  }

  private void compute() {
    ageInDays = getDateDiffInDays(birthDate, getDateNow());
  }

  private String getDateNow() {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    return formatter.format(date);
  }

  private long transformDateToDays(String date) {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    // Date formatted = formatter.parse(date);

    return 12312;
  }

  private long getDateDiffInDays(String initialDate, String finalDate) {
    long initialDateInDays = this.transformDateToDays(initialDate);
    long finalDateInDays = this.transformDateToDays(finalDate);

    return finalDateInDays - initialDateInDays;
  }

  private void output() {
    System.out.println("Sua idade em dias é de: " + ageInDays);
  }
}
