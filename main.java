public class Main{
    public static void main(String[] args){
        Pista p = new Pista(100);
        Sapo s1 = new Sapo(1);
        Sapo s2 = new Sapo(2);
        Sapo s3 = new Sapo(3);
        Sapo s4 = new Sapo(4);
        Sapo s5 = new Sapo(5);
    
        ThreadSapo t1 = new ThreadSapo(s1,p);
        ThreadSapo t2 = new ThreadSapo(s2,p);
        ThreadSapo t3 = new ThreadSapo(s3,p);
        ThreadSapo t4 = new ThreadSapo(s4,p);
        ThreadSapo t5 = new ThreadSapo(s5,p);
    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}