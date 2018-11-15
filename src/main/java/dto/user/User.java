package dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * class to declare User info needed to client and server basic function - comunication: client-server-client
 */
@Getter
@Setter
@AllArgsConstructor
public class User {
    private String nick;
    private UserStatus userStatus;
}
