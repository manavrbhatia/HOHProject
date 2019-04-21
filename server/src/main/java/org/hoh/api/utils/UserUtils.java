package org.hoh.api.utils;

import org.hoh.api.domain.entities.Users;
import org.hoh.api.dto.UserDTO;

public class UserUtils {
    public static Users toEntity(UserDTO userDTO){
        Users users = new Users();
        users.setUsername(userDTO.getUsername());
        users.setFirstname(userDTO.getFirstname());
        users.setLastname(userDTO.getLastname());
        users.setUserEmail(userDTO.getUserEmail());
        users.setPassword(userDTO.getPassword());
        users.setUserTypeId(userDTO.getUserTypeID());
        return users;
    }
}
