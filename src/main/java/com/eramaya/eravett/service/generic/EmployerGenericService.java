
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.EmployerRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployerGenericService
    extends GenericService<com.eramaya.eravett.model.entity.Employer, Integer, EmployerRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.Employer entity) {
        return entity.getEmployerId();
    }

}
