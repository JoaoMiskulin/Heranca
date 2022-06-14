
public class Moto extends Veiculo {    
    private int cilindradas;
	
    public Moto(String marca, String motor, int cilindradas) {    	
       super(marca,motor);        
       this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
	
    public String imprimir() {                                                   //alterando a visibilidade dos atributos da classe pai, 
        return super.imprimir() +                                             //permite que eu nao use o Get antes das palavras;
            " de " + cilindradas + " cilindradas."; 				            // Ex: mudei de getCilindradas pra cilindradas.
        }
    
    // Ao mover a classe moto para outro pacote, 
    //   o atributo motor deixou de ser visível na classe moto.
    // Para corrigir, ou teríamos que declará-lo como protected,
    //ou utilizar modificadores de acesso.
    
    
    
    
    
    
    
    
    }
