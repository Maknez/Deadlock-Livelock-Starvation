//Deadlock describes a situation where two more threads are blocked because of waiting for each other forever. 
public class DeadlockMain {
    public void deadRun() {
        Deadlock deadlock = new Deadlock();
 

    Thread t1 = new Thread(new Runnable() {
        public void run() {
            deadlock.firstLock();
			usypiacz();          
		}
    });

    t1.start();

    Thread t2 = new Thread(new Runnable() {
        public void run() {
            deadlock.secondLock();
			usypiacz();
        }
    });

    t2.start();
}

	private void usypiacz() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


	
