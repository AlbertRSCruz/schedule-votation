<h1 align="center">Projeto Pauta de Votação</h1>
<h3 align="left">Tecnologias utilizadas:</h3>
<p align="left"> <a href="https://git-scm.com/" target="_blank" rel="noreferrer">
  <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> <a href="https://www.java.com" target="_blank" rel="noreferrer">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://postman.com" target="_blank" rel="noreferrer">
      <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a> </p>
## Autor
- [Albert Cruz](https://github.com/AlbertRSCruz)

# Solução Back-end para	Gerenciar Sessões de Votação em Assembleias

No cooperativismo, cada associado possui um voto e as decisões são tomadas em assembleias, por votação.
A partir disso, você precisa criar uma solução back-end para gerenciar essas sessões de votação.
Essa solução deve ser executada na nuvem e promover as seguintes funcionalidades através de uma API REST:

● Cadastrar uma nova pauta;

● Abrir uma sessão de votação em uma pauta (a sessão de votação deve ficar aberta por um tempo determinado na chamada de abertura ou 1 minuto por default);

● Receber votos dos associados em pautas (os votos são apenas 'Sim'/'Não'. Cada associado é identificado por um id único e pode votar apenas uma vez por pauta);

● Contabilizar os votos e dar o resultado da votação na pauta.

# Utilização Pelo Usuário

O responsável pela assembleia deve cadastrar os associados que ficarão aptos a votar, o mesmo também terá que cadastrar uma pauta de votação.
Após estes dois pré-requisitos estarem concluídos, pode-se abrir uma votação com o padrão de 1 minuto.
Durante a votação, os votantes podem fazer seu voto com a opção Sim ou Não, quando concluído o tempo de votar, o sistema informará o resultado.
