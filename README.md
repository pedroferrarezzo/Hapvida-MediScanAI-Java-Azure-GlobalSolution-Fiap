# MediScanAI-Notredame-FIAP
- Global Solutions 2 - FIAP - Análise e Desenvolvimento de Sistemas | FIAP;
- Projeto desenvolvido em parceria com a empresa Notredame Intermédica;
- Observação: Projeto desenvolvido para estudo, sem fins comerciais.

## Pré-requisitos

- JDK 17(+);
- JRE 1.8(+);
- Apache Tomcat 9;
- Instância Custom Vision - Cloud Provider Azure.

### Desafio atendido

"Pensando no tema Inovação e Tecnologia Moldando o Futuro da Saúde: Prevenção, Automação e Precisão. Cabe a você/equipe trabalhar na proposta de uma solução (software) que promova benefícios para área da saúde. Utilizem novas tecnologias, todo seu talento, criatividade e inovação, SURPREENDA com uma grande PROPOSTA. Que promova um ou mais temas a seguir: a prevenção de doenças, a automação de processos médicos, a precisão nos diagnósticos e tratamentos."

## Sobre o projeto

MediScanAI é uma aplicação web destinada a análise/predição de imagens de exames médicos, utilizando o serviço de inteligência artificial Custom Vision - para classificação/detecção de objetos, do provedor de nuvem Azure.

## Funcionalidade Principal

Devolver ao usuário as possíveis patologias apresentadas na imagem concecida a aplicação, tudo isto por meio de tags em um modelo de machine learning previamente treiando de forma supervisionada.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação principal (Linguagem de Backend);
  - **Classes Java Bean:** Classes entity relacionadas ao modelo de negócio desenvolvidas de acordo com a especificação Java Bean (Camada Model);
  - **Servlets:** Classes extendidas de HttpServlet responsáveis por tratar requisições HTTP (GET ou POST) vindas do client, além de realzar a integração com as classes DAO/Entity (Camada Controller);
  - **DAO:** Design Pattern - Classes responsáveis por abstrair a lógica de conexão/execução de instruções no banco de dados Oracle (Camada Model).
- **Java Server Pages (JSP):** Tecnologia para o desenvolvimento da camada de visualização (Camada View);
  - **CSS Bootstrap:** Conjunto de classes de formatação e componentes JS pré-desenvolvidos (Framework);
  - **Javascript:** Responsável por manipular a DOM do HTML, forneceno maior dinamismo (Linguagem Frontend);
  - **JavaServer Pages Standard Tag Library (JSTL):** Conjunto de tags customizadas para simplificar o desenvolvimento JSP (Framework);
  - **Expression Language (EL):** Linguagem de expressão utilizada em JSP para acessar dados no backend (Framwork);
- **Eclipse IDE:** IDE utilizada para desenvolvimento de todo o projeto;
