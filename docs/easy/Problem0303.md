# 303. 区域和检索 - 数组不可变

> &zwnj;**原题链接**&zwnj;: https://leetcode.cn/problems/range-sum-query-immutable  
> &zwnj;**难度**&zwnj;: 简单

## 题目描述

给定一个整数数组 nums，处理以下类型的多个查询:

- 计算索引 left 和 right （包含 left 和 right）之间的 nums 元素的 和 ，其中 left <= right

实现 NumArray 类：

- NumArray(int[] nums) 使用数组 nums 初始化对象
- int sumRange(int left, int right) 返回数组 nums 中索引 left 和 right 之间的元素的 总和 ，
  包含 left 和 right 两点（也就是 nums[left] + nums[left + 1] + ... + nums[right] )

## 解题思路

求 left - right 区间的所有元素之和