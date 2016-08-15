
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.VettingOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class VettingOrderGenericService
    extends GenericService<com.eramaya.eravett.model.entity.VettingOrder, Integer, VettingOrderRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.VettingOrder entity) {
        return entity.getVettingOrderId();
    }

}
