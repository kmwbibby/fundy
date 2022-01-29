package com.kbkode.fundy;

import com.kbkode.fundy.web.WebConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration( classes = { WebConfig.class } )
class FundyApplicationTests {

    @Test
    void contextLoads() {
    }

}
