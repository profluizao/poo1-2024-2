import dominio.ClasseProduto;
import visao.ClasseProdutoVisao;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        ClasseProdutoVisao visao = new ClasseProdutoVisao();

        // Imprimir tudo.
        System.out.println("Imprimindo tudo.");
        visao.ExibirPorLinha();

        // Criar nova instância.
        System.out.println("--------------------------------------------------------");
        System.out.println("Criando uma nova instância.");
        ClasseProduto novo = new ClasseProduto(0, "Teste", LocalDate.now());
        visao.Criar(novo);
        visao.ImprimirPorLinha(novo);


        // Imprimir tudo.
        //visao.ExibirPorLinha();

        // Editar instância recém adicionada.
        System.out.println("--------------------------------------------------------");        
        System.out.println("Alterando uma instância.");
        ClasseProduto alterado = new ClasseProduto();
        alterado.setCodigo(0);
        alterado.setDescricao("Teste de alteração");
        alterado.setDataInclusao(LocalDate.now());
        visao.Editar(6, alterado);
        visao.ImprimirPorLinha(6);

        // Imprimir tudo.
        System.out.println("Imprimindo tudo.");
        visao.ExibirPorLinha();

        // Remover o item 6.
        System.out.println("Removendo o item 6.");
        visao.Remover(6);

        // Imprimir tudo.
        System.out.println("--------------------------------------------------------");        
        System.out.println("Imprimindo tudo.");
        visao.ExibirPorLinha();        
    }
}
