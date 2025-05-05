package p1;

public class PilhaEstática implements Empilhavel {
	  private int ponteirotopo;

	   private int cont;
	   private Object[] dado;
	   
	   public PilhaEstática() {
		   this(10);
	   }

	public PilhaEstática(int tamanho) {

		dado=new Object[tamanho];
		this.ponteirotopo=-1;
	}

	@Override
	public void empilhar(Object Dado) {
	      if(!estacheio()) {
	    	  ponteirotopo++;
	    	  dado[ponteirotopo]=Dado;
	      }else {
	    	  System.err.println("Está cheio");
	      }
		
	}

	@Override
	public Object desenpilhar() {
	       Object Retorno=null;
	       if(!estavazio()) {
	    	   Retorno=dado[ponteirotopo];
	    	   ponteirotopo--;
	       }else {
	    	   System.err.println("Está vazio");
	       }return Retorno;
	}

	@Override
	public void atualizar(Object Dado) {
		Object result=null;
		if(!estavazio()) {
			dado[ponteirotopo]=Dado;
		}else {
			  System.err.println("Está vazio");
		}
		
	}

	@Override
	public boolean estacheio() {
	     return ponteirotopo==dado.length-1;
	}

	@Override
	public boolean estavazio() {
		return ponteirotopo==-1;
	}

	@Override
	public String imprimir() {
		String Result="[";
		for(int i=ponteirotopo;i>=0;i--)
		if(i==0){
			Result+=dado[i];
		}else {
		Result+=dado[i]+",";
	}return Result+"]";

	   
	}
}
