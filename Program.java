package enumerações;

import java.util.Date;
import entidades.Order;
import entidades.enums.OrderStatus;
public class Program {

public static void main(String[] args) {
Order pedido1 = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);


OrderStatus os1 = OrderStatus.ENTREGUE;

//Convertendo a String pura para o Enum correto do Java
OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");

// Mostrando pedido1 apos a conversao
System.out.println(pedido1.toString());

// atribuindo o valor diretamente usando o código Java, apenas para teste
System.out.println(os1);

/*O método .valueOf("TEXTO") pegou a String pura e tentou
encontrar um Enum correspondente que tenha exatamente 
aquele mesmo nome. Se ele achar, ele transforma aquela
String em um objeto Enum de verdade.*/
System.out.println(os2);

}



}
