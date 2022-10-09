# thelephone-book
Agenda de Telefones:

O problema consiste em implementar uma solução para uma agenda telefônica. As condições para a implementação são:
- É possível cadastrar uma pessoa em uma lista de pessoas.
- É possivel cadastrar um telefone em uma lista de telefones.
- Para cadastrar um telefone, é necessário ter uma pessoa cadastrada.
- O mínimo para cadastrar uma pessoa é: nome, sobrenome e CPF.
* O CPF tem que ser único.
- Deverá ser possível mostrar na tela todos os telefones e seus respectivos donos.
- Na agenda deverá ser possível adicionar, remover e atualizar os telefones.
- Onde vão ficar cada um dos métodos.
- Quais as propriedades de cada classe (variáveis).
- Desenhar fluxo dos métodos: adicionar pessoa, remover pessoa, adicionar telefone.
  https://prnt.sc/N4ygHPmpe8nN
  https://prnt.sc/-quC9dIZ5PL5

Classes a serem implementadas:
- Contact, Phone, Notebook;

Métodos:
* Notebook
-[ ] Adicionar pessoa na lista: O mínimo para cadastrar uma pessoa é: nome, sobrenome e CPF. O CPF tem que ser único.
-[ ] Remover pessoa da lista: precisa remover também os telefones que estão ligados a ela.
-[ ] Mostrar lista de contatos na tela;
-[ ] Adicionar número de telefone: Para cadastrar um telefone, é necessário ter uma pessoa cadastrada. Adicionar um telefone
na lista de telefones do contato.
-[ ] Remover telefone da lista de telefones do contato;
-[ ] Atualizar telefone da lista de telefones do contato;
-[ ] Atualizar pessoa;
* Contact
* Phone

Variáveis da Classe:
* Contact
- nome, sobrenome, cpf, email, listaPhone;

* Phone
- contato, numeroTelefone;

* Notebook
- lista de pessoas e lista de telefones;

