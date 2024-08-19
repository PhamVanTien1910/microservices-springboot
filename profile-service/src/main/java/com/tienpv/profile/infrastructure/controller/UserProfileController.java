package com.tienpv.profile.infrastructure.controller;

import com.tienpv.profile.application.dto.request.ProfileCreationRequest;
import com.tienpv.profile.application.dto.response.UserProfileResponse;
import com.tienpv.profile.application.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {

    UserProfileService userProfileService;
    @PostMapping("/users")
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest request){
       return userProfileService.createProfile(request);

    }

    @GetMapping("/{profile_id}")
    UserProfileResponse getProfile(@PathVariable String profileId){
        return userProfileService.getProfile(profileId);

    }
}
