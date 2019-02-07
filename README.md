# Game-of-Life
Java Implementation of the classic coding challenge "Conway's Game of Life"

<h3> Task </h3>
To create an implementation of the game of life, a two-dimensional grid inhabited by cells with each interacting 
with up to eight neighbour cells. The grid evolves one iteration at a time with a set of rules to determine each
cells status on the next iteration which is either dead or alive.

<br><b>The rules are as follows:</b>

<ul><li>Rule 1 (No interactions) -- When there are no live cells, then on the next iteration there are still no live cells</li>
<li>Rule 2 (Underpopulation) -- When a live cell has fewer than two neighbours, then this cell dies</li>
<li>Rule 3 (Overcrowding) -- When a cell has more than three neighbours, then this cell dies</li>
<li>Rule 4 (Survival) -- When a cell has two or three neighbours, then this cell stays alive</li>
<li>Rule 5 (Creation of Life) -- When an empty position has exactly three neighbouring cells, then a cell is created in this position</li></ul>

<h3> How to Run </h3>
<ul><li>Clone or download the repository</li>
<li>Open the programme in an IDE (Eclipse was used to implement this solution)</li>
<li>Run the Game.java file</li>
<li>A number of starting patterns can be used which can be found in the comments within the main method within this file, which 
details how to change to the pattern of your choice (Default three cell row)</li></ul>

<h3>Assumptions</h3>
<ul><li>That the game canvas should be infinite, but for demonstation purposes a fixed grid has been set</li>
<li>There is no maximum lifespan for alive cells, they can survive forever in line with the set of rules</li>
<li>All cells are equal in that, new and old cells are both just as capable of creating new cells just the same</li>
<li>The user will want a specified starting pattern and not a random seeding</li>
