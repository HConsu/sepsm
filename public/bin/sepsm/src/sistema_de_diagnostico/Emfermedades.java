package sistema_de_diagnostico;

/**
 *
 * @author David
 */
public class Emfermedades extends Enfermedad {
    public String respuesta="";


    public String enfermedad (String g){
        if (g.equals("gripe")){
            setNombre("  UD TIENE GRIPOE \n");
            setTratamiento("  La principal forma de evitar que se contagie \n"
                    + "la gripe es aplicarse una vacuna anual. Si tiene gripe,\n "
                    + "el médico puede recetarle una medicina que lo ayude a combatir\n"
                    + " la infección y disminuir los ");
        }
        if (g.equals("asma")){
            setNombre("  UD TIENE ASMA \n");
            setTratamiento(" El asma se trata con dos tipos de medicinas:   \n"
                         + " medicinas para el alivio rápido o la detención \n"
                         + " de síntomas y medicinas para el control a largo\n"
                         + "plazo o la prevención de síntomas Uno de los trat\n"
                         + "amientos más corrientes y eficaces para el asma es\n"
                         + "un inhalador que se llena con un estimulante de \n"
                         + "los receptores betaadrenérgicos. En general son \n"
                         + "inhaladores con dosímetro, cartuchos manuales que\n"
                         + " contienen gas a presión. La presión hace que el\n "
                         + "fármaco se pulverice con un contenido específico \n"
                         + "del medicamento. Las personas que tienen dificultad\n"
                         + " con el uso del inhalador, pueden usar aparatos \n"
                         + "espaciadores o de retención");
        }
        if (g.equals("tuberculosis")){
            setNombre("  UD TIENE TUBERCULOSIS \n");
            setTratamiento(" Si no se trata adecuadamente, \n"
                          +" la TB puede ser mortal. Por lo\n"
                          +" general la TB activa puede curarse\n"
                          + " con varios medicamentos durante un\n"
                          + " período largo de tiempo. Las personas\n"
                          + " con TB latente pueden tomar medicamentos \n"
                          + "para no desarrollar TB activa.");
        }
        if (g.equals("bronquitis aguda")){
            setNombre("  UD TIENE BRONQUITIS AGUDA \n");
            setTratamiento(" No deben usarse antibióticos en forma\n"
                         + " rutinaria. Sólo están indicados si hay\n"
                         + " signos y hallazgos de una sobreinfección\n"
                         + " bacteriana. En este caso, la antibioticoterapia\n"
                         + " se fundamenta en los hallazgos del Gram \n"
                         + "de esputo; si esto no es posible se aconseja \n"
                         + "el uso de eritromicina, 500 mg cada 8 horas \n"
                         + "durante 7 a 10 días, puesto que es activa no\n"
                         + " sólo contra el S. pneumoniae sino también \n"
                         + "contra el Mycoplasma peumoniae. El trimetropim \n"
                         + "sulfametoxazol (160/800 mg dos veces al día \n"
                         + "durante 7 días), puede ser la alternativa, \n"
                         + "por cuanto es efectivo contra tres de los \n"
                         + "patógenos más frecuentes Si el enfermo está \n"
                         + "febril y presenta dificultad respiratoria,\n"
                         + " se hace necesaria su hospitalización. \n"
                         + "Es obligatorio solicitar una radiografía \n"
                         + "de tórax, gases arteriales, cuadro hemático \n"
                         + "y creatinina sérica. La antibioticoterapia \n"
                         + "se inicia por vía intravenosa con un agente \n"
                         + "betalactámico parenteral (sulbactam/ampicilina,\n"
                         + " cefalosporina de segunda o tercera generación)\n"
                         + " asistida con medidas para aliviar\n"
                         + " la broncoconstricción (broncodilatadores beta-miméticos\n"
                         + ", mucolíticos con efectos antioxidantes y corticoides).");
        }
        if (g.equals("neumonia")){
            setNombre("  UD TIENE NEUMONIA \n");
            setTratamiento("Prevenir la neumonía siempre es mejor \n"
                         + " que tratarla. Las mejores medidas \n"
                         + "preventivas incluyen el lavado \n"
                         + "frecuente de las manos, no fumar \n"
                         + "y usar una mascarilla al limpiar \n"
                         + "áreas con polvo o moho.Existe una \n"
                         + "vacuna para la neumonía neumocóccica,\n"
                         + " una infección bacteriana responsable\n"
                         + " de hasta una cuarta parte de todas \n"
                         + "las neumonías. ");
        }
        if (g.equals("cancer al pulmon")){
            setNombre("  UD TIENE CANCER AL PULMON \n");
            setTratamiento("Cada uno de ellos crece y se disemina \n "
                         + "de un modo distinto y se trata de una \n"
                         + "forma diferente. El tratamiento también\n"
                         + " depende del estadio o de qué tan avanzado\n"
                         + " se encuentre. El tratamiento puede \n"
                         + "incluir quimioterapia, radiación y cirugía.");
        }
        respuesta += getNombre()+"   \n"+getTratamiento();
        return respuesta;
    }
}
