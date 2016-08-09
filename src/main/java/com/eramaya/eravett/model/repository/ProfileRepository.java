
package com.eramaya.eravett.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eramaya.eravett.model.entity.Profile;

public interface ProfileRepository
    extends JpaRepository<Profile, Integer>
{

  Profile findByUserUsername(String username);
}
