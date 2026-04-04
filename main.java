public class Main{
    public static void main(String[] args){
        int pista = 100;
        
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

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        ThreadSapo []vetor = {t1,t2,t3,t4,t5}; 
        insertionSort(vetor);
        
        exibirRanking(vetor);
    }

    public static void insertionSort(ThreadSapo[] vetor){
        ThreadSapo temp = new ThreadSapo(null,0);
        int j;
        for(int i=1;i<vetor.length;i++){
            temp = vetor[i];
            j = i-1;
            while(j>=0 && vetor[j].tempoProva>temp.tempoProva){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = temp;
        }
    }

    public static void exibirRanking(ThreadSapo[] vetor){
        for(int i=0;i<vetor.length;i++){
            System.out.println("O sapo numero " + vetor[i].getSapo().numero + " chegou em " + (i+1) + " lugar com o tempo de " + vetor[i].tempoProva + " nanossegundos.");
        }
    }
}