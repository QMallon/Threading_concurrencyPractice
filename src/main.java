public class main {

    public static void main(String args[]){
        ThreadsDemo thread1 = new ThreadsDemo("One");
        ThreadsDemo thread2 = new ThreadsDemo("Two");
        thread1.start();
        thread2.start();


    }
}
