package com.campusdual.musiquea.model.core.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import com.campusdual.musiquea.model.core.dao.ViewersDao;

@Configuration
@EnableScheduling
public class SchCronServiceImpl implements SchedulingConfigurer {

	@Autowired
	private ViewersDao viewersDao;

	@Scheduled(cron = "0 0 0 1 * ?")
	private void resetCounter() throws Exception {

		Map<String, Object> attrMap = new HashMap<String, Object>();
		attrMap.put(ViewersDao.ATTR_COUNT_VIEWERS, 0);
		this.viewersDao.unsafeUpdate(attrMap, new HashMap<String, Object>());

	}

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(this.taskExecutor());
	}

	@Bean(destroyMethod = "shutdown")
	public Executor taskExecutor() {
		return Executors.newScheduledThreadPool(100);
	}
}