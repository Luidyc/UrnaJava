/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package urnaFinalizada;

import javax.swing.ImageIcon;

/**
 *
 * @author luidy
 */
public interface IntCandidatos {
    String getNome();
    ImageIcon getImgPresidente();
    void setImgPresidente(ImageIcon imgPresidente);
    ImageIcon getImgVice();
    void setImgVice(ImageIcon imgVice);
    String getVice();        
    String getPartido();
    int getNumeroDoCandidato();
    int getVotosRecebidos();
    void setVotosRecebidos();
}
