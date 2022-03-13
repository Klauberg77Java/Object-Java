package Entidades;

public class Bebidas extends Produto {
    
    private String tipo;

    public Bebidas(int codigo, String nome, String tipo) {
        super(codigo, nome);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}


