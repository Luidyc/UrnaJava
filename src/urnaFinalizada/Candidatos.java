package urnaFinalizada;

import javax.swing.ImageIcon;


public class Candidatos implements IntCandidatos {
    private String nome;
    ImageIcon imgPresidente;
    private int numeroDoCandidato;
    private String partido;
    ImageIcon imgVice;
    private String vice;
    private int votosRecebidos;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public ImageIcon getImgPresidente() {
        return imgPresidente;
    }

    @Override
    public void setImgPresidente(ImageIcon imgPresidente) {
        this.imgPresidente = imgPresidente;
    }
    @Override
    public ImageIcon getImgVice() {
        return imgVice;
    }
    @Override
    public void setImgVice(ImageIcon imgVice) {
        this.imgVice = imgVice;
    }
    
    
    @Override
    public String getPartido() {
        return partido;
    }

    @Override
    public String getVice() {
        return vice;
    }
    
    
    
    @Override
    public int getNumeroDoCandidato() {
        return numeroDoCandidato;
    }

    @Override
    public int getVotosRecebidos() {
        return votosRecebidos;
    }

    @Override
    public void setVotosRecebidos() {
        votosRecebidos++;
    }
 
    
    
    public Candidatos(String nome, ImageIcon imgPresidente, int numeroDoCandidato, String partido,ImageIcon imgVice,String vice) {
        this.nome = nome;
        this.imgPresidente = imgPresidente;
        this.numeroDoCandidato = numeroDoCandidato;
        this.partido = partido;
        this.imgVice = imgVice;
        this.vice = vice;
    }

    
}
