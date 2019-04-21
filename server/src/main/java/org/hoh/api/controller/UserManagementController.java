package org.hoh.api.controller;

import org.hoh.api.constants.PathConstants;
import org.hoh.api.dto.UserDTO;
import org.hoh.api.services.Interfaces.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutionException;

@RestController
public class UserManagementController {

    @Resource
    UserService userService;

    @RequestMapping(value = PathConstants.REGISTER_USER, method= RequestMethod.POST)
    public boolean registerUser(HttpServletRequest request,
                                @RequestBody final UserDTO userDTO) throws Exception
    {
        userService.registerUser(userDTO);
        return true;
    }
}
