package Eletrica;

public class ArCondicionado implements Funcionamento{
    boolean Estado = false;

    @Override
    public void ligar() {
        Estado = true;
    }

    @Override
    public void desligar() {
        Estado = false;
    }

    @Override
    public boolean status() {
        return this.Estado;
    }
}
