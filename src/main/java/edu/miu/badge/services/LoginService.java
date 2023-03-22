package edu.miu.badge.services;


import edu.miu.badge.dto.RequestUserDTO;
import edu.miu.badge.dto.ResponseMemberDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface LoginService extends UserDetailsService {
    public ResponseMemberDTO login(RequestUserDTO user);
    public RequestUserDTO getUserDetailsByUsername(String username);
}
