## Urna

### Diagrama de Classes
![alt text](diagrama.png)
### Conhecimentos aplicados
- Java Class, Interface, Jframe;
- Orientação a objetos;
- Encapsulamento;
- Reuso de Funções;
- Polimorfismo


### Funcionamento
- Partindo de ponto que os candidatos a votação são previamente cadastrados;
- Ao iniciar a Urna criei um eleição;
- Capture o voto ao clicar em confirmar;
- Verifique se foi um votoValido(Considerar Valido = Candidato, ou Branco);
- Atribua ao candidato o voto realizado nele;
- Botão novo abre apuração de Votos;
### Avisos

    - Main criado somente para testes e desenvolvimento sem implementação de Jframe;


## Model-Candidato
```json
{
    String nome;
    ImageIcon imgPresidente;
    int numeroDoCandidato;
    String partido;
    ImageIcon imgVice;
    String vice;
    int votosRecebidos;
}
```

## Business Rules
- Candidato não pode ser construido igual;

## Model-Eleicao
```json
{
    List <Candidatos> listaDeCandidatos;
    int qtdEleitores;
    int votoBranco;
    int votoValido;
}
```
## Business Rules
- Não permite informar mais de 2 digitos;
- Ao cliclar em um candidato Branco é necessário corrigir para votar em outro;

    