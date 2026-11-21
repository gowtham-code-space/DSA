# Count Subsets with Sum

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1)

## Solved On
21 Nov 2026 at 08:14 am

<h2><a href="https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1">Count Subsets with Sum</a></h2><h3>Difficulty Level: Medium</h3><hr><p>Given an array <strong>arr[]</strong> of non-negative integers and an integer <strong>target</strong>, count all subsets of the array whose sum is equal to the given target.</p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input</strong>: arr[] = [5, 2, 3, 10, 6, 8], target = 10
<strong>Output: </strong>3
<strong>Explanation</strong>: The subsets {5, 2, 3}, {2, 8}, and {10} sum up to the target 10.</span></pre><pre><span style="font-size: 14pt;"><strong>Input</strong>: arr[] = [2, 5, 1, 4, 3], target = 10
<strong>Output:</strong> 3
<strong>Explanation</strong>: The subsets {2, 1, 4, 3}, {5, 1, 4}, and {2, 5, 3} sum up to the target 10.</span></pre><pre><span style="font-size: 14pt;"><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Input</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">: </span>arr[] = [5, 7, 8], target = 3<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><br></span><strong>Output:</strong> 0
<strong>Explanation</strong>: There are no subsets of the array that sum up to the target 3.</span></pre><pre><span style="font-size: 14pt;"><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Input</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">: </span>arr[] = [35, 2, 8, 22], target = 0<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><br></span><strong>Output:</strong> 1
<strong>Explanation</strong>: The empty subset is the only subset with a sum of 0.</span></pre>