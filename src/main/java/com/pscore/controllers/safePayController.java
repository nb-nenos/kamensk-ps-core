package com.pscore.controllers;

import com.pscore.dtos.SafePayResponse;
import com.pscore.services.safePayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v2/registration")
public class safePayController {

    private final safePayService safePayService;

    @GetMapping("/safe-pay/{email}")
    public SafePayResponse getSafePayUserId(@PathVariable String email) {
        return safePayService.GetSafePayUserId(email);
    }
}
