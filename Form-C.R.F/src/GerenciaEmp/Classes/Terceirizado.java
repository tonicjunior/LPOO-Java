package GerenciaEmp.Classes;

/**
 *
 * @author Toni
 */

import java.util.Calendar;
public class Terceirizado extends Funcionario {
    Calendar inicioC, terminoC;
    public Terceirizado(int cod, String nome, String email, Calendar inicioC, Calendar terminoC){
        super(cod,nome,email);
        this.inicioC=inicioC;
        this.terminoC=terminoC;
    }

    public Calendar getInicioC() {
        return inicioC;
    }

    public void setInicioC(Calendar inicioC) {
        this.inicioC = inicioC;
    }

    public Calendar getTerminoC() {
        return terminoC;
    }

    public void setTerminoC(Calendar terminoC) {
        this.terminoC = terminoC;
    }

    @Override
    public String toString() {
        return  inicioC.get(Calendar.DAY_OF_MONTH)+"/"+ inicioC.get(Calendar.MONTH)+"/"
                +inicioC.get(Calendar.YEAR)+";"+
                terminoC.get(Calendar.DAY_OF_MONTH)+"/"+ terminoC.get(Calendar.MONTH)+"/"
                +terminoC.get(Calendar.YEAR);
    }
    
    
}
