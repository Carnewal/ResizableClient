// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
import java.io.*;
public final class EntityDef {
	
	public static void dumpNpcSizes(EntityDef ed) {
		try {
		
		
		
		} catch (Exception e) {}
	
	
	}
	
	public static EntityDef forID(int i) {
		for(int j = 0; j < 20; j++)
			if(cache[j].type == (long)i)
				return cache[j];
		anInt56 = (anInt56 + 1) % 20;
		EntityDef entityDef = cache[anInt56] = new EntityDef();
		stream.currentOffset = streamIndices[i];
		entityDef.type = i;
		entityDef.readValues(stream);
		//entityDef.readValues(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
	/*if(i == 2550) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[2]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.originalModelColors = new int[changedColors];
    entityDef.modifiedModelColors = new int[changedColors];
    entityDef.originalModelColors[0] = 61; // Original model color
    entityDef.modifiedModelColors[0] = 926; // Changed model color
    entityDef.models[0] = 27789; // 27789
    entityDef.models[1] = 27785; // 27785
    entityDef.name = "General Graardor"; // NPC name
    entityDef.combatLevel = 624; //combat level
	entityDef.walkAnim = 7058;
	entityDef.standAnim = 7059;
	entityDef.anInt91 = 110; //width?
	entityDef.anInt86 = 110; //height?
	entityDef.aByte68 = 4;
    entityDef.description = "The mighty lord Bandos!".getBytes(); // NPC description
	}
	if(i == 2551) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[2]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.models[0] = 27794; // 27789
    entityDef.models[1] = 24425; // 27785
    entityDef.name = "Sergeant Strongstack"; // NPC name
    entityDef.combatLevel = 141; //combat level
	entityDef.walkAnim = 6152;
	entityDef.standAnim = 6153;
	entityDef.aByte68 = 1;
    entityDef.description = "A follower of Bandos.".getBytes(); // NPC description
	}
	if(i == 2552) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[2]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.models[0] = 27793; // 27789
    entityDef.models[1] = 27792; // 27785
    entityDef.name = "Sergeant Steelwill"; // NPC name
    entityDef.combatLevel = 142; //combat level
	entityDef.walkAnim = 6152;
	entityDef.standAnim = 6153;
	entityDef.aByte68 = 1;
    entityDef.description = "A follower of Bandos.".getBytes(); // NPC description
	}
	if(i == 2553) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[1]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.models[0] = 27795; // 27789
    entityDef.name = "Sergeant Grimspike"; // NPC name
    entityDef.combatLevel = 142; //combat level
	entityDef.walkAnim = 6152;
	entityDef.standAnim = 6153;
	entityDef.aByte68 = 1;
    entityDef.description = "A follower of Bandos.".getBytes(); // NPC description
	}

	if(i == 2554) { // NPC ID
    //aClass30_Sub2_Sub2_60.anInt1406 = streamIndices[630]; 
    //entityDef.readValues(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
	entityDef.aByte68 = 5;
    entityDef.models = new int[5]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.originalModelColors = new int[changedColors];
    entityDef.modifiedModelColors = new int[changedColors];
    entityDef.originalModelColors[0] = 61; // Original model color
    entityDef.modifiedModelColors[0] = 926; // Changed model color
    entityDef.models[0] = 27768;
    entityDef.models[1] = 27770;
    entityDef.models[2] = 27773;
    entityDef.models[3] = 27765;
    entityDef.models[4] = 27764;
    entityDef.name = "K'ril Tsutsaroth"; // NPC name
    entityDef.combatLevel = 650; //combat level
	entityDef.anInt91 = 110; //width?
	entityDef.anInt86 = 110; //height?
	entityDef.walkAnim = 6942;
	entityDef.standAnim = 6943;
    entityDef.description = "The mighty lord zamoraks demon K'ril Tsutsaroth!".getBytes(); // NPC description
	}
	if(i == 2555) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[4]; // Number of models the NPC uses
    entityDef.models[0] = 27775; // 27789
	entityDef.models[1] = 27767;
	entityDef.models[2] = 27763;
	entityDef.models[3] = 17390;
    entityDef.name = "Tstanon Karlak"; // NPC name
    entityDef.combatLevel = 145; //combat level
	entityDef.walkAnim = 63;
	entityDef.standAnim = 66;
	entityDef.aByte68 = 3;
    entityDef.description = "A follower of Zamorak.".getBytes(); // NPC description
	}
	if(i == 2556) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[4]; // Number of models the NPC uses
    entityDef.models[0] = 27776; // 27789
	entityDef.models[1] = 27769;
	entityDef.models[2] = 27766;
	entityDef.models[3] = 17390;
    entityDef.name = "Zakl'n Gritch"; // NPC name
    entityDef.combatLevel = 142; //combat level
	entityDef.walkAnim = 63;
	entityDef.standAnim = 66;
	entityDef.anInt91 = 86; //width?
	entityDef.anInt86 = 86; //height?
	entityDef.aByte68 = 2;
    entityDef.description = "A follower of Zamorak.".getBytes(); // NPC description
	}
	if(i == 2557) { // NPC ID 
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
    entityDef.models = new int[4]; // Number of models the NPC uses
    entityDef.models[0] = 27772; // 27789
	entityDef.models[1] = 27771;
	entityDef.models[2] = 27774;
	entityDef.models[3] = 17390;
    entityDef.name = "Balfrug Kreeyath"; // NPC name
    entityDef.combatLevel = 151; //combat level
	entityDef.walkAnim = 63;
	entityDef.standAnim = 66;
	entityDef.aByte68 = 3;
    entityDef.description = "A follower of Zamorak.".getBytes(); // NPC description
	}

	if(i == 2558) { // NPC ID
    //aClass30_Sub2_Sub2_60.anInt1406 = streamIndices[630]; 
    //entityDef.readValues(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
	entityDef.aByte68 = 5;
    entityDef.models = new int[3]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.originalModelColors = new int[changedColors];
    entityDef.modifiedModelColors = new int[changedColors];
    entityDef.originalModelColors[0] = 61; // Original model color
    entityDef.modifiedModelColors[0] = 926; // Changed model color
    entityDef.models[0] = 28002;
    entityDef.models[1] = 28003;
    entityDef.models[2] = 28004;
	entityDef.anInt91 = 128; //width?
	entityDef.anInt86 = 110; //height?
    entityDef.name = "Kree'arra"; // NPC name
    entityDef.combatLevel = 650; //combat level
	entityDef.walkAnim = 3500;
	entityDef.standAnim = 3501;
    entityDef.description = "The mighty lord Armadyls general kree'arra!".getBytes(); // NPC description
	}
	if (i == 2559) {
	entityDef.name = "Wingman Skree";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 6949;
	entityDef.walkAnim = 6950;
	entityDef.combatLevel = 143;
	entityDef.models = new int[8];
	entityDef.models[0] = 28044;
	entityDef.models[1] = 28054;
	entityDef.models[2] = 28037;
	entityDef.models[3] = 28005;
	entityDef.models[4] = 28069;
	entityDef.models[5] = 28081;
	entityDef.models[6] = 28083;
	entityDef.models[7] = 28079;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Armadyl.".getBytes();
	}
	if (i == 2560) {
	entityDef.name = "Flockleader Geerin";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 6949;
	entityDef.walkAnim = 6950;
	entityDef.combatLevel = 149;
	entityDef.models = new int[5];
	entityDef.models[0] = 28018;
	entityDef.models[1] = 28028;
	entityDef.models[2] = 28006;
	entityDef.models[3] = 28005;
	entityDef.models[4] = 28063;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Armadyl.".getBytes();
	}
	if (i == 2561) {
	entityDef.name = "Flight Kilisa";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 6949;
	entityDef.walkAnim = 6950;
	entityDef.combatLevel = 159;
	entityDef.models = new int[6];
	entityDef.models[0] = 28015;
	entityDef.models[1] = 28025;
	entityDef.models[2] = 28012;
	entityDef.models[3] = 28005;
	entityDef.models[4] = 28073;
	entityDef.models[5] = 28072;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Armadyl.".getBytes();
	}
	if(i == 2562) { // NPC ID
    //aClass30_Sub2_Sub2_60.anInt1406 = streamIndices[630]; 
    //entityDef.readValues(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
    entityDef.actions = new String[5];
    entityDef.actions[1] = "Attack";
	entityDef.aByte68 = 2;
    entityDef.models = new int[3]; // Number of models the NPC uses
    int changedColors = 1; // Number of model colors changed on the NPC
    entityDef.originalModelColors = new int[changedColors];
    entityDef.modifiedModelColors = new int[changedColors];
    entityDef.originalModelColors[0] = 61; // Original model color
    entityDef.modifiedModelColors[0] = 926; // Changed model color
    entityDef.models[0] = 28078;
    entityDef.models[1] = 28071;
    entityDef.models[2] = 28057;
    entityDef.name = "Commander Zilyana"; // NPC name
    entityDef.combatLevel = 648; //combat level
	entityDef.walkAnim = 6962;
	entityDef.standAnim = 6963;
	entityDef.anInt91 = 110;
	entityDef.anInt86 = 110;
    entityDef.description = "The mighty lord Saradomins commander Zilyana !".getBytes(); // NPC description
	}
	
	if (i == 2563) {
	entityDef.name = "Starlight";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 6374;
	entityDef.walkAnim = 6373;
	entityDef.combatLevel = 149;
	entityDef.anInt91 = 110;
	entityDef.anInt86 = 110;
	entityDef.models = new int[2];
	entityDef.models[0] = 27761;
	entityDef.models[1] = 25756;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Saradomin.".getBytes();
	}
	if (i == 2564) {
	entityDef.name = "Growler";
	entityDef.aByte68 = 3;
	entityDef.standAnim = 7014;
	entityDef.walkAnim = 7015;
	entityDef.combatLevel = 139;
	entityDef.anInt91 = 144;
	entityDef.anInt86 = 144;
	entityDef.models = new int[1];
	entityDef.models[0] = 27718;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Saradomin.".getBytes();
	}
	if (i == 2565) {
	entityDef.name = "Bree";
	entityDef.aByte68 = 2;
	entityDef.standAnim = 4311;
	entityDef.walkAnim = 4310;
	entityDef.combatLevel = 146;
	entityDef.models = new int[1];
	entityDef.models[0] = 28254;
	entityDef.actions = new String[5];
	entityDef.actions[0] = null;
	entityDef.actions[1] = "Attack";
	entityDef.actions[2] = null;
	entityDef.actions[3] = null;
	entityDef.actions[4] = null;
	entityDef.description = "A follower of Saradomin.".getBytes();
	}
	if(i == 83) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.actions = new String[5];
	entityDef.actions[1] = "Attack";
	entityDef.models = new int[5];
	entityDef.models[0] = 17375;
	entityDef.models[1] = 17391;
	entityDef.models[2] = 17384;
	entityDef.models[3] = 17399;
	entityDef.models[4] = 17390;
	entityDef.standAnim = 66;
	entityDef.walkAnim = 63;
	entityDef.name = "Greater Demon";
	entityDef.combatLevel = 92;
	entityDef.description = "Big, Red & Incredibly Evil".getBytes();
	}
	if(i == 84) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.actions = new String[5];
	entityDef.actions[1] = "Attack";
	entityDef.models = new int[5];
	entityDef.models[0] = 17375;
	entityDef.models[1] = 17391;
	entityDef.models[2] = 17384;
	entityDef.models[3] = 17399;
	entityDef.models[4] = 17390;
	entityDef.originalModelColors = new int[5];
    entityDef.modifiedModelColors = new int[5];
    entityDef.originalModelColors[0] = 910; // Original model color
    entityDef.modifiedModelColors[0] = 898; // Changed model color
	entityDef.originalModelColors[1] = 912; // Original model color
    entityDef.modifiedModelColors[1] = 4; // Changed model color
	entityDef.originalModelColors[2] = 1938; // Original model color
    entityDef.modifiedModelColors[2] = 8; // Changed model color
	entityDef.originalModelColors[3] = 1814; // Original model color
    entityDef.modifiedModelColors[3] = 16; // Changed model color
	entityDef.originalModelColors[4] = 0; // Original model color
    entityDef.modifiedModelColors[4] = 5206; // Changed model color
	entityDef.standAnim = 66;
	entityDef.walkAnim = 63;
	entityDef.name = "Black Demon";
	entityDef.combatLevel = 169;
	entityDef.description = "Big, Black & extremely hard.".getBytes();
	}
	if(i == 82) {
	stream.currentOffset = streamIndices[630]; 
	entityDef.aByte68 = 3;
	entityDef.readValues(stream); // Collect original NPC data
	entityDef.actions = new String[5];
	entityDef.actions[1] = "Attack";
	entityDef.models = new int[5];
	entityDef.models[0] = 17391;
	entityDef.models[1] = 17375;
	entityDef.models[2] = 17384;
	entityDef.models[3] = 17388;
	entityDef.models[4] = 17390;
	entityDef.standAnim = 66;
	entityDef.walkAnim = 63;
	entityDef.name = "Lesser Demon";
	entityDef.combatLevel = 82;
	entityDef.description = "Lesser, but still Scary".getBytes();
	}*/
		
		return entityDef;
	}
	
	public static int totalNPCs;
	public static void rewriteNpcs() {
		try {
			DataOutputStream dat = new DataOutputStream(new FileOutputStream("npc.dat"));
			DataOutputStream idx = new DataOutputStream(new FileOutputStream("npc.idx"));
			idx.writeShort(totalNPCs);
			dat.writeShort(totalNPCs);
			for (int j = 0; j < 6386; j++) {
				int offset1 = dat.size();
				EntityDef npc = forID(j);
				if (npc.anIntArray73 == null) {
					dat.writeByte(0);
					idx.writeShort(1);
					continue;
				}
				if (npc.models != null) {
					dat.writeByte(1);
					dat.writeByte(npc.models.length);
					for (int j2 : npc.models)
						dat.writeShort(j2);				
				}
				if (npc.name != null) {
					dat.writeByte(2);
					writeString(dat, npc.name);	
				}
				if (npc.description != null) {
					dat.writeByte(3);
					writeString(dat, npc.description.toString());					
				}
				if (npc.aByte68 != 1) {
					dat.writeByte(12);
					dat.writeByte(npc.aByte68);
				}
				if (npc.standAnim != -1) {
					dat.writeByte(13);
					dat.writeShort(npc.standAnim);				
				}
				if (npc.walkAnim != -1 || npc.anInt58 != -1 || npc.anInt55 != -1 || npc.anInt83 != -1) {
					dat.writeByte(17);
					dat.writeShort(npc.walkAnim);
					dat.writeShort(npc.anInt58);
					dat.writeShort(npc.anInt83);
					dat.writeShort(npc.anInt55);				
				}
				if (npc.actions != null) {
					for (int ii = 0; ii < 5; ii++) {
						dat.writeByte(30 + ii);
						if (npc.actions[ii] == null)
							writeString(dat, "hidden");
						else
							writeString(dat, npc.actions[ii]);
					}				
				}
				if (npc.originalModelColors != null) {
					dat.writeByte(40);
					dat.writeByte(npc.originalModelColors.length);
					for (int ii = 0; ii < npc.originalModelColors.length; ii++) {
						dat.writeShort(npc.originalModelColors[ii]);
						dat.writeShort(npc.modifiedModelColors[ii]);
					}
				
				}
				if (npc.anIntArray73 != null) {
					dat.writeByte(60);
					dat.write(npc.anIntArray73.length);
					for (int j1 : npc.anIntArray73) {
						dat.writeShort(j1);					
					}				
				}
				if (!npc.aBoolean87) {
					dat.writeByte(93);
				}
				if (npc.combatLevel != -1) {
					dat.writeByte(95);
					dat.writeShort(npc.combatLevel);				
				}
				if(npc.anInt91 != 128) {
					dat.writeByte(97);
					dat.writeShort(npc.anInt91);
				}
				if(npc.anInt86 != 128) {
					dat.writeByte(98);
					dat.writeShort(npc.anInt86);
				}
				if(npc.aBoolean93) {
					dat.writeByte(99);
				}
				if(npc.anInt85 != -1) {
					dat.writeByte(100);
					dat.writeByte(npc.anInt85);
				}
				if(npc.anInt92 != -1) {
					dat.writeByte(101);
					dat.writeByte((npc.anInt92 / 5));
				}
				if(npc.anInt75 != -1) {
					dat.writeByte(102);
					dat.writeShort(npc.anInt75);
				}
				if(npc.anInt79 != 32) {
					dat.writeByte(103);
					dat.writeShort(npc.anInt79);
				}
				if(npc.childrenIDs != null) {
					dat.writeByte(106);
					dat.writeShort(npc.anInt57);
					dat.writeShort(npc.anInt59);
					dat.writeByte(npc.childrenIDs.length - 1);
					for(int ii = 0; ii < npc.childrenIDs.length; ii++) {
						dat.writeShort(npc.childrenIDs[ii]);
					}
				}
				if(!npc.aBoolean84) {
					dat.writeByte(107);
				}
				dat.writeByte(0);
				int offset2 = dat.size();
				int writeOffset = offset2 - offset1;
				idx.writeShort(writeOffset);				
			}
			dat.close();
			idx.close();
		} catch(IOException ioe){}
	}
	
	public static void writeString(DataOutputStream dos, String toWrite) {
		try {
			dos.write(toWrite.getBytes());
			dos.writeByte(10);		
		} catch(IOException ioe){}
	
	}

	public Model method160()
	{
		if(childrenIDs != null)
		{
			EntityDef entityDef = method161();
			if(entityDef == null)
				return null;
			else
				return entityDef.method160();
		}
		if(anIntArray73 == null)
			return null;
		boolean flag1 = false;
		for(int i = 0; i < anIntArray73.length; i++)
			if(!Model.method463(anIntArray73[i]))
				flag1 = true;

		if(flag1)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray73.length];
		for(int j = 0; j < anIntArray73.length; j++)
			aclass30_sub2_sub4_sub6s[j] = Model.method462(anIntArray73[j]);

		Model model;
		if(aclass30_sub2_sub4_sub6s.length == 1)
			model = aclass30_sub2_sub4_sub6s[0];
		else
			model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
		if(originalModelColors != null)
		{
			for(int k = 0; k < originalModelColors.length; k++)
				model.method476(originalModelColors[k], modifiedModelColors[k]);

		}
		return model;
	}

	public EntityDef method161()
	{
		int j = -1;
		if(anInt57 != -1)
		{
			VarBit varBit = VarBit.cache[anInt57];
			int k = varBit.anInt648;
			int l = varBit.anInt649;
			int i1 = varBit.anInt650;
			int j1 = client.anIntArray1232[i1 - l];
			j = clientInstance.variousSettings[k] >> l & j1;
		} else
		if(anInt59 != -1)
			j = clientInstance.variousSettings[anInt59];
		if(j < 0 || j >= childrenIDs.length || childrenIDs[j] == -1)
			return null;
		else
			return forID(childrenIDs[j]);
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		stream = new Stream(streamLoader.getDataForName("npc.dat"));
		Stream stream2 = new Stream(streamLoader.getDataForName("npc.idx"));
		totalNPCs = stream2.readUnsignedWord();
		streamIndices = new int[totalNPCs + 5000];
		int i = 2;
		for(int j = 0; j < totalNPCs; j++) {
			streamIndices[j] = i;
			i += stream2.readUnsignedWord();
		}
		cache = new EntityDef[20];
		for(int k = 0; k < 20; k++)
			cache[k] = new EntityDef();

	}

	public static void nullLoader()
	{
		mruNodes = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public Model method164(int j, int k, int ai[])
	{
		if(childrenIDs != null)
		{
			EntityDef entityDef = method161();
			if(entityDef == null)
				return null;
			else
				return entityDef.method164(j, k, ai);
		}
		Model model = (Model) mruNodes.insertFromCache(type);
		if(model == null)
		{
			boolean flag = false;
			for(int i1 = 0; i1 < models.length; i1++)
				if(!Model.method463(models[i1]))
					flag = true;

			if(flag)
				return null;
			Model aclass30_sub2_sub4_sub6s[] = new Model[models.length];
			for(int j1 = 0; j1 < models.length; j1++)
				aclass30_sub2_sub4_sub6s[j1] = Model.method462(models[j1]);

			if(aclass30_sub2_sub4_sub6s.length == 1)
				model = aclass30_sub2_sub4_sub6s[0];
			else
				model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
			if(originalModelColors != null)
			{
				for(int k1 = 0; k1 < originalModelColors.length; k1++)
					model.method476(originalModelColors[k1], modifiedModelColors[k1]);

			}
			model.method469();
			model.method479(64 + anInt85, 850 + anInt92, -30, -50, -30, true);
			mruNodes.removeFromCache(model, type);
		}
		Model model_1 = Model.aModel_1621;
		model_1.method464(model, Class36.method532(k) & Class36.method532(j));
		if(k != -1 && j != -1)
			model_1.method471(ai, j, k);
		else
		if(k != -1)
			model_1.method470(k);
		if(anInt91 != 128 || anInt86 != 128)
			model_1.method478(anInt91, anInt91, anInt86);
		model_1.method466();
		model_1.anIntArrayArray1658 = null;
		model_1.anIntArrayArray1657 = null;
		if(aByte68 == 1)
			model_1.aBoolean1659 = true;
		return model_1;
	}

	private void readValues(Stream stream)
	{
		do
		{
			int i = stream.readUnsignedByte();
			if(i == 0)
				return;
			if(i == 1)
			{
				int j = stream.readUnsignedByte();
				models = new int[j];
				for(int j1 = 0; j1 < j; j1++)
					models[j1] = stream.readUnsignedWord();

			} else
			if(i == 2)
				name = stream.readString();
			else
			if(i == 3)
				description = stream.readBytes();
			else
			if(i == 12)
				aByte68 = stream.readSignedByte();
			else
			if(i == 13)
				standAnim = stream.readUnsignedWord();
			else
			if(i == 14)
				walkAnim = stream.readUnsignedWord();
			else
			if(i == 17)
			{
				walkAnim = stream.readUnsignedWord();
				anInt58 = stream.readUnsignedWord();
				anInt83 = stream.readUnsignedWord();
				anInt55 = stream.readUnsignedWord();
			} else
			if(i >= 30 && i < 40)
			{
				if(actions == null)
					actions = new String[5];
				actions[i - 30] = stream.readString();
				if(actions[i - 30].equalsIgnoreCase("hidden"))
					actions[i - 30] = null;
			} else
			if(i == 40)
			{
				int k = stream.readUnsignedByte();
				originalModelColors = new int[k];
				modifiedModelColors = new int[k];
				for(int k1 = 0; k1 < k; k1++)
				{
					originalModelColors[k1] = stream.readUnsignedWord();
					modifiedModelColors[k1] = stream.readUnsignedWord();
				}

			} else
			if(i == 60)
			{
				int l = stream.readUnsignedByte();
				anIntArray73 = new int[l];
				for(int l1 = 0; l1 < l; l1++)
					anIntArray73[l1] = stream.readUnsignedWord();

			} else
			if(i == 90)
				stream.readUnsignedWord();
			else
			if(i == 91)
				stream.readUnsignedWord();
			else
			if(i == 92)
				stream.readUnsignedWord();
			else
			if(i == 93)
				aBoolean87 = false;
			else
			if(i == 95)
				combatLevel = stream.readUnsignedWord();
			else
			if(i == 97)
				anInt91 = stream.readUnsignedWord();
			else
			if(i == 98)
				anInt86 = stream.readUnsignedWord();
			else
			if(i == 99)
				aBoolean93 = true;
			else
			if(i == 100)
				anInt85 = stream.readSignedByte();
			else
			if(i == 101)
				anInt92 = stream.readSignedByte() * 5;
			else
			if(i == 102)
				anInt75 = stream.readUnsignedWord();
			else
			if(i == 103)
				anInt79 = stream.readUnsignedWord();
			else
			if(i == 106)
			{
				anInt57 = stream.readUnsignedWord();
				if(anInt57 == 65535)
					anInt57 = -1;
				anInt59 = stream.readUnsignedWord();
				if(anInt59 == 65535)
					anInt59 = -1;
				int i1 = stream.readUnsignedByte();
				childrenIDs = new int[i1 + 1];
				for(int i2 = 0; i2 <= i1; i2++)
				{
					childrenIDs[i2] = stream.readUnsignedWord();
					if(childrenIDs[i2] == 65535)
						childrenIDs[i2] = -1;
				}

			} else
			if(i == 107)
				aBoolean84 = false;
		} while(true);
	}

	private EntityDef()
	{
		anInt55 = -1;
		anInt57 = -1;
		anInt58 = -1;
		anInt59 = -1;
		combatLevel = -1;
		anInt64 = 1834;
		walkAnim = -1;
		aByte68 = 1;
		anInt75 = -1;
		standAnim = -1;
		type = -1L;
		anInt79 = 32;
		anInt83 = -1;
		aBoolean84 = true;
		anInt86 = 128;
		aBoolean87 = true;
		anInt91 = 128;
		aBoolean93 = false;
	}

	public int anInt55;
	private static int anInt56;
	private int anInt57;
	public int anInt58;
	private int anInt59;
	private static Stream stream;
	public int combatLevel;
	private final int anInt64;
	public String name;
	public String actions[];
	public int walkAnim;//walkAnim
	public byte aByte68;
	private int[] modifiedModelColors;//modifiedModelColors
	private static int[] streamIndices;
	private int[] anIntArray73;
	public int anInt75;
	private int[] originalModelColors;//originalModelColors
	public int standAnim;//anInt177
	public long type;
	public int anInt79;
	private static EntityDef[] cache;
	public static client clientInstance;
	public int anInt83;
	public boolean aBoolean84;
	private int anInt85;
	private int anInt86;
	public boolean aBoolean87;
	public int childrenIDs[];
	public byte description[];
	private int anInt91;
	private int anInt92;
	public boolean aBoolean93;
	private int[] models;//anIntArray94
	public static MRUNodes mruNodes = new MRUNodes(30);

}
