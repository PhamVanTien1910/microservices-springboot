package com.tienpv.identity.infrastructure.mapper;

import com.tienpv.identity.application.dto.request.UserCreationRequest;
import com.tienpv.identity.application.dto.request.UserUpdateRequest;
import com.tienpv.identity.application.dto.response.UserResponse;
import com.tienpv.identity.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
