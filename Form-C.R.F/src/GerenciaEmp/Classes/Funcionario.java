package GerenciaEmp.Classes;

/**
 *
 * @author Toni
 */

public class Funcionario {
    int cod;
    String nome, email;
    
    public Funcionario(){
        
    }
    
    public Funcionario(int cod, String nome, String email){
        this.cod=cod;
        this.nome=nome;
        this.email=email;
    }
    
    public Funcionario(Funcionario f){
        this.cod=f.getCod();
        this.nome=f.getNome();
        this.email=f.getEmail();
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cod=" + cod + ", nome=" + nome + ", email=" + email + '}';
    }
}
