package com.ca_bpy;

/**
 * IMavenDemo Interface implementation class.
 */
public class MavenDemo implements IMavenDemo <String> {

    @Override
    public String show(String str) {
        System.out.println("show:" + str);
        return str;
    }
}