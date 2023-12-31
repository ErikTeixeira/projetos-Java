package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	

	private static final long serialVersionUID = 1L;
	
	
	private String tipo;
	private double chequeEspecial;
	
	
	// Getters e Setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
	// Métodos
	public double getSaldoDisponivel () {
		return super.getSaldo() + chequeEspecial; 
	}
	
	// Sobrescrita de métodos | Polimorfismo
	@Override
	public void retirar(double valor) {
		valor += 10;
		super.retirar(valor);
	}
}
