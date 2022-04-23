import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String nomeProduto;
        float precoDeCusto;
        float precodeVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner leitor = new Scanner(System.in);

        int i = 0;
        for (; i < 3; i++) {

            System.out.print("Digite o nome do produto: ");
            nomeProduto = leitor.next();

            System.out.print("Digite o preço de custo do produto: ");
            precoDeCusto = leitor.nextFloat();

            System.out.print("Digite o preço de venda do produto: ");
            precodeVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoDeCusto;
            totalVenda = totalVenda + precodeVenda;

            if (precoDeCusto == precodeVenda) {
                System.out.println("Houve um empate entre o preço de custo e venda");
            }else {
                if (precoDeCusto > precodeVenda) {
                    System.out.println("Prejuizo");
                }else {
                    System.out.println("Lucro");
                }
            }

            System.out.println(nomeProduto + ", preço de custo = " + precoDeCusto
                    + ", preço de venda = " + precodeVenda);
        }
        System.out.println("A média do preço  de custo é de: " + (totalCusto / i));
        System.out.println("A média do preço  de venda é de: " + (totalVenda / i));
    }
}
