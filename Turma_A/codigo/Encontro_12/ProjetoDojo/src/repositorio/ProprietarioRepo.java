package repositorio;

import dominio.Proprietario;
import fakedb.ProprietarioFakeDB;

public class ProprietarioRepo extends BaseRepositorio<Proprietario> {

    private ProprietarioFakeDB db;

    public ProprietarioRepo(){
        this.db = new ProprietarioFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public Proprietario Read(int chave) {
        for (Proprietario cp : this.dados) {
            if (cp.getCodigo() == chave){
                return cp;
            }
        }
        return null;
    }

    @Override
    public Proprietario Edit(Proprietario instancia) {
        Proprietario cp = this.Read(instancia.getCodigo());
        if (cp != null){
            cp.setEndereco(instancia.getEndereco());
            cp.setNome(instancia.getNome());
            cp.setTelefone(instancia.getTelefone());
            return cp;
        }
        else{
            return null;
        }
    }

    @Override
    public Proprietario Add(Proprietario instancia) {
        int pos = this.dados.size() - 1;
        Proprietario cp = this.dados.get(pos);
        int proxChave = cp.getCodigo() + 1;
        
        //ClasseProduto cp = this.dados.getLast();
        //int proxChave = cp.getCodigo() + 1;

        instancia.setCodigo(proxChave);
        this.dados.add(instancia);
        return instancia;
    }

    @Override
    public Proprietario Delete(int chave) {
        Proprietario cp = this.Read(chave);
        if (cp != null){
            this.dados.remove(cp);
            return cp;
        }
        else{
            return null;
        }
    }    
}

