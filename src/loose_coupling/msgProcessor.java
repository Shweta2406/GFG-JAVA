package loose_coupling;

public class msgProcessor {
    private msgService m;

    //constructor injection
    public msgProcessor(msgService m)
    {
        this.m=m;
    }

    //setter injection-not preferable as it can be called multiple times and can cause issues
    public void sendmsgService(msgService m)
    {
        this.m=m;
    }

    public void process(String msg)
    {
        this.m.sendMsg(msg);
    }
}
