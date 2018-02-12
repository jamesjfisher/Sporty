package com.sporty.repo;

import com.sporty.domain.PulseCloudUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PulseCloudUserRepo extends JpaRepository<PulseCloudUser, Long> {
    public List<PulseCloudUser> findAll();

    public List<PulseCloudUser> findByUserid(String userId);

}
