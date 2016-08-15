
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.VettingStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class VettingStatusGenericService
    extends GenericService<com.eramaya.eravett.model.entity.VettingStatus, Integer, VettingStatusRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.VettingStatus entity) {
        return entity.getVettingStatusId();
    }

}
