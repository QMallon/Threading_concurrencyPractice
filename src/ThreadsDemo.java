public class ThreadsDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadsDemo(String Name){
        threadName = Name;
        System.out.println("CREATING: " + threadName);


    }



}
