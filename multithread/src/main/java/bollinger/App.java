package bollinger;

/**
 * This is the main class of my first project of threads 
 * lva
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run(){
                //Code that will run in a new thread
                System.out.println("We are now in thread: " + Thread.currentThread().getName());
                System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
            }
        });

        // Set a new name to the thread
        thread.setName("New worker Thread");

        // Set the max priority
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread");

    }
}
