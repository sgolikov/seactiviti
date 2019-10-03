package ru.sgolikov.activiti.se.impl;

import org.activiti.api.process.model.IntegrationContext;
import org.activiti.api.process.runtime.connector.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service(value = "callApiTaskImpl")
public class CallApiTaskImplConnector implements Connector {
	private Logger logger = LoggerFactory.getLogger(CallApiTaskImplConnector.class);

	@Override
	public IntegrationContext execute(IntegrationContext executionContext) {
		logger.info("Some service task CallApiTaskImpl logic... [processInstanceId=" + executionContext.getProcessInstanceId() + "]");

		return executionContext;
	}
}
