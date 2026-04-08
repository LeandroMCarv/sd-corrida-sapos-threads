public class Pista {
    private int comprimento;
    private int posicaoChegada;

    public int getTamanho(){
        return comprimento;
    }

    public synchronized int getPosicaoChegada(){
        int posicao = posicaoChegada;
        posicaoChegada++;
        return posicao;
    }

    public Pista(int comprimento){
        this.comprimento = comprimento;
        this.posicaoChegada = 1;
    }
}
