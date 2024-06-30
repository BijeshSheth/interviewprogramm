package interviewprogramm.important;

public class VirtualThreadDemo implements Runnable
{
    @Override
    public void run() {
        System.out.println("Virtual thread running");
    }

    public static void main(String[] args) {

        VirtualThreadDemo virtualThreadDemo = new VirtualThreadDemo();
        Thread thread = new Thread(virtualThreadDemo);
        Thread.startVirtualThread(thread);

    }
}
