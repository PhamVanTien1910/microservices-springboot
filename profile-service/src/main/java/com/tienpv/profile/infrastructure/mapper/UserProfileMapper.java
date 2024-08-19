package com.tienpv.profile.infrastructure.mapper;

import com.tienpv.profile.application.dto.request.ProfileCreationRequest;
import com.tienpv.profile.application.dto.response.UserProfileResponse;
import com.tienpv.profile.domain.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toEntity(ProfileCreationRequest request);
    UserProfileResponse toDTo(UserProfile entity);
}
