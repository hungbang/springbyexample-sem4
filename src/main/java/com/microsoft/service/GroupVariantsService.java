package com.microsoft.service;


import com.microsoft.entity.GroupVariants;
import org.springframework.transaction.annotation.Transactional;

public interface GroupVariantsService {

    @Transactional(readOnly = true)
    public GroupVariants getGroupVariantsByGroupId(Long id);
}
