package com.bmzlzl.designpattern.prototype;

import java.io.*;

/**
 * 深克隆:通过序列化的方式实现
 *
 * @author jagger
 * @create 2019-12-24 14:38
 **/
public class MyFile3 implements Serializable {
    public static final long serialVersionUID = 42L;
    private String path;
    private Info info;

    public MyFile3(String path, Info info) {
        this.path = path;
        this.info = info;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != getClass()) {
            return false;
        }

        MyFile3 temp = (MyFile3) obj;
        if (path == null) {
            if (temp.path != null) {
                return false;
            }
        } else if (!path.equals(temp.path)) {
            return false;
        }

        if (info == null) {
            if (temp.info != null) {
                return false;
            }
        } else if (!info.equals(temp.info)) {
            return false;
        }
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        try (ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Info info = new Info(2, "Hello world.");
        MyFile3 file1 = new MyFile3("c:", info);
        MyFile3 file2 = (MyFile3) file1.clone();

        System.out.println(file1.getClass() == file2.getClass());//true
        System.out.println(file1 == file2);//false
        System.out.println(file1.equals(file2));//true
        System.out.println(file1.info.getClass() == file2.info.getClass());//true
        System.out.println(file1.info == file2.info);//false
        System.out.println(file1.info.equals(file2.info));//true
    }
}
