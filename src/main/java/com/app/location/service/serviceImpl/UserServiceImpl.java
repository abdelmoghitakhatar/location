package com.app.location.service.serviceImpl;

import com.app.location.repository.UserRepository;
import com.app.location.service.UserService;
import com.app.location.service.dto.UserDTO;
import com.app.location.service.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO getInformation() {
        log.debug("\n-----------\n-----------\n-----------\nthe id : {} \n-----------\n-----------\n-----------\n", userRepository.findAll().get(0).getId());
        return userMapper.toDto(userRepository.findAll().get(0));
    }
}
