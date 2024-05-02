package com.sender.sender;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/here")
@RequiredArgsConstructor
public class ReceiverController {

    private final ReceiverService receiverService;

    @PostMapping
    public void receiveMessage(@RequestBody UserDto user) {
        receiverService.acceptUser(user);
    }

    @GetMapping("/users")
    public Set<UserDto> getUsers() {
        return receiverService.getAllUsers();
    }

}
