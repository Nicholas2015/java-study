package com.study.java.pattern.composite.demo.safe;

public class Test {

    public static void main(String[] args) {
        System.out.println("=============Safe Model================");

        File wx = new File("Wechat.exe");
        File qq = new File("QQ.exe");

        Folder office = new Folder("办公软件",2);
        File word = new File("Word.exe");
        File ppt = new File("Ppt.exe");
        File excel = new File("Excel.exe");

        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder root = new Folder("根目录", 1);
        root.add(wx);
        root.add(qq);
        root.add(office);

        root.show();


        root.list();
    }
}
