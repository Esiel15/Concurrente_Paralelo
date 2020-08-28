/**
 * Clase mi Hilo
 */
public class MiHilo extends Thread{
    /**
     * Constructor
     * @param nombre
     */
    public MiHilo(String nombre){
    //super se usa para llamar a la versión del constructor de Thread
        super(nombre);
    }

    /**
     * //Punto de entrada del hilo
     */
    public void run(){
        System.out.println(getName()+" iniciando.");
        //Como ExtendThread extiende de Thread, puede llamar directamente 
        //a todos los métodos de Thread, incluido el método getName().
        try {
            for (int cont=0;cont<11;cont++){
                Thread.sleep(5);
                System.out.println("En "+getName()+ ", el recuento es "+cont);
            }
        }catch (InterruptedException exc){
            System.out.println(getName()+ " interrumpido.");
        }
            System.out.println(getName()+ " finalizando.");
    }
    
    /**
     * Main
     * @param args
     */
    public static void main(String args[]){ 
        MiHilo miHilo=new MiHilo("Hola Mundo"); 
        miHilo.start();
	}
}