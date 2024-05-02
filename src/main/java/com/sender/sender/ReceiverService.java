package com.sender.sender;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ReceiverService {

    private Set<UserDto> usersCache = new HashSet<>();

    public void acceptUser(UserDto user) {
        usersCache.add(user);
    }

    public Set<UserDto> getAllUsers() {
        return usersCache;
    }
}
