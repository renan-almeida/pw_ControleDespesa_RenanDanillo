package models;

public abstract class Despesa {
    private String descricao;
    private double valorTotal;

    public void cadastrasDespesa(String descricao) {
        this.descricao = descricao;
        this.valorTotal = 0;
    }

    public  abstract  double  calcularDespesa();


    public abstract  String listaDespesa();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
