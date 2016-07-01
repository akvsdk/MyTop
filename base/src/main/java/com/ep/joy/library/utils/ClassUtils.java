package com.ep.joy.library.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * author  Joy
 * Date:  2016/6/19 0019.
 * version:  V1.0
 * Description:
 */
public class ClassUtils {
    public static <T> Class<T> getGenericClass(Class<?> klass) {
        Type type = klass.getGenericSuperclass();
        if (type == null || !(type instanceof ParameterizedType)) return null;
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] types = parameterizedType.getActualTypeArguments();
        if (types == null || types.length == 0) return null;
        return (Class<T>) types[0];
    }

    /**
     *   判断JsonResult<T>中 是Array Or Obejct
     * @param type
     * @return
     */
    public static Class getType(Type type) {
        List<Type> typeList = new ArrayList<>();
        while (!(type instanceof Class)) {
            ParameterizedType ptype = (ParameterizedType) type;
            Type[] types = ptype.getActualTypeArguments();
            if (types.length > 0) {
                typeList.add(((ParameterizedType) type).getRawType());
            }
            type = ptype.getActualTypeArguments()[0];

        }
        if (typeList.size() >= 2) {
            return List.class;
        } else {
            return Object.class;
        }
    }
    /**
     * 通过反射,获得定义Class时声明的父类的范型参数的类型. 如public BookManager extends
     * GenricManager<Book>
     *
     * @param clazz
     *            The class to introspect
     * @return the first generic declaration, or <code>Object.class</code> if
     *         cannot be determined
     */
    public static Class getSuperClassGenricType(Class clazz) {
        return getSuperClassGenricType(clazz, 0);
    }

    /**
     * 通过反射,获得定义Class时声明的父类的范型参数的类型. 如public BookManager extends
     * GenricManager<Book>
     *
     * @param clazz
     *            clazz The class to introspect
     * @param index
     *            the Index of the generic ddeclaration,start from 0.
     */

    public static Class getSuperClassGenricType(Class clazz, int index)
            throws IndexOutOfBoundsException {

        Type genType = clazz.getGenericSuperclass();

        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        }

        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

        if (index >= params.length || index < 0) {
            return Object.class;
        }
        if (!(params[index] instanceof Class)) {
            return Object.class;
        }
        return (Class) params[index];
    }
}
