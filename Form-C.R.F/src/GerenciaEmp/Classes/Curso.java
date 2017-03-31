package GerenciaEmp.Classes;

/**
 *
 * @author Toni
 */

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Curso {
    private int cod;
    private Calendar dataI;
    private ArrayList<Funcionario> matriculados = new ArrayList();
    
    public Curso(int cod, Calendar dataI){
        this.cod=cod;
        this.dataI=dataI;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Calendar getDataI() {
        return dataI;
    }

    public void setDataI(Calendar dataI) {
        this.dataI = dataI;
    }
    
    public boolean naLista(Funcionario f){
        for(Funcionario x:matriculados){
            if(x.getCod()==f.getCod())
                return true;
        }
        return false;
    }
    
    public void inserirFuncionario(Funcionario f){
        if(!naLista(f) && matriculados.size()<=30)
            matriculados.add(f);
        else
            JOptionPane.showMessageDialog(null, "O funcionário "+f.getNome()+" já está matriculado neste curso.");
    }
    
    public void removerFuncionario(Funcionario f){
        if(naLista(f))
            matriculados.remove(f);
        else
            JOptionPane.showMessageDialog(null, "O funcionário "+ f.getNome()+" não está matriculado neste curso.");
    }
    
    
}
