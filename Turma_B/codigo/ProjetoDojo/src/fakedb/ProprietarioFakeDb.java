package fakedb;

import java.util.ArrayList;

import dominio.Proprietario;

public class ProprietarioFakeDb extends BaseFakeDb<Proprietario>{

    @Override
    public ArrayList<Proprietario> PreencherDados() {
        this.tabela = new ArrayList<>();
        this.tabela.add(new Proprietario(1, "Arthur", 
        "Campo Grande","67 999647169"));
        return this.tabela;
    }
    public ProprietarioFakeDb()
    {
        super();
    }
}
