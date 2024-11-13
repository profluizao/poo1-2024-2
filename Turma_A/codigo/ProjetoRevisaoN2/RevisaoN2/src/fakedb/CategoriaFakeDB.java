package fakedb;

import java.util.ArrayList;

import dominio.Categoria;

public class CategoriaFakeDB extends BaseFakeDB<Categoria>{

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<>();
        this.tabela.add(new Categoria(1, "Roupas Masculinas"));
        this.tabela.add(new Categoria(2, "Roupas Femininas"));
        this.tabela.add(new Categoria(3, "Cama, mesa e Banho"));
        this.tabela.add(new Categoria(4, "Calçados"));
    }

    public CategoriaFakeDB(){
        super();
    }
}
