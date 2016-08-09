
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.FileBlobRepository;
import org.springframework.stereotype.Service;

@Service
public class FileBlobGenericService
    extends GenericService<com.eramaya.eravett.model.entity.FileBlob, Integer, FileBlobRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.FileBlob entity) {
        return entity.getId();
    }

}
