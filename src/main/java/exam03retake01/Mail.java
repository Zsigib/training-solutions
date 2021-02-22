package exam03retake01;

import java.util.List;

public class Mail {
    
    private String message;
    
    private String subject;
    
    private Contact from;
    
    private List<Contact> to;

    public <E> Mail(Contact john_doe, List<E> es, String doe_family, String s) {
    }

    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }

    public Contact getFrom() {
        return from;
    }

    public List<Contact> getTo() {
        return to;
    }
}
