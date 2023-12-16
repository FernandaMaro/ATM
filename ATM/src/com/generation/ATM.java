package com.generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ATM {
	protected int transacciones, retiro, deposito;
	private static int saldo;
	Scanner entrada = new Scanner(System.in);
	

	public void Operaciones() {
		int bandera = 0;
		int seleccion = 0;
		do {
			do {
				System.out.println("Por Favor seleccione una opción");
				System.out.println("   1. Retiro de efectivo");
				System.out.println("   2. Deposito de efectivo");
				System.out.println("   3. Consultar Saldo");
				System.out.println("   4. Quejas o sugerencias");
				System.out.println("   5. Ver último movimiento");
				System.out.println("   6. Salir del cajero");
				seleccion = entrada.nextInt();
				if (seleccion >= 1 && seleccion <= 6) {
					bandera = 1;
				} else {
					System.out.println("--------------------------------------------");
					System.out.println("Opcion no disponible, verifique su respuesta");
					System.out.println("--------------------------------------------");
				}
			} while (bandera == 0);
			if(seleccion==1) {	
				ATM movimiento = new Retiro();
				movimiento.Transacciones();
			}else if (seleccion==2) {
				ATM movimiento= new Deposito();
				movimiento.Transacciones();
			}else if (seleccion ==3) {
				ATM movimiento= new Consulta();
				movimiento.Transacciones();
			}else if(seleccion == 4){
				System.out.println("-----------------------------------------------");
				System.out.println("No disponible por el momento, intente más tarde");
				System.out.println("-----------------------------------------------");
			}else if(seleccion==5){
				
				
			}else if (seleccion==6){
				System.out.println("---------");
				System.out.println("Gracias:)");
				System.out.println("---------");
				bandera=2;
			}
		} while (bandera !=2);

	}
	
	//Metodo para retiro
	public void Retiro() {
		retiro=entrada.nextInt();
	}
	
	//Metodo para deposito
	public void Deposito() {
	        deposito = entrada.nextInt();
	}
	//Metodo abstracto
	public abstract void Transacciones();
	
	//Metodo setter y getter para consultar saldo
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo=saldo;
	}
	
}
