
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserGenericService
    extends GenericService<com.eramaya.eravett.model.entity.User, String, UserRepository>
{


    public String getID(com.eramaya.eravett.model.entity.User entity) {
        return entity.getUsername();
    }

}
