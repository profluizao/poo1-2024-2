package visao;

import java.util.ArrayList;

import dominio.Proprietario;
import servico.ProprietarioServico;

/**
 * ProprietarioVisao
 */
public class ProprietarioVisao {

    private ProprietarioServico servico;

    public ProprietarioVisao(){
        this.servico = new ProprietarioServico();

    }

    public void exibirTudo(){
        ArrayList<Proprietario> lista = this.servico.LerTodos();
        
        for (Proprietario proprietario : lista) {
            System.out.println("ID:"+proprietario.getId());
            System.out.println("NOME:"+proprietario.getNome());
            System.out.println("ENDERECO:"+proprietario.getEndereco());
            System.out.println("TELEFONE:"+proprietario.getTelefone());
        }
    }
}