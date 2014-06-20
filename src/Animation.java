// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public final class Animation {

	public static int FrameStart[] = new int[1950];

	public static void unpackConfig(StreamLoader streamLoader) {
		for(int j = 0; j < FrameStart.length; j++)
			FrameStart[j] = 0;
		Stream stream = new Stream(streamLoader.getDataForName("seq.dat"));
		int length = stream.readUnsignedWord() + 3299;
		if(anims == null)
			anims = new Animation[length];
		for(int j = 0; j < length; j++) {
			if(anims[j] == null)
				anims[j] = new Animation();
			if(j < 3997) {
				anims[j].readValues(stream);
			} else {
				setAnimBase(j);
			}
			try {
			if(j == 1658){
				int file = 300;
				if(FrameStart[file] < 1)
					Class36.methodCustomAnimations(false, file);
					int[] frames = {190,214,215,216,217,218,219,220,221,208,209,210,211,212,213,0};
					int[] delays = {4,3,2,1,1,4,2,2,8,1,2,2,3,2,2,0};
					anims[j].anInt352 = frames.length-1;
					anims[j].anIntArray353 = new int[frames.length-1];
					anims[j].anIntArray354 = new int[frames.length-1];
					anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
					anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
					anims[j].anIntArray354[i2] = -1;
					anims[j].anIntArray355[i2] = delays[i2];
				}
			}
			if(j == 4450){// d bolt spec
				int file = 1169;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,11,22,33,41,42,43,44,45,1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30,31,32,34,35,36,37,38,39,40,0};
				int[] delays = {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6000){
					int file = 1919;
					if(FrameStart[file] < 1)
						Class36.methodCustomAnimations(false, file);
					int[] frames = {75, 75, 62, 62, 93, 93, 93, 82, 82, 82, 57, 57, 71, 71, 71, 66, 66, 66, 66, 61, 61, 92, 92, 92, 73, 73, 73, 65, 65, 65, 89, 89, 70, 70, 70, 81, 81, 81, 67, 67, 84, 84, 84, 59, 59, 59, 63, 63, 63, 99, 99, 99, 78, 78, 78, 69, 69, 69, 96, 96, 96, 96, 74, 74, 74, 74, 79, 79, 79, 90, 90, 90, 94, 94, 58};
					anims[j].anInt352 = frames.length-1;
					anims[j].anIntArray353 = new int[frames.length-1];
					anims[j].anIntArray354 = new int[frames.length-1];
					anims[j].anIntArray355 = new int[frames.length-1];
						for(int i2 = 0; i2 < frames.length-1; i2++){
							anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
							anims[j].anIntArray354[i2] = -1;
							anims[j].anIntArray355[i2] = 0;
						}
				}
				if(j == 4447){ // onyx bolt spec
				int file = 1173;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,11,22,33,44,49,50,51,52,1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30,31,32,34,35,36,37,38,39,40,41,42,43,45,46,47,48,0};
				int[] delays = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,7,9,9,9,9,9,9,9,9,9,8,9,9,9,9,9,9,9,7,7,6,6,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 4446){// Emerald bolt spec
				int file = 1175;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,11,22,33,44,46,47,48,49,1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30,31,32,34,35,36,37,38,39,40,41,0,0};
				int[] delays = {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 4448){// ruby spec
				int file = 1166;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,11,22,31,32,33,34,35,36,1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30,0};
				int[] delays = {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,7,7,7,7,7,7,7,7,7,7,7,7,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 4452){//diamond bolt spec
				int file = 1177;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,11,22,23,24,25,26,27,28,1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,0};
				int[] delays = {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6586){
				int file = 1674;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,1,14,2,12,3,13,4,11,5,15,6,16,7,17,8,18,10,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 4417){ //veng skull
				int file = 1161;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {1,11,17,18,19,20,21,22,23,0,2,3,4,5,6,7,8,9,10,12,13,14,15,0};
				int[] delays = {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,6,6,6,5,5,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7069){
				int file = 1770;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {44,44,44,44,44,44,44,44,34,35,28,29,23,38,25,30,11,8,22,26,43,2,32,5,42,27,4,13,0,24,3,1,37,12,17,18,33,7,39,39,0};
				int[] delays = {2,2,2,2,2,3,3,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 4410){
				int file = 1076;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {446,457,468,473,474,475,476,477,478,447,448,449,450,451,452,453,454,455,456,458,459,460,461,462,463,464,465,466,467,469,470,471,472,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
					anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
					anims[j].anIntArray354[i2] = -1;
					anims[j].anIntArray355[i2] = delays[i2];
				}
				//System.out.println("4410 loaded.");
				}
				if(j == 7068){
				int file = 1766;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,33,8,4,15,2,23,28,22,25,24,30,32,6,11,17,7,20,21,27,3,13,9,18,34,29,19,16,5,26,31,14,12,1,0};
				int[] delays = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7075){
				int file = 1771;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {5,5,5,5,5,5,5,5,5,5,5,17,3,13,18,6,15,16,12,8,4,9,2,14,11,1,0,10,7,7,7,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7076){
				int file = 1749;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {36,11,37,30,15,20,40,23,48,44,5,10,21,18,9,49,34,42,3,25,22,33,29,28,2,0};
				int[] delays = {14,3,2,2,2,2,2,2,2,2,2,2,2,2,2,20,2,2,2,2,2,2,2,2,6,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7077){
				int file = 1768;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {2,26,13,40,27,27,27,21,21,21,48,39,44,6,53,28,1,18,17,38,22,36,23,57,50,25,16,11,12,33,7,30,42,9,46,4,19,0};
				int[] delays = {12,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 4230){ // Cbow attack
				int file = 1088;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {64,74,75,76,77,78,79,80,81,65,66,67,68,69,70,71,72,73,249,0};
				int[] delays = {10,5,4,4,3,3,5,11,3,4,5,6,3,3,3,3,3,2,1,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 4226){ // Cbow walk
				int file = 1088;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {8,9,10,11,12,13,14,15,0};
				int[] delays = {6,6,6,6,6,6,6,6,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 4228){ // Cbow run
				int file = 1088;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,1,2,3,4,5,6,7,0};
				int[] delays = {5,4,4,4,5,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
							
				if(j == 4300) { //2h Stand
				int file = 1834;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++) {
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = 0;
				}
				}

				if(j == 4301) { //BGS special emote
				int file = 1834;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++) {
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 4302) { //ZGS special emote
				int file = 1834;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++) {
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = 0;
				}
				}

				if(j == 4303) { //SGS special emote
				int file = 1834;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++) {
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = 0;
				}
				}

				if(j == 4304) { //AGS special emote
				int file = 1834;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++) {
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = 0;
				}
				}

				if(j == 4305) { //2h run
				int file = 1834;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96};
				int[] delays = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++) {
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = -1;
				}
				}

				if(j == 4306) { //2h walk
				int file = 1834;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++) {
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = 0;
				}
				}
				if(j == 4307) { //2h attack
				int file = 1834;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {98,100,102,103,105,106,107,109,110,111,113,114,115};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++) {
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = 0;
				}
				}

				if(j == 4308) { //2h block
				int file = 1834;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++) {
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = 0;
				}
				}
				if(j == 6585){
				int file = 1674;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {19,21,30,22,36,23,37,24,20,25,41,26,40,27,39,28,38,29,0};
				int[] delays = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 2075){ //Karil's C'bow attack
				int file = 219;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {78,97,98,99,100,101,102,184,185,178,179,180,181,182,183,102,101,100,99,98,97,78,0};
				int[] delays = {3,3,3,3,3,3,3,6,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				} 
				if(j == 4177){ //Defender block
				int file = 1063;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {97,98,99,100,101,102,0};
				int[] delays = {7,7,7,7,7,7,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7077){		//Bandos GFX	
				int file = 1768;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {2,26,13,40,27,27,27,21,21,21,48,39,44,6,53,28,1,18,17,38,22,36,23,57,50,25,16,11,12,33,7,30,42,9,46,4,19,0};
				int[] delays = {12,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7075){
				int file = 1771;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {5,5,5,5,5,5,5,5,5,5,5,17,3,13,18,6,15,16,12,8,4,9,2,14,11,1,0,10,7,7,7,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 5186){
				int file = 1353;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,1,2,3,4,0};
				int[] delays = {2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 7068){ 	//Saradomin GFX
				int file = 1766;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,33,8,4,15,2,23,28,22,25,24,30,32,6,11,17,7,20,21,27,3,13,9,18,34,29,19,16,5,26,31,14,12,1,0};
				int[] delays = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 7069){
				int file = 1770;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {44,44,44,44,44,44,44,44,34,35,28,29,23,38,25,30,11,8,22,26,43,2,32,5,42,27,4,13,0,24,3,1,37,12,17,18,33,7,39,39,0};
				int[] delays = {2,2,2,2,2,3,3,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6942){ //K'ril walk
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {403,346,338,428,395,344,302,345,377,376,421,440,432,330,335,365,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 6943){ // K'rill stand
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {436,388,322,298,359,422,426,307,413,315,287,390,324,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6944){ // K'rill block
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {416,292,351,407,381,417,405,418,364,399,332,334,378,301,354,325,355,326,305,429,353,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6945){ // K'rill attack
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {299,293,412,406,331,433,363,288,291,297,296,349,306,343,369,437,358,361,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6946){ // K'rill death
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {362,360,408,394,427,321,339,329,303,290,310,397,319,387,424,313,396,328,323,294,383,384,341,439,357,348,385,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,50,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6947){ //K'rill secondary attack
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {404,373,411,401,380,367,350,371,379,434,414,389,400,425,336,309,423,342,372,392,430,340,289,415,402,375,386,317,431,318,409,391,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}			

				if(j == 3500){ // Kree'arra walk
				int file = 1773;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {66,118,108,15,156,1,100,42,154,185,37,4,30,26,28,27,143,170,181,84,29,139,39,11,117,36,104,183,91,48,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}		
				if(j == 3501){ // Kree'arra stand
				int file = 1773;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {41,76,51,13,158,65,64,150,148,46,90,153,134,18,130,172,49,112,105,135,81,92,53,166,141,86,127,2,171,132,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 3502){ // Kree'arra block
				int file = 1773;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {111,152,164,25,56,106,87,136,103,59,7,31,99,70,54,69,22,50,179,115,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 3503){ // Kree'arra death
				int file = 1773;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {19,145,186,68,142,123,178,67,161,146,107,125,159,47,62,116,34,73,180,149,78,163,9,120,3,74,58,126,144,43,38,102,129,140,138,14,88,101,89,57,182,32,147,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,300,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 3504){ // Kree'arra secondary
				int file = 1773;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {137,133,21,55,24,124,114,174,17,155,169,131,177,173,109,8,80,16,61,165,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 3505){ //Kree'arra Attack
				int file = 1773;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {35,40,184,168,95,33,82,12,20,72,79,167,94,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7062){//bandos death
				int file = 1124;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {266,201,175,297,144,249,340,224,207,215,151,213,314,262,298,345,274,159,279,165,309,257,235,203,277,282,285,134,167,244,296,343,312,305,250,255,290,149,307,157,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,200,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 7061){//bandos block
				int file = 1124;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {275,327,260,133,321,138,238,164,293,183,200,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
						
				if(j == 7060){//bandos attack
				int file = 1124;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {330,210,311,248,169,301,145,146,232,233,184,252,220,230,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}	
					
				if(j == 7058){//Bandos walk
				int file = 1124;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {212,211,318,227,338,256,174,286,208,194,225,288,292,339,197,154,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}	
					
				if(j == 7063){//bandos  Attack
				int file = 1124;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {334,173,141,236,317,156,198,332,342,320,263,242,271,143,240,223,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
						
				if(j == 7059){ //Bandos Stand
				int file = 1124;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {278,136,152,273,202,254,180,228,190,331,336,168,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				 
				 if(j == 6962){//sara walk
				int file = 1775;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {181,106,89,122,12,166,75,107,60,115,11,2,23,82,35,84,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 6967){//sara mage attack part?
				int file = 1775;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {114,53,127,13,151,93,196,117,161,29,63,94,96,132,129,141,139,192,206,182,4,195,56,152,179,133,90,61,145,6,167,109,68,172,130,170,3,204,134,191,184,15,207,108,16,131,163,51,169,88,86,150,22,188,85,124,158,105,160,197,180,64,9,103,100,123,39,8,95,69,55,44,5,65,165,190,116,41,121,140,48,20,137,74,77,178,157,149,201,62,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6963){//sara stand
				int file = 1775;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {203,112,99,28,45,14,81,19,52,119,7,49,202,146,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6965){//sara dead
				int file = 1775;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {142,104,50,80,200,79,173,118,71,31,27,98,177,164,168,135,70,57,54,136,37,171,46,34,125,154,87,38,33,21,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,300,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}		
				if(j == 6966){//sara block
				int file = 1775;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {10,153,97,25,67,102,175,17,101,128,110,66,144,26,113,143,126,36,76,92,148,40,176,32,73,91,30,199,147,1,156,162,183,24,83,159,18,120,72,138,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6964){//sara attack
				int file = 1775;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {155,189,59,194,111,58,187,78,193,185,42,198,47,174,43,186,205,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6152){ // Bandos Minion Walking
				int file = 1575;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {154,157,159,161,162,160,158,156,155,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6153){ // Bandos Minion Standing
				int file = 1575;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {94,105,116,120,121,122,123,124,125,95,96,97,98,99 ,100,101,102,103,104,106,107,108,109,110,111,112,113,114,115,117,118,119,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5 ,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6156){ // Bandos Minion Dieing
				int file = 1575;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {28,39,45,46,47,48,49,50,51,29,44,43,30,31,32,33,34,35,36,37,38,40,41,42,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,50, 0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6155){ //Bandos Minion Blocking
				int file = 1575;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {52,58,60,62,63,53,54,55,56,64,61,59,57,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6154){ //Bandos Minion Attacking
				int file = 1575;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {1,11,21,22,23,25,26,27,0,2,3,4,6,9,12,14,15,16,18 ,19,20,17,13,10,8,7,5,0};
				int[] delays = {2,3,2,3,2,3,2,3,2,2,3,2,3,3,2,3,2,3,2,3,2,3,2,3,2 ,3,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6942){ // Zammy Minion Walking
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {403,346,338,428,395,344,302,345,377,376,421,440,432,330,335,365,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6943){ // Zammy Minion Standing
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {436,388,322,298,359,422,426,307,413,315,287,390,324,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 6947){ //Zammy Minion Scream?
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {404,373,411,401,380,367,350,371,379,434,414,389,400,425,336,309,423,342,372,392,430,340,289,415,402 ,375,386,317,431,318,409,391,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5 ,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6946){ //Zammy Minion Dieing
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {362,360,408,394,427,321,339,329,303,290,310,397,319,387,424,313,396,328,323,294,383,384,341,439,357 ,348,385,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5 ,5,50,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6945){ //Zammy Minion Slash Attack
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {299,293,412,406,331,433,363,288,291,297,296,349,306,343,369,437,358,361,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6944){ //Zammy Minion Blocking
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {416,292,351,407,381,417,405,418,364,399,332,334,378,301,354,325,355,326,305,429,353,0};
				int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6949){//Arma Minion Stand
				int file = 1774;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {22,109,124,204,201,215,61,155,230,10,3,206,153,123,119,82,223,218,194,200,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6950){//Arma Minion Walk
				int file = 1774;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {36,101,165,104,214,52,234,139,7,37,188,133,87,227 ,239,11,185,120,173,6,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6956){ //Arma Minion Dieing
				int file = 1774;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {110,60,140,78,105,4,1,79,85,186,64,183,2,146,181, 170,17,162,12,66,74,34,179,18,199,0,231,224,62,65, 55,99,30,210,20,92,127,83,157,138,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3 ,3,3,3,3,3,3,3,3,3,3,3,3,3,3,50,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6955){ //Arma Minion Blocking
				int file = 1774;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {213,160,63,42,96,205,233,8,125,88,167,137,29,172, 35,9,232,53,151,128,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6954){ //Arma Minion Dive Attack
				int file = 1774;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {111,23,80,177,163,207,144,48,32,102,45,197,148,94 ,132,161,112,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6953){ //Arma Minion Range Attack
				int file = 1774;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {235,84,154,57,156,28,73,86,26,220,143,219,190,191 ,238,145,152,71,16,193,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6952){ //Arma Minion 2nd Block?
				int file = 1774;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {178,202,43,228,117,103,182,150,27,41,19,158,113,50,59,40,5,118,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6951){ //Arma Minion Up in Air then dive back down?
				int file = 1774;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {221,209,69,67,100,187,237,236,14,93,75,136,51,159,89,31,229,97,56,49,13,164,121,222,91,217,198,68,114,174,203,149,130,44,116,184,189,169,192,180,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3 ,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 4311){ // Bree Stand
				int file = 1748;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {12,99,13,101,86,45,91,67,31,48,49,15,93,62,63,8,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 4310){ //Bree Walk
				int file = 1748;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {65,5,95,2,61,40,92,58,28,21,98,83,10,50,71,3,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7009){ //Bree Attack
				int file = 1748;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {97,69,38,7,36,1,76,90,19,22,4,39,72,85,82,47,60,70,87,35,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7010){ //Bree Defence/Block
				int file = 1748;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {14,9,6,42,52,41,73,24,75,25,16,17,20,11,89,9,57,0 };
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7011){ //Bree Dieing
				int file = 1748;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {64,96,26,51,53,23,0,59,46,68,32,44,74,34,66,37,27 ,56,29,88,30,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,16,4,4,4,4,4,4,4,400,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6374){ //Starlight Standing
				int file = 1639;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {43,72,68,44,54,45,69,46,67,47,70,48,65,49,71,50,43,72,68,44,54,45,69,46,67,47,70,48,65,49,71,50,43, 72,68,44,54,45,69,46,67,47,70,48,65,49,71,50,51,52 ,53,55,56,57,58,59,60,61,62,63,64,66,43,72,68,44,54,45,69,46,67,47,70,48,65,49,71,50,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4 ,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5 ,5,5,5,5,5,5,5,5,5,5,5,5,4,4,4,4,4,4,4,4,4,4,4,4,4 ,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6373){ //Starlight Walking
				int file = 1639;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {119,134,127,120,128,121,129,122,130,123,131,124,132,125,133,126,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6377){ //Starlight Dieing
				int file = 1639;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {8,20,23,21,25,22,24,19,9,10,26,15,13,16,12,17,14,18,11,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,400,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6376){ //Starlight Horn Poke Attack LOL?
				int file = 1639;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,5,1,2,4,3,6,7,0};
				int[] delays = {4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6375){ //Starlight Block/Dodge
				int file = 1639;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {27,38,35,37,40,42,30,32,36,33,31,28,41,39,29,38,34,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 7014){ //Growler Stand
				int file = 1345;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {301,369,359,343,324,379,385,287,330,318,382,395,298,370,249,267,262,313,388,268,301,369,359,343,324 ,379,385,287,330,318,382,395,298,370,249,267,262,313,388,268,307,360,239,274,389,329,260,305,332,302 ,311,271,371,240,315,391,345,281,251,276,366,327,372,362,245,356,293,353,269,253,270,368,237,339,400 ,272,358,365,320,328,301,369,359,343,324,379,385,287,330,318,382,395,298,370,249,267,262,313,388,268 ,0};
				int[] delays = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 ,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 ,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 ,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 ,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}

				if(j == 7015){ //Growler Walk
				int file = 1345;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {310,256,288,277,378,396,252,374,319,341,337,326,236,306,295,286,310,256,288,277,378,396,252,374,319 ,341,337,326,236,306,295,286,283,352,292,340,291,279,357,264,350,280,380,255,348,257,235,309,310,256 ,288,277,378,396,252,374,319,341,337,326,236,306,295,286,0};
				int[] delays = {3,3,3,4,3,3,3,3,3,3,3,4,3,3,3,3,3,3,3,4,3,3,3,3,3 ,3,3,4,3,3,3,3,3,3,3,4,3,3,3,3,3,3,3,4,3,3,3,3,3,3 ,3,4,3,3,3,3,3,3,3,4,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7019){ //Growler Roar?
				int file = 1345;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {290,282,297,363,383,248,232,347,233,296,299,354,247,265,266,394,254,335,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7018){ //Growler Attack/Bite
				int file = 1345;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {336,334,275,314,355,304,364,373,349,381,325,367,303,321,250,0};
				int[] delays = {3,3,3,2,2,2,2,3,2,2,2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7017){ //Growler Block/Dodge?
				int file = 1345;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {246,387,351,258,312,322,263,242,346,242,263,322,312,258,351,387,0};
				int[] delays = {4,4,4,4,4,4,4,4,8,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7016){ //Growler Dieing
				int file = 1345;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {285,300,289,317,294,316,278,241,243,234,261,377,397,390,331,384,392,284,333,342,259,398,399,344,361 ,273,238,375,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,16,3,3,3,3, 3,3,3,300,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}}
				if(j == 7068){
				int file = 1766;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,33,8,4,15,2,23,28,22,25,24,30,32,6,11,17,7,20,21,27,3,13,9,18,34,29,19,16,5,26,31,14,12,1,0};
				int[] delays = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7069){
				int file = 1770;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {44,44,44,44,44,44,44,44,34,35,28,29,23,38,25,30,11,8,22,26,43,2,32,5,42,27,4,13,0,24,3,1,37,12,17,18,33,7,39,39,0};
				int[] delays = {2,2,2,2,2,3,3,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7075){
				int file = 1771;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {5,5,5,5,5,5,5,5,5,5,5,17,3,13,18,6,15,16,12,8,4,9,2,14,11,1,0,10,7,7,7,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7077){
				int file = 1768;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {2,26,13,40,27,27,27,21,21,21,48,39,44,6,53,28,1,18,17,38,22,36,23,57,50,25,16,11,12,33,7,30,42,9,46,4,19,0};
				int[] delays = {12,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7076){
				int file = 1749;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {36,11,37,30,15,20,40,23,48,44,5,10,21,18,9,49,34,42,3,25,22,33,29,28,2,0};
				int[] delays = {14,3,2,2,2,2,2,2,2,2,2,2,2,2,2,20,2,2,2,2,2,2,2,2,6,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				
				if(j == 7036){
				int file = 1754;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {8,10,14,6,11,0};
				int[] delays = {3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7038){
				int file = 1751;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {14,4,8,9,0};
				int[] delays = {3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7037){
				int file = 1751;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {18,7,0,5,12,13,17,15,11,3,16,10,6,2,1,0};
				int[] delays = {6,3,3,3,3,1,1,1,3,3,3,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6970){
				int file = 1759;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {2,5,1,6,7,0,3,4,0};
				int[] delays = {2,2,2,2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 7025){
				int file = 1750;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {8,13,21,7,0};
				int[] delays = {3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 64){ //Greater/Lesser Demon Attack
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {21,31,32,33,34,35,36,37,38,22,23,24,25,26,27,28,29,30,0};
				int[] delays = {3,3,3,10,1,1,1,5,3,1,1,1,5,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 65){ //Greater/Lesser Demon Block
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {104,107,108,109,110,111,112,113,114,105,106,105,114,113,112,111,110,109,108,107,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,20,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 63){ //Greater/Lesser Demon Walking
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {267,278,280,281,282,283,284,285,286,268,269,270,271,272,273,274,275,276,277,279,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,8,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
					
				if(j == 66){ //Greater/Lesser Demon Standing
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {234,237,238,239,240,241,242,243,244,235,236,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 67){ //Greater/Lesser Demon Dieing
				int file = 1208;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {73,84,95,98,99,100,101,102,103,74,75,76,77,78,79,80,81,82,83,85,86,87,88,89,90,91,92,93,94,96,97,0};
				int[] delays = {10,4,4,2,2,2,5,5,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,700,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6588){ //sara mage attack
				int file = 1675;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {252,299,255,263,256,262,300,264,257,265,274,266,258,267,253,268,275,259,276,269,294,277,295,285,278,270,279,260,280,271,281,254,282,287,272,288,283,289,261,290,284,291,273,292,286,293,298,296,0};
				int[] delays = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6694){ //gfx thing
				int file = 1695;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,33,40,25,41,52,42,26,43,50,27,53,28,49,47,29,23,34,30,35,51,36,31,37,24,38,32,39,44,45,46,0};
				int[] delays = {18,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				
				if(j == 4731){ //teletab
				int file = 241;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,10,11,12,13,14,15,16,17,6,7,8,9,0};
				int[] delays = {5,5,5,5,5,2,2,2,2,2,2,2,2,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 4072){ //teletab
				int file = 541;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,5,6,7,8,9,10,11,12,1,2,3,4,0};
				int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6697){ //dfs stuff
				int file = 1694;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {1,9,12,11,13,10,14,15,16,0,2,3,0};
				int[] delays = {30,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}
				if(j == 6698){ //dfs stuff
				int file = 1694;
				if(FrameStart[file] < 1)
				Class36.methodCustomAnimations(false, file);
				int[] frames = {0,15,8,1,9,2,10,3,11,4,12,5,13,6,14,7,0};
				int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
				anims[j].anInt352 = frames.length-1;
				anims[j].anIntArray353 = new int[frames.length-1];
				anims[j].anIntArray354 = new int[frames.length-1];
				anims[j].anIntArray355 = new int[frames.length-1];
				for(int i2 = 0; i2 < frames.length-1; i2++){
				anims[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
				anims[j].anIntArray354[i2] = -1;
				anims[j].anIntArray355[i2] = delays[i2];
				}
				}





				

				
			} catch (Exception e) {e.printStackTrace();}
		}
	}

	public static void setAnimBase(int j) {
		anims[j].anInt352 = anims[808].anInt352;
		anims[j].anIntArray353 = anims[808].anIntArray353;
		anims[j].anIntArray354 = anims[808].anIntArray354;
		anims[j].anIntArray355 = anims[808].anIntArray355;
		anims[j].anInt356 = anims[808].anInt356;
		anims[j].anIntArray357 = anims[808].anIntArray357;
		anims[j].anInt359 = anims[808].anInt359;
		anims[j].anInt360 = anims[808].anInt360;
		anims[j].anInt361 = anims[808].anInt361;
		anims[j].anInt362 = anims[808].anInt362;
		anims[j].anInt363 = anims[808].anInt363;
		anims[j].anInt364 = anims[808].anInt364;
		anims[j].anInt365 = anims[808].anInt365;
		anims[j].anInt352 = anims[808].anInt352;
	}

	public int method258(int i) {
		int j = anIntArray355[i];
		if(j == 0) {
			Class36 class36 = Class36.method531(anIntArray353[i]);
			if(class36 != null)
				j = anIntArray355[i] = class36.anInt636;
		}
		if(j == 0)
			j = 1;
		return j;
	}

	private void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if(i == 0)
				break;
			if(i == 1) {
				anInt352 = stream.readUnsignedByte();
				anIntArray353 = new int[anInt352];
				anIntArray354 = new int[anInt352];
				anIntArray355 = new int[anInt352];
				for(int j = 0; j < anInt352; j++) {
					anIntArray353[j] = stream.readUnsignedWord();
					anIntArray354[j] = stream.readUnsignedWord();
					if(anIntArray354[j] == 65535)
						anIntArray354[j] = -1;
					anIntArray355[j] = stream.readUnsignedWord();
				}
			} else if(i == 2)
				anInt356 = stream.readUnsignedWord();
			else if(i == 3) {
				int k = stream.readUnsignedByte();
				anIntArray357 = new int[k + 1];
				for(int l = 0; l < k; l++)
					anIntArray357[l] = stream.readUnsignedByte();

				anIntArray357[k] = 0x98967f;
			} else if(i == 4)
				aBoolean358 = true;
			else if(i == 5)
				anInt359 = stream.readUnsignedByte();
			else if(i == 6)
				anInt360 = stream.readUnsignedWord();
			else if(i == 7)
				anInt361 = stream.readUnsignedWord();
			else
			if(i == 8)
				anInt362 = stream.readUnsignedByte();
			else if(i == 9)
				anInt363 = stream.readUnsignedByte();
			else if(i == 10)
				anInt364 = stream.readUnsignedByte();
			else if(i == 11)
				anInt365 = stream.readUnsignedByte();
			else if(i == 12)
				stream.readDWord();
			else
				System.out.println("Error unrecognised seq config code: " + i);
		} while(true);
		if(anInt352 == 0) {
			anInt352 = 1;
			anIntArray353 = new int[1];
			anIntArray353[0] = -1;
			anIntArray354 = new int[1];
			anIntArray354[0] = -1;
			anIntArray355 = new int[1];
			anIntArray355[0] = -1;
		}
		if(anInt363 == -1)
			if(anIntArray357 != null)
				anInt363 = 2;
			else
				anInt363 = 0;
		if(anInt364 == -1) {
			if(anIntArray357 != null) {
				anInt364 = 2;
				return;
			}
			anInt364 = 0;
		}
	}

	private Animation() {
		anInt356 = -1;
		aBoolean358 = false;
		anInt359 = 5;
		anInt360 = -1;
		anInt361 = -1;
		anInt362 = 99;
		anInt363 = -1;
		anInt364 = -1;
		anInt365 = 2;
	}

	public static Animation anims[];
	public int anInt352;
	public int anIntArray353[];
	public int anIntArray354[];
	public int[] anIntArray355;
	public int anInt356;
	public int anIntArray357[];
	public boolean aBoolean358;
	public int anInt359;
	public int anInt360;
	public int anInt361;
	public int anInt362;
	public int anInt363;
	public int anInt364;
	public int anInt365;
	public static int anInt367;
}
