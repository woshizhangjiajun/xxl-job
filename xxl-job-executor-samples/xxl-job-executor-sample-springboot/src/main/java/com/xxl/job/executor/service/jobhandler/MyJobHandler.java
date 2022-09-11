package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
@Slf4j
public class MyJobHandler  {


    @XxlJob("myHandler")
    public void firstHandler() throws Exception
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        log.info("张佳珺的sl4j使用,当前的时间为:[{}]",format);
        System.out.println("我的第一个xxlJobHandler执行");
    }


}
