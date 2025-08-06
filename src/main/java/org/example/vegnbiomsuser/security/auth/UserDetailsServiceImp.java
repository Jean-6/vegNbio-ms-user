package org.example.vegnbiomsuser.security.auth;

import lombok.extern.slf4j.Slf4j;
import org.example.vegnbiomsuser.model.User;
import org.example.vegnbiomsuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * This service has the responsibility to loads user from database
 */
@Slf4j
@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info(">> User Details Service ");
        User user = userRepository.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("User not found"));
        log.debug(">> loadUserByUsername {}",  user.toString());
        return UserDetailsImp.build(user);

    }
}
