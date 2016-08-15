
package com.eramaya.eravett.model.repository;

import com.eramaya.eravett.model.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository
    extends JpaRepository<Employer, Integer>
{


}
