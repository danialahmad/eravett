
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.ProfileEmployerRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileEmployerGenericService
    extends GenericService<com.eramaya.eravett.model.entity.ProfileEmployer, Integer, ProfileEmployerRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.ProfileEmployer entity) {
        return entity.getId();
    }

}
