/*
 * Copyright(C) 2019 Guangdong Eyevision Medical Technology
 * Company Limited. All rights reserved.
 * The software is developed by Eyevision. Using, reproducing,
 * modification and distribution are prohibited without
 * Eyevision's permission.
 */

package com.eyevision.kf.service.util;

import com.eyevision.framework.common.util.DateUtil;
import com.eyevision.framework.common.util.RandomUtil;
import org.slf4j.Logger;

import java.util.Date;

/**
 * Description
 *
 * @author huzq
 * @since 2019-04-25 21:42
 */
public class YunjkUtil {

    /**
     * @param prefix
     * @param loginName
     * @return 编号（前缀位数+18位）
     */
    public static String getSerialNum(String prefix, String loginName) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        sb.append(DateUtil.toStr(new Date(), "MMdd"));// 月+日 4位
        // 时间戳后8位，后8位保证了24小时内不重复
        String timeInfo = System.currentTimeMillis() + "";
        sb.append(timeInfo.substring(timeInfo.length() - 8));
        String suffix = loginName.substring(loginName.length() - 4);// 账号标识后4位
        for (char c : suffix.toCharArray()) {
            sb.append(Character.getNumericValue(c) % 10);
        }
        sb.append(RandomUtil.getNum(2));// 随机码2位
        return sb.toString();
    }

    /**
     * @param value
     * @return
     */
    public static String toLikeSql(String value) {
        return "%" + value + "%";
    }

    /**
     * @param goods
     * @return
     */
    public static String getNameByGoods(String goods) {
        if (goods.contains("#")) {
            return goods.substring(0, goods.lastIndexOf("#"));
        }
        return goods;
    }

    /**
     * @param goods
     * @return
     */
    public static String getNormByGoods(String goods) {
        if (goods.contains("#")) {
            return goods.substring(goods.lastIndexOf("#") + 1);
        }
        return goods;
    }

    /**
     * @param action
     * @param logger
     */
    public static void unblockAction(Runnable action, Logger logger) {
        try {
            action.run();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}
