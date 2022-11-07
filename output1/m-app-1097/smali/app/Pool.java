public class app.Pool extends v.V3dView {
	 /* .source "Pool.java" */
	 /* # static fields */
	 static final Boolean AUTOBREAK;
	 static final Boolean AUTOPLAY;
	 static final Integer BALLN;
	 static final Integer BALLRAD;
	 public static final Integer BLUEBUTTON120;
	 public static final Integer BLUEBUTTON50;
	 static final Integer CAMDEGK;
	 static final Integer CAMDEGT;
	 static final Integer CUELENGTH;
	 static final Integer CUESTEP;
	 static final Integer CUESTEPD;
	 static final Integer CUEWX;
	 static final Integer CUEWZ;
	 static final Integer CUEZ;
	 static final Boolean EJECT;
	 static final Integer G_8BALL;
	 static final Integer G_9BALL;
	 static final Integer G_PRACTICE;
	 static final Integer G_STRAIGHT;
	 static final Integer HOFF;
	 static final Integer HOLEN;
	 public static final Integer IDOWN;
	 public static final Integer IHIDE;
	 public static final Integer ILEFT;
	 public static final Integer IMENU;
	 public static final Integer IMINUS;
	 public static final Integer IPLUS;
	 public static final Integer IRIGHT;
	 public static final Integer ISELECT;
	 public static final Integer IUP;
	 public static final Integer M1_0001;
	 public static final Integer M1_0002;
	 public static final Integer M1_0003;
	 public static final Integer M2_0001;
	 public static final Integer M2_0002;
	 public static final Integer M2_0003;
	 static final Integer MAGIC;
	 static final Integer MAN2_0001;
	 static final Integer MENUCOLORBG;
	 public static final Integer MONEY;
	 static final Integer MOVE;
	 static final Boolean NOBREAKSHADOWS;
	 static final Boolean NODRAG;
	 static final Integer NUDGE;
	 static final Boolean ONEBALL;
	 static final Integer OP_HAPPY;
	 static final Integer OP_NORMAL;
	 static final Integer OP_SAD;
	 static final Integer OTHERM_0001;
	 static final Integer OTHERW_0001;
	 static final Integer PITCHMIN;
	 static final Integer PITCH_CLOSE;
	 public static final Integer POOLB1;
	 public static final Integer POOLB10;
	 public static final Integer POOLB11;
	 public static final Integer POOLB12;
	 public static final Integer POOLB13;
	 public static final Integer POOLB14;
	 public static final Integer POOLB15;
	 public static final Integer POOLB2;
	 public static final Integer POOLB3;
	 public static final Integer POOLB4;
	 public static final Integer POOLB5;
	 public static final Integer POOLB6;
	 public static final Integer POOLB7;
	 public static final Integer POOLB8;
	 public static final Integer POOLB9;
	 static final Integer PREFBITS;
	 static final Integer PREFS_BALL_X;
	 static final Integer PREFS_CUEANGLE;
	 static final Integer PREFS_FLAGS;
	 static final Integer PREFS_KEY;
	 static final Integer PREFS_N;
	 static final Integer PREFS_PIN;
	 static final Integer PREFS_SCORE;
	 static final Integer PREFS_TOP;
	 static final Integer PSTRING;
	 static final Integer PX;
	 static final Integer PY;
	 static final Integer PZ;
	 static final Integer RAILTIME;
	 public static final Integer ROOM_1;
	 public static final Integer ROOM_2;
	 static final Integer ROT;
	 static final Integer ROTPITCH;
	 static final Integer ROTVIEW;
	 static final Boolean SAVEBREAK;
	 static final Integer SCOREINSETX;
	 public static final Integer SHADOW;
	 static final Boolean SIMSHOW;
	 static final Integer SOUNDSPEED;
	 static final Boolean SPECULAR;
	 static final Integer STRAIGHTWIN;
	 public static final Integer TITLE;
	 static final Boolean TITLESCREEN;
	 static final Integer TOPN;
	 static final Boolean TRACE;
	 static final Boolean TRACESHOT;
	 static final Integer VELMAX;
	 public static final Integer W1_0001;
	 public static final Integer W1_0002;
	 public static final Integer W1_0003;
	 public static final Integer WOM2_0001;
	 public static final Integer WOM2_0002;
	 public static final Integer WOM2_0003;
	 static final Integer WOMAN2_0001;
	 public static final Integer WOOD;
	 static final Integer ZOOM;
	 static final Integer ZOOM_MAX;
	 static final Integer ZOOM_MIN;
	 /* # instance fields */
	 Boolean m_9ballFoul;
	 Boolean m_9ballHit;
	 Integer m_9ballNext;
	 Integer m_aimAt;
	 Boolean m_applet;
	 app.Ball m_balls;
	 Integer m_bestDist;
	 Integer m_breakCsum;
	 Integer m_breakHeight;
	 m_breakRgb;
	 Boolean m_breakView;
	 Integer m_breakWidth;
	 m_breakZbuf;
	 Integer m_camdist;
	 v.Vsprite m_cue;
	 Integer m_cueAngle;
	 app.Ball m_cueball;
	 v.Vmenu m_eject;
	 Integer m_facetime;
	 public java.lang.String m_fn;
	 Integer m_game;
	 Integer m_holeAngle;
	 Object m_keyLast;
	 Integer m_keyTime;
	 Integer m_keyTries;
	 Integer m_level;
	 v.Vilib m_lib;
	 v.Vmenu m_menu;
	 Boolean m_menuShow;
	 Integer m_opicbase;
	 v.Vsprite m_opponent;
	 v.Vphysics m_physics;
	 java.lang.String m_pin;
	 Boolean m_play8ball;
	 Boolean m_playAgain;
	 Boolean m_playBreak;
	 Boolean m_playScratch;
	 Boolean m_playSolids;
	 Boolean m_playStripes;
	 Boolean m_player;
	 Integer m_pocketed;
	 m_prefs;
	 v.Vtext m_prompt;
	 Boolean m_reset;
	 v.Vtext m_score1;
	 v.Vtext m_score2;
	 Integer m_scoredif;
	 Integer m_scoredif0;
	 v.Vdecal m_shadowDecal;
	 Integer m_spindx;
	 Integer m_spindy;
	 Integer m_spinx;
	 Integer m_spinz;
	 Boolean m_started;
	 Integer m_state;
	 v.V3dView m_table;
	 /* # direct methods */
	 public app.Pool ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 3616 */
		 /* invoke-direct {p0}, Lv/V3dView;-><init>()V */
		 /* .line 3617 */
		 /* const/16 v0, 0x20 */
		 /* iput v0, p0, Lapp/Pool;->m_opicbase:I */
		 /* .line 3618 */
		 return;
	 } // .end method
	 private final void menuGameShow ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 /* .line 2692 */
		 v0 = this.m_menu;
		 /* .line 2693 */
		 /* .local v0, "m":Lv/Vmenu; */
		 /* if-nez v0, :cond_0 */
		 /* .line 2740 */
	 } // :goto_0
	 return;
	 /* .line 2696 */
} // :cond_0
/* iget v1, v0, Lv/Vmenu;->m_square:I */
/* .line 2698 */
/* .local v1, "msq":I */
/* if-nez v1, :cond_1 */
v5 = (( v.Vmenu ) v0 ).selectedOrdinal ( ); // invoke-virtual {v0}, Lv/Vmenu;->selectedOrdinal()I
/* if-nez v5, :cond_1 */
/* .line 2699 */
/* const/16 v5, 0x39 */
(( v.Vmenu ) v0 ).select ( v5 ); // invoke-virtual {v0, v5}, Lv/Vmenu;->select(I)V
/* .line 2702 */
} // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 2703 */
int v2 = 0; // const/4 v2, 0x0
/* .line 2704 */
/* .local v2, "x":I */
/* iget v5, p0, Lapp/Pool;->m_width:I */
/* iget v6, p0, Lapp/Pool;->m_height:I */
(( v.Vmenu ) v0 ).resize ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Lv/Vmenu;->resize(II)V
/* .line 2706 */
v5 = (( v.Vmenu ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lv/Vmenu;->isLinked()Z
/* if-nez v5, :cond_2 */
/* .line 2707 */
(( app.Pool ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 2712 */
} // :cond_2
} // :goto_1
/* iget-boolean v5, p0, Lapp/Pool;->m_menuShow:Z */
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 2713 */
/* iget v5, p0, Lapp/Pool;->m_height:I */
v6 = (( v.Vmenu ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lv/Vmenu;->getHeight()I
/* sub-int v4, v5, v6 */
/* .line 2733 */
/* .local v4, "y":I */
} // :goto_2
/* if-nez v1, :cond_3 */
v5 = (( v.Vmenu ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lv/Vmenu;->isLinked()Z
/* if-nez v5, :cond_3 */
/* .line 2734 */
(( app.Pool ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 2739 */
} // :cond_3
(( v.Vmenu ) v0 ).setXyi ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Lv/Vmenu;->setXyi(II)V
/* .line 2710 */
} // .end local v2 # "x":I
} // .end local v4 # "y":I
} // :cond_4
/* iget v5, p0, Lapp/Pool;->m_width:I */
v6 = (( v.Vmenu ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lv/Vmenu;->getWidth()I
/* sub-int v2, v5, v6 */
/* .restart local v2 # "x":I */
/* .line 2716 */
} // :cond_5
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 2720 */
v5 = this.m_child;
/* iget v5, v5, Lv/Vsprite;->m_sx:I */
/* shr-int/lit8 v3, v5, 0xf */
/* .line 2722 */
/* .local v3, "xoff":I */
v5 = this.m_child;
int v6 = 0; // const/4 v6, 0x0
(( v.Vsprite ) v5 ).setXyi ( v3, v6 ); // invoke-virtual {v5, v3, v6}, Lv/Vsprite;->setXyi(II)V
/* .line 2724 */
/* iput v1, v0, Lv/Vmenu;->m_width:I */
/* .line 2726 */
/* iget v5, p0, Lapp/Pool;->m_height:I */
/* sub-int/2addr v5, v1 */
/* sub-int v4, v5, v3 */
/* .restart local v4 # "y":I */
/* .line 2729 */
} // .end local v3 # "xoff":I
} // .end local v4 # "y":I
} // :cond_6
/* iget v5, p0, Lapp/Pool;->m_height:I */
v6 = this.m_child;
v6 = (( v.Vsprite ) v6 ).getHeight ( ); // invoke-virtual {v6}, Lv/Vsprite;->getHeight()I
/* sub-int/2addr v5, v6 */
v6 = this.m_child;
/* iget v6, v6, Lv/Vsprite;->m_sy:I */
/* shr-int/lit8 v6, v6, 0xe */
/* sub-int v4, v5, v6 */
/* .restart local v4 # "y":I */
} // .end method
/* # virtual methods */
void aimAt ( Integer p0 ) {
/* .locals 5 */
/* .param p1, "dir" # I */
/* .prologue */
/* .line 397 */
} // :cond_0
/* iget v3, p0, Lapp/Pool;->m_aimAt:I */
/* add-int/2addr v3, p1 */
/* iput v3, p0, Lapp/Pool;->m_aimAt:I */
/* .line 399 */
/* iget v3, p0, Lapp/Pool;->m_aimAt:I */
/* if-gez v3, :cond_3 */
/* .line 400 */
/* const/16 v3, 0xe */
/* iput v3, p0, Lapp/Pool;->m_aimAt:I */
/* .line 404 */
} // :cond_1
} // :goto_0
v3 = this.m_balls;
/* iget v4, p0, Lapp/Pool;->m_aimAt:I */
/* aget-object v2, v3, v4 */
/* .line 406 */
/* .local v2, "p":Lapp/Ball; */
v3 = (( app.Ball ) v2 ).isLinked ( ); // invoke-virtual {v2}, Lapp/Ball;->isLinked()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 408 */
/* iget v0, v2, Lapp/Ball;->m_wx:I */
/* .line 409 */
/* .local v0, "bx":I */
/* iget v1, v2, Lapp/Ball;->m_wz:I */
/* .line 412 */
/* .local v1, "bz":I */
v3 = this.m_cueball;
v3 = (( app.Pool ) p0 ).angleBetween ( v3, v0, v1 ); // invoke-virtual {p0, v3, v0, v1}, Lapp/Pool;->angleBetween(Lv/Vsprite;II)I
(( app.Pool ) p0 ).cueAngle ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->cueAngle(I)V
/* .line 414 */
final String v3 = "Ball "; // const-string v3, "Ball "
/* iget v4, p0, Lapp/Pool;->m_aimAt:I */
/* add-int/lit8 v4, v4, 0x1 */
(( app.Pool ) p0 ).prompt ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lapp/Pool;->prompt(Ljava/lang/String;I)V
/* .line 416 */
/* iget-boolean v3, p0, Lapp/Pool;->m_breakView:Z */
/* if-nez v3, :cond_2 */
/* .line 418 */
/* iget v3, p0, Lapp/Pool;->m_cueAngle:I */
/* iput v3, p0, Lapp/Pool;->m_heading:I */
/* .line 419 */
(( app.Pool ) p0 ).lookAt ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt()V
/* .line 422 */
} // :cond_2
return;
/* .line 401 */
} // .end local v0 # "bx":I
} // .end local v1 # "bz":I
} // .end local v2 # "p":Lapp/Ball;
} // :cond_3
/* iget v3, p0, Lapp/Pool;->m_aimAt:I */
/* const/16 v4, 0xf */
/* if-lt v3, v4, :cond_1 */
/* .line 402 */
int v3 = 0; // const/4 v3, 0x0
/* iput v3, p0, Lapp/Pool;->m_aimAt:I */
} // .end method
Integer angleBetween ( v.Vsprite p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "a" # Lv/Vsprite; */
/* .param p2, "x" # I */
/* .param p3, "z" # I */
/* .prologue */
/* .line 430 */
/* iget v0, p1, Lv/Vsprite;->m_wx:I */
/* sub-int v0, p2, v0 */
/* iget v1, p1, Lv/Vsprite;->m_wz:I */
/* sub-int v1, p3, v1 */
v0 = (( app.Pool ) p0 ).fatan2 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lapp/Pool;->fatan2(II)I
} // .end method
Integer angleBetween ( v.Vsprite p0, v.Vsprite p1 ) {
/* .locals 2 */
/* .param p1, "a" # Lv/Vsprite; */
/* .param p2, "b" # Lv/Vsprite; */
/* .prologue */
/* .line 434 */
/* iget v0, p2, Lv/Vsprite;->m_wx:I */
/* iget v1, p2, Lv/Vsprite;->m_wz:I */
v0 = (( app.Pool ) p0 ).angleBetween ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lapp/Pool;->angleBetween(Lv/Vsprite;II)I
} // .end method
void ballInHand ( ) {
/* .locals 11 */
/* .prologue */
int v10 = 1; // const/4 v10, 0x1
/* const v9, -0xb7000 */
/* const v7, -0x177000 */
int v8 = 0; // const/4 v8, 0x0
/* const v6, 0x8000 */
/* .line 439 */
final String v4 = "Ball In Hand"; // const-string v4, "Ball In Hand"
(( app.Pool ) p0 ).prompt ( v4 ); // invoke-virtual {p0, v4}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 441 */
(( app.Pool ) p0 ).menuOff ( ); // invoke-virtual {p0}, Lapp/Pool;->menuOff()V
/* .line 444 */
(( app.Pool ) p0 ).breakViewSettings ( ); // invoke-virtual {p0}, Lapp/Pool;->breakViewSettings()V
/* .line 446 */
v4 = this.m_cue;
(( v.Vsprite ) v4 ).off ( ); // invoke-virtual {v4}, Lv/Vsprite;->off()V
/* .line 447 */
v0 = this.m_cueball;
/* .line 449 */
/* .local v0, "b":Lapp/Ball; */
} // :goto_0
v4 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
/* if-nez v4, :cond_2 */
/* .line 513 */
} // :cond_0
v4 = this.m_prompt;
(( v.Vtext ) v4 ).off ( ); // invoke-virtual {v4}, Lv/Vtext;->off()V
/* .line 515 */
v4 = (( app.Ball ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lapp/Ball;->isLinked()Z
/* if-nez v4, :cond_1 */
/* .line 516 */
(( app.Pool ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 519 */
} // :cond_1
(( app.Pool ) p0 ).bestShot ( ); // invoke-virtual {p0}, Lapp/Pool;->bestShot()I
/* .line 521 */
v4 = this.m_cue;
/* iget v5, v0, Lapp/Ball;->m_wx:I */
/* const v6, 0xb000 */
/* iget v7, v0, Lapp/Ball;->m_wz:I */
(( v.Vsprite ) v4 ).setWxyz ( v5, v6, v7 ); // invoke-virtual {v4, v5, v6, v7}, Lv/Vsprite;->setWxyz(III)V
/* .line 522 */
(( app.Pool ) p0 ).cueRotate ( v8 ); // invoke-virtual {p0, v8}, Lapp/Pool;->cueRotate(I)V
/* .line 523 */
v4 = this.m_cue;
(( app.Pool ) p0 ).add ( v4 ); // invoke-virtual {p0, v4}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 527 */
/* iget v4, p0, Lapp/Pool;->m_cueAngle:I */
/* iput v4, p0, Lapp/Pool;->m_heading:I */
/* .line 528 */
(( app.Pool ) p0 ).lookAt0 ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt0()V
/* .line 531 */
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* .line 533 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* .line 534 */
return;
/* .line 450 */
} // :cond_2
(( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
/* .line 453 */
v1 = (( app.Pool ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lapp/Pool;->keyGet()C
/* .line 455 */
/* .local v1, "key":C */
/* iget v4, p0, Lapp/Pool;->m_dragx:I */
/* if-nez v4, :cond_3 */
/* iget v4, p0, Lapp/Pool;->m_dragy:I */
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 456 */
} // :cond_3
/* iget v4, p0, Lapp/Pool;->m_mousex:I */
/* iget v5, p0, Lapp/Pool;->m_dragx:I */
/* add-int/2addr v4, v5 */
/* iput v4, p0, Lapp/Pool;->m_mousex:I */
/* .line 457 */
/* iget v4, p0, Lapp/Pool;->m_mousey:I */
/* iget v5, p0, Lapp/Pool;->m_dragy:I */
/* add-int/2addr v4, v5 */
/* iput v4, p0, Lapp/Pool;->m_mousey:I */
/* .line 458 */
/* iput v8, p0, Lapp/Pool;->m_dragx:I */
/* .line 459 */
/* iput v8, p0, Lapp/Pool;->m_dragy:I */
/* .line 460 */
(( app.Pool ) p0 ).mouseToWorld ( ); // invoke-virtual {p0}, Lapp/Pool;->mouseToWorld()Lv/Vector;
/* .line 461 */
/* .local v2, "v":Lv/Vector; */
/* iget v4, v2, Lv/Vector;->m_x:I */
/* iput v4, v0, Lapp/Ball;->m_wx:I */
/* .line 462 */
/* iget v4, v2, Lv/Vector;->m_z:I */
/* iput v4, v0, Lapp/Ball;->m_wz:I */
/* .line 465 */
} // .end local v2 # "v":Lv/Vector;
} // :cond_4
int v4 = 5; // const/4 v4, 0x5
/* if-ne v1, v4, :cond_6 */
/* iget v4, p0, Lapp/Pool;->m_mousex:I */
/* if-nez v4, :cond_5 */
/* iget v4, p0, Lapp/Pool;->m_mousey:I */
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 466 */
} // :cond_5
(( app.Pool ) p0 ).mouseToWorld ( ); // invoke-virtual {p0}, Lapp/Pool;->mouseToWorld()Lv/Vector;
/* .line 467 */
/* .restart local v2 # "v":Lv/Vector; */
/* iget v4, v2, Lv/Vector;->m_x:I */
/* iput v4, v0, Lapp/Ball;->m_wx:I */
/* .line 468 */
/* iget v4, v2, Lv/Vector;->m_z:I */
/* iput v4, v0, Lapp/Ball;->m_wz:I */
/* .line 471 */
} // .end local v2 # "v":Lv/Vector;
} // :cond_6
v4 = (( app.Pool ) p0 ).keyPress ( v1, v10 ); // invoke-virtual {p0, v1, v10}, Lapp/Pool;->keyPress(CC)Z
/* if-nez v4, :cond_7 */
/* const/16 v4, 0x34 */
v4 = (( app.Pool ) p0 ).keyPress ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Lapp/Pool;->keyPress(CC)Z
if ( v4 != null) { // if-eqz v4, :cond_f
/* .line 472 */
} // :cond_7
/* iget v4, v0, Lapp/Ball;->m_wx:I */
/* sub-int/2addr v4, v6 */
/* iput v4, v0, Lapp/Ball;->m_wx:I */
/* .line 476 */
} // :cond_8
} // :goto_1
int v4 = 3; // const/4 v4, 0x3
v4 = (( app.Pool ) p0 ).keyPress ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Lapp/Pool;->keyPress(CC)Z
/* if-nez v4, :cond_9 */
/* const/16 v4, 0x32 */
v4 = (( app.Pool ) p0 ).keyPress ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Lapp/Pool;->keyPress(CC)Z
if ( v4 != null) { // if-eqz v4, :cond_11
/* .line 477 */
} // :cond_9
/* iget v4, v0, Lapp/Ball;->m_wz:I */
/* add-int/2addr v4, v6 */
/* iput v4, v0, Lapp/Ball;->m_wz:I */
/* .line 481 */
} // :cond_a
} // :goto_2
/* iget v4, v0, Lapp/Ball;->m_wx:I */
/* if-ge v4, v9, :cond_13 */
/* .line 482 */
/* iput v9, v0, Lapp/Ball;->m_wx:I */
/* .line 486 */
} // :cond_b
} // :goto_3
/* const/high16 v3, -0xc0000 */
/* .line 487 */
/* .local v3, "z0":I */
/* iget v4, p0, Lapp/Pool;->m_game:I */
/* if-eq v4, v10, :cond_c */
/* iget v4, p0, Lapp/Pool;->m_game:I */
int v5 = 3; // const/4 v5, 0x3
/* if-ne v4, v5, :cond_d */
} // :cond_c
/* iget-boolean v4, p0, Lapp/Pool;->m_playBreak:Z */
/* if-nez v4, :cond_d */
/* .line 488 */
/* const v3, 0x177000 */
/* .line 490 */
} // :cond_d
/* iget v4, v0, Lapp/Ball;->m_wz:I */
/* if-le v4, v3, :cond_14 */
/* .line 491 */
/* iput v3, v0, Lapp/Ball;->m_wz:I */
/* .line 495 */
} // :cond_e
} // :goto_4
/* iget v4, v0, Lapp/Ball;->m_wx:I */
/* iget v5, v0, Lapp/Ball;->m_wz:I */
(( app.Pool ) p0 ).ballPlace ( v0, v4, v5 ); // invoke-virtual {p0, v0, v4, v5}, Lapp/Pool;->ballPlace(Lapp/Ball;II)V
/* .line 497 */
int v4 = 5; // const/4 v4, 0x5
/* if-eq v1, v4, :cond_0 */
int v4 = 6; // const/4 v4, 0x6
/* if-eq v1, v4, :cond_0 */
/* const/16 v4, 0x8 */
/* if-eq v1, v4, :cond_0 */
/* const/16 v4, 0xa */
/* if-eq v1, v4, :cond_0 */
/* const/16 v4, 0x20 */
/* if-eq v1, v4, :cond_0 */
/* const/16 v4, 0x30 */
/* if-eq v1, v4, :cond_0 */
/* const/16 v4, 0x35 */
/* if-eq v1, v4, :cond_0 */
/* const/16 v4, 0x2a */
/* if-eq v1, v4, :cond_0 */
/* .line 501 */
v4 = (( app.Ball ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lapp/Ball;->isLinked()Z
if ( v4 != null) { // if-eqz v4, :cond_15
/* .line 502 */
(( app.Ball ) v0 ).off ( ); // invoke-virtual {v0}, Lapp/Ball;->off()V
/* .line 509 */
} // :goto_5
(( app.Pool ) p0 ).render ( ); // invoke-virtual {p0}, Lapp/Pool;->render()V
/* .line 510 */
/* const/16 v4, 0x3e */
(( app.Pool ) p0 ).waitMs ( v4 ); // invoke-virtual {p0, v4}, Lapp/Pool;->waitMs(I)V
/* goto/16 :goto_0 */
/* .line 473 */
} // .end local v3 # "z0":I
} // :cond_f
int v4 = 2; // const/4 v4, 0x2
v4 = (( app.Pool ) p0 ).keyPress ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Lapp/Pool;->keyPress(CC)Z
/* if-nez v4, :cond_10 */
/* const/16 v4, 0x36 */
v4 = (( app.Pool ) p0 ).keyPress ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Lapp/Pool;->keyPress(CC)Z
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 474 */
} // :cond_10
/* iget v4, v0, Lapp/Ball;->m_wx:I */
/* add-int/2addr v4, v6 */
/* iput v4, v0, Lapp/Ball;->m_wx:I */
/* .line 478 */
} // :cond_11
int v4 = 4; // const/4 v4, 0x4
v4 = (( app.Pool ) p0 ).keyPress ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Lapp/Pool;->keyPress(CC)Z
/* if-nez v4, :cond_12 */
/* const/16 v4, 0x38 */
v4 = (( app.Pool ) p0 ).keyPress ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Lapp/Pool;->keyPress(CC)Z
if ( v4 != null) { // if-eqz v4, :cond_a
/* .line 479 */
} // :cond_12
/* iget v4, v0, Lapp/Ball;->m_wz:I */
/* sub-int/2addr v4, v6 */
/* iput v4, v0, Lapp/Ball;->m_wz:I */
/* .line 483 */
} // :cond_13
/* iget v4, v0, Lapp/Ball;->m_wx:I */
/* const v5, 0xb7000 */
/* if-le v4, v5, :cond_b */
/* .line 484 */
/* const v4, 0xb7000 */
/* iput v4, v0, Lapp/Ball;->m_wx:I */
/* goto/16 :goto_3 */
/* .line 492 */
/* .restart local v3 # "z0":I */
} // :cond_14
/* iget v4, v0, Lapp/Ball;->m_wz:I */
/* if-ge v4, v7, :cond_e */
/* .line 493 */
/* iput v7, v0, Lapp/Ball;->m_wz:I */
/* .line 507 */
} // :cond_15
(( app.Pool ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->add(Lv/Vsprite;)V
} // .end method
Integer ballIntersect ( app.Ball p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .param p1, "p" # Lapp/Ball; */
/* .param p2, "x" # I */
/* .param p3, "z" # I */
/* .prologue */
/* .line 538 */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
/* const/16 v4, 0xf */
/* if-lt v3, v4, :cond_0 */
/* .line 548 */
int v4 = -1; // const/4 v4, -0x1
} // :goto_1
/* .line 539 */
} // :cond_0
v4 = this.m_balls;
/* aget-object v0, v4, v3 */
/* .line 540 */
/* .local v0, "b":Lapp/Ball; */
/* if-eq v0, p1, :cond_1 */
v4 = (( app.Ball ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lapp/Ball;->isLinked()Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 541 */
/* iget v4, v0, Lapp/Ball;->m_wx:I */
/* sub-int v1, v4, p2 */
/* .line 542 */
/* .local v1, "dx":I */
/* iget v4, v0, Lapp/Ball;->m_wz:I */
/* sub-int v2, v4, p3 */
/* .line 543 */
/* .local v2, "dz":I */
v4 = app.Pool .fmul ( v1,v1 );
v5 = app.Pool .fmul ( v2,v2 );
/* add-int/2addr v4, v5 */
/* const v5, 0x28800 */
/* if-ge v4, v5, :cond_1 */
/* move v4, v3 */
/* .line 544 */
/* .line 538 */
} // .end local v1 # "dx":I
} // .end local v2 # "dz":I
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
} // .end method
void ballPlace ( app.Ball p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "p" # Lapp/Ball; */
/* .param p2, "x" # I */
/* .param p3, "z" # I */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 553 */
(( app.Ball ) p1 ).setVelocity ( v0, v0, v0 ); // invoke-virtual {p1, v0, v0, v0}, Lapp/Ball;->setVelocity(III)V
/* .line 555 */
} // :goto_0
v0 = (( app.Pool ) p0 ).ballIntersect ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lapp/Pool;->ballIntersect(Lapp/Ball;II)I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_1 */
/* .line 558 */
/* const v0, 0x177000 */
/* if-le p3, v0, :cond_0 */
/* .line 559 */
/* const p3, 0x177000 */
/* .line 561 */
} // :cond_0
/* const v0, 0xb000 */
(( app.Ball ) p1 ).setWxyz ( p2, v0, p3 ); // invoke-virtual {p1, p2, v0, p3}, Lapp/Ball;->setWxyz(III)V
/* .line 562 */
return;
/* .line 556 */
} // :cond_1
/* const v0, 0x8000 */
/* add-int/2addr p3, v0 */
} // .end method
Integer bestShot ( ) {
/* .locals 30 */
/* .prologue */
/* .line 571 */
int v7 = 0; // const/4 v7, 0x0
/* .line 572 */
/* .local v7, "ball0":I */
/* const/16 v9, 0xf */
/* .line 574 */
/* .local v9, "balln":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v27, v0 */
/* if-nez v27, :cond_a */
/* .line 575 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playStripes:Z */
/* move/from16 v27, v0 */
if ( v27 != null) { // if-eqz v27, :cond_7
/* .line 576 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v27, v0 */
if ( v27 != null) { // if-eqz v27, :cond_6
/* .line 577 */
/* const/16 v7, 0x8 */
/* .line 578 */
/* const/16 v9, 0xf */
/* .line 597 */
} // :cond_0
} // :goto_0
/* move v8, v7 */
/* .local v8, "balli":I */
} // :goto_1
/* if-lt v8, v9, :cond_9 */
/* .line 601 */
} // :cond_1
/* if-ne v8, v9, :cond_2 */
/* .line 603 */
int v7 = 7; // const/4 v7, 0x7
/* .line 604 */
/* const/16 v9, 0x8 */
/* .line 614 */
} // .end local v8 # "balli":I
} // :cond_2
} // :goto_2
/* const/16 v17, -0x1 */
/* .line 615 */
/* .local v17, "hmin":I */
int v10 = -1; // const/4 v10, -0x1
/* .line 616 */
/* .local v10, "bmin":I */
int v11 = 0; // const/4 v11, 0x0
/* .line 617 */
/* .local v11, "bx":I */
int v12 = 0; // const/4 v12, 0x0
/* .line 618 */
/* .local v12, "bz":I */
/* const v16, 0x7fffffff */
/* .line 619 */
/* .local v16, "dmin":I */
/* const v20, 0x7fffffff */
/* .line 623 */
/* .local v20, "scoremin":I */
/* move v8, v7 */
/* .restart local v8 # "balli":I */
} // :goto_3
/* if-lt v8, v9, :cond_b */
/* .line 759 */
} // :cond_3
/* move v0, v10 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_aimAt:I */
/* .line 765 */
/* const/16 v27, -0x1 */
/* move v0, v10 */
/* move/from16 v1, v27 */
/* if-eq v0, v1, :cond_5 */
/* .line 766 */
/* const v27, 0x7ffffffe */
/* move/from16 v0, v16 */
/* move/from16 v1, v27 */
/* if-lt v0, v1, :cond_4 */
/* .line 775 */
/* const/high16 v27, 0x190000 */
/* const/high16 v28, 0x280000 */
v16 = /* invoke-static/range {v27 ..v28}, Lapp/Pool;->franRange(II)I */
/* .line 781 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v27, v0 */
/* if-nez v27, :cond_4 */
/* .line 782 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v27, v0 */
/* const/16 v28, 0x3 */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-ne v0, v1, :cond_4 */
/* .line 783 */
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v27, v0 */
/* aget-object v6, v27, v10 */
/* .line 784 */
/* .local v6, "b":Lapp/Ball; */
/* move-object v0, v6 */
/* iget v0, v0, Lapp/Ball;->m_wx:I */
/* move/from16 v22, v0 */
/* .line 785 */
/* .local v22, "x1":I */
/* move-object v0, v6 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v25, v0 */
/* .line 790 */
/* .local v25, "z1":I */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v27, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v27 */
/* move-object v2, v6 */
/* move/from16 v3, v22 */
/* move/from16 v4, v25 */
v27 = (( app.Pool ) v0 ).clearShot ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lapp/Pool;->clearShot(Lapp/Ball;Lapp/Ball;II)Z
/* if-nez v27, :cond_4 */
/* .line 799 */
/* if-lez v22, :cond_18 */
/* .line 800 */
/* const v27, 0xb7000 */
/* const v28, 0xb7000 */
/* sub-int v28, v28, v22 */
/* add-int v23, v27, v28 */
/* .line 804 */
/* .local v23, "x2":I */
} // :goto_4
/* move/from16 v26, v25 */
/* .line 806 */
/* .local v26, "z2":I */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v27, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v27 */
/* move-object v2, v6 */
/* move/from16 v3, v23 */
/* move/from16 v4, v26 */
v27 = (( app.Pool ) v0 ).clearShot ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lapp/Pool;->clearShot(Lapp/Ball;Lapp/Ball;II)Z
if ( v27 != null) { // if-eqz v27, :cond_19
/* .line 807 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v23 */
/* move/from16 v2, v26 */
/* move/from16 v3, v16 */
v27 = (( app.Pool ) v0 ).simulate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->simulate(III)I
/* const v28, 0x7fffffff */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-eq v0, v1, :cond_19 */
/* .line 809 */
/* move/from16 v11, v23 */
/* .line 810 */
/* move/from16 v12, v26 */
/* .line 834 */
} // .end local v6 # "b":Lapp/Ball;
} // .end local v22 # "x1":I
} // .end local v23 # "x2":I
} // .end local v25 # "z1":I
} // .end local v26 # "z2":I
} // :cond_4
} // :goto_5
/* move/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_bestDist:I */
/* .line 836 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v27, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v27 */
/* move v2, v11 */
/* move v3, v12 */
v27 = (( app.Pool ) v0 ).angleBetween ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->angleBetween(Lv/Vsprite;II)I
/* move-object/from16 v0, p0 */
/* move/from16 v1, v27 */
(( app.Pool ) v0 ).cueAngle ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->cueAngle(I)V
/* .line 844 */
} // :cond_5
/* .line 581 */
} // .end local v8 # "balli":I
} // .end local v10 # "bmin":I
} // .end local v11 # "bx":I
} // .end local v12 # "bz":I
} // .end local v16 # "dmin":I
} // .end local v17 # "hmin":I
} // .end local v20 # "scoremin":I
} // :cond_6
int v7 = 0; // const/4 v7, 0x0
/* .line 582 */
int v9 = 7; // const/4 v9, 0x7
/* goto/16 :goto_0 */
/* .line 585 */
} // :cond_7
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playSolids:Z */
/* move/from16 v27, v0 */
if ( v27 != null) { // if-eqz v27, :cond_0
/* .line 586 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v27, v0 */
if ( v27 != null) { // if-eqz v27, :cond_8
/* .line 587 */
int v7 = 0; // const/4 v7, 0x0
/* .line 588 */
int v9 = 7; // const/4 v9, 0x7
/* goto/16 :goto_0 */
/* .line 591 */
} // :cond_8
/* const/16 v7, 0x8 */
/* .line 592 */
/* const/16 v9, 0xf */
/* goto/16 :goto_0 */
/* .line 598 */
/* .restart local v8 # "balli":I */
} // :cond_9
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v27, v0 */
/* aget-object v27, v27, v8 */
v27 = /* invoke-virtual/range {v27 ..v27}, Lapp/Ball;->isLinked()Z */
/* if-nez v27, :cond_1 */
/* .line 597 */
/* add-int/lit8 v8, v8, 0x1 */
/* goto/16 :goto_1 */
/* .line 607 */
} // .end local v8 # "balli":I
} // :cond_a
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v27, v0 */
/* const/16 v28, 0x3 */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-ne v0, v1, :cond_2 */
/* .line 608 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_9ballNext:I */
/* move v7, v0 */
/* .line 609 */
/* add-int/lit8 v9, v7, 0x1 */
/* goto/16 :goto_2 */
/* .line 624 */
/* .restart local v8 # "balli":I */
/* .restart local v10 # "bmin":I */
/* .restart local v11 # "bx":I */
/* .restart local v12 # "bz":I */
/* .restart local v16 # "dmin":I */
/* .restart local v17 # "hmin":I */
/* .restart local v20 # "scoremin":I */
} // :cond_b
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v27, v0 */
/* aget-object v6, v27, v8 */
/* .line 625 */
/* .restart local v6 # "b":Lapp/Ball; */
v27 = (( app.Ball ) v6 ).isLinked ( ); // invoke-virtual {v6}, Lapp/Ball;->isLinked()Z
if ( v27 != null) { // if-eqz v27, :cond_d
/* .line 628 */
/* const v27, 0x7fffffff */
/* move/from16 v0, v16 */
/* move/from16 v1, v27 */
/* if-ne v0, v1, :cond_c */
/* .line 630 */
/* const v16, 0x7ffffffe */
/* .line 631 */
/* move v10, v8 */
/* .line 632 */
/* iget v11, v6, Lapp/Ball;->m_wx:I */
/* .line 633 */
/* iget v12, v6, Lapp/Ball;->m_wz:I */
/* .line 636 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_level:I */
/* move/from16 v27, v0 */
/* if-nez v27, :cond_c */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_scoredif:I */
/* move/from16 v27, v0 */
/* if-gez v27, :cond_c */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v27, v0 */
/* const/16 v28, 0x3 */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-eq v0, v1, :cond_c */
v27 = app.Pool .fran ( );
/* const/16 v28, 0x4000 */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-lt v0, v1, :cond_3 */
/* .line 642 */
} // :cond_c
/* const/16 v18, 0x0 */
/* .local v18, "hole":I */
} // :goto_6
/* const/16 v27, 0x6 */
/* move/from16 v0, v18 */
/* move/from16 v1, v27 */
/* if-lt v0, v1, :cond_e */
/* .line 623 */
} // .end local v18 # "hole":I
} // :cond_d
/* add-int/lit8 v8, v8, 0x1 */
/* goto/16 :goto_3 */
/* .line 644 */
/* .restart local v18 # "hole":I */
} // :cond_e
/* move-object/from16 v0, p0 */
/* move-object v1, v6 */
/* move/from16 v2, v18 */
v13 = (( app.Pool ) v0 ).clearShotToHole ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lapp/Pool;->clearShotToHole(Lapp/Ball;I)I
/* .line 646 */
/* .local v13, "d":I */
/* const v27, 0x7fffffff */
/* move v0, v13 */
/* move/from16 v1, v27 */
/* if-eq v0, v1, :cond_16 */
/* .line 649 */
/* move-object v0, v6 */
/* iget v0, v0, Lapp/Ball;->m_wx:I */
/* move/from16 v21, v0 */
/* .line 650 */
/* .local v21, "x":I */
/* move-object v0, v6 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v24, v0 */
/* .line 652 */
/* .local v24, "z":I */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v27, v0 */
/* if-nez v27, :cond_11 */
/* .line 657 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_holeAngle:I */
/* move/from16 v27, v0 */
/* move/from16 v0, v27 */
/* add-int/lit16 v0, v0, 0x4000 */
/* move v5, v0 */
/* .line 659 */
/* .local v5, "a":I */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v27, v0 */
/* if-nez v27, :cond_10 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_level:I */
/* move/from16 v27, v0 */
/* const/16 v28, 0x3 */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-ge v0, v1, :cond_10 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_scoredif:I */
/* move/from16 v27, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_level:I */
/* move/from16 v28, v0 */
/* move/from16 v0, v28 */
/* neg-int v0, v0 */
/* move/from16 v28, v0 */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-gt v0, v1, :cond_10 */
/* .line 661 */
/* const/16 v27, 0x3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_level:I */
/* move/from16 v28, v0 */
/* sub-int v27, v27, v28 */
/* mul-int/lit8 v27, v27, 0x4 */
/* mul-int/lit8 v15, v27, 0x5b */
/* .line 664 */
/* .local v15, "dg":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v27, v0 */
/* const/16 v28, 0x3 */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-ne v0, v1, :cond_f */
/* .line 665 */
/* shr-int/lit8 v15, v15, 0x1 */
/* .line 667 */
} // :cond_f
/* move v0, v15 */
/* neg-int v0, v0 */
/* move/from16 v27, v0 */
/* move/from16 v0, v27 */
/* move v1, v15 */
v27 = app.Pool .franRange ( v0,v1 );
/* add-int v5, v5, v27 */
/* .line 670 */
} // .end local v15 # "dg":I
} // :cond_10
/* const v27, 0x12000 */
v28 = app.Pool .fsin ( v5 );
v27 = /* invoke-static/range {v27 ..v28}, Lapp/Pool;->fmul(II)I */
/* add-int v21, v21, v27 */
/* .line 671 */
/* const v27, 0x12000 */
v28 = app.Pool .fcos ( v5 );
v27 = /* invoke-static/range {v27 ..v28}, Lapp/Pool;->fmul(II)I */
/* add-int v24, v24, v27 */
/* .line 677 */
} // .end local v5 # "a":I
} // :cond_11
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v27, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v27 */
/* move-object v2, v6 */
/* move/from16 v3, v21 */
/* move/from16 v4, v24 */
v27 = (( app.Pool ) v0 ).clearShot ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lapp/Pool;->clearShot(Lapp/Ball;Lapp/Ball;II)Z
if ( v27 != null) { // if-eqz v27, :cond_16
/* .line 679 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v27, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v27 */
/* move/from16 v2, v21 */
/* move/from16 v3, v24 */
v5 = (( app.Pool ) v0 ).angleBetween ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->angleBetween(Lv/Vsprite;II)I
/* .line 681 */
/* .restart local v5 # "a":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_holeAngle:I */
/* move/from16 v27, v0 */
/* sub-int v27, v27, v5 */
/* move/from16 v0, v27 */
/* and-int/lit16 v0, v0, 0x7fff */
/* move v14, v0 */
/* .line 684 */
/* .local v14, "da":I */
/* const/16 v27, 0x4000 */
/* move v0, v14 */
/* move/from16 v1, v27 */
/* if-le v0, v1, :cond_12 */
/* .line 685 */
/* const v27, 0x8000 */
/* sub-int v14, v27, v14 */
/* .line 692 */
} // :cond_12
/* const/16 v27, 0xfff */
/* move v0, v14 */
/* move/from16 v1, v27 */
/* if-le v0, v1, :cond_13 */
/* .line 693 */
/* const/high16 v27, 0x60000 */
/* add-int v13, v13, v27 */
/* .line 696 */
} // :cond_13
/* const/16 v27, 0x1554 */
/* move v0, v14 */
/* move/from16 v1, v27 */
/* if-ge v0, v1, :cond_16 */
/* .line 701 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v27, v0 */
/* move-object/from16 v0, v27 */
/* iget v0, v0, Lapp/Ball;->m_wx:I */
/* move/from16 v27, v0 */
/* sub-int v27, v27, v21 */
/* const/16 v28, 0x0 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v29, v0 */
/* move-object/from16 v0, v29 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v29, v0 */
/* sub-int v29, v29, v24 */
v27 = /* invoke-static/range {v27 ..v29}, Lv/Vector;->magnitudeApprox(III)I */
/* add-int v13, v13, v27 */
/* .line 704 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v27, v0 */
/* if-nez v27, :cond_15 */
/* .line 706 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
/* move/from16 v2, v24 */
/* move v3, v13 */
v19 = (( app.Pool ) v0 ).simulate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->simulate(III)I
/* .line 708 */
/* .local v19, "score":I */
/* const v27, 0x7fffffff */
/* move/from16 v0, v19 */
/* move/from16 v1, v27 */
/* if-ne v0, v1, :cond_14 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v27, v0 */
/* const/16 v28, 0x3 */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-ne v0, v1, :cond_14 */
/* .line 711 */
/* const/16 v27, 0x1 */
/* move/from16 v0, v27 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spindx:I */
/* .line 712 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
/* move/from16 v2, v24 */
/* move v3, v13 */
v19 = (( app.Pool ) v0 ).simulate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->simulate(III)I
/* .line 714 */
/* const v27, 0x7fffffff */
/* move/from16 v0, v19 */
/* move/from16 v1, v27 */
/* if-eq v0, v1, :cond_14 */
/* move/from16 v0, v19 */
/* move/from16 v1, v20 */
/* if-ge v0, v1, :cond_14 */
/* .line 718 */
/* const/16 v27, 0x1 */
/* move/from16 v0, v27 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spindx:I */
/* .line 722 */
} // :cond_14
/* move/from16 v0, v19 */
/* move v1, v13 */
/* if-ge v0, v1, :cond_17 */
/* .line 724 */
/* move/from16 v0, v19 */
/* move/from16 v1, v20 */
/* if-ge v0, v1, :cond_15 */
/* .line 725 */
/* add-int/lit8 v16, v13, 0x1 */
/* .line 726 */
/* move/from16 v20, v19 */
/* .line 735 */
} // .end local v19 # "score":I
} // :cond_15
} // :goto_7
/* move v0, v13 */
/* move/from16 v1, v16 */
/* if-ge v0, v1, :cond_16 */
/* .line 741 */
/* move/from16 v16, v13 */
/* .line 742 */
/* move/from16 v17, v18 */
/* .line 743 */
/* move v10, v8 */
/* .line 745 */
/* move/from16 v11, v21 */
/* .line 746 */
/* move/from16 v12, v24 */
/* .line 642 */
} // .end local v5 # "a":I
} // .end local v14 # "da":I
} // .end local v21 # "x":I
} // .end local v24 # "z":I
} // :cond_16
/* add-int/lit8 v18, v18, 0x1 */
/* goto/16 :goto_6 */
/* .line 731 */
/* .restart local v5 # "a":I */
/* .restart local v14 # "da":I */
/* .restart local v19 # "score":I */
/* .restart local v21 # "x":I */
/* .restart local v24 # "z":I */
} // :cond_17
/* move/from16 v13, v19 */
/* .line 802 */
} // .end local v5 # "a":I
} // .end local v13 # "d":I
} // .end local v14 # "da":I
} // .end local v18 # "hole":I
} // .end local v19 # "score":I
} // .end local v21 # "x":I
} // .end local v24 # "z":I
/* .restart local v22 # "x1":I */
/* .restart local v25 # "z1":I */
} // :cond_18
/* const v27, -0xb7000 */
/* const v28, 0xb7000 */
/* add-int v28, v28, v22 */
/* sub-int v23, v27, v28 */
/* .restart local v23 # "x2":I */
/* goto/16 :goto_4 */
/* .line 816 */
/* .restart local v26 # "z2":I */
} // :cond_19
/* if-lez v25, :cond_1a */
/* .line 817 */
/* const v27, 0x177000 */
/* const v28, 0x177000 */
/* sub-int v28, v28, v25 */
/* add-int v26, v27, v28 */
/* .line 821 */
} // :goto_8
/* move/from16 v23, v22 */
/* .line 823 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v27, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v27 */
/* move-object v2, v6 */
/* move/from16 v3, v23 */
/* move/from16 v4, v26 */
v27 = (( app.Pool ) v0 ).clearShot ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lapp/Pool;->clearShot(Lapp/Ball;Lapp/Ball;II)Z
if ( v27 != null) { // if-eqz v27, :cond_4
/* .line 824 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v23 */
/* move/from16 v2, v26 */
/* move/from16 v3, v16 */
v27 = (( app.Pool ) v0 ).simulate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->simulate(III)I
/* const v28, 0x7fffffff */
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-eq v0, v1, :cond_4 */
/* .line 826 */
/* move/from16 v11, v23 */
/* .line 827 */
/* move/from16 v12, v26 */
/* goto/16 :goto_5 */
/* .line 819 */
} // :cond_1a
/* const v27, -0x177000 */
/* const v28, 0x177000 */
/* add-int v28, v28, v25 */
/* sub-int v26, v27, v28 */
} // .end method
void breakSwap ( Boolean p0 ) {
/* .locals 5 */
/* .param p1, "breakView" # Z */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 849 */
/* iput-boolean p1, p0, Lapp/Pool;->m_breakView:Z */
/* .line 852 */
v2 = this.m_breakRgb;
if ( v2 != null) { // if-eqz v2, :cond_0
/* iget v2, p0, Lapp/Pool;->m_breakWidth:I */
/* iget v3, p0, Lapp/Pool;->m_width:I */
/* if-ne v2, v3, :cond_0 */
/* iget v2, p0, Lapp/Pool;->m_breakHeight:I */
/* iget v3, p0, Lapp/Pool;->m_height:I */
/* if-eq v2, v3, :cond_2 */
/* .line 855 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 902 */
} // :goto_0
return;
/* .line 860 */
} // :cond_1
v2 = this.m_table;
v2 = this.m_rgb;
/* array-length v0, v2 */
/* .line 861 */
/* .local v0, "sz":I */
/* new-array v2, v0, [I */
this.m_breakRgb = v2;
/* .line 862 */
/* new-array v2, v0, [I */
this.m_breakZbuf = v2;
/* .line 863 */
/* iget v2, p0, Lapp/Pool;->m_width:I */
/* iput v2, p0, Lapp/Pool;->m_breakWidth:I */
/* .line 864 */
/* iget v2, p0, Lapp/Pool;->m_height:I */
/* iput v2, p0, Lapp/Pool;->m_breakHeight:I */
/* .line 865 */
v2 = this.m_table;
/* iget v2, v2, Lv/V3dView;->m_csum:I */
/* iput v2, p0, Lapp/Pool;->m_breakCsum:I */
/* .line 869 */
v2 = this.m_table;
v2 = this.m_rgb;
v3 = this.m_breakRgb;
java.lang.System .arraycopy ( v2,v4,v3,v4,v0 );
/* .line 870 */
v2 = this.m_table;
v2 = this.m_zbuf;
v3 = this.m_breakZbuf;
java.lang.System .arraycopy ( v2,v4,v3,v4,v0 );
/* .line 876 */
} // .end local v0 # "sz":I
} // :cond_2
v1 = this.m_breakRgb;
/* .line 877 */
/* .local v1, "t":[I */
v2 = this.m_table;
v2 = this.m_rgb;
this.m_breakRgb = v2;
/* .line 878 */
v2 = this.m_table;
this.m_rgb = v1;
/* .line 880 */
v1 = this.m_breakZbuf;
/* .line 881 */
v2 = this.m_table;
v2 = this.m_zbuf;
this.m_breakZbuf = v2;
/* .line 882 */
v2 = this.m_table;
this.m_zbuf = v1;
/* .line 884 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 886 */
v2 = this.m_table;
/* iget v3, p0, Lapp/Pool;->m_breakCsum:I */
/* iput v3, v2, Lv/V3dView;->m_csum:I */
/* .line 893 */
v2 = this.m_table;
(( app.Pool ) p0 ).viewCopy ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->viewCopy(Lv/V3dView;)V
/* .line 894 */
v2 = this.m_table;
/* iput v4, v2, Lv/V3dView;->m_upn:I */
/* .line 899 */
} // :cond_3
(( app.Pool ) p0 ).redraw ( ); // invoke-virtual {p0}, Lapp/Pool;->redraw()V
} // .end method
void breakView ( ) {
/* .locals 22 */
/* .prologue */
/* .line 915 */
/* move-object/from16 v0, p0 */
v0 = this.m_child;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_table;
/* move-object/from16 v19, v0 */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, v19 */
/* if-ne v0, v1, :cond_0 */
/* .line 917 */
/* move-object/from16 v0, p0 */
v0 = this.m_table;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, v18 */
v0 = this.m_sibling;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, p0 */
this.m_child = v0;
/* .line 918 */
/* move-object/from16 v0, p0 */
v0 = this.m_table;
/* move-object/from16 v18, v0 */
/* const/16 v19, 0x0 */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, v18 */
this.m_parent = v0;
/* .line 919 */
/* const/16 v18, 0x0 */
/* const/16 v19, 0x0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_width:I */
/* move/from16 v20, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_height:I */
/* move/from16 v21, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v18 */
/* move/from16 v2, v19 */
/* move/from16 v3, v20 */
/* move/from16 v4, v21 */
(( app.Pool ) v0 ).redraw ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lapp/Pool;->redraw(IIII)V
/* .line 922 */
} // :cond_0
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->removeAll()V */
/* .line 924 */
/* move-object/from16 v0, p0 */
v0 = this.m_table;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v18 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 926 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v18, v0 */
/* const/16 v19, 0x3 */
/* move/from16 v0, v18 */
/* move/from16 v1, v19 */
/* if-ne v0, v1, :cond_a */
/* .line 936 */
/* const/16 v18, 0x9 */
/* move/from16 v0, v18 */
/* new-array v0, v0, [I */
/* move-object v11, v0 */
/* .line 939 */
/* .local v11, "permute":[I */
/* const/16 v18, 0x0 */
/* const/16 v19, 0x0 */
/* aput v19, v11, v18 */
/* .line 941 */
/* const/16 v18, 0x1 */
/* const/16 v19, 0x1 */
/* aput v19, v11, v18 */
/* .line 942 */
/* const/16 v18, 0x2 */
/* const/16 v19, 0x2 */
/* aput v19, v11, v18 */
/* .line 943 */
/* const/16 v18, 0x3 */
/* const/16 v19, 0x3 */
/* aput v19, v11, v18 */
/* .line 945 */
/* const/16 v18, 0x4 */
/* const/16 v19, 0x8 */
/* aput v19, v11, v18 */
/* .line 947 */
/* const/16 v18, 0x5 */
/* const/16 v19, 0x5 */
/* aput v19, v11, v18 */
/* .line 948 */
/* const/16 v18, 0x6 */
/* const/16 v19, 0x6 */
/* aput v19, v11, v18 */
/* .line 949 */
/* const/16 v18, 0x7 */
/* const/16 v19, 0x7 */
/* aput v19, v11, v18 */
/* .line 951 */
/* const/16 v18, 0x8 */
/* const/16 v19, 0x4 */
/* aput v19, v11, v18 */
/* .line 954 */
int v14 = 0; // const/4 v14, 0x0
/* .local v14, "rpt":I */
} // :goto_0
/* const/16 v18, 0x3 */
/* move v0, v14 */
/* move/from16 v1, v18 */
/* if-lt v0, v1, :cond_3 */
/* .line 967 */
int v5 = 0; // const/4 v5, 0x0
/* .line 968 */
/* .local v5, "balli":I */
/* const v17, 0xbb800 */
/* .line 969 */
/* .local v17, "z":I */
int v13 = 0; // const/4 v13, 0x0
/* .local v13, "rowi":I */
} // :goto_1
/* const/16 v18, 0x5 */
/* move v0, v13 */
/* move/from16 v1, v18 */
/* if-lt v0, v1, :cond_6 */
/* .line 992 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_9ballNext:I */
/* .line 1077 */
} // .end local v13 # "rowi":I
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v18, v0 */
/* const/16 v19, -0x2000 */
/* const/16 v20, 0x2000 */
v19 = /* invoke-static/range {v19 ..v20}, Lapp/Pool;->franRange(II)I */
/* const v20, 0xb000 */
/* const v21, -0x119400 */
/* invoke-virtual/range {v18 ..v21}, Lapp/Ball;->setWxyz(III)V */
/* .line 1079 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v18, v0 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x0 */
/* const/16 v21, 0x0 */
/* invoke-virtual/range {v18 ..v21}, Lapp/Ball;->setVelocity(III)V */
/* .line 1080 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v18 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 1082 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v19, v0 */
/* move-object/from16 v0, v19 */
/* iget v0, v0, Lapp/Ball;->m_wx:I */
/* move/from16 v19, v0 */
/* const v20, 0xb000 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v21, v0 */
/* invoke-virtual/range {v18 ..v21}, Lv/Vsprite;->setWxyz(III)V */
/* .line 1086 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v18, v0 */
/* move/from16 v0, v18 */
/* neg-int v0, v0 */
/* move/from16 v18, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v18 */
(( app.Pool ) v0 ).cueRotate ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->cueRotate(I)V
/* .line 1088 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v18 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 1090 */
/* const/16 v18, 0x1 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_player:Z */
/* .line 1091 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_play8ball:Z */
/* .line 1092 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playAgain:Z */
/* .line 1093 */
/* const/16 v18, 0x1 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playBreak:Z */
/* .line 1094 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playScratch:Z */
/* .line 1095 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playSolids:Z */
/* .line 1096 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playStripes:Z */
/* .line 1098 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v18, v0 */
/* if-nez v18, :cond_10 */
/* .line 1099 */
/* move-object/from16 v0, p0 */
v0 = this.m_score1;
/* move-object/from16 v18, v0 */
final String v19 = "Solids "; // const-string v19, "Solids "
/* invoke-virtual/range {v18 ..v19}, Lv/Vtext;->setText(Ljava/lang/String;)V */
/* .line 1102 */
} // :goto_2
/* move-object/from16 v0, p0 */
v0 = this.m_score1;
/* move-object/from16 v18, v0 */
/* const/16 v19, 0x0 */
/* invoke-virtual/range {v18 ..v19}, Lv/Vtext;->setNumber(I)V */
/* .line 1103 */
/* move-object/from16 v0, p0 */
v0 = this.m_score1;
/* move-object/from16 v18, v0 */
/* const/16 v19, 0x4 */
/* const/16 v20, 0x4 */
/* invoke-virtual/range {v18 ..v20}, Lv/Vtext;->setXyi(II)V */
/* .line 1104 */
/* move-object/from16 v0, p0 */
v0 = this.m_score1;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v18 */
(( app.Pool ) v0 ).addTail ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->addTail(Lv/Vsprite;)V
/* .line 1106 */
/* move-object/from16 v0, p0 */
v0 = this.m_score2;
/* move-object/from16 v18, v0 */
/* const/16 v19, 0x0 */
/* invoke-virtual/range {v18 ..v19}, Lv/Vtext;->setNumber(I)V */
/* .line 1107 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v18, v0 */
/* if-nez v18, :cond_11 */
/* .line 1108 */
/* move-object/from16 v0, p0 */
v0 = this.m_score2;
/* move-object/from16 v18, v0 */
final String v19 = "Stripes "; // const-string v19, "Stripes "
/* invoke-virtual/range {v18 ..v19}, Lv/Vtext;->setText(Ljava/lang/String;)V */
/* .line 1113 */
} // :goto_3
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->score2Layout()V */
/* .line 1115 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v18, v0 */
/* const/16 v19, 0x1 */
/* move/from16 v0, v18 */
/* move/from16 v1, v19 */
/* if-eq v0, v1, :cond_2 */
/* .line 1116 */
/* move-object/from16 v0, p0 */
v0 = this.m_score2;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v18 */
(( app.Pool ) v0 ).addTail ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->addTail(Lv/Vsprite;)V
/* .line 1118 */
} // :cond_2
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_scoredif:I */
/* .line 1119 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_scoredif0:I */
/* .line 1121 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->turn()V */
/* .line 1124 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->prefBallSave()V */
/* .line 1126 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->breakViewSettings()V */
/* .line 1127 */
return;
/* .line 955 */
} // .end local v5 # "balli":I
} // .end local v17 # "z":I
} // :cond_3
int v8 = 1; // const/4 v8, 0x1
/* .local v8, "i":I */
} // :goto_4
/* const/16 v18, 0x8 */
/* move v0, v8 */
/* move/from16 v1, v18 */
/* if-lt v0, v1, :cond_4 */
/* .line 954 */
/* add-int/lit8 v14, v14, 0x1 */
/* goto/16 :goto_0 */
/* .line 956 */
} // :cond_4
/* const/16 v18, 0x4 */
/* move v0, v8 */
/* move/from16 v1, v18 */
/* if-eq v0, v1, :cond_5 */
/* .line 957 */
/* add-int/lit8 v18, v8, 0x1 */
/* const/16 v19, 0x8 */
v9 = /* invoke-static/range {v18 ..v19}, Lapp/Pool;->franRange(II)I */
/* .line 958 */
/* .local v9, "j":I */
/* const/16 v18, 0x4 */
/* move v0, v9 */
/* move/from16 v1, v18 */
/* if-eq v0, v1, :cond_5 */
/* .line 959 */
/* aget v15, v11, v8 */
/* .line 960 */
/* .local v15, "t":I */
/* aget v18, v11, v9 */
/* aput v18, v11, v8 */
/* .line 961 */
/* aput v15, v11, v9 */
/* .line 955 */
} // .end local v9 # "j":I
} // .end local v15 # "t":I
} // :cond_5
/* add-int/lit8 v8, v8, 0x1 */
/* .line 970 */
} // .end local v8 # "i":I
/* .restart local v5 # "balli":I */
/* .restart local v13 # "rowi":I */
/* .restart local v17 # "z":I */
} // :cond_6
/* move v12, v13 */
/* .line 971 */
/* .local v12, "row":I */
/* const/16 v18, 0x3 */
/* move v0, v12 */
/* move/from16 v1, v18 */
/* if-ne v0, v1, :cond_8 */
/* .line 972 */
int v12 = 1; // const/4 v12, 0x1
/* .line 976 */
} // :cond_7
} // :goto_5
/* move v0, v12 */
/* neg-int v0, v0 */
/* move/from16 v18, v0 */
/* const v19, 0x9000 */
/* const/16 v20, 0x0 */
/* const/16 v21, 0x1000 */
v20 = /* invoke-static/range {v20 ..v21}, Lapp/Pool;->franRange(II)I */
/* add-int v19, v19, v20 */
/* mul-int v16, v18, v19 */
/* .line 977 */
/* .local v16, "x":I */
int v7 = 0; // const/4 v7, 0x0
/* .local v7, "col":I */
/* move v6, v5 */
} // .end local v5 # "balli":I
/* .local v6, "balli":I */
} // :goto_6
/* if-le v7, v12, :cond_9 */
/* .line 988 */
/* const v18, 0x12000 */
/* .line 990 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x2000 */
v19 = /* invoke-static/range {v19 ..v20}, Lapp/Pool;->franRange(II)I */
/* add-int v18, v18, v19 */
/* add-int v17, v17, v18 */
/* .line 969 */
/* add-int/lit8 v13, v13, 0x1 */
/* move v5, v6 */
} // .end local v6 # "balli":I
/* .restart local v5 # "balli":I */
/* goto/16 :goto_1 */
/* .line 973 */
} // .end local v7 # "col":I
} // .end local v16 # "x":I
} // :cond_8
/* const/16 v18, 0x4 */
/* move v0, v12 */
/* move/from16 v1, v18 */
/* if-ne v0, v1, :cond_7 */
/* .line 974 */
int v12 = 0; // const/4 v12, 0x0
/* .line 979 */
} // .end local v5 # "balli":I
/* .restart local v6 # "balli":I */
/* .restart local v7 # "col":I */
/* .restart local v16 # "x":I */
} // :cond_9
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v18, v0 */
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "balli":I
/* .restart local v5 # "balli":I */
/* aget v19, v11, v6 */
/* aget-object v10, v18, v19 */
/* .line 981 */
/* .local v10, "p":Lapp/Ball; */
/* const v18, 0xb000 */
/* move-object v0, v10 */
/* move/from16 v1, v16 */
/* move/from16 v2, v18 */
/* move/from16 v3, v17 */
(( app.Ball ) v0 ).setWxyz ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Ball;->setWxyz(III)V
/* .line 983 */
/* const/16 v18, 0x0 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x0 */
/* move-object v0, v10 */
/* move/from16 v1, v18 */
/* move/from16 v2, v19 */
/* move/from16 v3, v20 */
(( app.Ball ) v0 ).setVelocity ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Ball;->setVelocity(III)V
/* .line 984 */
/* move-object/from16 v0, p0 */
/* move-object v1, v10 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 985 */
/* const v18, 0x12000 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x2000 */
v19 = /* invoke-static/range {v19 ..v20}, Lapp/Pool;->franRange(II)I */
/* add-int v18, v18, v19 */
/* add-int v16, v16, v18 */
/* .line 977 */
/* add-int/lit8 v7, v7, 0x1 */
/* move v6, v5 */
} // .end local v5 # "balli":I
/* .restart local v6 # "balli":I */
/* .line 1006 */
} // .end local v6 # "balli":I
} // .end local v7 # "col":I
} // .end local v10 # "p":Lapp/Ball;
} // .end local v11 # "permute":[I
} // .end local v12 # "row":I
} // .end local v13 # "rowi":I
} // .end local v14 # "rpt":I
} // .end local v16 # "x":I
} // .end local v17 # "z":I
} // :cond_a
/* const/16 v18, 0xf */
/* move/from16 v0, v18 */
/* new-array v0, v0, [I */
/* move-object v11, v0 */
/* .line 1007 */
/* .restart local v11 # "permute":[I */
int v8 = 0; // const/4 v8, 0x0
/* .restart local v8 # "i":I */
} // :goto_7
/* const/16 v18, 0xf */
/* move v0, v8 */
/* move/from16 v1, v18 */
/* if-lt v0, v1, :cond_b */
/* .line 1013 */
/* const/16 v18, 0x4 */
/* const/16 v19, 0x7 */
/* aput v19, v11, v18 */
/* .line 1014 */
/* const/16 v18, 0x7 */
/* const/16 v19, 0x4 */
/* aput v19, v11, v18 */
/* .line 1015 */
/* const/16 v18, 0x0 */
/* const/16 v19, 0xa */
/* aput v19, v11, v18 */
/* .line 1016 */
/* const/16 v18, 0xa */
/* const/16 v19, 0x0 */
/* aput v19, v11, v18 */
/* .line 1019 */
int v14 = 0; // const/4 v14, 0x0
/* .restart local v14 # "rpt":I */
} // :goto_8
/* const/16 v18, 0x3 */
/* move v0, v14 */
/* move/from16 v1, v18 */
/* if-lt v0, v1, :cond_c */
/* .line 1039 */
int v5 = 0; // const/4 v5, 0x0
/* .line 1040 */
/* .restart local v5 # "balli":I */
/* const v17, 0xbb800 */
/* .line 1041 */
/* .restart local v17 # "z":I */
int v12 = 0; // const/4 v12, 0x0
/* .restart local v12 # "row":I */
} // :goto_9
/* const/16 v18, 0x5 */
/* move v0, v12 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_1 */
/* .line 1042 */
/* move v0, v12 */
/* neg-int v0, v0 */
/* move/from16 v18, v0 */
/* const v19, 0x9000 */
/* const/16 v20, 0x0 */
/* const/16 v21, 0x1000 */
v20 = /* invoke-static/range {v20 ..v21}, Lapp/Pool;->franRange(II)I */
/* add-int v19, v19, v20 */
/* mul-int v16, v18, v19 */
/* .line 1043 */
/* .restart local v16 # "x":I */
int v7 = 0; // const/4 v7, 0x0
/* .restart local v7 # "col":I */
/* move v6, v5 */
} // .end local v5 # "balli":I
/* .restart local v6 # "balli":I */
} // :goto_a
/* if-le v7, v12, :cond_f */
/* .line 1057 */
/* const v18, 0x12000 */
/* .line 1059 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x2000 */
v19 = /* invoke-static/range {v19 ..v20}, Lapp/Pool;->franRange(II)I */
/* add-int v18, v18, v19 */
/* add-int v17, v17, v18 */
/* .line 1041 */
/* add-int/lit8 v12, v12, 0x1 */
/* move v5, v6 */
} // .end local v6 # "balli":I
/* .restart local v5 # "balli":I */
/* .line 1008 */
} // .end local v5 # "balli":I
} // .end local v7 # "col":I
} // .end local v12 # "row":I
} // .end local v14 # "rpt":I
} // .end local v16 # "x":I
} // .end local v17 # "z":I
} // :cond_b
/* aput v8, v11, v8 */
/* .line 1007 */
/* add-int/lit8 v8, v8, 0x1 */
/* .line 1020 */
/* .restart local v14 # "rpt":I */
} // :cond_c
int v8 = 0; // const/4 v8, 0x0
} // :goto_b
/* const/16 v18, 0xd */
/* move v0, v8 */
/* move/from16 v1, v18 */
/* if-lt v0, v1, :cond_d */
/* .line 1019 */
/* add-int/lit8 v14, v14, 0x1 */
/* .line 1021 */
} // :cond_d
/* const/16 v18, 0x4 */
/* move v0, v8 */
/* move/from16 v1, v18 */
/* if-eq v0, v1, :cond_e */
/* const/16 v18, 0xa */
/* move v0, v8 */
/* move/from16 v1, v18 */
/* if-eq v0, v1, :cond_e */
/* .line 1022 */
/* add-int/lit8 v18, v8, 0x1 */
/* const/16 v19, 0xd */
v9 = /* invoke-static/range {v18 ..v19}, Lapp/Pool;->franRange(II)I */
/* .line 1023 */
/* .restart local v9 # "j":I */
/* const/16 v18, 0x4 */
/* move v0, v9 */
/* move/from16 v1, v18 */
/* if-eq v0, v1, :cond_e */
/* const/16 v18, 0xa */
/* move v0, v9 */
/* move/from16 v1, v18 */
/* if-eq v0, v1, :cond_e */
/* .line 1024 */
/* aget v15, v11, v8 */
/* .line 1025 */
/* .restart local v15 # "t":I */
/* aget v18, v11, v9 */
/* aput v18, v11, v8 */
/* .line 1026 */
/* aput v15, v11, v9 */
/* .line 1020 */
} // .end local v9 # "j":I
} // .end local v15 # "t":I
} // :cond_e
/* add-int/lit8 v8, v8, 0x1 */
/* .line 1048 */
/* .restart local v6 # "balli":I */
/* .restart local v7 # "col":I */
/* .restart local v12 # "row":I */
/* .restart local v16 # "x":I */
/* .restart local v17 # "z":I */
} // :cond_f
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v18, v0 */
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "balli":I
/* .restart local v5 # "balli":I */
/* aget v19, v11, v6 */
/* aget-object v10, v18, v19 */
/* .line 1050 */
/* .restart local v10 # "p":Lapp/Ball; */
/* const v18, 0xb000 */
/* move-object v0, v10 */
/* move/from16 v1, v16 */
/* move/from16 v2, v18 */
/* move/from16 v3, v17 */
(( app.Ball ) v0 ).setWxyz ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Ball;->setWxyz(III)V
/* .line 1052 */
/* const/16 v18, 0x0 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x0 */
/* move-object v0, v10 */
/* move/from16 v1, v18 */
/* move/from16 v2, v19 */
/* move/from16 v3, v20 */
(( app.Ball ) v0 ).setVelocity ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Ball;->setVelocity(III)V
/* .line 1053 */
/* move-object/from16 v0, p0 */
/* move-object v1, v10 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 1054 */
/* const v18, 0x12000 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x2000 */
v19 = /* invoke-static/range {v19 ..v20}, Lapp/Pool;->franRange(II)I */
/* add-int v18, v18, v19 */
/* add-int v16, v16, v18 */
/* .line 1043 */
/* add-int/lit8 v7, v7, 0x1 */
/* move v6, v5 */
} // .end local v5 # "balli":I
/* .restart local v6 # "balli":I */
/* goto/16 :goto_a */
/* .line 1101 */
} // .end local v6 # "balli":I
} // .end local v7 # "col":I
} // .end local v8 # "i":I
} // .end local v10 # "p":Lapp/Ball;
} // .end local v12 # "row":I
} // .end local v16 # "x":I
/* .restart local v5 # "balli":I */
} // :cond_10
/* move-object/from16 v0, p0 */
v0 = this.m_score1;
/* move-object/from16 v18, v0 */
final String v19 = ""; // const-string v19, ""
/* invoke-virtual/range {v18 ..v19}, Lv/Vtext;->setText(Ljava/lang/String;)V */
/* goto/16 :goto_2 */
/* .line 1111 */
} // :cond_11
/* move-object/from16 v0, p0 */
v0 = this.m_score2;
/* move-object/from16 v18, v0 */
final String v19 = ""; // const-string v19, ""
/* invoke-virtual/range {v18 ..v19}, Lv/Vtext;->setText(Ljava/lang/String;)V */
/* goto/16 :goto_3 */
} // .end method
void breakViewSettings ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 1130 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lapp/Pool;->m_heading:I */
/* .line 1137 */
(( app.Pool ) p0 ).setAspect ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->setAspect(Z)V
/* .line 1142 */
/* iget-boolean v0, p0, Lapp/Pool;->m_breakView:Z */
/* if-nez v0, :cond_0 */
/* .line 1143 */
(( app.Pool ) p0 ).breakSwap ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->breakSwap(Z)V
/* .line 1145 */
} // :cond_0
return;
} // .end method
Boolean clearShot ( app.Ball p0, app.Ball p1, Integer p2, Integer p3 ) {
/* .locals 9 */
/* .param p1, "b0" # Lapp/Ball; */
/* .param p2, "b1" # Lapp/Ball; */
/* .param p3, "x1" # I */
/* .param p4, "z1" # I */
/* .prologue */
/* .line 1149 */
/* iget v2, p1, Lapp/Ball;->m_wx:I */
/* .line 1150 */
/* .local v2, "x0":I */
/* iget v3, p1, Lapp/Ball;->m_wz:I */
/* .line 1152 */
/* .local v3, "z0":I */
int v6 = 0; // const/4 v6, 0x0
/* .local v6, "balli":I */
} // :goto_0
/* const/16 v0, 0xf */
/* if-lt v6, v0, :cond_0 */
/* .line 1163 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* .line 1153 */
} // :cond_0
v0 = this.m_balls;
/* aget-object v8, v0, v6 */
/* .line 1154 */
/* .local v8, "p":Lapp/Ball; */
v0 = (( app.Ball ) v8 ).isLinked ( ); // invoke-virtual {v8}, Lapp/Ball;->isLinked()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-eq v8, p1, :cond_1 */
/* if-eq v8, p2, :cond_1 */
/* .line 1155 */
/* iget v0, v8, Lapp/Ball;->m_wx:I */
/* iget v1, v8, Lapp/Ball;->m_wz:I */
/* move v4, p3 */
/* move v5, p4 */
v7 = /* invoke-static/range {v0 ..v5}, Lapp/Ball;->distanceSquaredToLine(IIIIII)I */
/* .line 1159 */
/* .local v7, "d":I */
/* const v0, 0x28800 */
/* if-gt v7, v0, :cond_1 */
/* .line 1160 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1152 */
} // .end local v7 # "d":I
} // :cond_1
/* add-int/lit8 v6, v6, 0x1 */
} // .end method
Integer clearShotToHole ( app.Ball p0, Integer p1 ) {
/* .locals 8 */
/* .param p1, "b0" # Lapp/Ball; */
/* .param p2, "hole" # I */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
/* .line 1168 */
int v1 = 0; // const/4 v1, 0x0
/* .line 1169 */
/* .local v1, "x1":I */
int v3 = 0; // const/4 v3, 0x0
/* .line 1171 */
/* .local v3, "z1":I */
/* packed-switch p2, :pswitch_data_0 */
/* .line 1206 */
} // :goto_0
v5 = (( app.Pool ) p0 ).clearShot ( p1, v6, v1, v3 ); // invoke-virtual {p0, p1, v6, v1, v3}, Lapp/Pool;->clearShot(Lapp/Ball;Lapp/Ball;II)Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 1207 */
v0 = (( app.Pool ) p0 ).angleBetween ( p1, v1, v3 ); // invoke-virtual {p0, p1, v1, v3}, Lapp/Pool;->angleBetween(Lv/Vsprite;II)I
/* .line 1208 */
/* .local v0, "a":I */
/* iput v0, p0, Lapp/Pool;->m_holeAngle:I */
/* .line 1210 */
/* if-gez v0, :cond_0 */
/* .line 1211 */
/* neg-int v0, v0 */
/* .line 1218 */
} // :cond_0
int v5 = 2; // const/4 v5, 0x2
/* if-eq p2, v5, :cond_1 */
int v5 = 3; // const/4 v5, 0x3
/* if-ne p2, v5, :cond_2 */
} // :cond_1
/* const/16 v5, 0xfff */
/* if-lt v0, v5, :cond_3 */
/* const/16 v5, 0x2ffd */
/* if-gt v0, v5, :cond_3 */
/* .line 1219 */
} // :cond_2
/* iget v5, p1, Lapp/Ball;->m_wx:I */
/* sub-int/2addr v5, v1 */
/* iget v6, p1, Lapp/Ball;->m_wz:I */
/* sub-int/2addr v6, v3 */
v5 = v.Vector .magnitudeApprox ( v5,v7,v6 );
/* .line 1261 */
} // .end local v0 # "a":I
} // :goto_1
/* .line 1174 */
/* :pswitch_0 */
/* const v1, -0xc8000 */
/* .line 1175 */
/* const v3, 0x184000 */
/* .line 1176 */
/* .line 1179 */
/* :pswitch_1 */
/* const v1, 0xc8000 */
/* .line 1180 */
/* const v3, 0x184000 */
/* .line 1181 */
/* .line 1184 */
/* :pswitch_2 */
/* const v1, -0xc8000 */
/* .line 1185 */
int v3 = 0; // const/4 v3, 0x0
/* .line 1186 */
/* .line 1189 */
/* :pswitch_3 */
/* const v1, 0xc8000 */
/* .line 1190 */
int v3 = 0; // const/4 v3, 0x0
/* .line 1191 */
/* .line 1194 */
/* :pswitch_4 */
/* const v1, -0xc8000 */
/* .line 1195 */
/* const v3, -0x184000 */
/* .line 1196 */
/* .line 1199 */
/* :pswitch_5 */
/* const v1, 0xc8000 */
/* .line 1200 */
/* const v3, -0x184000 */
/* .line 1229 */
} // :cond_3
/* if-lez v1, :cond_4 */
/* .line 1230 */
/* const v5, -0x225000 */
/* sub-int v2, v5, v1 */
/* .line 1235 */
/* .local v2, "x2":I */
} // :goto_2
/* move v4, v3 */
/* .line 1237 */
/* .local v4, "z2":I */
v5 = (( app.Pool ) p0 ).clearShot ( p1, v6, v2, v4 ); // invoke-virtual {p0, p1, v6, v2, v4}, Lapp/Pool;->clearShot(Lapp/Ball;Lapp/Ball;II)Z
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 1238 */
v5 = (( app.Pool ) p0 ).angleBetween ( p1, v2, v4 ); // invoke-virtual {p0, p1, v2, v4}, Lapp/Pool;->angleBetween(Lv/Vsprite;II)I
/* iput v5, p0, Lapp/Pool;->m_holeAngle:I */
/* .line 1240 */
/* iget v5, p1, Lapp/Ball;->m_wx:I */
/* sub-int/2addr v5, v2 */
/* iget v6, p1, Lapp/Ball;->m_wz:I */
/* sub-int/2addr v6, v4 */
v5 = v.Vector .magnitudeApprox ( v5,v7,v6 );
/* .line 1232 */
} // .end local v2 # "x2":I
} // .end local v4 # "z2":I
} // :cond_4
/* const v5, 0x225000 */
/* sub-int v2, v5, v1 */
/* .restart local v2 # "x2":I */
/* .line 1246 */
/* .restart local v4 # "z2":I */
} // :cond_5
/* if-lez v3, :cond_6 */
/* .line 1247 */
/* const v5, -0x465000 */
/* sub-int v4, v5, v3 */
/* .line 1252 */
} // :goto_3
/* move v2, v1 */
/* .line 1254 */
v5 = (( app.Pool ) p0 ).clearShot ( p1, v6, v2, v4 ); // invoke-virtual {p0, p1, v6, v2, v4}, Lapp/Pool;->clearShot(Lapp/Ball;Lapp/Ball;II)Z
if ( v5 != null) { // if-eqz v5, :cond_7
/* .line 1255 */
v5 = (( app.Pool ) p0 ).angleBetween ( p1, v2, v4 ); // invoke-virtual {p0, p1, v2, v4}, Lapp/Pool;->angleBetween(Lv/Vsprite;II)I
/* iput v5, p0, Lapp/Pool;->m_holeAngle:I */
/* .line 1257 */
/* iget v5, p1, Lapp/Ball;->m_wx:I */
/* sub-int/2addr v5, v2 */
/* iget v6, p1, Lapp/Ball;->m_wz:I */
/* sub-int/2addr v6, v4 */
v5 = v.Vector .magnitudeApprox ( v5,v7,v6 );
/* .line 1249 */
} // :cond_6
/* const v5, 0x465000 */
/* sub-int v4, v5, v3 */
/* .line 1261 */
} // :cond_7
/* const v5, 0x7fffffff */
/* .line 1171 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
} // .end packed-switch
} // .end method
final void click ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1266 */
/* sget-boolean v0, Lv/Vmenu;->m_mouse:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1267 */
final String v0 = "click"; // const-string v0, "click"
(( app.Pool ) p0 ).sound ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 1268 */
} // :cond_0
return;
} // .end method
void cueAngle ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "angle" # I */
/* .prologue */
/* .line 1287 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lapp/Pool;->m_cueAngle:I */
/* .line 1288 */
(( app.Pool ) p0 ).cueRotate ( p1 ); // invoke-virtual {p0, p1}, Lapp/Pool;->cueRotate(I)V
/* .line 1290 */
return;
} // .end method
void cueMove ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "z" # I */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 1293 */
v0 = this.m_tv;
/* .line 1294 */
/* .local v0, "v":Lv/Vector; */
(( v.Vector ) v0 ).set ( v1, v1, p1 ); // invoke-virtual {v0, v1, v1, p1}, Lv/Vector;->set(III)V
/* .line 1295 */
v1 = this.m_cue;
(( v.Vsprite ) v1 ).rotate ( v0 ); // invoke-virtual {v1, v0}, Lv/Vsprite;->rotate(Lv/Vector;)V
/* .line 1296 */
v1 = this.m_cue;
/* iget v2, v1, Lv/Vsprite;->m_wx:I */
/* iget v3, v0, Lv/Vector;->m_x:I */
/* add-int/2addr v2, v3 */
/* iput v2, v1, Lv/Vsprite;->m_wx:I */
/* .line 1297 */
v1 = this.m_cue;
/* iget v2, v1, Lv/Vsprite;->m_wy:I */
/* iget v3, v0, Lv/Vector;->m_y:I */
/* add-int/2addr v2, v3 */
/* iput v2, v1, Lv/Vsprite;->m_wy:I */
/* .line 1298 */
v1 = this.m_cue;
/* iget v2, v1, Lv/Vsprite;->m_wz:I */
/* iget v3, v0, Lv/Vector;->m_z:I */
/* add-int/2addr v2, v3 */
/* iput v2, v1, Lv/Vsprite;->m_wz:I */
/* .line 1299 */
return;
} // .end method
void cueRotate ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "rot" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1304 */
/* iget v1, p0, Lapp/Pool;->m_cueAngle:I */
/* add-int/2addr v1, p1 */
/* iput v1, p0, Lapp/Pool;->m_cueAngle:I */
/* .line 1305 */
/* iget v1, p0, Lapp/Pool;->m_cueAngle:I */
/* and-int/lit16 v1, v1, 0x7fff */
/* iput v1, p0, Lapp/Pool;->m_cueAngle:I */
/* .line 1307 */
v1 = this.m_cue;
(( v.Vsprite ) v1 ).identity ( ); // invoke-virtual {v1}, Lv/Vsprite;->identity()V
/* .line 1310 */
v1 = this.m_cue;
/* const/high16 v2, -0x190000 */
(( v.Vsprite ) v1 ).translate ( v3, v3, v2 ); // invoke-virtual {v1, v3, v3, v2}, Lv/Vsprite;->translate(III)V
/* .line 1311 */
v1 = this.m_cue;
/* const/16 v2, -0x222 */
(( v.Vsprite ) v1 ).rotateX ( v2 ); // invoke-virtual {v1, v2}, Lv/Vsprite;->rotateX(I)V
/* .line 1312 */
v1 = this.m_cue;
/* iget v2, p0, Lapp/Pool;->m_cueAngle:I */
/* neg-int v2, v2 */
(( v.Vsprite ) v1 ).rotateY ( v2 ); // invoke-virtual {v1, v2}, Lv/Vsprite;->rotateY(I)V
/* .line 1316 */
/* iget-boolean v1, p0, Lapp/Pool;->m_breakView:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 1335 */
} // :cond_0
} // :goto_0
return;
/* .line 1321 */
} // :cond_1
/* iget v1, p0, Lapp/Pool;->m_heading:I */
/* iget v2, p0, Lapp/Pool;->m_cueAngle:I */
/* sub-int/2addr v1, v2 */
/* and-int/lit16 v0, v1, 0x7fff */
/* .line 1323 */
/* .local v0, "d":I */
/* iget v1, p0, Lapp/Pool;->m_mousex:I */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 1324 */
/* const/16 v1, 0x6002 */
/* if-gt v0, v1, :cond_0 */
/* const/16 v1, 0x1ffe */
/* if-lt v0, v1, :cond_0 */
/* .line 1333 */
} // :cond_2
/* iget v1, p0, Lapp/Pool;->m_cueAngle:I */
/* iput v1, p0, Lapp/Pool;->m_heading:I */
/* .line 1334 */
(( app.Pool ) p0 ).lookAt ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt()V
/* .line 1328 */
} // :cond_3
/* const/16 v1, 0x7bbc */
/* if-gt v0, v1, :cond_0 */
/* const/16 v1, 0x444 */
/* if-ge v0, v1, :cond_2 */
} // .end method
void cueShoot ( Object p0 ) {
/* .locals 34 */
/* .param p1, "key0" # C */
/* .prologue */
/* .line 1342 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_reset:Z */
/* .line 1343 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playScratch:Z */
/* .line 1344 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_pocketed:I */
/* .line 1346 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_9ballHit:Z */
/* .line 1347 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_9ballFoul:Z */
/* .line 1352 */
int v10 = 0; // const/4 v10, 0x0
/* .line 1358 */
/* .local v10, "d":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v30, v0 */
v25 = /* invoke-static/range {v30 ..v30}, Lapp/Pool;->fsin(I)I */
/* .line 1359 */
/* .local v25, "sin":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v30, v0 */
v6 = /* invoke-static/range {v30 ..v30}, Lapp/Pool;->fcos(I)I */
/* .line 1361 */
/* .local v6, "cos":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_spindx:I */
/* move v14, v0 */
/* .line 1362 */
/* .local v14, "dx":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_spindy:I */
/* move v15, v0 */
/* .line 1364 */
/* .local v15, "dy":I */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_5 */
/* .line 1368 */
/* const/16 v30, 0x1f4 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).waitKey ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->waitKey(I)V
/* .line 1371 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_bestDist:I */
/* move/from16 v16, v0 */
/* .line 1374 */
/* .local v16, "force":I */
/* shr-int/lit8 v30, v16, 0x2 */
/* const/high16 v31, 0x40000 */
/* add-int v30, v30, v31 */
/* add-int v16, v16, v30 */
/* .line 1379 */
} // :cond_0
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_tlast:I */
/* move/from16 v30, v0 */
/* move/from16 v0, v30 */
/* mul-int/lit16 v0, v0, 0x200 */
/* move/from16 v27, v0 */
/* .line 1380 */
/* .local v27, "t":I */
/* mul-int/lit8 v30, v27, 0x6 */
/* add-int v10, v10, v30 */
/* .line 1383 */
/* const/high16 v30, 0x600000 */
/* move v0, v10 */
/* move/from16 v1, v30 */
/* if-le v0, v1, :cond_4 */
/* .line 1384 */
/* const/high16 v10, 0x600000 */
/* .line 1392 */
} // :cond_1
} // :goto_0
/* move/from16 v10, v16 */
/* .line 1662 */
} // .end local v16 # "force":I
} // .end local v27 # "t":I
} // :cond_2
} // :goto_1
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_reset:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_20
/* .line 1974 */
} // :cond_3
} // :goto_2
return;
/* .line 1388 */
/* .restart local v16 # "force":I */
/* .restart local v27 # "t":I */
} // :cond_4
/* move/from16 v0, v27 */
/* neg-int v0, v0 */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).cueMove ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->cueMove(I)V
/* .line 1390 */
v30 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->stepCue()Z */
if ( v30 != null) { // if-eqz v30, :cond_1
/* move v0, v10 */
/* move/from16 v1, v16 */
/* if-lt v0, v1, :cond_0 */
/* .line 1396 */
} // .end local v16 # "force":I
} // .end local v27 # "t":I
} // :cond_5
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_menuShow:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_1e */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousey:I */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_1e
/* .line 1401 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousex:I */
/* move/from16 v19, v0 */
/* .line 1402 */
/* .local v19, "mx":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousey:I */
/* move/from16 v20, v0 */
/* .line 1404 */
/* .local v20, "my":I */
/* const/16 v26, 0x0 */
/* .line 1406 */
/* .local v26, "spin":Z */
int v10 = 0; // const/4 v10, 0x0
/* .line 1410 */
} // :cond_6
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_tlast:I */
/* move/from16 v28, v0 */
/* .line 1411 */
/* .local v28, "tlast":I */
/* const/16 v30, 0x64 */
/* move/from16 v0, v28 */
/* move/from16 v1, v30 */
/* if-le v0, v1, :cond_7 */
/* .line 1412 */
/* const/16 v28, 0x64 */
/* .line 1425 */
} // :cond_7
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* iget v0, v0, Lapp/Ball;->m_wx:I */
/* move v7, v0 */
/* .line 1426 */
/* .local v7, "cx":I */
/* const v8, 0xb000 */
/* .line 1427 */
/* .local v8, "cy":I */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move v9, v0 */
/* .line 1428 */
/* .local v9, "cz":I */
if ( v14 != null) { // if-eqz v14, :cond_e
/* .line 1429 */
/* mul-int v30, v14, v6 */
/* shr-int/lit8 v30, v30, 0x1 */
/* add-int v7, v7, v30 */
/* .line 1430 */
/* mul-int v30, v14, v25 */
/* shr-int/lit8 v30, v30, 0x1 */
/* sub-int v9, v9, v30 */
/* .line 1435 */
} // :goto_3
if ( v26 != null) { // if-eqz v26, :cond_16
/* .line 1439 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragx:I */
/* move v12, v0 */
/* .line 1440 */
/* .local v12, "drx":I */
/* if-gez v12, :cond_8 */
/* .line 1441 */
/* neg-int v12, v12 */
/* .line 1442 */
} // :cond_8
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragy:I */
/* move v13, v0 */
/* .line 1443 */
/* .local v13, "dry":I */
/* if-gez v13, :cond_9 */
/* .line 1444 */
/* neg-int v13, v13 */
/* .line 1446 */
} // :cond_9
/* const/16 v23, 0x0 */
/* .line 1447 */
/* .local v23, "reset":Z */
/* if-le v12, v13, :cond_12 */
/* .line 1448 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragx:I */
/* move/from16 v30, v0 */
/* const/16 v31, -0x1 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ge v0, v1, :cond_10 */
/* .line 1449 */
/* const/16 v30, 0x1 */
/* move v0, v14 */
/* move/from16 v1, v30 */
/* if-ne v0, v1, :cond_f */
/* .line 1451 */
/* const/16 v23, 0x1 */
/* .line 1489 */
} // :cond_a
} // :goto_4
if ( v23 != null) { // if-eqz v23, :cond_b
/* .line 1490 */
final String v30 = "No spin"; // const-string v30, "No spin"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).prompt ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 1491 */
int v14 = 0; // const/4 v14, 0x0
/* .line 1492 */
int v15 = 0; // const/4 v15, 0x0
/* .line 1495 */
} // :cond_b
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragx:I */
/* move/from16 v30, v0 */
/* add-int v19, v19, v30 */
/* .line 1496 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragy:I */
/* move/from16 v30, v0 */
/* add-int v20, v20, v30 */
/* .line 1498 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_dragx:I */
/* .line 1499 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_dragy:I */
/* .line 1505 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* move v1, v7 */
/* move v2, v8 */
/* move v3, v9 */
(( v.Vsprite ) v0 ).setWxyz ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vsprite;->setWxyz(III)V
/* .line 1506 */
/* move v0, v10 */
/* neg-int v0, v0 */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).cueMove ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->cueMove(I)V
/* .line 1508 */
/* move v0, v14 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spindx:I */
/* .line 1509 */
/* move v0, v15 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spindy:I */
/* .line 1569 */
} // .end local v12 # "drx":I
} // .end local v13 # "dry":I
} // .end local v23 # "reset":Z
} // :cond_c
} // :goto_5
v30 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->stepCue()Z */
if ( v30 != null) { // if-eqz v30, :cond_d
v30 = /* invoke-virtual/range {p0 ..p1}, Lapp/Pool;->keyDown(C)Z */
/* .line 1407 */
/* if-nez v30, :cond_6 */
/* .line 1578 */
} // :cond_d
/* const/high16 v30, 0x20000 */
/* move v0, v10 */
/* move/from16 v1, v30 */
/* if-gt v0, v1, :cond_1c */
/* .line 1581 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* move v1, v7 */
/* move v2, v8 */
/* move v3, v9 */
(( v.Vsprite ) v0 ).setWxyz ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vsprite;->setWxyz(III)V
/* .line 1582 */
/* invoke-direct/range {p0 ..p0}, Lapp/Pool;->menuGameShow()V */
/* .line 1585 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_breakView:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_heading:I */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v31, v0 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-eq v0, v1, :cond_3 */
/* .line 1586 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v30, v0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_heading:I */
/* .line 1587 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->lookAt()V */
/* goto/16 :goto_2 */
/* .line 1433 */
} // :cond_e
/* const v30, 0x8000 */
/* mul-int v30, v30, v15 */
/* div-int/lit8 v30, v30, 0x2 */
/* add-int v8, v8, v30 */
/* goto/16 :goto_3 */
/* .line 1453 */
/* .restart local v12 # "drx":I */
/* .restart local v13 # "dry":I */
/* .restart local v23 # "reset":Z */
} // :cond_f
final String v30 = "Left spin"; // const-string v30, "Left spin"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).prompt ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 1454 */
int v14 = -1; // const/4 v14, -0x1
/* .line 1455 */
int v15 = 0; // const/4 v15, 0x0
/* goto/16 :goto_4 */
/* .line 1458 */
} // :cond_10
/* const/16 v30, 0x1 */
/* move v0, v12 */
/* move/from16 v1, v30 */
/* if-le v0, v1, :cond_a */
/* .line 1459 */
/* const/16 v30, -0x1 */
/* move v0, v14 */
/* move/from16 v1, v30 */
/* if-ne v0, v1, :cond_11 */
/* .line 1460 */
/* const/16 v23, 0x1 */
/* goto/16 :goto_4 */
/* .line 1462 */
} // :cond_11
final String v30 = "Right spin"; // const-string v30, "Right spin"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).prompt ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 1463 */
int v14 = 1; // const/4 v14, 0x1
/* .line 1464 */
int v15 = 0; // const/4 v15, 0x0
/* goto/16 :goto_4 */
/* .line 1469 */
} // :cond_12
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragy:I */
/* move/from16 v30, v0 */
/* const/16 v31, -0x1 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ge v0, v1, :cond_14 */
/* .line 1470 */
/* const/16 v30, -0x1 */
/* move v0, v15 */
/* move/from16 v1, v30 */
/* if-ne v0, v1, :cond_13 */
/* .line 1471 */
/* const/16 v23, 0x1 */
/* goto/16 :goto_4 */
/* .line 1473 */
} // :cond_13
final String v30 = "Top spin"; // const-string v30, "Top spin"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).prompt ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 1474 */
int v14 = 0; // const/4 v14, 0x0
/* .line 1475 */
int v15 = 1; // const/4 v15, 0x1
/* goto/16 :goto_4 */
/* .line 1478 */
} // :cond_14
/* const/16 v30, 0x1 */
/* move v0, v13 */
/* move/from16 v1, v30 */
/* if-le v0, v1, :cond_a */
/* .line 1479 */
/* const/16 v30, 0x1 */
/* move v0, v15 */
/* move/from16 v1, v30 */
/* if-ne v0, v1, :cond_15 */
/* .line 1480 */
/* const/16 v23, 0x1 */
/* goto/16 :goto_4 */
/* .line 1482 */
} // :cond_15
final String v30 = "Back spin"; // const-string v30, "Back spin"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).prompt ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 1483 */
int v14 = 0; // const/4 v14, 0x0
/* .line 1484 */
int v15 = -1; // const/4 v15, -0x1
/* goto/16 :goto_4 */
/* .line 1513 */
} // .end local v12 # "drx":I
} // .end local v13 # "dry":I
} // .end local v23 # "reset":Z
} // :cond_16
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragy:I */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_19
/* .line 1517 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragy:I */
/* move/from16 v30, v0 */
/* mul-int v30, v30, v28 */
/* move/from16 v0, v30 */
/* mul-int/lit16 v0, v0, 0x80 */
/* move/from16 v27, v0 */
/* .line 1519 */
/* .restart local v27 # "t":I */
/* add-int v10, v10, v27 */
/* .line 1521 */
/* const/high16 v30, 0x100000 */
/* move v0, v10 */
/* move/from16 v1, v30 */
/* if-le v0, v1, :cond_17 */
/* .line 1522 */
/* const/high16 v30, 0x100000 */
/* sub-int v30, v10, v30 */
/* sub-int v27, v27, v30 */
/* .line 1523 */
/* const/high16 v10, 0x100000 */
/* .line 1526 */
} // :cond_17
/* if-gez v10, :cond_1b */
/* .line 1528 */
/* const/16 v30, -0x8000 */
/* move v0, v10 */
/* move/from16 v1, v30 */
/* if-ge v0, v1, :cond_18 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragx:I */
/* move/from16 v30, v0 */
/* const/16 v31, -0x1 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-lt v0, v1, :cond_18 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragx:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x1 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-gt v0, v1, :cond_18 */
/* .line 1530 */
final String v30 = "No spin"; // const-string v30, "No spin"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).prompt ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 1531 */
/* const/16 v26, 0x1 */
/* .line 1533 */
} // :cond_18
int v10 = 0; // const/4 v10, 0x0
/* .line 1534 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v31, v0 */
/* move-object/from16 v0, v31 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v31, v0 */
/* move-object/from16 v0, v30 */
/* move v1, v7 */
/* move v2, v8 */
/* move/from16 v3, v31 */
(( v.Vsprite ) v0 ).setWxyz ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vsprite;->setWxyz(III)V
/* .line 1540 */
} // :goto_6
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_dragy:I */
/* .line 1543 */
} // .end local v27 # "t":I
} // :cond_19
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragx:I */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_c
/* .line 1546 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v31, v0 */
/* move-object/from16 v0, v31 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v31, v0 */
/* move-object/from16 v0, v30 */
/* move v1, v7 */
/* move v2, v8 */
/* move/from16 v3, v31 */
(( v.Vsprite ) v0 ).setWxyz ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vsprite;->setWxyz(III)V
/* .line 1547 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragx:I */
/* move/from16 v30, v0 */
/* move/from16 v0, v30 */
/* neg-int v0, v0 */
/* move/from16 v30, v0 */
/* mul-int v30, v30, v28 */
/* shr-int/lit8 v30, v30, 0x3 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).cueRotate ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->cueRotate(I)V
/* .line 1550 */
/* move v0, v10 */
/* neg-int v0, v0 */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).cueMove ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->cueMove(I)V
/* .line 1552 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v30, v0 */
v25 = /* invoke-static/range {v30 ..v30}, Lapp/Pool;->fsin(I)I */
/* .line 1553 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v30, v0 */
v6 = /* invoke-static/range {v30 ..v30}, Lapp/Pool;->fcos(I)I */
/* .line 1555 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_breakView:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_1a
/* .line 1557 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_heading:I */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v31, v0 */
/* sub-int v30, v30, v31 */
/* move/from16 v0, v30 */
/* and-int/lit16 v0, v0, 0x7fff */
/* move v11, v0 */
/* .line 1558 */
/* .local v11, "da":I */
/* const/16 v30, 0x6002 */
/* move v0, v11 */
/* move/from16 v1, v30 */
/* if-gt v0, v1, :cond_1a */
/* const/16 v30, 0x1ffe */
/* move v0, v11 */
/* move/from16 v1, v30 */
/* if-lt v0, v1, :cond_1a */
/* .line 1559 */
/* const/16 v30, 0x0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).breakSwap ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->breakSwap(Z)V
/* .line 1560 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v30, v0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_heading:I */
/* .line 1561 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->lookAt0()V */
/* .line 1565 */
} // .end local v11 # "da":I
} // :cond_1a
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_dragx:I */
/* goto/16 :goto_5 */
/* .line 1537 */
/* .restart local v27 # "t":I */
} // :cond_1b
/* move-object/from16 v0, p0 */
v0 = this.m_prompt;
/* move-object/from16 v30, v0 */
/* invoke-virtual/range {v30 ..v30}, Lv/Vtext;->off()V */
/* .line 1538 */
/* move/from16 v0, v27 */
/* neg-int v0, v0 */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).cueMove ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->cueMove(I)V
/* goto/16 :goto_6 */
/* .line 1593 */
} // .end local v27 # "t":I
} // :cond_1c
/* mul-int/lit8 v10, v10, 0x6 */
/* .line 1595 */
/* const/high16 v30, 0x600000 */
/* move v0, v10 */
/* move/from16 v1, v30 */
/* if-le v0, v1, :cond_1d */
/* .line 1596 */
/* const/high16 v10, 0x600000 */
/* .line 1598 */
} // :cond_1d
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v30, v0 */
v25 = /* invoke-static/range {v30 ..v30}, Lapp/Pool;->fsin(I)I */
/* .line 1599 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v30, v0 */
v6 = /* invoke-static/range {v30 ..v30}, Lapp/Pool;->fcos(I)I */
/* goto/16 :goto_1 */
/* .line 1604 */
} // .end local v7 # "cx":I
} // .end local v8 # "cy":I
} // .end local v9 # "cz":I
} // .end local v19 # "mx":I
} // .end local v20 # "my":I
} // .end local v26 # "spin":Z
} // .end local v28 # "tlast":I
} // :cond_1e
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_tlast:I */
/* move/from16 v30, v0 */
/* move/from16 v0, v30 */
/* mul-int/lit16 v0, v0, 0x200 */
/* move/from16 v27, v0 */
/* .line 1609 */
/* .restart local v27 # "t":I */
v17 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->keyGet()C */
/* .line 1610 */
/* .local v17, "key":C */
/* shr-int/lit8 v18, v27, 0x2 */
/* .line 1611 */
/* .local v18, "m":I */
/* sparse-switch v17, :sswitch_data_0 */
/* .line 1644 */
} // :goto_7
/* mul-int/lit8 v30, v27, 0x6 */
/* add-int v10, v10, v30 */
/* .line 1647 */
/* const/high16 v30, 0x600000 */
/* move v0, v10 */
/* move/from16 v1, v30 */
/* if-le v0, v1, :cond_1f */
/* .line 1654 */
/* const/high16 v10, 0x600000 */
/* .line 1655 */
/* goto/16 :goto_1 */
/* .line 1615 */
/* :sswitch_0 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* iget v0, v0, Lv/Vsprite;->m_wx:I */
/* move/from16 v31, v0 */
/* move v0, v6 */
/* move/from16 v1, v18 */
v32 = app.Pool .fmul ( v0,v1 );
/* sub-int v31, v31, v32 */
/* move/from16 v0, v31 */
/* move-object/from16 v1, v30 */
/* iput v0, v1, Lv/Vsprite;->m_wx:I */
/* .line 1616 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* iget v0, v0, Lv/Vsprite;->m_wz:I */
/* move/from16 v31, v0 */
/* move/from16 v0, v25 */
/* move/from16 v1, v18 */
v32 = app.Pool .fmul ( v0,v1 );
/* add-int v31, v31, v32 */
/* move/from16 v0, v31 */
/* move-object/from16 v1, v30 */
/* iput v0, v1, Lv/Vsprite;->m_wz:I */
/* .line 1617 */
int v14 = -1; // const/4 v14, -0x1
/* .line 1618 */
int v15 = 0; // const/4 v15, 0x0
/* .line 1619 */
/* .line 1623 */
/* :sswitch_1 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* iget v0, v0, Lv/Vsprite;->m_wx:I */
/* move/from16 v31, v0 */
/* move v0, v6 */
/* move/from16 v1, v18 */
v32 = app.Pool .fmul ( v0,v1 );
/* add-int v31, v31, v32 */
/* move/from16 v0, v31 */
/* move-object/from16 v1, v30 */
/* iput v0, v1, Lv/Vsprite;->m_wx:I */
/* .line 1624 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* iget v0, v0, Lv/Vsprite;->m_wz:I */
/* move/from16 v31, v0 */
/* move/from16 v0, v25 */
/* move/from16 v1, v18 */
v32 = app.Pool .fmul ( v0,v1 );
/* add-int v31, v31, v32 */
/* move/from16 v0, v31 */
/* move-object/from16 v1, v30 */
/* iput v0, v1, Lv/Vsprite;->m_wz:I */
/* .line 1625 */
int v14 = 1; // const/4 v14, 0x1
/* .line 1626 */
int v15 = 0; // const/4 v15, 0x0
/* .line 1627 */
/* goto/16 :goto_7 */
/* .line 1631 */
/* :sswitch_2 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* iget v0, v0, Lv/Vsprite;->m_wy:I */
/* move/from16 v31, v0 */
/* add-int v31, v31, v18 */
/* move/from16 v0, v31 */
/* move-object/from16 v1, v30 */
/* iput v0, v1, Lv/Vsprite;->m_wy:I */
/* .line 1632 */
int v14 = 0; // const/4 v14, 0x0
/* .line 1633 */
int v15 = 1; // const/4 v15, 0x1
/* .line 1634 */
/* goto/16 :goto_7 */
/* .line 1638 */
/* :sswitch_3 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, v30 */
/* iget v0, v0, Lv/Vsprite;->m_wy:I */
/* move/from16 v31, v0 */
/* sub-int v31, v31, v18 */
/* move/from16 v0, v31 */
/* move-object/from16 v1, v30 */
/* iput v0, v1, Lv/Vsprite;->m_wy:I */
/* .line 1639 */
int v14 = 0; // const/4 v14, 0x0
/* .line 1640 */
int v15 = -1; // const/4 v15, -0x1
/* goto/16 :goto_7 */
/* .line 1657 */
} // :cond_1f
/* move/from16 v0, v27 */
/* neg-int v0, v0 */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).cueMove ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->cueMove(I)V
/* .line 1659 */
v30 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->stepCue()Z */
if ( v30 != null) { // if-eqz v30, :cond_2
v30 = /* invoke-virtual/range {p0 ..p1}, Lapp/Pool;->keyDown(C)Z */
/* .line 1603 */
/* if-nez v30, :cond_1e */
/* goto/16 :goto_1 */
/* .line 1666 */
} // .end local v17 # "key":C
} // .end local v18 # "m":I
} // .end local v27 # "t":I
} // :cond_20
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_21
/* .line 1667 */
/* move-object/from16 v0, p0 */
v0 = this.m_prompt;
/* move-object/from16 v30, v0 */
/* invoke-virtual/range {v30 ..v30}, Lv/Vtext;->off()V */
/* .line 1668 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->menuOff()V */
/* .line 1671 */
} // :cond_21
final String v30 = "cue_shoot"; // const-string v30, "cue_shoot"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).sound ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 1674 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v31, v0 */
/* move-object/from16 v0, v31 */
/* iget v0, v0, Lapp/Ball;->m_wx:I */
/* move/from16 v31, v0 */
/* const v32, 0xb000 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v33, v0 */
/* move-object/from16 v0, v33 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v33, v0 */
/* invoke-virtual/range {v30 ..v33}, Lv/Vsprite;->setWxyz(III)V */
/* .line 1675 */
/* const/16 v30, 0x0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).cueRotate ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->cueRotate(I)V
/* .line 1681 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v30, v0 */
/* .line 1682 */
/* move/from16 v0, v25 */
/* move v1, v10 */
v31 = app.Pool .fmul ( v0,v1 );
/* .line 1683 */
/* const/16 v32, -0x1 */
/* move v0, v15 */
/* move/from16 v1, v32 */
/* if-ne v0, v1, :cond_2c */
/* shr-int/lit8 v32, v10, 0x1 */
/* .line 1684 */
} // :goto_8
v33 = app.Pool .fmul ( v6,v10 );
/* .line 1681 */
/* invoke-virtual/range {v30 ..v33}, Lapp/Ball;->setVelocity(III)V */
/* .line 1686 */
/* shr-int/lit8 v10, v10, 0x2 */
/* .line 1688 */
if ( v14 != null) { // if-eqz v14, :cond_2d
/* .line 1689 */
/* mul-int v30, v14, v6 */
/* move/from16 v0, v30 */
/* move v1, v10 */
v30 = app.Pool .fmul ( v0,v1 );
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinx:I */
/* .line 1690 */
/* mul-int v30, v14, v25 */
/* move/from16 v0, v30 */
/* move v1, v10 */
v30 = app.Pool .fmul ( v0,v1 );
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinz:I */
/* .line 1698 */
} // :cond_22
} // :goto_9
/* const/16 v27, 0x0 */
/* .line 1699 */
/* .restart local v27 # "t":I */
} // :goto_a
v30 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->step()Z */
if ( v30 != null) { // if-eqz v30, :cond_23
/* const/16 v30, 0x1f4 */
/* move/from16 v0, v27 */
/* move/from16 v1, v30 */
/* if-ge v0, v1, :cond_23 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_offscreen:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_2e
/* .line 1705 */
} // :cond_23
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_width:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0xf0 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-lt v0, v1, :cond_24 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_height:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0xd6 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ge v0, v1, :cond_25 */
/* .line 1706 */
} // :cond_24
/* move-object/from16 v0, p0 */
v0 = this.m_opponent;
/* move-object/from16 v30, v0 */
/* invoke-virtual/range {v30 ..v30}, Lv/Vsprite;->off()V */
/* .line 1710 */
} // :cond_25
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_reset:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_3 */
/* .line 1717 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->remove(Lv/Vsprite;)V
/* .line 1730 */
} // :cond_26
} // :goto_b
v30 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->step()Z */
/* if-nez v30, :cond_2f */
/* .line 1738 */
} // :cond_27
v30 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->step()Z */
/* if-nez v30, :cond_27 */
/* .line 1741 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spindx:I */
/* .line 1742 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spindy:I */
/* .line 1743 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinx:I */
/* .line 1744 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinz:I */
/* .line 1746 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_reset:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_3 */
/* .line 1750 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x3 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ne v0, v1, :cond_29 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_9ballHit:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_29 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playScratch:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_29 */
/* .line 1751 */
final String v30 = "Low Ball Foul"; // const-string v30, "Low Ball Foul"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).prompt ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 1752 */
final String v30 = "bad_shot_3"; // const-string v30, "bad_shot_3"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).sound ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 1753 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_28 */
/* .line 1754 */
/* const/16 v30, 0x22 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).opShow ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->opShow(I)V
/* .line 1755 */
} // :cond_28
/* const/16 v30, 0x1 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playScratch:Z */
/* .line 1756 */
/* const/16 v30, 0x1 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_9ballFoul:Z */
/* .line 1758 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->render()V */
/* .line 1759 */
/* const/16 v30, 0xfa */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).waitKey ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->waitKey(I)V
/* .line 1762 */
} // :cond_29
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playScratch:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_2b
/* .line 1764 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playAgain:Z */
/* .line 1765 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_play8ball:Z */
/* .line 1767 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v30, v0 */
/* const/16 v31, -0x8000 */
/* const v32, 0x8000 */
v31 = /* invoke-static/range {v31 ..v32}, Lapp/Pool;->franRange(II)I */
/* const v32, -0x119400 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
/* move/from16 v2, v31 */
/* move/from16 v3, v32 */
(( app.Pool ) v0 ).ballPlace ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->ballPlace(Lapp/Ball;II)V
/* .line 1769 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v30, v0 */
v30 = /* invoke-virtual/range {v30 ..v30}, Lapp/Ball;->isLinked()Z */
/* if-nez v30, :cond_2a */
/* .line 1770 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 1773 */
} // :cond_2a
/* const v5, 0xbb800 */
/* .line 1775 */
/* .local v5, "bz":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x3 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ne v0, v1, :cond_30 */
/* .line 1777 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_pocketed:I */
/* move/from16 v30, v0 */
/* move/from16 v0, v30 */
/* and-int/lit16 v0, v0, 0x100 */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_2b
/* .line 1778 */
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v30, v0 */
/* const/16 v31, 0x8 */
/* aget-object v22, v30, v31 */
/* .line 1779 */
/* .local v22, "p":Lapp/Ball; */
/* const/16 v30, -0x2000 */
/* const/16 v31, 0x2000 */
v30 = /* invoke-static/range {v30 ..v31}, Lapp/Pool;->franRange(II)I */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v22 */
/* move/from16 v2, v30 */
/* move v3, v5 */
(( app.Pool ) v0 ).ballPlace ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->ballPlace(Lapp/Ball;II)V
/* .line 1780 */
/* move-object/from16 v0, v22 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v30, v0 */
/* const v31, 0x12000 */
/* add-int v5, v30, v31 */
/* .line 1781 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v22 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 1782 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).scoreDecrement ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->scoreDecrement(Z)V
/* .line 1821 */
} // .end local v5 # "bz":I
} // .end local v22 # "p":Lapp/Ball;
} // :cond_2b
/* move-object/from16 v0, p0 */
v0 = this.m_score1;
/* move-object/from16 v30, v0 */
v24 = /* invoke-virtual/range {v30 ..v30}, Lv/Vtext;->getNumber()I */
/* .line 1823 */
/* .local v24, "score":I */
if ( v24 != null) { // if-eqz v24, :cond_37
v30 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->eval()Z */
if ( v30 != null) { // if-eqz v30, :cond_37
/* .line 1827 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->unlock()V */
/* .line 1828 */
v30 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->eval()Z */
if ( v30 != null) { // if-eqz v30, :cond_37
/* .line 1829 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->noResume()V */
/* .line 1830 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->breakView()V */
/* goto/16 :goto_2 */
/* .line 1683 */
} // .end local v24 # "score":I
} // .end local v27 # "t":I
} // :cond_2c
/* const/16 v32, 0x0 */
/* goto/16 :goto_8 */
/* .line 1692 */
} // :cond_2d
if ( v15 != null) { // if-eqz v15, :cond_22
/* .line 1693 */
/* mul-int v30, v15, v25 */
/* move/from16 v0, v30 */
/* move v1, v10 */
v30 = app.Pool .fmul ( v0,v1 );
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinx:I */
/* .line 1694 */
/* mul-int v30, v15, v6 */
/* move/from16 v0, v30 */
/* move v1, v10 */
v30 = app.Pool .fmul ( v0,v1 );
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinz:I */
/* goto/16 :goto_9 */
/* .line 1700 */
/* .restart local v27 # "t":I */
} // :cond_2e
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_tlast:I */
/* move/from16 v30, v0 */
/* add-int v27, v27, v30 */
/* goto/16 :goto_a */
/* .line 1731 */
} // :cond_2f
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_offscreen:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_26
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_breakView:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_26 */
/* .line 1733 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->breakViewSettings()V */
/* goto/16 :goto_b */
/* .line 1786 */
/* .restart local v5 # "bz":I */
} // :cond_30
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "bi":I */
} // :goto_c
/* const/16 v30, 0xf */
/* move v0, v4 */
/* move/from16 v1, v30 */
/* if-ge v0, v1, :cond_2b */
/* .line 1787 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_pocketed:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x1 */
/* shl-int v31, v31, v4 */
/* and-int v30, v30, v31 */
if ( v30 != null) { // if-eqz v30, :cond_31
/* .line 1788 */
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v30, v0 */
/* aget-object v22, v30, v4 */
/* .line 1789 */
/* .restart local v22 # "p":Lapp/Ball; */
/* const/16 v30, -0x2000 */
/* const/16 v31, 0x2000 */
v30 = /* invoke-static/range {v30 ..v31}, Lapp/Pool;->franRange(II)I */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v22 */
/* move/from16 v2, v30 */
/* move v3, v5 */
(( app.Pool ) v0 ).ballPlace ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->ballPlace(Lapp/Ball;II)V
/* .line 1790 */
/* move-object/from16 v0, v22 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v30, v0 */
/* const v31, 0x12000 */
/* add-int v5, v30, v31 */
/* .line 1791 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v22 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 1793 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_36 */
/* .line 1794 */
/* const/16 v30, 0x7 */
/* move v0, v4 */
/* move/from16 v1, v30 */
/* if-ge v0, v1, :cond_33 */
/* .line 1795 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playSolids:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_32 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playStripes:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_32 */
/* .line 1796 */
/* const/16 v30, 0x1 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).scoreDecrement ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->scoreDecrement(Z)V
/* .line 1786 */
} // .end local v22 # "p":Lapp/Ball;
} // :cond_31
} // :goto_d
/* add-int/lit8 v4, v4, 0x1 */
/* .line 1798 */
/* .restart local v22 # "p":Lapp/Ball; */
} // :cond_32
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playSolids:Z */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).scoreDecrement ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->scoreDecrement(Z)V
/* .line 1800 */
} // :cond_33
/* const/16 v30, 0x8 */
/* move v0, v4 */
/* move/from16 v1, v30 */
/* if-lt v0, v1, :cond_35 */
/* .line 1801 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playSolids:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_34 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playStripes:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_34 */
/* .line 1802 */
/* const/16 v30, 0x0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).scoreDecrement ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->scoreDecrement(Z)V
/* .line 1804 */
} // :cond_34
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playStripes:Z */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).scoreDecrement ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->scoreDecrement(Z)V
/* .line 1808 */
} // :cond_35
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).scoreDecrement ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->scoreDecrement(Z)V
/* .line 1813 */
} // :cond_36
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).scoreDecrement ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->scoreDecrement(Z)V
/* .line 1838 */
} // .end local v4 # "bi":I
} // .end local v5 # "bz":I
} // .end local v22 # "p":Lapp/Ball;
/* .restart local v24 # "score":I */
} // :cond_37
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playBreak:Z */
/* .line 1840 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x1 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ne v0, v1, :cond_38 */
/* .line 1841 */
/* const/16 v30, 0x1 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playAgain:Z */
/* .line 1843 */
} // :cond_38
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playAgain:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_39 */
/* .line 1844 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_42
/* const/16 v30, 0x0 */
} // :goto_e
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_player:Z */
/* .line 1846 */
} // :cond_39
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinx:I */
/* .line 1847 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinz:I */
/* .line 1850 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->prefBallSave()V */
/* .line 1858 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_3c */
/* .line 1859 */
/* move-object/from16 v0, p0 */
v0 = this.m_opponent;
/* move-object/from16 v30, v0 */
v30 = /* invoke-virtual/range {v30 ..v30}, Lv/Vsprite;->isLinked()Z */
/* if-nez v30, :cond_3c */
/* .line 1860 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->menuOff()V */
/* .line 1862 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_3a */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playStripes:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_3a */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playSolids:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_3b
/* .line 1863 */
} // :cond_3a
/* move-object/from16 v0, p0 */
v0 = this.m_score1;
/* move-object/from16 v30, v0 */
/* const/16 v31, 0x4000 */
/* invoke-virtual/range {v30 ..v31}, Lv/Vtext;->setAlpha(I)V */
/* .line 1864 */
/* move-object/from16 v0, p0 */
v0 = this.m_score2;
/* move-object/from16 v30, v0 */
/* const v31, 0x8000 */
/* invoke-virtual/range {v30 ..v31}, Lv/Vtext;->setAlpha(I)V */
/* .line 1867 */
} // :cond_3b
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->breakViewSettings()V */
/* .line 1869 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_scoredif:I */
/* move/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_scoredif0:I */
/* move/from16 v31, v0 */
/* sub-int v30, v30, v31 */
/* if-lez v30, :cond_43 */
/* .line 1870 */
/* const/16 v30, 0x22 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).opShow ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->opShow(I)V
/* .line 1874 */
} // :goto_f
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->render()V */
/* .line 1881 */
} // :cond_3c
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x2 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ne v0, v1, :cond_44 */
/* move-object/from16 v0, p0 */
v0 = this.m_score1;
/* move-object/from16 v30, v0 */
v30 = /* invoke-virtual/range {v30 ..v30}, Lv/Vtext;->getNumber()I */
/* const/16 v31, 0x8 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ge v0, v1, :cond_3d */
/* move-object/from16 v0, p0 */
v0 = this.m_score2;
/* move-object/from16 v30, v0 */
v30 = /* invoke-virtual/range {v30 ..v30}, Lv/Vtext;->getNumber()I */
/* const/16 v31, 0x8 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-lt v0, v1, :cond_44 */
/* .line 1882 */
} // :cond_3d
int v4 = -1; // const/4 v4, -0x1
/* .line 1886 */
/* .restart local v4 # "bi":I */
} // :goto_10
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x3 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ne v0, v1, :cond_45 */
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v30, v0 */
/* const/16 v31, 0x8 */
/* aget-object v30, v30, v31 */
v30 = /* invoke-virtual/range {v30 ..v30}, Lapp/Ball;->isLinked()Z */
/* if-nez v30, :cond_45 */
/* const/16 v30, 0x1 */
/* move/from16 v21, v30 */
/* .line 1888 */
/* .local v21, "nineBall":Z */
} // :goto_11
/* const/16 v30, -0x1 */
/* move v0, v4 */
/* move/from16 v1, v30 */
/* if-eq v0, v1, :cond_3e */
/* .line 1889 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_play8ball:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_3e */
/* .line 1888 */
if ( v21 != null) { // if-eqz v21, :cond_4d
/* .line 1894 */
} // :cond_3e
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x1 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-eq v0, v1, :cond_41 */
/* .line 1895 */
/* const/16 v29, 0x0 */
/* .line 1896 */
/* .local v29, "win":Z */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_47 */
/* .line 1898 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_3f
/* const/16 v30, -0x1 */
/* move v0, v4 */
/* move/from16 v1, v30 */
/* if-eq v0, v1, :cond_46 */
} // :cond_3f
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_40 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_play8ball:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_40
/* const/16 v30, -0x1 */
/* move v0, v4 */
/* move/from16 v1, v30 */
/* if-ne v0, v1, :cond_46 */
} // :cond_40
/* const/16 v30, 0x0 */
/* move/from16 v29, v30 */
/* .line 1907 */
} // :goto_12
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_play8ball:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_4a
/* const/16 v30, -0x1 */
/* move v0, v4 */
/* move/from16 v1, v30 */
/* if-eq v0, v1, :cond_4a */
/* .line 1908 */
final String v30 = "8 Ball"; // const-string v30, "8 Ball"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).prompt ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 1914 */
} // :goto_13
if ( v29 != null) { // if-eqz v29, :cond_4c
/* .line 1919 */
final String v30 = "title_music"; // const-string v30, "title_music"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).sound ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 1920 */
/* const/16 v30, 0x22 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).opShow ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->opShow(I)V
/* .line 1931 */
} // :goto_14
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->breakViewSettings()V */
/* .line 1933 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v29 */
(( app.Pool ) v0 ).topInsert ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->topInsert(Z)V
/* .line 1934 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v29 */
(( app.Pool ) v0 ).topShow ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->topShow(Z)V
/* .line 1937 */
} // .end local v29 # "win":Z
} // :cond_41
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->breakView()V */
/* goto/16 :goto_2 */
/* .line 1844 */
} // .end local v4 # "bi":I
} // .end local v21 # "nineBall":Z
} // :cond_42
/* const/16 v30, 0x1 */
/* goto/16 :goto_e */
/* .line 1873 */
} // :cond_43
/* const/16 v30, 0x20 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).opShow ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->opShow(I)V
/* goto/16 :goto_f */
/* .line 1884 */
} // :cond_44
v4 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->bestShot()I */
/* .restart local v4 # "bi":I */
/* goto/16 :goto_10 */
/* .line 1886 */
} // :cond_45
/* const/16 v30, 0x0 */
/* move/from16 v21, v30 */
/* goto/16 :goto_11 */
/* .line 1898 */
/* .restart local v21 # "nineBall":Z */
/* .restart local v29 # "win":Z */
} // :cond_46
/* const/16 v30, 0x1 */
/* move/from16 v29, v30 */
/* .line 1900 */
} // :cond_47
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x3 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-ne v0, v1, :cond_48 */
/* .line 1901 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v29, v0 */
/* .line 1904 */
} // :cond_48
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_scoredif:I */
/* move/from16 v30, v0 */
/* if-lez v30, :cond_49 */
/* const/16 v30, 0x1 */
/* move/from16 v29, v30 */
} // :goto_15
/* goto/16 :goto_12 */
} // :cond_49
/* const/16 v30, 0x0 */
/* move/from16 v29, v30 */
/* .line 1909 */
} // :cond_4a
if ( v21 != null) { // if-eqz v21, :cond_4b
/* const/16 v30, -0x1 */
/* move v0, v4 */
/* move/from16 v1, v30 */
/* if-eq v0, v1, :cond_4b */
/* .line 1910 */
final String v30 = "9 Ball Sunk"; // const-string v30, "9 Ball Sunk"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).prompt ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* goto/16 :goto_13 */
/* .line 1912 */
} // :cond_4b
/* move-object/from16 v0, p0 */
v0 = this.m_prompt;
/* move-object/from16 v30, v0 */
/* invoke-virtual/range {v30 ..v30}, Lv/Vtext;->off()V */
/* goto/16 :goto_13 */
/* .line 1924 */
} // :cond_4c
final String v30 = "title_music_option2"; // const-string v30, "title_music_option2"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).sound ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 1925 */
/* const/16 v30, 0x21 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v30 */
(( app.Pool ) v0 ).opShow ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->opShow(I)V
/* goto/16 :goto_14 */
/* .line 1942 */
} // .end local v29 # "win":Z
} // :cond_4d
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playAgain:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_4e
/* .line 1943 */
/* const/16 v30, 0x0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Pool;->m_playAgain:Z */
/* .line 1945 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_4e
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v30, v0 */
/* const/16 v31, 0x1 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-eq v0, v1, :cond_4e */
/* .line 1946 */
final String v30 = "good_shot"; // const-string v30, "good_shot"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).sound ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 1949 */
} // :cond_4e
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->turn()V */
/* .line 1951 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
/* if-nez v30, :cond_4f */
/* .line 1953 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->prefSave()V */
/* .line 1956 */
} // :cond_4f
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_52
/* .line 1957 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_cueAngle:I */
/* move/from16 v30, v0 */
/* move/from16 v0, v30 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_heading:I */
/* .line 1958 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->lookAt0()V */
/* .line 1963 */
} // :goto_16
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_player:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_50
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playScratch:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_50
/* .line 1964 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->ballInHand()V */
/* .line 1966 */
} // :cond_50
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
v30 = /* invoke-virtual/range {v30 ..v30}, Lv/Vsprite;->isLinked()Z */
/* if-nez v30, :cond_51 */
/* .line 1967 */
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v30 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 1969 */
} // :cond_51
/* move-object/from16 v0, p0 */
v0 = this.m_cue;
/* move-object/from16 v30, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v31, v0 */
v31 = /* invoke-virtual/range {v31 ..v31}, Lapp/Ball;->getWx()I */
/* const v32, 0xb000 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v33, v0 */
v33 = /* invoke-virtual/range {v33 ..v33}, Lapp/Ball;->getWz()I */
/* invoke-virtual/range {v30 ..v33}, Lv/Vsprite;->setWxyz(III)V */
/* goto/16 :goto_2 */
/* .line 1961 */
} // :cond_52
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->breakViewSettings()V */
/* .line 1611 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x1 -> :sswitch_0 */
/* 0x2 -> :sswitch_1 */
/* 0x3 -> :sswitch_2 */
/* 0x4 -> :sswitch_3 */
/* 0x32 -> :sswitch_2 */
/* 0x34 -> :sswitch_0 */
/* 0x36 -> :sswitch_1 */
/* 0x38 -> :sswitch_3 */
} // .end sparse-switch
} // .end method
public void destroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1980 */
v.V3dModel .destroy ( );
/* .line 1981 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2015 */
return;
} // .end method
Boolean eval ( ) {
/* .locals 1 */
/* .prologue */
/* .line 2019 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
Boolean gameOver ( ) {
/* .locals 2 */
/* .prologue */
/* .line 2106 */
/* iget-boolean v0, p0, Lapp/Pool;->m_started:Z */
/* if-nez v0, :cond_0 */
int v0 = 5; // const/4 v0, 0x5
v0 = (( app.Pool ) p0 ).prefRead ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->prefRead(I)I
/* const/16 v1, 0x7fff */
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
void heading ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "angle" # I */
/* .prologue */
/* .line 2110 */
/* iget v0, p0, Lapp/Pool;->m_heading:I */
/* add-int/2addr v0, p1 */
/* iput v0, p0, Lapp/Pool;->m_heading:I */
/* .line 2111 */
(( app.Pool ) p0 ).lookAt ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt()V
/* .line 2112 */
return;
} // .end method
void help ( ) {
/* .locals 20 */
/* .prologue */
/* .line 2120 */
/* const/16 v17, 0x0 */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_dragy:I */
/* .line 2122 */
/* new-instance v10, Lv/Vtext; */
/* invoke-direct {v10}, Lv/Vtext;-><init>()V */
/* .line 2123 */
/* .local v10, "pt":Lv/Vtext; */
/* const v17, -0x7fbfbf80 # -5.90061E-39f */
/* move-object v0, v10 */
/* move/from16 v1, v17 */
(( v.Vtext ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Lv/Vtext;->setColor(I)V
/* .line 2125 */
/* const/16 v17, -0x2 */
/* move-object v0, v10 */
/* move/from16 v1, v17 */
(( v.Vtext ) v0 ).setZ ( v1 ); // invoke-virtual {v0, v1}, Lv/Vtext;->setZ(I)V
/* .line 2127 */
/* const/16 v13, 0xe4 */
/* .line 2128 */
/* .local v13, "w":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_width:I */
/* move/from16 v17, v0 */
/* move v0, v13 */
/* move/from16 v1, v17 */
/* if-le v0, v1, :cond_0 */
/* .line 2129 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_width:I */
/* move/from16 v17, v0 */
/* const/16 v18, 0xc */
/* sub-int v13, v17, v18 */
/* .line 2130 */
} // :cond_0
/* const/16 v17, 0x0 */
/* move-object v0, v10 */
/* move v1, v13 */
/* move/from16 v2, v17 */
(( v.Vtext ) v0 ).setWidthHeight ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vtext;->setWidthHeight(II)V
/* .line 2131 */
/* move-object/from16 v0, p0 */
v0 = this.m_display;
/* move-object/from16 v17, v0 */
final String v18 = "help.txt"; // const-string v18, "help.txt"
/* move-object v0, v10 */
/* move-object/from16 v1, v17 */
/* move-object/from16 v2, v18 */
(( v.Vtext ) v0 ).setFile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vtext;->setFile(Lv/Vdisplay;Ljava/lang/String;)V
/* .line 2134 */
/* add-int/lit8 v13, v13, 0xc */
/* .line 2135 */
v17 = (( v.Vtext ) v10 ).getHeight ( ); // invoke-virtual {v10}, Lv/Vtext;->getHeight()I
/* move-object v0, v10 */
/* move v1, v13 */
/* move/from16 v2, v17 */
(( v.Vtext ) v0 ).setWidthHeight ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vtext;->setWidthHeight(II)V
/* .line 2136 */
/* move-object/from16 v0, p0 */
/* move-object v1, v10 */
(( app.Pool ) v0 ).addCenter ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 2138 */
v17 = (( v.Vtext ) v10 ).getX ( ); // invoke-virtual {v10}, Lv/Vtext;->getX()I
/* shr-int/lit8 v17, v17, 0xf */
/* add-int v17, v17, v13 */
/* const/16 v18, 0xc */
/* sub-int v15, v17, v18 */
/* .line 2140 */
/* .local v15, "xs":I */
/* new-instance v3, Lv/Vsprite; */
/* invoke-direct {v3}, Lv/Vsprite;-><init>()V */
/* .line 2141 */
/* .local v3, "close":Lv/Vsprite; */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x16 */
/* move-object v0, v3 */
/* move-object/from16 v1, v17 */
/* move/from16 v2, v18 */
(( v.Vsprite ) v0 ).setImage ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 2142 */
/* const/16 v17, 0x6 */
/* move-object v0, v3 */
/* move v1, v15 */
/* move/from16 v2, v17 */
(( v.Vsprite ) v0 ).setXyi ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setXyi(II)V
/* .line 2143 */
/* const/16 v17, -0x3 */
/* move-object v0, v3 */
/* move/from16 v1, v17 */
(( v.Vsprite ) v0 ).setZ ( v1 ); // invoke-virtual {v0, v1}, Lv/Vsprite;->setZ(I)V
/* .line 2144 */
/* move-object/from16 v0, p0 */
/* move-object v1, v3 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 2146 */
/* new-instance v12, Lv/Vsprite; */
/* invoke-direct {v12}, Lv/Vsprite;-><init>()V */
/* .line 2147 */
/* .local v12, "up":Lv/Vsprite; */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x14 */
/* move-object v0, v12 */
/* move-object/from16 v1, v17 */
/* move/from16 v2, v18 */
(( v.Vsprite ) v0 ).setImage ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 2148 */
/* const/16 v17, 0x40 */
/* move-object v0, v12 */
/* move v1, v15 */
/* move/from16 v2, v17 */
(( v.Vsprite ) v0 ).setXyi ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setXyi(II)V
/* .line 2149 */
/* const/16 v17, -0x3 */
/* move-object v0, v12 */
/* move/from16 v1, v17 */
(( v.Vsprite ) v0 ).setZ ( v1 ); // invoke-virtual {v0, v1}, Lv/Vsprite;->setZ(I)V
/* .line 2151 */
/* new-instance v4, Lv/Vsprite; */
/* invoke-direct {v4}, Lv/Vsprite;-><init>()V */
/* .line 2152 */
/* .local v4, "down":Lv/Vsprite; */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x15 */
/* move-object v0, v4 */
/* move-object/from16 v1, v17 */
/* move/from16 v2, v18 */
(( v.Vsprite ) v0 ).setImage ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 2153 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_height:I */
/* move/from16 v17, v0 */
/* const/16 v18, 0xa */
/* sub-int v17, v17, v18 */
/* move-object v0, v4 */
/* move v1, v15 */
/* move/from16 v2, v17 */
(( v.Vsprite ) v0 ).setXyi ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setXyi(II)V
/* .line 2154 */
/* const/16 v17, -0x3 */
/* move-object v0, v4 */
/* move/from16 v1, v17 */
(( v.Vsprite ) v0 ).setZ ( v1 ); // invoke-virtual {v0, v1}, Lv/Vsprite;->setZ(I)V
/* .line 2156 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_width:I */
/* move/from16 v17, v0 */
/* sub-int v17, v17, v13 */
/* shl-int/lit8 v14, v17, 0xe */
/* .line 2157 */
/* .local v14, "x":I */
/* const/16 v16, 0x0 */
/* .line 2158 */
/* .local v16, "y":I */
/* move-object v0, v10 */
/* move v1, v14 */
/* move/from16 v2, v16 */
(( v.Vtext ) v0 ).setXy ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vtext;->setXy(II)V
/* .line 2165 */
v.Vtext .getFontDefault ( );
v6 = /* invoke-virtual/range {v17 ..v17}, Lv/Vfont;->getHeight()I */
/* .line 2166 */
/* .local v6, "fh0":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_height:I */
/* move/from16 v17, v0 */
/* div-int v17, v17, v6 */
/* const/16 v18, 0x1 */
/* sub-int v17, v17, v18 */
/* mul-int v17, v17, v6 */
/* shl-int/lit8 v5, v17, 0xf */
/* .line 2168 */
/* .local v5, "fh":I */
} // :cond_1
} // :goto_0
v17 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->isRunning()Z */
/* if-nez v17, :cond_3 */
/* .line 2267 */
} // :cond_2
} // :goto_1
/* move-object/from16 v0, p0 */
/* move-object v1, v10 */
(( app.Pool ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->remove(Lv/Vsprite;)V
/* .line 2268 */
(( v.Vsprite ) v3 ).off ( ); // invoke-virtual {v3}, Lv/Vsprite;->off()V
/* .line 2269 */
(( v.Vsprite ) v12 ).off ( ); // invoke-virtual {v12}, Lv/Vsprite;->off()V
/* .line 2270 */
(( v.Vsprite ) v4 ).off ( ); // invoke-virtual {v4}, Lv/Vsprite;->off()V
/* .line 2271 */
return;
/* .line 2169 */
} // :cond_3
v17 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->screenResize()Z */
/* if-nez v17, :cond_2 */
/* .line 2172 */
/* if-gez v16, :cond_a */
/* .line 2173 */
v17 = (( v.Vsprite ) v12 ).isLinked ( ); // invoke-virtual {v12}, Lv/Vsprite;->isLinked()Z
/* if-nez v17, :cond_4 */
/* .line 2174 */
/* move-object/from16 v0, p0 */
/* move-object v1, v12 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 2179 */
} // :cond_4
} // :goto_2
/* shr-int/lit8 v17, v16, 0xf */
v18 = (( v.Vtext ) v10 ).getHeight ( ); // invoke-virtual {v10}, Lv/Vtext;->getHeight()I
/* add-int v7, v17, v18 */
/* .line 2180 */
/* .local v7, "h":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_height:I */
/* move/from16 v17, v0 */
/* move v0, v7 */
/* move/from16 v1, v17 */
/* if-le v0, v1, :cond_b */
/* .line 2181 */
v17 = (( v.Vsprite ) v4 ).isLinked ( ); // invoke-virtual {v4}, Lv/Vsprite;->isLinked()Z
/* if-nez v17, :cond_5 */
/* .line 2182 */
/* move-object/from16 v0, p0 */
/* move-object v1, v4 */
(( app.Pool ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 2193 */
} // :cond_5
} // :goto_3
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->render()V */
/* .line 2196 */
/* const/16 v17, 0x40 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v17 */
(( app.Pool ) v0 ).waitMs ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->waitMs(I)V
/* .line 2199 */
v8 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->keyGet()C */
/* .line 2202 */
/* .local v8, "key":C */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousex:I */
/* move/from16 v17, v0 */
if ( v17 != null) { // if-eqz v17, :cond_7
/* .line 2203 */
/* const/16 v17, 0x5 */
/* move v0, v8 */
/* move/from16 v1, v17 */
/* if-ne v0, v1, :cond_6 */
/* .line 2205 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousex:I */
/* move/from16 v17, v0 */
/* const/16 v18, 0x18 */
/* sub-int v18, v15, v18 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-le v0, v1, :cond_c */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousex:I */
/* move/from16 v17, v0 */
/* add-int/lit8 v18, v15, 0x20 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_c */
/* const/16 v17, 0x1 */
/* move/from16 v11, v17 */
/* .line 2209 */
/* .local v11, "scroll":Z */
} // :goto_4
if ( v11 != null) { // if-eqz v11, :cond_d
v17 = (( v.Vsprite ) v12 ).isLinked ( ); // invoke-virtual {v12}, Lv/Vsprite;->isLinked()Z
if ( v17 != null) { // if-eqz v17, :cond_d
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousey:I */
/* move/from16 v17, v0 */
/* move-object v0, v12 */
/* iget v0, v0, Lv/Vsprite;->m_sy0:I */
/* move/from16 v18, v0 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-lt v0, v1, :cond_d */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousey:I */
/* move/from16 v17, v0 */
/* move-object v0, v12 */
/* iget v0, v0, Lv/Vsprite;->m_sy1:I */
/* move/from16 v18, v0 */
/* add-int/lit8 v18, v18, 0x18 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_d */
/* .line 2210 */
int v8 = 3; // const/4 v8, 0x3
/* .line 2221 */
} // .end local v11 # "scroll":Z
} // :cond_6
} // :goto_5
if ( v8 != null) { // if-eqz v8, :cond_7
/* .line 2222 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->click()V */
/* .line 2225 */
/* const/16 v17, 0x0 */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_mousex:I */
/* .line 2226 */
/* const/16 v17, 0x0 */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_dragy:I */
/* .line 2231 */
} // :cond_7
/* const/16 v17, 0x32 */
/* move v0, v8 */
/* move/from16 v1, v17 */
/* if-eq v0, v1, :cond_8 */
/* const/16 v17, 0x3 */
/* move v0, v8 */
/* move/from16 v1, v17 */
/* if-eq v0, v1, :cond_8 */
/* const/16 v17, 0x1 */
/* move v0, v8 */
/* move/from16 v1, v17 */
/* if-ne v0, v1, :cond_10 */
/* .line 2232 */
} // :cond_8
/* if-gez v16, :cond_9 */
/* .line 2233 */
/* add-int v16, v16, v5 */
/* .line 2234 */
/* if-lez v16, :cond_9 */
/* .line 2235 */
/* const/16 v16, 0x0 */
/* .line 2237 */
} // :cond_9
/* move-object v0, v10 */
/* move v1, v14 */
/* move/from16 v2, v16 */
(( v.Vtext ) v0 ).setXy ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vtext;->setXy(II)V
/* goto/16 :goto_0 */
/* .line 2177 */
} // .end local v7 # "h":I
} // .end local v8 # "key":C
} // :cond_a
(( v.Vsprite ) v12 ).off ( ); // invoke-virtual {v12}, Lv/Vsprite;->off()V
/* goto/16 :goto_2 */
/* .line 2185 */
/* .restart local v7 # "h":I */
} // :cond_b
(( v.Vsprite ) v4 ).off ( ); // invoke-virtual {v4}, Lv/Vsprite;->off()V
/* goto/16 :goto_3 */
/* .line 2205 */
/* .restart local v8 # "key":C */
} // :cond_c
/* const/16 v17, 0x0 */
/* move/from16 v11, v17 */
/* .line 2211 */
/* .restart local v11 # "scroll":Z */
} // :cond_d
if ( v11 != null) { // if-eqz v11, :cond_e
v17 = (( v.Vsprite ) v4 ).isLinked ( ); // invoke-virtual {v4}, Lv/Vsprite;->isLinked()Z
if ( v17 != null) { // if-eqz v17, :cond_e
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousey:I */
/* move/from16 v17, v0 */
/* move-object v0, v4 */
/* iget v0, v0, Lv/Vsprite;->m_sy0:I */
/* move/from16 v18, v0 */
/* const/16 v19, 0x18 */
/* sub-int v18, v18, v19 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-le v0, v1, :cond_e */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousey:I */
/* move/from16 v17, v0 */
/* move-object v0, v4 */
/* iget v0, v0, Lv/Vsprite;->m_sy1:I */
/* move/from16 v18, v0 */
/* add-int/lit8 v18, v18, 0x18 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_e */
/* .line 2212 */
int v8 = 4; // const/4 v8, 0x4
/* .line 2213 */
} // :cond_e
if ( v11 != null) { // if-eqz v11, :cond_f
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousey:I */
/* move/from16 v17, v0 */
/* move-object v0, v3 */
/* iget v0, v0, Lv/Vsprite;->m_sy0:I */
/* move/from16 v18, v0 */
/* const/16 v19, 0x6 */
/* sub-int v18, v18, v19 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-le v0, v1, :cond_f */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousey:I */
/* move/from16 v17, v0 */
/* move-object v0, v3 */
/* iget v0, v0, Lv/Vsprite;->m_sy1:I */
/* move/from16 v18, v0 */
/* add-int/lit8 v18, v18, 0x18 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-lt v0, v1, :cond_6 */
/* .line 2215 */
} // :cond_f
int v8 = 0; // const/4 v8, 0x0
/* goto/16 :goto_5 */
/* .line 2240 */
} // .end local v11 # "scroll":Z
} // :cond_10
/* const/16 v17, 0x38 */
/* move v0, v8 */
/* move/from16 v1, v17 */
/* if-eq v0, v1, :cond_11 */
/* const/16 v17, 0x4 */
/* move v0, v8 */
/* move/from16 v1, v17 */
/* if-eq v0, v1, :cond_11 */
/* const/16 v17, 0x2 */
/* move v0, v8 */
/* move/from16 v1, v17 */
/* if-ne v0, v1, :cond_13 */
/* .line 2241 */
} // :cond_11
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_height:I */
/* move/from16 v17, v0 */
/* move v0, v7 */
/* move/from16 v1, v17 */
/* if-le v0, v1, :cond_12 */
/* .line 2242 */
/* sub-int v16, v16, v5 */
/* .line 2244 */
} // :cond_12
/* move-object v0, v10 */
/* move v1, v14 */
/* move/from16 v2, v16 */
(( v.Vtext ) v0 ).setXy ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vtext;->setXy(II)V
/* goto/16 :goto_0 */
/* .line 2246 */
} // :cond_13
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragy:I */
/* move/from16 v17, v0 */
if ( v17 != null) { // if-eqz v17, :cond_16
/* .line 2247 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_dragy:I */
/* move/from16 v17, v0 */
/* shl-int/lit8 v17, v17, 0xf */
/* add-int v16, v16, v17 */
/* .line 2249 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_height:I */
/* move/from16 v17, v0 */
v18 = (( v.Vtext ) v10 ).getHeight ( ); // invoke-virtual {v10}, Lv/Vtext;->getHeight()I
/* sub-int v17, v17, v18 */
/* shl-int/lit8 v9, v17, 0xf */
/* .line 2251 */
/* .local v9, "lim":I */
/* if-lez v16, :cond_15 */
/* .line 2252 */
/* const/16 v16, 0x0 */
/* .line 2256 */
} // :cond_14
} // :goto_6
/* move-object v0, v10 */
/* move v1, v14 */
/* move/from16 v2, v16 */
(( v.Vtext ) v0 ).setXy ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vtext;->setXy(II)V
/* .line 2258 */
/* const/16 v17, 0x0 */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_dragx:I */
/* .line 2259 */
/* const/16 v17, 0x0 */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_dragy:I */
/* goto/16 :goto_0 */
/* .line 2253 */
} // :cond_15
/* move/from16 v0, v16 */
/* move v1, v9 */
/* if-ge v0, v1, :cond_14 */
/* .line 2254 */
/* move/from16 v16, v9 */
/* .line 2261 */
} // .end local v9 # "lim":I
} // :cond_16
if ( v8 != null) { // if-eqz v8, :cond_1
/* goto/16 :goto_1 */
} // .end method
void initOnce ( ) {
/* .locals 12 */
/* .prologue */
/* .line 2275 */
int v5 = 0; // const/4 v5, 0x0
/* .line 2278 */
/* .local v5, "msquare":I */
/* sget-boolean v8, Lv/Vmenu;->m_mouse:Z */
/* if-nez v8, :cond_4 */
/* .line 2293 */
} // :cond_0
} // :goto_0
int v8 = 2; // const/4 v8, 0x2
/* iput v8, p0, Lapp/Pool;->m_game:I */
/* .line 2296 */
/* new-instance v0, Lv/Vfont; */
/* invoke-direct {v0}, Lv/Vfont;-><init>()V */
/* .line 2299 */
/* .local v0, "f":Lv/Vfont; */
/* iget v8, p0, Lapp/Pool;->m_width:I */
/* const/16 v9, 0xf0 */
/* if-lt v8, v9, :cond_6 */
/* iget v8, p0, Lapp/Pool;->m_height:I */
/* const/16 v9, 0xa0 */
/* if-le v8, v9, :cond_6 */
/* .line 2300 */
final String v1 = "f16.bin"; // const-string v1, "f16.bin"
/* .line 2307 */
/* .local v1, "fnt":Ljava/lang/String; */
} // :goto_1
v8 = this.m_display;
v8 = (( v.Vfont ) v0 ).open ( v8, v1 ); // invoke-virtual {v0, v8, v1}, Lv/Vfont;->open(Lv/Vdisplay;Ljava/lang/String;)Z
/* if-nez v8, :cond_1 */
/* .line 2308 */
app.Pool .error ( v1 );
/* .line 2310 */
} // :cond_1
v.Vtext .setFontDefault ( v0 );
/* .line 2311 */
int v8 = -1; // const/4 v8, -0x1
v.Vtext .setTextColorDefault ( v8 );
/* .line 2312 */
/* const v8, -0x7fbfbf80 # -5.90061E-39f */
v.Vmenu .setColorDefault ( v8 );
/* .line 2313 */
int v8 = 2; // const/4 v8, 0x2
/* .line 2315 */
/* new-instance v8, Lv/Vilib; */
v9 = this.m_display;
final String v10 = "app"; // const-string v10, "app"
int v11 = 0; // const/4 v11, 0x0
/* invoke-direct {v8, v9, v10, v11}, Lv/Vilib;-><init>(Lv/Vdisplay;Ljava/lang/String;I)V */
this.m_lib = v8;
/* .line 2320 */
(( app.Pool ) p0 ).titleInit ( ); // invoke-virtual {p0}, Lapp/Pool;->titleInit()V
/* .line 2322 */
final String v8 = ""; // const-string v8, ""
(( app.Pool ) p0 ).scoreCard ( v8 ); // invoke-virtual {p0, v8}, Lapp/Pool;->scoreCard(Ljava/lang/String;)Lv/Vtext;
this.m_score1 = v8;
/* .line 2323 */
final String v8 = ""; // const-string v8, ""
(( app.Pool ) p0 ).scoreCard ( v8 ); // invoke-virtual {p0, v8}, Lapp/Pool;->scoreCard(Ljava/lang/String;)Lv/Vtext;
this.m_score2 = v8;
/* .line 2325 */
(( app.Pool ) p0 ).prefLoad ( ); // invoke-virtual {p0}, Lapp/Pool;->prefLoad()V
/* .line 2327 */
v8 = this.m_score1;
int v9 = 4; // const/4 v9, 0x4
int v10 = 4; // const/4 v10, 0x4
(( v.Vtext ) v8 ).setXyi ( v9, v10 ); // invoke-virtual {v8, v9, v10}, Lv/Vtext;->setXyi(II)V
/* .line 2328 */
(( app.Pool ) p0 ).score2Layout ( ); // invoke-virtual {p0}, Lapp/Pool;->score2Layout()V
/* .line 2333 */
/* new-instance v8, Lv/Vsprite; */
/* invoke-direct {v8}, Lv/Vsprite;-><init>()V */
this.m_opponent = v8;
/* .line 2335 */
v8 = this.m_opponent;
int v9 = -1; // const/4 v9, -0x1
(( v.Vsprite ) v8 ).setZ ( v9 ); // invoke-virtual {v8, v9}, Lv/Vsprite;->setZ(I)V
/* .line 2337 */
/* new-instance v8, Lv/Vphysics; */
/* invoke-direct {v8}, Lv/Vphysics;-><init>()V */
this.m_physics = v8;
/* .line 2343 */
final String v8 = "p3d"; // const-string v8, "p3d"
v9 = this.m_lib;
v.V3dModel .open ( v8,v9 );
/* .line 2346 */
final String v8 = "cue"; // const-string v8, "cue"
(( app.Pool ) p0 ).loadModel ( v8 ); // invoke-virtual {p0, v8}, Lapp/Pool;->loadModel(Ljava/lang/String;)Lv/Vsprite;
this.m_cue = v8;
/* .line 2347 */
v8 = this.m_cue;
v8 = this.m_3dmodel;
int v9 = 1; // const/4 v9, 0x1
/* iput-boolean v9, v8, Lv/V3dModel;->m_specular:Z */
/* .line 2349 */
/* new-instance v8, Lapp/Ball; */
/* invoke-direct {v8}, Lapp/Ball;-><init>()V */
this.m_cueball = v8;
/* .line 2351 */
final String v8 = "ball_42_80"; // const-string v8, "ball_42_80"
v9 = this.m_cueball;
(( app.Pool ) p0 ).loadModel ( v8, v9 ); // invoke-virtual {p0, v8, v9}, Lapp/Pool;->loadModel(Ljava/lang/String;Lv/Vsprite;)V
/* .line 2357 */
v8 = this.m_cueball;
v8 = this.m_3dmodel;
/* const v9, 0x9000 */
/* iput v9, v8, Lv/V3dModel;->m_extentRadius:I */
/* .line 2358 */
v8 = this.m_cueball;
v8 = this.m_3dmodel;
int v9 = 1; // const/4 v9, 0x1
/* iput-boolean v9, v8, Lv/V3dModel;->m_specular:Z */
/* .line 2361 */
v8 = this.m_cueball;
(( app.Pool ) p0 ).shadowBall ( v8 ); // invoke-virtual {p0, v8}, Lapp/Pool;->shadowBall(Lv/Vsprite;)V
/* .line 2363 */
v8 = this.m_cueball;
int v9 = 0; // const/4 v9, 0x0
(( app.Pool ) p0 ).prefBallRead ( v8, v9 ); // invoke-virtual {p0, v8, v9}, Lapp/Pool;->prefBallRead(Lapp/Ball;I)V
/* .line 2365 */
/* const/16 v8, 0xf */
/* new-array v8, v8, [Lapp/Ball; */
this.m_balls = v8;
/* .line 2366 */
/* const/16 v2, 0xe */
/* .local v2, "i":I */
} // :goto_2
/* if-gez v2, :cond_7 */
/* .line 2387 */
v8 = this.m_physics;
v9 = this.m_cueball;
(( v.Vphysics ) v8 ).add ( v9 ); // invoke-virtual {v8, v9}, Lv/Vphysics;->add(Lv/Vphob;)V
/* .line 2390 */
v8 = this.m_cueball;
/* iget v8, v8, Lapp/Ball;->m_wx:I */
/* if-nez v8, :cond_9 */
v8 = this.m_cueball;
/* iget v8, v8, Lapp/Ball;->m_wz:I */
/* if-nez v8, :cond_9 */
v8 = this.m_balls;
int v9 = 0; // const/4 v9, 0x0
/* aget-object v8, v8, v9 */
/* iget v8, v8, Lapp/Ball;->m_wx:I */
/* if-nez v8, :cond_9 */
v8 = this.m_balls;
int v9 = 0; // const/4 v9, 0x0
/* aget-object v8, v8, v9 */
/* iget v8, v8, Lapp/Ball;->m_wz:I */
/* if-nez v8, :cond_9 */
/* .line 2391 */
(( app.Pool ) p0 ).noResume ( ); // invoke-virtual {p0}, Lapp/Pool;->noResume()V
/* .line 2396 */
} // :cond_2
} // :goto_3
/* new-instance v8, Lv/V3dView; */
/* invoke-direct {v8}, Lv/V3dView;-><init>()V */
this.m_table = v8;
/* .line 2398 */
v8 = this.m_table;
this.m_optcop = v8;
/* .line 2400 */
v8 = this.m_table;
int v9 = 1; // const/4 v9, 0x1
/* iput-boolean v9, v8, Lv/V3dView;->m_static:Z */
/* .line 2401 */
v8 = this.m_table;
/* const v9, 0x7fffffff */
(( v.V3dView ) v8 ).setZ ( v9 ); // invoke-virtual {v8, v9}, Lv/V3dView;->setZ(I)V
/* .line 2403 */
v8 = this.m_table;
final String v9 = "pooltable"; // const-string v9, "pooltable"
(( app.Pool ) p0 ).loadModel ( v9 ); // invoke-virtual {p0, v9}, Lapp/Pool;->loadModel(Ljava/lang/String;)Lv/Vsprite;
(( v.V3dView ) v8 ).add ( v9 ); // invoke-virtual {v8, v9}, Lv/V3dView;->add(Lv/Vsprite;)V
/* .line 2429 */
final String v8 = "room5"; // const-string v8, "room5"
(( app.Pool ) p0 ).loadModel ( v8 ); // invoke-virtual {p0, v8}, Lapp/Pool;->loadModel(Ljava/lang/String;)Lv/Vsprite;
/* .line 2431 */
/* .local v6, "p":Lv/Vsprite; */
v4 = this.m_3dmodel;
/* .line 2435 */
/* .local v4, "mo":Lv/V3dModel; */
/* const v8, 0x1c000 */
(( v.V3dModel ) v4 ).scale ( v8 ); // invoke-virtual {v4, v8}, Lv/V3dModel;->scale(I)V
/* .line 2436 */
v8 = this.m_table;
(( v.V3dView ) v8 ).add ( v6 ); // invoke-virtual {v8, v6}, Lv/V3dView;->add(Lv/Vsprite;)V
/* .line 2438 */
/* const/high16 v8, -0xc0000 */
/* iput v8, v6, Lv/Vsprite;->m_wy:I */
/* .line 2442 */
/* new-instance v8, Lv/Vtext; */
/* invoke-direct {v8}, Lv/Vtext;-><init>()V */
this.m_prompt = v8;
/* .line 2443 */
v8 = this.m_prompt;
int v9 = 2; // const/4 v9, 0x2
(( v.Vtext ) v8 ).setFieldWidth ( v9 ); // invoke-virtual {v8, v9}, Lv/Vtext;->setFieldWidth(I)V
/* .line 2445 */
/* new-instance v3, Lv/Vmenu; */
/* invoke-direct {v3}, Lv/Vmenu;-><init>()V */
/* .line 2446 */
/* .local v3, "m":Lv/Vmenu; */
this.m_menu = v3;
/* .line 2448 */
if ( v5 != null) { // if-eqz v5, :cond_a
/* .line 2450 */
v8 = this.m_lib;
/* .line 2451 */
/* iput v5, v3, Lv/Vmenu;->m_square:I */
/* .line 2452 */
int v8 = 0; // const/4 v8, 0x0
/* iput v8, v3, Lv/Vmenu;->m_color:I */
/* .line 2456 */
/* const/16 v8, 0x30 */
/* const/16 v9, 0x17 */
(( v.Vmenu ) v3 ).addTouch ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addTouch(II)V
/* .line 2457 */
/* const/16 v8, 0x32 */
/* const/16 v9, 0x14 */
(( v.Vmenu ) v3 ).addTouch ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addTouch(II)V
/* .line 2459 */
/* const/16 v8, 0x31 */
/* const/16 v9, 0x18 */
(( v.Vmenu ) v3 ).addTouch ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addTouch(II)V
/* .line 2460 */
/* const/16 v8, 0x38 */
/* const/16 v9, 0x15 */
(( v.Vmenu ) v3 ).addTouch ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addTouch(II)V
/* .line 2462 */
/* const/16 v8, 0x37 */
/* const/16 v9, 0x19 */
(( v.Vmenu ) v3 ).addTouch ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addTouch(II)V
/* .line 2463 */
/* const/16 v8, 0x34 */
/* const/16 v9, 0x13 */
(( v.Vmenu ) v3 ).addTouch ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addTouch(II)V
/* .line 2464 */
/* const/16 v8, 0x36 */
/* const/16 v9, 0x12 */
(( v.Vmenu ) v3 ).addTouch ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addTouch(II)V
/* .line 2465 */
/* const/16 v8, 0x35 */
/* const/16 v9, 0x1a */
(( v.Vmenu ) v3 ).addTouch ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addTouch(II)V
/* .line 2489 */
} // :cond_3
} // :goto_4
return;
/* .line 2283 */
} // .end local v0 # "f":Lv/Vfont;
} // .end local v1 # "fnt":Ljava/lang/String;
} // .end local v2 # "i":I
} // .end local v3 # "m":Lv/Vmenu;
} // .end local v4 # "mo":Lv/V3dModel;
} // .end local v6 # "p":Lv/Vsprite;
} // :cond_4
int v8 = 1; // const/4 v8, 0x1
v.Vmenu.m_mouse = (v8!= 0);
/* .line 2285 */
/* iget v8, p0, Lapp/Pool;->m_width:I */
/* const/16 v9, 0xb0 */
/* if-lt v8, v9, :cond_0 */
/* iget v8, p0, Lapp/Pool;->m_height:I */
/* const/16 v9, 0xb0 */
/* if-lt v8, v9, :cond_0 */
/* .line 2286 */
/* iget v8, p0, Lapp/Pool;->m_width:I */
/* const/16 v9, 0x126 */
/* if-lt v8, v9, :cond_5 */
/* iget v8, p0, Lapp/Pool;->m_height:I */
/* const/16 v9, 0x126 */
/* if-lt v8, v9, :cond_5 */
/* .line 2287 */
/* const/16 v5, 0x48 */
/* goto/16 :goto_0 */
/* .line 2289 */
} // :cond_5
/* const/16 v5, 0x30 */
/* goto/16 :goto_0 */
/* .line 2303 */
/* .restart local v0 # "f":Lv/Vfont; */
} // :cond_6
int v5 = 0; // const/4 v5, 0x0
/* .line 2304 */
final String v1 = "f10.bin"; // const-string v1, "f10.bin"
/* .restart local v1 # "fnt":Ljava/lang/String; */
/* goto/16 :goto_1 */
/* .line 2367 */
/* .restart local v2 # "i":I */
} // :cond_7
/* new-instance v6, Lapp/Ball; */
/* invoke-direct {v6}, Lapp/Ball;-><init>()V */
/* .line 2368 */
/* .local v6, "p":Lapp/Ball; */
(( app.Pool ) p0 ).shadowBall ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->shadowBall(Lv/Vsprite;)V
/* .line 2371 */
v8 = this.m_lib;
(( v.Vilib ) v8 ).loadPicture ( v2 ); // invoke-virtual {v8, v2}, Lv/Vilib;->loadPicture(I)Lv/Vpicture;
/* .line 2372 */
/* .local v7, "pic":Lv/Vpicture; */
v8 = this.m_rgb;
this.m_rgb = v8;
/* .line 2374 */
v8 = this.m_cueball;
v8 = this.m_3dmodel;
this.m_3dmodel = v8;
/* .line 2376 */
v8 = this.m_balls;
/* aput-object v6, v8, v2 */
/* .line 2378 */
v8 = this.m_physics;
(( v.Vphysics ) v8 ).add ( v6 ); // invoke-virtual {v8, v6}, Lv/Vphysics;->add(Lv/Vphob;)V
/* .line 2380 */
/* add-int/lit8 v8, v2, 0x1 */
(( app.Pool ) p0 ).prefBallRead ( v6, v8 ); // invoke-virtual {p0, v6, v8}, Lapp/Pool;->prefBallRead(Lapp/Ball;I)V
/* .line 2382 */
v8 = (( app.Ball ) v6 ).isLinked ( ); // invoke-virtual {v6}, Lapp/Ball;->isLinked()Z
if ( v8 != null) { // if-eqz v8, :cond_8
/* .line 2383 */
/* iput v2, p0, Lapp/Pool;->m_9ballNext:I */
/* .line 2366 */
} // :cond_8
/* add-int/lit8 v2, v2, -0x1 */
/* goto/16 :goto_2 */
/* .line 2392 */
} // .end local v6 # "p":Lapp/Ball;
} // .end local v7 # "pic":Lv/Vpicture;
} // :cond_9
/* iget-boolean v8, p0, Lapp/Pool;->m_player:Z */
/* if-nez v8, :cond_2 */
/* .line 2393 */
(( app.Pool ) p0 ).bestShot ( ); // invoke-virtual {p0}, Lapp/Pool;->bestShot()I
/* goto/16 :goto_3 */
/* .line 2470 */
/* .restart local v3 # "m":Lv/Vmenu; */
/* .restart local v4 # "mo":Lv/V3dModel; */
/* .local v6, "p":Lv/Vsprite; */
} // :cond_a
final String v8 = "0 Menu"; // const-string v8, "0 Menu"
(( v.Vmenu ) v3 ).add ( v8 ); // invoke-virtual {v3, v8}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2471 */
final String v8 = "2 Up"; // const-string v8, "2 Up"
/* const/16 v9, 0x14 */
(( v.Vmenu ) v3 ).addIcon ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addIcon(Ljava/lang/String;I)Lv/Vtext;
/* .line 2472 */
final String v8 = "8 Down"; // const-string v8, "8 Down"
/* const/16 v9, 0x15 */
(( v.Vmenu ) v3 ).addIcon ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addIcon(Ljava/lang/String;I)Lv/Vtext;
/* .line 2473 */
final String v8 = "4 Left"; // const-string v8, "4 Left"
/* const/16 v9, 0x13 */
(( v.Vmenu ) v3 ).addIcon ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addIcon(Ljava/lang/String;I)Lv/Vtext;
/* .line 2474 */
final String v8 = "5 Shoot"; // const-string v8, "5 Shoot"
(( v.Vmenu ) v3 ).add ( v8 ); // invoke-virtual {v3, v8}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2475 */
final String v8 = "6 Right"; // const-string v8, "6 Right"
/* const/16 v9, 0x12 */
(( v.Vmenu ) v3 ).addIcon ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Lv/Vmenu;->addIcon(Ljava/lang/String;I)Lv/Vtext;
/* .line 2476 */
final String v8 = "1 In"; // const-string v8, "1 In"
(( v.Vmenu ) v3 ).add ( v8 ); // invoke-virtual {v3, v8}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2477 */
final String v8 = "7 Out"; // const-string v8, "7 Out"
(( v.Vmenu ) v3 ).add ( v8 ); // invoke-virtual {v3, v8}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2479 */
/* sget-boolean v8, Lv/Vmenu;->m_mouse:Z */
/* if-nez v8, :cond_b */
/* .line 2480 */
final String v8 = "3 Raise"; // const-string v8, "3 Raise"
(( v.Vmenu ) v3 ).add ( v8 ); // invoke-virtual {v3, v8}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2481 */
final String v8 = "9 Lower"; // const-string v8, "9 Lower"
(( v.Vmenu ) v3 ).add ( v8 ); // invoke-virtual {v3, v8}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2486 */
} // :cond_b
/* sget-boolean v8, Lv/Vmenu;->m_mouse:Z */
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 2487 */
(( app.Pool ) p0 ).mend ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->mend(Lv/Vmenu;)V
/* goto/16 :goto_4 */
} // .end method
Boolean keyAny ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 2493 */
v0 = (( app.Pool ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lapp/Pool;->keyGet()C
/* .line 2495 */
/* .local v0, "ch":C */
/* if-nez v0, :cond_0 */
/* move v1, v2 */
/* .line 2505 */
} // :goto_0
/* .line 2499 */
} // :cond_0
int v1 = 5; // const/4 v1, 0x5
/* if-ge v0, v1, :cond_1 */
/* move v1, v2 */
/* .line 2500 */
/* .line 2502 */
} // :cond_1
/* iget v1, p0, Lapp/Pool;->m_mousex:I */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 2503 */
(( app.Pool ) p0 ).click ( ); // invoke-virtual {p0}, Lapp/Pool;->click()V
/* .line 2505 */
} // :cond_2
int v1 = 1; // const/4 v1, 0x1
} // .end method
void lookAt ( ) {
/* .locals 3 */
/* .prologue */
/* .line 2509 */
/* iget-boolean v0, p0, Lapp/Pool;->m_breakView:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2510 */
int v0 = 0; // const/4 v0, 0x0
(( app.Pool ) p0 ).breakSwap ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->breakSwap(Z)V
/* .line 2523 */
} // :cond_0
v0 = this.m_cueball;
/* iget v0, v0, Lapp/Ball;->m_wx:I */
v1 = this.m_cueball;
/* iget v1, v1, Lapp/Ball;->m_wy:I */
v2 = this.m_cueball;
/* iget v2, v2, Lapp/Ball;->m_wz:I */
(( app.Pool ) p0 ).lookAt ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lapp/Pool;->lookAt(III)V
/* .line 2524 */
return;
} // .end method
void lookAt ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "z" # I */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 2538 */
(( app.Pool ) p0 ).setCameraMatrix ( ); // invoke-virtual {p0}, Lapp/Pool;->setCameraMatrix()V
/* .line 2539 */
v0 = this.m_tv;
/* .line 2541 */
/* .local v0, "v":Lv/Vector; */
/* iget v1, p0, Lapp/Pool;->m_camdist:I */
(( v.Vector ) v0 ).set ( v2, v2, v1 ); // invoke-virtual {v0, v2, v2, v1}, Lv/Vector;->set(III)V
/* .line 2542 */
(( app.Pool ) p0 ).rotate ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->rotate(Lv/Vector;)V
/* .line 2544 */
/* iget v1, v0, Lv/Vector;->m_x:I */
/* add-int/2addr v1, p1 */
/* iput v1, p0, Lapp/Pool;->m_wx:I */
/* .line 2545 */
/* iget v1, v0, Lv/Vector;->m_y:I */
/* add-int/2addr v1, p2 */
/* iput v1, p0, Lapp/Pool;->m_wy:I */
/* .line 2546 */
/* iget v1, v0, Lv/Vector;->m_z:I */
/* sub-int v1, p3, v1 */
/* iput v1, p0, Lapp/Pool;->m_wz:I */
/* .line 2547 */
return;
} // .end method
void lookAt0 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 2527 */
/* const/16 v0, 0x71c */
/* iput v0, p0, Lapp/Pool;->m_pitch:I */
/* .line 2532 */
/* const/high16 v0, 0x240000 */
/* iput v0, p0, Lapp/Pool;->m_camdist:I */
/* .line 2533 */
(( app.Pool ) p0 ).lookAt ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt()V
/* .line 2534 */
return;
} // .end method
void mend ( v.Vmenu p0 ) {
/* .locals 20 */
/* .param p1, "m" # Lv/Vmenu; */
/* .prologue */
/* .line 2551 */
/* sget-boolean v17, Lv/Vmenu;->m_mouse:Z */
/* if-nez v17, :cond_1 */
/* .line 2652 */
} // :cond_0
return;
/* .line 2554 */
} // :cond_1
/* invoke-virtual/range {p1 ..p1}, Lv/Vmenu;->getSelected()Lv/Vsprite; */
/* .line 2555 */
/* .local v12, "selected":Lv/Vsprite; */
/* move-object/from16 v0, p1 */
v0 = this.m_child;
/* move-object v8, v0 */
/* .line 2556 */
/* .local v8, "p":Lv/Vsprite; */
/* const/16 v17, 0x0 */
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, p1 */
this.m_child = v0;
/* .line 2557 */
/* const/16 v17, 0x0 */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p1 */
/* iput v0, v1, Lv/Vmenu;->m_color:I */
/* .line 2560 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmenu;->m_width:I */
/* move v14, v0 */
/* .line 2561 */
/* .local v14, "w":I */
/* const/16 v9, 0x1b */
/* .line 2562 */
/* .local v9, "pic":I */
/* const/16 v17, 0x3c */
/* move v0, v14 */
/* move/from16 v1, v17 */
/* if-le v0, v1, :cond_2 */
/* .line 2563 */
/* const/16 v9, 0x1c */
/* .line 2566 */
} // :cond_2
/* const v13, 0xfc00 */
/* .line 2579 */
/* .local v13, "vscale":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_height:I */
/* move v4, v0 */
/* .line 2582 */
/* .local v4, "h":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_width:I */
/* move/from16 v17, v0 */
/* const/16 v18, 0x14 */
/* sub-int v17, v17, v18 */
/* move v0, v4 */
/* move/from16 v1, v17 */
/* if-le v0, v1, :cond_3 */
/* .line 2583 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_width:I */
/* move/from16 v17, v0 */
/* const/16 v18, 0x14 */
/* sub-int v4, v17, v18 */
/* .line 2585 */
} // :cond_3
/* shl-int/lit8 v17, v4, 0xf */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmenu;->m_height:I */
/* move/from16 v18, v0 */
/* div-int v13, v17, v18 */
/* .line 2586 */
/* const v17, 0x18000 */
/* move v0, v13 */
/* move/from16 v1, v17 */
/* if-le v0, v1, :cond_4 */
/* .line 2587 */
/* const v13, 0x18000 */
/* .line 2591 */
} // :cond_4
} // :goto_0
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 2593 */
/* new-instance v11, Lv/Vsprite; */
/* invoke-direct {v11}, Lv/Vsprite;-><init>()V */
/* .line 2594 */
/* .local v11, "root":Lv/Vsprite; */
/* move-object v0, v8 */
/* iget v0, v0, Lv/Vsprite;->m_id:I */
/* move/from16 v17, v0 */
/* move/from16 v0, v17 */
/* move-object v1, v11 */
/* iput v0, v1, Lv/Vsprite;->m_id:I */
/* .line 2598 */
/* move-object/from16 v0, p1 */
/* move-object v1, v11 */
(( v.Vmenu ) v0 ).addTail ( v1 ); // invoke-virtual {v0, v1}, Lv/Vmenu;->addTail(Lv/Vsprite;)V
/* .line 2600 */
/* if-ne v8, v12, :cond_5 */
/* .line 2601 */
int v12 = 0; // const/4 v12, 0x0
/* .line 2602 */
/* move-object v0, v11 */
/* move-object/from16 v1, p1 */
this.m_selected = v0;
/* .line 2605 */
} // :cond_5
/* new-instance v10, Lv/Vsprite; */
/* invoke-direct {v10}, Lv/Vsprite;-><init>()V */
/* .line 2606 */
/* .local v10, "q":Lv/Vsprite; */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object/from16 v17, v0 */
/* move-object v0, v10 */
/* move-object/from16 v1, v17 */
/* move v2, v9 */
(( v.Vsprite ) v0 ).setImage ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 2609 */
/* iget v14, v10, Lv/Vsprite;->m_width:I */
/* .line 2610 */
/* move-object v0, v10 */
/* iget v0, v0, Lv/Vsprite;->m_width:I */
/* move/from16 v17, v0 */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p1 */
/* iput v0, v1, Lv/Vmenu;->m_width:I */
/* .line 2612 */
/* iput v14, v11, Lv/Vsprite;->m_width:I */
/* .line 2613 */
/* move-object v0, v10 */
/* iget v0, v0, Lv/Vsprite;->m_height:I */
/* move/from16 v17, v0 */
/* move/from16 v0, v17 */
/* move-object v1, v11 */
/* iput v0, v1, Lv/Vsprite;->m_height:I */
/* .line 2615 */
/* move-object v0, v8 */
/* iget v0, v0, Lv/Vsprite;->m_sy:I */
/* move/from16 v17, v0 */
/* move v0, v13 */
/* move/from16 v1, v17 */
v15 = app.Pool .fmul ( v0,v1 );
/* .line 2617 */
/* .local v15, "y":I */
/* shr-int/lit8 v15, v15, 0xf */
/* .line 2619 */
/* const/16 v17, 0x0 */
/* move-object v0, v11 */
/* move/from16 v1, v17 */
/* move v2, v15 */
(( v.Vsprite ) v0 ).setXyi ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setXyi(II)V
/* .line 2621 */
/* move-object v0, v10 */
/* iget v0, v0, Lv/Vsprite;->m_height:I */
/* move/from16 v17, v0 */
/* add-int v15, v15, v17 */
/* .line 2622 */
/* move v0, v15 */
/* move-object/from16 v1, p1 */
/* iput v0, v1, Lv/Vmenu;->m_height:I */
/* .line 2624 */
v7 = this.m_sibling;
/* .line 2626 */
/* .local v7, "next":Lv/Vsprite; */
/* iget v6, v8, Lv/Vsprite;->m_libi:I */
/* .line 2627 */
/* .local v6, "img":I */
/* const/16 v16, 0x0 */
/* .line 2628 */
/* .local v16, "yadjust":I */
/* const/16 v17, -0x1 */
/* move v0, v6 */
/* move/from16 v1, v17 */
/* if-eq v0, v1, :cond_6 */
/* .line 2630 */
/* iget v3, v8, Lv/Vsprite;->m_alpha:I */
/* .line 2631 */
/* .local v3, "alpha":I */
/* const/16 v17, 0x0 */
/* move-object/from16 v0, v17 */
/* move-object v1, v8 */
this.m_parent = v0;
/* .line 2632 */
/* iget v5, v8, Lv/Vsprite;->m_id:I */
/* .line 2633 */
/* .local v5, "id":I */
/* new-instance v8, Lv/Vsprite; */
} // .end local v8 # "p":Lv/Vsprite;
/* invoke-direct {v8}, Lv/Vsprite;-><init>()V */
/* .line 2634 */
/* .restart local v8 # "p":Lv/Vsprite; */
/* iput v5, v8, Lv/Vsprite;->m_id:I */
/* .line 2635 */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object/from16 v17, v0 */
/* move-object v0, v8 */
/* move-object/from16 v1, v17 */
/* move v2, v6 */
(( v.Vsprite ) v0 ).setImage ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 2636 */
/* iput v3, v8, Lv/Vsprite;->m_alpha:I */
/* .line 2642 */
} // .end local v3 # "alpha":I
} // .end local v5 # "id":I
} // :goto_1
/* move-object v0, v8 */
/* iget v0, v0, Lv/Vsprite;->m_width:I */
/* move/from16 v17, v0 */
/* sub-int v17, v14, v17 */
/* shr-int/lit8 v17, v17, 0x1 */
/* move-object v0, v10 */
/* iget v0, v0, Lv/Vsprite;->m_height:I */
/* move/from16 v18, v0 */
/* move-object v0, v8 */
/* iget v0, v0, Lv/Vsprite;->m_height:I */
/* move/from16 v19, v0 */
/* sub-int v18, v18, v19 */
/* add-int/lit8 v18, v18, 0x1 */
/* shr-int/lit8 v18, v18, 0x1 */
/* add-int v18, v18, v16 */
/* move-object v0, v8 */
/* move/from16 v1, v17 */
/* move/from16 v2, v18 */
(( v.Vsprite ) v0 ).setXyi ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vsprite;->setXyi(II)V
/* .line 2643 */
/* const/16 v17, 0x1 */
/* move-object v0, v10 */
/* move/from16 v1, v17 */
(( v.Vsprite ) v0 ).setZ ( v1 ); // invoke-virtual {v0, v1}, Lv/Vsprite;->setZ(I)V
/* .line 2645 */
(( v.Vsprite ) v11 ).add ( v10 ); // invoke-virtual {v11, v10}, Lv/Vsprite;->add(Lv/Vsprite;)V
/* .line 2646 */
/* const/16 v17, 0x0 */
/* move-object/from16 v0, v17 */
/* move-object v1, v8 */
this.m_parent = v0;
/* .line 2648 */
(( v.Vsprite ) v11 ).add ( v8 ); // invoke-virtual {v11, v8}, Lv/Vsprite;->add(Lv/Vsprite;)V
/* .line 2650 */
/* move-object v8, v7 */
/* goto/16 :goto_0 */
/* .line 2640 */
} // :cond_6
/* const/16 v16, -0x1 */
} // .end method
Object menuGame ( Object p0 ) {
/* .locals 3 */
/* .param p1, "key0" # C */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 2656 */
v1 = this.m_menu;
v0 = (( app.Pool ) p0 ).menuKey ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lapp/Pool;->menuKey(Lv/Vmenu;C)C
/* .line 2658 */
/* .local v0, "key":C */
/* sparse-switch v0, :sswitch_data_0 */
/* move v1, v0 */
/* .line 2684 */
} // :goto_0
/* .line 2663 */
/* :sswitch_0 */
/* const/16 v1, 0x8 */
/* if-ne v0, v1, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :goto_1
(( app.Pool ) p0 ).menuMain ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lapp/Pool;->menuMain(ZZ)V
/* .line 2664 */
/* iput-boolean v2, p0, Lapp/Pool;->m_menuShow:Z */
/* .line 2665 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* move v1, v2 */
/* .line 2666 */
} // :cond_0
/* move v1, v2 */
/* .line 2663 */
/* :sswitch_1 */
/* move v1, p1 */
/* .line 2672 */
/* .line 2675 */
/* :sswitch_2 */
/* iput-boolean v2, p0, Lapp/Pool;->m_menuShow:Z */
/* .line 2676 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* move v1, v2 */
/* .line 2677 */
/* :sswitch_3 */
/* move v1, v2 */
/* .line 2681 */
/* .line 2658 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x3 -> :sswitch_3 */
/* 0x4 -> :sswitch_3 */
/* 0x6 -> :sswitch_0 */
/* 0x8 -> :sswitch_0 */
/* 0xa -> :sswitch_1 */
/* 0x20 -> :sswitch_1 */
/* 0x30 -> :sswitch_0 */
/* 0x35 -> :sswitch_1 */
/* 0x68 -> :sswitch_2 */
} // .end sparse-switch
} // .end method
Object menuKey ( v.Vmenu p0, Object p1 ) {
/* .locals 8 */
/* .param p1, "m" # Lv/Vmenu; */
/* .param p2, "key0" # C */
/* .prologue */
/* const/16 v7, 0x20 */
int v6 = 5; // const/4 v6, 0x5
int v5 = 0; // const/4 v5, 0x0
/* .line 2743 */
/* iget v3, p0, Lapp/Pool;->m_mousex:I */
/* iget v4, p0, Lapp/Pool;->m_mousey:I */
v0 = (( v.Vmenu ) p1 ).key ( p2, v3, v4 ); // invoke-virtual {p1, p2, v3, v4}, Lv/Vmenu;->key(CII)C
/* .line 2745 */
/* .local v0, "key":C */
/* if-ne p2, v6, :cond_4 */
/* iget v3, p0, Lapp/Pool;->m_mousex:I */
if ( v3 != null) { // if-eqz v3, :cond_4
/* iget v3, p1, Lv/Vmenu;->m_color:I */
/* if-nez v3, :cond_4 */
/* iget v3, p1, Lv/Vmenu;->m_square:I */
/* if-nez v3, :cond_4 */
/* .line 2747 */
/* iget v1, p0, Lapp/Pool;->m_mousex:I */
/* .line 2748 */
/* .local v1, "mx":I */
/* iget v2, p0, Lapp/Pool;->m_mousey:I */
/* .line 2749 */
/* .local v2, "my":I */
} // :goto_0
v3 = (( app.Pool ) p0 ).keyDown ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->keyDown(C)Z
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = (( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 2756 */
} // :cond_0
v0 = (( v.Vmenu ) p1 ).key ( v6, v1, v2 ); // invoke-virtual {p1, v6, v1, v2}, Lv/Vmenu;->key(CII)C
/* .line 2758 */
/* if-lt v0, v7, :cond_1 */
/* .line 2759 */
(( app.Pool ) p0 ).click ( ); // invoke-virtual {p0}, Lapp/Pool;->click()V
/* .line 2761 */
} // :cond_1
/* iput v5, p0, Lapp/Pool;->m_mousex:I */
/* .line 2762 */
/* iput v5, p0, Lapp/Pool;->m_mousey:I */
/* .line 2763 */
/* iput v5, p0, Lapp/Pool;->m_dragx:I */
/* .line 2764 */
/* iput v5, p0, Lapp/Pool;->m_dragy:I */
/* .line 2791 */
} // .end local v1 # "mx":I
} // .end local v2 # "my":I
} // :cond_2
} // :goto_1
/* .line 2750 */
/* .restart local v1 # "mx":I */
/* .restart local v2 # "my":I */
} // :cond_3
/* iget v1, p0, Lapp/Pool;->m_mousex:I */
/* .line 2751 */
/* iget v2, p0, Lapp/Pool;->m_mousey:I */
/* .line 2752 */
(( v.Vmenu ) p1 ).fade ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lv/Vmenu;->fade(II)V
/* .line 2753 */
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* .line 2768 */
} // .end local v1 # "mx":I
} // .end local v2 # "my":I
} // :cond_4
/* if-lt v0, v7, :cond_2 */
/* .line 2769 */
/* iget v3, p0, Lapp/Pool;->m_mousex:I */
/* if-nez v3, :cond_5 */
/* iget v3, p0, Lapp/Pool;->m_mousey:I */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 2770 */
} // :cond_5
v3 = (( app.Pool ) p0 ).keyWaiting ( ); // invoke-virtual {p0}, Lapp/Pool;->keyWaiting()Z
/* if-nez v3, :cond_2 */
/* .line 2772 */
/* iput v5, p0, Lapp/Pool;->m_mousex:I */
/* .line 2773 */
/* iput v5, p0, Lapp/Pool;->m_mousey:I */
/* .line 2774 */
/* iput v5, p0, Lapp/Pool;->m_dragx:I */
/* .line 2775 */
/* iput v5, p0, Lapp/Pool;->m_dragy:I */
/* .line 2778 */
/* if-ne p2, v6, :cond_6 */
/* .line 2779 */
(( app.Pool ) p0 ).click ( ); // invoke-virtual {p0}, Lapp/Pool;->click()V
/* .line 2781 */
} // :cond_6
(( app.Pool ) p0 ).render ( ); // invoke-virtual {p0}, Lapp/Pool;->render()V
} // .end method
void menuMain ( Boolean p0, Boolean p1 ) {
/* .locals 11 */
/* .param p1, "back" # Z */
/* .param p2, "bundo" # Z */
/* .prologue */
/* const/16 v6, 0x45 */
int v10 = 0; // const/4 v10, 0x0
int v9 = 1; // const/4 v9, 0x1
final String v8 = "Sound: On"; // const-string v8, "Sound: On"
final String v7 = "Sound: Off"; // const-string v7, "Sound: Off"
/* .line 2799 */
v5 = (( app.Pool ) p0 ).eval ( ); // invoke-virtual {p0}, Lapp/Pool;->eval()Z
if ( v5 != null) { // if-eqz v5, :cond_6
/* move v0, v9 */
/* .line 2801 */
/* .local v0, "bunlock":Z */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2802 */
int p2 = 0; // const/4 p2, 0x0
/* .line 2804 */
} // :cond_0
v5 = this.m_menu;
(( v.Vmenu ) v5 ).off ( ); // invoke-virtual {v5}, Lv/Vmenu;->off()V
/* .line 2806 */
/* new-instance v2, Lv/Vmenu; */
/* invoke-direct {v2}, Lv/Vmenu;-><init>()V */
/* .line 2807 */
/* .local v2, "m":Lv/Vmenu; */
final String v5 = "New Game"; // const-string v5, "New Game"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2808 */
/* const/16 v5, 0x4e */
(( v.Vmenu ) v2 ).select ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->select(I)V
/* .line 2810 */
v5 = (( app.Pool ) p0 ).gameOver ( ); // invoke-virtual {p0}, Lapp/Pool;->gameOver()Z
/* if-nez v5, :cond_1 */
/* .line 2811 */
final String v5 = "Resume"; // const-string v5, "Resume"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2812 */
/* const/16 v5, 0x52 */
(( v.Vmenu ) v2 ).select ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->select(I)V
/* .line 2815 */
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 2816 */
final String v5 = "Undo Shot"; // const-string v5, "Undo Shot"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2818 */
} // :cond_2
/* iget-boolean v5, p0, Lapp/Pool;->m_soundOff:Z */
if ( v5 != null) { // if-eqz v5, :cond_7
/* .line 2819 */
final String v5 = "Sound: Off"; // const-string v5, "Sound: Off"
(( v.Vmenu ) v2 ).add ( v7 ); // invoke-virtual {v2, v7}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2823 */
} // :goto_1
final String v5 = "Help"; // const-string v5, "Help"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2824 */
final String v5 = "About"; // const-string v5, "About"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2826 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 2827 */
final String v5 = "Unlock"; // const-string v5, "Unlock"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2835 */
} // :cond_3
final String v5 = "Exit"; // const-string v5, "Exit"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2837 */
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 2838 */
(( v.Vmenu ) v2 ).select ( v6 ); // invoke-virtual {v2, v6}, Lv/Vmenu;->select(I)V
/* .line 2840 */
} // :cond_4
(( app.Pool ) p0 ).mend ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->mend(Lv/Vmenu;)V
/* .line 2842 */
(( app.Pool ) p0 ).addCenter ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 2846 */
} // :goto_2
v5 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
/* if-nez v5, :cond_8 */
/* .line 3009 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 3010 */
(( v.Vmenu ) v2 ).removeAllStar ( ); // invoke-virtual {v2}, Lv/Vmenu;->removeAllStar()V
/* .line 3011 */
} // :cond_5
} // :goto_3
return;
} // .end local v0 # "bunlock":Z
} // .end local v2 # "m":Lv/Vmenu;
} // :cond_6
/* move v0, v10 */
/* .line 2799 */
/* .line 2821 */
/* .restart local v0 # "bunlock":Z */
/* .restart local v2 # "m":Lv/Vmenu; */
} // :cond_7
final String v5 = "Sound: On"; // const-string v5, "Sound: On"
(( v.Vmenu ) v2 ).add ( v8 ); // invoke-virtual {v2, v8}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 2847 */
} // :cond_8
v5 = (( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
if ( v5 != null) { // if-eqz v5, :cond_9
/* .line 2848 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 2849 */
(( app.Pool ) p0 ).addCenter ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 2852 */
} // :cond_9
v5 = (( app.Pool ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lapp/Pool;->keyGet()C
v1 = (( app.Pool ) p0 ).menuKey ( v2, v5 ); // invoke-virtual {p0, v2, v5}, Lapp/Pool;->menuKey(Lv/Vmenu;C)C
/* .line 2854 */
/* .local v1, "key":C */
/* sparse-switch v1, :sswitch_data_0 */
/* .line 3006 */
} // :goto_4
/* :sswitch_0 */
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* .line 2857 */
/* :sswitch_1 */
/* new-instance v3, Lv/Vsprite; */
/* invoke-direct {v3}, Lv/Vsprite;-><init>()V */
/* .line 2858 */
/* .local v3, "p":Lv/Vsprite; */
int v5 = -2; // const/4 v5, -0x2
(( v.Vsprite ) v3 ).setZ ( v5 ); // invoke-virtual {v3, v5}, Lv/Vsprite;->setZ(I)V
/* .line 2859 */
/* const v5, -0x7fbfbf80 # -5.90061E-39f */
(( v.Vsprite ) v3 ).setColor ( v5 ); // invoke-virtual {v3, v5}, Lv/Vsprite;->setColor(I)V
/* .line 2877 */
final String v5 = "Vegas Pool Sharks 1.10"; // const-string v5, "Vegas Pool Sharks 1.10"
(( v.Vsprite ) v3 ).addCenterBs ( v5 ); // invoke-virtual {v3, v5}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 2880 */
final String v5 = "Copyright 2009"; // const-string v5, "Copyright 2009"
(( v.Vsprite ) v3 ).addCenterBs ( v5 ); // invoke-virtual {v3, v5}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 2884 */
final String v5 = "RESETgame"; // const-string v5, "RESETgame"
(( v.Vsprite ) v3 ).addCenterBs ( v5 ); // invoke-virtual {v3, v5}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 2885 */
final String v5 = "All rights reserved"; // const-string v5, "All rights reserved"
(( v.Vsprite ) v3 ).addCenterBs ( v5 ); // invoke-virtual {v3, v5}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 2892 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 2893 */
(( app.Pool ) p0 ).addCenter ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 2902 */
} // :goto_5
v5 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
if ( v5 != null) { // if-eqz v5, :cond_a
v5 = (( app.Pool ) p0 ).keyAny ( ); // invoke-virtual {p0}, Lapp/Pool;->keyAny()Z
/* if-nez v5, :cond_a */
v5 = (( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
if ( v5 != null) { // if-eqz v5, :cond_b
/* .line 2906 */
} // :cond_a
(( v.Vsprite ) v3 ).off ( ); // invoke-virtual {v3}, Lv/Vsprite;->off()V
/* .line 2907 */
(( v.Vsprite ) v3 ).removeAll ( ); // invoke-virtual {v3}, Lv/Vsprite;->removeAll()V
/* .line 2908 */
(( app.Pool ) p0 ).addCenter ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 2903 */
} // :cond_b
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* .line 2918 */
} // .end local v3 # "p":Lv/Vsprite;
/* :sswitch_2 */
/* if-nez p1, :cond_c */
/* .line 2919 */
int p1 = 1; // const/4 p1, 0x1
/* .line 2920 */
(( v.Vmenu ) v2 ).select ( v6 ); // invoke-virtual {v2, v6}, Lv/Vmenu;->select(I)V
/* .line 2926 */
} // :cond_c
/* :sswitch_3 */
/* iput-boolean v9, p0, Lapp/Pool;->m_reset:Z */
/* .line 2927 */
/* iput-boolean v9, p0, Lapp/Pool;->m_stop:Z */
/* .line 2931 */
/* :sswitch_4 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 2932 */
(( app.Pool ) p0 ).help ( ); // invoke-virtual {p0}, Lapp/Pool;->help()V
/* .line 2933 */
(( app.Pool ) p0 ).addCenter ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 2937 */
/* :sswitch_5 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 2939 */
/* iput-boolean v9, p0, Lapp/Pool;->m_started:Z */
/* .line 2940 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 2941 */
v5 = (( app.Pool ) p0 ).menuSettings ( ); // invoke-virtual {p0}, Lapp/Pool;->menuSettings()Z
if ( v5 != null) { // if-eqz v5, :cond_d
/* .line 2942 */
(( v.Vmenu ) v2 ).removeAllStar ( ); // invoke-virtual {v2}, Lv/Vmenu;->removeAllStar()V
/* goto/16 :goto_3 */
/* .line 2945 */
} // :cond_d
(( app.Pool ) p0 ).addCenter ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 2955 */
/* :sswitch_6 */
/* iput-boolean v9, p0, Lapp/Pool;->m_started:Z */
/* .line 2956 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 2957 */
(( v.Vmenu ) v2 ).removeAllStar ( ); // invoke-virtual {v2}, Lv/Vmenu;->removeAllStar()V
/* .line 2959 */
/* iput-boolean v10, p0, Lapp/Pool;->m_menuShow:Z */
/* .line 2960 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* goto/16 :goto_3 */
/* .line 2965 */
/* :sswitch_7 */
/* iget-boolean v5, p0, Lapp/Pool;->m_soundOff:Z */
if ( v5 != null) { // if-eqz v5, :cond_e
/* move v5, v10 */
} // :goto_6
/* iput-boolean v5, p0, Lapp/Pool;->m_soundOff:Z */
/* .line 2966 */
(( v.Vmenu ) v2 ).getSelectedText ( ); // invoke-virtual {v2}, Lv/Vmenu;->getSelectedText()Lv/Vtext;
/* .line 2967 */
/* .local v4, "ps":Lv/Vtext; */
/* iget-boolean v5, p0, Lapp/Pool;->m_soundOff:Z */
if ( v5 != null) { // if-eqz v5, :cond_f
/* .line 2968 */
final String v5 = "Sound: Off"; // const-string v5, "Sound: Off"
(( v.Vtext ) v4 ).setText ( v7 ); // invoke-virtual {v4, v7}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 2971 */
} // :goto_7
(( app.Pool ) p0 ).prefSave ( ); // invoke-virtual {p0}, Lapp/Pool;->prefSave()V
/* goto/16 :goto_4 */
} // .end local v4 # "ps":Lv/Vtext;
} // :cond_e
/* move v5, v9 */
/* .line 2965 */
/* .line 2970 */
/* .restart local v4 # "ps":Lv/Vtext; */
} // :cond_f
final String v5 = "Sound: On"; // const-string v5, "Sound: On"
(( v.Vtext ) v4 ).setText ( v8 ); // invoke-virtual {v4, v8}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 2975 */
} // .end local v4 # "ps":Lv/Vtext;
/* :sswitch_8 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 2976 */
(( v.Vmenu ) v2 ).removeAllStar ( ); // invoke-virtual {v2}, Lv/Vmenu;->removeAllStar()V
/* .line 2978 */
if ( p2 != null) { // if-eqz p2, :cond_12
/* .line 2979 */
(( app.Pool ) p0 ).prefBallRestore ( ); // invoke-virtual {p0}, Lapp/Pool;->prefBallRestore()V
/* .line 2981 */
v5 = this.m_cue;
v5 = (( v.Vsprite ) v5 ).isLinked ( ); // invoke-virtual {v5}, Lv/Vsprite;->isLinked()Z
/* if-nez v5, :cond_10 */
/* .line 2982 */
v5 = this.m_cue;
(( app.Pool ) p0 ).add ( v5 ); // invoke-virtual {p0, v5}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 2983 */
} // :cond_10
v5 = this.m_cue;
v6 = this.m_cueball;
v6 = (( app.Ball ) v6 ).getWx ( ); // invoke-virtual {v6}, Lapp/Ball;->getWx()I
/* const v7, 0xb000 */
v8 = this.m_cueball;
v8 = (( app.Ball ) v8 ).getWz ( ); // invoke-virtual {v8}, Lapp/Ball;->getWz()I
(( v.Vsprite ) v5 ).setWxyz ( v6, v7, v8 ); // invoke-virtual {v5, v6, v7, v8}, Lv/Vsprite;->setWxyz(III)V
/* .line 2985 */
v5 = this.m_prompt;
(( v.Vtext ) v5 ).off ( ); // invoke-virtual {v5}, Lv/Vtext;->off()V
/* .line 2987 */
/* iget-boolean v5, p0, Lapp/Pool;->m_playBreak:Z */
/* if-nez v5, :cond_11 */
/* .line 2989 */
/* iget v5, p0, Lapp/Pool;->m_cueAngle:I */
/* iput v5, p0, Lapp/Pool;->m_heading:I */
/* .line 2990 */
(( app.Pool ) p0 ).lookAt0 ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt0()V
/* .line 2994 */
} // :cond_11
/* iput-boolean v9, p0, Lapp/Pool;->m_reset:Z */
/* .line 2997 */
/* iput-boolean v9, p0, Lapp/Pool;->m_started:Z */
/* .line 2998 */
/* iput-boolean v10, p0, Lapp/Pool;->m_menuShow:Z */
/* .line 2999 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* goto/16 :goto_3 */
/* .line 3001 */
} // :cond_12
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 3002 */
(( app.Pool ) p0 ).unlock ( ); // invoke-virtual {p0}, Lapp/Pool;->unlock()V
/* goto/16 :goto_3 */
/* .line 2854 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x6 -> :sswitch_6 */
/* 0x8 -> :sswitch_2 */
/* 0x30 -> :sswitch_6 */
/* 0x41 -> :sswitch_1 */
/* 0x42 -> :sswitch_0 */
/* 0x45 -> :sswitch_3 */
/* 0x48 -> :sswitch_4 */
/* 0x4e -> :sswitch_5 */
/* 0x52 -> :sswitch_6 */
/* 0x53 -> :sswitch_7 */
/* 0x55 -> :sswitch_8 */
} // .end sparse-switch
} // .end method
void menuOff ( ) {
/* .locals 1 */
/* .prologue */
/* .line 3014 */
v0 = this.m_menu;
/* iget v0, v0, Lv/Vmenu;->m_square:I */
/* if-nez v0, :cond_1 */
/* .line 3015 */
v0 = this.m_menu;
(( v.Vmenu ) v0 ).off ( ); // invoke-virtual {v0}, Lv/Vmenu;->off()V
/* .line 3021 */
} // :cond_0
} // :goto_0
return;
/* .line 3016 */
} // :cond_1
/* iget-boolean v0, p0, Lapp/Pool;->m_menuShow:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3017 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lapp/Pool;->m_menuShow:Z */
/* .line 3018 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* .line 3019 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lapp/Pool;->m_menuShow:Z */
} // .end method
void menuOpponent ( ) {
/* .locals 12 */
/* .prologue */
/* const/16 v9, 0x20 */
int v8 = 1; // const/4 v8, 0x1
int v7 = 0; // const/4 v7, 0x0
final String v11 = "Visible: On"; // const-string v11, "Visible: On"
final String v10 = "Visible: Off"; // const-string v10, "Visible: Off"
/* .line 3026 */
/* new-instance v3, Lv/Vmenu; */
/* invoke-direct {v3}, Lv/Vmenu;-><init>()V */
/* .line 3035 */
/* .local v3, "m":Lv/Vmenu; */
final String v6 = "Shana\t$100"; // const-string v6, "Shana\t$100"
(( v.Vmenu ) v3 ).add ( v6 ); // invoke-virtual {v3, v6}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3036 */
final String v6 = "Shawn\t$500"; // const-string v6, "Shawn\t$500"
(( v.Vmenu ) v3 ).add ( v6 ); // invoke-virtual {v3, v6}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3037 */
final String v6 = "Sharon\t$1,000"; // const-string v6, "Sharon\t$1,000"
(( v.Vmenu ) v3 ).add ( v6 ); // invoke-virtual {v3, v6}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3038 */
final String v6 = "Shemp\t$5,000 "; // const-string v6, "Shemp\t$5,000 "
(( v.Vmenu ) v3 ).add ( v6 ); // invoke-virtual {v3, v6}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3040 */
/* iget v6, p0, Lapp/Pool;->m_opicbase:I */
if ( v6 != null) { // if-eqz v6, :cond_1
/* move v5, v8 */
/* .line 3041 */
/* .local v5, "visible":Z */
} // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 3042 */
final String v6 = "Visible: On"; // const-string v6, "Visible: On"
(( v.Vmenu ) v3 ).add ( v11 ); // invoke-virtual {v3, v11}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3046 */
} // :goto_1
/* iget v6, p0, Lapp/Pool;->m_level:I */
(( v.Vmenu ) v3 ).selectOrdinal ( v6 ); // invoke-virtual {v3, v6}, Lv/Vmenu;->selectOrdinal(I)V
/* .line 3048 */
(( app.Pool ) p0 ).mend ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->mend(Lv/Vmenu;)V
/* .line 3050 */
(( app.Pool ) p0 ).addCenter ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 3052 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3054 */
/* .local v0, "exit":Z */
} // :goto_2
/* if-nez v0, :cond_0 */
v6 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
/* if-nez v6, :cond_3 */
/* .line 3101 */
} // :cond_0
(( v.Vmenu ) v3 ).off ( ); // invoke-virtual {v3}, Lv/Vmenu;->off()V
/* .line 3102 */
(( v.Vmenu ) v3 ).removeAllStar ( ); // invoke-virtual {v3}, Lv/Vmenu;->removeAllStar()V
/* .line 3103 */
return;
} // .end local v0 # "exit":Z
} // .end local v5 # "visible":Z
} // :cond_1
/* move v5, v7 */
/* .line 3040 */
/* .line 3044 */
/* .restart local v5 # "visible":Z */
} // :cond_2
final String v6 = "Visible: Off"; // const-string v6, "Visible: Off"
(( v.Vmenu ) v3 ).add ( v10 ); // invoke-virtual {v3, v10}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3055 */
/* .restart local v0 # "exit":Z */
} // :cond_3
v6 = (( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 3056 */
(( v.Vmenu ) v3 ).off ( ); // invoke-virtual {v3}, Lv/Vmenu;->off()V
/* .line 3057 */
(( app.Pool ) p0 ).addCenter ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 3060 */
} // :cond_4
v6 = (( app.Pool ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lapp/Pool;->keyGet()C
v1 = (( app.Pool ) p0 ).menuKey ( v3, v6 ); // invoke-virtual {p0, v3, v6}, Lapp/Pool;->menuKey(Lv/Vmenu;C)C
/* .line 3062 */
/* .local v1, "key":C */
v2 = (( v.Vmenu ) v3 ).selectedOrdinal ( ); // invoke-virtual {v3}, Lv/Vmenu;->selectedOrdinal()I
/* .line 3063 */
/* .local v2, "level":I */
int v6 = 4; // const/4 v6, 0x4
/* if-ge v2, v6, :cond_5 */
/* .line 3064 */
/* iput v2, p0, Lapp/Pool;->m_level:I */
/* .line 3065 */
/* if-nez v2, :cond_6 */
/* .line 3066 */
/* iput v9, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3075 */
} // :cond_5
} // :goto_3
(( app.Pool ) p0 ).opShow ( v9 ); // invoke-virtual {p0, v9}, Lapp/Pool;->opShow(I)V
/* .line 3077 */
/* sparse-switch v1, :sswitch_data_0 */
/* .line 3097 */
} // :goto_4
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* .line 3067 */
} // :cond_6
/* if-ne v2, v8, :cond_7 */
/* .line 3068 */
/* const/16 v6, 0x23 */
/* iput v6, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3069 */
} // :cond_7
int v6 = 2; // const/4 v6, 0x2
/* if-ne v2, v6, :cond_8 */
/* .line 3070 */
/* const/16 v6, 0x26 */
/* iput v6, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3072 */
} // :cond_8
/* const/16 v6, 0x29 */
/* iput v6, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3082 */
/* :sswitch_0 */
/* if-nez v5, :cond_9 */
/* .line 3083 */
/* iput v7, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3084 */
} // :cond_9
int v0 = 1; // const/4 v0, 0x1
/* .line 3085 */
/* .line 3088 */
/* :sswitch_1 */
if ( v5 != null) { // if-eqz v5, :cond_a
/* move v5, v7 */
/* .line 3089 */
} // :goto_5
(( v.Vmenu ) v3 ).getSelectedText ( ); // invoke-virtual {v3}, Lv/Vmenu;->getSelectedText()Lv/Vtext;
/* .line 3090 */
/* .local v4, "ps":Lv/Vtext; */
if ( v5 != null) { // if-eqz v5, :cond_b
/* .line 3091 */
final String v6 = "Visible: On"; // const-string v6, "Visible: On"
(( v.Vtext ) v4 ).setText ( v11 ); // invoke-virtual {v4, v11}, Lv/Vtext;->setText(Ljava/lang/String;)V
} // .end local v4 # "ps":Lv/Vtext;
} // :cond_a
/* move v5, v8 */
/* .line 3088 */
/* .line 3093 */
/* .restart local v4 # "ps":Lv/Vtext; */
} // :cond_b
final String v6 = "Visible: Off"; // const-string v6, "Visible: Off"
(( v.Vtext ) v4 ).setText ( v10 ); // invoke-virtual {v4, v10}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 3077 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x6 -> :sswitch_0 */
/* 0x8 -> :sswitch_0 */
/* 0x53 -> :sswitch_0 */
/* 0x56 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
Boolean menuSettings ( ) {
/* .locals 10 */
/* .prologue */
int v9 = 3; // const/4 v9, 0x3
int v8 = 2; // const/4 v8, 0x2
int v7 = 0; // const/4 v7, 0x0
int v6 = 1; // const/4 v6, 0x1
/* .line 3109 */
v5 = this.m_opponent;
v3 = (( v.Vsprite ) v5 ).isLinked ( ); // invoke-virtual {v5}, Lv/Vsprite;->isLinked()Z
/* .line 3112 */
/* .local v3, "opvis":Z */
/* const/16 v5, 0x20 */
(( app.Pool ) p0 ).opShow ( v5 ); // invoke-virtual {p0, v5}, Lapp/Pool;->opShow(I)V
/* .line 3114 */
/* new-instance v2, Lv/Vmenu; */
/* invoke-direct {v2}, Lv/Vmenu;-><init>()V */
/* .line 3116 */
/* .local v2, "m":Lv/Vmenu; */
final String v5 = "Straight Pool"; // const-string v5, "Straight Pool"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3119 */
final String v5 = "Eight Ball"; // const-string v5, "Eight Ball"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3120 */
final String v5 = "Nine Ball"; // const-string v5, "Nine Ball"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3121 */
final String v5 = "Practice"; // const-string v5, "Practice"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3124 */
/* iget v5, p0, Lapp/Pool;->m_game:I */
/* if-ne v5, v8, :cond_1 */
/* .line 3125 */
/* const/16 v5, 0x53 */
(( v.Vmenu ) v2 ).select ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->select(I)V
/* .line 3135 */
} // :goto_0
final String v5 = "Opponent"; // const-string v5, "Opponent"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3137 */
/* .local v4, "ps":Lv/Vtext; */
final String v5 = "Back"; // const-string v5, "Back"
(( v.Vmenu ) v2 ).add ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 3139 */
(( app.Pool ) p0 ).mend ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->mend(Lv/Vmenu;)V
/* .line 3141 */
(( app.Pool ) p0 ).addCenter ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 3148 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3150 */
/* .local v0, "exit":Z */
} // :goto_1
/* if-nez v0, :cond_0 */
v5 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
/* if-nez v5, :cond_4 */
/* .line 3202 */
} // :cond_0
final String v5 = "title_music_option2"; // const-string v5, "title_music_option2"
(( app.Pool ) p0 ).sound ( v5 ); // invoke-virtual {p0, v5}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 3204 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 3205 */
(( v.Vmenu ) v2 ).removeAllStar ( ); // invoke-virtual {v2}, Lv/Vmenu;->removeAllStar()V
/* .line 3206 */
v5 = this.m_opponent;
(( v.Vsprite ) v5 ).off ( ); // invoke-virtual {v5}, Lv/Vsprite;->off()V
/* .line 3207 */
/* iput-boolean v6, p0, Lapp/Pool;->m_reset:Z */
/* .line 3209 */
(( app.Pool ) p0 ).breakView ( ); // invoke-virtual {p0}, Lapp/Pool;->breakView()V
/* move v5, v6 */
/* .line 3212 */
} // :goto_2
/* .line 3127 */
} // .end local v0 # "exit":Z
} // .end local v4 # "ps":Lv/Vtext;
} // :cond_1
/* iget v5, p0, Lapp/Pool;->m_game:I */
/* if-nez v5, :cond_2 */
/* .line 3128 */
/* const/16 v5, 0x45 */
(( v.Vmenu ) v2 ).select ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->select(I)V
/* .line 3129 */
} // :cond_2
/* iget v5, p0, Lapp/Pool;->m_game:I */
/* if-ne v5, v9, :cond_3 */
/* .line 3130 */
/* const/16 v5, 0x4e */
(( v.Vmenu ) v2 ).select ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->select(I)V
/* .line 3132 */
} // :cond_3
/* const/16 v5, 0x50 */
(( v.Vmenu ) v2 ).select ( v5 ); // invoke-virtual {v2, v5}, Lv/Vmenu;->select(I)V
/* .line 3151 */
/* .restart local v0 # "exit":Z */
/* .restart local v4 # "ps":Lv/Vtext; */
} // :cond_4
v5 = (( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 3152 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 3153 */
(( app.Pool ) p0 ).addCenter ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 3156 */
} // :cond_5
v5 = (( app.Pool ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lapp/Pool;->keyGet()C
v1 = (( app.Pool ) p0 ).menuKey ( v2, v5 ); // invoke-virtual {p0, v2, v5}, Lapp/Pool;->menuKey(Lv/Vmenu;C)C
/* .line 3158 */
/* .local v1, "key":C */
(( v.Vmenu ) v2 ).getSelectedText ( ); // invoke-virtual {v2}, Lv/Vmenu;->getSelectedText()Lv/Vtext;
/* .line 3160 */
/* sparse-switch v1, :sswitch_data_0 */
/* .line 3198 */
} // :goto_3
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* .line 3166 */
/* :sswitch_0 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 3167 */
(( v.Vmenu ) v2 ).removeAllStar ( ); // invoke-virtual {v2}, Lv/Vmenu;->removeAllStar()V
/* .line 3168 */
/* if-nez v3, :cond_6 */
/* .line 3169 */
v5 = this.m_opponent;
(( v.Vsprite ) v5 ).off ( ); // invoke-virtual {v5}, Lv/Vsprite;->off()V
} // :cond_6
/* move v5, v7 */
/* .line 3170 */
/* .line 3173 */
/* :sswitch_1 */
/* iput v7, p0, Lapp/Pool;->m_game:I */
/* .line 3174 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3175 */
/* .line 3178 */
/* :sswitch_2 */
/* iput v9, p0, Lapp/Pool;->m_game:I */
/* .line 3179 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3180 */
/* .line 3183 */
/* :sswitch_3 */
(( v.Vmenu ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vmenu;->off()V
/* .line 3184 */
(( app.Pool ) p0 ).menuOpponent ( ); // invoke-virtual {p0}, Lapp/Pool;->menuOpponent()V
/* .line 3185 */
(( app.Pool ) p0 ).addCenter ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 3189 */
/* :sswitch_4 */
/* iput v6, p0, Lapp/Pool;->m_game:I */
/* .line 3190 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3191 */
/* .line 3194 */
/* :sswitch_5 */
/* iput v8, p0, Lapp/Pool;->m_game:I */
/* .line 3195 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3160 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x6 -> :sswitch_0 */
/* 0x8 -> :sswitch_0 */
/* 0x30 -> :sswitch_0 */
/* 0x42 -> :sswitch_0 */
/* 0x45 -> :sswitch_1 */
/* 0x4e -> :sswitch_2 */
/* 0x4f -> :sswitch_3 */
/* 0x50 -> :sswitch_4 */
/* 0x53 -> :sswitch_5 */
} // .end sparse-switch
} // .end method
v.Vector mouseToWorld ( ) {
/* .locals 11 */
/* .prologue */
/* .line 3242 */
/* const v4, 0x8000 */
/* .line 3243 */
/* .local v4, "mze":I */
/* iget v8, p0, Lapp/Pool;->m_mousey:I */
/* iget v9, p0, Lapp/Pool;->m_width:I */
/* mul-int/2addr v8, v9 */
/* iget v9, p0, Lapp/Pool;->m_mousex:I */
/* add-int v0, v8, v9 */
/* .line 3244 */
/* .local v0, "i":I */
/* if-ltz v0, :cond_0 */
v8 = this.m_rgb;
/* array-length v8, v8 */
/* if-ge v0, v8, :cond_0 */
/* .line 3251 */
v8 = this.m_zbuf;
/* aget v7, v8, v0 */
/* .line 3255 */
/* .local v7, "zi":I */
v4 = app.Pool .finvd ( v7 );
/* .line 3258 */
} // .end local v7 # "zi":I
} // :cond_0
/* iget v8, p0, Lapp/Pool;->m_D:I */
/* div-int v6, v4, v8 */
/* .line 3259 */
/* .local v6, "zd":I */
/* iget v8, p0, Lapp/Pool;->m_mousex:I */
/* iget v9, p0, Lapp/Pool;->m_sox0:I */
/* shr-int/lit8 v9, v9, 0xf */
/* sub-int/2addr v8, v9 */
/* mul-int v2, v8, v6 */
/* .line 3260 */
/* .local v2, "mxe":I */
/* iget v8, p0, Lapp/Pool;->m_mousey:I */
/* iget v9, p0, Lapp/Pool;->m_soy0:I */
/* shr-int/lit8 v9, v9, 0xf */
/* sub-int/2addr v8, v9 */
/* neg-int v8, v8 */
/* mul-int v3, v8, v6 */
/* .line 3263 */
/* .local v3, "mye":I */
v1 = this.m_mt;
/* .line 3264 */
/* .local v1, "m":Lv/Vmat; */
(( v.Vmat ) v1 ).identity ( ); // invoke-virtual {v1}, Lv/Vmat;->identity()V
/* .line 3265 */
/* iget v8, p0, Lapp/Pool;->m_heading:I */
(( v.Vmat ) v1 ).rotateY ( v8 ); // invoke-virtual {v1, v8}, Lv/Vmat;->rotateY(I)V
/* .line 3266 */
/* iget v8, p0, Lapp/Pool;->m_pitch:I */
(( v.Vmat ) v1 ).rotateX ( v8 ); // invoke-virtual {v1, v8}, Lv/Vmat;->rotateX(I)V
/* .line 3270 */
v5 = this.m_tv;
/* .line 3271 */
/* .local v5, "v":Lv/Vector; */
(( v.Vector ) v5 ).set ( v2, v3, v4 ); // invoke-virtual {v5, v2, v3, v4}, Lv/Vector;->set(III)V
/* .line 3273 */
(( v.Vmat ) v1 ).rotateInverse ( v5, v5 ); // invoke-virtual {v1, v5, v5}, Lv/Vmat;->rotateInverse(Lv/Vector;Lv/Vector;)V
/* .line 3275 */
/* iget v8, p0, Lapp/Pool;->m_wx:I */
/* iget v9, p0, Lapp/Pool;->m_wy:I */
/* iget v10, p0, Lapp/Pool;->m_wz:I */
(( v.Vector ) v5 ).add ( v8, v9, v10 ); // invoke-virtual {v5, v8, v9, v10}, Lv/Vector;->add(III)V
/* .line 3279 */
} // .end method
void noResume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 3284 */
int v0 = 5; // const/4 v0, 0x5
/* const/16 v1, 0x7fff */
(( app.Pool ) p0 ).prefWrite ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lapp/Pool;->prefWrite(II)V
/* .line 3285 */
return;
} // .end method
void opShow ( Integer p0 ) {
/* .locals 7 */
/* .param p1, "pic" # I */
/* .prologue */
/* const/16 v6, 0x140 */
/* .line 3289 */
/* iget v2, p0, Lapp/Pool;->m_opicbase:I */
/* if-nez v2, :cond_0 */
/* .line 3354 */
} // :goto_0
return;
/* .line 3293 */
} // :cond_0
v2 = this.m_opponent;
v2 = (( v.Vsprite ) v2 ).isLinked ( ); // invoke-virtual {v2}, Lv/Vsprite;->isLinked()Z
/* if-nez v2, :cond_1 */
/* .line 3294 */
v2 = this.m_opponent;
(( app.Pool ) p0 ).add ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 3297 */
} // :cond_1
v2 = this.m_opponent;
v3 = this.m_lib;
/* iget v4, p0, Lapp/Pool;->m_opicbase:I */
/* const/16 v5, 0x20 */
/* sub-int v5, p1, v5 */
/* add-int/2addr v4, v5 */
(( v.Vsprite ) v2 ).setImage ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 3302 */
/* iget v0, p0, Lapp/Pool;->m_width:I */
/* .line 3304 */
/* .local v0, "x":I */
/* const/16 v2, 0xb0 */
/* if-le v0, v2, :cond_2 */
/* .line 3305 */
/* add-int/lit8 v0, v0, -0x20 */
/* .line 3310 */
} // :cond_2
/* iget v1, p0, Lapp/Pool;->m_height:I */
/* .line 3313 */
/* .local v1, "y":I */
v2 = this.m_opponent;
/* iget v2, v2, Lv/Vsprite;->m_height:I */
v3 = this.m_opponent;
/* iget v3, v3, Lv/Vsprite;->m_ycenter:I */
/* sub-int/2addr v2, v3 */
/* sub-int/2addr v1, v2 */
/* .line 3314 */
/* iget v2, p0, Lapp/Pool;->m_width:I */
v3 = this.m_opponent;
/* iget v3, v3, Lv/Vsprite;->m_width:I */
/* sub-int/2addr v2, v3 */
v3 = this.m_opponent;
/* iget v3, v3, Lv/Vsprite;->m_xcenter:I */
/* add-int v0, v2, v3 */
/* .line 3321 */
/* iget v2, p0, Lapp/Pool;->m_width:I */
/* if-le v2, v6, :cond_4 */
/* iget v2, p0, Lapp/Pool;->m_width:I */
/* iget v3, p0, Lapp/Pool;->m_height:I */
/* if-le v2, v3, :cond_4 */
/* .line 3323 */
/* add-int/lit8 v0, v0, -0x3c */
/* .line 3324 */
/* add-int/lit8 v1, v1, 0x10 */
/* .line 3348 */
} // :cond_3
} // :goto_1
v2 = this.m_opponent;
(( v.Vsprite ) v2 ).setXyi ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lv/Vsprite;->setXyi(II)V
/* .line 3353 */
v2 = v2 = this.m_display;
/* iput v2, p0, Lapp/Pool;->m_facetime:I */
/* .line 3326 */
} // :cond_4
/* iget v2, p0, Lapp/Pool;->m_width:I */
/* if-ne v2, v6, :cond_3 */
/* .line 3327 */
/* add-int/lit8 v0, v0, -0x1e */
} // .end method
void pitch ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "angle" # I */
/* .prologue */
/* const/16 v2, 0x1ffe */
/* const/16 v1, 0x333 */
/* .line 3357 */
/* iget v0, p0, Lapp/Pool;->m_pitch:I */
/* add-int/2addr v0, p1 */
/* iput v0, p0, Lapp/Pool;->m_pitch:I */
/* .line 3359 */
/* iget v0, p0, Lapp/Pool;->m_pitch:I */
/* if-ge v0, v1, :cond_1 */
/* .line 3360 */
/* iput v1, p0, Lapp/Pool;->m_pitch:I */
/* .line 3364 */
} // :cond_0
} // :goto_0
(( app.Pool ) p0 ).lookAt ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt()V
/* .line 3365 */
return;
/* .line 3361 */
} // :cond_1
/* iget v0, p0, Lapp/Pool;->m_pitch:I */
/* if-le v0, v2, :cond_0 */
/* .line 3362 */
/* iput v2, p0, Lapp/Pool;->m_pitch:I */
} // .end method
void play ( ) {
/* .locals 11 */
/* .prologue */
/* const/16 v10, 0x34 */
int v9 = 5; // const/4 v9, 0x5
/* const/16 v8, -0x100 */
int v7 = 0; // const/4 v7, 0x0
int v6 = 1; // const/4 v6, 0x1
/* .line 3370 */
v3 = this.m_menu;
/* iget v1, v3, Lv/Vmenu;->m_square:I */
/* .line 3376 */
/* .local v1, "msq2":I */
/* iget-boolean v3, p0, Lapp/Pool;->m_player:Z */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 3377 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* .line 3379 */
} // :cond_0
} // :goto_0
v3 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
/* if-nez v3, :cond_1 */
/* .line 3614 */
return;
/* .line 3380 */
} // :cond_1
(( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
/* .line 3383 */
v3 = this.m_menu;
/* iget v4, p0, Lapp/Pool;->m_mousex:I */
/* iget v5, p0, Lapp/Pool;->m_mousey:I */
(( v.Vmenu ) v3 ).fade ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lv/Vmenu;->fade(II)V
/* .line 3390 */
v0 = (( app.Pool ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lapp/Pool;->keyGet()C
/* .line 3392 */
/* .local v0, "key":C */
/* if-nez v0, :cond_3 */
/* iget-boolean v3, p0, Lapp/Pool;->m_player:Z */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 3393 */
v3 = (( app.Pool ) p0 ).keyDown ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->keyDown(C)Z
if ( v3 != null) { // if-eqz v3, :cond_c
/* .line 3394 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3412 */
} // :cond_2
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_10
/* .line 3415 */
v3 = v3 = this.m_display;
/* iget v4, p0, Lapp/Pool;->m_keyTime:I */
/* sub-int/2addr v3, v4 */
/* const/16 v4, 0xc8 */
/* if-ge v3, v4, :cond_3 */
/* .line 3416 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3426 */
} // :cond_3
} // :goto_2
/* if-nez v0, :cond_4 */
/* .line 3427 */
/* iget-boolean v3, p0, Lapp/Pool;->m_player:Z */
/* if-nez v3, :cond_17 */
v3 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
if ( v3 != null) { // if-eqz v3, :cond_17
/* .line 3428 */
int v0 = 5; // const/4 v0, 0x5
/* .line 3434 */
} // :cond_4
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 3435 */
/* if-ne v0, v9, :cond_7 */
/* iget v3, p0, Lapp/Pool;->m_mousex:I */
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 3439 */
/* iget-boolean v3, p0, Lapp/Pool;->m_playBreak:Z */
/* if-nez v3, :cond_5 */
/* iget-boolean v3, p0, Lapp/Pool;->m_playScratch:Z */
/* if-nez v3, :cond_5 */
/* iget v3, p0, Lapp/Pool;->m_game:I */
/* if-ne v3, v6, :cond_6 */
/* .line 3440 */
} // :cond_5
v3 = this.m_cueball;
/* iget v4, p0, Lapp/Pool;->m_mousex:I */
/* iget v5, p0, Lapp/Pool;->m_mousey:I */
v3 = (( app.Ball ) v3 ).pick ( v4, v5, v7 ); // invoke-virtual {v3, v4, v5, v7}, Lapp/Ball;->pick(III)Z
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 3441 */
/* const/16 v0, 0x2a */
/* .line 3443 */
} // :cond_6
v3 = this.m_menu;
/* iget v4, p0, Lapp/Pool;->m_mousex:I */
/* iget v5, p0, Lapp/Pool;->m_mousey:I */
v3 = (( v.Vmenu ) v3 ).pick ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lv/Vmenu;->pick(II)Z
if ( v3 != null) { // if-eqz v3, :cond_11
/* .line 3445 */
/* iget-boolean v3, p0, Lapp/Pool;->m_menuShow:Z */
/* if-nez v3, :cond_7 */
/* .line 3447 */
/* iput v7, p0, Lapp/Pool;->m_mousex:I */
/* .line 3448 */
/* iput v7, p0, Lapp/Pool;->m_mousey:I */
/* .line 3449 */
/* iput-boolean v6, p0, Lapp/Pool;->m_menuShow:Z */
/* .line 3450 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* .line 3451 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3452 */
(( app.Pool ) p0 ).click ( ); // invoke-virtual {p0}, Lapp/Pool;->click()V
/* .line 3469 */
} // :cond_7
} // :goto_3
/* iget-boolean v3, p0, Lapp/Pool;->m_menuShow:Z */
if ( v3 != null) { // if-eqz v3, :cond_8
/* .line 3470 */
v0 = (( app.Pool ) p0 ).menuGame ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->menuGame(C)C
/* .line 3472 */
} // :cond_8
/* iget-char v3, p0, Lapp/Pool;->m_keyLast:C */
/* if-eq v0, v3, :cond_9 */
/* .line 3473 */
/* iput-char v0, p0, Lapp/Pool;->m_keyLast:C */
/* .line 3474 */
v3 = v3 = this.m_display;
/* iput v3, p0, Lapp/Pool;->m_keyTime:I */
/* .line 3478 */
} // :cond_9
/* iget-boolean v3, p0, Lapp/Pool;->m_menuShow:Z */
/* if-nez v3, :cond_a */
/* .line 3480 */
int v3 = 3; // const/4 v3, 0x3
/* if-ne v0, v3, :cond_12 */
/* .line 3481 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3486 */
} // :cond_a
} // :goto_4
/* sparse-switch v0, :sswitch_data_0 */
/* .line 3595 */
} // :cond_b
} // :goto_5
/* :sswitch_0 */
v0 = (( app.Pool ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lapp/Pool;->keyGet()C
/* .line 3424 */
/* .line 3395 */
} // :cond_c
v3 = (( app.Pool ) p0 ).keyDown ( v10 ); // invoke-virtual {p0, v10}, Lapp/Pool;->keyDown(C)Z
if ( v3 != null) { // if-eqz v3, :cond_d
/* .line 3396 */
/* const/16 v0, 0x34 */
/* goto/16 :goto_1 */
/* .line 3397 */
} // :cond_d
int v3 = 2; // const/4 v3, 0x2
v3 = (( app.Pool ) p0 ).keyDown ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->keyDown(C)Z
if ( v3 != null) { // if-eqz v3, :cond_e
/* .line 3398 */
int v0 = 2; // const/4 v0, 0x2
/* goto/16 :goto_1 */
/* .line 3399 */
} // :cond_e
/* const/16 v3, 0x36 */
v3 = (( app.Pool ) p0 ).keyDown ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->keyDown(C)Z
if ( v3 != null) { // if-eqz v3, :cond_f
/* .line 3400 */
/* const/16 v0, 0x36 */
/* goto/16 :goto_1 */
/* .line 3403 */
} // :cond_f
v3 = (( app.Pool ) p0 ).keyDown ( v9 ); // invoke-virtual {p0, v9}, Lapp/Pool;->keyDown(C)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* iget-boolean v3, p0, Lapp/Pool;->m_menuShow:Z */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 3404 */
v3 = this.m_menu;
(( v.Vmenu ) v3 ).getSelected ( ); // invoke-virtual {v3}, Lv/Vmenu;->getSelected()Lv/Vsprite;
/* .line 3405 */
/* .local v2, "p":Lv/Vsprite; */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 3406 */
v3 = (( v.Vsprite ) v2 ).getId ( ); // invoke-virtual {v2}, Lv/Vsprite;->getId()I
/* int-to-char v0, v3 */
/* .line 3407 */
/* if-eq v0, v10, :cond_2 */
/* const/16 v3, 0x36 */
/* if-eq v0, v3, :cond_2 */
/* .line 3408 */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_1 */
/* .line 3420 */
} // .end local v2 # "p":Lv/Vsprite;
} // :cond_10
/* iput-char v7, p0, Lapp/Pool;->m_keyLast:C */
/* goto/16 :goto_2 */
/* .line 3455 */
} // :cond_11
/* iget-boolean v3, p0, Lapp/Pool;->m_player:Z */
if ( v3 != null) { // if-eqz v3, :cond_7
/* iget-boolean v3, p0, Lapp/Pool;->m_menuShow:Z */
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 3458 */
/* iget v3, p0, Lapp/Pool;->m_mousey:I */
/* iget v4, p0, Lapp/Pool;->m_height:I */
/* sub-int/2addr v4, v1 */
/* if-ge v3, v4, :cond_7 */
/* iget v3, p0, Lapp/Pool;->m_mousex:I */
/* if-le v3, v1, :cond_7 */
/* iget v3, p0, Lapp/Pool;->m_mousex:I */
/* iget v4, p0, Lapp/Pool;->m_width:I */
/* sub-int/2addr v4, v1 */
/* if-ge v3, v4, :cond_7 */
/* .line 3464 */
/* iput-boolean v7, p0, Lapp/Pool;->m_menuShow:Z */
/* .line 3465 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* goto/16 :goto_3 */
/* .line 3482 */
} // :cond_12
int v3 = 4; // const/4 v3, 0x4
/* if-ne v0, v3, :cond_a */
/* .line 3483 */
int v0 = 2; // const/4 v0, 0x2
/* .line 3495 */
/* :sswitch_1 */
/* const/16 v3, 0x40 */
(( app.Pool ) p0 ).cueRotate ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->cueRotate(I)V
/* .line 3502 */
/* :sswitch_2 */
(( app.Pool ) p0 ).select ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->select(C)V
/* .line 3507 */
/* :sswitch_3 */
/* const/16 v3, -0x40 */
(( app.Pool ) p0 ).cueRotate ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->cueRotate(I)V
/* .line 3514 */
/* :sswitch_4 */
/* iput-boolean v6, p0, Lapp/Pool;->m_menuShow:Z */
/* .line 3515 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* goto/16 :goto_5 */
/* .line 3521 */
/* :sswitch_5 */
/* const/high16 v3, 0x90000 */
(( app.Pool ) p0 ).zoom ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->zoom(I)V
/* goto/16 :goto_5 */
/* .line 3529 */
/* :sswitch_6 */
/* iget-boolean v3, p0, Lapp/Pool;->m_breakView:Z */
/* if-nez v3, :cond_13 */
/* .line 3530 */
(( app.Pool ) p0 ).breakViewSettings ( ); // invoke-virtual {p0}, Lapp/Pool;->breakViewSettings()V
/* .line 3531 */
/* iget v3, p0, Lapp/Pool;->m_aimAt:I */
/* sub-int/2addr v3, v6 */
/* iput v3, p0, Lapp/Pool;->m_aimAt:I */
/* .line 3533 */
} // :cond_13
(( app.Pool ) p0 ).aimAt ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->aimAt(I)V
/* goto/16 :goto_5 */
/* .line 3539 */
/* :sswitch_7 */
/* const/16 v3, 0x100 */
(( app.Pool ) p0 ).pitch ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->pitch(I)V
/* goto/16 :goto_5 */
/* .line 3545 */
/* :sswitch_8 */
/* const/high16 v3, -0x90000 */
(( app.Pool ) p0 ).zoom ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->zoom(I)V
/* goto/16 :goto_5 */
/* .line 3551 */
/* :sswitch_9 */
/* iget-boolean v3, p0, Lapp/Pool;->m_breakView:Z */
if ( v3 != null) { // if-eqz v3, :cond_14
/* .line 3552 */
/* iget v3, p0, Lapp/Pool;->m_cueAngle:I */
/* iput v3, p0, Lapp/Pool;->m_heading:I */
/* .line 3553 */
(( app.Pool ) p0 ).lookAt0 ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt0()V
/* goto/16 :goto_5 */
/* .line 3555 */
} // :cond_14
/* iget v3, p0, Lapp/Pool;->m_cueAngle:I */
/* iget v4, p0, Lapp/Pool;->m_heading:I */
/* if-eq v3, v4, :cond_15 */
/* .line 3556 */
/* iget v3, p0, Lapp/Pool;->m_cueAngle:I */
/* iput v3, p0, Lapp/Pool;->m_heading:I */
/* .line 3557 */
(( app.Pool ) p0 ).lookAt ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt()V
/* goto/16 :goto_5 */
/* .line 3560 */
} // :cond_15
int v3 = -1; // const/4 v3, -0x1
(( app.Pool ) p0 ).aimAt ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->aimAt(I)V
/* goto/16 :goto_5 */
/* .line 3566 */
/* :sswitch_a */
(( app.Pool ) p0 ).pitch ( v8 ); // invoke-virtual {p0, v8}, Lapp/Pool;->pitch(I)V
/* goto/16 :goto_5 */
/* .line 3570 */
/* :sswitch_b */
/* iget-boolean v3, p0, Lapp/Pool;->m_playBreak:Z */
/* if-nez v3, :cond_16 */
/* iget-boolean v3, p0, Lapp/Pool;->m_playScratch:Z */
/* if-nez v3, :cond_16 */
/* iget v3, p0, Lapp/Pool;->m_game:I */
/* if-ne v3, v6, :cond_b */
/* .line 3571 */
} // :cond_16
(( app.Pool ) p0 ).ballInHand ( ); // invoke-virtual {p0}, Lapp/Pool;->ballInHand()V
/* goto/16 :goto_5 */
/* .line 3577 */
/* :sswitch_c */
(( app.Pool ) p0 ).heading ( v8 ); // invoke-virtual {p0, v8}, Lapp/Pool;->heading(I)V
/* goto/16 :goto_5 */
/* .line 3581 */
/* :sswitch_d */
/* const/16 v3, 0x100 */
(( app.Pool ) p0 ).heading ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->heading(I)V
/* goto/16 :goto_5 */
/* .line 3604 */
} // :cond_17
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* goto/16 :goto_0 */
/* .line 3486 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x1 -> :sswitch_1 */
/* 0x2 -> :sswitch_3 */
/* 0x3 -> :sswitch_6 */
/* 0x4 -> :sswitch_9 */
/* 0x5 -> :sswitch_2 */
/* 0x6 -> :sswitch_4 */
/* 0x8 -> :sswitch_4 */
/* 0xa -> :sswitch_2 */
/* 0x20 -> :sswitch_2 */
/* 0x2a -> :sswitch_b */
/* 0x2b -> :sswitch_5 */
/* 0x2d -> :sswitch_8 */
/* 0x30 -> :sswitch_4 */
/* 0x31 -> :sswitch_5 */
/* 0x32 -> :sswitch_6 */
/* 0x33 -> :sswitch_7 */
/* 0x34 -> :sswitch_1 */
/* 0x35 -> :sswitch_2 */
/* 0x36 -> :sswitch_3 */
/* 0x37 -> :sswitch_8 */
/* 0x38 -> :sswitch_9 */
/* 0x39 -> :sswitch_a */
/* 0x62 -> :sswitch_0 */
/* 0x64 -> :sswitch_a */
/* 0x6c -> :sswitch_c */
/* 0x72 -> :sswitch_d */
/* 0x75 -> :sswitch_7 */
} // .end sparse-switch
} // .end method
void prefBallRead ( app.Ball p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "b" # Lapp/Ball; */
/* .param p2, "i" # I */
/* .prologue */
/* .line 3621 */
/* shl-int/lit8 v0, p2, 0x1 */
/* add-int/lit8 p2, v0, 0x5 */
/* .line 3623 */
v0 = (( app.Pool ) p0 ).prefReads ( p2 ); // invoke-virtual {p0, p2}, Lapp/Pool;->prefReads(I)I
/* shl-int/lit8 v0, v0, 0x9 */
/* const v1, 0xb000 */
/* add-int/lit8 v2, p2, 0x1 */
v2 = (( app.Pool ) p0 ).prefReads ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->prefReads(I)I
/* shl-int/lit8 v2, v2, 0x9 */
(( app.Ball ) p1 ).setWxyz ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lapp/Ball;->setWxyz(III)V
/* .line 3625 */
/* iget v0, p1, Lapp/Ball;->m_wx:I */
/* const/high16 v1, 0x320000 */
/* if-ge v0, v1, :cond_0 */
/* .line 3626 */
(( app.Pool ) p0 ).add ( p1 ); // invoke-virtual {p0, p1}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 3629 */
} // :cond_0
return;
} // .end method
void prefBallRestore ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 3633 */
(( app.Pool ) p0 ).prefBallRestore1 ( ); // invoke-virtual {p0}, Lapp/Pool;->prefBallRestore1()V
/* .line 3636 */
(( app.Pool ) p0 ).prefsRestore ( ); // invoke-virtual {p0}, Lapp/Pool;->prefsRestore()V
/* .line 3638 */
/* iput-boolean v0, p0, Lapp/Pool;->m_playScratch:Z */
/* .line 3639 */
/* iput-boolean v0, p0, Lapp/Pool;->m_9ballHit:Z */
/* .line 3640 */
/* iput-boolean v0, p0, Lapp/Pool;->m_9ballFoul:Z */
/* .line 3641 */
return;
} // .end method
void prefBallRestore1 ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 3645 */
v2 = this.m_cueball;
(( app.Pool ) p0 ).prefBallRead ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lapp/Pool;->prefBallRead(Lapp/Ball;I)V
/* .line 3646 */
v2 = this.m_cueball;
(( app.Ball ) v2 ).setVelocity ( v3, v3, v3 ); // invoke-virtual {v2, v3, v3, v3}, Lapp/Ball;->setVelocity(III)V
/* .line 3648 */
/* const/16 v1, 0xe */
/* .local v1, "i":I */
} // :goto_0
/* if-gez v1, :cond_0 */
/* .line 3657 */
return;
/* .line 3649 */
} // :cond_0
v2 = this.m_balls;
/* aget-object v0, v2, v1 */
/* .line 3650 */
/* .local v0, "b":Lapp/Ball; */
(( app.Ball ) v0 ).off ( ); // invoke-virtual {v0}, Lapp/Ball;->off()V
/* .line 3651 */
(( app.Ball ) v0 ).setVelocity ( v3, v3, v3 ); // invoke-virtual {v0, v3, v3, v3}, Lapp/Ball;->setVelocity(III)V
/* .line 3652 */
/* add-int/lit8 v2, v1, 0x1 */
(( app.Pool ) p0 ).prefBallRead ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Lapp/Pool;->prefBallRead(Lapp/Ball;I)V
/* .line 3654 */
v2 = (( app.Ball ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lapp/Ball;->isLinked()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 3655 */
/* iput v1, p0, Lapp/Pool;->m_9ballNext:I */
/* .line 3648 */
} // :cond_1
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
void prefBallSave ( ) {
/* .locals 3 */
/* .prologue */
/* .line 3661 */
v1 = this.m_cueball;
int v2 = 0; // const/4 v2, 0x0
(( app.Pool ) p0 ).prefBallWrite ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lapp/Pool;->prefBallWrite(Lapp/Ball;I)V
/* .line 3662 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* const/16 v1, 0xf */
/* if-lt v0, v1, :cond_0 */
/* .line 3665 */
(( app.Pool ) p0 ).prefSaveRam ( ); // invoke-virtual {p0}, Lapp/Pool;->prefSaveRam()V
/* .line 3666 */
return;
/* .line 3663 */
} // :cond_0
v1 = this.m_balls;
/* aget-object v1, v1, v0 */
/* add-int/lit8 v2, v0, 0x1 */
(( app.Pool ) p0 ).prefBallWrite ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lapp/Pool;->prefBallWrite(Lapp/Ball;I)V
/* .line 3662 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
void prefBallWrite ( app.Ball p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "b" # Lapp/Ball; */
/* .param p2, "i" # I */
/* .prologue */
/* .line 3669 */
/* shl-int/lit8 v2, p2, 0x1 */
/* add-int/lit8 p2, v2, 0x5 */
/* .line 3671 */
/* iget v0, p1, Lapp/Ball;->m_wx:I */
/* .line 3672 */
/* .local v0, "x":I */
/* iget v1, p1, Lapp/Ball;->m_wz:I */
/* .line 3674 */
/* .local v1, "z":I */
v2 = (( app.Ball ) p1 ).isLinked ( ); // invoke-virtual {p1}, Lapp/Ball;->isLinked()Z
/* if-nez v2, :cond_0 */
/* .line 3675 */
/* const/high16 v0, 0x320000 */
/* .line 3677 */
} // :cond_0
/* shr-int/lit8 v2, v0, 0x9 */
(( app.Pool ) p0 ).prefWrite ( p2, v2 ); // invoke-virtual {p0, p2, v2}, Lapp/Pool;->prefWrite(II)V
/* .line 3678 */
/* add-int/lit8 v2, p2, 0x1 */
/* shr-int/lit8 v3, v1, 0x9 */
(( app.Pool ) p0 ).prefWrite ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lapp/Pool;->prefWrite(II)V
/* .line 3679 */
return;
} // .end method
void prefLoad ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 3683 */
/* const/16 v1, 0x5e */
/* .line 3684 */
/* .local v1, "n":I */
/* new-array v4, v1, [B */
this.m_prefs = v4;
/* .line 3691 */
v4 = this.m_display;
final String v5 = "vegaspool"; // const-string v5, "vegaspool"
v4 = v6 = this.m_prefs;
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 3693 */
(( app.Pool ) p0 ).prefsRestore ( ); // invoke-virtual {p0}, Lapp/Pool;->prefsRestore()V
/* .line 3699 */
} // :goto_0
v4 = (( app.Pool ) p0 ).prefRead ( v7 ); // invoke-virtual {p0, v7}, Lapp/Pool;->prefRead(I)I
/* if-nez v4, :cond_0 */
/* .line 3701 */
int v3 = 0; // const/4 v3, 0x0
/* .line 3707 */
/* .local v3, "t":I */
v4 = this.m_display;
/* .line 3708 */
/* .local v2, "s":Ljava/lang/String; */
v4 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 3712 */
v1 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* .line 3713 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_1
/* if-lt v0, v1, :cond_3 */
/* .line 3718 */
} // .end local v0 # "i":I
} // :goto_2
/* const v4, 0xffff */
/* and-int/2addr v4, v3 */
(( app.Pool ) p0 ).prefWrite ( v7, v4 ); // invoke-virtual {p0, v7, v4}, Lapp/Pool;->prefWrite(II)V
/* .line 3720 */
} // .end local v2 # "s":Ljava/lang/String;
} // .end local v3 # "t":I
} // :cond_0
return;
/* .line 3696 */
} // :cond_1
(( app.Pool ) p0 ).noResume ( ); // invoke-virtual {p0}, Lapp/Pool;->noResume()V
/* .line 3709 */
/* .restart local v2 # "s":Ljava/lang/String; */
/* .restart local v3 # "t":I */
} // :cond_2
v3 = v4 = this.m_display;
/* .line 3714 */
/* .restart local v0 # "i":I */
} // :cond_3
v4 = (( java.lang.String ) v2 ).charAt ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C
/* xor-int/lit8 v4, v4, 0x23 */
/* shl-int/2addr v4, v0 */
/* add-int/2addr v3, v4 */
/* .line 3713 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
Integer prefRead ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "i" # I */
/* .prologue */
/* .line 3724 */
/* shl-int/lit8 p1, p1, 0x1 */
/* .line 3725 */
v1 = this.m_prefs;
/* aget-byte v1, v1, p1 */
/* and-int/lit16 v1, v1, 0xff */
v2 = this.m_prefs;
/* add-int/lit8 v3, p1, 0x1 */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 v2, v2, 0xff */
/* shl-int/lit8 v2, v2, 0x8 */
/* add-int v0, v1, v2 */
/* .line 3729 */
/* .local v0, "w":I */
} // .end method
Integer prefReads ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "i" # I */
/* .prologue */
/* .line 3734 */
v0 = (( app.Pool ) p0 ).prefRead ( p1 ); // invoke-virtual {p0, p1}, Lapp/Pool;->prefRead(I)I
/* .line 3735 */
/* .local v0, "w":I */
/* const v1, 0x8000 */
/* and-int/2addr v1, v0 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3736 */
/* const/high16 v1, -0x10000 */
/* or-int/2addr v0, v1 */
/* .line 3737 */
} // :cond_0
} // .end method
void prefSave ( ) {
/* .locals 3 */
/* .prologue */
/* .line 3787 */
(( app.Pool ) p0 ).prefSaveRam ( ); // invoke-virtual {p0}, Lapp/Pool;->prefSaveRam()V
/* .line 3790 */
/* iget-boolean v0, p0, Lapp/Pool;->m_playBreak:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3791 */
(( app.Pool ) p0 ).noResume ( ); // invoke-virtual {p0}, Lapp/Pool;->noResume()V
/* .line 3793 */
} // :cond_0
v0 = this.m_display;
final String v1 = "vegaspool"; // const-string v1, "vegaspool"
v2 = this.m_prefs;
/* .line 3794 */
return;
} // .end method
void prefSaveRam ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 3798 */
/* iget v1, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3799 */
/* .local v1, "op":I */
/* const/16 v2, 0x20 */
/* if-ne v1, v2, :cond_2 */
/* .line 3800 */
int v1 = 1; // const/4 v1, 0x1
/* .line 3813 */
} // :cond_0
} // :goto_0
/* shl-int/lit8 v2, v1, 0x9 */
/* iget-boolean v3, p0, Lapp/Pool;->m_playSolids:Z */
if ( v3 != null) { // if-eqz v3, :cond_5
/* const/16 v3, 0x100 */
} // :goto_1
/* or-int/2addr v2, v3 */
/* iget-boolean v3, p0, Lapp/Pool;->m_playStripes:Z */
if ( v3 != null) { // if-eqz v3, :cond_6
/* const/16 v3, 0x80 */
} // :goto_2
/* or-int/2addr v2, v3 */
/* iget-boolean v3, p0, Lapp/Pool;->m_player:Z */
if ( v3 != null) { // if-eqz v3, :cond_7
/* const/16 v3, 0x40 */
} // :goto_3
/* or-int/2addr v2, v3 */
/* .line 3814 */
/* iget v3, p0, Lapp/Pool;->m_game:I */
/* shl-int/lit8 v3, v3, 0x3 */
/* .line 3813 */
/* or-int/2addr v2, v3 */
/* .line 3814 */
/* iget v3, p0, Lapp/Pool;->m_level:I */
/* shl-int/lit8 v3, v3, 0x1 */
/* .line 3813 */
/* or-int v0, v2, v3 */
/* .line 3816 */
/* .local v0, "flags":I */
/* iget-boolean v2, p0, Lapp/Pool;->m_soundOff:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 3817 */
/* or-int/lit8 v0, v0, 0x1 */
/* .line 3819 */
} // :cond_1
int v2 = 2; // const/4 v2, 0x2
(( app.Pool ) p0 ).prefWrite ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lapp/Pool;->prefWrite(II)V
/* .line 3821 */
int v2 = 3; // const/4 v2, 0x3
v3 = this.m_score1;
v3 = (( v.Vtext ) v3 ).getNumber ( ); // invoke-virtual {v3}, Lv/Vtext;->getNumber()I
/* shl-int/lit8 v3, v3, 0x8 */
v4 = this.m_score2;
v4 = (( v.Vtext ) v4 ).getNumber ( ); // invoke-virtual {v4}, Lv/Vtext;->getNumber()I
/* or-int/2addr v3, v4 */
(( app.Pool ) p0 ).prefWrite ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lapp/Pool;->prefWrite(II)V
/* .line 3823 */
int v2 = 4; // const/4 v2, 0x4
/* iget v3, p0, Lapp/Pool;->m_cueAngle:I */
(( app.Pool ) p0 ).prefWrite ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lapp/Pool;->prefWrite(II)V
/* .line 3824 */
return;
/* .line 3801 */
} // .end local v0 # "flags":I
} // :cond_2
/* const/16 v2, 0x23 */
/* if-ne v1, v2, :cond_3 */
/* .line 3802 */
int v1 = 2; // const/4 v1, 0x2
/* .line 3803 */
} // :cond_3
/* const/16 v2, 0x26 */
/* if-ne v1, v2, :cond_4 */
/* .line 3804 */
int v1 = 3; // const/4 v1, 0x3
/* .line 3805 */
} // :cond_4
/* const/16 v2, 0x29 */
/* if-ne v1, v2, :cond_0 */
/* .line 3806 */
int v1 = 4; // const/4 v1, 0x4
} // :cond_5
/* move v3, v4 */
/* .line 3813 */
} // :cond_6
/* move v3, v4 */
} // :cond_7
/* move v3, v4 */
} // .end method
void prefWrite ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "i" # I */
/* .param p2, "w" # I */
/* .prologue */
/* .line 3827 */
/* shl-int/lit8 p1, p1, 0x1 */
/* .line 3831 */
v0 = this.m_prefs;
/* int-to-byte v1, p2 */
/* aput-byte v1, v0, p1 */
/* .line 3832 */
v0 = this.m_prefs;
/* add-int/lit8 v1, p1, 0x1 */
/* shr-int/lit8 v2, p2, 0x8 */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* .line 3833 */
return;
} // .end method
void prefsRestore ( ) {
/* .locals 10 */
/* .prologue */
int v8 = 3; // const/4 v8, 0x3
int v7 = 2; // const/4 v7, 0x2
int v6 = 0; // const/4 v6, 0x0
int v5 = 1; // const/4 v5, 0x1
final String v9 = ""; // const-string v9, ""
/* .line 3741 */
v0 = (( app.Pool ) p0 ).prefRead ( v7 ); // invoke-virtual {p0, v7}, Lapp/Pool;->prefRead(I)I
/* .line 3743 */
/* .local v0, "flags":I */
/* and-int/lit16 v4, v0, 0x100 */
if ( v4 != null) { // if-eqz v4, :cond_2
/* move v4, v5 */
} // :goto_0
/* iput-boolean v4, p0, Lapp/Pool;->m_playSolids:Z */
/* .line 3744 */
/* and-int/lit16 v4, v0, 0x80 */
if ( v4 != null) { // if-eqz v4, :cond_3
/* move v4, v5 */
} // :goto_1
/* iput-boolean v4, p0, Lapp/Pool;->m_playStripes:Z */
/* .line 3745 */
/* and-int/lit8 v4, v0, 0x40 */
if ( v4 != null) { // if-eqz v4, :cond_4
/* move v4, v5 */
} // :goto_2
/* iput-boolean v4, p0, Lapp/Pool;->m_player:Z */
/* .line 3747 */
/* shr-int/lit8 v1, v0, 0x9 */
/* .line 3749 */
/* .local v1, "op":I */
/* if-ne v1, v5, :cond_5 */
/* .line 3750 */
/* const/16 v4, 0x20 */
/* iput v4, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3760 */
} // :goto_3
/* shr-int/lit8 v4, v0, 0x3 */
/* and-int/lit8 v4, v4, 0x7 */
/* iput v4, p0, Lapp/Pool;->m_game:I */
/* .line 3761 */
/* shr-int/lit8 v4, v0, 0x1 */
/* and-int/lit8 v4, v4, 0x3 */
/* iput v4, p0, Lapp/Pool;->m_level:I */
/* .line 3762 */
/* and-int/lit8 v4, v0, 0x1 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 3763 */
/* iput-boolean v5, p0, Lapp/Pool;->m_soundOff:Z */
/* .line 3765 */
} // :cond_0
v2 = (( app.Pool ) p0 ).prefRead ( v8 ); // invoke-virtual {p0, v8}, Lapp/Pool;->prefRead(I)I
/* .line 3766 */
/* .local v2, "score":I */
/* and-int/lit16 v3, v2, 0xff */
/* .line 3767 */
/* .local v3, "score2":I */
/* shr-int/lit8 v2, v2, 0x8 */
/* .line 3768 */
v4 = this.m_score1;
(( v.Vtext ) v4 ).setNumber ( v2 ); // invoke-virtual {v4, v2}, Lv/Vtext;->setNumber(I)V
/* .line 3769 */
v4 = this.m_score2;
(( v.Vtext ) v4 ).setNumber ( v3 ); // invoke-virtual {v4, v3}, Lv/Vtext;->setNumber(I)V
/* .line 3770 */
/* sub-int v4, v2, v3 */
/* iput v4, p0, Lapp/Pool;->m_scoredif:I */
/* .line 3772 */
/* iget-boolean v4, p0, Lapp/Pool;->m_playSolids:Z */
/* if-nez v4, :cond_1 */
/* iget v4, p0, Lapp/Pool;->m_game:I */
/* if-nez v4, :cond_9 */
/* iget-boolean v4, p0, Lapp/Pool;->m_playSolids:Z */
/* if-nez v4, :cond_9 */
/* iget-boolean v4, p0, Lapp/Pool;->m_playStripes:Z */
/* if-nez v4, :cond_9 */
/* .line 3773 */
} // :cond_1
v4 = this.m_score1;
final String v5 = "Solids "; // const-string v5, "Solids "
(( v.Vtext ) v4 ).setText ( v5 ); // invoke-virtual {v4, v5}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 3774 */
v4 = this.m_score2;
final String v5 = "Stripes "; // const-string v5, "Stripes "
(( v.Vtext ) v4 ).setText ( v5 ); // invoke-virtual {v4, v5}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 3784 */
} // :goto_4
return;
} // .end local v1 # "op":I
} // .end local v2 # "score":I
} // .end local v3 # "score2":I
} // :cond_2
/* move v4, v6 */
/* .line 3743 */
} // :cond_3
/* move v4, v6 */
/* .line 3744 */
} // :cond_4
/* move v4, v6 */
/* .line 3745 */
/* .line 3751 */
/* .restart local v1 # "op":I */
} // :cond_5
/* if-ne v1, v7, :cond_6 */
/* .line 3752 */
/* const/16 v4, 0x23 */
/* iput v4, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3753 */
} // :cond_6
/* if-ne v1, v8, :cond_7 */
/* .line 3754 */
/* const/16 v4, 0x26 */
/* iput v4, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3755 */
} // :cond_7
int v4 = 4; // const/4 v4, 0x4
/* if-ne v1, v4, :cond_8 */
/* .line 3756 */
/* const/16 v4, 0x29 */
/* iput v4, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3758 */
} // :cond_8
/* iput v6, p0, Lapp/Pool;->m_opicbase:I */
/* .line 3776 */
/* .restart local v2 # "score":I */
/* .restart local v3 # "score2":I */
} // :cond_9
/* iget-boolean v4, p0, Lapp/Pool;->m_playStripes:Z */
if ( v4 != null) { // if-eqz v4, :cond_a
/* .line 3777 */
v4 = this.m_score1;
final String v5 = "Stripes "; // const-string v5, "Stripes "
(( v.Vtext ) v4 ).setText ( v5 ); // invoke-virtual {v4, v5}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 3778 */
v4 = this.m_score2;
final String v5 = "Solids "; // const-string v5, "Solids "
(( v.Vtext ) v4 ).setText ( v5 ); // invoke-virtual {v4, v5}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 3781 */
} // :cond_a
v4 = this.m_score1;
final String v5 = ""; // const-string v5, ""
(( v.Vtext ) v4 ).setText ( v9 ); // invoke-virtual {v4, v9}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 3782 */
v4 = this.m_score2;
final String v5 = ""; // const-string v5, ""
(( v.Vtext ) v4 ).setText ( v9 ); // invoke-virtual {v4, v9}, Lv/Vtext;->setText(Ljava/lang/String;)V
} // .end method
void prompt ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 3840 */
v0 = this.m_prompt;
(( v.Vtext ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 3841 */
v0 = this.m_prompt;
int v1 = 0; // const/4 v1, 0x0
(( v.Vtext ) v0 ).setField ( v1 ); // invoke-virtual {v0, v1}, Lv/Vtext;->setField(Ljava/lang/StringBuffer;)V
/* .line 3842 */
v0 = this.m_prompt;
/* iget v1, p0, Lapp/Pool;->m_width:I */
v2 = this.m_prompt;
v2 = (( v.Vtext ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lv/Vtext;->getWidth()I
/* sub-int/2addr v1, v2 */
/* shr-int/lit8 v1, v1, 0x1 */
int v2 = 4; // const/4 v2, 0x4
(( v.Vtext ) v0 ).setXyi ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vtext;->setXyi(II)V
/* .line 3843 */
v0 = this.m_prompt;
v0 = (( v.Vtext ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lv/Vtext;->isLinked()Z
/* if-nez v0, :cond_0 */
/* .line 3844 */
v0 = this.m_prompt;
(( app.Pool ) p0 ).addTail ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->addTail(Lv/Vsprite;)V
/* .line 3845 */
} // :cond_0
return;
} // .end method
void prompt ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "s" # Ljava/lang/String; */
/* .param p2, "n" # I */
/* .prologue */
/* .line 3848 */
(( app.Pool ) p0 ).prompt ( p1 ); // invoke-virtual {p0, p1}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 3849 */
v0 = this.m_prompt;
(( v.Vtext ) v0 ).setNumber ( p2 ); // invoke-virtual {v0, p2}, Lv/Vtext;->setNumber(I)V
/* .line 3850 */
return;
} // .end method
void resume ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
/* .line 3857 */
/* iget-boolean v0, p0, Lapp/Pool;->m_player:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
(( app.Pool ) p0 ).setAspect ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->setAspect(Z)V
/* .line 3859 */
v0 = this.m_table;
(( app.Pool ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 3861 */
v0 = this.m_cue;
v1 = this.m_cueball;
/* iget v1, v1, Lapp/Ball;->m_wx:I */
/* const v2, 0xb000 */
v3 = this.m_cueball;
/* iget v3, v3, Lapp/Ball;->m_wz:I */
(( v.Vsprite ) v0 ).setWxyz ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vsprite;->setWxyz(III)V
/* .line 3863 */
/* iget-boolean v0, p0, Lapp/Pool;->m_player:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3864 */
int v0 = 4; // const/4 v0, 0x4
v0 = (( app.Pool ) p0 ).prefRead ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->prefRead(I)I
(( app.Pool ) p0 ).cueRotate ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->cueRotate(I)V
/* .line 3866 */
} // :cond_0
/* iget-boolean v0, p0, Lapp/Pool;->m_player:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3867 */
/* iget v0, p0, Lapp/Pool;->m_cueAngle:I */
/* iput v0, p0, Lapp/Pool;->m_heading:I */
/* .line 3869 */
} // :cond_1
v0 = this.m_cue;
(( app.Pool ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 3871 */
v0 = this.m_score1;
(( app.Pool ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 3873 */
/* iget v0, p0, Lapp/Pool;->m_game:I */
/* if-eq v0, v4, :cond_2 */
/* .line 3874 */
v0 = this.m_score2;
(( app.Pool ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 3876 */
} // :cond_2
(( app.Pool ) p0 ).turn ( ); // invoke-virtual {p0}, Lapp/Pool;->turn()V
/* .line 3878 */
/* iget-boolean v0, p0, Lapp/Pool;->m_player:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 3880 */
(( app.Pool ) p0 ).lookAt0 ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt0()V
/* .line 3885 */
} // :goto_1
/* iput-boolean v4, p0, Lapp/Pool;->m_started:Z */
/* .line 3886 */
return;
} // :cond_3
/* move v0, v4 */
/* .line 3857 */
/* .line 3883 */
} // :cond_4
(( app.Pool ) p0 ).breakViewSettings ( ); // invoke-virtual {p0}, Lapp/Pool;->breakViewSettings()V
} // .end method
public void run ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 3889 */
(( app.Pool ) p0 ).initOnce ( ); // invoke-virtual {p0}, Lapp/Pool;->initOnce()V
/* .line 3892 */
/* const/16 v0, 0x190 */
(( app.Pool ) p0 ).waitKey ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->waitKey(I)V
/* .line 3895 */
v0 = (( app.Pool ) p0 ).gameOver ( ); // invoke-virtual {p0}, Lapp/Pool;->gameOver()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3896 */
(( app.Pool ) p0 ).breakView ( ); // invoke-virtual {p0}, Lapp/Pool;->breakView()V
/* .line 3901 */
} // :goto_0
(( app.Pool ) p0 ).menuMain ( v1, v1 ); // invoke-virtual {p0, v1, v1}, Lapp/Pool;->menuMain(ZZ)V
/* .line 3903 */
(( app.Pool ) p0 ).play ( ); // invoke-virtual {p0}, Lapp/Pool;->play()V
/* .line 3905 */
(( app.Pool ) p0 ).prefSave ( ); // invoke-virtual {p0}, Lapp/Pool;->prefSave()V
/* .line 3907 */
(( app.Pool ) p0 ).destroy ( ); // invoke-virtual {p0}, Lapp/Pool;->destroy()V
/* .line 3909 */
v0 = this.m_display;
/* .line 3910 */
return;
/* .line 3898 */
} // :cond_0
(( app.Pool ) p0 ).resume ( ); // invoke-virtual {p0}, Lapp/Pool;->resume()V
} // .end method
void score ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "player" # Z */
/* .prologue */
/* .line 3913 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3914 */
/* iget v0, p0, Lapp/Pool;->m_scoredif:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lapp/Pool;->m_scoredif:I */
/* .line 3915 */
v0 = this.m_score1;
(( v.Vtext ) v0 ).increment ( ); // invoke-virtual {v0}, Lv/Vtext;->increment()V
/* .line 3922 */
} // :goto_0
return;
/* .line 3918 */
} // :cond_0
/* iget v0, p0, Lapp/Pool;->m_scoredif:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lapp/Pool;->m_scoredif:I */
/* .line 3919 */
v0 = this.m_score2;
(( v.Vtext ) v0 ).increment ( ); // invoke-virtual {v0}, Lv/Vtext;->increment()V
/* .line 3920 */
(( app.Pool ) p0 ).score2Layout ( ); // invoke-virtual {p0}, Lapp/Pool;->score2Layout()V
} // .end method
void score2Layout ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 4; // const/4 v3, 0x4
/* .line 3925 */
/* iget v0, p0, Lapp/Pool;->m_game:I */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lapp/Pool;->m_playSolids:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lapp/Pool;->m_playStripes:Z */
/* if-nez v0, :cond_0 */
/* .line 3927 */
v0 = this.m_score2;
v1 = this.m_score1;
/* iget v1, v1, Lv/Vtext;->m_height:I */
/* add-int/lit8 v1, v1, 0x4 */
(( v.Vtext ) v0 ).setXyi ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Lv/Vtext;->setXyi(II)V
/* .line 3931 */
} // :goto_0
return;
/* .line 3929 */
} // :cond_0
v0 = this.m_score2;
/* iget v1, p0, Lapp/Pool;->m_width:I */
v2 = this.m_score2;
/* iget v2, v2, Lv/Vtext;->m_width:I */
/* sub-int/2addr v1, v2 */
/* sub-int/2addr v1, v3 */
(( v.Vtext ) v0 ).setXyi ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Lv/Vtext;->setXyi(II)V
} // .end method
v.Vtext scoreCard ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "title" # Ljava/lang/String; */
/* .prologue */
/* .line 3947 */
/* new-instance v0, Lv/Vtext; */
/* invoke-direct {v0, p1}, Lv/Vtext;-><init>(Ljava/lang/String;)V */
/* .line 3952 */
/* .local v0, "t":Lv/Vtext; */
int v1 = 2; // const/4 v1, 0x2
(( v.Vtext ) v0 ).setFieldWidth ( v1 ); // invoke-virtual {v0, v1}, Lv/Vtext;->setFieldWidth(I)V
/* .line 3953 */
} // .end method
void scoreDecrement ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "player" # Z */
/* .prologue */
/* .line 3934 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3935 */
v0 = this.m_score1;
(( v.Vtext ) v0 ).decrement ( ); // invoke-virtual {v0}, Lv/Vtext;->decrement()V
/* .line 3936 */
/* iget v0, p0, Lapp/Pool;->m_scoredif:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lapp/Pool;->m_scoredif:I */
/* .line 3943 */
} // :goto_0
return;
/* .line 3939 */
} // :cond_0
v0 = this.m_score2;
(( v.Vtext ) v0 ).decrement ( ); // invoke-virtual {v0}, Lv/Vtext;->decrement()V
/* .line 3940 */
(( app.Pool ) p0 ).score2Layout ( ); // invoke-virtual {p0}, Lapp/Pool;->score2Layout()V
/* .line 3941 */
/* iget v0, p0, Lapp/Pool;->m_scoredif:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lapp/Pool;->m_scoredif:I */
} // .end method
public Boolean screenResize ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 3962 */
v0 = /* invoke-super {p0}, Lv/V3dView;->screenResize()Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 3963 */
/* iget-boolean v0, p0, Lapp/Pool;->m_breakView:Z */
(( app.Pool ) p0 ).setAspect ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->setAspect(Z)V
/* .line 3965 */
v0 = this.m_score2;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3966 */
(( app.Pool ) p0 ).score2Layout ( ); // invoke-virtual {p0}, Lapp/Pool;->score2Layout()V
/* .line 3969 */
} // :cond_0
/* iget-boolean v0, p0, Lapp/Pool;->m_player:Z */
/* if-nez v0, :cond_1 */
v0 = this.m_opponent;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3970 */
/* const/16 v0, 0x20 */
(( app.Pool ) p0 ).opShow ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->opShow(I)V
/* .line 3972 */
} // :cond_1
v0 = this.m_menu;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.m_menu;
v0 = (( v.Vmenu ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lv/Vmenu;->isLinked()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 3973 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* .line 3975 */
} // :cond_2
v0 = this.m_prompt;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.m_prompt;
v0 = (( v.Vtext ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lv/Vtext;->isLinked()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 3976 */
v0 = this.m_prompt;
/* iget v1, p0, Lapp/Pool;->m_width:I */
v2 = this.m_prompt;
v2 = (( v.Vtext ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lv/Vtext;->getWidth()I
/* sub-int/2addr v1, v2 */
/* shr-int/lit8 v1, v1, 0x1 */
(( v.Vtext ) v0 ).setXyi ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Lv/Vtext;->setXyi(II)V
/* .line 3979 */
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
/* .line 3981 */
} // :goto_0
} // :cond_4
/* move v0, v3 */
} // .end method
void select ( Object p0 ) {
/* .locals 12 */
/* .param p1, "key" # C */
/* .prologue */
int v11 = 5; // const/4 v11, 0x5
int v10 = 0; // const/4 v10, 0x0
/* .line 3987 */
/* iget-boolean v7, p0, Lapp/Pool;->m_player:Z */
if ( v7 != null) { // if-eqz v7, :cond_8
/* iget v7, p0, Lapp/Pool;->m_mousey:I */
if ( v7 != null) { // if-eqz v7, :cond_8
/* .line 3990 */
(( app.Pool ) p0 ).mouseToWorld ( ); // invoke-virtual {p0}, Lapp/Pool;->mouseToWorld()Lv/Vector;
/* .line 3993 */
/* .local v4, "v":Lv/Vector; */
int v7 = 0; // const/4 v7, 0x0
/* iget v8, v4, Lv/Vector;->m_x:I */
/* iget v9, v4, Lv/Vector;->m_z:I */
v2 = (( app.Pool ) p0 ).ballIntersect ( v7, v8, v9 ); // invoke-virtual {p0, v7, v8, v9}, Lapp/Pool;->ballIntersect(Lapp/Ball;II)I
/* .line 3994 */
/* .local v2, "i":I */
int v7 = -1; // const/4 v7, -0x1
/* if-eq v2, v7, :cond_2 */
/* .line 3995 */
final String v7 = "Ball "; // const-string v7, "Ball "
/* add-int/lit8 v8, v2, 0x1 */
(( app.Pool ) p0 ).prompt ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lapp/Pool;->prompt(Ljava/lang/String;I)V
/* .line 3999 */
} // :goto_0
/* iget v7, v4, Lv/Vector;->m_x:I */
v8 = this.m_cueball;
/* iget v8, v8, Lapp/Ball;->m_wx:I */
/* sub-int v5, v7, v8 */
/* .line 4000 */
/* .local v5, "x":I */
/* iget v7, v4, Lv/Vector;->m_z:I */
v8 = this.m_cueball;
/* iget v8, v8, Lapp/Ball;->m_wz:I */
/* sub-int v6, v7, v8 */
/* .line 4002 */
/* .local v6, "y":I */
v0 = (( app.Pool ) p0 ).fatan2 ( v5, v6 ); // invoke-virtual {p0, v5, v6}, Lapp/Pool;->fatan2(II)I
/* .line 4004 */
/* .local v0, "a":I */
/* iget v7, p0, Lapp/Pool;->m_cueAngle:I */
/* sub-int/2addr v7, v0 */
/* and-int/lit16 v1, v7, 0x7fff */
/* .line 4009 */
/* .local v1, "d":I */
/* iget v7, v4, Lv/Vector;->m_x:I */
/* const v8, -0x247000 */
/* if-lt v7, v8, :cond_0 */
/* iget v7, v4, Lv/Vector;->m_x:I */
/* const v8, 0x247000 */
/* if-gt v7, v8, :cond_0 */
/* .line 4010 */
/* iget v7, v4, Lv/Vector;->m_z:I */
/* const v8, -0x307000 */
/* if-lt v7, v8, :cond_0 */
/* iget v7, v4, Lv/Vector;->m_z:I */
/* const v8, 0x307000 */
/* if-le v7, v8, :cond_5 */
/* .line 4015 */
} // :cond_0
} // :goto_1
v7 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
if ( v7 != null) { // if-eqz v7, :cond_1
v7 = (( app.Pool ) p0 ).keyDown ( v11 ); // invoke-virtual {p0, v11}, Lapp/Pool;->keyDown(C)Z
/* if-nez v7, :cond_3 */
/* .line 4090 */
} // .end local v0 # "a":I
} // .end local v1 # "d":I
} // .end local v2 # "i":I
} // .end local v4 # "v":Lv/Vector;
} // .end local v5 # "x":I
} // .end local v6 # "y":I
} // :cond_1
} // :goto_2
return;
/* .line 3997 */
/* .restart local v2 # "i":I */
/* .restart local v4 # "v":Lv/Vector; */
} // :cond_2
v7 = this.m_prompt;
(( v.Vtext ) v7 ).off ( ); // invoke-virtual {v7}, Lv/Vtext;->off()V
/* .line 4016 */
/* .restart local v0 # "a":I */
/* .restart local v1 # "d":I */
/* .restart local v5 # "x":I */
/* .restart local v6 # "y":I */
} // :cond_3
(( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
/* .line 4017 */
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* .line 4019 */
/* iget v7, p0, Lapp/Pool;->m_dragy:I */
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 4020 */
/* iget v7, p0, Lapp/Pool;->m_dragy:I */
/* neg-int v7, v7 */
/* mul-int/lit8 v7, v7, 0x10 */
(( app.Pool ) p0 ).pitch ( v7 ); // invoke-virtual {p0, v7}, Lapp/Pool;->pitch(I)V
/* .line 4021 */
/* iput v10, p0, Lapp/Pool;->m_dragy:I */
/* .line 4024 */
} // :cond_4
/* iget v7, p0, Lapp/Pool;->m_dragx:I */
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 4032 */
/* iget v7, p0, Lapp/Pool;->m_heading:I */
/* iget v8, p0, Lapp/Pool;->m_dragx:I */
/* mul-int/lit8 v8, v8, 0x10 */
/* sub-int/2addr v7, v8 */
/* iput v7, p0, Lapp/Pool;->m_heading:I */
/* .line 4033 */
(( app.Pool ) p0 ).lookAt ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt()V
/* .line 4035 */
/* iput v10, p0, Lapp/Pool;->m_dragx:I */
/* .line 4052 */
} // :cond_5
/* const/16 v7, 0x3719 */
/* if-lt v1, v7, :cond_6 */
/* const/16 v7, 0x48df */
/* if-le v1, v7, :cond_8 */
/* .line 4053 */
} // :cond_6
/* iget v7, v4, Lv/Vector;->m_y:I */
/* const/16 v8, -0x8000 */
/* if-lt v7, v8, :cond_8 */
/* iget v7, v4, Lv/Vector;->m_y:I */
/* const v8, 0x18000 */
/* if-ge v7, v8, :cond_8 */
/* .line 4054 */
v7 = app.Pool .fdist ( v5,v6 );
/* const/high16 v8, 0x40000 */
/* if-le v7, v8, :cond_8 */
/* .line 4059 */
/* iput v10, p0, Lapp/Pool;->m_cueAngle:I */
/* .line 4061 */
(( app.Pool ) p0 ).cueRotate ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->cueRotate(I)V
/* .line 4064 */
/* iget v7, p0, Lapp/Pool;->m_cueAngle:I */
/* iput v7, p0, Lapp/Pool;->m_heading:I */
/* .line 4065 */
/* iget-boolean v7, p0, Lapp/Pool;->m_breakView:Z */
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 4066 */
(( app.Pool ) p0 ).lookAt0 ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt0()V
/* .line 4070 */
} // :goto_3
/* sget-boolean v7, Lv/Vmenu;->m_mouse:Z */
/* if-nez v7, :cond_1 */
/* .line 4074 */
v3 = v7 = this.m_display;
/* .line 4075 */
/* .local v3, "t0":I */
} // :cond_7
v7 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
/* if-nez v7, :cond_a */
/* .line 4089 */
} // .end local v0 # "a":I
} // .end local v1 # "d":I
} // .end local v2 # "i":I
} // .end local v3 # "t0":I
} // .end local v4 # "v":Lv/Vector;
} // .end local v5 # "x":I
} // .end local v6 # "y":I
} // :cond_8
} // :goto_4
(( app.Pool ) p0 ).cueShoot ( p1 ); // invoke-virtual {p0, p1}, Lapp/Pool;->cueShoot(C)V
/* .line 4068 */
/* .restart local v0 # "a":I */
/* .restart local v1 # "d":I */
/* .restart local v2 # "i":I */
/* .restart local v4 # "v":Lv/Vector; */
/* .restart local v5 # "x":I */
/* .restart local v6 # "y":I */
} // :cond_9
(( app.Pool ) p0 ).lookAt ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt()V
/* .line 4076 */
/* .restart local v3 # "t0":I */
} // :cond_a
(( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
/* .line 4077 */
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* .line 4079 */
v7 = (( app.Pool ) p0 ).keyDown ( v11 ); // invoke-virtual {p0, v11}, Lapp/Pool;->keyDown(C)Z
if ( v7 != null) { // if-eqz v7, :cond_1
/* .line 4082 */
v7 = v7 = this.m_display;
/* sub-int/2addr v7, v3 */
/* const/16 v8, 0xc8 */
/* if-le v7, v8, :cond_7 */
} // .end method
void setAspect ( Boolean p0 ) {
/* .locals 6 */
/* .param p1, "breakview" # Z */
/* .prologue */
/* const/16 v5, 0x6000 */
/* const/16 v4, 0x4ccc */
/* const v3, 0x8000 */
/* .line 4094 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4102 */
/* const/high16 v1, 0x400000 */
/* iput v1, p0, Lapp/Pool;->m_camdist:I */
/* .line 4105 */
} // :cond_0
/* iget v1, p0, Lapp/Pool;->m_height:I */
/* mul-int/2addr v1, v3 */
/* iget v2, p0, Lapp/Pool;->m_width:I */
/* div-int v0, v1, v2 */
/* .line 4107 */
/* .local v0, "aspect":I */
/* const/16 v1, 0x5999 */
/* if-gt v0, v1, :cond_1 */
/* .line 4109 */
/* const/16 v1, 0x547a */
(( app.Pool ) p0 ).setHorizon ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->setHorizon(I)V
/* .line 4119 */
} // :goto_0
/* if-nez p1, :cond_4 */
/* .line 4133 */
} // :goto_1
return;
/* .line 4111 */
} // :cond_1
/* if-gt v0, v5, :cond_2 */
/* .line 4112 */
/* const/16 v1, 0x5c28 */
(( app.Pool ) p0 ).setHorizon ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->setHorizon(I)V
/* .line 4114 */
} // :cond_2
/* if-gt v0, v3, :cond_3 */
/* .line 4115 */
/* const/16 v1, 0x5333 */
(( app.Pool ) p0 ).setHorizon ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->setHorizon(I)V
/* .line 4117 */
} // :cond_3
(( app.Pool ) p0 ).setHorizon ( v4 ); // invoke-virtual {p0, v4}, Lapp/Pool;->setHorizon(I)V
/* .line 4122 */
} // :cond_4
/* if-ge v0, v4, :cond_5 */
/* .line 4123 */
/* const/16 v1, 0x71c */
/* iput v1, p0, Lapp/Pool;->m_pitch:I */
/* .line 4132 */
} // :goto_2
int v1 = 0; // const/4 v1, 0x0
/* const v2, 0xb000 */
/* const v3, -0x119400 */
(( app.Pool ) p0 ).lookAt ( v1, v2, v3 ); // invoke-virtual {p0, v1, v2, v3}, Lapp/Pool;->lookAt(III)V
/* .line 4124 */
} // :cond_5
/* if-ge v0, v5, :cond_6 */
/* .line 4125 */
/* const/16 v1, 0x999 */
/* iput v1, p0, Lapp/Pool;->m_pitch:I */
/* .line 4127 */
} // :cond_6
/* if-ge v0, v3, :cond_7 */
/* .line 4128 */
/* const/16 v1, 0xaaa */
/* iput v1, p0, Lapp/Pool;->m_pitch:I */
/* .line 4130 */
} // :cond_7
/* const/16 v1, 0xc16 */
/* iput v1, p0, Lapp/Pool;->m_pitch:I */
} // .end method
void setCameraMatrix ( ) {
/* .locals 2 */
/* .prologue */
/* .line 4136 */
/* move-object v0, p0 */
/* .line 4137 */
/* .local v0, "m":Lv/Vmat; */
(( v.Vmat ) v0 ).identity ( ); // invoke-virtual {v0}, Lv/Vmat;->identity()V
/* .line 4138 */
/* iget v1, p0, Lapp/Pool;->m_pitch:I */
(( v.Vmat ) v0 ).rotateX ( v1 ); // invoke-virtual {v0, v1}, Lv/Vmat;->rotateX(I)V
/* .line 4139 */
/* iget v1, p0, Lapp/Pool;->m_heading:I */
(( v.Vmat ) v0 ).rotateY ( v1 ); // invoke-virtual {v0, v1}, Lv/Vmat;->rotateY(I)V
/* .line 4140 */
return;
} // .end method
void shadowBall ( v.Vsprite p0 ) {
/* .locals 26 */
/* .param p1, "p" # Lv/Vsprite; */
/* .prologue */
/* .line 4148 */
final String v5 = "shadow"; // const-string v5, "shadow"
v.V3dModel .lookupMaterial ( v5 );
/* .line 4149 */
/* .local v23, "m":Lv/V3dMaterial; */
/* if-nez v23, :cond_0 */
/* .line 4150 */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object v5, v0 */
/* const/16 v6, 0xf */
(( v.Vilib ) v5 ).loadPicture ( v6 ); // invoke-virtual {v5, v6}, Lv/Vilib;->loadPicture(I)Lv/Vpicture;
/* .line 4151 */
/* .local v24, "pic":Lv/Vpicture; */
/* move-object/from16 v0, v24 */
v0 = this.m_rgb;
/* move-object v6, v0 */
/* .line 4155 */
/* .local v6, "rgb":[I */
/* move-object v0, v6 */
/* array-length v0, v0 */
/* move/from16 v22, v0 */
/* .line 4156 */
/* .local v22, "i":I */
} // :goto_0
/* add-int/lit8 v22, v22, -0x1 */
/* if-gez v22, :cond_2 */
/* .line 4160 */
/* new-instance v4, Lv/V3dTexture; */
/* invoke-direct {v4}, Lv/V3dTexture;-><init>()V */
/* .line 4161 */
/* .local v4, "t":Lv/V3dTexture; */
final String v5 = "shadow"; // const-string v5, "shadow"
/* const/16 v7, 0x20 */
/* const/16 v8, 0x20 */
int v9 = 1; // const/4 v9, 0x1
/* invoke-virtual/range {v4 ..v9}, Lv/V3dTexture;->set(Ljava/lang/String;[IIIZ)V */
/* .line 4163 */
final String v5 = "shadow"; // const-string v5, "shadow"
v.V3dModel .addMaterial ( v5 );
/* .line 4164 */
/* move-object v0, v4 */
/* move-object/from16 v1, v23 */
this.m_texture = v0;
/* .line 4167 */
} // .end local v4 # "t":Lv/V3dTexture;
} // .end local v6 # "rgb":[I
} // .end local v22 # "i":I
} // .end local v24 # "pic":Lv/Vpicture;
} // :cond_0
/* move-object/from16 v0, p0 */
v0 = this.m_shadowDecal;
/* move-object v7, v0 */
/* .line 4168 */
/* .local v7, "d":Lv/Vdecal; */
/* if-nez v7, :cond_1 */
/* .line 4169 */
/* new-instance v7, Lv/Vdecal; */
} // .end local v7 # "d":Lv/Vdecal;
/* invoke-direct {v7}, Lv/Vdecal;-><init>()V */
/* .line 4170 */
/* .restart local v7 # "d":Lv/Vdecal; */
/* move-object v0, v7 */
/* move-object/from16 v1, p0 */
this.m_shadowDecal = v0;
/* .line 4171 */
/* const/high16 v8, 0x10000 */
/* move-object/from16 v0, v23 */
/* iget v0, v0, Lv/V3dMaterial;->m_mati:I */
/* move v9, v0 */
/* .line 4172 */
/* const v10, -0x9000 */
int v11 = 0; // const/4 v11, 0x0
/* const v12, 0x9000 */
/* .line 4173 */
/* const v13, -0x9000 */
int v14 = 0; // const/4 v14, 0x0
/* const v15, -0x9000 */
/* .line 4174 */
/* const v16, 0x9000 */
/* const/16 v17, 0x0 */
/* const v18, -0x9000 */
/* .line 4175 */
/* const v19, 0x9000 */
/* const/16 v20, 0x0 */
/* const v21, 0x9000 */
/* .line 4171 */
/* invoke-virtual/range {v7 ..v21}, Lv/Vdecal;->set(IIIIIIIIIIIIII)V */
/* .line 4178 */
} // :cond_1
/* new-instance v25, Lv/Vsprite; */
/* invoke-direct/range {v25 ..v25}, Lv/Vsprite;-><init>()V */
/* .line 4179 */
/* .local v25, "s":Lv/Vsprite; */
/* move-object v0, v7 */
/* move-object/from16 v1, v25 */
this.m_3dmodel = v0;
/* .line 4187 */
int v5 = 0; // const/4 v5, 0x0
/* const v6, -0x9000 */
int v7 = 0; // const/4 v7, 0x0
/* move-object/from16 v0, v25 */
/* move v1, v5 */
/* move v2, v6 */
/* move v3, v7 */
(( v.Vsprite ) v0 ).setWxyz ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vsprite;->setWxyz(III)V
/* .line 4189 */
} // .end local v7 # "d":Lv/Vdecal;
/* move-object/from16 v0, p1 */
/* move-object/from16 v1, v25 */
(( v.Vsprite ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lv/Vsprite;->add(Lv/Vsprite;)V
/* .line 4190 */
return;
/* .line 4157 */
} // .end local v25 # "s":Lv/Vsprite;
/* .restart local v6 # "rgb":[I */
/* .restart local v22 # "i":I */
/* .restart local v24 # "pic":Lv/Vpicture; */
} // :cond_2
/* aget v5, v6, v22 */
/* shl-int/lit8 v5, v5, 0x18 */
/* aput v5, v6, v22 */
} // .end method
Integer simulate ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 21 */
/* .param p1, "x" # I */
/* .param p2, "z" # I */
/* .param p3, "dist" # I */
/* .prologue */
/* .line 4199 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_level:I */
/* move/from16 v17, v0 */
/* const/16 v18, 0x3 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_0 */
/* move/from16 v17, p3 */
/* .line 4354 */
} // :goto_0
/* .line 4202 */
} // :cond_0
/* move-object/from16 v0, p0 */
v0 = this.m_physics;
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x1 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, v17 */
/* iput-boolean v0, v1, Lv/Vphysics;->m_noAngularUpdate:Z */
/* .line 4204 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v17, v0 */
/* const/16 v18, 0x3 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-eq v0, v1, :cond_6 */
/* const/16 v17, 0x1 */
/* move/from16 v13, v17 */
/* .line 4206 */
/* .local v13, "nballHit":Z */
} // :goto_1
/* move/from16 v15, p3 */
/* .line 4209 */
/* .local v15, "score":I */
/* shr-int/lit8 v17, p3, 0x2 */
/* add-int v17, v17, p3 */
/* const/high16 v18, 0x40000 */
/* add-int v10, v17, v18 */
/* .line 4211 */
/* .local v10, "d":I */
/* const/high16 v17, 0x600000 */
/* move v0, v10 */
/* move/from16 v1, v17 */
/* if-le v0, v1, :cond_1 */
/* .line 4212 */
/* const/high16 v10, 0x600000 */
/* .line 4214 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v17, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v17 */
/* move/from16 v2, p1 */
/* move/from16 v3, p2 */
v4 = (( app.Pool ) v0 ).angleBetween ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lapp/Pool;->angleBetween(Lv/Vsprite;II)I
/* .line 4228 */
/* .local v4, "a":I */
v16 = app.Pool .fsin ( v4 );
/* .line 4229 */
/* .local v16, "sin":I */
v9 = app.Pool .fcos ( v4 );
/* .line 4231 */
/* .local v9, "cos":I */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v17, v0 */
/* .line 4232 */
/* move/from16 v0, v16 */
/* move v1, v10 */
v18 = app.Pool .fmul ( v0,v1 );
/* .line 4233 */
/* const/16 v19, 0x0 */
/* .line 4234 */
v20 = app.Pool .fmul ( v9,v10 );
/* .line 4231 */
/* invoke-virtual/range {v17 ..v20}, Lapp/Ball;->setVelocity(III)V */
/* .line 4238 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_spindx:I */
/* move/from16 v17, v0 */
if ( v17 != null) { // if-eqz v17, :cond_7
/* .line 4239 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_spindx:I */
/* move/from16 v17, v0 */
/* mul-int v17, v17, v9 */
/* shr-int/lit8 v18, v10, 0x2 */
v17 = /* invoke-static/range {v17 ..v18}, Lapp/Pool;->fmul(II)I */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinx:I */
/* .line 4240 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_spindx:I */
/* move/from16 v17, v0 */
/* mul-int v17, v17, v16 */
/* shr-int/lit8 v18, v10, 0x2 */
v17 = /* invoke-static/range {v17 ..v18}, Lapp/Pool;->fmul(II)I */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinz:I */
/* .line 4258 */
} // :cond_2
} // :goto_2
/* move-object/from16 v0, p0 */
v0 = this.m_physics;
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x64 */
/* invoke-virtual/range {v17 ..v18}, Lv/Vphysics;->step(I)V */
/* .line 4265 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v17, v0 */
v8 = /* invoke-virtual/range {v17 ..v17}, Lapp/Ball;->moved()Z */
/* .line 4267 */
/* .local v8, "change":Z */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v17, v0 */
v17 = /* invoke-virtual/range {v17 ..v17}, Lapp/Ball;->sunk()Z */
if ( v17 != null) { // if-eqz v17, :cond_3
/* .line 4269 */
/* const v15, 0x7fffffff */
/* .line 4273 */
} // :cond_3
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, v17 */
/* iput-boolean v0, v1, Lapp/Ball;->m_bounced:Z */
/* .line 4275 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v17, v0 */
/* move-object/from16 v0, v17 */
/* iget-boolean v0, v0, Lapp/Ball;->m_collided:Z */
/* move/from16 v17, v0 */
if ( v17 != null) { // if-eqz v17, :cond_4
/* .line 4276 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->spin()V */
/* .line 4278 */
/* move-object/from16 v0, p0 */
v0 = this.m_cueball;
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, v17 */
/* iput-boolean v0, v1, Lapp/Ball;->m_collided:Z */
/* .line 4280 */
int v11 = 0; // const/4 v11, 0x0
/* .local v11, "i":I */
} // :goto_3
/* const/16 v17, 0xf */
/* move v0, v11 */
/* move/from16 v1, v17 */
/* if-lt v0, v1, :cond_8 */
/* .line 4297 */
} // .end local v11 # "i":I
} // :cond_4
int v7 = 0; // const/4 v7, 0x0
/* .local v7, "bi":I */
} // :goto_4
/* const/16 v17, 0xf */
/* move v0, v7 */
/* move/from16 v1, v17 */
/* if-lt v0, v1, :cond_a */
/* .line 4339 */
if ( v8 != null) { // if-eqz v8, :cond_5
/* const v17, 0x7fffffff */
/* move v0, v15 */
/* move/from16 v1, v17 */
/* if-ne v0, v1, :cond_2 */
/* .line 4341 */
} // :cond_5
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->prefBallRestore1()V */
/* .line 4343 */
/* move-object/from16 v0, p0 */
v0 = this.m_physics;
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, v17 */
/* iput-boolean v0, v1, Lv/Vphysics;->m_noAngularUpdate:Z */
/* move/from16 v17, v15 */
/* .line 4354 */
/* goto/16 :goto_0 */
/* .line 4204 */
} // .end local v4 # "a":I
} // .end local v7 # "bi":I
} // .end local v8 # "change":Z
} // .end local v9 # "cos":I
} // .end local v10 # "d":I
} // .end local v13 # "nballHit":Z
} // .end local v15 # "score":I
} // .end local v16 # "sin":I
} // :cond_6
/* const/16 v17, 0x0 */
/* move/from16 v13, v17 */
/* goto/16 :goto_1 */
/* .line 4242 */
/* .restart local v4 # "a":I */
/* .restart local v9 # "cos":I */
/* .restart local v10 # "d":I */
/* .restart local v13 # "nballHit":Z */
/* .restart local v15 # "score":I */
/* .restart local v16 # "sin":I */
} // :cond_7
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_spindy:I */
/* move/from16 v17, v0 */
if ( v17 != null) { // if-eqz v17, :cond_2
/* .line 4243 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_spindy:I */
/* move/from16 v17, v0 */
/* mul-int v17, v17, v16 */
/* shr-int/lit8 v18, v10, 0x2 */
v17 = /* invoke-static/range {v17 ..v18}, Lapp/Pool;->fmul(II)I */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinx:I */
/* .line 4244 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_spindy:I */
/* move/from16 v17, v0 */
/* mul-int v17, v17, v9 */
/* shr-int/lit8 v18, v10, 0x2 */
v17 = /* invoke-static/range {v17 ..v18}, Lapp/Pool;->fmul(II)I */
/* move/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_spinz:I */
/* goto/16 :goto_2 */
/* .line 4281 */
/* .restart local v8 # "change":Z */
/* .restart local v11 # "i":I */
} // :cond_8
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v17, v0 */
/* aget-object v17, v17, v11 */
/* move-object/from16 v0, v17 */
/* iget-boolean v0, v0, Lapp/Ball;->m_collided:Z */
/* move/from16 v17, v0 */
if ( v17 != null) { // if-eqz v17, :cond_9
/* .line 4282 */
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v17, v0 */
/* aget-object v17, v17, v11 */
/* const/16 v18, 0x0 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, v17 */
/* iput-boolean v0, v1, Lapp/Ball;->m_collided:Z */
/* .line 4284 */
/* if-nez v13, :cond_9 */
/* .line 4286 */
int v13 = 1; // const/4 v13, 0x1
/* .line 4287 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_9ballNext:I */
/* move/from16 v17, v0 */
/* move v0, v11 */
/* move/from16 v1, v17 */
/* if-eq v0, v1, :cond_9 */
/* .line 4289 */
/* const v15, 0x7fffffff */
/* .line 4280 */
} // :cond_9
/* add-int/lit8 v11, v11, 0x1 */
/* goto/16 :goto_3 */
/* .line 4298 */
} // .end local v11 # "i":I
/* .restart local v7 # "bi":I */
} // :cond_a
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v17, v0 */
/* aget-object v14, v17, v7 */
/* .line 4300 */
/* .local v14, "p":Lapp/Ball; */
v17 = (( app.Ball ) v14 ).moved ( ); // invoke-virtual {v14}, Lapp/Ball;->moved()Z
/* if-nez v17, :cond_c */
/* .line 4297 */
} // :cond_b
} // :goto_5
/* add-int/lit8 v7, v7, 0x1 */
/* goto/16 :goto_4 */
/* .line 4303 */
} // :cond_c
int v8 = 1; // const/4 v8, 0x1
/* .line 4305 */
/* const/16 v17, 0x0 */
/* move/from16 v0, v17 */
/* move-object v1, v14 */
/* iput-boolean v0, v1, Lapp/Ball;->m_bounced:Z */
/* .line 4306 */
/* const/16 v17, 0x0 */
/* move/from16 v0, v17 */
/* move-object v1, v14 */
/* iput-boolean v0, v1, Lapp/Ball;->m_collided:Z */
/* .line 4308 */
v17 = (( app.Ball ) v14 ).sunk ( ); // invoke-virtual {v14}, Lapp/Ball;->sunk()Z
if ( v17 != null) { // if-eqz v17, :cond_b
/* const v17, 0x7fffffff */
/* move v0, v15 */
/* move/from16 v1, v17 */
/* if-eq v0, v1, :cond_b */
/* .line 4309 */
/* shr-int/lit8 v15, v15, 0x1 */
/* .line 4311 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v17, v0 */
/* if-nez v17, :cond_f */
/* .line 4312 */
/* const/16 v17, 0x7 */
/* move v0, v7 */
/* move/from16 v1, v17 */
/* if-ne v0, v1, :cond_b */
/* .line 4314 */
int v15 = 0; // const/4 v15, 0x0
/* .line 4316 */
int v5 = 0; // const/4 v5, 0x0
/* .line 4317 */
/* .local v5, "b0":I */
/* const/16 v6, 0x8 */
/* .line 4318 */
/* .local v6, "b1":I */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lapp/Pool;->m_playSolids:Z */
/* move/from16 v17, v0 */
if ( v17 != null) { // if-eqz v17, :cond_d
/* .line 4319 */
/* const/16 v5, 0xa */
/* .line 4320 */
/* const/16 v6, 0xf */
/* .line 4323 */
} // :cond_d
/* move v12, v5 */
/* .local v12, "j":I */
} // :goto_6
/* if-ge v12, v6, :cond_b */
/* .line 4324 */
/* move-object/from16 v0, p0 */
v0 = this.m_balls;
/* move-object/from16 v17, v0 */
/* aget-object v17, v17, v12 */
/* move-object/from16 v0, v17 */
v0 = this.m_parent;
/* move-object/from16 v17, v0 */
if ( v17 != null) { // if-eqz v17, :cond_e
/* .line 4326 */
/* const v15, 0x7fffffff */
/* .line 4327 */
/* .line 4323 */
} // :cond_e
/* add-int/lit8 v12, v12, 0x1 */
/* .line 4332 */
} // .end local v5 # "b0":I
} // .end local v6 # "b1":I
} // .end local v12 # "j":I
} // :cond_f
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_game:I */
/* move/from16 v17, v0 */
/* const/16 v18, 0x3 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-ne v0, v1, :cond_b */
/* .line 4333 */
/* const/16 v17, 0x8 */
/* move v0, v7 */
/* move/from16 v1, v17 */
/* if-ne v0, v1, :cond_b */
/* .line 4334 */
int v15 = 0; // const/4 v15, 0x0
} // .end method
void spin ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 4359 */
v0 = this.m_cueball;
v0 = this.m_velocity;
/* iget v1, p0, Lapp/Pool;->m_spinx:I */
/* iget v2, p0, Lapp/Pool;->m_spinz:I */
(( v.Vector ) v0 ).add ( v1, v3, v2 ); // invoke-virtual {v0, v1, v3, v2}, Lv/Vector;->add(III)V
/* .line 4360 */
/* iput v3, p0, Lapp/Pool;->m_spindx:I */
/* .line 4361 */
/* iput v3, p0, Lapp/Pool;->m_spindy:I */
/* .line 4362 */
/* iput v3, p0, Lapp/Pool;->m_spinx:I */
/* .line 4363 */
/* iput v3, p0, Lapp/Pool;->m_spinz:I */
/* .line 4364 */
return;
} // .end method
Boolean step ( ) {
/* .locals 14 */
/* .prologue */
int v13 = 3; // const/4 v13, 0x3
/* const/high16 v12, 0x60000 */
int v11 = 7; // const/4 v11, 0x7
int v10 = 0; // const/4 v10, 0x0
int v9 = 1; // const/4 v9, 0x1
/* .line 4371 */
(( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
/* .line 4373 */
v2 = (( app.Pool ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lapp/Pool;->keyGet()C
/* .line 4375 */
/* .local v2, "key":C */
int v6 = 5; // const/4 v6, 0x5
/* if-ne v2, v6, :cond_0 */
/* iget v6, p0, Lapp/Pool;->m_mousex:I */
if ( v6 != null) { // if-eqz v6, :cond_0
v6 = this.m_menu;
/* iget v6, v6, Lv/Vmenu;->m_square:I */
if ( v6 != null) { // if-eqz v6, :cond_0
v6 = this.m_menu;
/* iget v7, p0, Lapp/Pool;->m_mousex:I */
/* iget v8, p0, Lapp/Pool;->m_mousey:I */
v6 = (( v.Vmenu ) v6 ).pick ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Lv/Vmenu;->pick(II)Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 4376 */
(( app.Pool ) p0 ).click ( ); // invoke-virtual {p0}, Lapp/Pool;->click()V
/* .line 4377 */
int v2 = 6; // const/4 v2, 0x6
/* .line 4380 */
} // :cond_0
/* iput v10, p0, Lapp/Pool;->m_mousex:I */
/* .line 4381 */
/* iput v10, p0, Lapp/Pool;->m_mousey:I */
/* .line 4383 */
int v6 = 6; // const/4 v6, 0x6
/* if-eq v2, v6, :cond_1 */
/* const/16 v6, 0x30 */
/* if-eq v2, v6, :cond_1 */
/* const/16 v6, 0x8 */
/* if-ne v2, v6, :cond_2 */
/* .line 4387 */
} // :cond_1
/* const/16 v6, 0x8 */
/* if-ne v2, v6, :cond_4 */
/* move v6, v9 */
} // :goto_0
/* iget-boolean v7, p0, Lapp/Pool;->m_player:Z */
(( app.Pool ) p0 ).menuMain ( v6, v7 ); // invoke-virtual {p0, v6, v7}, Lapp/Pool;->menuMain(ZZ)V
/* .line 4391 */
} // :cond_2
v6 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
/* if-nez v6, :cond_3 */
/* .line 4392 */
/* iput-boolean v9, p0, Lapp/Pool;->m_reset:Z */
/* .line 4394 */
} // :cond_3
/* iget-boolean v6, p0, Lapp/Pool;->m_reset:Z */
if ( v6 != null) { // if-eqz v6, :cond_5
/* move v6, v10 */
/* .line 4575 */
} // :goto_1
} // :cond_4
/* move v6, v10 */
/* .line 4387 */
/* .line 4397 */
} // :cond_5
v6 = this.m_physics;
/* iget v7, p0, Lapp/Pool;->m_tlast:I */
(( v.Vphysics ) v6 ).step ( v7 ); // invoke-virtual {v6, v7}, Lv/Vphysics;->step(I)V
/* .line 4402 */
int v5 = 0; // const/4 v5, 0x0
/* .line 4404 */
/* .local v5, "snd":Z */
v6 = this.m_cueball;
v6 = (( app.Ball ) v6 ).sunk ( ); // invoke-virtual {v6}, Lapp/Ball;->sunk()Z
if ( v6 != null) { // if-eqz v6, :cond_9
/* .line 4405 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playScratch:Z */
/* .line 4407 */
final String v6 = "Scratch"; // const-string v6, "Scratch"
(( app.Pool ) p0 ).prompt ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 4409 */
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
if ( v6 != null) { // if-eqz v6, :cond_7
/* .line 4410 */
final String v6 = "bad_shot_3"; // const-string v6, "bad_shot_3"
(( app.Pool ) p0 ).sound ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 4462 */
} // :cond_6
} // :goto_2
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "bi":I */
} // :goto_3
/* const/16 v6, 0xf */
/* if-lt v0, v6, :cond_10 */
/* .line 4572 */
(( app.Pool ) p0 ).render ( ); // invoke-virtual {p0}, Lapp/Pool;->render()V
/* .line 4573 */
/* const/16 v6, 0x20 */
(( app.Pool ) p0 ).waitMs ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->waitMs(I)V
/* .line 4575 */
/* iget-boolean v6, p0, Lapp/Pool;->m_changed:Z */
/* .line 4412 */
} // .end local v0 # "bi":I
} // :cond_7
/* iget v6, p0, Lapp/Pool;->m_width:I */
/* const/16 v7, 0xb0 */
/* if-le v6, v7, :cond_8 */
/* .line 4413 */
/* const/16 v6, 0x22 */
(( app.Pool ) p0 ).opShow ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->opShow(I)V
/* .line 4414 */
} // :cond_8
final String v6 = "ball_sunk"; // const-string v6, "ball_sunk"
(( app.Pool ) p0 ).sound ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 4417 */
} // :cond_9
v6 = this.m_cueball;
/* iget-boolean v6, v6, Lapp/Ball;->m_collided:Z */
if ( v6 != null) { // if-eqz v6, :cond_e
/* .line 4419 */
(( app.Pool ) p0 ).spin ( ); // invoke-virtual {p0}, Lapp/Pool;->spin()V
/* .line 4421 */
int v3 = 1; // const/4 v3, 0x1
/* .line 4422 */
/* .local v3, "ncollide":I */
v6 = this.m_cueball;
/* iput-boolean v10, v6, Lapp/Ball;->m_collided:Z */
/* .line 4423 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_4
/* const/16 v6, 0xf */
/* if-lt v1, v6, :cond_a */
/* .line 4443 */
int v6 = 2; // const/4 v6, 0x2
/* if-gt v3, v6, :cond_d */
/* .line 4444 */
final String v6 = "ball2ball"; // const-string v6, "ball2ball"
/* const/16 v7, 0x1f4 */
(( app.Pool ) p0 ).soundBkg ( v6, v7 ); // invoke-virtual {p0, v6, v7}, Lapp/Pool;->soundBkg(Ljava/lang/String;I)V
/* .line 4448 */
} // :goto_5
int v5 = 1; // const/4 v5, 0x1
/* .line 4424 */
} // :cond_a
v6 = this.m_balls;
/* aget-object v6, v6, v1 */
/* iget-boolean v6, v6, Lapp/Ball;->m_collided:Z */
if ( v6 != null) { // if-eqz v6, :cond_c
/* .line 4425 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 4426 */
v6 = this.m_balls;
/* aget-object v6, v6, v1 */
/* iput-boolean v10, v6, Lapp/Ball;->m_collided:Z */
/* .line 4428 */
/* iget v6, p0, Lapp/Pool;->m_game:I */
/* if-ne v6, v13, :cond_c */
/* iget-boolean v6, p0, Lapp/Pool;->m_9ballHit:Z */
/* if-nez v6, :cond_c */
/* .line 4430 */
/* iput-boolean v9, p0, Lapp/Pool;->m_9ballHit:Z */
/* .line 4431 */
/* iget v6, p0, Lapp/Pool;->m_9ballNext:I */
/* if-eq v1, v6, :cond_c */
/* .line 4432 */
final String v6 = "Low Ball Foul"; // const-string v6, "Low Ball Foul"
(( app.Pool ) p0 ).prompt ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->prompt(Ljava/lang/String;)V
/* .line 4433 */
final String v6 = "bad_shot_3"; // const-string v6, "bad_shot_3"
(( app.Pool ) p0 ).sound ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 4434 */
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
/* if-nez v6, :cond_b */
/* .line 4435 */
/* const/16 v6, 0x22 */
(( app.Pool ) p0 ).opShow ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->opShow(I)V
/* .line 4436 */
} // :cond_b
/* iput-boolean v9, p0, Lapp/Pool;->m_9ballFoul:Z */
/* .line 4437 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playScratch:Z */
/* .line 4423 */
} // :cond_c
/* add-int/lit8 v1, v1, 0x1 */
/* .line 4446 */
} // :cond_d
final String v6 = "cue_break"; // const-string v6, "cue_break"
(( app.Pool ) p0 ).sound ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 4450 */
} // .end local v1 # "i":I
} // .end local v3 # "ncollide":I
} // :cond_e
v6 = this.m_cueball;
/* iget-boolean v6, v6, Lapp/Ball;->m_bounced:Z */
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 4451 */
(( app.Pool ) p0 ).spin ( ); // invoke-virtual {p0}, Lapp/Pool;->spin()V
/* .line 4454 */
/* if-nez v5, :cond_f */
v6 = this.m_cueball;
/* iget v6, v6, Lapp/Ball;->m_speed:I */
/* if-le v6, v12, :cond_f */
/* .line 4455 */
final String v6 = "ball_hit_rail"; // const-string v6, "ball_hit_rail"
/* const/16 v7, 0xbb8 */
(( app.Pool ) p0 ).soundBkg ( v6, v7 ); // invoke-virtual {p0, v6, v7}, Lapp/Pool;->soundBkg(Ljava/lang/String;I)V
/* .line 4459 */
} // :cond_f
v6 = this.m_cueball;
/* iput-boolean v10, v6, Lapp/Ball;->m_bounced:Z */
/* goto/16 :goto_2 */
/* .line 4463 */
/* .restart local v0 # "bi":I */
} // :cond_10
v6 = this.m_balls;
/* aget-object v4, v6, v0 */
/* .line 4464 */
/* .local v4, "p":Lapp/Ball; */
/* iget-boolean v6, v4, Lapp/Ball;->m_collided:Z */
if ( v6 != null) { // if-eqz v6, :cond_13
/* .line 4466 */
/* iput-boolean v10, v4, Lapp/Ball;->m_collided:Z */
/* .line 4468 */
/* if-nez v5, :cond_11 */
/* iget v6, v4, Lapp/Ball;->m_speed:I */
/* if-le v6, v12, :cond_11 */
/* .line 4469 */
int v5 = 1; // const/4 v5, 0x1
/* .line 4470 */
final String v6 = "ball2ball"; // const-string v6, "ball2ball"
/* const/16 v7, 0x1f4 */
(( app.Pool ) p0 ).soundBkg ( v6, v7 ); // invoke-virtual {p0, v6, v7}, Lapp/Pool;->soundBkg(Ljava/lang/String;I)V
/* .line 4485 */
} // :cond_11
} // :goto_6
v6 = (( app.Ball ) v4 ).sunk ( ); // invoke-virtual {v4}, Lapp/Ball;->sunk()Z
if ( v6 != null) { // if-eqz v6, :cond_12
/* .line 4493 */
final String v6 = "ball_sunk"; // const-string v6, "ball_sunk"
(( app.Pool ) p0 ).sound ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->sound(Ljava/lang/String;)V
/* .line 4495 */
/* iget v6, p0, Lapp/Pool;->m_pocketed:I */
/* shl-int v7, v9, v0 */
/* or-int/2addr v6, v7 */
/* iput v6, p0, Lapp/Pool;->m_pocketed:I */
/* .line 4497 */
/* iget v6, p0, Lapp/Pool;->m_game:I */
/* if-nez v6, :cond_22 */
/* .line 4498 */
/* if-ne v0, v11, :cond_15 */
/* .line 4500 */
/* iput-boolean v9, p0, Lapp/Pool;->m_play8ball:Z */
/* .line 4501 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playAgain:Z */
/* .line 4502 */
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
(( app.Pool ) p0 ).score ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->score(Z)V
/* .line 4564 */
} // :goto_7
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
/* if-nez v6, :cond_12 */
/* iget-boolean v6, p0, Lapp/Pool;->m_playScratch:Z */
/* if-nez v6, :cond_12 */
/* iget-boolean v6, p0, Lapp/Pool;->m_playAgain:Z */
if ( v6 != null) { // if-eqz v6, :cond_12
/* iget v6, p0, Lapp/Pool;->m_width:I */
/* const/16 v7, 0xb0 */
/* if-le v6, v7, :cond_12 */
/* .line 4565 */
/* const/16 v6, 0x21 */
(( app.Pool ) p0 ).opShow ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->opShow(I)V
/* .line 4462 */
} // :cond_12
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_3 */
/* .line 4473 */
} // :cond_13
/* iget-boolean v6, v4, Lapp/Ball;->m_bounced:Z */
if ( v6 != null) { // if-eqz v6, :cond_11
/* .line 4477 */
/* if-nez v5, :cond_14 */
/* iget v6, v4, Lapp/Ball;->m_speed:I */
/* if-le v6, v12, :cond_14 */
/* .line 4478 */
final String v6 = "ball_hit_rail"; // const-string v6, "ball_hit_rail"
/* const/16 v7, 0xbb8 */
(( app.Pool ) p0 ).soundBkg ( v6, v7 ); // invoke-virtual {p0, v6, v7}, Lapp/Pool;->soundBkg(Ljava/lang/String;I)V
/* .line 4482 */
} // :cond_14
/* iput-boolean v10, v4, Lapp/Ball;->m_bounced:Z */
/* .line 4504 */
} // :cond_15
/* iget-boolean v6, p0, Lapp/Pool;->m_playBreak:Z */
if ( v6 != null) { // if-eqz v6, :cond_17
/* .line 4506 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playAgain:Z */
/* .line 4507 */
/* if-gt v0, v11, :cond_16 */
/* move v6, v9 */
} // :goto_8
(( app.Pool ) p0 ).score ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->score(Z)V
} // :cond_16
/* move v6, v10 */
/* .line 4511 */
} // :cond_17
/* if-ge v0, v11, :cond_1d */
/* .line 4513 */
/* iget-boolean v6, p0, Lapp/Pool;->m_playSolids:Z */
/* if-nez v6, :cond_19 */
/* iget-boolean v6, p0, Lapp/Pool;->m_playStripes:Z */
/* if-nez v6, :cond_19 */
/* .line 4515 */
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
if ( v6 != null) { // if-eqz v6, :cond_18
/* move v6, v10 */
} // :goto_9
(( app.Pool ) p0 ).stripesOrSolids ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->stripesOrSolids(Z)V
} // :cond_18
/* move v6, v9 */
/* .line 4517 */
} // :cond_19
/* iget-boolean v6, p0, Lapp/Pool;->m_playSolids:Z */
if ( v6 != null) { // if-eqz v6, :cond_1b
/* .line 4518 */
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
if ( v6 != null) { // if-eqz v6, :cond_1a
/* .line 4519 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playAgain:Z */
/* .line 4520 */
} // :cond_1a
(( app.Pool ) p0 ).score ( v9 ); // invoke-virtual {p0, v9}, Lapp/Pool;->score(Z)V
/* .line 4523 */
} // :cond_1b
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
/* if-nez v6, :cond_1c */
/* .line 4524 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playAgain:Z */
/* .line 4525 */
} // :cond_1c
(( app.Pool ) p0 ).score ( v10 ); // invoke-virtual {p0, v10}, Lapp/Pool;->score(Z)V
/* .line 4530 */
} // :cond_1d
/* iget-boolean v6, p0, Lapp/Pool;->m_playSolids:Z */
/* if-nez v6, :cond_1e */
/* iget-boolean v6, p0, Lapp/Pool;->m_playStripes:Z */
/* if-nez v6, :cond_1e */
/* .line 4532 */
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
(( app.Pool ) p0 ).stripesOrSolids ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->stripesOrSolids(Z)V
/* .line 4534 */
} // :cond_1e
/* iget-boolean v6, p0, Lapp/Pool;->m_playStripes:Z */
if ( v6 != null) { // if-eqz v6, :cond_20
/* .line 4535 */
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
if ( v6 != null) { // if-eqz v6, :cond_1f
/* .line 4536 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playAgain:Z */
/* .line 4537 */
} // :cond_1f
(( app.Pool ) p0 ).score ( v9 ); // invoke-virtual {p0, v9}, Lapp/Pool;->score(Z)V
/* goto/16 :goto_7 */
/* .line 4540 */
} // :cond_20
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
/* if-nez v6, :cond_21 */
/* .line 4541 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playAgain:Z */
/* .line 4542 */
} // :cond_21
(( app.Pool ) p0 ).score ( v10 ); // invoke-virtual {p0, v10}, Lapp/Pool;->score(Z)V
/* goto/16 :goto_7 */
/* .line 4547 */
} // :cond_22
/* iget v6, p0, Lapp/Pool;->m_game:I */
/* if-ne v6, v13, :cond_25 */
/* .line 4548 */
/* iget v6, p0, Lapp/Pool;->m_9ballNext:I */
/* if-ne v0, v6, :cond_24 */
/* .line 4550 */
} // :cond_23
/* iget v6, p0, Lapp/Pool;->m_9ballNext:I */
/* add-int/lit8 v6, v6, 0x1 */
/* iput v6, p0, Lapp/Pool;->m_9ballNext:I */
/* .line 4552 */
/* iget v6, p0, Lapp/Pool;->m_9ballNext:I */
/* const/16 v7, 0x9 */
/* if-ge v6, v7, :cond_24 */
v6 = this.m_balls;
/* iget v7, p0, Lapp/Pool;->m_9ballNext:I */
/* aget-object v6, v6, v7 */
v6 = (( app.Ball ) v6 ).isLinked ( ); // invoke-virtual {v6}, Lapp/Ball;->isLinked()Z
/* .line 4549 */
if ( v6 != null) { // if-eqz v6, :cond_23
/* .line 4555 */
} // :cond_24
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
(( app.Pool ) p0 ).score ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->score(Z)V
/* .line 4556 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playAgain:Z */
/* goto/16 :goto_7 */
/* .line 4560 */
} // :cond_25
/* iget-boolean v6, p0, Lapp/Pool;->m_player:Z */
(( app.Pool ) p0 ).score ( v6 ); // invoke-virtual {p0, v6}, Lapp/Pool;->score(Z)V
/* .line 4561 */
/* iput-boolean v9, p0, Lapp/Pool;->m_playAgain:Z */
/* goto/16 :goto_7 */
} // .end method
Boolean stepCue ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 4580 */
v0 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
/* if-nez v0, :cond_0 */
/* .line 4581 */
/* iput-boolean v1, p0, Lapp/Pool;->m_reset:Z */
/* .line 4582 */
int v0 = 0; // const/4 v0, 0x0
/* .line 4587 */
} // :goto_0
/* .line 4585 */
} // :cond_0
(( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
/* .line 4586 */
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* move v0, v1 */
/* .line 4587 */
} // .end method
void stripesOrSolids ( Boolean p0 ) {
/* .locals 7 */
/* .param p1, "who" # Z */
/* .prologue */
/* const v4, 0x8000 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
final String v6 = "Stripes "; // const-string v6, "Stripes "
final String v5 = "Solids "; // const-string v5, "Solids "
/* .line 4591 */
/* iput-boolean v3, p0, Lapp/Pool;->m_playAgain:Z */
/* .line 4593 */
/* iput v2, p0, Lapp/Pool;->m_scoredif:I */
/* .line 4594 */
v1 = this.m_score1;
(( v.Vtext ) v1 ).setNumber ( v2 ); // invoke-virtual {v1, v2}, Lv/Vtext;->setNumber(I)V
/* .line 4595 */
v1 = this.m_score2;
(( v.Vtext ) v1 ).setNumber ( v2 ); // invoke-virtual {v1, v2}, Lv/Vtext;->setNumber(I)V
/* .line 4597 */
/* iput-boolean p1, p0, Lapp/Pool;->m_playStripes:Z */
/* .line 4598 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* move v1, v2 */
} // :goto_0
/* iput-boolean v1, p0, Lapp/Pool;->m_playSolids:Z */
/* .line 4600 */
/* iget-boolean v1, p0, Lapp/Pool;->m_playSolids:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4601 */
v1 = this.m_score1;
final String v2 = "Solids "; // const-string v2, "Solids "
(( v.Vtext ) v1 ).setText ( v5 ); // invoke-virtual {v1, v5}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 4602 */
v1 = this.m_score2;
final String v2 = "Stripes "; // const-string v2, "Stripes "
(( v.Vtext ) v1 ).setText ( v6 ); // invoke-virtual {v1, v6}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 4609 */
} // :goto_1
(( app.Pool ) p0 ).score2Layout ( ); // invoke-virtual {p0}, Lapp/Pool;->score2Layout()V
/* .line 4612 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_2
/* const/16 v1, 0xf */
/* if-lt v0, v1, :cond_2 */
/* .line 4621 */
/* iget-boolean v1, p0, Lapp/Pool;->m_player:Z */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4622 */
v1 = this.m_score1;
(( v.Vtext ) v1 ).setAlpha ( v4 ); // invoke-virtual {v1, v4}, Lv/Vtext;->setAlpha(I)V
/* .line 4625 */
} // :goto_3
return;
} // .end local v0 # "i":I
} // :cond_0
/* move v1, v3 */
/* .line 4598 */
/* .line 4605 */
} // :cond_1
v1 = this.m_score1;
final String v2 = "Stripes "; // const-string v2, "Stripes "
(( v.Vtext ) v1 ).setText ( v6 ); // invoke-virtual {v1, v6}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 4606 */
v1 = this.m_score2;
final String v2 = "Solids "; // const-string v2, "Solids "
(( v.Vtext ) v1 ).setText ( v5 ); // invoke-virtual {v1, v5}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 4613 */
/* .restart local v0 # "i":I */
} // :cond_2
v1 = this.m_balls;
/* aget-object v1, v1, v0 */
v1 = (( app.Ball ) v1 ).isLinked ( ); // invoke-virtual {v1}, Lapp/Ball;->isLinked()Z
/* if-nez v1, :cond_3 */
/* .line 4614 */
int v1 = 7; // const/4 v1, 0x7
/* if-gt v0, v1, :cond_4 */
/* .line 4615 */
/* iget-boolean v1, p0, Lapp/Pool;->m_playSolids:Z */
(( app.Pool ) p0 ).score ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->score(Z)V
/* .line 4612 */
} // :cond_3
} // :goto_4
/* add-int/lit8 v0, v0, 0x1 */
/* .line 4617 */
} // :cond_4
/* iget-boolean v1, p0, Lapp/Pool;->m_playStripes:Z */
(( app.Pool ) p0 ).score ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->score(Z)V
/* .line 4624 */
} // :cond_5
v1 = this.m_score2;
(( v.Vtext ) v1 ).setAlpha ( v4 ); // invoke-virtual {v1, v4}, Lv/Vtext;->setAlpha(I)V
} // .end method
void titleInit ( ) {
/* .locals 8 */
/* .prologue */
/* const/16 v7, 0x11 */
/* const/16 v6, 0x10 */
/* .line 4634 */
/* const/16 v4, 0x80 */
/* iget v5, p0, Lapp/Pool;->m_width:I */
/* and-int/lit8 v5, v5, 0x7f */
/* sub-int/2addr v4, v5 */
/* shr-int/lit8 v2, v4, 0x1 */
/* .line 4636 */
/* .local v2, "xoff":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "y":I */
} // :goto_0
/* iget v4, p0, Lapp/Pool;->m_height:I */
/* if-lt v3, v4, :cond_0 */
/* .line 4646 */
/* new-instance v0, Lv/Vsprite; */
/* invoke-direct {v0}, Lv/Vsprite;-><init>()V */
/* .line 4647 */
/* .local v0, "p":Lv/Vsprite; */
v4 = this.m_lib;
(( v.Vsprite ) v0 ).setImage ( v4, v7 ); // invoke-virtual {v0, v4, v7}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 4648 */
(( app.Pool ) p0 ).addCenter ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 4650 */
(( app.Pool ) p0 ).render ( ); // invoke-virtual {p0}, Lapp/Pool;->render()V
/* .line 4658 */
(( app.Pool ) p0 ).removeAll ( ); // invoke-virtual {p0}, Lapp/Pool;->removeAll()V
/* .line 4659 */
v4 = this.m_lib;
(( v.Vilib ) v4 ).unload ( v6, v7 ); // invoke-virtual {v4, v6, v7}, Lv/Vilib;->unload(II)V
/* .line 4660 */
return;
/* .line 4637 */
} // .end local v0 # "p":Lv/Vsprite;
} // :cond_0
/* neg-int v1, v2 */
/* .local v1, "x":I */
} // :goto_1
/* iget v4, p0, Lapp/Pool;->m_width:I */
/* if-lt v1, v4, :cond_1 */
/* .line 4636 */
/* add-int/lit16 v3, v3, 0x80 */
/* .line 4638 */
} // :cond_1
/* new-instance v0, Lv/Vsprite; */
/* invoke-direct {v0}, Lv/Vsprite;-><init>()V */
/* .line 4639 */
/* .restart local v0 # "p":Lv/Vsprite; */
v4 = this.m_lib;
(( v.Vsprite ) v0 ).setImage ( v4, v6 ); // invoke-virtual {v0, v4, v6}, Lv/Vsprite;->setImage(Lv/Vilib;I)V
/* .line 4640 */
(( v.Vsprite ) v0 ).setXyi ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Lv/Vsprite;->setXyi(II)V
/* .line 4641 */
(( app.Pool ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->add(Lv/Vsprite;)V
/* .line 4637 */
/* add-int/lit16 v1, v1, 0x80 */
} // .end method
void topInsert ( Boolean p0 ) {
/* .locals 5 */
/* .param p1, "win" # Z */
/* .prologue */
int v4 = 2; // const/4 v4, 0x2
/* .line 4666 */
/* const/16 v1, 0x8 */
/* .local v1, "i":I */
} // :goto_0
/* if-gtz v1, :cond_1 */
/* .line 4671 */
/* iget v0, p0, Lapp/Pool;->m_level:I */
/* .line 4672 */
/* .local v0, "flags":I */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4673 */
/* or-int/lit8 v0, v0, 0x8 */
/* .line 4675 */
} // :cond_0
/* const/16 v2, 0x25 */
v3 = this.m_score1;
v3 = (( v.Vtext ) v3 ).getNumber ( ); // invoke-virtual {v3}, Lv/Vtext;->getNumber()I
/* shl-int/lit8 v3, v3, 0x8 */
v4 = this.m_score2;
v4 = (( v.Vtext ) v4 ).getNumber ( ); // invoke-virtual {v4}, Lv/Vtext;->getNumber()I
/* or-int/2addr v3, v4 */
(( app.Pool ) p0 ).prefWrite ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lapp/Pool;->prefWrite(II)V
/* .line 4676 */
/* const/16 v2, 0x26 */
(( app.Pool ) p0 ).prefWrite ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lapp/Pool;->prefWrite(II)V
/* .line 4677 */
return;
/* .line 4667 */
} // .end local v0 # "flags":I
} // :cond_1
/* add-int/lit8 v2, v1, 0x25 */
/* add-int/lit8 v3, v1, 0x25 */
/* sub-int/2addr v3, v4 */
v3 = (( app.Pool ) p0 ).prefRead ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->prefRead(I)I
(( app.Pool ) p0 ).prefWrite ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lapp/Pool;->prefWrite(II)V
/* .line 4668 */
/* add-int/lit8 v2, v1, 0x25 */
/* add-int/lit8 v2, v2, 0x1 */
/* add-int/lit8 v3, v1, 0x25 */
/* add-int/lit8 v3, v3, 0x1 */
/* sub-int/2addr v3, v4 */
v3 = (( app.Pool ) p0 ).prefRead ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->prefRead(I)I
(( app.Pool ) p0 ).prefWrite ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lapp/Pool;->prefWrite(II)V
/* .line 4666 */
/* add-int/lit8 v1, v1, -0x2 */
} // .end method
void topShow ( Boolean p0 ) {
/* .locals 9 */
/* .param p1, "win" # Z */
/* .prologue */
/* const/16 v8, 0x9 */
int v7 = 0; // const/4 v7, 0x0
/* .line 4681 */
/* new-instance v2, Lv/Vsprite; */
/* invoke-direct {v2}, Lv/Vsprite;-><init>()V */
/* .line 4682 */
/* .local v2, "p":Lv/Vsprite; */
int v5 = -2; // const/4 v5, -0x2
(( v.Vsprite ) v2 ).setZ ( v5 ); // invoke-virtual {v2, v5}, Lv/Vsprite;->setZ(I)V
/* .line 4684 */
/* const v5, -0x7fbfbf80 # -5.90061E-39f */
(( v.Vsprite ) v2 ).setColor ( v5 ); // invoke-virtual {v2, v5}, Lv/Vsprite;->setColor(I)V
/* .line 4685 */
v.Vtext .getFontDefault ( );
final String v6 = "15\t15\t- $5,000"; // const-string v6, "15\t15\t- $5,000"
v5 = (( v.Vfont ) v5 ).stringWidth ( v6 ); // invoke-virtual {v5, v6}, Lv/Vfont;->stringWidth(Ljava/lang/String;)I
(( v.Vsprite ) v2 ).setWidthHeight ( v5, v7 ); // invoke-virtual {v2, v5, v7}, Lv/Vsprite;->setWidthHeight(II)V
/* .line 4687 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4688 */
final String v5 = "You Win!"; // const-string v5, "You Win!"
(( v.Vsprite ) v2 ).addCenterBs ( v5 ); // invoke-virtual {v2, v5}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4692 */
} // :goto_0
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 4693 */
/* .local v3, "sb":Ljava/lang/StringBuffer; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
int v5 = 5; // const/4 v5, 0x5
/* if-lt v1, v5, :cond_2 */
/* .line 4728 */
(( app.Pool ) p0 ).addCenter ( v2 ); // invoke-virtual {p0, v2}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 4730 */
} // :goto_2
v5 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
if ( v5 != null) { // if-eqz v5, :cond_0
v5 = (( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
/* if-nez v5, :cond_0 */
v5 = (( app.Pool ) p0 ).keyAny ( ); // invoke-virtual {p0}, Lapp/Pool;->keyAny()Z
if ( v5 != null) { // if-eqz v5, :cond_8
/* .line 4740 */
} // :cond_0
(( v.Vsprite ) v2 ).off ( ); // invoke-virtual {v2}, Lv/Vsprite;->off()V
/* .line 4741 */
(( v.Vsprite ) v2 ).removeAll ( ); // invoke-virtual {v2}, Lv/Vsprite;->removeAll()V
/* .line 4742 */
return;
/* .line 4690 */
} // .end local v1 # "i":I
} // .end local v3 # "sb":Ljava/lang/StringBuffer;
} // :cond_1
final String v5 = "You Lose"; // const-string v5, "You Lose"
(( v.Vsprite ) v2 ).addCenterBs ( v5 ); // invoke-virtual {v2, v5}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4694 */
/* .restart local v1 # "i":I */
/* .restart local v3 # "sb":Ljava/lang/StringBuffer; */
} // :cond_2
/* shl-int/lit8 v5, v1, 0x1 */
/* add-int/lit8 v5, v5, 0x25 */
v4 = (( app.Pool ) p0 ).prefRead ( v5 ); // invoke-virtual {p0, v5}, Lapp/Pool;->prefRead(I)I
/* .line 4696 */
/* .local v4, "score":I */
/* if-nez v4, :cond_3 */
/* .line 4697 */
final String v5 = "--\t--\t--"; // const-string v5, "--\t--\t--"
(( v.Vsprite ) v2 ).addBs ( v5 ); // invoke-virtual {v2, v5}, Lv/Vsprite;->addBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4693 */
} // :goto_3
/* add-int/lit8 v1, v1, 0x1 */
/* .line 4699 */
} // :cond_3
/* shl-int/lit8 v5, v1, 0x1 */
/* add-int/lit8 v5, v5, 0x25 */
/* add-int/lit8 v5, v5, 0x1 */
v0 = (( app.Pool ) p0 ).prefRead ( v5 ); // invoke-virtual {p0, v5}, Lapp/Pool;->prefRead(I)I
/* .line 4701 */
/* .local v0, "flags":I */
(( java.lang.StringBuffer ) v3 ).setLength ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 4703 */
/* shr-int/lit8 v5, v4, 0x8 */
java.lang.String .valueOf ( v5 );
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4704 */
(( java.lang.StringBuffer ) v3 ).append ( v8 ); // invoke-virtual {v3, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 4706 */
/* and-int/lit16 v5, v4, 0xff */
java.lang.String .valueOf ( v5 );
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4707 */
(( java.lang.StringBuffer ) v3 ).append ( v8 ); // invoke-virtual {v3, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 4709 */
/* and-int/lit8 v5, v0, 0x8 */
/* if-nez v5, :cond_4 */
/* .line 4710 */
final String v5 = "- $"; // const-string v5, "- $"
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4714 */
} // :goto_4
/* and-int/lit8 v0, v0, 0x7 */
/* .line 4716 */
/* if-nez v0, :cond_5 */
/* .line 4717 */
final String v5 = "100"; // const-string v5, "100"
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4725 */
} // :goto_5
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( v.Vsprite ) v2 ).addBs ( v5 ); // invoke-virtual {v2, v5}, Lv/Vsprite;->addBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4712 */
} // :cond_4
final String v5 = "+ $"; // const-string v5, "+ $"
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4718 */
} // :cond_5
int v5 = 1; // const/4 v5, 0x1
/* if-ne v0, v5, :cond_6 */
/* .line 4719 */
final String v5 = "500"; // const-string v5, "500"
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4720 */
} // :cond_6
int v5 = 2; // const/4 v5, 0x2
/* if-ne v0, v5, :cond_7 */
/* .line 4721 */
final String v5 = "1,000"; // const-string v5, "1,000"
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4723 */
} // :cond_7
final String v5 = "5,000"; // const-string v5, "5,000"
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4731 */
} // .end local v0 # "flags":I
} // .end local v4 # "score":I
} // :cond_8
(( app.Pool ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lapp/Pool;->renderWait()V
/* goto/16 :goto_2 */
} // .end method
void turn ( ) {
/* .locals 4 */
/* .prologue */
/* const v1, 0x8000 */
/* const/16 v3, 0x20 */
/* const/16 v2, 0x4000 */
/* .line 4746 */
v0 = this.m_prompt;
(( v.Vtext ) v0 ).off ( ); // invoke-virtual {v0}, Lv/Vtext;->off()V
/* .line 4748 */
/* iget-boolean v0, p0, Lapp/Pool;->m_player:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 4750 */
v0 = this.m_score1;
(( v.Vtext ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Lv/Vtext;->setAlpha(I)V
/* .line 4751 */
v0 = this.m_score2;
(( v.Vtext ) v0 ).setAlpha ( v2 ); // invoke-virtual {v0, v2}, Lv/Vtext;->setAlpha(I)V
/* .line 4752 */
v0 = this.m_opponent;
(( v.Vsprite ) v0 ).off ( ); // invoke-virtual {v0}, Lv/Vsprite;->off()V
/* .line 4758 */
/* invoke-direct {p0}, Lapp/Pool;->menuGameShow()V */
/* .line 4780 */
} // :cond_0
} // :goto_0
/* iget v0, p0, Lapp/Pool;->m_game:I */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Lapp/Pool;->m_playSolids:Z */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Lapp/Pool;->m_playStripes:Z */
/* if-nez v0, :cond_1 */
/* .line 4781 */
v0 = this.m_score1;
(( v.Vtext ) v0 ).setAlpha ( v2 ); // invoke-virtual {v0, v2}, Lv/Vtext;->setAlpha(I)V
/* .line 4782 */
v0 = this.m_score2;
(( v.Vtext ) v0 ).setAlpha ( v2 ); // invoke-virtual {v0, v2}, Lv/Vtext;->setAlpha(I)V
/* .line 4784 */
} // :cond_1
return;
/* .line 4762 */
} // :cond_2
(( app.Pool ) p0 ).menuOff ( ); // invoke-virtual {p0}, Lapp/Pool;->menuOff()V
/* .line 4764 */
v0 = this.m_score1;
(( v.Vtext ) v0 ).setAlpha ( v2 ); // invoke-virtual {v0, v2}, Lv/Vtext;->setAlpha(I)V
/* .line 4765 */
v0 = this.m_score2;
(( v.Vtext ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Lv/Vtext;->setAlpha(I)V
/* .line 4767 */
v0 = this.m_opponent;
v0 = (( v.Vsprite ) v0 ).isLinked ( ); // invoke-virtual {v0}, Lv/Vsprite;->isLinked()Z
/* if-nez v0, :cond_4 */
/* .line 4768 */
/* iget v0, p0, Lapp/Pool;->m_scoredif:I */
/* iget v1, p0, Lapp/Pool;->m_scoredif0:I */
/* sub-int/2addr v0, v1 */
/* if-lez v0, :cond_3 */
/* .line 4769 */
/* const/16 v0, 0x22 */
(( app.Pool ) p0 ).opShow ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->opShow(I)V
/* .line 4774 */
} // :goto_1
/* iget v0, p0, Lapp/Pool;->m_scoredif:I */
/* iput v0, p0, Lapp/Pool;->m_scoredif0:I */
/* .line 4772 */
} // :cond_3
(( app.Pool ) p0 ).opShow ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->opShow(I)V
/* .line 4776 */
} // :cond_4
v0 = v0 = this.m_display;
/* iget v1, p0, Lapp/Pool;->m_facetime:I */
/* sub-int/2addr v0, v1 */
/* const/16 v1, 0x1f4 */
/* if-le v0, v1, :cond_0 */
/* .line 4777 */
(( app.Pool ) p0 ).opShow ( v3 ); // invoke-virtual {p0, v3}, Lapp/Pool;->opShow(I)V
} // .end method
void unlock ( ) {
/* .locals 29 */
/* .prologue */
/* .line 4788 */
/* move-object/from16 v0, p0 */
v0 = this.m_opponent;
/* move-object v4, v0 */
(( v.Vsprite ) v4 ).off ( ); // invoke-virtual {v4}, Lv/Vsprite;->off()V
/* .line 4790 */
/* new-instance v5, Lv/Vsprite; */
/* invoke-direct {v5}, Lv/Vsprite;-><init>()V */
/* .line 4791 */
/* .local v5, "p":Lv/Vsprite; */
/* const v4, -0x7fbfbf80 # -5.90061E-39f */
(( v.Vsprite ) v5 ).setColor ( v4 ); // invoke-virtual {v5, v4}, Lv/Vsprite;->setColor(I)V
/* .line 4808 */
/* const/16 v4, 0x96 */
int v6 = 0; // const/4 v6, 0x0
(( v.Vsprite ) v5 ).setWidthHeight ( v4, v6 ); // invoke-virtual {v5, v4, v6}, Lv/Vsprite;->setWidthHeight(II)V
/* .line 4810 */
final String v4 = "Buy key to unlock"; // const-string v4, "Buy key to unlock"
(( v.Vsprite ) v5 ).addCenterBs ( v4 ); // invoke-virtual {v5, v4}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4820 */
/* const/16 v22, 0x5 */
/* .line 4821 */
/* .local v22, "keylength":I */
/* new-instance v25, Ljava/lang/StringBuffer; */
final String v4 = "PIN: "; // const-string v4, "PIN: "
/* move-object/from16 v0, v25 */
/* move-object v1, v4 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 4822 */
/* .local v25, "sb":Ljava/lang/StringBuffer; */
/* move-object/from16 v0, p0 */
v0 = this.m_display;
/* move-object v4, v0 */
/* .line 4823 */
/* .local v24, "s":Ljava/lang/String; */
v4 = /* invoke-virtual/range {v24 ..v24}, Ljava/lang/String;->length()I */
/* if-nez v4, :cond_4 */
/* .line 4824 */
int v4 = 0; // const/4 v4, 0x0
/* move-object/from16 v0, p0 */
/* move v1, v4 */
v4 = (( app.Pool ) v0 ).prefRead ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prefRead(I)I
/* move-object/from16 v0, v25 */
/* move v1, v4 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* .line 4827 */
} // :goto_0
/* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String; */
(( v.Vsprite ) v5 ).addCenterBs ( v4 ); // invoke-virtual {v5, v4}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4830 */
final String v4 = "Enter key: "; // const-string v4, "Enter key: "
/* add-int/lit8 v6, v22, 0x1 */
(( v.Vsprite ) v5 ).addCenterBottom ( v4, v6 ); // invoke-virtual {v5, v4, v6}, Lv/Vsprite;->addCenterBottom(Ljava/lang/String;I)Lv/Vtext;
/* .line 4831 */
/* .local v19, "in":Lv/Vtext; */
/* move-object/from16 v0, p0 */
/* move-object v1, v5 */
(( app.Pool ) v0 ).addCenter ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 4833 */
/* new-instance v25, Ljava/lang/StringBuffer; */
} // .end local v25 # "sb":Ljava/lang/StringBuffer;
final String v4 = "_"; // const-string v4, "_"
/* move-object/from16 v0, v25 */
/* move-object v1, v4 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 4834 */
/* .restart local v25 # "sb":Ljava/lang/StringBuffer; */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, v25 */
(( v.Vtext ) v0 ).setField ( v1 ); // invoke-virtual {v0, v1}, Lv/Vtext;->setField(Ljava/lang/StringBuffer;)V
/* .line 4835 */
/* const/16 v16, 0x0 */
/* .line 4837 */
/* .local v16, "i":I */
/* sget-boolean v4, Lv/Vmenu;->m_mouse:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 4839 */
/* iget v4, v5, Lv/Vsprite;->m_height:I */
/* add-int/lit8 v28, v4, 0x10 */
/* .line 4840 */
/* .local v28, "y":I */
/* move/from16 v0, v28 */
/* add-int/lit16 v0, v0, 0x80 */
/* move v4, v0 */
/* iput v4, v5, Lv/Vsprite;->m_height:I */
/* .line 4841 */
/* move-object v0, v5 */
/* iget v0, v0, Lv/Vsprite;->m_width:I */
/* move/from16 v27, v0 */
/* .line 4843 */
/* .local v27, "w":I */
/* shr-int/lit8 v4, v27, 0x1 */
int v6 = 4; // const/4 v6, 0x4
/* sub-int v8, v4, v6 */
/* .line 4853 */
/* .local v8, "xc":I */
/* new-instance v4, Lv/Vsprite; */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object v6, v0 */
/* const/16 v7, 0x14 */
/* add-int/lit8 v9, v28, 0x8 */
/* invoke-direct/range {v4 ..v9}, Lv/Vsprite;-><init>(Lv/Vsprite;Lv/Vilib;III)V */
/* .line 4854 */
/* new-instance v4, Lv/Vsprite; */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object v6, v0 */
/* const/16 v7, 0x15 */
/* move/from16 v0, v28 */
/* add-int/lit16 v0, v0, 0x80 */
/* move v9, v0 */
/* const/16 v10, 0x18 */
/* sub-int/2addr v9, v10 */
/* invoke-direct/range {v4 ..v9}, Lv/Vsprite;-><init>(Lv/Vsprite;Lv/Vilib;III)V */
/* .line 4855 */
/* add-int/lit8 v9, v28, 0x36 */
/* .line 4856 */
} // .end local v28 # "y":I
/* .local v9, "y":I */
/* new-instance v4, Lv/Vsprite; */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object v6, v0 */
/* const/16 v7, 0x1a */
/* invoke-direct/range {v4 ..v9}, Lv/Vsprite;-><init>(Lv/Vsprite;Lv/Vilib;III)V */
/* .line 4857 */
/* new-instance v10, Lv/Vsprite; */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object v12, v0 */
/* const/16 v13, 0x13 */
/* const/16 v14, 0x10 */
/* move-object v11, v5 */
/* move v15, v9 */
/* invoke-direct/range {v10 ..v15}, Lv/Vsprite;-><init>(Lv/Vsprite;Lv/Vilib;III)V */
/* .line 4858 */
/* new-instance v10, Lv/Vsprite; */
/* move-object/from16 v0, p0 */
v0 = this.m_lib;
/* move-object v12, v0 */
/* const/16 v13, 0x12 */
/* const/16 v4, 0x10 */
/* sub-int v4, v27, v4 */
/* const/16 v6, 0x8 */
/* sub-int v14, v4, v6 */
/* move-object v11, v5 */
/* move v15, v9 */
/* invoke-direct/range {v10 ..v15}, Lv/Vsprite;-><init>(Lv/Vsprite;Lv/Vilib;III)V */
/* .line 4862 */
} // .end local v8 # "xc":I
} // .end local v9 # "y":I
} // .end local v27 # "w":I
} // :cond_0
} // :goto_1
v4 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->isRunning()Z */
if ( v4 != null) { // if-eqz v4, :cond_1
v4 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->screenResize()Z */
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 4965 */
} // :cond_1
} // :goto_2
(( v.Vsprite ) v5 ).off ( ); // invoke-virtual {v5}, Lv/Vsprite;->off()V
/* .line 4966 */
(( v.Vsprite ) v5 ).removeAll ( ); // invoke-virtual {v5}, Lv/Vsprite;->removeAll()V
/* .line 4968 */
v4 = /* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuffer;->length()I */
int v6 = 1; // const/4 v6, 0x1
/* if-le v4, v6, :cond_3 */
v4 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->eval()Z */
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 4969 */
/* new-instance v5, Lv/Vsprite; */
} // .end local v5 # "p":Lv/Vsprite;
/* invoke-direct {v5}, Lv/Vsprite;-><init>()V */
/* .line 4970 */
/* .restart local v5 # "p":Lv/Vsprite; */
/* const v4, -0x7fbfbf80 # -5.90061E-39f */
(( v.Vsprite ) v5 ).setColor ( v4 ); // invoke-virtual {v5, v4}, Lv/Vsprite;->setColor(I)V
/* .line 4971 */
final String v4 = "The key and PIN"; // const-string v4, "The key and PIN"
(( v.Vsprite ) v5 ).addCenterBs ( v4 ); // invoke-virtual {v5, v4}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4972 */
final String v4 = "do not agree."; // const-string v4, "do not agree."
(( v.Vsprite ) v5 ).addCenterBs ( v4 ); // invoke-virtual {v5, v4}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4973 */
final String v4 = "Both must match"; // const-string v4, "Both must match"
(( v.Vsprite ) v5 ).addCenterBs ( v4 ); // invoke-virtual {v5, v4}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4974 */
final String v4 = "purchase info."; // const-string v4, "purchase info."
(( v.Vsprite ) v5 ).addCenterBs ( v4 ); // invoke-virtual {v5, v4}, Lv/Vsprite;->addCenterBs(Ljava/lang/String;)Lv/Vtext;
/* .line 4975 */
/* move-object/from16 v0, p0 */
/* move-object v1, v5 */
(( app.Pool ) v0 ).addCenter ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 4977 */
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->render()V */
/* .line 4978 */
} // :goto_3
v4 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->isRunning()Z */
if ( v4 != null) { // if-eqz v4, :cond_2
v4 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->screenResize()Z */
if ( v4 != null) { // if-eqz v4, :cond_19
/* .line 4984 */
} // :cond_2
/* move-object/from16 v0, p0 */
/* move-object v1, v5 */
(( app.Pool ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->remove(Lv/Vsprite;)V
/* .line 4985 */
(( v.Vsprite ) v5 ).removeAll ( ); // invoke-virtual {v5}, Lv/Vsprite;->removeAll()V
/* .line 4987 */
} // :cond_3
return;
/* .line 4826 */
} // .end local v16 # "i":I
} // .end local v19 # "in":Lv/Vtext;
} // :cond_4
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v24 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* goto/16 :goto_0 */
/* .line 4863 */
/* .restart local v16 # "i":I */
/* .restart local v19 # "in":Lv/Vtext; */
} // :cond_5
v21 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->keyGet()C */
/* .line 4865 */
/* .local v21, "key":C */
int v4 = 5; // const/4 v4, 0x5
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_6 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousex:I */
/* move v4, v0 */
if ( v4 != null) { // if-eqz v4, :cond_6
/* sget-boolean v4, Lv/Vmenu;->m_mouse:Z */
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 4867 */
/* const/16 v21, 0x0 */
/* .line 4869 */
/* move-object v0, v5 */
v0 = this.m_child;
/* move-object/from16 v23, v0 */
/* .line 4870 */
/* .local v23, "ps":Lv/Vsprite; */
} // :goto_4
/* if-nez v23, :cond_b */
/* .line 4893 */
int v4 = 0; // const/4 v4, 0x0
/* move v0, v4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_mousex:I */
/* .line 4897 */
} // .end local v23 # "ps":Lv/Vsprite;
} // :cond_6
int v4 = 3; // const/4 v4, 0x3
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_d */
int v4 = 1; // const/4 v4, 0x1
/* move/from16 v26, v4 */
/* .line 4898 */
/* .local v26, "up":Z */
} // :goto_5
/* if-nez v26, :cond_7 */
int v4 = 4; // const/4 v4, 0x4
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_12 */
/* .line 4899 */
} // :cond_7
/* if-lez v16, :cond_11 */
/* .line 4900 */
/* add-int/lit8 v16, v16, -0x1 */
/* .line 4901 */
/* move-object/from16 v0, v25 */
/* move/from16 v1, v16 */
v21 = (( java.lang.StringBuffer ) v0 ).charAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->charAt(I)C
/* .line 4902 */
/* move-object/from16 v0, v25 */
/* move/from16 v1, v16 */
(( java.lang.StringBuffer ) v0 ).deleteCharAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
/* .line 4903 */
if ( v26 != null) { // if-eqz v26, :cond_f
/* .line 4904 */
/* const/16 v4, 0x39 */
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_e */
/* .line 4905 */
/* const/16 v21, 0x30 */
/* .line 4923 */
} // :cond_8
} // :goto_6
/* const/16 v4, 0x30 */
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-lt v0, v1, :cond_13 */
/* const/16 v4, 0x39 */
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-gt v0, v1, :cond_13 */
/* .line 4924 */
/* move/from16 v0, v16 */
/* move/from16 v1, v22 */
/* if-ne v0, v1, :cond_9 */
/* .line 4925 */
int v4 = 0; // const/4 v4, 0x0
/* move-object/from16 v0, v25 */
/* move v1, v4 */
(( java.lang.StringBuffer ) v0 ).deleteCharAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
/* .line 4926 */
/* add-int/lit8 v16, v16, -0x1 */
/* .line 4928 */
} // :cond_9
/* add-int/lit8 v17, v16, 0x1 */
} // .end local v16 # "i":I
/* .local v17, "i":I */
/* move-object/from16 v0, v25 */
/* move/from16 v1, v16 */
/* move/from16 v2, v21 */
(( java.lang.StringBuffer ) v0 ).insert ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->insert(IC)Ljava/lang/StringBuffer;
/* .line 4929 */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, v25 */
(( v.Vtext ) v0 ).setField ( v1 ); // invoke-virtual {v0, v1}, Lv/Vtext;->setField(Ljava/lang/StringBuffer;)V
/* move/from16 v16, v17 */
/* .line 4961 */
} // .end local v17 # "i":I
/* .restart local v16 # "i":I */
} // :cond_a
} // :goto_7
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->render()V */
/* .line 4962 */
/* const/16 v4, 0x40 */
/* move-object/from16 v0, p0 */
/* move v1, v4 */
(( app.Pool ) v0 ).waitMs ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->waitMs(I)V
/* goto/16 :goto_1 */
/* .line 4871 */
} // .end local v26 # "up":Z
/* .restart local v23 # "ps":Lv/Vsprite; */
} // :cond_b
/* move-object/from16 v0, v23 */
/* iget v0, v0, Lv/Vsprite;->m_libi:I */
/* move/from16 v18, v0 */
/* .line 4872 */
/* .local v18, "id":I */
int v4 = -1; // const/4 v4, -0x1
/* move/from16 v0, v18 */
/* move v1, v4 */
/* if-eq v0, v1, :cond_c */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousex:I */
/* move v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_mousey:I */
/* move v6, v0 */
/* const/16 v7, 0x10 */
/* move-object/from16 v0, v23 */
/* move v1, v4 */
/* move v2, v6 */
/* move v3, v7 */
v4 = (( v.Vsprite ) v0 ).pick ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vsprite;->pick(III)Z
if ( v4 != null) { // if-eqz v4, :cond_c
/* .line 4873 */
/* packed-switch v18, :pswitch_data_0 */
/* .line 4891 */
} // :cond_c
} // :goto_8
/* :pswitch_0 */
/* move-object/from16 v0, v23 */
v0 = this.m_sibling;
/* move-object/from16 v23, v0 */
/* goto/16 :goto_4 */
/* .line 4875 */
/* :pswitch_1 */
/* const/16 v21, 0x3 */
/* .line 4876 */
/* .line 4878 */
/* :pswitch_2 */
/* const/16 v21, 0x4 */
/* .line 4879 */
/* .line 4881 */
/* :pswitch_3 */
/* const/16 v21, 0x1 */
/* .line 4882 */
/* .line 4884 */
/* :pswitch_4 */
/* const/16 v21, 0x2 */
/* .line 4885 */
/* .line 4887 */
/* :pswitch_5 */
/* const/16 v21, 0x5 */
/* .line 4897 */
} // .end local v18 # "id":I
} // .end local v23 # "ps":Lv/Vsprite;
} // :cond_d
int v4 = 0; // const/4 v4, 0x0
/* move/from16 v26, v4 */
/* goto/16 :goto_5 */
/* .line 4907 */
/* .restart local v26 # "up":Z */
} // :cond_e
/* add-int/lit8 v4, v21, 0x1 */
/* move v0, v4 */
/* int-to-char v0, v0 */
/* move/from16 v21, v0 */
/* goto/16 :goto_6 */
/* .line 4910 */
} // :cond_f
/* const/16 v4, 0x30 */
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_10 */
/* .line 4911 */
/* const/16 v21, 0x39 */
/* goto/16 :goto_6 */
/* .line 4913 */
} // :cond_10
int v4 = 1; // const/4 v4, 0x1
/* sub-int v4, v21, v4 */
/* move v0, v4 */
/* int-to-char v0, v0 */
/* move/from16 v21, v0 */
/* goto/16 :goto_6 */
/* .line 4917 */
} // :cond_11
/* const/16 v21, 0x30 */
/* goto/16 :goto_6 */
/* .line 4919 */
} // :cond_12
int v4 = 2; // const/4 v4, 0x2
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_8 */
/* .line 4920 */
/* const/16 v21, 0x30 */
/* goto/16 :goto_6 */
/* .line 4931 */
} // :cond_13
int v4 = 1; // const/4 v4, 0x1
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-eq v0, v1, :cond_14 */
/* const/16 v4, 0x8 */
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-eq v0, v1, :cond_14 */
/* const/16 v4, 0x7f */
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-eq v0, v1, :cond_14 */
/* const/16 v4, 0x8 */
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_15 */
/* .line 4932 */
} // :cond_14
/* if-lez v16, :cond_a */
/* .line 4933 */
/* add-int/lit8 v16, v16, -0x1 */
/* .line 4934 */
/* move-object/from16 v0, v25 */
/* move/from16 v1, v16 */
(( java.lang.StringBuffer ) v0 ).deleteCharAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
/* .line 4935 */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, v25 */
(( v.Vtext ) v0 ).setField ( v1 ); // invoke-virtual {v0, v1}, Lv/Vtext;->setField(Ljava/lang/StringBuffer;)V
/* goto/16 :goto_7 */
/* .line 4938 */
} // :cond_15
int v4 = 5; // const/4 v4, 0x5
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-eq v0, v1, :cond_16 */
/* const/16 v4, 0xa */
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_18 */
/* .line 4940 */
} // :cond_16
int v4 = 1; // const/4 v4, 0x1
/* move/from16 v0, v16 */
/* move v1, v4 */
/* if-le v0, v1, :cond_1 */
/* .line 4941 */
/* move-object/from16 v0, v25 */
/* move/from16 v1, v16 */
(( java.lang.StringBuffer ) v0 ).deleteCharAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
/* .line 4943 */
v4 = /* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuffer;->length()I */
/* move v0, v4 */
/* move/from16 v1, v22 */
/* if-ne v0, v1, :cond_1 */
/* .line 4944 */
/* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String; */
v20 = java.lang.Integer .parseInt ( v4 );
/* .line 4945 */
/* .local v20, "k":I */
int v4 = 1; // const/4 v4, 0x1
/* move-object/from16 v0, p0 */
/* move v1, v4 */
v4 = (( app.Pool ) v0 ).prefRead ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->prefRead(I)I
/* move/from16 v0, v20 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_17 */
/* .line 4946 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Pool;->m_keyTries:I */
/* move v4, v0 */
/* add-int/lit8 v4, v4, 0x1 */
/* move v0, v4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_keyTries:I */
/* .line 4952 */
} // :goto_9
/* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->prefSave()V */
/* goto/16 :goto_2 */
/* .line 4949 */
} // :cond_17
int v4 = 0; // const/4 v4, 0x0
/* move v0, v4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Pool;->m_keyTries:I */
/* .line 4950 */
int v4 = 1; // const/4 v4, 0x1
/* move-object/from16 v0, p0 */
/* move v1, v4 */
/* move/from16 v2, v20 */
(( app.Pool ) v0 ).prefWrite ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lapp/Pool;->prefWrite(II)V
/* .line 4958 */
} // .end local v20 # "k":I
} // :cond_18
int v4 = 6; // const/4 v4, 0x6
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-ne v0, v1, :cond_a */
/* goto/16 :goto_2 */
/* .line 4979 */
} // .end local v21 # "key":C
} // .end local v26 # "up":Z
} // :cond_19
v21 = /* invoke-virtual/range {p0 ..p0}, Lapp/Pool;->keyGet()C */
/* .line 4980 */
/* .restart local v21 # "key":C */
int v4 = 5; // const/4 v4, 0x5
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-eq v0, v1, :cond_2 */
int v4 = 6; // const/4 v4, 0x6
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-eq v0, v1, :cond_2 */
/* const/16 v4, 0xa */
/* move/from16 v0, v21 */
/* move v1, v4 */
/* if-eq v0, v1, :cond_2 */
/* .line 4982 */
/* const/16 v4, 0x40 */
/* move-object/from16 v0, p0 */
/* move v1, v4 */
(( app.Pool ) v0 ).waitMs ( v1 ); // invoke-virtual {v0, v1}, Lapp/Pool;->waitMs(I)V
/* goto/16 :goto_3 */
/* .line 4873 */
/* :pswitch_data_0 */
/* .packed-switch 0x12 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_5 */
} // .end packed-switch
} // .end method
void waitKey ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "ms" # I */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 4993 */
/* iput v0, p0, Lapp/Pool;->m_mousex:I */
/* .line 4994 */
/* iput v0, p0, Lapp/Pool;->m_mousey:I */
/* .line 4997 */
} // :cond_0
/* const/16 v0, 0x40 */
(( app.Pool ) p0 ).waitMs ( v0 ); // invoke-virtual {p0, v0}, Lapp/Pool;->waitMs(I)V
/* .line 4998 */
/* iget v0, p0, Lapp/Pool;->m_tlast:I */
/* sub-int/2addr p1, v0 */
/* .line 5001 */
v0 = (( app.Pool ) p0 ).keyAny ( ); // invoke-virtual {p0}, Lapp/Pool;->keyAny()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5005 */
} // :cond_1
} // :goto_0
return;
/* .line 5004 */
} // :cond_2
/* if-lez p1, :cond_1 */
v0 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
/* .line 4995 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // .end method
final Boolean yesNo ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 8 */
/* .param p1, "prompt" # Ljava/lang/String; */
/* .param p2, "no" # Ljava/lang/String; */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 5009 */
int v3 = 0; // const/4 v3, 0x0
/* .line 5011 */
/* .local v3, "result":Z */
/* new-instance v1, Lv/Vmenu; */
/* invoke-direct {v1}, Lv/Vmenu;-><init>()V */
/* .line 5012 */
/* .local v1, "m":Lv/Vmenu; */
(( v.Vmenu ) v1 ).add ( p1 ); // invoke-virtual {v1, p1}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 5013 */
v4 = (( java.lang.String ) p1 ).charAt ( v5 ); // invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C
/* .line 5014 */
/* .local v4, "y":C */
(( v.Vmenu ) v1 ).select ( v4 ); // invoke-virtual {v1, v4}, Lv/Vmenu;->select(I)V
/* .line 5015 */
(( v.Vmenu ) v1 ).add ( p2 ); // invoke-virtual {v1, p2}, Lv/Vmenu;->add(Ljava/lang/String;)Lv/Vtext;
/* .line 5016 */
v2 = (( java.lang.String ) p2 ).charAt ( v5 ); // invoke-virtual {p2, v5}, Ljava/lang/String;->charAt(I)C
/* .line 5018 */
/* .local v2, "n":C */
(( app.Pool ) p0 ).mend ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->mend(Lv/Vmenu;)V
/* .line 5020 */
(( app.Pool ) p0 ).addCenter ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 5022 */
} // :goto_0
v5 = (( app.Pool ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lapp/Pool;->isRunning()Z
/* if-nez v5, :cond_1 */
/* .line 5040 */
} // :cond_0
} // :goto_1
(( v.Vmenu ) v1 ).off ( ); // invoke-virtual {v1}, Lv/Vmenu;->off()V
/* .line 5041 */
(( v.Vmenu ) v1 ).removeAllStar ( ); // invoke-virtual {v1}, Lv/Vmenu;->removeAllStar()V
/* .line 5043 */
/* .line 5023 */
} // :cond_1
v5 = (( app.Pool ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lapp/Pool;->screenResize()Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 5024 */
(( v.Vmenu ) v1 ).off ( ); // invoke-virtual {v1}, Lv/Vmenu;->off()V
/* .line 5025 */
(( app.Pool ) p0 ).addCenter ( v1 ); // invoke-virtual {p0, v1}, Lapp/Pool;->addCenter(Lv/Vsprite;)V
/* .line 5028 */
} // :cond_2
v5 = (( app.Pool ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lapp/Pool;->keyGet()C
/* iget v6, p0, Lapp/Pool;->m_mousex:I */
/* iget v7, p0, Lapp/Pool;->m_mousey:I */
v0 = (( v.Vmenu ) v1 ).key ( v5, v6, v7 ); // invoke-virtual {v1, v5, v6, v7}, Lv/Vmenu;->key(CII)C
/* .line 5029 */
/* .local v0, "key":C */
/* if-ne v0, v4, :cond_3 */
/* .line 5030 */
int v3 = 1; // const/4 v3, 0x1
/* .line 5031 */
/* .line 5033 */
} // :cond_3
/* if-eq v0, v2, :cond_0 */
/* .line 5036 */
(( app.Pool ) p0 ).render ( ); // invoke-virtual {p0}, Lapp/Pool;->render()V
/* .line 5037 */
/* const/16 v5, 0x40 */
(( app.Pool ) p0 ).waitMs ( v5 ); // invoke-virtual {p0, v5}, Lapp/Pool;->waitMs(I)V
} // .end method
void zoom ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "amt" # I */
/* .prologue */
/* const/high16 v2, 0x780000 */
/* const/high16 v1, 0x120000 */
/* .line 5047 */
/* iget v0, p0, Lapp/Pool;->m_camdist:I */
/* sub-int/2addr v0, p1 */
/* iput v0, p0, Lapp/Pool;->m_camdist:I */
/* .line 5049 */
/* iget v0, p0, Lapp/Pool;->m_camdist:I */
/* if-ge v0, v1, :cond_0 */
/* .line 5050 */
/* iput v1, p0, Lapp/Pool;->m_camdist:I */
/* .line 5052 */
} // :cond_0
/* iget v0, p0, Lapp/Pool;->m_camdist:I */
/* if-le v0, v2, :cond_1 */
/* .line 5053 */
/* iput v2, p0, Lapp/Pool;->m_camdist:I */
/* .line 5058 */
} // :cond_1
/* iget v0, p0, Lapp/Pool;->m_camdist:I */
/* const/high16 v1, 0x480000 */
/* if-le v0, v1, :cond_2 */
/* .line 5059 */
v0 = this.m_table;
/* const/high16 v1, -0x1000000 */
(( v.V3dView ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Lv/V3dView;->setColor(I)V
/* .line 5064 */
} // :goto_0
(( app.Pool ) p0 ).lookAt ( ); // invoke-virtual {p0}, Lapp/Pool;->lookAt()V
/* .line 5065 */
return;
/* .line 5061 */
} // :cond_2
v0 = this.m_table;
int v1 = 0; // const/4 v1, 0x0
(( v.V3dView ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Lv/V3dView;->setColor(I)V
} // .end method
