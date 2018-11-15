package dto.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

/**
 * class for declare message client-server
 */
@Getter
@Setter
@AllArgsConstructor
public class Message {

    private UUID messageID;
    private String messageContent; //main message content
    private Date messageDate;
}
