public class ThreadSapo extends Thread{
    Sapo sapo;
    Pista pista;
    
    public ThreadSapo(Sapo sapo, Pista pista){
        this.sapo = sapo;
        this.pista = pista;
    }
    
    public Sapo getSapo(){
        return this.sapo;
    }

    @Override
    public void run(){
        while(sapo.getDistanciaPercorrida() < pista.getTamanho()){
            sapo.pular();
        }
        System.out.println("Sapo " + sapo.getNumero() + " chegou em: " + pista.getPosicaoChegada());
    }
}