package com.te.springannotations.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Employee2Config.class})
@ComponentScan("com.te.springannotations.beans")
public class AllImports {

}
