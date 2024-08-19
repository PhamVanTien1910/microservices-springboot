package com.tienpv.identity.infrastructure.mapper;

import com.tienpv.identity.application.dto.request.ProfileCreationRequest;
import com.tienpv.identity.application.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    ProfileCreationRequest toProfileCreation(UserCreationRequest request);
}
