public class ThreadSapo extends Thread{
    private Sapo sapo;
    public int pista;
    public double tempoProva;
    public ThreadSapo(Sapo sapo, int pista){
        this.sapo = sapo;
        this.pista = pista;
    }

    @Override
    public void run(){
        double inicio = System.currentTimeMillis();
        while(sapo.distanciaPercorrida < pista){
            sapo.pular();
        }
        double fim = System.currentTimeMillis();
        System.out.println("O sapo numero " + sapo.numero + " chegou!");

        tempoProva = fim - inicio;
    }
}