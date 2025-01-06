
## What are various patterns of Binary Search on which questions are asked in CP?

- **Standard Binary Search**
    - **Pattern**: Search for a specific target in a sorted array.
    - **Question Types**:
        - Find an element in a sorted array.
        - Find the index of the first or last occurrence of the target.

- **Binary Search on Answer**
    - **Pattern**: Search for the minimum or maximum feasible value that satisfies a condition.
    - **Question Types**:
        - Minimize/maximize some quantity while meeting constraints.
        - Examples:
            - Minimum time to finish tasks (e.g., assigning jobs to workers).
            - Longest or shortest feasible distance (e.g., placing routers or dividing an array).

- **Binary Search with a Predicate Function**
    - **Pattern**: Search for the boundary where a predicate function transitions from `False` to `True` (or vice versa).
    - **Question Types**:
        - Search for the smallest index satisfying a condition.
        - Search for the largest value satisfying a condition.

- **Binary Search on Rotated Sorted Arrays**
    - **Pattern**: Handle binary search in arrays that are sorted but rotated.
    - **Question Types**:
        - Find a target value in a rotated sorted array.
        - Find the index of the rotation point (pivot).

- **Binary Search on Real Numbers**
    - **Pattern**: Perform binary search on a continuous range of real numbers.
    - **Question Types**:
        ---
        - Find the square root, cube root, or other roots of a number.
            - **Logic** for finding square root of number x:
                - for a numbe x the root will be beteen 0 and x
                - so take h= x and l=0
                - while h-l>precesion parameter(keep 1 if we know the answer will be in integer)
                    - mid = (h+l)/2
                    - if mid*mid>x then h=mid
                    - else l=mid
                - return l
                - note: pls keep and eye of interger overflow and that kind of stuff
        ---
        - Maximize/minimize some quantity in a mathematical context.
        - Geometry-based problems (e.g., finding the radius of a circle that meets a condition).

- **Binary Search on Multi-Dimensional Arrays**
    - **Pattern**: Search in a sorted matrix or grid.
    - **Question Types**:
        - Find a target value in a 2D sorted matrix.
        - Count elements less than or equal to a given value.

- **Ternary Search**
    - **Pattern**: Similar to binary search but used for unimodal functions (functions with a single peak or trough).
    - **Question Types**:
        - Maximize or minimize a function defined on integers or reals.
        - Problems involving "peaks" (e.g., find the maximum element in a bitonic array).

- **Infinite Search Space**
    - **Pattern**: Search when bounds are not explicitly given.
    - **Question Types**:
        - Search for the smallest/largest value that meets a condition by expanding bounds dynamically.

- **Search on a Custom Sorted Space**
    - **Pattern**: Search on a space sorted by custom criteria.
    - **Question Types**:
        - Search in strings, trees, or graphs sorted implicitly or explicitly by a custom rule.
        - Example: Find the lexicographically smallest/largest permutation satisfying a condition.

- **Search with Modified Array**
    - **Pattern**: Array elements are modified during the search.
    - **Question Types**:
        - Problems involving adjustments to the array while searching (e.g., weights, penalties).

- **Implicit Binary Search**
    - **Pattern**: The search space is not explicitly defined but inferred.
    - **Question Types**:
        - Binary search on a virtual array or search space (e.g., calculating mid without storing the array).

- **Optimized Search in Combination with Other Techniques**
    - **Pattern**: Binary search combined with other algorithms.
    - **Question Types**:
        - Binary search + sliding window.
        - Binary search + dynamic programming.
        - Binary search + greedy.






