package ico.fes.poo;

/**
 *
 * @author 4dib
 */
public class IcoFesPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Vehiculo vehiculo = new Vehiculo();
    vehiculo.setMarca("Honda");
    vehiculo.setLlan1(new Llanta("Negro", 205f, "Michelin"));
    vehiculo.setMot(new Motor ("Volkswagen", 98f, "combinado 21-22 km/l"));
  System.out.println(vehiculo.getMot().getMotor()); 
    }

}
