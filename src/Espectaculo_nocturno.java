public class Espectaculo_nocturno{
   public  String Escojerlugar = null;
    public double precionocturno= 0;
    public Espectaculo_nocturno(double precioparanocturno, String EscojerEllugar) {
        this.precionocturno = precioparanocturno;
        this.Escojerlugar = EscojerEllugar;
    }
/**
 * public double Obtprecio(){
 * return precionocturno;
 * }
 * public String Obtsitio(){
 * return Escojerlugar;
 * }public String Paquete(String Escojerlugar){
 * return Escojerlugar;
 * }
 * public double paquete(double precionocturno)
 * {return  precionocturno;}
 **/
    public static String paquete(double precionocturno, String Escojerlugar){
        return   precionocturno +" y Su lugar es "+ Escojerlugar ;
    }

    // influye la manera de ordenar primero regresamos
    //un double asi que ponemos primero double y uego un String
}