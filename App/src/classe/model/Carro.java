package model;
public class Carro {

	public String marca;
	public String cor;
	public String modelo;
	public int ano;
	public boolean ligar;
	public String placa;
	public int capacidadeTanque;

	public Carro(String mc,String md, String plc) {
		this.marca = mc;
		this.modelo = md;
		this.placa = plc;
		this.ligar = false;
	}

	public void acelerar(int velocidade) {
		System.out.println("ACELEROU " + velocidade);
	}

	public void frear() {
		System.out.println("FREIOU");
	}

	public void ligar() {
		if(ligar == false) {
			System.out.println("TENTANDO LIGAR: LIGANDO CARRO");
			ligar = true;
		}
		else {
			System.out.println("TENTANDO LIGAR: NÃO É POSSIVEL. DESLIGUE PRIMEIRO");
		}
	}

	public void desligar() {
		if(ligar == true) {
			System.out.println("TENTANDO DESLIGAR: DESLIGANDO..");
			ligar = false;
		}
		else {
			System.out.println("TENTANDO DESLIGAR: LIGUE PRIMEIRO PARA DESLIGAR");
		}
	}

	public void buzinar() {
		System.out.println("BEEEEEEEEEEEEEEEEEEEEEEEE");
	}

	// Novo Metodo Calcular Gasolina
	public double encherTanque (double valorGasolina) {
		return this.capacidadeTanque * valorGasolina;
	}
}
