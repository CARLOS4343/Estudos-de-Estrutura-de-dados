package p1;

public class PilhaPrincipal {
	public static void main(String[] args) {
	       Empilhavel pilha =new PilhaEstática();
	        pilha.empilhar("Imperio");
	        pilha.empilhar("A fortaleza");
	        pilha.empilhar("A busca da Sabedoria");
	        System.out.println(pilha.imprimir()+"\n");
	        pilha.desenpilhar();
	        pilha.atualizar("Guerra fria");
	        System.out.println(pilha.imprimir());
	        
	}
}
