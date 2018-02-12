package com.sporty.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PulseCloudUserId implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private Long accountid;
    private Long usernumid;

    public Long getAccountid() { return accountid; }

    public void setAccountid(Long accountid) { this.accountid = accountid; }

    public Long getUsernumid() { return usernumid; }

    public void setUsernumid(Long usernumid) { this.usernumid = usernumid; }

}
