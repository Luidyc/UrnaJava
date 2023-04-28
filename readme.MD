## Urna Eletrônica em Java, orientada a objetos.

### Diagrama de Classes

![Diagrama](https://user-images.githubusercontent.com/99658182/235033446-229e566e-45ae-4510-b5a5-41e36bc89808.png)

### Conhecimentos aplicados
- Java Class, Interface, Jframe;
- Orientação a objetos;
- Encapsulamento;
- Reuso de Funções;
- Polimorfismo


### Funcionamento
- Partindo de ponto que os candidatos a votação são previamente cadastrados;
- Ao iniciar a Urna uma sessão de votação que pode ser reiniciada;
- Capture o voto ao clicar em confirmar na Lista de Eleitores;
- Verifique se foi um votoValido(Considerar Valido = Candidato, ou Branco);
- Votos brancos foram definidos como uma solução de "Voto=100" já que candidatos podem ter apenas 2 dígitos;


## Model-Candidato

   - String nome;
   - ImageIcon imgPresidente;
   - int numeroDoCandidato;
   - String partido;
   - ImageIcon imgVice;
   - String vice;


## Business Rules
- Candidato não pode ser construido igual;

## Model-Votação

   - List <Candidatos> listaDeCandidatos;
   - List <Eleitores> listaDeEleitores;

## Business Rules
- Cria um novo Eleitor, e o adiciona somente ao confimar voto;
- Precisa que o candidato seja adicionado a uma lista válida, e após utilizar seu construtor;
- Apurar votos devolve através do Console em quem cada eleitor votou ao finalizar a lista de Eleitores e criar uma nova (Função do botão Nova).

## Model-Eleitor

   - List <Candidatos> listaDeCandidatos;
   - List <Eleitores> listaDeEleitores;

## Business Rules
- Não permite informar mais de 2 digitos;
- Ao cliclar em um candidato Branco é necessário corrigir para votar em outro;


    
