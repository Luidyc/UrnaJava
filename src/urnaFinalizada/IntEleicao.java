/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package urnaFinalizada;

import java.util.List;

/**
 *
 * @author luidy
 */
public interface IntEleicao {
    void addCandidato(Candidatos Candidatos);
    void votosValidos(int voto);
    List<Candidatos> getListaDeCandidatos();
    void setListaDeCandidatos(List<Candidatos> listaDeCandidatos);
    int getVotoBranco();
    void getDados();
}
