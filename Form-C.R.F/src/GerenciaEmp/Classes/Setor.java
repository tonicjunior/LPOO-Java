package GerenciaEmp.Classes;

/**
 *
 * @author Toni
 */
import java.util.ArrayList;
public class Setor {
    private int cod;
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    
    public Setor(int cod, String nome){
        this.cod=cod;
        this.nome=nome;
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public void insereFuncinario(Funcionario f){
        funcionarios.add(f);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }    
}
