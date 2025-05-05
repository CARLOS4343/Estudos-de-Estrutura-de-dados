package objeto;

public interface Enfileiravel {
       void enfileirar(Object dado);
       Object desenfileirar();
       Object espiar();
       boolean estaCheio();
       boolean estaVazio();
       String imprimir();
}
