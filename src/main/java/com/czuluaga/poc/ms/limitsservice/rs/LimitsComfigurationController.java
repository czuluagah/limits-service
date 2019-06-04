package com.czuluaga.poc.ms.limitsservice.rs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czuluaga.poc.ms.limitsservice.config.ConfigurationUtil;
import com.czuluaga.poc.ms.limitsservice.model.LimitConfiguration;

@RestController
public class LimitsComfigurationController {
	
	@Autowired
	private ConfigurationUtil configUtil;
	
	@GetMapping("/limits/config")
	public LimitConfiguration getConfiguration() {
		return new LimitConfiguration(configUtil.getMinimun(), configUtil.getMaximun());
	}
}
