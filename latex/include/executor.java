Executor executor = Executors.newSingleThreadExecutor();
executor.execute(new Runnable() {
    public void run() {
        System.out.println("appel asynchrone 1");
    }
});
executor.execute(new Runnable() {
    public void run() {
        System.out.println("appel asynchrone 2");
    }
});