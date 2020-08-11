/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.common;

import java.math.BigDecimal;

/**
 * Description
 *
 * @author chenys
 * @since 2018-11-19 21:09
 */
public class SystemConstant {
  //  public static final String AUTHORITY_FILE_PATH = com.kfexample.common.SystemConstant.class.getResource("/").getPath() + "data/authority.json";
    public static final Boolean IS_MAIN_SERVER;
    public static final Integer SEQUENCE_WORKER_ID;
    public static final Integer  SEQUENCE_DATACENTER_ID;
    public static final BigDecimal DEFAULT_FREIGHT = BigDecimal.valueOf(8);
  //  public static final String REGION_PATH = "/config/region.json";

    static {
       // Properties prop = new Properties();
        //PropertiesUtil.loadByClassPath(prop, "/config/custom.properties");
        IS_MAIN_SERVER = false;
        SEQUENCE_WORKER_ID = 0;
        SEQUENCE_DATACENTER_ID = 0;
    }
}
