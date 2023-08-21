----------------------------------------------------------------------------
Este é o arquivo README do projeto. Você deve descrever aqui o seu projeto.
Informe ao usuário (alguém que não sabe nada sobre este projeto!) tudo que
ele/ela precisa saber. Os comentários devem incluir, pelo menos:
------------------------------------------------------------------------

TÍTULO DO PROJETO: UPA Automatizada
OBJETIVO DO PROJETO: Criar um sistema de uma UPA capaz de registrar 10 pacientes. Cada paciente é registrado com nome, cpf, telefone, diagnostico, medicamento indicado e caixa de medicamentos necessária. O programa deve ser capaz de adicionar pacientes, remover pacientes, mostrar as vagas ocupadas na UPA, mostrar apenas os pacientes registrados, mostrar os nomes dos pacientes em ordem alfabética crescente, mostrar a porcentagem de pacientes com cada doença e imprimir o relatório do estoque de medicamentos. 
VERSÃO ou DATA: 6.0
COMO INICIAR O PROJETO: Abrir package com o bluej e executar void main() de Aplicação.java
AUTORES: Gabriel e José - números de matrícula respectivamente: 23111166 e 23111272
INSTRUÇÕES PARA O USUÁRIO:
-Ao abrir o progama, você tem 8 opções para escolher, cada uma delas executa uma função diferente. 
-Ao digitar 1 você pode cadastrar um paciente digitando as informações do mesmo, uma de cada vez. Ao digitar 2 você pode remover um paciente digitando o número do mesmo. 
-Ao digitar 3 será exibido todas as posições do vetor de pacientes até mesmo as vazias.
-Ao digitar 4 serão exibidos apenas os pacientes cadastrados.
-Ao digitar 5 serão exibidos o nome de todos os pacientes em ordem alfabética.
-Ao digitar 6 será exibida a porcentagem das doenças que os pacientes possuem.
-Ao digitar 7 será exibido um relatório com o estoque de medicamentos disponível (A upa possui 10 medicamentos de cada).
-Ao digitar 8 você sai do programa.

DESCRIÇÃO DETALHADA DA ELABORAÇÃO DO TRABALHO:
Este trabalho foi uma grande experiência de aprendizagem, fomos desafiados a pensar e raciocinar para desenvolver o sistema da UPA. Foram necessários vários laços, várias condicionais e vários métodos, que estão todos comentados no código, afim de explicar nosso raciocínio.
Encontramos algumas dificuldades em desenvolver o trabalho, que foram resolvidas com pesquisas na internet. Como por exemplo, na hora da validação de informações de CPF e telefone, tivemos de desenvolver um algoritmo para checar a quantidade de números e para validar se realmente os valores inseridos eram números, pois declaramos como String para não pesar na memória. -Gabriel: Assim recorri ao site Techiedelight[1], para determinar se uma String é um número válido em Java, com essa pesquisa consegui resolver o problema e entender o algoritmo. Também tivemos certa dificuldade no algoritmo de remover paciente, pois o algoritmo descia a posição no array mas o outro não era colocado no lugar, mas após pensar bastante conseguimos resolver. -José: Uma das dificuldades que encontrei foi na criação do metódo para colocar os nomes em ordem, aí pesquisei na internet e encontrei sites [3], [4] onde outros programadores utilizavam o método Array.sort. O método compara strings e os organiza em ordem alfabética. Como os dados utilizados estavam no paciente e eu precisava apenas do nome, pensei em retornar somente o nome para uma váriavel para poder utilizar o metódo, pois o mesmo só funciona com uma String.

REFERÊNCIAS: 
[1] https://www.techiedelight.com/pt/determine-string-valid-number-java/#:~:text=Podemos%20usar%20a%20express%C3%A3o%20regular,se%20uma%20string%20%C3%A9%20num%C3%A9rica
[2] https://pt.stackoverflow.com/questions/466314/regex-que-aceite-somente-letras-ou-letras-e-n%C3%BAmeros
[3] https://www.youtube.com/watch?v=HywaYFNzQLs&t=198s
[4] https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/