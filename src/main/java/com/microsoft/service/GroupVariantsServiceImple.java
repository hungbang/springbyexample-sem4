package com.microsoft.service;

import com.microsoft.entity.GroupVariants;
import com.microsoft.repository.GroupVariantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupVariantsServiceImple implements GroupVariantsService {

    @Autowired
    private GroupVariantsRepository groupVariantsRepository;

    @Override
    public GroupVariants getGroupVariantsByGroupId(Long id) {
        return groupVariantsRepository.findByGroupId(id);
    }
}
