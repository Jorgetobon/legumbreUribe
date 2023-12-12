package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //entrada de variables
        String nombreProducto;
        String nombreDistribuidor;
        double costoLote;
        double costoVentaPublica;
        double totalCompra;
        int cantidadCompradaProducto;


        Scanner leerDato= new Scanner(System.in);

        System.out.println("**************");
        System.out.println("Frugal");
        System.out.println("*************");

        System.out.print("1. Ingrese nombre del producto: ");
        nombreProducto= leerDato.nextLine();
        System.out.print("2. Ingrese del distribuidor: ");
        nombreDistribuidor= leerDato.nextLine();

        System.out.print("3. Ingrese el costo de lote: ");
        costoLote= leerDato.nextDouble();
        System.out.println("*********************");
        System.out.println("Resumen ingreso mercancia: ");
        System.out.println("lote que entra: "+nombreProducto);
        System.out.println("costo total: "+costoLote);
        System.out.println("entregado por: "+nombreDistribuidor );
        System.out.println("**********************");


        costoVentaPublica= 5000;
        System.out.print("\n Costo de la venta publica es: \n"+costoVentaPublica);
        System.out.println();

        System.out.print("5. Ingrese la cantidad del producto ");
        cantidadCompradaProducto= leerDato.nextInt();

        totalCompra= costoVentaPublica*cantidadCompradaProducto;
        System.out.println("6. El total de su compra es: $"+ totalCompra);

        System.out.println("********************");

    }

}