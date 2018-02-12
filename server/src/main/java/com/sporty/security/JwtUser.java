package com.sporty.security;

import com.sporty.domain.User;
import org.springframework.security.core.authority.AuthorityUtils;

public class JwtUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public JwtUser(User user) {
        super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList("ADMIN"));
        this.user = user;
    }
    
    public User getUser() {
        return user;
    }
}
