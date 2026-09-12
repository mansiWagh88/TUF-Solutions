# [Kth Missing Positive Number](https://takeuforward.org/plus/dsa/problems/kth-missing-positive-number?source=strivers-a2z-dsa-track&tab=submissions&approach=optimal)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given a sorted array of unique positive integers **arr** , your task is to return the **kᵗʰ** missing positive number that is not present in arr.

The array is guaranteed to be **strictly increasing** , and the missing numbers are those positive integers that do not appear in **arr** but would appear in a full sequence starting from 1.

### Example 1

<p>

**Input:** arr = [3, 5, 7, 10], k = 6</p> **Output: 9**

<p>

**Explanation:** </p>The missing numbers are [1, 2, 4, 6, 8, 9, 11, ...]. The 6ᵗʰ missing number is 9.

### Example 2

<p>

**Input:** arr = [1, 4, 6, 8, 9], k = 3</p><p>

**Output:** 5</p><p>

**Explanation:** </p>The missing numbers are [2, 3, 5, 7, 10, ...]. The 3ʳᵈ missing number is 5.

### Constraints

- 1 <= arr.length <= 1000
- 1 <= arr[i] <= 1000
- 1 <= k <= 1000
- arr[i] < arr[j] for all 1 <= i < j <= arr.length

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
