// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.DataOutputStream;
import java.util.Scanner;
public final class SpotAnim {
	public static int length;
	public static void unpackConfig(StreamLoader streamLoader) {
		Stream stream = null;
		stream = new Stream(streamLoader.getDataForName("spotanim.dat"));
		try {
		//stream = new Stream(streamLoader.getBytesFromFile(new File("test.dat")));
		} catch(Exception ioe){}
		//Stream stream = new Stream
		length = stream.readUnsignedWord();
		length = 1500;
		if(cache == null)
			cache = new SpotAnim[length];
		for(int j = 0; j < length; j++) {
			if(cache[j] == null)
				cache[j] = new SpotAnim();
			cache[j].anInt404 = j;
			if(j < 666)
				cache[j].readValues(stream);
			else
				setGFXBase(j);
			if(j == 672){ // Darkbow spec
				cache[j].anInt405 = 26391;
				cache[j].anInt406 = 6585;
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];
			}		
			if(j == 756){ // Dragon bolt  spec
				cache[j].anInt405 = 16935;// Model
				cache[j].anInt406 = 4450; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}	
			if(j == 758){ // diamond bolt spec
				cache[j].anInt405 = 16943;// Model
				cache[j].anInt406 = 4452; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}	
			if(j == 752){ // Emerald bolt spec
				cache[j].anInt405 = 16941;// Model
				cache[j].anInt406 = 4446; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}			
			if(j == 754){ // ruby bolt spec
				cache[j].anInt405 = 16932;// Model
				cache[j].anInt406 = 4448; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}			
			if(j == 753){ // onyx bolt spec
				cache[j].anInt405 = 16939;// Model
				cache[j].anInt406 = 4447; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
			if(j == 1100){ // dbow impact
				cache[j].anInt405 = 26390;// Model
				cache[j].anInt406 = 6586; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 726){
				cache[j].anInt405 = 16828;// Model
				cache[j].anInt406 = 4417; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update		
			}
			if(j == 1220){
				cache[j].anInt405 = 28195;// Model
				cache[j].anInt406 = 7068; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1221){
				cache[j].anInt405 = 28223;// Model
				cache[j].anInt406 = 7069; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1222){
				cache[j].anInt405 = 28249;// Model
				cache[j].anInt406 = 7075; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1223){
				cache[j].anInt405 = 28211;// Model
				cache[j].anInt406 = 7077; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1224){
				cache[j].anInt405 = 28175;// Model
				cache[j].anInt406 = 7076; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1211){
				cache[j].anInt405 = 28221;// Model
				cache[j].anInt406 = 7036; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1213){
				cache[j].anInt405 = 28172;// Model
				cache[j].anInt406 = 7038; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1212){
				cache[j].anInt405 = 28172;// Model
				cache[j].anInt406 = 7037; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1190){
				cache[j].anInt405 = 28240;// Model
				cache[j].anInt406 = 6957; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1198){
				cache[j].anInt405 = 28176;// Model
				cache[j].anInt406 = 6970; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
			if(j == 1197){
				cache[j].anInt405 = 28177;// Model
				cache[j].anInt406 = 6970; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1203){
				cache[j].anInt405 = 28202;// Model
				cache[j].anInt406 = 7025; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if(j == 1206){
				cache[j].anInt405 = 28218;// Model
				cache[j].anInt406 = 7030; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update			
			}
			if (j == 1207) {
				cache[j].anInt405 = 28219;// Model
				cache[j].anInt406 = 7031; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
			if (j == 1165) {
				cache[j].anInt405 = 26597;// Model
				cache[j].anInt406 = 6697; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
			if (j == 1166) {
				cache[j].anInt405 = 26595;// Model
				cache[j].anInt406 = 6698; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
			if (j == 678) {
				cache[j].anInt405 = 12734;// Model
				cache[j].anInt406 = 4072; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
			if (j == 1103) {
				cache[j].anInt405 = 26393;// Model
				cache[j].anInt406 = 6588; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
			if (j == 1104) {
				cache[j].anInt405 = 26393;// Model
				cache[j].anInt406 = 366; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
				cache[j].anIntArray409 = new int[2];
				cache[j].anIntArray409[0] = 57;
				cache[j].anIntArray409[1] = 61;
			}
			if (j == 1104) {
				cache[j].anInt405 = 26393;// Model
				cache[j].anInt406 = 366; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
				cache[j].anIntArray409 = new int[2];
				cache[j].anIntArray409[0] = 57;
				cache[j].anIntArray409[1] = 61;
			}
			if (j == 1105) {
				cache[j].anInt405 = 26393;// Model
				cache[j].anInt406 = 366; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
				cache[j].anIntArray409 = new int[2];
				cache[j].anIntArray409[0] = 57;
				cache[j].anIntArray409[1] = 61;
			}
			if (j == 1106) {
				cache[j].anInt405 = 26293;// Model
				cache[j].anInt406 = 366; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
			if (j == 1107) {
				cache[j].anInt405 = 26293;// Model
				cache[j].anInt406 = 366; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
				cache[j].anIntArray409 = new int[2];
				cache[j].anIntArray409[0] = 57;
				cache[j].anIntArray409[1] = 61;
			}
			if (j == 1108) {
				cache[j].anInt405 = 26293;// Model
				cache[j].anInt406 = 366; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
				cache[j].anIntArray409 = new int[2];
				cache[j].anIntArray409[0] = 57;
				cache[j].anIntArray409[1] = 61;
			}
			if (j == 1109) {
				cache[j].anInt405 = 26293;// Model
				cache[j].anInt406 = 366; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
				cache[j].anIntArray409 = new int[2];
				cache[j].anIntArray409[0] = 57;
				cache[j].anIntArray409[1] = 61;
			}
			if (j == 1110) {
				cache[j].anInt405 = 26293;// Model
				cache[j].anInt406 = 366; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
				cache[j].anIntArray409 = new int[5];
				cache[j].anIntArray409[0] = 57;
				cache[j].anIntArray409[1] = 61;
				cache[j].anIntArray409[2] = 5012;
				cache[j].anIntArray409[3] = 926;
				cache[j].anIntArray409[4] = 5012;
			}
			if (j == 1111) {
				cache[j].anInt405 = 26294;// Model
				cache[j].anInt406 = 366; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
			if (j == 1124) {
				cache[j].anInt405 = 26598;// Model
				cache[j].anInt406 = 6694; // animation
				cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];// Update
			}
		}
		//loadAllFromTexts();
		//dumpGfx();
	}
	
	/*public static void loadAllFromTexts() {
		File[] dir = new File("./gfx/").listFiles();
		for (int j = 0; j < dir.length; j++) {
			try {
				File f = dir[j];
				Scanner s = new Scanner(f);
				System.out.println("File name: " + f.getName());
				while (s.hasNextLine()) {
					String line = s.nextLine();
					if (line.startsWith("spotAnim.model")) {
						cache[j].anInt405 = Integer.parseInt(line.substring(line.indexOf("=") + 2, line.length() - 2));
						System.out.println("model: " + line.substring(line.indexOf("=") + 2, line.length() - 1));					
					} else if (line.startsWith("spotAnim.animation")) {
						cache[j].anInt405 = Integer.parseInt(line.substring(line.indexOf("=") + 2, line.length() - 2));
						if (cache[j].anInt405 != -1)
							cache[j].aAnimation_407 = Animation.anims[cache[j].anInt406];
						System.out.println("animation: " + line.substring(line.indexOf("=") + 2, line.length() - 1));					
						break;
					}
				}
			} catch (Exception e){}	
		
		}
	
	}
	public static void dumpGfx() {
		try {
			File f = new File("test.dat");
			f.delete();
			DataOutputStream out = new DataOutputStream(new FileOutputStream("test.dat"));
			//Stream out = new Stream(streamLoader.getDataForName("spotanim.dat"));
			out.writeShort(length);
			for (int j = 0; j < cache.length; j++) {
				if (cache[j].anInt405 == 0 || cache[j].anInt406 == 0 || cache[j].aAnimation_407 == null) {
					out.writeByte(0);
				} else {
					out.writeByte(1);
					out.writeShort(cache[j].anInt405);
					out.writeByte(2);
					out.writeShort(cache[j].anInt406);
					out.writeByte(0);
				}
			}
			out.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}	
	}*/

	public static void setGFXBase(int j) {
		cache[j].anInt405 = cache[369].anInt405;
		cache[j].aAnimation_407 = cache[369].aAnimation_407;
		cache[j].anInt406 = cache[369].anInt406;
		cache[j].anInt410 = cache[369].anInt410;
		cache[j].anInt411 = cache[369].anInt411;
		cache[j].anInt412 = cache[369].anInt412;
		cache[j].anInt413 = cache[369].anInt413;
		cache[j].anInt414 = cache[369].anInt414;
		cache[j].anIntArray408 = cache[369].anIntArray408;
		cache[j].anIntArray409 = cache[369].anIntArray409;
	}
	

	private void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if(i == 0)
				return;
			if(i == 1)
				anInt405 = stream.readUnsignedWord();
			else if(i == 2) {
				anInt406 = stream.readUnsignedWord();
				if(Animation.anims != null)
					aAnimation_407 = Animation.anims[anInt406];
			} else if(i == 4)
				anInt410 = stream.readUnsignedWord();
			else if(i == 5)
				anInt411 = stream.readUnsignedWord();
			else if(i == 6)
				anInt412 = stream.readUnsignedWord();
			else if(i == 7)
				anInt413 = stream.readUnsignedByte();
			else if(i == 8)
				anInt414 = stream.readUnsignedByte();
			else if(i >= 40 && i < 50)
				anIntArray408[i - 40] = stream.readUnsignedWord();
			else if(i >= 50 && i < 60)
				anIntArray409[i - 50] = stream.readUnsignedWord();
			else
				System.out.println("Error unrecognised spotanim config code: " + i);
		} while(true);
	}

	public Model getModel() {
		Model model = (Model) aMRUNodes_415.insertFromCache(anInt404);
		if(model != null)
			return model;
		model = Model.method462(anInt405);
		if(model == null)
			return null;
		for(int i = 0; i < 6; i++)
			if(anIntArray408[0] != 0)
				model.method476(anIntArray408[i], anIntArray409[i]);

		aMRUNodes_415.removeFromCache(model, anInt404);
		return model;
	}

	private SpotAnim() {
		anInt400 = 9;
		anInt406 = -1;
		anIntArray408 = new int[6];
		anIntArray409 = new int[6];
		anInt410 = 128;
		anInt411 = 128;
	}

	private final int anInt400;
	public static SpotAnim cache[];
	private int anInt404;
	private int anInt405;
	private int anInt406;
	public Animation aAnimation_407 = null;
	private int[] anIntArray408;
	private int[] anIntArray409;
	public int anInt410;
	public int anInt411;
	public int anInt412;
	public int anInt413;
	public int anInt414;
	public static MRUNodes aMRUNodes_415 = new MRUNodes(30);

}
