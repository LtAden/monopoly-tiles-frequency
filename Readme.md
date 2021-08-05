Purpose of this "project" is to determine whether or not some types of properties in Monopoly board game are landed on more often than the others, and thus generate more income.
This is achieved by simulating a huge number of double dice throws, along with implementation of any movement altering effects - doubles, cards and so on.

Tile class will feature two parameters: one will be tile name, other will be the count of how many times hypothetical player has landed on it 
during the program run. Tiles will be named according to more abstract map layout - so Brown1, Transport3 or Chance2-Orange, correspoding to, in order
First property of brown color, thrid transport tile counting from the start, and chance tile of the second type, located between orange property tiles. 
And then, every time player lands on a tile, its count will increase by one. Additionally, after that count increase, if any location-altering event
happens, that tile will also get its count increased. Example: player lands on chance tile between teal properties, and gets a card sending them
to second navy property. So both of those tiles got their count increased by one (so total count will be higher than set limit of rolls).

Location-altering events:
-doubles - every time player scores same amount of dots on both dices, the count of doubles will increase by one. When it reaches 3, player
is sent to jail instead of moving to tile indicated by amount of dots.
-chance cards - there are few cards that move player to different tiles. 
-go to jail tile - sends player to jail

At the end, program will print out how many times each tile was landed on, maybe with % value. Any thinking person already knows that prison will
be the tile most landed on, and so, since 7 is most likely number to come from two dices (6 out of 36 possible combinations), followed by 6 and 8, 
the orange properties seem to be most often landed on (7th tile from prison is a chance tile)

Tile names and card actions:
Tiles:
1. Start
2. Brown1
3. ChanceType1/Brown
4. Brown2
5. Tax1
6. Transport1
7. Blue1
8. ChanceType2/Blue
9. Blue2
10. Blue3
11. Prison
12. Pink1
13. Utility1
14. Pink2
15. Pink3
16. Transport2
17. Orange1
18. ChanceType1/Orange
19. Orange2
20. Orange3
21. Parking
22. Red1
23. ChanceType2/Red
24. Red2
25. Red3
26. Transport3
27. Yellow1
28. Yellow2
29. Utility2
30. Yellow3
31. GotoJail
32. Green1
33. Green2
34. ChanceType1/Green
35. Green3
36. Transport4
37. ChanceType2/Navy
38. Navy1
39. Tax2
40. Navy2ChanceType1:
Cards: 16
Movement cards:
1x - go to jail
1x - go to startChanceType2:
Cards: 16
Movement Cards:
1x - go to jail
1x - go to start
2x - go to the nearest transport tile
1x - go back 3 tiles
1x - go to Pink1
1x - go to Red3
1x - go to Navy2
1x - go to nearest utility
1x - go to Transport1