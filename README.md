# AGENDA-Matrizes-

### de: Gabriel Hiro Furukawa👨‍💻

# ¿? **ATIVIDADE**

  DESENVOLVER UM PROGRAMA QUE SIMULE UMA AGENDA DE CADASTRO PESSOAL COM NOME, ENDEREÇO, CÓDIGO POSTAL, BAIRRO E TELEFONE DE DEZ PESSOAS. 
  AO FINAL, O PROGRAMA DEVE APRESENTAR SEUS ELEMENTOS DISPOSTOS EM ORDEM ALFABÉTICA ASCENDENTE A PARTIR DO ELEMENTO (CAMPO) NOME. UTILIZE O FLUXOGRAMA DADO E O DESCRITIVO (PORTUGOL) NO CONTEÚDO DA AULA.
  
# 📑 **ALGORITMO**

 programa AGENDA

var

	DADO : Conjunto[1..10,1..5] de cadeia
	I, J : inteiro
	x : cadeia

inicio 

	(Rotina de entrada)

	para I de 1 até 10 passo 1 faça
		escreva "Nome: " 	leia DADO[I,1]
		escreva "Endereço: " 	leia DADO[I,2]
		escreva "Código Postal: " leia DADO[I,3]
		escreva "Bairro: " 	leia DADO[I,4]
		escreva "Telefone: " 	leia DADO[I,5]
	fim_para

	( Rotina de saida )
	
	para I de 1 até 10 passso 1 faça
		para J de 1 até 5 passo 1 faça 
			escreva DADO[I,1]
		fim_para
	fim_para
  
fim


		
# ⛏ **FLUXOGRAMA**

![fluxograma](https://github.com/GabrielHiro/AGENDA-Matrizes-/blob/b67fd78fa1121571be2113afa5bee2da4050a7bb/Fluxograma_agenda.png)

#### 📑Licença MIT
#### 🕑Última atualização 11/06/2022
