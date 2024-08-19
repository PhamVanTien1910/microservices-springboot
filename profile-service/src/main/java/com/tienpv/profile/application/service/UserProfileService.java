package com.tienpv.profile.application.service;

import com.tienpv.profile.application.dto.request.ProfileCreationRequest;
import com.tienpv.profile.application.dto.response.UserProfileResponse;
import com.tienpv.profile.domain.entity.UserProfile;
import com.tienpv.profile.infrastructure.mapper.UserProfileMapper;
import com.tienpv.profile.domain.repository.UserProfileRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class UserProfileService {
    UserProfileRepository userProfileRepository;
    UserProfileMapper userProfileMapper;
    public UserProfileResponse createProfile(ProfileCreationRequest request){
        UserProfile userProfile = userProfileMapper.toEntity(request);

        userProfile = userProfileRepository.save(userProfile);

        return userProfileMapper.toDTo(userProfile);
    }
    public UserProfileResponse getProfile(String id){
        UserProfile userProfile = userProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profile not found"));

        return userProfileMapper.toDTo(userProfile);

    }

}
