package ru.sgolikov.activiti.se;

import org.activiti.api.process.model.IntegrationContext;
import org.activiti.api.process.runtime.connector.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service(value = "serviceTask1Impl")
public class ServiceTask1Connector implements Connector {
	private Logger logger = LoggerFactory.getLogger(ServiceTask1Connector.class);

	@Override
	public IntegrationContext execute(IntegrationContext executionContext) {
		logger.info("Some service task logic... [processInstanceId=" + executionContext.getProcessInstanceId() + "]");

		return executionContext;
	}
}
