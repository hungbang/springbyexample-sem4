package com.microsoft.repository;

import com.microsoft.entity.GroupVariants;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GroupVariantsRepository extends JpaRepository<GroupVariants, Long>{
    GroupVariants findByGroupId(Long id);
}
