/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;

/**
 *
 * @author Tucuk
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual);

        operaciones(cuenta1);

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print(e);
        }
        try {
            cuenta1.ingresar(685);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}