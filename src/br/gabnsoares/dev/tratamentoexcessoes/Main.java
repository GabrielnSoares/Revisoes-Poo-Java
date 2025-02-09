package br.gabnsoares.dev.tratamentoexcessoes;

public class Main {

    public static void main(String[] args) {

        System.out.println("Cliente faz o pedido");
        System.out.println("Garçom envia para cozinha");
        try {
            System.out.println("Chefe tenta preparar o pedido");
            if (false) {
                throw new IngredienteIndisponivelException();
            }

            if (false) {
                throw new EntregaPedidoException("Garçom tropeçou");
            }
            throw new RuntimeException("erro generico");


        } catch (IngredienteIndisponivelException e) {
            e.printStackTrace();
            System.out.println("Chefe indica novo pedido para o cliente");
            System.out.println("Cliente aceita novo pedido");

            throw new NullPointerException();

        } catch (EntregaPedidoException e) {
            System.out.println("Garçom pede desculpas");
            System.out.println("Chefe prepara novo pediddo");
        } catch (Exception e) {
            System.out.println("Erro aconteceu durante o preparo do pedido");

        } finally {
            System.out.println("Cliente papga a conta");
        }
    }
}
