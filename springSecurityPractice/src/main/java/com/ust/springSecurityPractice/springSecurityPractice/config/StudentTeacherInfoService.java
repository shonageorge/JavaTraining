package com.ust.springSecurityPractice.springSecurityPractice.config;

import com.ust.springSecurityPractice.springSecurityPractice.model.StudentTeacherInfo;
import com.ust.springSecurityPractice.springSecurityPractice.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class StudentTeacherInfoService implements UserDetailsService {

    @Autowired
    private InfoRepository infoRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<StudentTeacherInfo> userInfo = infoRepo.findByName(username);
        return userInfo.map(StudentTeacherInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));
    }
}
