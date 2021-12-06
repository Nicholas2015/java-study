package com.study.java.pattern.composite.demo.safe;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Directory {

    private List<Directory> dirs;

    private Integer level;

    public Folder(String name,Integer level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<>();
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for (Directory item : dirs) {
            if (this.level != null) {
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print(" ");
                }
                for (Integer i = 0; i < this.level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            item.show();
        }
    }

    public boolean add(Directory directory) {
        return this.dirs.add(directory);
    }

    public boolean remove(Directory directory) {
        return this.dirs.remove(directory);
    }

    public Directory get(int index) {
        return this.dirs.get(index);
    }

    public void list() {
        for (Directory dir : dirs) {
            System.out.println(dir.name);
        }
    }
}
