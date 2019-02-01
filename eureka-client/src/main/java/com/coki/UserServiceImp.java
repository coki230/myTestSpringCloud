package com.coki;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Override
    public String getName() {
        return "my name is lulu";
    }
}
