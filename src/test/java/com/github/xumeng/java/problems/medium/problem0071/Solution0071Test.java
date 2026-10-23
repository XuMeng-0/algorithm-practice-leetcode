package com.github.xumeng.java.problems.medium.problem0071;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0071Test {

    private final Solution0071 solution = new Solution0071();

    @Test
    public void test1() {
        String path = "/home/";
        String canonicalPath = solution.simplifyPath(path);
        String expected = "/home";
        assertEquals(expected, canonicalPath);
    }

    @Test
    public void test2() {
        String path = "/home//foo/";
        String canonicalPath = solution.simplifyPath(path);
        String expected = "/home/foo";
        assertEquals(expected, canonicalPath);
    }

    @Test
    public void test3() {
        String path = "/home/user/Documents/../Pictures";
        String canonicalPath = solution.simplifyPath(path);
        String expected = "/home/user/Pictures";
        assertEquals(expected, canonicalPath);
    }

    @Test
    public void test4() {
        String path = "/../";
        String canonicalPath = solution.simplifyPath(path);
        String expected = "/";
        assertEquals(expected, canonicalPath);
    }

    @Test
    public void test5() {
        String path = "/.../a/../b/c/../d/./";
        String canonicalPath = solution.simplifyPath(path);
        String expected = "/.../b/d";
        assertEquals(expected, canonicalPath);
    }

    @Test
    public void test6() {
        String path = "/";
        String canonicalPath = solution.simplifyPath(path);
        String expected = "/";
        assertEquals(expected, canonicalPath);
    }

    @Test
    public void test7() {
        String path = "/a/./b/../../c/";
        String canonicalPath = solution.simplifyPath(path);
        String expected = "/c";
        assertEquals(expected, canonicalPath);
    }

    @Test
    public void test8() {
        String path = "/a/../../b/../c//.//";
        String canonicalPath = solution.simplifyPath(path);
        String expected = "/c";
        assertEquals(expected, canonicalPath);
    }

    @Test
    public void test9() {
        String path = "/a//b////c/d//././/..";
        String canonicalPath = solution.simplifyPath(path);
        String expected = "/a/b/c";
        assertEquals(expected, canonicalPath);
    }

}