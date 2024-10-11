package visao;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.ClasseProduto;
import servico.ClasseProdutoServico;

public class ClasseProdutoMenu extends BaseMenu {

    private ClasseProdutoServico srv;

    public ClasseProdutoMenu(){
        super();
        this.srv = new ClasseProdutoServico();
    }

    @Override
    public void ExibirMenu() {
        int opcao = 0;
        while(opcao != 9)
        {
            Util.ClearConsole();
            System.out.println("Classe Produto");
            System.out.println("Menu de Opções");
            System.out.println("1 - Listar");
            System.out.println("2 - Localizar");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("9 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = this.scanner.nextInt();
            switch (opcao) {
                case 1:
                    this.Listar();
                    break;
                case 2:
                    this.Localizar();
                    break;
                case 3:
                    this.Adicionar();
                    break;
                case 4:
                    this.Atualizar();
                    break;
                case 5:
                    this.Remover();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    @Override
    public void Listar() {
        Util.ClearConsole();
        System.out.println("Listando...");

        ArrayList<ClasseProduto> lista = this.srv.LerTodos();
        for (ClasseProduto cp : lista) {
            this.ImprimirEmLinha(cp);
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
        Util.ClearConsole();
        System.out.println("Localizando...");

        System.out.print("Informe o código da Classe de Produto: ");
        int codigo = this.scanner.nextInt();

        ClasseProduto cp = this.srv.Ler(codigo);
        if (cp != null){
            this.ImprimirEmLinha(cp);
        }
        else{
            System.out.println("Problema - Classe de Produto não foi encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Adicionar() {
        Util.ClearConsole();
        System.out.println("Adicionando...");

        System.out.print("Informe a Descrição da Classe de Produto: ");
        String descricao = this.scanner.next();

        ClasseProduto cp = new ClasseProduto();
        cp.setCodigo(0);
        cp.setDescricao(descricao);
        cp.setDataDeInclusao(LocalDate.now());
        
        ClasseProduto cpnovo = this.srv.Criar(cp);
        if (cpnovo != null){
            System.out.println("Classe de Produto adicionada com sucesso");
        }
        else{
            System.out.println("Problema - Classe de Produto não foi adicionada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Atualizar() {
        Util.ClearConsole();
        System.out.println("Atualizando...");

        System.out.print("Informe o código da Classe de Produto: ");
        int codigo = this.scanner.nextInt();

        ClasseProduto cp = this.srv.Ler(codigo);
        if (cp != null){
            System.out.print("Informe a nova Descrição para esta Classe de Produto: ");
            String descricao = this.scanner.next();
            cp.setDescricao(descricao);
            if (this.srv.Atualizar(cp) != null){
                System.out.println("Classe de Produto atualizada com sucesso");
            }
            else{
                System.out.println("Problema - Classe de Produto não foi atualizada");
            }
        }
        else{
            System.out.println("Problema - Classe de Produto não foi encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Remover() {
        Util.ClearConsole();
        System.out.println("Removendo...");

        System.out.print("Informe o código da Classe de Produto: ");
        int codigo = this.scanner.nextInt();

        ClasseProduto cp = this.srv.Ler(codigo);
        if (cp != null){
            if (this.srv.Deletar(codigo) != null){
                System.out.println("Classe de Produto removida com sucesso");
            }
            else{
                System.out.println("Problema - Classe de Produto não foi removida");
            }
        }
        else{
            System.out.println("Problema - Classe de Produto não foi encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    private void ImprimirEmLinha(ClasseProduto cp){
        String msg = "Classe de Produto - ";
        msg += "Código: " + cp.getCodigo() + " | ";
        msg += "Descrição: " + cp.getDescricao() + " | ";
        msg += "Data de Inclusão: " + cp.getDataDeInclusao();
        System.out.println(msg);
    }    
}
