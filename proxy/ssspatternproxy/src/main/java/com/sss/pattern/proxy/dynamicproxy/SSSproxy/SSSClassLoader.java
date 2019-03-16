package com.sss.pattern.proxy.dynamicproxy.SSSproxy;

import java.io.*;

/**
 * Created by Pactera on 2019/3/16.
 */
public class SSSClassLoader extends ClassLoader {

    private File classPathFile;

    public SSSClassLoader() {
        String classPath = SSSClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = SSSClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
                File classFile = new File(classPathFile,name.replaceAll("\\.","/") + ".class");
                if(classFile.exists()) {
                    FileInputStream fis = null;
                    ByteArrayOutputStream bos = null;
                    try {
                        fis = new FileInputStream(classFile);
                        bos = new ByteArrayOutputStream();
                        byte[] buff = new byte[1024];
                        int len;
                        while((len = fis.read(buff)) != -1) {
                            bos.write(buff,0,len);
                        }
                        return defineClass(className, bos.toByteArray(),0,bos.size());
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                    }

                }
        }

        return null;
    }
}
