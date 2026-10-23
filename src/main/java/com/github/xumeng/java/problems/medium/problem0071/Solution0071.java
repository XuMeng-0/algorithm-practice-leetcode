package com.github.xumeng.java.problems.medium.problem0071;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution0071 {

    public String simplifyPath(String path) {
        String canonicalPath = replaceDoubleSlash(path);
        List<String> directories = splitPath(canonicalPath);
        removePointDirectory(directories);
        removeDoublePointDirectory(directories);
        canonicalPath = buildPath(directories);
        if (canonicalPath.length() > 1 && canonicalPath.endsWith("/")) {
            canonicalPath = canonicalPath.substring(0, canonicalPath.length() - 1);
        }
        if (!canonicalPath.startsWith("/")) {
            canonicalPath = "/" + canonicalPath;
        }
        return canonicalPath;
    }

    private String replaceDoubleSlash(String path) {
        while (path.contains("//")) {
            path = path.replace("//", "/");
        }
        return path;
    }

    private List<String> splitPath(String path) {
        Stream<String> stream = Arrays.stream(path.split("/"));
        return stream.collect(Collectors.toCollection(ArrayList::new));
    }

    private void removePointDirectory(List<String> directories) {
        for (int i = directories.size() - 1; i >= 0 && !directories.isEmpty(); i--) {
            String directory = directories.get(i);
            if (".".equals(directory)) {
                directories.remove(i);
            }
        }
    }

    private void removeDoublePointDirectory(List<String> directories) {
        int count = 0;
        for (int i = directories.size() - 1; i > 0 && !directories.isEmpty(); i--) {
            String directory = directories.get(i);
            if ("..".equals(directory)) {
                directories.remove(i);
                count++;
            } else if (count > 0) {
                directories.remove(i);
                count--;
            }
        }
    }

    private String buildPath(List<String> directories) {
        StringBuilder builder = new StringBuilder();
        for (String directory : directories) {
            builder.append(directory);
            builder.append("/");
        }
        return builder.toString();
    }

}
