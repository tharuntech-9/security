package com.paytmoauth.api;

import java.util.Date;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paytmoauth.domain.MerchantPayRequest;
import com.paytmoauth.domain.MerchantPayResponse;

@RestController
@RequestMapping("/api/wallet")
public class PayTMWallerApiController {

	@PostMapping(value = "/merchantPay", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public MerchantPayResponse merchantPay(MerchantPayRequest payRequest) {
		MerchantPayResponse payResponse = null;
		
		payResponse = new MerchantPayResponse();
		payResponse.setTransactionNo(UUID.randomUUID().toString());
		payResponse.setTransactionDate(new Date());
		payResponse.setPayTMAccountNo(payRequest.getPayTMAccountNo());
		payResponse.setMerchantAccountNo(payRequest.getMerchantAccountNo());
		payResponse.setAmount(payRequest.getAmount());
		payResponse.setStatus("success");
		return payResponse;
	}

}
