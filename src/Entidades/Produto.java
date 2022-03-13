package Entidades;

public class Produto {
    private int codigo;
    private String nome;
    private int estoque;
    private double valorUnitario;

    public Produto(int codigo, String nome) {
        // Oque for vir do programa vai entrar aqui reservado this .
        
        this.codigo = codigo;
        this.nome = nome;
    }

    //que permitem obter e alterar o conteúdo de um atributo privado. 
    public int getCodigo() {
        return codigo;
    }

    // O set é para alterar oque você bota dentro dele.

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    // Métodos
    //Incluir Estoque
    //Excluir Estoque
    public void incluirEstoque(int quantidade) {
        estoque = estoque + quantidade;
    }

    public void tirarEstoque(int quantidade) {
        if(quantidade <= quantidade) {
            estoque = estoque - quantidade;
        } else {
            System.out.println("Estoque indisponível");
        }
    }
}
