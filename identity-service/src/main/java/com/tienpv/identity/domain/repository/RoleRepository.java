package com.tienpv.identity.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienpv.identity.domain.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}
