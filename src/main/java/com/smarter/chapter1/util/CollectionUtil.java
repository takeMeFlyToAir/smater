package com.smarter.chapter1.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * Created by sjgtw-zzr on 2017/10/18.
 * 集合工具类
 */
public class CollectionUtil {

    /**
     * 判断Collection是否为空
     */
    public static boolean isEmpty(Collection<?> collection){
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * 判断Collection是否非空
     */
    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    /**
     * 判断Map是否为空
     */
    public static boolean isEmpty(Map<?,?> collection){
        return MapUtils.isEmpty(collection);
    }

    /**
     * 判断Map是否非空
     */
    public static boolean isNotEmpty(Map<?,?> collection){
        return !isEmpty(collection);
    }
}
