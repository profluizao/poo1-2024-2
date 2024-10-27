package servico;

import java.util.ArrayList;

import dominio.Proprietario;
import repositorio.ProprietarioRepo;

public class ProprietarioServico extends BaseServico<Proprietario>{
    
    private ProprietarioRepo repositorio;

    public ProprietarioServico(){
        this.repositorio = new ProprietarioRepo();
    }

    @Override
    public ArrayList<Proprietario> Navegar() {
        return this.repositorio.Browse();
    }

    @Override
    public Proprietario Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public Proprietario Editar(Proprietario obj) {
        return this.repositorio.Edit(obj);
    }

    @Override
    public Proprietario Adicionar(Proprietario obj) {
        return this.repositorio.Add(obj);
    }

    @Override
    public Proprietario Remover(int chave) {
        return this.repositorio.Delete(chave);
    }
}

