package loose_coupling;

public class smsService implements msgService{
    @Override
    public void sendMsg(String msg)
    {
        System.out.println("ending sma: "+msg);
    }
}
