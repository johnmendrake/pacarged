import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Labyrinth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Labyrinth1 extends World {
    /**
     * Constructor for objects of class Labyrinth1.
     * 
     */
    public Labyrinth1() {    
        // Create a new world with 21x21 cells with a cell size of 1x1 pixels.
        super(21, 21, 35); 
        setPaintOrder(Ghost.class,Pacman.class,PowerUP.class,Pill.class,Food.class,Wall.class);        
        setActOrder(Pacman.class,Ghost.class);
        prepare();
    }
    
    public void act() {
        Pacman player = (Pacman) getObjects(Pacman.class).get(0);
        if(getObjects(Pacman.class)!=null) {
            showText(String.format("Score: %d", player.counter), 1, 0);
            showText(String.format("Lives: %d", player.lives), 1, getHeight()-1);
        }
        if(getObjects(Food.class)==null) {
            new Labyrinth1();
        }
        if(player.counter%205==0) {
            // prepareFood();
            player.counter++;
        }
    }
    
    /**
     * Bereite die Welt für den Programmstart vor.
     * Das heißt: Erzeuge die Anfangs-Objekte und füge sie der Welt hinzu.
     */
    private void prepare() {
        Wall wall = new Wall();
        addObject(wall,0,0);
        Wall wall2 = new Wall();
        addObject(wall2,0,1);
        Wall wall3 = new Wall();
        addObject(wall3,0,2);
        Wall wall4 = new Wall();
        addObject(wall4,0,3);
        Wall wall5 = new Wall();
        addObject(wall5,0,20);
        Wall wall6 = new Wall();
        addObject(wall6,0,19);
        Wall wall7 = new Wall();
        addObject(wall7,0,18);
        Wall wall8 = new Wall();
        addObject(wall8,0,17);
        Wall wall9 = new Wall();
        addObject(wall9,0,16);
        Wall wall10 = new Wall();
        addObject(wall10,0,15);
        Wall wall11 = new Wall();
        addObject(wall11,0,4);
        Wall wall12 = new Wall();
        addObject(wall12,0,5);
        Wall wall13 = new Wall();
        addObject(wall13,0,6);
        Wall wall14 = new Wall();
        addObject(wall14,0,14);
        Wall wall15 = new Wall();
        addObject(wall15,0,13);
        Wall wall16 = new Wall();
        addObject(wall16,0,7);
        Wall wall17 = new Wall();
        addObject(wall17,0,8);
        Wall wall18 = new Wall();
        addObject(wall18,0,12);
        Wall wall19 = new Wall();
        addObject(wall19,0,10);
        Wall wall20 = new Wall();
        addObject(wall20,1,0);
        Wall wall21 = new Wall();
        addObject(wall21,2,0);
        Wall wall22 = new Wall();
        addObject(wall22,3,0);
        Wall wall23 = new Wall();
        addObject(wall23,4,0);
        Wall wall24 = new Wall();
        addObject(wall24,4,1);
        Wall wall25 = new Wall();
        addObject(wall25,2,2);
        Wall wall26 = new Wall();
        addObject(wall26,3,2);
        Wall wall27 = new Wall();
        addObject(wall27,4,2);
        Wall wall28 = new Wall();
        addObject(wall28,3,3);
        Wall wall29 = new Wall();
        addObject(wall29,4,3);
        Wall wall30 = new Wall();
        addObject(wall30,5,2);
        Wall wall31 = new Wall();
        addObject(wall31,5,3);
        Wall wall32 = new Wall();
        addObject(wall32,5,0);
        Wall wall33 = new Wall();
        addObject(wall33,6,0);
        Wall wall34 = new Wall();
        addObject(wall34,7,0);
        Wall wall35 = new Wall();
        addObject(wall35,7,2);
        Wall wall36 = new Wall();
        addObject(wall36,7,3);
        Wall wall37 = new Wall();
        addObject(wall37,8,3);
        Wall wall38 = new Wall();
        addObject(wall38,8,2);
        Wall wall39 = new Wall();
        addObject(wall39,8,0);
        Wall wall40 = new Wall();
        addObject(wall40,10,0);
        Wall wall41 = new Wall();
        addObject(wall41,12,0);
        Wall wall42 = new Wall();
        addObject(wall42,10,2);
        Wall wall43 = new Wall();
        addObject(wall43,10,3);
        Wall wall44 = new Wall();
        addObject(wall44,12,2);
        Wall wall45 = new Wall();
        addObject(wall45,12,3);
        Wall wall46 = new Wall();
        addObject(wall46,13,3);
        Wall wall47 = new Wall();
        addObject(wall47,13,2);
        Wall wall48 = new Wall();
        addObject(wall48,13,0);
        Wall wall49 = new Wall();
        addObject(wall49,14,0);
        Wall wall50 = new Wall();
        addObject(wall50,15,0);
        Wall wall51 = new Wall();
        addObject(wall51,16,0);
        Wall wall52 = new Wall();
        addObject(wall52,15,2);
        Wall wall53 = new Wall();
        addObject(wall53,15,3);
        Wall wall54 = new Wall();
        addObject(wall54,16,3);
        Wall wall55 = new Wall();
        addObject(wall55,16,2);
        Wall wall56 = new Wall();
        addObject(wall56,16,1);
        Wall wall57 = new Wall();
        addObject(wall57,17,0);
        Wall wall58 = new Wall();
        addObject(wall58,18,0);
        Wall wall59 = new Wall();
        addObject(wall59,19,0);
        Wall wall60 = new Wall();
        addObject(wall60,20,0);
        Wall wall61 = new Wall();
        addObject(wall61,17,2);
        Wall wall62 = new Wall();
        addObject(wall62,17,3);
        Wall wall63 = new Wall();
        addObject(wall63,18,2);
        Wall wall64 = new Wall();
        addObject(wall64,20,2);
        Wall wall65 = new Wall();
        addObject(wall65,20,1);
        Wall wall66 = new Wall();
        addObject(wall66,20,3);
        Wall wall67 = new Wall();
        addObject(wall67,20,4);
        Wall wall68 = new Wall();
        addObject(wall68,19,4);
        Wall wall69 = new Wall();
        addObject(wall69,19,5);
        Wall wall70 = new Wall();
        addObject(wall70,20,5);
        Wall wall71 = new Wall();
        addObject(wall71,20,6);
        Wall wall72 = new Wall();
        addObject(wall72,20,7);
        Wall wall73 = new Wall();
        addObject(wall73,20,8);
        Wall wall74 = new Wall();
        addObject(wall74,20,10);
        Wall wall75 = new Wall();
        addObject(wall75,20,12);
        Wall wall76 = new Wall();
        addObject(wall76,20,13);
        Wall wall77 = new Wall();
        addObject(wall77,20,14);
        Wall wall78 = new Wall();
        addObject(wall78,20,15);
        Wall wall79 = new Wall();
        addObject(wall79,20,16);
        Wall wall80 = new Wall();
        addObject(wall80,20,17);
        Wall wall81 = new Wall();
        addObject(wall81,20,18);
        Wall wall82 = new Wall();
        addObject(wall82,20,19);
        Wall wall83 = new Wall();
        addObject(wall83,20,20);
        Wall wall84 = new Wall();
        addObject(wall84,9,5);
        Wall wall85 = new Wall();
        addObject(wall85,9,6);
        Wall wall86 = new Wall();
        addObject(wall86,11,5);
        Wall wall87 = new Wall();
        addObject(wall87,11,6);
        Wall wall88 = new Wall();
        addObject(wall88,10,8);
        Wall wall89 = new Wall();
        addObject(wall89,8,8);
        Wall wall90 = new Wall();
        addObject(wall90,8,9);
        Wall wall91 = new Wall();
        addObject(wall91,8,10);
        Wall wall92 = new Wall();
        addObject(wall92,8,11);
        Wall wall93 = new Wall();
        addObject(wall93,9,11);
        Wall wall94 = new Wall();
        addObject(wall94,10,11);
        Wall wall95 = new Wall();
        addObject(wall95,11,11);
        Wall wall96 = new Wall();
        addObject(wall96,12,11);
        Wall wall97 = new Wall();
        addObject(wall97,12,10);
        Wall wall98 = new Wall();
        addObject(wall98,12,9);
        Wall wall99 = new Wall();
        addObject(wall99,12,8);
        Wall wall100 = new Wall();
        addObject(wall100,14,8);
        Wall wall101 = new Wall();
        addObject(wall101,15,8);
        Wall wall102 = new Wall();
        addObject(wall102,13,6);
        Wall wall103 = new Wall();
        addObject(wall103,13,5);
        Wall wall104 = new Wall();
        addObject(wall104,14,5);
        Wall wall105 = new Wall();
        addObject(wall105,14,6);
        Wall wall106 = new Wall();
        addObject(wall106,15,6);
        Wall wall107 = new Wall();
        addObject(wall107,15,5);
        Wall wall108 = new Wall();
        addObject(wall108,17,5);
        Wall wall109 = new Wall();
        addObject(wall109,17,6);
        Wall wall110 = new Wall();
        addObject(wall110,17,7);
        Wall wall111 = new Wall();
        addObject(wall111,17,8);
        Wall wall112 = new Wall();
        addObject(wall112,18,8);
        Wall wall113 = new Wall();
        addObject(wall113,18,7);
        Wall wall114 = new Wall();
        addObject(wall114,14,10);
        Wall wall115 = new Wall();
        addObject(wall115,15,10);
        Wall wall116 = new Wall();
        addObject(wall116,15,11);
        Wall wall117 = new Wall();
        addObject(wall117,14,11);
        Wall wall118 = new Wall();
        addObject(wall118,14,12);
        Wall wall119 = new Wall();
        addObject(wall119,15,12);
        Wall wall120 = new Wall();
        addObject(wall120,10,12);
        Wall wall121 = new Wall();
        addObject(wall121,10,13);
        Wall wall122 = new Wall();
        addObject(wall122,10,14);
        Wall wall123 = new Wall();
        addObject(wall123,10,15);
        Wall wall124 = new Wall();
        addObject(wall124,10,16);
        Wall wall125 = new Wall();
        addObject(wall125,10,17);
        Wall wall126 = new Wall();
        addObject(wall126,10,20);
        Wall wall127 = new Wall();
        addObject(wall127,10,18);
        Wall wall128 = new Wall();
        addObject(wall128,11,18);
        Wall wall129 = new Wall();
        addObject(wall129,11,17);
        Wall wall130 = new Wall();
        addObject(wall130,9,17);
        Wall wall131 = new Wall();
        addObject(wall131,9,18);
        Wall wall132 = new Wall();
        addObject(wall132,8,20);
        Wall wall133 = new Wall();
        addObject(wall133,7,20);
        Wall wall134 = new Wall();
        addObject(wall134,7,19);
        Wall wall135 = new Wall();
        addObject(wall135,7,18);
        Wall wall136 = new Wall();
        addObject(wall136,7,17);
        Wall wall137 = new Wall();
        addObject(wall137,1,20);
        Wall wall138 = new Wall();
        addObject(wall138,2,20);
        Wall wall139 = new Wall();
        addObject(wall139,3,20);
        Wall wall140 = new Wall();
        addObject(wall140,4,20);
        Wall wall141 = new Wall();
        addObject(wall141,5,20);
        Wall wall142 = new Wall();
        addObject(wall142,6,20);
        Wall wall143 = new Wall();
        addObject(wall143,12,20);
        Wall wall144 = new Wall();
        addObject(wall144,13,20);
        Wall wall145 = new Wall();
        addObject(wall145,13,19);
        Wall wall146 = new Wall();
        addObject(wall146,13,18);
        Wall wall147 = new Wall();
        addObject(wall147,13,17);
        Wall wall148 = new Wall();
        addObject(wall148,14,20);
        Wall wall149 = new Wall();
        addObject(wall149,15,20);
        Wall wall150 = new Wall();
        addObject(wall150,16,20);
        Wall wall151 = new Wall();
        addObject(wall151,17,20);
        Wall wall152 = new Wall();
        addObject(wall152,18,20);
        Wall wall153 = new Wall();
        addObject(wall153,19,20);
        Wall wall154 = new Wall();
        addObject(wall154,15,17);
        Wall wall155 = new Wall();
        addObject(wall155,15,18);
        Wall wall156 = new Wall();
        addObject(wall156,16,18);
        Wall wall157 = new Wall();
        addObject(wall157,16,17);
        Wall wall158 = new Wall();
        addObject(wall158,16,16);
        Wall wall159 = new Wall();
        addObject(wall159,18,16);
        Wall wall160 = new Wall();
        addObject(wall160,18,17);
        Wall wall161 = new Wall();
        addObject(wall161,18,18);
        Wall wall162 = new Wall();
        addObject(wall162,18,14);
        Wall wall163 = new Wall();
        addObject(wall163,17,14);
        Wall wall164 = new Wall();
        addObject(wall164,17,12);
        Wall wall165 = new Wall();
        addObject(wall165,17,11);
        Wall wall166 = new Wall();
        addObject(wall166,17,10);
        Wall wall167 = new Wall();
        addObject(wall167,18,10);
        Wall wall168 = new Wall();
        addObject(wall168,19,12);
        Wall wall169 = new Wall();
        addObject(wall169,15,14);
        Wall wall170 = new Wall();
        addObject(wall170,14,14);
        Wall wall171 = new Wall();
        addObject(wall171,14,15);
        Wall wall172 = new Wall();
        addObject(wall172,13,15);
        Wall wall173 = new Wall();
        addObject(wall173,12,15);
        Wall wall174 = new Wall();
        addObject(wall174,12,13);
        Wall wall175 = new Wall();
        addObject(wall175,12,14);
        Wall wall176 = new Wall();
        addObject(wall176,7,5);
        Wall wall177 = new Wall();
        addObject(wall177,7,6);
        Wall wall178 = new Wall();
        addObject(wall178,6,6);
        Wall wall179 = new Wall();
        addObject(wall179,6,5);
        Wall wall180 = new Wall();
        addObject(wall180,5,5);
        Wall wall181 = new Wall();
        addObject(wall181,5,6);
        Wall wall182 = new Wall();
        addObject(wall182,1,4);
        Wall wall183 = new Wall();
        addObject(wall183,1,5);
        Wall wall184 = new Wall();
        addObject(wall184,3,5);
        Wall wall185 = new Wall();
        addObject(wall185,3,6);
        Wall wall186 = new Wall();
        addObject(wall186,3,7);
        Wall wall187 = new Wall();
        addObject(wall187,2,7);
        Wall wall188 = new Wall();
        addObject(wall188,2,8);
        Wall wall189 = new Wall();
        addObject(wall189,3,8);
        Wall wall190 = new Wall();
        addObject(wall190,5,8);
        Wall wall191 = new Wall();
        addObject(wall191,6,8);
        Wall wall192 = new Wall();
        addObject(wall192,5,10);
        Wall wall193 = new Wall();
        addObject(wall193,6,10);
        Wall wall194 = new Wall();
        addObject(wall194,6,11);
        Wall wall195 = new Wall();
        addObject(wall195,5,11);
        Wall wall196 = new Wall();
        addObject(wall196,5,12);
        Wall wall197 = new Wall();
        addObject(wall197,6,12);
        Wall wall198 = new Wall();
        addObject(wall198,2,10);
        Wall wall199 = new Wall();
        addObject(wall199,3,10);
        Wall wall200 = new Wall();
        addObject(wall200,3,11);
        Wall wall201 = new Wall();
        addObject(wall201,3,12);
        Wall wall202 = new Wall();
        addObject(wall202,3,14);
        Wall wall203 = new Wall();
        addObject(wall203,2,14);
        Wall wall204 = new Wall();
        addObject(wall204,1,12);
        Wall wall205 = new Wall();
        addObject(wall205,2,16);
        Wall wall206 = new Wall();
        addObject(wall206,2,18);
        Wall wall207 = new Wall();
        addObject(wall207,2,17);
        Wall wall208 = new Wall();
        addObject(wall208,4,16);
        Wall wall209 = new Wall();
        addObject(wall209,4,17);
        Wall wall210 = new Wall();
        addObject(wall210,4,18);
        Wall wall211 = new Wall();
        addObject(wall211,5,18);
        Wall wall212 = new Wall();
        addObject(wall212,5,17);
        Wall wall213 = new Wall();
        addObject(wall213,5,14);
        Wall wall214 = new Wall();
        addObject(wall214,6,14);
        Wall wall215 = new Wall();
        addObject(wall215,6,15);
        Wall wall216 = new Wall();
        addObject(wall216,7,15);
        Wall wall217 = new Wall();
        addObject(wall217,8,15);
        Wall wall218 = new Wall();
        addObject(wall218,8,14);
        Wall wall219 = new Wall();
        addObject(wall219,8,13);
        Food food = new Food();
        addObject(food,3,1);
        Food food2 = new Food();
        addObject(food2,2,1);
        Food food3 = new Food();
        addObject(food3,1,1);
        Food food4 = new Food();
        addObject(food4,1,2);
        Food food5 = new Food();
        addObject(food5,1,3);
        Food food6 = new Food();
        addObject(food6,2,3);
        Food food7 = new Food();
        addObject(food7,2,4);
        Food food8 = new Food();
        addObject(food8,2,5);
        Food food9 = new Food();
        addObject(food9,2,6);
        Food food10 = new Food();
        addObject(food10,1,6);
        Food food11 = new Food();
        addObject(food11,1,7);
        Food food12 = new Food();
        addObject(food12,1,8);
        Food food13 = new Food();
        addObject(food13,1,9);
        Food food14 = new Food();
        addObject(food14,1,10);
        Food food15 = new Food();
        addObject(food15,1,11);
        Food food16 = new Food();
        addObject(food16,2,11);
        Food food17 = new Food();
        addObject(food17,2,12);
        Food food18 = new Food();
        addObject(food18,2,13);
        Food food19 = new Food();
        addObject(food19,1,13);
        Food food20 = new Food();
        addObject(food20,1,14);
        Food food21 = new Food();
        addObject(food21,1,15);
        Food food22 = new Food();
        addObject(food22,2,15);
        Food food23 = new Food();
        addObject(food23,3,15);
        Food food24 = new Food();
        addObject(food24,1,16);
        Food food25 = new Food();
        addObject(food25,1,17);
        Food food26 = new Food();
        addObject(food26,1,18);
        Food food27 = new Food();
        addObject(food27,1,19);
        Food food28 = new Food();
        addObject(food28,2,19);
        Food food29 = new Food();
        addObject(food29,3,19);
        Food food30 = new Food();
        addObject(food30,3,18);
        Food food31 = new Food();
        addObject(food31,3,17);
        Food food32 = new Food();
        addObject(food32,3,16);
        Food food33 = new Food();
        addObject(food33,4,15);
        Food food34 = new Food();
        addObject(food34,5,15);
        Food food35 = new Food();
        addObject(food35,5,16);
        Food food36 = new Food();
        addObject(food36,6,16);
        Food food37 = new Food();
        addObject(food37,6,17);
        Food food38 = new Food();
        addObject(food38,6,18);
        Food food39 = new Food();
        addObject(food39,6,19);
        Food food40 = new Food();
        addObject(food40,5,19);
        Food food41 = new Food();
        addObject(food41,4,19);
        Food food42 = new Food();
        addObject(food42,7,16);
        Food food43 = new Food();
        addObject(food43,8,16);
        Food food44 = new Food();
        addObject(food44,8,17);
        Food food45 = new Food();
        addObject(food45,8,18);
        Food food46 = new Food();
        addObject(food46,8,19);
        Food food47 = new Food();
        addObject(food47,9,19);
        Food food49 = new Food();
        addObject(food49,11,19);
        Food food50 = new Food();
        addObject(food50,12,19);
        Food food51 = new Food();
        addObject(food51,12,18);
        Food food52 = new Food();
        addObject(food52,12,17);
        Food food53 = new Food();
        addObject(food53,12,16);
        Food food54 = new Food();
        addObject(food54,11,16);
        Food food55 = new Food();
        addObject(food55,11,15);
        Food food56 = new Food();
        addObject(food56,11,14);
        Food food57 = new Food();
        addObject(food57,11,13);
        Food food58 = new Food();
        addObject(food58,11,12);
        Food food59 = new Food();
        addObject(food59,12,12);
        Food food60 = new Food();
        addObject(food60,13,12);
        Food food61 = new Food();
        addObject(food61,13,13);
        Food food62 = new Food();
        addObject(food62,13,14);
        Food food63 = new Food();
        addObject(food63,14,13);
        Food food64 = new Food();
        addObject(food64,15,13);
        Food food65 = new Food();
        addObject(food65,16,13);
        Food food66 = new Food();
        addObject(food66,16,14);
        Food food67 = new Food();
        addObject(food67,16,15);
        Food food68 = new Food();
        addObject(food68,15,15);
        Food food69 = new Food();
        addObject(food69,15,16);
        Food food70 = new Food();
        addObject(food70,14,16);
        Food food71 = new Food();
        addObject(food71,13,16);
        Food food72 = new Food();
        addObject(food72,14,17);
        Food food73 = new Food();
        addObject(food73,14,18);
        Food food74 = new Food();
        addObject(food74,14,19);
        Food food75 = new Food();
        addObject(food75,15,19);
        Food food76 = new Food();
        addObject(food76,16,19);
        Food food77 = new Food();
        addObject(food77,17,19);
        Food food78 = new Food();
        addObject(food78,17,18);
        Food food79 = new Food();
        addObject(food79,17,17);
        Food food80 = new Food();
        addObject(food80,17,16);
        Food food81 = new Food();
        addObject(food81,17,15);
        Food food82 = new Food();
        addObject(food82,18,15);
        Food food83 = new Food();
        addObject(food83,19,15);
        Food food84 = new Food();
        addObject(food84,19,16);
        Food food85 = new Food();
        addObject(food85,19,17);
        Food food86 = new Food();
        addObject(food86,19,18);
        Food food87 = new Food();
        addObject(food87,19,19);
        Food food88 = new Food();
        addObject(food88,18,19);
        Food food89 = new Food();
        addObject(food89,17,13);
        Food food90 = new Food();
        addObject(food90,18,13);
        Food food91 = new Food();
        addObject(food91,19,13);
        Food food92 = new Food();
        addObject(food92,19,14);
        Food food93 = new Food();
        addObject(food93,18,12);
        Food food94 = new Food();
        addObject(food94,18,11);
        Food food95 = new Food();
        addObject(food95,19,11);
        Food food96 = new Food();
        addObject(food96,19,10);
        Food food97 = new Food();
        addObject(food97,19,9);
        Food food98 = new Food();
        addObject(food98,18,9);
        Food food99 = new Food();
        addObject(food99,17,9);
        Food food100 = new Food();
        addObject(food100,16,9);
        Food food101 = new Food();
        addObject(food101,16,10);
        Food food102 = new Food();
        addObject(food102,16,11);
        Food food103 = new Food();
        addObject(food103,16,12);
        Food food104 = new Food();
        addObject(food104,13,11);
        Food food105 = new Food();
        addObject(food105,13,10);
        Food food106 = new Food();
        addObject(food106,13,9);
        Food food107 = new Food();
        addObject(food107,14,9);
        Food food108 = new Food();
        addObject(food108,15,9);
        Food food109 = new Food();
        addObject(food109,13,8);
        Food food110 = new Food();
        addObject(food110,13,7);
        Food food111 = new Food();
        addObject(food111,14,7);
        Food food112 = new Food();
        addObject(food112,15,7);
        Food food113 = new Food();
        addObject(food113,16,7);
        Food food114 = new Food();
        addObject(food114,16,8);
        Food food115 = new Food();
        addObject(food115,16,4);
        Food food116 = new Food();
        addObject(food116,16,5);
        Food food117 = new Food();
        addObject(food117,16,6);
        Food food118 = new Food();
        addObject(food118,17,4);
        Food food119 = new Food();
        addObject(food119,18,4);
        Food food120 = new Food();
        addObject(food120,18,3);
        Food food121 = new Food();
        addObject(food121,19,3);
        Food food122 = new Food();
        addObject(food122,19,2);
        Food food123 = new Food();
        addObject(food123,19,1);
        Food food124 = new Food();
        addObject(food124,17,1);
        Food food125 = new Food();
        addObject(food125,18,1);
        Food food126 = new Food();
        addObject(food126,18,5);
        Food food127 = new Food();
        addObject(food127,18,6);
        Food food128 = new Food();
        addObject(food128,19,6);
        Food food129 = new Food();
        addObject(food129,19,7);
        Food food130 = new Food();
        addObject(food130,19,8);
        Food food131 = new Food();
        addObject(food131,12,7);
        Food food132 = new Food();
        addObject(food132,11,7);
        Food food133 = new Food();
        addObject(food133,10,7);
        Food food134 = new Food();
        addObject(food134,9,7);
        Food food135 = new Food();
        addObject(food135,8,7);
        Food food136 = new Food();
        addObject(food136,7,7);
        Food food137 = new Food();
        addObject(food137,6,7);
        Food food138 = new Food();
        addObject(food138,5,7);
        Food food139 = new Food();
        addObject(food139,4,7);
        Food food140 = new Food();
        addObject(food140,4,6);
        Food food141 = new Food();
        addObject(food141,4,5);
        Food food142 = new Food();
        addObject(food142,4,4);
        Food food143 = new Food();
        addObject(food143,3,4);
        Food food144 = new Food();
        addObject(food144,5,4);
        Food food145 = new Food();
        addObject(food145,6,4);
        Food food146 = new Food();
        addObject(food146,6,3);
        Food food147 = new Food();
        addObject(food147,6,2);
        Food food149 = new Food();
        addObject(food149,5,1);
        Food food150 = new Food();
        addObject(food150,7,1);
        Food food151 = new Food();
        addObject(food151,8,1);
        Food food152 = new Food();
        addObject(food152,9,1);
        Food food153 = new Food();
        addObject(food153,9,2);
        Food food154 = new Food();
        addObject(food154,9,3);
        Food food155 = new Food();
        addObject(food155,9,4);
        Food food156 = new Food();
        addObject(food156,8,4);
        Food food157 = new Food();
        addObject(food157,7,4);
        Food food158 = new Food();
        addObject(food158,8,5);
        Food food159 = new Food();
        addObject(food159,8,6);
        Food food160 = new Food();
        addObject(food160,10,4);
        Food food161 = new Food();
        addObject(food161,10,5);
        Food food162 = new Food();
        addObject(food162,10,6);
        Food food163 = new Food();
        addObject(food163,11,4);
        Food food164 = new Food();
        addObject(food164,11,3);
        Food food165 = new Food();
        addObject(food165,11,2);
        Food food166 = new Food();
        addObject(food166,11,1);
        Food food167 = new Food();
        addObject(food167,10,1);
        Food food168 = new Food();
        addObject(food168,12,1);
        Food food169 = new Food();
        addObject(food169,13,1);
        Food food170 = new Food();
        addObject(food170,14,1);
        Food food171 = new Food();
        addObject(food171,14,2);
        Food food172 = new Food();
        addObject(food172,15,1);
        Food food173 = new Food();
        addObject(food173,14,3);
        Food food174 = new Food();
        addObject(food174,14,4);
        Food food175 = new Food();
        addObject(food175,15,4);
        Food food176 = new Food();
        addObject(food176,13,4);
        Food food177 = new Food();
        addObject(food177,12,4);
        Food food178 = new Food();
        addObject(food178,12,5);
        Food food179 = new Food();
        addObject(food179,12,6);
        Food food180 = new Food();
        addObject(food180,7,8);
        Food food181 = new Food();
        addObject(food181,7,9);
        Food food182 = new Food();
        addObject(food182,6,9);
        Food food183 = new Food();
        addObject(food183,5,9);
        Food food184 = new Food();
        addObject(food184,4,9);
        Food food185 = new Food();
        addObject(food185,4,8);
        Food food186 = new Food();
        addObject(food186,2,9);
        Food food187 = new Food();
        addObject(food187,3,9);
        Food food188 = new Food();
        addObject(food188,4,10);
        Food food189 = new Food();
        addObject(food189,4,11);
        Food food190 = new Food();
        addObject(food190,4,12);
        Food food191 = new Food();
        addObject(food191,4,13);
        Food food192 = new Food();
        addObject(food192,3,13);
        Food food193 = new Food();
        addObject(food193,4,14);
        Food food194 = new Food();
        addObject(food194,5,13);
        Food food195 = new Food();
        addObject(food195,6,13);
        Food food196 = new Food();
        addObject(food196,7,13);
        Food food197 = new Food();
        addObject(food197,7,14);
        Food food198 = new Food();
        addObject(food198,7,10);
        Food food199 = new Food();
        addObject(food199,7,11);
        Food food200 = new Food();
        addObject(food200,7,12);
        Food food201 = new Food();
        addObject(food201,8,12);
        Food food202 = new Food();
        addObject(food202,9,12);
        Food food203 = new Food();
        addObject(food203,9,13);
        Food food204 = new Food();
        addObject(food204,9,14);
        Food food205 = new Food();
        addObject(food205,9,15);
        Food food206 = new Food();
        addObject(food206,9,16);
        Pacman pacman = new Pacman();
        addObject(pacman,10,19);
        Ghost ghost = new Ghost();
        addObject(ghost,10,9);
        Ghost ghost2 = new Ghost();
        addObject(ghost2,9,10);
        Ghost ghost3 = new Ghost();
        addObject(ghost3,11,10);
    }
}
