
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messageCollection;

    public MessagingService() {
        messageCollection = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messageCollection.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return messageCollection;
    }

}
