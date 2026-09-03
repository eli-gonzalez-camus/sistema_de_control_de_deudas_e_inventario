package main;

import model.Cliente;
import sistema.Sistema;

import java.util.Scanner;


public class Main {
    static void main() {
        Sistema sistema = new Sistema();
        Cliente cliente = new Cliente();
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Ingrese el nombre del cliente:");
        cliente.setNombreCliente(teclado.nextLine());
        System.out.println("Ingrese el identificador del cliente:");
        cliente.setIdCliente(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Ingrese telefono de cliente:");
        cliente.setTelefono(teclado.nextLine());
        sistema.agregarCliente(cliente);
        System.out.println(cliente.toString());



    }
}
