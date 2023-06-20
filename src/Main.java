
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         double preciodeparque,preciobufet, precioEspetaculo,nadarDF = 0;
         String tipodecomida,lugardeubicacion = null;

        Scanner Respuesta = new Scanner (System.in);

        System.out.println("Solicitar informacion");
        System.out.println("\nPrecio de entrada al parque acuático ");
        preciodeparque = Respuesta.nextDouble();
       // ---------------------------------------------------------------------------------------------------------------------
        System.out.println("\nPrecio del buffet");
        preciobufet = Respuesta.nextDouble();
        System.out.println("\nPara la comida se tiene el siguiente menú "+
                "Sándwiches,pescado,ensallada,");
        tipodecomida = Respuesta.next();
        //---------------------------------------------------------------------------------------------------------------------
        System.out.println("\nPrecio por ver el espectáculo nocturno ");
        precioEspetaculo = Respuesta.nextDouble();

        System.out.println("\nQue ubicación de sea estar ubicado Balcón , VIP o General ");
        lugardeubicacion = Respuesta.next();

        //---------------------------------------------------------------------------------------------------------------------
        System.out.println("\nPrecio por nadar con delfines \n");
        nadarDF = Respuesta.nextDouble();

        Parque_Acuatico parque_acuatico = new Parque_Acuatico(preciodeparque);
        ComidaBuffet comidaBuffet = new ComidaBuffet( preciobufet,tipodecomida );
        Espectaculo_nocturno espectaco_nocturno = new Espectaculo_nocturno( precioEspetaculo, lugardeubicacion);
        Nadar_con_del_fines nadar_con_del_fines = new Nadar_con_del_fines(nadarDF);
        //---------------------------------------------------------------------------------------------------------------

        System.out.println("________________________________________________________________________________________________________");
        //Sobrecarga de metodo

        System.out.println("Lista de paquetes Disponibles\n");
        System.out.println("\n Precio de Entrada " + Parque_Acuatico.paquete(preciodeparque));
        System.out.println(
                "Precio de Entrada "+ Parque_Acuatico.paquete(preciodeparque)
                        +" + Comida buffet " + ComidaBuffet.paquete(comidaBuffet.precioBuffet, comidaBuffet.nombreplatillo)+"\n");

        System.out.println(
                "Precio de Entrada "+ Parque_Acuatico.paquete(preciodeparque) + " + Comida buffet" +
                ComidaBuffet.paquete(comidaBuffet.precioBuffet, comidaBuffet.nombreplatillo)+
                        " + espectáculo nocturno que tiene un precio de $"
                        + Espectaculo_nocturno.paquete(preciodeparque,lugardeubicacion)+ "\n");

        System.out.println(
                "Precio de Entrada "+ Parque_Acuatico.paquete(preciodeparque) +" + Comida buffet " +
                        ComidaBuffet.paquete(comidaBuffet.precioBuffet, comidaBuffet.nombreplatillo)
                        +" + espectáculo nocturno que tiene un precio de $"+ Espectaculo_nocturno.paquete(preciodeparque,lugardeubicacion)
                        +"+ show de delfines con un costo de $"+ Nadar_con_del_fines.paquete(nadarDF)+"\n");


    }


}