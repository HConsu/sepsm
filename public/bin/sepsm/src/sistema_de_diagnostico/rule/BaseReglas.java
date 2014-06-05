/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_diagnostico.rule;

import Rule.*;

/**
 * PREMISAS
 * Declaración de las premisas de la aplicación
 */
public class BaseReglas {
//    declaracion del tipo de reglas

    BooleanRuleBase br = new BooleanRuleBase("test");
    // Declaracion de variable de reglas (19+3 = 20)
    
    RuleVariable rTipoDiabetes;
    RuleVariable rProbaDiabetes;
    // Mujer
    RuleVariable sexo;
    RuleVariable nivelGlucemia;
    RuleVariable edad;
    RuleVariable embarazada;
    RuleVariable aumentoApetito;
    RuleVariable fatigas;
    RuleVariable vomitos;
    RuleVariable miccionFrecuente;
    RuleVariable sed;
    RuleVariable visionBorrosa;
    RuleVariable infecciones;
    RuleVariable pierdePeso;
    RuleVariable menosMenstrua;
    // Embarazada:
    RuleVariable partoPrevio;
    RuleVariable bebeMalformado;
    // No embarazada
    RuleVariable colesterolAlto;
    RuleVariable obesidad;
    RuleVariable presionAlta;
    // Not rule 
//  String ifDiabetes;
    String tipoDiabetes;
    String probaDiabetes;
            
/*  Stock variables
    RuleVariable TipoVehiculo;
    RuleVariable Num_Ruedas;
    RuleVariable Motor;
    RuleVariable Vehiculo;
    RuleVariable Size;
    RuleVariable Num_Puertas;
    String tipoVehiculo;
    String vehiculo;
*/
    public void BaseReglas() {
    }
    
    public String getTipoDiabetes(String iSexo, String iNivelGlucemia, String iEdad,
            String iEmbarazada) {
        staterBR();
        
        sexo.setValue(iSexo);
        nivelGlucemia.setValue(iNivelGlucemia);
        edad.setValue(iEdad);
        br.forwardChain();
        tipoDiabetes = rTipoDiabetes.getValue();
        return tipoDiabetes;
    }
    /*
     * Result here
     */
    public String getProbaDiabetes(String dSexo, String dNivelGlucemia, 
            String dEdad, String iAumentoApetito, String iFatigas,
            String iVomitos, String iMiccionFrecuiente, String iSed,
            String iVisionBorrosa, String iInfecciones, String iPierdePeso,
            String iMenosMenstrua, String iPartoPrevio, String iBebeMalformado,
            String iColesterolAlto, String iObesidad, String iPresionAlta,
            String iEmbarazada, String tipoDiabetes) {
        
        staterBR();
        // Asignación de valores
        rTipoDiabetes.setValue(tipoDiabetes);
        sexo.setValue(dSexo);
        nivelGlucemia.setValue(dNivelGlucemia);
        edad.setValue(dEdad);
        embarazada.setValue(iEmbarazada);
        aumentoApetito.setValue(iAumentoApetito);
        fatigas.setValue(iFatigas);
        vomitos.setValue(iVomitos);
        miccionFrecuente.setValue(iMiccionFrecuiente);
        sed.setValue(iSed);
        visionBorrosa.setValue(iVisionBorrosa);
        infecciones.setValue(iInfecciones);
        pierdePeso.setValue(iPierdePeso);
        menosMenstrua.setValue(iMenosMenstrua);
        partoPrevio.setValue(iPartoPrevio);
        bebeMalformado.setValue(iBebeMalformado);
        colesterolAlto.setValue(iColesterolAlto);
        obesidad.setValue(iObesidad);
        presionAlta.setValue(iPresionAlta);
        
        
        
        // Aquí el encadenamiento hacia adelante
        br.forwardChain();
        probaDiabetes = rProbaDiabetes.getValue();
        return probaDiabetes;
    }
    
    public void staterBR() {
        // Instancias de variables de regla
        rTipoDiabetes = new RuleVariable(br, "rTipoDiabetes");
        rProbaDiabetes = new RuleVariable(br, "rProbaDiabetes");
        sexo = new RuleVariable(br, "sexo");
        nivelGlucemia = new RuleVariable(br, "nivelGlucemia");
        embarazada = new RuleVariable(br, "embarazada");
        edad = new RuleVariable(br, "edad");
        aumentoApetito = new RuleVariable(br, "aumentoApetito");
        fatigas = new RuleVariable(br, "fatigas");
        vomitos = new RuleVariable(br, "vomitos");
        miccionFrecuente = new RuleVariable(br, "miccionFrecuiente");
        sed = new RuleVariable(br, "sed");
        visionBorrosa = new RuleVariable(br, "visionBorrosa");
        pierdePeso = new RuleVariable(br, "pierdePeso");
        menosMenstrua = new RuleVariable(br, "menosMenstrua");
        partoPrevio = new RuleVariable(br, "partoPrevio");
        bebeMalformado = new RuleVariable(br, "bebeMalformado");
        colesterolAlto = new RuleVariable(br, "colesterolAlto");
        obesidad = new RuleVariable(br, "obesidad");
        presionAlta = new RuleVariable(br, "presionAlta");        

        // Definicion de operadores logicos (condicionales)
        Condition igual = new Condition("=");
        Condition diferente = new Condition("!=");
        Condition menor = new Condition("<");
        Condition mayor = new Condition(">");

        // Creacion de reglas de validacion (Base de Reglas)
        // Reglas generales
        
        Rule DM1M; // Diabetes Mellitus tipo 1 en Mujeres
        DM1M = new Rule(br, "DM1M",
            new Clause[]{new Clause(sexo, igual, "femenino"),
            new Clause(nivelGlucemia, mayor, "126"),
            new Clause(embarazada, igual, "no"),
            new Clause(edad, mayor, "40")},
            new Clause(rTipoDiabetes, igual, "DM1M"));
        
        Rule DM2M; // Diabetes Mellitus tipo 2 en Mujeres
        DM2M = new Rule(br, "DM2M",
            new Clause[]{new Clause(sexo, igual, "femenino"),
            new Clause(nivelGlucemia, mayor, "126"),
            new Clause(embarazada, igual, "no"),
            new Clause(edad, menor, "40")},
            new Clause(rTipoDiabetes, igual, "DM2M"));
        
        Rule DG; //Diabetes Gestacional
        DG = new Rule(br, "DG",
            new Clause[]{new Clause(sexo, igual, "femenino"),
            new Clause(nivelGlucemia, mayor, "126"),
            new Clause(embarazada, igual, "si"),
            new Clause(edad, menor, "40")},
            new Clause(rTipoDiabetes, igual, "DG"));
        
        Rule DM1H; // Diabetes Mellitus tipo 1 en Hombres
        DM1H = new Rule(br, "DM1H",
            new Clause[]{new Clause(sexo, igual, "masculino"),
            new Clause(nivelGlucemia, mayor, "126"),
            new Clause(edad, menor, "40")},
            new Clause(rTipoDiabetes, igual, "DM1H"));
        
        Rule DM2H; // Diabetes Mellitus tipo 2 en Hombres
        DM2H = new Rule(br, "DM2H",
            new Clause[]{new Clause(sexo, igual, "masculino"),
            new Clause(nivelGlucemia, mayor, "126"),
            new Clause(edad, mayor, "40")},
            new Clause(rTipoDiabetes, igual, "DM2H"));
        
        Rule ND; // Diabetes Mellitus tipo 2 en Hombres
        ND = new Rule(br, "ND",
            new Clause(nivelGlucemia, menor, "126"),
            new Clause(rTipoDiabetes, igual, "ND"));
        
        
              
        // REGLAS PARTICULARES
        
        // Diabetes Mellitus tipo 1 en Mujeres
        
        Rule DM1M_70; // Diabetes Mellitus tipo 1 en Mujeres a 70%
        DM1M_70 = new Rule(br, "DM1M_70",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(aumentoApetito, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1M_70"));
        
        
        Rule DM1M_75; // Diabetes Mellitus tipo 1 en Mujeres a 75%
        DM1M_75 = new Rule(br, "DM1M_75",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(fatigas, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1M_75"));
        
        Rule DM1M_80; // Diabetes Mellitus tipo 1 en Mujeres a 80%
        DM1M_80 = new Rule(br, "DM1M_80",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(vomitos, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1M_80"));
        
        Rule DM1M_85; // Diabetes Mellitus tipo 1 en Mujeres a 85%
        DM1M_85 = new Rule(br, "DM1M_85",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(miccionFrecuente, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1M_85"));
        
        Rule DM1M_87; // Diabetes Mellitus tipo 1 en Mujeres a 87%
        DM1M_87 = new Rule(br, "DM1M_87",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(sed, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1M_87"));
        
        Rule DM1M_89; // Diabetes Mellitus tipo 1 en Mujeres a 89%
        DM1M_89 = new Rule(br, "DM1M_89",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(visionBorrosa, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1M_89"));
        
        Rule DM1M_92; // Diabetes Mellitus tipo 1 en Mujeres a 92%
        DM1M_92 = new Rule(br, "DM1M_92",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(infecciones, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1M_92"));
        
         Rule DM1M_95; // Diabetes Mellitus tipo 1 en Mujeres a 95%
        DM1M_95 = new Rule(br, "DM1M_95",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(pierdePeso, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1M_95"));
        
        Rule DM1M_98; // Diabetes Mellitus tipo 1 en Mujeres a 98%
        DM1M_98 = new Rule(br, "DM1M_98",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(menosMenstrua, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1M_98"));
        
        Rule DM1M_100; // Diabetes Mellitus tipo 1 en Mujeres a 100%
        DM1M_100 = new Rule(br, "DM1M_100",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1M"),
            new Clause(menosMenstrua, igual, "si")},
            new Clause(rProbaDiabetes, igual, "DM1M_100"));  
        
        
        // Diabetes Gestacional
        
        Rule DG_65; // Diabetes Gestacional a 65%
        DG_65 = new Rule(br, "DG_65",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DG"),
            new Clause(aumentoApetito, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DG_65"));
        
        
        Rule DG_68; // Diabetes Gestacional a 68%
        DG_68 = new Rule(br, "DG_68",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DG"),
            new Clause(fatigas, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DG_68"));
        
        Rule DG_78; // Diabetes Gestacional a 78%
        DG_78 = new Rule(br, "DG_78",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DG"),
            new Clause(vomitos, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DG_78"));
        
        Rule DG_80; // Diabetes Gestacional a 80%
        DG_80 = new Rule(br, "DG_80",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DG"),
            new Clause(miccionFrecuente, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DG_80"));
        
        Rule DG_90; // Diabetes Gestacional a 90%
        DG_90 = new Rule(br, "DG_90",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DG"),
            new Clause(sed, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DG_90"));
        
        Rule DG_93; // Diabetes Gestacional a 93%
        DG_93 = new Rule(br, "DG_93",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DG"),
            new Clause(visionBorrosa, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DG_93"));
        
        Rule DG_95; // Diabetes Gestacional a 95%
        DG_90 = new Rule(br, "DG_95",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DG"),
            new Clause(partoPrevio, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DG_95"));
        
        Rule DG_98; // Diabetes Gestacional a 98%
        DG_98 = new Rule(br, "DG_98",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DG"),
            new Clause(bebeMalformado, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DG_98"));
        

        
        Rule DG_100; // Diabetes Gestacional a 100%
        DG_100 = new Rule(br, "DG_100",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DG"),
            new Clause(bebeMalformado, igual, "si")},
            new Clause(rProbaDiabetes, igual, "DG_100"));
        
        
        
        
        
        // Diabetes Mellitus tipo 2 en Mujeres
        
        Rule DM2M_65; // Diabetes Mellitus tipo 2 en Mujeres a 65%
        DM2M_65 = new Rule(br, "DM2M_65",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(aumentoApetito, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2M_65"));
        
        
        Rule DM2M_68; // Diabetes Mellitus tipo 2 en Mujeres a 68%
        DM2M_68 = new Rule(br, "DM2M_68",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(fatigas, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2M_68"));
        
        Rule DM2M_70; // Diabetes Mellitus tipo 2 en Mujeres a 70%
        DM2M_70 = new Rule(br, "DM2M_70",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(vomitos, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2M_70"));
        
        Rule DM2M_80; // Diabetes Mellitus tipo 2 en Mujeres a 80%
        DM2M_80 = new Rule(br, "DM2M_80",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(miccionFrecuente, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2M_80"));
        
        Rule DM2M_87; // Diabetes Mellitus tipo 2 en Mujeres a 87%
        DM2M_87 = new Rule(br, "DM2M_87",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(sed, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2M_87"));
        
        Rule DM2M_89; // Diabetes Mellitus tipo 2 en Mujeres a 89%
        DM2M_89 = new Rule(br, "DM2M_89",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(visionBorrosa, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2M_89"));
        
        Rule DM2M_90; // Diabetes Mellitus tipo 2 en Mujeres a 90%
        DM2M_90 = new Rule(br, "DM2M_90",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(colesterolAlto, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2M_90"));
        
        Rule DM2M_98; // Diabetes Mellitus tipo 2 en Mujeres a 98%
        DM2M_98 = new Rule(br, "DM2M_98",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(obesidad, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2M_98"));
        
        
         Rule DM2M_99; // Diabetes Mellitus tipo 2 en Mujeres a 99%
        DM2M_99 = new Rule(br, "DM2M_99",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(presionAlta, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2M_99"));
        
        
        Rule DM2M_100; // Diabetes Mellitus tipo 2 en Mujeres a 100%
        DM2M_100 = new Rule(br, "DM2M_100",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2M"),
            new Clause(presionAlta, igual, "si")},
            new Clause(rProbaDiabetes, igual, "DM2M_100"));
        
        // Diabetes Mellitus tipo 1 en Hombres
        
        Rule DM1H_65; // Diabetes Mellitus tipo 1 en Hombres a 65%
        DM1H_65 = new Rule(br, "DM1H_65",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1H"),
            new Clause(aumentoApetito, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1H_65"));
        
        
        Rule DM1H_68; // Diabetes Mellitus tipo 1 en Hombres a 68%
        DM1H_68 = new Rule(br, "DM1H_68",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1H"),
            new Clause(fatigas, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1H_68"));
        
        Rule DM1H_70; // Diabetes Mellitus tipo 1 en Hombres a 70%
        DM1H_70 = new Rule(br, "DM1H_70",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1H"),
            new Clause(vomitos, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1H_70"));
        
        Rule DM1H_78; // Diabetes Mellitus tipo 1 en Hombres a 78%
        DM1H_78 = new Rule(br, "DM1H_78",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1H"),
            new Clause(miccionFrecuente, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1H_78"));
        
        Rule DM1H_80; // Diabetes Mellitus tipo 1 en Hombres a 80%
        DM1H_80 = new Rule(br, "DM1H_80",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1H"),
            new Clause(sed, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1H_80"));
        
        Rule DM1H_87; // Diabetes Mellitus tipo 1 en Hombres a 87%
        DM1H_87 = new Rule(br, "DM1H_87",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1H"),
            new Clause(visionBorrosa, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1H_87"));
        
        Rule DM1H_92; // Diabetes Mellitus tipo 1 en Hombres a 92%
        DM1H_92 = new Rule(br, "DM1H_92",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1H"),
            new Clause(infecciones, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1H_92"));
        

        
        Rule DM1H_98; // Diabetes Mellitus tipo 1 en Hombres a 98%
        DM1H_98 = new Rule(br, "DM1H_98",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1H"),
            new Clause(pierdePeso, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM1H_98"));
        
        Rule DM1H_100; // Diabetes Mellitus tipo 1 en Hombres a 100%
        DM1H_100 = new Rule(br, "DM1H_100",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM1H"),
            new Clause(pierdePeso, igual, "si")},
            new Clause(rProbaDiabetes, igual, "DM1H_100"));         
        
        
       
        
        
        // Diabetes Mellitus tipo 2 en Hombres
        
        Rule DM2H_65; // Diabetes Mellitus tipo 2 en Hombres a 65%
        DM2H_65 = new Rule(br, "DM2H_65",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(aumentoApetito, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2H_65"));
        
        
        Rule DM2H_68; // Diabetes Mellitus tipo 2 en Hombres a 68%
        DM2H_68 = new Rule(br, "DM2H_68",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(fatigas, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2H_68"));
        
        Rule DM2H_69; // Diabetes Mellitus tipo 2 en Hombres a 69%
        DM2H_69 = new Rule(br, "DM2H_69",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(vomitos, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2H_69"));
        
        Rule DM2H_77; // Diabetes Mellitus tipo 2 en Hombres a 77%
        DM2H_77 = new Rule(br, "DM2H_77",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(miccionFrecuente, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2H_77"));
        
        Rule DM2H_80; // Diabetes Mellitus tipo 2 en Hombres a 80%
        DM2H_80 = new Rule(br, "DM2H_80",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(sed, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2H_80"));
        
        Rule DM2H_84; // Diabetes Mellitus tipo 2 en Hombres a 84%
        DM2H_84 = new Rule(br, "DM2H_84",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(visionBorrosa, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2H_84"));
        
        Rule DM2H_88; // Diabetes Mellitus tipo 2 en Hombres a 88%
        DM2H_88 = new Rule(br, "DM2H_88",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(colesterolAlto, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2H_88"));
        
        Rule DM2H_95; // Diabetes Mellitus tipo 2 en Hombres a 95%
        DM2H_95 = new Rule(br, "DM2H_95",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(obesidad, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2H_95"));
        
        
         Rule DM2H_98; // Diabetes Mellitus tipo 2 en Hombres a 98%
        DM2H_98 = new Rule(br, "DM2H_98",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(presionAlta, igual, "no")},
            new Clause(rProbaDiabetes, igual, "DM2H_98"));
        
        
        Rule DM2H_100; // Diabetes Mellitus tipo 2 en Hombres a 100%
        DM2H_100 = new Rule(br, "DM2H_100",
            new Clause[]{new Clause(rTipoDiabetes, igual, "DM2H"),
            new Clause(presionAlta, igual, "si")},
            new Clause(rProbaDiabetes, igual, "DM2H_100"));        
        
        
        

    }
/* Stock methode
    public void BaseReglas() {
    }

    public String getTipoVehiculo(String ruedas, String motor) {
        staterBR();
        Num_Ruedas.setValue(ruedas);
        Motor.setValue(motor);
        br.forwardChain();
        tipoVehiculo = TipoVehiculo.getValue();
        return tipoVehiculo;
    }

    public String getVehiculo(String numRuedas, String tipoVehiculo, String motor, String numPuertas, String tama) {
        staterBR();
        Num_Ruedas.setValue(numRuedas);
        TipoVehiculo.setValue(tipoVehiculo);
        Motor.setValue(motor);
        Size.setValue(tama);
        Num_Puertas.setValue(numPuertas);
        br.forwardChain();
        vehiculo = Vehiculo.getValue();
        return vehiculo;
    }

    public void staterBR() {
//        instancias de variables de regla
        TipoVehiculo = new RuleVariable(br, "TipoVehiculo");
        Num_Ruedas = new RuleVariable(br, "Num_Ruedas");
        Motor = new RuleVariable(br, "Motor");
        Vehiculo = new RuleVariable(br, "Vehiculo");
        Size = new RuleVariable(br, "Size");
        Num_Puertas = new RuleVariable(br, "Num_Puertas");


//        definicion de operadores logicos (condicionales)
        Condition igual = new Condition("=");
        Condition diferente = new Condition("!=");
        Condition menor = new Condition("<");

//        creacion de reglas de validacion (Base de Reglas)
        Rule Cycle = new Rule(br, "Cycle",
                new Clause(Num_Ruedas, menor, "4"),
                new Clause(TipoVehiculo, igual, "cycle"));

        Rule Automobile = new Rule(br, "Automobile",
                new Clause[]{new Clause(Num_Ruedas, igual, "4"),
                    new Clause(Motor, igual, "yes")}, new Clause(TipoVehiculo, igual, "automobile"));

        Rule Bicycle = new Rule(br, "bicycle",
                new Clause[]{new Clause(TipoVehiculo, igual, "cycle"),
                    new Clause(Num_Ruedas, igual, "2"),
                    new Clause(Motor, igual, "no")
                }, new Clause(Vehiculo, igual, "Bicycle"));

        Rule Tricycle = new Rule(br, "tricycle", new Clause[]{new Clause(TipoVehiculo, igual, "cycle"),
                    new Clause(Num_Ruedas, igual, "3"),
                    new Clause(Motor, igual, "no")
                }, new Clause(Vehiculo, igual, "Tricycle"));

        Rule Motorcycle = new Rule(br, "motorcycle", new Clause[]{new Clause(TipoVehiculo, igual, "cycle"),
                    new Clause(Num_Ruedas, igual, "2"),
                    new Clause(Motor, igual, "yes")
                }, new Clause(Vehiculo, igual, "Motorcycle"));

        Rule SportsCar = new Rule(br, "sportsCar",
                new Clause[]{new Clause(TipoVehiculo, igual, "automobile"),
                    new Clause(Size, igual, "Pequeño"),
                    new Clause(Num_Puertas, igual, "2")
                }, new Clause(Vehiculo, igual, "Sports_Car"));

        Rule Sedan = new Rule(br, "sedan", new Clause[]{new Clause(TipoVehiculo, igual, "automobile"),
                    new Clause(Size, igual, "Mediano"),
                    new Clause(Num_Puertas, igual, "4")
                }, new Clause(Vehiculo, igual, "Sedan"));

        Rule MiniVan = new Rule(br, "miniVan", new Clause[]{new Clause(TipoVehiculo, igual, "automobile"),
                    new Clause(Size, igual, "Mediano"),
                    new Clause(Num_Puertas, igual, "3")
                }, new Clause(Vehiculo, igual, "MiniVan"));

        Rule SUV = new Rule(br, "SUV", new Clause[]{new Clause(TipoVehiculo, igual, "automobile"),
                    new Clause(Size, igual, "Grande"),
                    new Clause(Num_Puertas, igual, "4")
                }, new Clause(Vehiculo, igual, "Sports_Utility_Vehicle"));
    }
  */ 
}
