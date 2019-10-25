package com.example.demo;

import java.time.Instant;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {
	
	// Online create cron job expression http://www.cronmaker.com

	@Scheduled(fixedRate = 1000)
	public void scheduleTaskFixedRate()
	{
		System.out.println("scheduleTaskFixedRate : Runs Every 1 sec : "+Instant.now().toString());
	}
	
	@Scheduled(initialDelay = 10000,  fixedRate = 3000)
	public void scheduleTaskInitialDelayFixedRate()
	{
		System.out.println("scheduleTaskInitialDelayFixedRate : Initial Wait For 10 sec Then Runs Every 3 sec : "+Instant.now().toString());
	}

	
	@Scheduled(cron = "*/5 * * * * *")
	public void scheduleTaskCron()
	{
		System.out.println("scheduleTaskCron : Runs Every 5 sec : "+Instant.now().toString());
	}

}
