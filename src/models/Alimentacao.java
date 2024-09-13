package models;

public class Alimentacao extends Despesa {
    private  String nomeRestaurante;
    private int qtdRefeicao;

    @Override
    public String listaDespesa() {
        return "Sua lista de despesas com alimentações é: \n" + "Nome do restaurante: \n" +  nomeRestaurante + "Quantidade de refeições feitas: \n" + qtdRefeicao;
    }

    public double calcularDespesa() {
        setValorTotal(qtdRefeicao * 18);
     return getValorTotal();
    }



    public void cadastrarDespesa(String descricao, String nome, int qtdRefeicao ) {
        setDescricao(descricao);
        this.nomeRestaurante = nome;
        this.qtdRefeicao = qtdRefeicao;

    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }
}
