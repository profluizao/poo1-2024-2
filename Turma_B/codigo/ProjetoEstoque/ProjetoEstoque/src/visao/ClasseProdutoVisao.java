package visao;

import java.util.ArrayList;
import dominio.ClasseProduto;
import repositorio.ClasseProdutoRepositorio;

public class ClasseProdutoVisao {
    
    public ClasseProdutoVisao(){
    }

    public void Exibir(){
        ClasseProdutoRepositorio repo = new ClasseProdutoRepositorio();
        ArrayList<ClasseProduto> lista = repo.ReadAll();
        for (ClasseProduto cp : lista) {
            this.Imprimir(cp);
        }
    }

    private void Imprimir(ClasseProduto cp){
        System.out.println("Classe de Produto");
        System.out.println("Código: " + cp.getCodigo());
        System.out.println("Descrição: " + cp.getDescricao());
        System.out.println("Data de Inclusão: " + cp.getDataDeInclusao());
    }
}
