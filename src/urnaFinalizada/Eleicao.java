package urnaFinalizada;
import java.util.List;

public class Eleicao implements IntEleicao {
    List <Candidatos> listaDeCandidatos;
    public int qtdEleitores;
    private int votoBranco;
    private int votoValido;

    @Override
    public List<Candidatos> getListaDeCandidatos() {
        return listaDeCandidatos;
    }

    @Override
    public void setListaDeCandidatos(List<Candidatos> listaDeCandidatos) {
        this.listaDeCandidatos = listaDeCandidatos;
    }

    @Override
    public int getVotoBranco() {
        return votoBranco;
    }

    
    
    @Override
    public void addCandidato(Candidatos Candidatos) {
        listaDeCandidatos.add(Candidatos);
    }



    @Override
    public void votosValidos(int voto) {
        // Aumente a quantidade de Eleitores;
        qtdEleitores++;
        // Se o voto for branco;
        if (voto == 100) {
            votoBranco++;
            votoValido++;
        }
        //Para cada voto busque na lista de Candidato se ele existe;
            for(int k=0; k<listaDeCandidatos.size(); k++) {
                if(voto == listaDeCandidatos.get(k).getNumeroDoCandidato()) {
                    listaDeCandidatos.get(k).setVotosRecebidos();
                    votoValido++;
                }
          } 
        }   
    

    

    @Override
    public void getDados() {
        // Exiba a lista do candidato e seus votos
        for(int i=0; i<listaDeCandidatos.size(); i++) {
            System.out.println(
            "Candidado "+i+": "+listaDeCandidatos.get(i).getNome()
            +"/ Quantidade de Votos : "+listaDeCandidatos.get(i).getVotosRecebidos()
            );
        }
        // Exiba brancos contados
        // Voto Nulos = resultado de Eleitores-Validos
        System.out.println(
            " Quantidade de Votos Brancos "+votoBranco
           +" Quantidade de Votos Nulos "+(qtdEleitores-votoValido)
        );
    }
    
    public String exibirDados(List<Candidatos>listaDeCandidatos) {
       String dados = "<html>";
       for(int i=0; i<listaDeCandidatos.size(); i++) {
           dados +="<br>Nome do Candidato: "+listaDeCandidatos.get(i).getNome()+""
                   +"<br> Quantidade de Votos : "+listaDeCandidatos.get(i).getVotosRecebidos()+"\n";
           
       }
        dados +="<br> Quantidade de Votos Brancos "+votoBranco
           +"<br> Quantidade de Votos Nulos "+(qtdEleitores-votoValido)+"<html>";
        return dados;
    }
}
