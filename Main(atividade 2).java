import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Pessoa people = new Pessoa ("Gustavo", 20, "masculino");
    Empregado trab = new Empregado ("112063", 1500, "Gustavo", 20, "masculino");
    Vendedor sale = new Vendedor ("152030", 1200,1000, 100,"Gustavo", 20, "masculino");
    Gerente chefe = new Gerente("125060", 3000, "Marcos", 1700, "Gustavo", 20, "masculino",
  1500, "112063");
  Cliente p = new Cliente(800, 2002,"Gustavo", 20, "masculino");
System.out.println(people);
System.out.println("Você é empregado do gerente " + chefe.getGerente());
System.out.println("O Cliente precisa te pagar " + p.getDivida() + "R$ " + "pelos " 
+ sale.getQnt() + "produtos");
  }
}
