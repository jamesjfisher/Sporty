package com.sporty.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "global_announcement")
public class GlobalAnnouncement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long announcementid;
    private Date startdate;
    private Date enddate;
    private String message;

    public Long getAnnouncementid() { return announcementid; }

    public void setAnnouncementid(Long announcementid) { this.announcementid = announcementid; }

    public Date getStartdate() { return startdate; }

    public void setStartdate(Date startdate) { this.startdate = startdate; }

    public Date getEnddate() { return enddate; }

    public void setEnddate(Date enddate) { this.enddate = enddate; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

}
