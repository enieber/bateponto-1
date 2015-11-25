# Bate Ponto

**O que é?**

  O Bate Ponto é um prototipo de Ponto Eletronico com o intuito de automatizar o registro de entrada e saida dos funcionarios.

**O qual a ideia?**

  A ideia do Bate Ponto é que apartir do momento em que o usuario ligar o computador o app iniciara e pedira a ele que faça o seu login no sistema  para comprovar que realmente é ele quem está batendo ponto. 
  
  Os dados serão salvos em um banco local e depois sincronizado com uma API na nuvem para que os dados sejam armazenados independente de acesso a Internet e depois acessado independente da maquina.
  
  O horario gravado sera 5 minutos antes do horario logado, assim o funcionario tera 5 minutos até ligar o computador e iniciar a aplicação. Caso o usuario demore mais do que 5 minutos, em relaçã ao horario combinado para logar no sistema, o horario sera gravado no sistema 5 minutos antes do que ele logou, mas ele tera que dar uma justificativa para que caso aquele horario seja questionado o sistema tera gravado a justificativa do funcionario.
  

## Motivação

  Este projeto foi desenvolvido na MBoss com o intuito de aprendermos sobre `Unit Tests` e ao mesmo tempo utilisar o codigo final na a empresa

**Pré-Requisitos**
  
  * junit
  * javax.validation
  * javax.inject
  * javax
  * postgresql
  

