package repositorio;

import dominio.Categoria;
import fakedb.CategoriaFakeDB;

public class CategoriaRepositorio extends BaseRepositorio<Categoria>{

    private CategoriaFakeDB db;

    public CategoriaRepositorio(){
        this.db = new CategoriaFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public Categoria Create(Categoria obj) {
        //Mecanismo de Autoincremento
        int codigoAtual = 0;
        if (this.dados.size() == 0)
            codigoAtual = 1;
        else
            codigoAtual = this.dados.getLast().getCodigo() + 1;
        obj.setCodigo(codigoAtual);
        this.dados.add(obj);
        return obj;
    }

    @Override
    public Categoria Read(int chave) {
        for (Categoria cat : this.dados) {
            if (cat.getCodigo() == chave)
            {
                return cat;
            }
        }
        return null;
    }

    @Override
    public Categoria Update(Categoria obj) {
        Categoria antiga = this.Read(obj.getCodigo());
        if(antiga != null){
            antiga.setDescricao(obj.getDescricao());
            return antiga;
        }
        return null;
    }

    @Override
    public Categoria Delete(int chave) {
        Categoria antiga = this.Read(chave);
        if(antiga != null){
            this.dados.remove(antiga);
            return antiga;
        }
        return null;
    }
}
