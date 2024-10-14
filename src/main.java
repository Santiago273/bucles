import java.util.*;
import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {

        //EJERCICIO 01
       /* Scanner sc = new Scanner(System.in);
        String actividad = "";
        int tiempo = 0;
        int tiempo_acumulado = 0;

        for(int i=0; i < 4; i++){
            if (i == 0){
                actividad = "estudiar";
            }else if (i == 1){
                actividad = "hacer ejercicio";
            }else if (i == 2){
                actividad = "leer";
            }else if (i == 3){
                actividad = "tiempo libre";
            }
            System.out.println("Ingrese las horas que le dedica a "+actividad);
            tiempo = sc.nextInt();

            tiempo_acumulado += tiempo;
        }

        System.out.println("Su tiempo total dedicado a dichas actividades es de "+tiempo_acumulado+" horas.");



        //EJERCICIO 02

        int empleados = 0;
        String empleado ="";
        int horas_extras = 0;
        int precioTotal = 0;
        empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));

        for (int i=0; i < empleados; i++){
            empleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
            horas_extras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras de "+empleado));
            precioTotal = horas_extras * 15;

            JOptionPane.showMessageDialog(null, "El total a pagar a " + empleado + " es de $" + precioTotal);
        }



        //EJERCICIO 03

        int cant_prod = 0;
        int disponible = 0;
        String producto = "";

        cant_prod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
        for(int i = 0; i < cant_prod; i++){
            producto = JOptionPane.showInputDialog("Ingrese el producto");
            disponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible de "+producto));
            if (disponible < 5 ){
                JOptionPane.showMessageDialog(null,"Es necesario realizar un pedido de "+producto);
            }
        }


        //EJERCICIO 04

        int ventas = 0;
        int ventas_semanal = 0;

        for (int i=0; i<7;i++){
            ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la venta del día "+(i+1)));
            ventas_semanal += ventas;
        }

        JOptionPane.showMessageDialog(null, "El total de ventas en la sema a es de $"+ventas_semanal);

        */

        //EJERCICIO 05

        int empleados = 0;
        String empleado ="";
        int horas = 0;
        int horas_extra = 0;

        empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));

        for (int i=0; i < empleados; i++){
            empleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
            horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas de "+empleado));
            if (horas > 40){
                horas_extra = horas - 40;
                JOptionPane.showMessageDialog(null, "El total de horas extras de " + empleado + " es de " + horas_extra+" horas");
            }else{
                JOptionPane.showMessageDialog(null, "El total de horas extras de " + empleado + " es de 0 horas");
            }

        }
    }
}
