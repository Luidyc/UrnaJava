/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urnaFinalizada;

import java.util.List;

/**
 *
 * @author luidy
 */
public class Votacao implements IntVotacao{
    List <Candidatos> listaDeCandidatos;
    List <Eleitor> listaDeVotos;
    
    
    public List<Candidatos> getListaDeCandidatos() {
        return listaDeCandidatos;
    }

    
    public void setListaDeCandidatos(List<Candidatos> listaDeCandidatos) {
        this.listaDeCandidatos = listaDeCandidatos;
    }

    public List<Eleitor> getListaDeVotos() {
        return listaDeVotos;
    }

    public void setListaDeVotos(List<Eleitor> listaDeVotos) {
        this.listaDeVotos = listaDeVotos;
    }
    
    @Override
    public void addVoto(Eleitor Eleitor) {
        listaDeVotos.add(Eleitor);
    }
    
    @Override
    public void addCandidato(Candidatos Candidatos) {
        listaDeCandidatos.add(Candidatos);
    }
    
    @Override
    public void ApurarVoto() {
        int votoValido = 0;
        System.out.println("Votação encerrada começando uma nova!");
        for(int i=0; i < listaDeVotos.size(); i++) {
            if (listaDeVotos.get(i).getVotoRecebido() == 100) {
                    votoValido++;
                    System.out.println("O eleitor "+(i+1)+" votou em Branco");
                } else {
                    for(int k=0; k<listaDeCandidatos.size(); k++) {
                    if(listaDeVotos.get(i).getVotoRecebido() == listaDeCandidatos.get(k).getNumeroDoCandidato()) {
                    votoValido++;
                    System.out.println("O eleitor "+(i+1)+" votou em "+listaDeCandidatos.get(k).getNome());
                }
                }
            
            } 
        }
        System.out.println("Votos nulos = "+(listaDeVotos.size()-votoValido));
    }
}
