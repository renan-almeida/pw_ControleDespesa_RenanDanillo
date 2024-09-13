package models;

public class Diaria extends Despesa {
    private double qtdDiaria;

    @Override
    public double calcularDespesa() {
        setValorTotal(qtdDiaria * 50);
        return getValorTotal();
    }

    @Override
    public String listaDespesa() {
        return "Sua lista de despesas com diárias é: \n " + qtdDiaria;
    }


    public void cadastrarDespesa(String descricao, double qtdDiaria) {
        setDescricao(descricao);
        this.qtdDiaria = qtdDiaria;
    }

    public double getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }
}
