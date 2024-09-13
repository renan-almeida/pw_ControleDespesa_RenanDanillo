package models;

public class Transporte extends Despesa {
   private double kmPercorrida;
   private double valorPedagios;


    @Override
    public double calcularDespesa() {
        setValorTotal(kmPercorrida * 3);
        return getValorTotal();
    }

    @Override
    public String listaDespesa() {
        return "Sua lista de despesas com transportes é: \n" + "Kilometragem já percorrida: \n" + kmPercorrida + "Valor gasto em pedágios: \n" + valorPedagios ;
    }

    public void cadastrarDespesa(String descricao, double kmPercorrida, double valorPedagios) {
    setDescricao(descricao);
    this.kmPercorrida = kmPercorrida;
    this.valorPedagios = valorPedagios;
    }

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagios() {
        return valorPedagios;
    }

    public void setValorPedagios(double valorPedagios) {
        this.valorPedagios = valorPedagios;
    }
}
