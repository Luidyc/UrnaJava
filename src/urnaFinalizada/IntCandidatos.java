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
