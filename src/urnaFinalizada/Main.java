package urnaFinalizada;

import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {
        // Criando Minha Eleição;
        Eleicao Eleicao2023 = new Eleicao();
        // Criando meu Candidato;
        Candidatos Lula = new Candidatos(
                "Luiz Inácio Lula da Silva",
                new ImageIcon("img/lula.png"),
                13,
                "PARTIDO DOS TRABALHADORES",
                new ImageIcon("img/dilma.png"),
                "Dilma Russef");
        Candidatos Ciro = new Candidatos(
                "Ciro Gomes",
                new ImageIcon("img/ciro.png"),
                12,
                "Patria Amada",
                new ImageIcon("img/naldo.png"),
                "Ozzy Osburn");
        Candidatos Wellington = new Candidatos(
                "Wellington Cheiro",
                new ImageIcon("img/well.png"),
                77,
                "Petrobrás",
                new ImageIcon("img/wellvice.png"),
                "Banho");
        
        //Adicionando Candidato a lista de Presidenciaveis
        Eleicao2023.addCandidato(Lula);
        Eleicao2023.addCandidato(Ciro);
        ///////////////////////////////////////////
      
        Eleicao2023.getDados();
        
        

    }
}
