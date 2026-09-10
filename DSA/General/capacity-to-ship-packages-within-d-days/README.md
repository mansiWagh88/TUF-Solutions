# [Capacity to Ship Packages Within D Days](https://takeuforward.org/plus/dsa/problems/capacity-to-ship-packages-within-d-days?source=strivers-a2z-dsa-track&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

You are given an array weights where **weights[i]** represents the weight of the **i-th package** on a conveyor belt. All the packages must be shipped in the order given from one port to another within days days.

Each day, the ship can carry a **contiguous sequence of packages** , as long as the total weight does **not exceed** its maximum capacity.

Your task is to find the **minimum possible capacity** of the ship so that all packages can be shipped within the given number of days.

### Example 1

<p>

**Input:** weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], days = 5</p><p>

**Output:** 15</p><p>

**Explanation:** </p>Minimum ship **capacity = 15** . One way to ship in 5 days:

- Day 1: 1 + 2 + 3 + 4 + 5 = 15
- Day 2: 6 + 7 = 13
- Day 3: 8
- Day 4: 9
- Day 5: 10

No day exceeds **capacity 15** and all packages are shipped in order in **5 days** .

### Example 2

<p>

**Input:** weights = [3, 2, 2, 4, 1, 4], days = 3</p><p>

**Output:** 6</p><p>

**Explanation:** </p>One possible division with **capacity 6:**

- Day 1: 3 + 2 = 5
- Day 2: 2 + 4 = 6
- Day 3: 1 + 4 = 5

All packages shipped in order within **3 days** .

### Example 3

<p>

**Input:** weights = [10, 50, 50, 10], days = 2</p>Output:

60

### Constraints

- 1 <= days <= weights.length <= 5 * 10⁴
- 1 <= weights[i] <= 500

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
