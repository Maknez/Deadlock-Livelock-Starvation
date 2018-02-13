public class Deadlock { 
    private Object lock1 = new Object();
    private Object lock2 = new Object();
 
    public void firstLock() {
        synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("FIRST thread is waiting for end of the SECOND thread");
            }
        }
    }
 
    public void secondLock() {
        synchronized (lock2) {
            synchronized (lock1) {
                System.out.println("SECOND thread is waiting for end of the FIRST thread");
            }
        }
    }
}
