
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressGenericService
    extends GenericService<com.eramaya.eravett.model.entity.Address, Integer, AddressRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.Address entity) {
        return entity.getId();
    }

}
