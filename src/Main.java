import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Bem vindo ao conversor de moeda!!!");
        System.out.println("QUAL MOEDA VOCÊ POSSUI?");
        System.out.println("1 - DOLAR");
        System.out.println("2 - REAL");
        double taxaDolar = 5.60;
        int moeda = leitor.nextInt();

        if (moeda == 1){
            System.out.println("quantos dolares você tem?");
            double dolar = leitor.nextDouble();
            System.out.println("você tem " + dolar * taxaDolar + " reais");
        }

        else if (moeda == 2){
            System.out.println("quantos reais você tem?");
            double reais = leitor.nextDouble();
            System.out.println("você tem "+ reais / taxaDolar+ " dolares");
        }
    }
}