package org.ltaden.monopolytilesfrequency.main;

public class Tile {
	private String name;
	private int count;
	
	public Tile(String name) {
		this.name = name;
		this.count = 0;
	}
	
	public void landedOn() {
		this.count+=1;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static Tile[] generateTiles() {
		Tile[] result = new Tile[40];
		result[0] = new Tile("Start");
		result[1] = new Tile("Brown1");
		result[2] = new Tile("ChanceType1/Brown");
		result[3] = new Tile("Brown2");
		result[4] = new Tile("Tax1");
		result[5] = new Tile("Transport1");
		result[6] = new Tile("Blue1");
		result[7] = new Tile("ChanceType2/Blue");
		result[8] = new Tile("Blue2");
		result[9] = new Tile("Blue3");
		result[10] = new Tile("Prison");
		result[11] = new Tile("Pink1");
		result[12] = new Tile("Utility1");
		result[13] = new Tile("Pink2");
		result[14] = new Tile("Pink3");
		result[15] = new Tile("Transport2");
		result[16] = new Tile("Orange1");
		result[17] = new Tile("ChanceType1/Orange");
		result[18] = new Tile("Orange2");
		result[19] = new Tile("Orange3");
		result[20] = new Tile("Parking");
		result[21] = new Tile("Red1");
		result[22] = new Tile("ChanceType2/Red");
		result[23] = new Tile("Red2");
		result[24] = new Tile("Red3");
		result[25] = new Tile("Transport3");
		result[26] = new Tile("Yellow1");
		result[27] = new Tile("Yellow2");
		result[28] = new Tile("Utility2");
		result[29] = new Tile("Yellow3");
		result[30] = new Tile("goToJail");
		result[31] = new Tile("Green1");
		result[32] = new Tile("Green2");
		result[33] = new Tile("ChanceType1/Green");
		result[34] = new Tile("Green3");
		result[35] = new Tile("Transport4");
		result[36] = new Tile("ChanceType2/Navy");
		result[37] = new Tile("Navy1");
		result[38] = new Tile("Tax2");
		result[39] = new Tile("Navy2");
		return result;
		
	}
}
