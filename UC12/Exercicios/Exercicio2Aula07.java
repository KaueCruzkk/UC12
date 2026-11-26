package UC12.Exercicios;

public class Exercicio2Aula07 {
    public static void main(String[] args) {
        String nomeProduto = "Notebook Dell";
        int preco = 3500;
        int quantidadeEstoque = 10;
        boolean disponivel = (quantidadeEstoque > 0);

        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Disponível: " + disponivel);
    }
}