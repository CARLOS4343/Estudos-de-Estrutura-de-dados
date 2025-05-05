package objeto;

public class FilaEstaticaCircular implements Enfileiravel {
     private int ponteiroInicio;
     private int ponteiroFim;
     private int quantidade;
     private Object[] dados;
     
     public FilaEstaticaCircular() {
    	 this(10);
     }
     public FilaEstaticaCircular(int tamanho) {
    	 this.ponteiroInicio=-1;
    	 this.ponteiroFim=-1;
    	 this.quantidade=0;
    	 dados=new Object[tamanho];
    	 
     }
	@Override
	public void enfileirar(Object dado) {
		if(!estaCheio()) {
			ponteiroFim = avancar(ponteiroFim);
			dados[ponteiroFim] = dado;
			quantidade++;
			ponteiroFim++;
			dados[ponteiroFim]=dado;
		}else {
			System.err.println("está cheio");
		}
		
	}

	@Override
	public Object desenfileirar() {
		Object elemento=null;
		if(!estaVazio()) {
			elemento = dados[ponteiroInicio];
			ponteiroInicio = avancar(ponteiroInicio);
			quantidade--;
			ponteiroInicio++;
			elemento=dados[ponteiroInicio];
		}else {
			System.err.println("esta Vazio");
		}return elemento;
	}

	@Override
	public Object espiar() {
		Object elemento=null;
		int aux=ponteiroInicio;
		if(!estaVazio()) {
			if(aux==dados.length-1) {
				aux=-1;
			}
			
			elemento=dados[aux];
		}else {
			System.err.println("esta Vazio");
		}return elemento;
	}

	@Override
	public boolean estaCheio() {
		
		return (quantidade==dados.length);
	}

	@Override
	public boolean estaVazio() {
	
		return (quantidade==0);
	}

	@Override
	public String imprimir(){
		String retorno = "[";
		int ponteiroAux = ponteiroInicio;
		for (int i = 0; i < quantidade; i++) {			
			if (i == quantidade - 1) 
				retorno += dados[ponteiroAux];
			else
				retorno += dados[ponteiroAux] + ",";
			
			ponteiroAux = avancar(ponteiroAux); 
		}
		return retorno + "]";	
	}
	
	private int avancar(int ponteiro) {
		return (ponteiro+1)%dados.length;
	}	

}
