# 📦 Gestão de Pedidos com Tipos Enumerados (Java Enums)

Este repositório foi desenvolvido para demonstrar a aplicação prática de **Enumerações (Enums)** em Java, modelando o controle de estados de um sistema de pedidos de e-commerce.

## 🎯 Objetivo e Vantagens do Uso de Enums

O uso de enums substitui a antiga prática de utilizar constantes numéricas (como `1`, `2`, `3`) ou Strings soltas para representar estados fixos. As principais vantagens são:

* **Type Safety (Segurança de Tipos)**: O compilador garante que nenhum valor fora dos quatro estados definidos seja atribuído ao pedido.
* **Legibilidade**: O código se torna autoexplicativo (`OrderStatus.PROCESSANDO`).

## 🚀 Conceitos e Métodos Demonstrados

### 1. Ciclo de Vida do Pedido (`OrderStatus`)

O enum restringe os estados possíveis a:

* `AGUARDANDO_PAGAMENTO`
* `PROCESSANDO`
* `ENVIADO`
* `ENTREGUE`

### 2. Conversão de Texto para Enum (Parsing)

No método de execução `Program.java`, demonstra-se como realizar o *parsing* de dados textuais para o tipo Enum:

* **Instanciação Estática**: `OrderStatus os1 = OrderStatus.ENTREGUE;`
* **Instanciação Dinâmica (Instanciação por String)**: `OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");`

Essa conversão é de extrema importância em cenários reais onde a aplicação recebe payloads de APIs (JSON) ou registros textuais do banco de dados e precisa mapeá-los para objetos Java fortemente tipados.

## 📂 Estrutura de Pastas e Arquivos

* `entidades.enums/OrderStatus.java`: Arquivo contendo a estrutura de dados enumerados.
* `entidades/Order.java`: Classe de entidade que encapsula o identificador, o momento de criação do pedido (`Date`) e o status.
* `enumerações/Program.java`: Ponto de partida contendo as lógicas de teste de instanciação e escrita em console.

## 💻 Saída Esperada no Console

```text
Order [id= 1080
, moment= Wed May 27 07:27:22 BRT 2026
, status= AGUARDANDO_PAGAMENTO]
ENTREGUE
ENTREGUE

```

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para clonar, estudar e utilizar o código!

---

*Projeto desenvolvido por Roberto como parte do portfólio de estudos em Ciência da Computação e boas práticas em Java.*
