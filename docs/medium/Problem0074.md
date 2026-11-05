# 74. 搜索二维矩阵

> &zwnj;**原题链接**&zwnj;: https://leetcode.cn/problems/search-a-2d-matrix  
> &zwnj;**难度**&zwnj;: 中等

## 题目描述

给你一个满足下述两条属性的 m x n 整数矩阵：

- 每行中的整数从左到右按非严格递增顺序排列。
- 每行的第一个整数大于前一行的最后一个整数。

给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。

你必须编写一个时间复杂度为 O(log(m * n)) 的解决方案。

## 解题思路

找出 target 可能所在的行，找出这一行中找出和 target 相等的元素

由于需要 O(log(m * n)) 的时间复杂度，所以采用二分查找算法

1. 步骤一：比较 matrix[0][0] 和 target 的大小，如果 target 小于 matrix[0][0] ，则返回 false，否则执行下一步
2. 步骤二：找出 target 可能所在的行，比较 target 和 matrix 每行的第一个元素，需要满足的条件 target 大于前一个且小于后一个
3. 步骤三：在找出的行中，寻找和 target 相同的元素。能找到返回 true ，否则返回 false 