
package com.eramaya.eravett.model.repository;

import com.eramaya.eravett.model.entity.FileBlob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileBlobRepository
    extends JpaRepository<FileBlob, Integer>
{


}
