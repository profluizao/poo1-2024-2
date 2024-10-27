package repositorio;

import dominio.Proprietario;
import fakedb.ProprietarioFakeDb;

public class ProprietarioRepositorio extends BaseRepositorio<Proprietario>{
 
    private ProprietarioFakeDb db;

    public ProprietarioRepositorio(){
        this.db= new ProprietarioFakeDb();
        this.fonteDeDados = this.db.getTabela();
    }
    @Override
    public Proprietario Create(Proprietario instancia) {
        int pos = this.fonteDeDados.size() - 1;
        Proprietario cp = this.fonteDeDados.get(pos);
        int proxChave = cp.getId() + 1;
        instancia.setId(proxChave);
        this.fonteDeDados.add(instancia);
        return instancia;
    }

    @Override
    public Proprietario Delete(int chave) {
        Proprietario cp = this.Read(chave);
        if (cp != null){
            this.fonteDeDados.remove(cp);
            return cp;
        }
        else{
            return null;
        }        
    }

    @Override
    public Proprietario Read(int chave) {
        for (Proprietario cp : this.fonteDeDados) {
            if(cp.getId() == chave){
                return cp;
            }
        }
        return null;
    }

    @Override
    public Proprietario Update(Proprietario instancia) {
        Proprietario cp = this.Read(instancia.getId());
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
    
    
}
