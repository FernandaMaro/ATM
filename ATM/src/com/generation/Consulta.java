package com.generation;

public class Consulta extends ATM {
	@Override
	public void Transacciones() {
		System.out.println("---------------------------------");
		System.out.println("Tu saldo actual es: " + getSaldo());
		System.out.println("---------------------------------");
	}

}
