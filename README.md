# Programação Orientada A Objetos Com Java

## 1. Exercício: [Retângulo](/exercicio_01/src/)

Faça um programa que leia os valores da largura e altura de um retângulo. 
Em seguida, mostre na tela os valores:

* Área 
* Perímetro
* Diagonal

Entrada | Saída
:----------: | :------
-- | AREA = 12.00
3.00 | PERIMETER = 14.00
3.00 | DIAGONAL = 5.00

### Conceitos utilizados

* Classe
* Objetos
* Métodos

## 2. Exercício: [Salário do Funcionário](/exercicio_02/src/)

Faça um programa que leia os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostre os dados do funcionário (nome e salário líquido). Em seguida, aumente o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostre novamente os dados do funcionário.

### Conceitos utilizados

* Classe
* Objetos
* Métodos
* toString()

~~~java
public String toString(){
    // Código
}
~~~

## 3. Exercício: [Nota do Aluno](/exercicio_03/src/)

Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).

### Conceitos utilizados

* Classe
* Objetos
* Métodos

## 4. Exercício: [Produto em Estoque](/exercicio_04/src/)

Faça um programa que leia o nome de um produto, o preço e a quantidade em estoque. Logo após, adicione uma quantidade N de produto no estoque, e mostre o valor total. Por fim, remove uma quantidade N do estoque e mostre o valor total.

### Conceitos utilizados

* Construtor
* This
* Encapsulamento
* Getters e Setters

## 5. Exercício: [Conta Bancária](/exercicio_05/src/)

Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo). 

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.

### Conceitos utilizados

* Construtor
* This
* Encapsulamento
* Getters e Setters
* Sobrecarga
