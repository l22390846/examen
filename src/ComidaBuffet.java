  public class ComidaBuffet {
      //herencia para comida buffet
      public String nombreplatillo;
      public static double precioBuffet;

      public ComidaBuffet(double precioDeBuffet, String nombreplatillo) {
          this.precioBuffet = precioDeBuffet;
          this.nombreplatillo = nombreplatillo;
      }

      public static String paquete(double presioBuffet, String nombreplatillo){
          return " precio del platillo $"+precioBuffet + " Comida elegida " + nombreplatillo;
          }

    }



  /**
   public String ObtnombrePlatillo() {
   return nombreplatillo;
   }

   public double ObtprecioBFF() {
   return precioBuffet;
   **/
  //solocitar el nombre del platitllo
  //
