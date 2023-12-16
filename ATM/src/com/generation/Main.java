package com.generation;

public class Main {
	public static void main(String []args) {
		ATM movimiento = new Consulta();
		movimiento.setSaldo(10_000);
		movimiento.Operaciones();
	}
}
