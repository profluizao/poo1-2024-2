package fakedb;
import java.util.ArrayList;
public abstract class BaseFakeDb<Tdominio> {
    protected ArrayList<Tdominio> tabela;

    
    public ArrayList<Tdominio> getTabela() {
        return tabela;
    }

    public abstract ArrayList<Tdominio> PreencherDados();

    public BaseFakeDb()
    {
        this.PreencherDados();
    }

}
