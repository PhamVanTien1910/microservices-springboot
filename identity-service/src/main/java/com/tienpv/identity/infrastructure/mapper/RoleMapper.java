package com.tienpv.identity.infrastructure.mapper;

import com.tienpv.identity.application.dto.request.RoleRequest;
import com.tienpv.identity.application.dto.response.RoleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.tienpv.identity.domain.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
