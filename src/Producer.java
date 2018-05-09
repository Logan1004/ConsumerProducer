public class Producer extends Thread
{
    private String producer;
    private Storage storage;

    public Producer(Storage storage,String producer)
    {
        this.storage = storage;
        this.producer = producer;
    }

    @Override
    public void run()
    {
        try {
            produce(producer);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void produce(String producer) throws Exception
    {
        storage.produce(producer);
    }

    public String getProducer()
    {
        return producer;
    }

    public void setProducer(String producer)
    {
        this.producer = producer;
    }

    public Storage getStorage()
    {
        return storage;
    }

}