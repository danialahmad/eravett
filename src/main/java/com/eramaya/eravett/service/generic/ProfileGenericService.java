
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileGenericService
    extends GenericService<com.eramaya.eravett.model.entity.Profile, Integer, ProfileRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.Profile entity) {
        return entity.getProfileId();
    }

}
