package multithreading;

public class ThreadClass extends Thread {

   public void run(){
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println("Hi");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadClass threadClass1=new ThreadClass();
        ThreadClass threadClass2=new ThreadClass();
        threadClass1.setName("A");
        threadClass2.setName("B");
        threadClass1.start();//worker thread
        threadClass2.start();
        threadClass1.join();
        threadClass2.join();
        threadClass1.run();//main thread

    }

}
