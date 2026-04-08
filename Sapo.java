public class Sapo {
    private int distanciaPercorrida;
    private int numero;

    public int getDistanciaPercorrida(){
        return distanciaPercorrida;
    }

    public int getNumero(){
        return numero;
    }

    public Sapo(int numeroSapo){
        this.numero = numeroSapo;
        distanciaPercorrida = 0;
    }

    public void pular(){
        int distanciaPulo = (int) (Math.random() * 5);
        distanciaPercorrida += distanciaPulo;
    }
}
