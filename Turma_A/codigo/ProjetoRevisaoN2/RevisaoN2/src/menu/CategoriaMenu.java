package menu;

import java.util.ArrayList;

import dominio.Categoria;
import servico.CategoriaServico;

public class CategoriaMenu extends BaseMenu<Categoria>{

    private CategoriaServico srv;

    public CategoriaMenu(){
        super();
        this.srv = new CategoriaServico();
    }

    @Override
    public void exibirMenu() {
        int opcao = 0;
        while(opcao != 9){
            Util.LimparConsole();
            System.out.println("Cadastro de Classes de Produto");
            System.out.println("1 - Listar");
            System.out.println("2 - Localizar");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("9 - Sair");
            System.out.print("Selecione uma opção: ");            
            opcao = this.scanner.nextInt();
            switch (opcao) {
                case 1:
                    this.listar();
                    break;
                case 2:
                    this.localizar();
                    break;
                case 3:
                    this.adicionar();
                    break;
                case 4:
                    this.atualizar();
                    break;
                case 5:
                    this.remover();
                    break;
                case 9:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

    @Override
    protected void listar() {
        Util.LimparConsole();
        System.out.println("Listando");
        System.out.println("**************************************************");

        ArrayList<Categoria> lista = this.srv.LerTodos();
        for (Categoria cat : lista) {
            this.ImprimirPorLinha(cat);
        }        

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    protected void localizar() {
        Util.LimparConsole();
        System.out.println("Localizando");
        System.out.println("**************************************************");

        System.out.print("Informe o código da Categoria: ");
        int cod = this.scanner.nextInt();

        Categoria cat = this.srv.Ler(cod);
        if (cat != null){
            System.out.println("==================================================");
            this.ImprimirPorLinha(cat);
        }
        else{
            System.out.println("Problema - Categoria não encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    protected void adicionar() {
        Util.LimparConsole();
        System.out.println("Adicionando");
        System.out.println("**************************************************");

        System.out.print("Informe a Descrição: ");
        String descricao = this.scanner.next();       
        Categoria cat = new Categoria();
        cat.setDescricao(descricao);
        if (this.srv.Criar(cat) != null){
            System.out.println("Categoria adicionada com sucesso");
            System.out.println("==================================================");
            this.ImprimirPorLinha(cat);
        }
        else{
            System.out.println("Problema - Erro ao adicionar Categoria");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    protected void atualizar() {
        Util.LimparConsole();
        System.out.println("Atualizando");
        System.out.println("**************************************************");

        System.out.print("Informe o código da Categoria: ");
        int cod = this.scanner.nextInt();

        Categoria cat = this.srv.Ler(cod);
        if (cat != null){
            this.ImprimirPorLinha(cat);
            System.out.print("Informe a nova Descrição: ");
            String descricao = this.scanner.next();
            cat.setDescricao(descricao);
            if (this.srv.Atualizar(cat) != null){
                System.out.println("Alteração realizada com sucesso");
                System.out.println("==================================================");
                this.ImprimirPorLinha(cat);
            }
            else{
                System.out.println("Problema - alteração não foi realizada");
            }
        }
        else{
            System.out.println("Problema - Categoria não encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    protected void remover() {
        Util.LimparConsole();
        System.out.println("Removendo");
        System.out.println("**************************************************");

        System.out.print("Informe o código da Classe de Produto: ");
        int cod = this.scanner.nextInt();
        Categoria cat = this.srv.Ler(cod);
        if (cat != null){
            if (this.srv.Remover(cod) != null){
                
                System.out.println("Classe de Produto excluida com sucesso");
                System.out.println("==================================================");
                this.ImprimirPorLinha(cat);
            }
            else{
                System.out.println("Problema - Classe de Produto não foi excluida");
            }
        }
        else{
            System.out.println("Problema - Classe de Produto não encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();    }

    @Override
    protected void ImprimirPorLinha(Categoria obj) {
        String mensagem = "";
        mensagem += "Categoria: ";
        mensagem += "Código: " + obj.getCodigo() + " | ";
        mensagem += "Descrição: " + obj.getDescricao();        
        System.out.println(mensagem);
        System.out.println("==================================================");
    }   
}
