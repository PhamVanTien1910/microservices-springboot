package com.tienpv.identity.infrastructure.mapper;

import com.tienpv.identity.application.dto.request.PermissionRequest;
import com.tienpv.identity.application.dto.response.PermissionResponse;
import org.mapstruct.Mapper;

import com.tienpv.identity.domain.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
