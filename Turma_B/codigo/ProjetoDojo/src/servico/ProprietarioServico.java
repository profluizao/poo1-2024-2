package servico;

import java.util.ArrayList;

import dominio.Proprietario;
import repositorio.ProprietarioRepositorio;

public class ProprietarioServico extends BaseServico<Proprietario>{

    
    private ProprietarioRepositorio repositorio;
    public ProprietarioServico(){
        this.repositorio = new ProprietarioRepositorio();
    }
    
    @Override
    public Proprietario Criar(Proprietario obj) {
        return this.repositorio.Create(obj);
        
    }

    @Override
    public ArrayList<Proprietario> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Proprietario Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public Proprietario Atualizar(Proprietario obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Proprietario Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }
    
}
