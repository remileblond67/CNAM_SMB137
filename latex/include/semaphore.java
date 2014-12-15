Semaphore sem = new Semaphore(1);
    try {
        sem.acquire();
        //section critique
        sem.release();
    } catch(InterruptedException e) {
        e.printStackTrace();
    }