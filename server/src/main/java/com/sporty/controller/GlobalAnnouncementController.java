package com.sporty.controller;

import com.sporty.domain.GlobalAnnouncement;
import com.sporty.repo.GlobalAnnouncementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/globalannouncement", produces = MediaType.APPLICATION_JSON_VALUE)
public class GlobalAnnouncementController {

    @Autowired
    private GlobalAnnouncementRepo globalAnnouncementRepo;

    @GetMapping(value = "/list")
    public List<GlobalAnnouncement> list() {
        return globalAnnouncementRepo.findAll();
    }

    @GetMapping(value = "/count")
    public Long count() {
        return globalAnnouncementRepo.count();
    }
}
