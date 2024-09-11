package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {
    //Atributo protegido.
    protected ArrayList<TDominio> tabela;

    //Propriedade Somente Leitura (Read-only).
    public ArrayList<TDominio> getTabela() {
        return tabela;
    }

    // 1 - métodos abstract não podem ter código.
    // 2 - métodos abstract devem ser codificados nas classes filhas (reais).
    // 3 - este método deve ser executado toda a vez que a classe filha for instanciada.
    protected abstract void preencherDados();

    public BaseFakeDB(){
        this.preencherDados();
    }
}
