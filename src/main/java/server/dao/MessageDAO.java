package server.dao;

import dto.message.Message;

import java.util.Date;
import java.util.List;

public interface MessageDAO {

    boolean save(Message message);

    public List<Message> getAllMessage();

    public List<Message> getAllMessageFromDate(Date date);

}
