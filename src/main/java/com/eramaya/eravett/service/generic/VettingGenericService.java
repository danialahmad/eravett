
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.VettingRepository;
import org.springframework.stereotype.Service;

@Service
public class VettingGenericService
    extends GenericService<com.eramaya.eravett.model.entity.Vetting, Integer, VettingRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.Vetting entity) {
        return entity.getVettingId();
    }

}
