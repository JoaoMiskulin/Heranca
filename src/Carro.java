
public class Carro extends Veiculo {
	
	    private int portaMalas;
		
	    public Carro(String marca, String motor, int portaMalas) {
	    	super(marca,motor);
	    	this.portaMalas = portaMalas;
	    }

	    public int getPortaMalas() {
	        return portaMalas;
	    }
		
	    public String imprimir() {												// Alterei o método da classe pra utilizar atributos,
	    	   return "Marca: " + this.marca + ", Motor: " + this.motor +        // prefixando-os com a palavra this.
	    		        "  Porta malas: " + this.portaMalas + " litros.";          
	            			
	    }
	}

