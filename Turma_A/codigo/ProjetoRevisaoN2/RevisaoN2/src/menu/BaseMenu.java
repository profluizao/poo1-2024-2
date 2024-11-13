package menu;

import java.util.Scanner;

public abstract class BaseMenu<TDominio> {

    protected Scanner scanner;

    public BaseMenu(){
        this.scanner = new Scanner(System.in);
    }    

    public abstract void exibirMenu();
    protected abstract void listar();
    protected abstract void localizar();
    protected abstract void adicionar();
    protected abstract void atualizar();
    protected abstract void remover();

    protected abstract void ImprimirPorLinha(TDominio obj);
}
