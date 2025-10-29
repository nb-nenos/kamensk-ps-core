package com.pscore.services;

import com.pscore.dtos.SafePayResponse;
import com.pscore.utils.UserUtils;
import org.springframework.stereotype.Service;

@Service
public class safePayService {

    public SafePayResponse GetSafePayUserId(String email) {
        Long safePayUserId = UserUtils.generateSafePayUserId();
        return new SafePayResponse(safePayUserId);
    }
}
