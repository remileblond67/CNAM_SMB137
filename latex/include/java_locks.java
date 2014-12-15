Lock l = new ReentrantLock();
l.lock();
try {
    //section critique
} finally {
    l.unlock();
}