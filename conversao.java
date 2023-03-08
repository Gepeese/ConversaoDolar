import java.util.Scanner;
public class conversao{
    public static void main(String[] args) {
        Float conversao,quantidadeNotas, Dolar;
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite a cotação do dolar: ");
         Dolar = Ler.nextFloat();
        System.out.println("Digite quantidade de notas em dolar: ");
        quantidadeNotas = Ler.nextFloat();
        conversao = Dolar * quantidadeNotas;
        System.out.println("Você Tem:"+conversao+" reais em notas");
        Ler.close();


    }
}