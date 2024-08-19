package com.tienpv.profile.domain.repository;

import com.tienpv.profile.domain.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserProfileRepository extends JpaRepository<UserProfile, String> {
}
