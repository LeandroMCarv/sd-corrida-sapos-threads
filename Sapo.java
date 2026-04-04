public class Sapo {
    public int distanciaPercorrida;
    public int numero;

    public Sapo(int numeroSapo){
        this.numero = numeroSapo;
        distanciaPercorrida = 0;
    }

    public void pular(){
        int distanciaPulo = (int) (Math.random() * 5);
        distanciaPercorrida += distanciaPulo;
    }
}
