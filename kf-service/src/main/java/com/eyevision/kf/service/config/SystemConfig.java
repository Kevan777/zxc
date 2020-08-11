/*
 * Copyright(C) 2018 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.config;

import com.eyevision.framework.common.util.StringUtil;

/**
 * Description
 *
 * @author chenys
 * @since 2018-05-02 16:16
 */
//@Configuration
//@ConfigurationProperties("project")
public class SystemConfig {
    private String env;
    private String mobileClientDomain;
    private String adminClientDomain;
    private String serverDomain;

    public String getMobileClientDomain(String code, String businessDomain) {
        String res;
        if (StringUtil.isNotNull(businessDomain)) {
            res = "http://" + businessDomain;
        } else {
            res = mobileClientDomain.replace("#site_code#", code);
        }
        return res;
    }

    public String getAdminClientDomain(String code, String businessDomain) {
        String res;
        if (StringUtil.isNotNull(businessDomain)) {
            res = "http://admin." + businessDomain;
        } else {
            res = adminClientDomain.replace("#site_code#", code);
        }
        return res;
    }

    public String getEnv() {
        return env;
    }
    public void setEnv(String env) {
        this.env = env;
    }
    public void setMobileClientDomain(String mobileClientDomain) {
        this.mobileClientDomain = mobileClientDomain;
    }
    public void setAdminClientDomain(String adminClientDomain) {
        this.adminClientDomain = adminClientDomain;
    }
    public String getServerDomain() {
        return serverDomain;
    }
    public void setServerDomain(String serverDomain) {
        this.serverDomain = serverDomain;
    }
}
