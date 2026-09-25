package model;

public class ContaBancaria {
    private double saldo = 0;
    private String titular;

    public ContaBancaria (String titular) {
        this.titular = titular;
    }
    
    public void depositar (double value) {
        if (value <= 0){
            System.out.println("Impossivel Depositar Quantia Negativa.");
            return;
        }

        this.saldo += value;
        System.out.println("Saldo Atual: " + this.saldo);
    }

    public void sacar (double value) {
        if (value <= 0){
            System.out.println("Impossivel Sacar Quantia Negativa.");
            return;
        }

        if (value > this.saldo){
            System.out.println("Impossivel Sacar Esse Valor.");
            return;
        }

        this.saldo -= value;
        System.out.println("Saldo Atual: " + this.saldo);
    }
}
