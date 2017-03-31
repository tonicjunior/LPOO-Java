package GerenciaEmp.Classes;

/**
 *
 * @author Toni
 */

public class ItemDeMaterial {
    private int cod, quant;
    private String nome,marca, desc, tipo;

    
    public ItemDeMaterial(){
        
    }
    
    public ItemDeMaterial(int quant, Material m){
        this.quant=quant;
        cod=m.getCod();
        nome=m.getNome();
        marca=m.getMarca();
        desc=m.getDesc();
        tipo=m.getTipo();
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

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    public void adicinaQuant(int quant){
        this.quant+=quant;
    }

    public int getMaterial() {
        return cod;
    }

}
