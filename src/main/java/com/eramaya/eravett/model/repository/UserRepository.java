
package com.eramaya.eravett.model.repository;

import com.eramaya.eravett.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
    extends JpaRepository<User, String>
{


}
