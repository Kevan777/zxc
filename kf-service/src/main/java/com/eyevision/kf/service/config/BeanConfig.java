package com.eyevision.kf.service.config;

import com.eyevision.framework.common.support.idgen.IdGenerator;
import com.eyevision.framework.common.support.idgen.Sequence;
import com.eyevision.framework.common.support.idgen.SequenceGenerator;
import com.eyevision.kf.common.SystemConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public IdGenerator idGenerator() {
        Sequence sequence = new Sequence(SystemConstant.SEQUENCE_WORKER_ID, SystemConstant.SEQUENCE_DATACENTER_ID);
        return new SequenceGenerator(sequence);
    }

}
