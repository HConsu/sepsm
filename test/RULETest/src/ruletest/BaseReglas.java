/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletest;

import Rule.*;

/**
 *
 * 
 */
public class BaseReglas {
//    declaracion del tipo de reglas

    BooleanRuleBase br = new BooleanRuleBase("test");
//    declaracion de cariable de reglas
    RuleVariable TipoVehiculo;
    RuleVariable Num_Ruedas;
    RuleVariable Motor;
    RuleVariable Vehiculo;
    RuleVariable Size;
    RuleVariable Num_Puertas;
    String tipoVehiculo;
    String vehiculo;

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
}
