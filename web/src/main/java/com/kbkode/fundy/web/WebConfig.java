package com.kbkode.fundy.web;

import com.kbkode.fundy.security.SecureConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @date 24-May-2021
 * @author kbibby
 */
@Configuration
@Import( { MvcConfig.class, SecureConfig.class } )
public class WebConfig {

}
