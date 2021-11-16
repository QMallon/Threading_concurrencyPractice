public class ThreadsDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadsDemo(String Name){
        threadName = Name;
        System.out.println("CREATING: " + threadName);


    }

    public void run(){
        //LOGIC HERE
        System.out.println("Running");
        try{
            System.out.println("Thread: " + threadName + " Running");
            Thread.sleep(50);
        }
        catch(Exception e){
            System.out.println("Thread: " + threadName + " Interrupted");
        }

        System.out.println("Thread: " + threadName + " Exiting");
    }
    public void start(){
        System.out.println("Thread: " + threadName + " Starting");
        if(t ==null){
            t = new Thread(this, threadName);
            t.start();
        }

    }

}
