
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleGenericService
    extends GenericService<com.eramaya.eravett.model.entity.Role, String, RoleRepository>
{


    public String getID(com.eramaya.eravett.model.entity.Role entity) {
        return entity.getRoleId();
    }

}
