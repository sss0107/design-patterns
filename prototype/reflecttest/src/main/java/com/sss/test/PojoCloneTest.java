package com.sss.test;

import com.sss.test.entity.PojoTest;
import com.sss.test.entity.PojoTestClone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Pactera on 2019/3/12.
 */
public class PojoCloneTest {

    public static void main(String[] args) {
        PojoTest pojo = new PojoTest();
        pojo.setAge("1");
        pojo.setName("sss");
        pojo.setSex("f");
        try {
            PojoTestClone cloneTest = clone(pojo);
            System.out.println(cloneTest.getName());
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static PojoTestClone clone(PojoTest pojo) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        PojoTestClone cloneTest = new PojoTestClone();
        Method[] methods = pojo.getClass().getMethods();
        for(Method m : methods) {
        try {
            if (m.getName().startsWith("get")) {
                Object value = m.invoke(pojo,null);
                String targetMethodName = m.getName().replace("get","set");
                Method m1 = cloneTest.getClass().getMethod(targetMethodName,String.class);
                m1.invoke(cloneTest,value);
            }
        } catch(Exception e) {
            continue;
        }
        }
        return cloneTest;
    }
}
