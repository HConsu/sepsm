
package turismo;
import Rule.*;
/**
 *
 * @author JavierPH
 */
public class Reglas {
    BooleanRuleBase br = new BooleanRuleBase("test");
    RuleVariable _opcion;
    RuleVariable _tipoC;
    RuleVariable _tipoCorredor;
    RuleVariable _clima;
    RuleVariable _km;
    RuleVariable _extrema;
    RuleVariable _cultural;
    RuleVariable _deportiva;
    RuleVariable _social;
    RuleVariable _hospedaje;
    RuleVariable _lugar;
    RuleVariable _tipoLugar;
    String _Opcion;
    
    public void Reglas(){
    }
    
    //funcion uno
    public String Salir(String _opcionobtenida){
        staterBR();
        _opcion.setValue(_opcionobtenida);
        br.forwardChain();
        _Opcion = _tipoLugar.getValue();
        return _Opcion;
    }
    
//    funcion dos
    public String Corredor(String _C_opcion, String _TipoClima){
        staterBR();
        _opcion.setValue(_C_opcion);
        _clima.setValue(_TipoClima);
        br.forwardChain();
        _Opcion = _tipoCorredor.getValue();
        return _Opcion;
    }
    
    //funcion tres
    public String LugarFuera(String _opcionobtenida, String _Clima, String _Km, String _Extrema, String _Cultural, String _Deportiva, String _Social, String _Hospedaje){
        staterBR();
        _tipoLugar.setValue(_opcionobtenida);
        _clima.setValue(_Clima);
        _km.setValue(_Km);
        _extrema.setValue(_Extrema);
        _cultural.setValue(_Cultural);
        _deportiva.setValue(_Deportiva);
        _social.setValue(_Social);
        _hospedaje.setValue(_Hospedaje);
        br.forwardChain();
        _Opcion = _lugar.getValue();
        return _Opcion;
    }
    
    //funcion cero
    public String TipoLugar(String _C_opcion, String _TipoC){
        staterBR();
        _opcion.setValue(_C_opcion);
        _tipoLugar.setValue(_TipoC);
        br.forwardChain();
        _Opcion = _tipoC.getValue();
        return _Opcion;
    }
    
    //    funcion Cultura
//    public String LugarCultura(){
//        return ;
//    }
    
    //funcion  Parques
//    public String Lugar Parques(){
//        return ;
//    }
    
    public void staterBR(){
        _opcion = new RuleVariable(br, "opcion");
        _clima = new RuleVariable(br, "clima");
        _km = new RuleVariable(br, "km");
        _extrema = new RuleVariable(br, "extrema");
        _cultural = new RuleVariable(br, "cultural");
        _deportiva = new RuleVariable(br, "deportiva");
        _social = new RuleVariable(br, "social");
        _hospedaje = new RuleVariable(br, "hospedaje");
        _tipoLugar = new RuleVariable(br, "tipoLugar");
        _tipoC = new RuleVariable(br, "tipo");
        _tipoCorredor = new RuleVariable(br, "corredor");
        
        Condition igual = new Condition("=");
        Condition diferente = new Condition("!=");
        
        //reglas uno
        Rule Pachuca = new Rule(br, "Pachuca", new Clause(_opcion, igual, "no"), new Clause (_tipoLugar, igual, "Ciudad"));    
        Rule Fuera = new Rule(br, "Fuera", new Clause(_opcion, igual, "si"), new Clause (_tipoLugar, igual, "Fuera"));
        
        //reglas dos
        Rule Montaña = new Rule(br, "Montaña",
        new Clause[]{new Clause(_opcion, igual, "Fuera"),new Clause (_clima, igual, "frio")},
        new Clause (_tipoCorredor, igual, "Montaña"));
        Rule Elementos = new Rule(br, "Elementos",
        new Clause[]{new Clause(_opcion, igual, "Fuera"),new Clause (_clima, igual, "templado humedo")},
        new Clause (_tipoCorredor, igual, "Elementos"));
        Rule Balnearios = new Rule(br, "Balnearios",
        new Clause[]{new Clause(_opcion, igual, "Fuera"),new Clause (_clima, igual, "caliente humedo")},
        new Clause (_tipoCorredor, igual, "Balnearios"));
        Rule Huasteca = new Rule(br, "Huasteca",
        new Clause[]{new Clause(_opcion, igual, "Fuera"),new Clause (_clima, igual, "calido humedo")},
        new Clause (_tipoCorredor, igual, "Huasteca"));
        Rule Tolteca = new Rule(br, "Tolteca",
        new Clause[]{new Clause(_opcion, igual, "Fuera"),new Clause (_clima, igual, "seco")},
        new Clause (_tipoCorredor, igual, "Tolteca"));
        Rule Haciendas = new Rule(br, "Haciendas",
        new Clause[]{new Clause(_opcion, igual, "Fuera"),new Clause (_clima, igual, "seco arido")},
        new Clause (_tipoCorredor, igual, "Haciendas"));
        
        //reglas tres
        
        
        //reglas cero
        Rule Cultura = new Rule(br, "Cultura",
        new Clause[]{new Clause(_opcion, igual, "Ciudad"),new Clause (_tipoLugar, igual, "cultura")},
        new Clause (_tipoC, igual, "Cultura"));
        Rule Diversion = new Rule(br, "Diversion",
        new Clause[]{new Clause(_opcion, igual, "Ciudad"),new Clause (_tipoLugar, igual, "diversion")},
        new Clause (_tipoC, igual, "Diversion"));
        //reglas cultura
        
        
        //reglas parques
        
        
        
//        Rule Huasca = new Rule(br, "huasca", 
//        new Clause[]{new Clause(_opcion, igual, "no"),new Clause (_clima, igual, "Templado")},
//        new Clause (_tipoLugar, igual, "Fuera"));
        
    }
}
