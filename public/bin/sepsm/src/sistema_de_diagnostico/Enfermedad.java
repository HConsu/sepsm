package sistema_de_diagnostico;
/**
 *
 * @author David
 */
public class Enfermedad {
    private static String nombre;
    private static String Tratamiento;

    /**
     * @return the nombre
     */
    public static String getNombre() {
        return nombre;
    }

    /**
     * @param aNombre the nombre to set
     */
    public static void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * @return the Tratamiento
     */
    public static String getTratamiento() {
        return Tratamiento;
    }

    /**
     * @param aTratamiento the Tratamiento to set
     */
    public static void setTratamiento(String aTratamiento) {
        Tratamiento = aTratamiento;
    }
    

}
