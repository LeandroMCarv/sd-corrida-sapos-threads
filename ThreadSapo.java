public class ThreadSapo extends Thread{
    Sapo sapo;
    public int pista;
    public double tempoProva;
    
    public ThreadSapo(Sapo sapo, int pista){
        this.sapo = sapo;
        this.pista = pista;
    }
    
    public Sapo getSapo(){
        return this.sapo;
    }

    @Override
    public void run(){
        double inicio = System.nanoTime();
        while(sapo.distanciaPercorrida < pista){
            sapo.pular();
        }
        double fim = System.nanoTime();
        tempoProva = fim - inicio;
    }
}