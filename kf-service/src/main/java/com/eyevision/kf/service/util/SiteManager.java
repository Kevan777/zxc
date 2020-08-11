/*
 * Copyright(C) 2019 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.util;

import com.eyevision.framework.common.exception.ValidateException;
import com.eyevision.framework.spring.core.support.datasource.DynamicDataSource;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 *
 * @author chenys
 * @since 2019-02-18 15:28
 */
public class SiteManager {
    //private static final Map<String, WcoaOperatorVO> SITE_MAP = new HashMap<>();
    private static final ThreadLocal<String> SITE_CODE_LOCAL = new ThreadLocal<>();
    private static final String[] SQL_LOCATIONS = new String[] {"classpath:db/site"};
    private static final Map<String, String> DOMAIN_CODE_MAP = new HashMap<>();

    /**
     * 获取所有站点
     * @return
     */
  /*  public static Map<String, WcoaOperatorVO> initSiteMap() {
        if (SITE_MAP.isEmpty()) {
            synchronized (SiteManager.class) {
                if (SITE_MAP.isEmpty()) {
                    MgWcoaOperatorService mgWcoaOperatorService = SpringContextUtil.getBean(MgWcoaOperatorService.class);
                    List<WcoaOperatorVO> list = mgWcoaOperatorService.listEnable();
                    list.forEach(SiteManager::addSite);
                }
            }
        }
        return SITE_MAP;
    }*/

    /**
     * @param vo
     */
   /* public static void addSite(WcoaOperatorVO vo) {
        SITE_MAP.put(vo.getCode(), vo);
        if (StringUtil.isNotNull(vo.getBusinessDomain())) {
            DOMAIN_CODE_MAP.put(vo.getBusinessDomain(), vo.getCode());
        }
    }*/

    /**
     * 移除站点
     * @param code
     */
  /*  public static void removeSite(String code) {
        if (SITE_MAP.containsKey(code)) {
            SITE_MAP.remove(code);
            DOMAIN_CODE_MAP.remove(code);
            DataSource dataSource = DynamicDataSource.removeTargetDataSource(code);
            if (dataSource instanceof DruidDataSource) {
                ((DruidDataSource) dataSource).close();
            }
        }
    }
*/
    /**
     * 设置当前站点
     * @param code
     */
  /*  public static void setCode(String code) {
        WcoaOperatorVO vo = initSiteMap().get(code);
        if (vo != null) {
            if (DynamicDataSource.getTargetDataSource(code) == null) {
                DataSourceConfig dataSourceConfig = SpringContextUtil.getBean(DataSourceConfig.class);
                String url = siteDataSourceUrl(dataSourceConfig, code);
                DruidDataSource dataSource = new DruidDataSource();
                dataSource.setDriverClassName(dataSourceConfig.getDriverClassName());
                dataSource.setUrl(url);
                dataSource.setUsername(dataSourceConfig.getUsername());
                dataSource.setPassword(dataSourceConfig.getPassword());
                dataSource.setInitialSize(0); // 初始化连接数
                dataSource.setMaxActive(8); // 最大连接数
                dataSource.setMaxWait(60000); // 获取连接时最大等待时间（毫秒）
                DynamicDataSource.addTargetDataSource(code, dataSource);
                // 初始化数据库
                SystemConfig systemConfig = SpringContextUtil.getBean(SystemConfig.class);
                if (Env.isEnv(systemConfig.getEnv(), Env.TEST, Env.PROD)) {
                    FlywayUtil.migrate(dataSource, SQL_LOCATIONS);
                }
            }
            DynamicDataSource.setDataSource(code);
            SITE_CODE_LOCAL.set(code);
        }
    }*/

    /**
     * 获取站点数据库Url
     * @param dataSourceConfig
     * @param code
     * @return
     */
   /* public static String siteDataSourceUrl(DataSourceConfig dataSourceConfig, String code) {
        return String.format(dataSourceConfig.getUrlTpl(), dataSourceConfig.getHost(), dataSourceConfig.getPort(), siteDatabase(code, dataSourceConfig.getDatabase()));
    }*/

    /**
     * 获取站点数据库名
     * @param code
     * @param database
     * @return
     */
    public static String siteDatabase(String code, String database) {
        return database + "_" + code.toLowerCase();
    }

    /**
     * 获取当前站点
     * @param check
     * @return
     */
    public static String getCode(boolean check) {
        String code = SITE_CODE_LOCAL.get();
        if (check && code == null) {
            throw new ValidateException("获取站点编码失败，请联系管理员");
        }
        return code;
    }

    /**
     * 获取当前站点
     * @return
     */
    public static String getCode() {
        return getCode(true);
    }

    /**
     * 清除当前站点
     */
    public static void cleanCode() {
        SITE_CODE_LOCAL.remove();
        DynamicDataSource.cleanDataSource();
    }

    /**
     * 获取当前站点运营商配置
     * @return
     */
 /*   public static WcoaOperatorVO getOperator() {
        return initSiteMap().get(getCode());
    }*/

    /**
     * 获取当前站点ID
     * @return
     */
  /*  public static Long getSiteId() {
        return getOperator().getId();
    }

    *//**
     * @param domain
     * @return
     *//*
    public static String getCodeByDomain(String domain) {
        initSiteMap();
        return DOMAIN_CODE_MAP.get(domain);
    }

    *//**
     * @return
     *//*
    public static Set<String> getDomainSet() {
        initSiteMap();
        return DOMAIN_CODE_MAP.keySet();
    }*/
}
