
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
    public void alterar(int indice, String novoNome){
            if (!basePerfume.isEmpty()){
                if(indice>=0 && indice<basePerfume.size()){
                    basePerfume.set(indice, novoNome);
              JOptionPane.showMessageDialog(null, 
                      "Perfume alterado com sucesso! ");
                }else{
                    JOptionPane.showMessageDialog(null, 
                      "Perfume não existe ");
                }
            }else{JOptionPane.showMessageDialog(null, 
                      "Lista vazia! ");}        
    }
    public void excluir(int indice){
            if (!basePerfume.isEmpty()){
                if(indice>=0 && indice<basePerfume.size()){
                    basePerfume.remove(indice);
              JOptionPane.showMessageDialog(null, 
                      "Perfume excluido com sucesso! ");
                }else{
                    JOptionPane.showMessageDialog(null, 
                      "Perfume não existe ");
                }
            }else{JOptionPane.showMessageDialog(null, 
                      "Lista vazia! ");}        
    }
}






