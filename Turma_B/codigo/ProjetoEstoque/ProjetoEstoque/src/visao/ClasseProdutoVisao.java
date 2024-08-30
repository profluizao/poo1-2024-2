package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoVisao {
    
    public ClasseProdutoVisao(){
    }

    public void Exibir(){

        ClasseProdutoFakeDB db = new ClasseProdutoFakeDB();
        ArrayList<ClasseProduto> lista = db.getTabela();
        for (ClasseProduto cp : lista) {
            System.out.println("Classe de Produto");
            System.out.println("Código: " + cp.getCodigo());
            System.out.println("Descrição: " + cp.getDescricao());
            System.out.println("Data de Inclusão: " + cp.getDataDeInclusao());
        }
    }
}
