package com.imooc.sell.service;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * created by Leo徐忠春
 * created Time 2020/1/8-21:31
 * email 1437665365@qq.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void  test(){
        log.debug("debug ...");
        log.info("info ...");
        log.error("error ...");
        String name = "xuzhongchun";
        String address = "hubei";
        log.info("name={},address={}",name,address);
    }
}
