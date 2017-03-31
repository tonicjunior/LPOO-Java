package GerenciaEmp.Classes;

/**
 *
 * @author Toni
 */

import java.util.Calendar;
public class Gerente extends Contratado{
    String titulacao;
    public Gerente (int cod, String nome, String email, String ctps, Calendar dataAdm, Calendar dataDem, String titulacao){
        super(cod,nome,email, ctps, dataAdm, dataDem);
        this.titulacao=titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
