package servico;

import java.util.ArrayList;

import dominio.Categoria;
import repositorio.CategoriaRepositorio;

public class CategoriaServico extends BaseServico<Categoria>{

    private CategoriaRepositorio repositorio;

    public CategoriaServico(){
        this.repositorio = new CategoriaRepositorio();
    }

    @Override
    public Categoria Criar(Categoria obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Categoria Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public ArrayList<Categoria> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Categoria Atualizar(Categoria obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Categoria Remover(int chave) {
        return this.repositorio.Delete(chave);
    }
    
}
