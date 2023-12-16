package com.generation;

public class Retiro extends ATM{
	@Override
	public void Transacciones() {
		System.out.print("Cuanto deseas retirar: ");
		Retiro();
		if(retiro<=6000 && retiro %50==0 &&retiro <=getSaldo()) {
			transacciones=getSaldo();
			setSaldo(transacciones - retiro);
			System.out.println("---------------------------------");
			System.out.println("Retiraste: "+ retiro);
			System.out.println("Tu saldo actual es: " + getSaldo());
			System.out.println("---------------------------------");
		}else{
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Lo sentimos, saldo insuficiente o retiro no multiplo de 50 mayor a 6000");
			System.out.println("-----------------------------------------------------------------------");	
		}
	}
}
