package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {
    protected ArrayList<TDominio> tabela;

    public ArrayList<TDominio> getTabela(){
        return this.tabela;
    }

    protected abstract void preencherDados();

    public BaseFakeDB(){
        this.preencherDados();
    }
}
