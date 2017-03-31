package GerenciaEmp.Classes;

/**
 *
 * @author Toni
 */

import java.util.Calendar;
public class Contratado extends Funcionario{
    String ctps;
    Calendar dataAdm, dataDem;
    public Contratado(int cod, String nome, String email, String ctps, Calendar dataAdm, Calendar dataDem){
        super(cod,nome,email);
        this.ctps=ctps;
        this.dataAdm=dataAdm;
        this.dataDem=dataDem;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public Calendar getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(Calendar dataAdm) {
        this.dataAdm = dataAdm;
    }

    public Calendar getDataDem() {
        return dataDem;
    }

    public void setDataDem(Calendar dataDem) {
        this.dataDem = dataDem;
    }
}
