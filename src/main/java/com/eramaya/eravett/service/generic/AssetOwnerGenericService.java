
package com.eramaya.eravett.service.generic;

import com.eramaya.eravett.model.repository.AssetOwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class AssetOwnerGenericService
    extends GenericService<com.eramaya.eravett.model.entity.AssetOwner, Integer, AssetOwnerRepository>
{


    public Integer getID(com.eramaya.eravett.model.entity.AssetOwner entity) {
        return entity.getAssetOwnerId();
    }

}
