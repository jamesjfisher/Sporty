package com.sporty.controller;

import com.sporty.dto.PulseCloudUserDisplay;
import com.sporty.repo.PulseCloudUserRepo;
import com.sporty.domain.PulseCloudUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/pcuser", produces = MediaType.APPLICATION_JSON_VALUE)
public class PulseCloudUserController {

    @Autowired
    private PulseCloudUserRepo pulseCloudUserRepo;

    @RequestMapping(value = "/listAdmin", method = RequestMethod.GET)
    public List<PulseCloudUserDisplay> list() {
        List<PulseCloudUser> userList = pulseCloudUserRepo.findByUserid("ADMIN");

        List<PulseCloudUserDisplay> userDisplayList = new ArrayList<>();
        for (PulseCloudUser user : userList) {
            PulseCloudUserDisplay pulseCloudUserDisplay = new PulseCloudUserDisplay();
            pulseCloudUserDisplay.setAccountId(user.getAccountCode());
            pulseCloudUserDisplay.setUserId(user.getUserid());
            pulseCloudUserDisplay.setFirstName(user.getFirstname());
            pulseCloudUserDisplay.setLastName(user.getLastname());
            pulseCloudUserDisplay.setActive(user.getActive().equals("t") ? "True" : "False");
            userDisplayList.add(pulseCloudUserDisplay);
        }

        return userDisplayList;
    }
}
