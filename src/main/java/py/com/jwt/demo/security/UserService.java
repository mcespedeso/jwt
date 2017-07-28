package py.com.jwt.demo.security;


import py.com.jwt.demo.entity.User;

import java.util.Optional;

/**
 * 
 * @author vladimir.stankovic
 *
 * Aug 17, 2016
 */
public interface UserService {
    public Optional<User> getByUsername(String username);
}
