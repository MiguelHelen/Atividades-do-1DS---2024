## Atividade (Arrays) 

Esse projeto foi criado com o intuito de ser um "tutorial" com o objetivo de explicar a lógica por trás de 7 Exercicios utilizando a linguagem Java, sobre Arrays na matéria de Técnicas de Programação e Algoritmos (TPA).

## Exercicios: 

1. Array armazenando 10 nomes e indexando em ordem crescente;
2. Array armazenando 20 nomes e indexando em ordem decrescente; 
3. Array armazenando 50 números e indexando em ordem crescente;
4. Array armazenando 50 números e indexando em ordem decrescente;
5. Array armazenando 100 números e indexando números pares;
6. Array armazenando 100 números e indexando números impares;
7. Array armazenado a tabela de classificação do campeonato brasileiro atual;

---

## Explicação do Exercicio 1: 

Importei as Classes 'Scanner' que é utilizada para o usuário entrar com dados (Informações) e a Classe 'Arrays' que serve para armazenar uma coleção de dados do mesmo tipo.

- Utilizei o método `Arrays.sort()` que organiza os dados armazenados no Array em ordem crescente ou alfabética para as Strings.

  Restante do código:

  - Criei um Array do tipo 'String' com o nome 'Nomes' que serve para armazenar 10 nomes digitados pelo Usuário.
  - O primeiro for (loop) pega os nomes digitados pelo Usuário e armazena no Array.
  - Arrays.sort(nomes) serve para ordenar os nomes em ordem Alfabética.
  - O segundo for (loop) serve para 'imprimir' os nomes digitados já em ordem alfabética na tela do usuário.
 
    ---
 
  ## Explicação do Exercício 2: 

Importei as Classes 'Scanner' que é utilizada para o usuário entrar com dados (Informações), a Classe 'Arrays' que serve para armazenar uma coleção de dados do mesmo tipo e a Classe 'Collections' que permite armazenar e manipular grupos de objetos. 

- Utilizei o método `Arrays.sort(nomes, Collections.reverseOrder())` que organiza os dados armazenados no Arrays na ordem Decrescente.

Restante do Código: 

  - Criei um Array do tipo 'String' com o nome 'Nomes' que serve para armazenar 10 nomes digitados pelo Usuário.
  - O primeiro for (loop) pega os nomes digitados pelo Usuário e armazena no Array.
  - Arrays.sort(nomes, Collections.reverseOrder()) serve para ordenar os nomes em ordem Decrescente ( Z até A ) .
  - O segundo for (loop) serve para 'imprimir' os nomes digitados já na ordem Decrescente na tela do usuário.

---
 ## Explicação do Exercício 3:  

Importei as Classes 'Scanner' que é utilizada para o usuário entrar com dados (Informações) e a Classe 'Arrays' que serve para armazenar uma coleção de dados do mesmo tipo.

- Utilizei o método `Arrays.sort()` que organiza os dados armazenados no Array em ordem crescente ou alfabética para as Strings.

  Restante do Código:

  - Criei um Array do tipo Int com o nome 'numeros' que serve para armazenar 50 números inteiros digitados pelo usuário.
  -  O primeiro for (loop) pega os números digitados pelo Usuário e armazena no Array.
  - Arrays.sort(numeros) serve para ordenar os números em ordem Crescente.
  -  O segundo for (loop) serve para 'imprimir' os números digitados já na ordem Crescente na tela do usuário.

---

## Explicação do Exercício 4: 

Importei as Classes 'Scanner' que é utilizada para o usuário entrar com dados (Informações), a Classe 'Arrays' que serve para armazenar uma coleção de dados do mesmo tipo e a Classe 'Collections' que permite armazenar e manipular grupos de objetos. 

- Utilizei o método `Arrays.sort(numeros, Collections.reverseOrder())` que organiza os dados armazenados no Arrays na ordem Decrescente.

  Restante do Código:

   - Criei um Array do tipo Int com o nome 'numeros' que serve para armazenar 50 números inteiros digitados pelo usuário.
   -  O primeiro for (loop) pega os números digitados pelo Usuário e armazena no Array.
   -  Arrays.sort(numeros, Collections.reverseOrder()) serve para ordenar os números em ordem Decrescente.
   -  O segundo for (loop) serve para 'imprimir' os números digitados já na ordem Decrescente na tela do usuário.
 
  ---


  ## Explicação do Exercício 5:

 Importei as Classes 'Scanner' que é utilizada para o usuário entrar com dados (Informações) e a Classe 'Arrays' que serve para armazenar uma coleção de dados do mesmo tipo.

 - Utilizei o método `Arrays.sort()` que organiza os dados armazenados no Array em ordem crescente ou alfabética para as Strings.

  Restante do Código:

   -  Criei um Array do tipo Int com o nome 'numeros' que serve para armazenar 100 números inteiros digitados pelo usuário.
   -  O primeiro for (loop) pega os números digitados pelo Usuário e armazena no Array.
   -  Arrays.sort(numeros) serve para ordenar os números em ordem Crescente.
   -  O segundo for (loop) serve para 'imprimir' os números digitados já na ordem Crescente na tela do usuário.
   -  O if tem a condição de exibir na tela apenas os números Pares.
---

## Explicação do Exercício 6: 


Importei as Classes 'Scanner' que é utilizada para o usuário entrar com dados (Informações) e a Classe 'Arrays' que serve para armazenar uma coleção de dados do mesmo tipo.

 - Utilizei o método `Arrays.sort()` que organiza os dados armazenados no Array em ordem crescente ou alfabética para as Strings.

  Restante do Código:

  - Criei um Array do tipo Int com o nome 'numeros' que serve para armazenar 100 números inteiros digitados pelo usuário.
  -  O primeiro for (loop) pega os números digitados pelo Usuário e armazena no Array.
  - Arrays.sort(numeros) serve para ordenar os números em ordem Crescente.
  -  O segundo for (loop) serve para 'imprimir' os números digitados já na ordem Crescente na tela do usuário.
  -  O if tem a condição de exibir na tela apenas os números Ímapres.

---

## Explicação do Exercício 7: 

Importei a Classe 'Arrays' que serve para armazenar uma coleção de dados do mesmo tipo.

 - Fiz um Array do tipo 'String' com o nome 'times' já definido onde dentro desse Array tem os times do Campeonato Brasileiro na ordem atual da Tabela.
 - O primeiro for (loop) Imprime os times do Campeonato Brasileiro na ordem atual da Tabela.



  

  
