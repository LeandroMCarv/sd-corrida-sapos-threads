public static void main(String[] args){
    int pista = 30; //pista de corrida = 30m

    Sapo s1 = new Sapo(1);
    Sapo s2 = new Sapo(2);
    Sapo s3 = new Sapo(3);
    Sapo s4 = new Sapo(4);
    Sapo s5 = new Sapo(5);

    ThreadSapo t1 = new ThreadSapo(s1);
    ThreadSapo t2 = new ThreadSapo(s2);
    ThreadSapo t3 = new ThreadSapo(s3);
    ThreadSapo t4 = new ThreadSapo(s4);
    ThreadSapo t5 = new ThreadSapo(s5);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
}