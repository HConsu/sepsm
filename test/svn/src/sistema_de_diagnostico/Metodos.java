/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema_de_diagnostico;

import java.util.Vector;

/**
 *
 * @author Karina
 */
public class Metodos {
    Emfermedades enfer;
    public Metodos(){
        enfer= new Emfermedades();
    }
    public String  sumatoria (Vector<Integer> vectorcito){
        String resultado ="";
        int suma=0;
        for (int i = 0;i<vectorcito.size();i++)
            suma=suma+vectorcito.get(i);
        resultado = comparacion(suma);
        return resultado;
    }
    public String  comparacion(int sum){
        String enfermedad="";
        String res="";
        if (sum<=37&&sum>0){
            enfermedad="gripe";
        }
        if (sum<=43&&sum>38){
            enfermedad="asma";
        }if (sum>=44&&sum<56){
            enfermedad="tuberculosis";
        }if (sum>=57&&sum<=58){
            enfermedad="bronquitis aguda";
        }if (sum>=59&&sum<62){
            enfermedad="neumonia";
        }if (sum>=63){
            enfermedad="cancer al pulmon";
        }
        res=enfer.enfermedad(enfermedad);
        return res;
    }

}
