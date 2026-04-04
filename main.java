public class Main{
    public static int pista = 30;
    public static void main(String[] args){
        Sapo s1 = new Sapo(1);
        Sapo s2 = new Sapo(2);
        Sapo s3 = new Sapo(3);
        Sapo s4 = new Sapo(4);
        Sapo s5 = new Sapo(5);
    
        ThreadSapo t1 = new ThreadSapo(s1,pista);
        ThreadSapo t2 = new ThreadSapo(s2,pista);
        ThreadSapo t3 = new ThreadSapo(s3,pista);
        ThreadSapo t4 = new ThreadSapo(s4,pista);
        ThreadSapo t5 = new ThreadSapo(s5,pista);
    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}