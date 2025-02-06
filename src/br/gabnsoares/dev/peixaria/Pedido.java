package br.gabnsoares.dev.peixaria;

import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemPedido> itemPedido;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(List<ItemPedido> itemPedido) {
        this.itemPedido = itemPedido;
    }
}
