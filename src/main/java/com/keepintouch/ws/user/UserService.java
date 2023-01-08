package com.keepintouch.ws.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(@RequestBody User user) {
        userRepository.saveAndFlush(user);
    }
}
