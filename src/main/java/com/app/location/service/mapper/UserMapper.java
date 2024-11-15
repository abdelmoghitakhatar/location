package com.app.location.service.mapper;

import com.app.location.domain.UserDomain;
import com.app.location.service.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, UserDomain>{
}
