package org.hoh.api.services.Impl;

import org.hoh.api.domain.entities.Users;
import org.hoh.api.domain.repositories.UsersRepository;
import org.hoh.api.dto.UserDTO;
import org.hoh.api.services.Interfaces.UserService;
import org.hoh.api.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public Boolean registerUser(UserDTO userDTO){
        Users user = UserUtils.toEntity(userDTO);
        usersRepository.save(user);
        return true;
    }
}
