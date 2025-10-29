package com.pscore.utils;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class UserUtils {

    public Long generateSafePayUserId() {
        return Math.abs(UUID.randomUUID().getMostSignificantBits());
    }
}
