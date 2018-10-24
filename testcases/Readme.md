# **User Stories:** 
- As a user, I would like to customize the size of the Sudoku board so that it is easier for me to solve the Sudoku. 
- As a user, I would like to see different arrangement of numbers on the screen (board) every time I start a new game so that I play with different numbers. 

 

# **Requirements:**
- The game should have a start menu with a Start button and option to choose difficulty level.
- Player should be allowed to select which difficulty they would like to play with.
- System must identify which difficulty the user has selected and display the game board accordingly.
- System must generate random numbers every time the user clicks the Start button. 
- System must generate random numbers every time the user clicks the Restart button.
- System must display the random numbers on the GUI game board.
- System remembers the arrangements of the numbers on the initial game board and provides a different board every time the user wishes to restart the game.

 
# Acceptance Tests:
### **Acceptance Test 1 - Testing to see if the player is provided to choose their playing difficulty levels.**

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image001.png)

***Figure 1 - Before clicking start button***



![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image004.gif)

***Figure 2 - After clicking start button***

 

**File Name:** StartActivity.java 

**Requirements Validated:** 

- Player should be allowed to select which difficulty level they would like to play with.
- The game should have a start menu with a Start button and option to choose difficulty level.
- System must identify which difficulty the user has selected and display the game board accordingly.

**Result:** In this test Easy mode was chosen (Fig. 1) and then a4x4 grid generated (Fig. 2). 

 

### **Acceptance Test 2 - Checking if the 4x4 Sudoku game board is randomized upon two runs.**

 ![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image006.gif)

***Figure 3 - First Time Running the Sudoku Game on Easy Level***

 

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image008.gif)

***Figure 4: Second Time Running the Sudoku Game on Easy Level***

 

**File Name:** GameBoard.java

**Requirement Validated:** 
- System must generate random numbers every time the user clicks the Start button. 
- System must display the random numbers on the GUI game board. 

**Result:** There are different numbers generated every time the user opens a new game. The game board in Figure 2 and 3 are completely different on Easy level.

 

### **Acceptance Test 3 - Checking if the 6x6 Sudoku game board is randomized upon two runs.**

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image010.gif)

***Figure: 5 - First Time Running the Sudoku Game on Medium Level***

 

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image012.gif)

***Figure 6 - Second Time Running the Sudoku Game on Medium Level***

 

**File Name:** GameBoard.java

**Requirements Validated:** 
- System must generate random numbers every time the user clicks the Start button. 
- System must display the random numbers on the GUI game board.

**Result:** There are different numbers generated every time the user opens a new game. The game board in Figure 5 and 6 are completely different on Medium level. 

 

### **Acceptance Test 4 - Checking if the 6x6 Sudoku game board is randomized upon two runs.**

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image014.gif)

***Figure 7 - First Time Running the Sudoku Game on Hard Level***

 

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image016.gif)

***Figure 8 - Second Time Running the Sudoku Game on Hard Level***



**File Name:** GameBoard.java

**Requirement Validated:** 

- System must generate random numbers every time the user clicks the Start button. 
- System must display the random numbers on the GUI game board.

**Result:** There are different numbers generated every time the user opens a new game. The game board in Figure 7 and 8 are completely different on Hard level.

 

### **Acceptance Test 5 - Checking if the 3x3 game board is randomized when user clicks restart button**

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image018.gif)

***Figure 9 - Before Pressing Restart button on Easy Level***



![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image020.gif)

***Figure 10 - After Pressing Restart button on Easy Level***

 

**File Name:** GameBoard.java

**Requirements Validated:** 

- System must generate random numbers every time the user clicks the Restart button.
- System remembers the arrangements of the numbers on the initial game board and provides a different board every time the user wishes to restart the game. 

**Result:** There are different numbers generated every time the user clicks the Restart button. The game board in Figure 7 and 8 are completely different on Easy level.



### **Acceptance Test 6 - Checking if the 6x6 game board is randomized when user clicks restart button**

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image022.gif)

***Figure 11 - Before Pressing Restart button on Medium Level***

 

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image024.gif)

***Figure 12 - After Pressing Restart button on Easy Level***

 

**File Name:** GameBoard.java

**Requirements Validated:** 

- System must generate random numbers every time the user clicks the Restart button.
- System remembers the arrangements of the numbers on the initial game board and provides a different board every time the user wishes to restart the game.

**Result:** There are different numbers generated every time the user clicks the Restart button. The game board in Figure 7 and 8 are completely different on Medium level.

 

### **Acceptance Test 7 - Checking if the 6x6 game board is randomized when user clicks restartbutton**
![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image026.gif)

***Figure 13 - Before Pressing Restart button on Hard Level***

 

![img](https://github.com/KaranP25/sudoku-game/tree/master/testcases/screenshot/clip_image028.gif)


***Figure 14 - After Pressing Restart button on Hard Level***

 

**File Name:** GameBoard.java

**Requirement Validated:** 
- System must generate random numbers every time the user clicks the Restart button.
- System remembers the arrangements of the numbers on the initial game board and provides a different board every time the user wishes to restart the game. 

**Result:** There are different numbers generated every time the user clicks the Restart button. The game board in Figure 7 and 8 are completely different on Hard level.
