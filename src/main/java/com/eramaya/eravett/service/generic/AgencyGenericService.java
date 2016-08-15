
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.AgencyRepository;
import org.springframework.stereotype.Service;

@Service
public class AgencyGenericService
    extends GenericService<com.eramaya.eravett.model.entity.Agency, Integer, AgencyRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.Agency entity) {
        return entity.getAgencyId();
    }

}
