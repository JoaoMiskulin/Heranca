
public class Onibus extends Veiculo{
	 private int passageiros;
	    private boolean articulado;
	    
	    public Onibus(String marca, String motor, int passageiros, boolean articulado) {
	        super(marca, motor);
	        this.passageiros = passageiros;
	        this.articulado = articulado;
	    }
	    
	    public int getPassageiros() {
	        return passageiros;
	    }
	    
	    public boolean isArticulado() {
	        return articulado;
	    }                          // apaguei o m�todo imprimir, assim o programa invoca o m�todo herdado da classe veiculo. apresentando somento marca e motor.
	     
	    }
	    

