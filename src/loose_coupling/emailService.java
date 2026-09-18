package loose_coupling;

public class emailService implements msgService{

    @Override
    public void sendMsg(String msg)
    {
        System.out.println("ending email: "+msg);
    }
}
