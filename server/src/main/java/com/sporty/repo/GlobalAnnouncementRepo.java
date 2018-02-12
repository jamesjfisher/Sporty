package com.sporty.repo;

import com.sporty.domain.GlobalAnnouncement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface GlobalAnnouncementRepo extends JpaRepository<GlobalAnnouncement, Long> {
    public List<GlobalAnnouncement> findAll();
}
