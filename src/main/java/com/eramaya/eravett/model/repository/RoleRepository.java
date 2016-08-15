
package com.eramaya.eravett.model.repository;

import com.eramaya.eravett.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository
    extends JpaRepository<Role, String>
{


}
