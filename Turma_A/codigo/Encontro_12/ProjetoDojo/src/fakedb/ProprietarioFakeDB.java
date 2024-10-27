package fakedb;

import java.util.ArrayList;

import dominio.Proprietario;

public class ProprietarioFakeDB extends BaseFakeDB<Proprietario>{

    public ProprietarioFakeDB(){
        super();
    }
    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<Proprietario>();
        this.tabela.add(new Proprietario(1, "Luiz","Rua Tal","6799999999"));
    }
    
}
