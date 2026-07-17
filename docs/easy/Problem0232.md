# 232. 用栈实现队列

> &zwnj;**原题链接**&zwnj;: https://leetcode.cn/problems/implement-queue-using-stacks  
> &zwnj;**难度**&zwnj;: 简单

## 题目描述

请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：

实现 MyQueue 类：

- void push(int x) 将元素 x 推到队列的末尾
- int pop() 从队列的开头移除并返回元素
- int peek() 返回队列开头的元素
- boolean empty() 如果队列为空，返回 true ；否则，返回 false

说明：

- 只能 使用标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
- 语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。

## 解题思路

1. 步骤一：push() empty() 直接调用栈的方法即可
2. 步骤二：pop() peek() 借助辅助栈找出栈底的元素作为队列的第一个元素返回，然后将所有元素转移回原来的栈中

借助辅助栈找栈底元素：

1. 依次将每一个元素出栈，暂时保存在辅助栈中。每执行依次出栈操作后，检查栈是否空。
2. 栈空，则出栈的是栈底元素；否则继续执行出栈和检查，直到栈空为止。