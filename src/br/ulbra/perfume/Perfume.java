
package br.ulbra.perfume;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Perfume {
    private ArrayList basePerfume;
    
    public Perfume(){
        basePerfume = new ArrayList();
    }
    
    public void salvar(String nomePerfume){
        basePerfume.add(nomePerfume);
        String salvar = nomePerfume+" Salvo com sucesso!";
        JOptionPane.showMessageDialog(null, salvar);
    }
    public String mostrarPerfume(){
        String perfume = "Lista de Perfumes\n";
        if(basePerfume.isEmpty()){
            perfume = "Lista de Perfume Vazia!";
        }else{
            for(int i=0; i<basePerfume.size();i++){
                perfume += basePerfume.get(i)+"\n";
            }
        }
        return perfume;
    }
    
}
