 import java.util.Scanner;

public class G2ejercicio5{
    public static void main(String[] args) {
        double valor, resultado, cantidad, precio, precioIva, precioTotal, iva, descuento, precioDescuento;
        String tipo, plato;
        
        precio = 0;
        valor = 1;
        resultado = 0;
        plato = "";
        
        System.out.print("Programa para facturar los platos de comida comprados" + "\n" + "Digite el tipo de comida que desea: \n" + "\n" + "V para Comida Vegetariana"
        + "\n" + "N para Comida NO Vegetariana" + "\n" + "R para Comida Rapida"+ "\n\n");
        
        Scanner teclado = new Scanner(System.in);
        tipo = teclado.nextLine();
        
        while (!tipo.equals("V")  && !tipo.equals("N") && !tipo.equals("R")) {
            
            System.out.print("Ingrese un tipo de comida correcto " + "\n");
            tipo = teclado.nextLine();
         
        }
        
        if (tipo.equals("V")) {
           System.out.print("Seleccione el plato que desea comer digitando un valor entre 1 y 3" + "\n" + " 1- Sopas de vegetales \n" 
           + " 2- Ensaladas \n" + " 3- jugos \n");
           
           valor = teclado.nextDouble();
           
           while (valor < 1 || valor > 3) {
            
            System.out.print("Ingrese un valor entre 1 y 3 " + "\n");
            valor = teclado.nextDouble();
         
          }
           
        }
        else if (tipo.equals("N")) {
            System.out.print("Seleccione el plato que desea comer digitando un valor entre 1 y 2" + "\n" + " 1- Bandeja de carne \n" 
           + " 2- Bandeja de pollo \n");
           
           valor = teclado.nextDouble();
           
           while (valor < 1 || valor > 2) {
            
            System.out.print("Ingrese un valor entre 1 y 2 " + "\n");
            valor = teclado.nextDouble();
         
          }
        }
        else if (tipo.equals("R")) {
            System.out.print("Seleccione el plato que desea comer digitando un valor entre 1 y 2" + "\n" + " 1- Perros calientes \n" 
           + " 2- Hamburguesas \n");
           
           valor = teclado.nextDouble();
           
           while (valor < 1 || valor > 2) {
            
            System.out.print("Ingrese un valor entre 1 y 2 " + "\n");
            valor = teclado.nextDouble();
         
          }
        }
        
        
        System.out.print("Digite la cantidad de platos que desea comprar " + "\n");
        cantidad = teclado.nextDouble();
       
        if (tipo.equals("V") && valor == 1) {
            plato = "Sopas de vegetales";
            precio = 10000;
        }
        else if (tipo.equals("V") && valor == 2) {
            plato = "Ensaladas";
            precio = 25000;
        }
        else if (tipo.equals("V") && valor == 3) {
            plato = "Jugos";
            precio = 5000;
        }
        else if (tipo.equals("N") && valor == 1) {
            plato = "Bandeja de carne";
            precio = 30000;
        }
        else if (tipo.equals("N") && valor == 2) {
            plato = "Bandeja de pollo";
            precio = 28000;
        }
        else if (tipo.equals("R") && valor == 1) {
            plato = "Perro caliente";
            precio = 5000;
        }
        else if (tipo.equals("R") && valor == 2) {
            plato = "Hamburguesa";
            precio = 7000;
        }
        
        precioTotal = precio * cantidad;
        iva = (19.0 / 100.0) * precioTotal;
        precioIva = precioTotal + iva;
        
        if (tipo.equals("V")) {
          descuento = (20.0 / 100.0) * precioIva;
          precioDescuento = precioIva - descuento;
          System.out.print("Detalle de su factura " + "\n" + "Plato comprado " + plato + "\n" + 
        "Cantidad de platos " + cantidad + "\n" + "Precio antes de IVA $" + precioTotal + "\n" +
        "Precio con IVA $" + precioIva + "\n" + "Precio a pagar con el descuento del 20% " + precioDescuento + "\n");
        }
        else if (tipo.equals("N")) {
          descuento = (10.0 / 100.0) * precioIva;
          precioDescuento = precioIva - descuento;
          System.out.print("Detalle de su factura " + "\n" + "Plato comprado " + plato + "\n" + 
        "Cantidad de platos " + cantidad + "\n" + "Precio antes de IVA $" + precioTotal + "\n" +
        "Precio con IVA $" + precioIva + "\n" + "Precio a pagar con el descuento del 10% " + precioDescuento + "\n");
        }
        else if (tipo.equals("R")) {
          System.out.print("Detalle de su factura " + "\n" + "Plato comprado " + plato + "\n" + 
        "Cantidad de platos " + cantidad + "\n" + "Precio antes de IVA $" + precioTotal + "\n" +
        "Precio con IVA $" + precioIva + "\n");
        }
        
        
        
    }
}