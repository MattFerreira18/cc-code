package exercises;

// commition of a seller
import java.util.Scanner;

class Seven {
  int totalSales;
  double totalSalesEarned;
  double salary;
  double commissionPerSale;
  double commission;
  double salaryWithCommission;
  float commissionOfTotalSalesEarnedPercentage = 0.05f; // 5%

  public static void main(String args[]) {
    Seven seven = new Seven();

    seven.execute();
  }

  private void input() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o total de vendas:");
    totalSales = input.nextInt();

    System.out.println("Digite o total ganho em vendas:");
    totalSalesEarned = input.nextDouble();

    System.out.println("Digite o salário:");
    salary = input.nextDouble();

    System.out.println("Digite a comissão por venda:");
    commissionPerSale = input.nextDouble();

    // input.close();
  }

  public void execute() {
    this.input();
    this.computeTotalCommission();
    this.computeSalaryWithCommission();
    this.output();
  }

  private double getCommissionOfTotalSales() {
    return totalSales * commissionPerSale;
  }

  private double getCommissionOfTotalSalesEarned() {
    return totalSalesEarned * commissionOfTotalSalesEarnedPercentage;
  }

  private void computeTotalCommission() {
    commission = getCommissionOfTotalSales() + getCommissionOfTotalSalesEarned();
  }

  private void computeSalaryWithCommission() {
    salaryWithCommission = salary + commission;
  }

  private void output() {
    System.out.println("Salário final do vendedor: " + salaryWithCommission);
  }
}
