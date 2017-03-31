package GerenciaEmp.Classes;

/**
 *
 * @author Toni
 */

public class Material {
    private int cod, quant;
    private String nome,marca, desc, tipo;
    
    public Material(){        
    }    
    public Material (int cod, String nome, String tipo, String marca, int quant, String desc){
        this.cod=cod;
        this.nome=nome;
        this.quant=quant;
        this.marca=marca;
        this.desc=desc;
        this.tipo=tipo;
    }

    public int getQuant() {
        return quant;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void acrescentaQuantidade(int quantidade){
        quant += quantidade;
    }
    public void retiraQuantidade(int quantidade){
        quant -= quantidade;
    }
}
