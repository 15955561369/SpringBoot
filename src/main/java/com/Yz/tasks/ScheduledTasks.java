package com.Yz.tasks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
@Slf4j
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) //每五秒定时执行
    public void task01() {
        log.info("<<定时任务task01>> " + System.currentTimeMillis());
    }
}
