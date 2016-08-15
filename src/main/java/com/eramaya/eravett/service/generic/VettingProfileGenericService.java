
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.VettingProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class VettingProfileGenericService
    extends GenericService<com.eramaya.eravett.model.entity.VettingProfile, Integer, VettingProfileRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.VettingProfile entity) {
        return entity.getVettingProfileId();
    }

}
