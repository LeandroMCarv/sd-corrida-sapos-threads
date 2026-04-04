public class ThreadSapo extends Thread{
    private Sapo sapo;
    public double tempoProva;
    public ThreadSapo(Sapo sapo){
        this.sapo = sapo;
    }

    @Override
    public void run(){
        double inicio = System.currentTimeMillis();
        while(sapo.distanciaPercorrida < 30){ //tamanho da pista = 30m
            sapo.pular();
        }
        double fim = System.currentTimeMillis();
        System.out.println("O sapo numero " + sapo.numero + " chegou!");

        tempoProva = fim - inicio;
    }
}