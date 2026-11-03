# Celebrity Problem

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/the-celebrity-problem/1)

## Solved On
03 Nov 2026 at 06:39 pm

<h2><a href="https://www.geeksforgeeks.org/problems/the-celebrity-problem/1">Celebrity Problem</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Consider a party being organized by some people. </span><span style="font-size: 14pt;">A celebrity is a person who is known to all but does not know anyone at the party.&nbsp;</span></p><ul><li><span style="font-size: 14pt;">A square matrix&nbsp;mat[][]&nbsp;of size n * n is used to represent people at the party such that if an element of row i and column j is set to 1 it means i<sup>th</sup> person knows j<sup>th</sup> person.</span></li><li><span style="font-size: 14pt;">You need to return index of the celebrity in the party.</span></li><li><span style="font-size: 14pt;">If the celebrity does not exist, return -1.</span></li></ul><p><span style="font-size: 14pt;"><strong>Note:</strong> Follow 0-based indexing.</span></p><p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [[1, 1, 0],<br>                 [0, 1, 0],<br>                 [0, 1, 1]]
<strong>Output:</strong> 1
<strong>Explanation: </strong>0th and 2nd person both know 1st person and 1st person does not know anyone. Therefore, 1 is the celebrity person.</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [[1, 1], <br>                 [1, 1]]
<strong>Output:</strong> -1
<strong>Explanation: </strong>Since both the people at the party know each other. Hence none of them is a celebrity person.</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [[1]]
<strong>Output:</strong> 0</span></pre>