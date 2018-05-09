public class Consumer extends Thread
{
    private String consumer;
    private Storage storage;

    public Consumer(Storage storage,String consumer)
    {
        this.storage = storage;
        this.consumer = consumer;
    }

    @Override
    public void run()
    {
        try {
            consume(consumer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void consume(String consumer) throws Exception
    {
        storage.consume(consumer);
    }

    public Storage getStorage()
    {
        return storage;
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }

    public String getConsumer() {
        return consumer;
    }

}