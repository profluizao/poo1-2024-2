package visao;

import dominio.Proprietario;
import servico.ProprietarioServico;

public class ProprietarioVisao {
    private ProprietarioServico servico;

    public ProprietarioVisao(){
       this.servico = new ProprietarioServico(); 
    }
    public void ExibirTudo(){
        for (Proprietario pr : this.servico.Navegar()) {
            System.out.println(pr.getCodigo());
            System.out.println(pr.getNome());
            System.out.println(pr.getEndereco());
            System.out.println(pr.getTelefone());
        }
    }
}
