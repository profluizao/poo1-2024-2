package repositorio;

import java.util.ArrayList;

public abstract class BaseRepositorio<TDominio> {
    protected ArrayList<TDominio> dados;

    public abstract TDominio Create(TDominio obj);
    public abstract TDominio Read(int chave);

    public ArrayList<TDominio> ReadAll(){
        return this.dados;
    }

    public abstract TDominio Update(TDominio obj);
    public abstract TDominio Delete(int chave);

}
