package visao;

import java.util.ArrayList;
import java.time.LocalDate;
import dominio.ClasseProduto;
import servico.ClasseProdutoServico;



public class ClasseProdutoVisao {
    
    public ClasseProdutoVisao(){
    }

    public void Exibir(){
        ClasseProdutoServico srv = new ClasseProdutoServico();
        ArrayList<ClasseProduto> lista = srv.Navegar();
        System.out.println("===========================================================");
        for (ClasseProduto cp : lista) {
            this.Imprimir(cp);
        }
    }

    private void Imprimir(ClasseProduto cp){
        System.out.println("Classe de Produto:");
        System.out.println("Código: " + cp.getCodigo());
        System.out.println("Descrição: " + cp.getDescricao());
        System.out.println("Data de Inclusão: " + cp.getDataInclusao());
        System.out.println("--------------------------------------------------------");
    }

    public void Criar(){
        ClasseProduto novo = new ClasseProduto(0, "Teste", LocalDate.now());
        ClasseProdutoServico srv = new ClasseProdutoServico();
        srv.Adicionar(novo);
        Imprimir(novo);
    }
}
