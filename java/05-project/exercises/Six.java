package exercises;

// Votes of city
import java.util.Scanner;

public class Six {

  String cidade;
  int eleitores;
  float branco;
  float nulo;
  float valido;

  public void entrar() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o nome da cidade: ");
    cidade = input.next();
    System.out.println("Digite a quantidade de eleitores: ");
    eleitores = input.nextInt();
    System.out.println("Digite a quantidade de votos brancos: ");
    branco = input.nextInt();
    System.out.println("Digite a quantidade de votos nulos: ");
    nulo = input.nextInt();
    System.out.println("Digite a quantidade de votos validos: ");
    valido = input.nextInt();

    // input.close();
  }

  public void imprimir() {

    System.out.println("Municipio: " + cidade);

    System.out.print("Eleitores   ");
    System.out.print("Quantidade : " + eleitores + "  ");
    System.out.println("Porcentagem : " + (eleitores / eleitores) * 100 + "%" + "  ");

    System.out.print("Votos em Branco   ");
    System.out.print("Quantidade : " + branco + "  ");
    System.out.println("Porcentagem : " + (branco / eleitores) * 100 + "%" + "  ");

    System.out.print("Votos Nulos   ");
    System.out.print("Quantidade : " + nulo + "  ");
    System.out.println("Porcentagem : " + (nulo / eleitores) * 100 + "%" + "  ");

    System.out.print("Votos Validos   ");
    System.out.print("Quantidade : " + valido + "  ");
    System.out.println("Porcentagem : " + (valido / eleitores) * 100 + "%" + "  ");
  }

  public void execute() {
    this.entrar();
    this.imprimir();
  }

  public static void main(String[] args) {
    Six city = new Six();

    city.execute();
  }
}