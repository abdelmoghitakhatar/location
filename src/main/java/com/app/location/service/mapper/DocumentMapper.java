package com.app.location.service.mapper;

import com.app.location.domain.DocumentDomain;
import com.app.location.service.dto.DocumentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentMapper extends EntityMapper<DocumentDTO, DocumentDomain> {
}
