package com.app.location.service.mapper;

import com.app.location.domain.HouseDomain;
import com.app.location.service.dto.HouseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HouseMapper extends EntityMapper<HouseDTO, HouseDomain>{
}
