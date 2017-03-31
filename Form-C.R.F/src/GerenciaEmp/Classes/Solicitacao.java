package GerenciaEmp.Classes;

/**
 *
 * @author Toni
 */

import java.util.Calendar;
import java.util.ArrayList;
import java.util.Iterator;
public class Solicitacao {
    private int cod;
    private Calendar data;
    private Funcionario f;
    private ArrayList <ItemDeMaterial> idm = new ArrayList();
    
    public Solicitacao(){

    }
    
    public Solicitacao(int cod, Calendar data, Funcionario f, ArrayList itens){
        this.cod=cod;
        this.data=data;
        this.f=f;
        for (Iterator it = itens.iterator(); it.hasNext();) {
            ItemDeMaterial x = (ItemDeMaterial) it.next();
            idm.add(x);
        }
    }

    
    public void insereItem(int quant, Material m){
        idm.add(new ItemDeMaterial(quant, m));
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
    public Calendar getData(){
        return data;
    }

    public Funcionario getF() {
        return f;
    }

    public void setF(Funcionario f) {
        this.f = f;
    }

    public ArrayList<ItemDeMaterial> getIdm() {
        return idm;
    }
    
    public void SetIdm(ArrayList idm){
        this.idm=idm;
    }
    
    public int getQuantItens(){
        return idm.size();
    }
    
    public void printIntens(){
        for(ItemDeMaterial x:this.idm)
            System.out.println(x.getNome());
            System.out.println("p");
    }
    
}
