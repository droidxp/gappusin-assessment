public class v.Viewport extends v.Vsprite {
	 /* .source "Viewport.java" */
	 /* # static fields */
	 public static final Boolean FRAMERATE;
	 public static final Object KEYA;
	 public static final Object KEYB;
	 public static final Object KEYBACK;
	 static final Integer KEYDNMAX;
	 static final Integer KEYDNN;
	 public static final Object KEYDOWN;
	 public static final Integer KEYENTER;
	 public static final Object KEYLEFT;
	 public static final Integer KEYN;
	 static final Integer KEYQN;
	 public static final Object KEYRIGHT;
	 public static final Object KEYUP;
	 static final Boolean REDRAWALL;
	 static final Integer WIPESTEPX;
	 static final Integer WIPESTEPY;
	 public static Boolean m_sony;
	 /* # instance fields */
	 public v.Vdisplay m_display;
	 public Integer m_dragx;
	 public Integer m_dragy;
	 public Integer m_framerate;
	 Integer m_framerateN;
	 Integer m_framerateTime;
	 m_keydn;
	 Integer m_keyhd;
	 m_keyq;
	 Integer m_keytl;
	 public Integer m_mousex;
	 public Integer m_mousey;
	 public Boolean m_offscreen;
	 public Boolean m_pause;
	 public m_rgb;
	 public Boolean m_soundOff;
	 Integer m_soundtime;
	 public Boolean m_stop;
	 Integer m_t0;
	 public Integer m_tlast;
	 public m_up;
	 public Integer m_upn;
	 public Integer m_wheelt;
	 public Integer m_wheelx;
	 public Integer m_wheely;
	 /* # direct methods */
	 public v.Viewport ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 73 */
		 /* invoke-direct {p0}, Lv/Vsprite;-><init>()V */
		 /* .line 74 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [I */
		 this.m_keydn = v0;
		 /* .line 75 */
		 /* const/16 v0, 0xa */
		 /* new-array v0, v0, [C */
		 this.m_keyq = v0;
		 /* .line 78 */
		 /* const/16 v0, 0x80 */
		 /* new-array v0, v0, [I */
		 this.m_up = v0;
		 /* .line 79 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void destroy ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 84 */
		 (( v.Viewport ) p0 ).removeAll ( ); // invoke-virtual {p0}, Lv/Viewport;->removeAll()V
		 /* .line 85 */
		 v0 = this.m_rgb;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 86 */
			 v0 = this.m_rgb;
			 v.Viewport .deleteInt ( v0 );
			 /* .line 87 */
			 int v0 = 0; // const/4 v0, 0x0
			 this.m_rgb = v0;
			 /* .line 88 */
			 /* iput v1, p0, Lv/Viewport;->m_width:I */
			 /* .line 89 */
			 /* iput v1, p0, Lv/Viewport;->m_height:I */
			 /* .line 91 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected void draw ( Integer[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
		 /* .locals 6 */
		 /* .param p1, "rgb" # [I */
		 /* .param p2, "width" # I */
		 /* .param p3, "height" # I */
		 /* .param p4, "x0" # I */
		 /* .param p5, "y0" # I */
		 /* .param p6, "x1" # I */
		 /* .param p7, "y1" # I */
		 /* .prologue */
		 /* .line 99 */
		 v2 = 		 (( v.Viewport ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lv/Viewport;->getWidth()I
		 /* .line 100 */
		 /* .local v2, "sw":I */
		 /* mul-int v4, p5, p2 */
		 /* add-int v0, v4, p4 */
		 /* .line 101 */
		 /* .local v0, "di":I */
		 /* iget v4, p0, Lv/Viewport;->m_sy0:I */
		 /* sub-int v4, p5, v4 */
		 /* mul-int/2addr v4, v2 */
		 /* iget v5, p0, Lv/Viewport;->m_sx0:I */
		 /* sub-int v5, p4, v5 */
		 /* add-int v1, v4, v5 */
		 /* .line 102 */
		 /* .local v1, "si":I */
		 /* sub-int v3, p6, p4 */
		 /* .line 104 */
		 /* .local v3, "wdraw":I */
	 } // :goto_0
	 /* if-lt p5, p7, :cond_0 */
	 /* .line 110 */
	 return;
	 /* .line 105 */
} // :cond_0
v4 = this.m_rgb;
java.lang.System .arraycopy ( v4,v1,p1,v0,v3 );
/* .line 106 */
/* add-int/2addr v1, v2 */
/* .line 107 */
/* add-int/2addr v0, p2 */
/* .line 108 */
/* add-int/lit8 p5, p5, 0x1 */
} // .end method
public void init ( v.Vdisplay p0 ) {
/* .locals 1 */
/* .param p1, "display" # Lv/Vdisplay; */
/* .prologue */
/* .line 113 */
this.m_display = p1;
v0 = /* .line 114 */
/* iput v0, p0, Lv/Viewport;->m_t0:I */
/* .line 115 */
return;
} // .end method
public Boolean isRunning ( ) {
/* .locals 1 */
/* .prologue */
/* .line 120 */
/* iget-boolean v0, p0, Lv/Viewport;->m_stop:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void keyAddSys ( Object p0 ) {
/* .locals 3 */
/* .param p1, "key" # C */
/* .prologue */
/* .line 129 */
int v1 = 5; // const/4 v1, 0x5
/* if-ne p1, v1, :cond_1 */
v1 = this.m_keydn;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
/* and-int/lit8 v1, v1, 0x1f */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 142 */
} // :cond_0
} // :goto_0
return;
/* .line 133 */
} // :cond_1
/* iget v0, p0, Lv/Viewport;->m_keytl:I */
/* .line 134 */
/* .local v0, "i":I */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 135 */
/* const/16 v1, 0xa */
/* if-ne v0, v1, :cond_2 */
/* .line 136 */
int v0 = 0; // const/4 v0, 0x0
/* .line 137 */
} // :cond_2
/* iget v1, p0, Lv/Viewport;->m_keyhd:I */
/* if-eq v0, v1, :cond_0 */
/* .line 139 */
v1 = this.m_keyq;
/* iget v2, p0, Lv/Viewport;->m_keytl:I */
/* aput-char p1, v1, v2 */
/* .line 140 */
/* iput v0, p0, Lv/Viewport;->m_keytl:I */
} // .end method
public Boolean keyDown ( Object p0 ) {
/* .locals 5 */
/* .param p1, "key" # C */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* .line 146 */
/* const/16 v2, 0x39 */
/* if-gt p1, v2, :cond_1 */
/* .line 147 */
/* shr-int/lit8 v0, p1, 0x5 */
/* .line 148 */
/* .local v0, "ki":I */
/* and-int/lit8 v2, p1, 0x1f */
/* shl-int v1, v4, v2 */
/* .line 149 */
/* .local v1, "km":I */
v2 = this.m_keydn;
/* aget v2, v2, v0 */
/* and-int/2addr v2, v1 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* move v2, v4 */
/* .line 151 */
} // .end local v0 # "ki":I
} // .end local v1 # "km":I
} // :goto_0
/* .restart local v0 # "ki":I */
/* .restart local v1 # "km":I */
} // :cond_0
/* move v2, v3 */
/* .line 149 */
} // .end local v0 # "ki":I
} // .end local v1 # "km":I
} // :cond_1
/* move v2, v3 */
/* .line 151 */
} // .end method
public void keyDownSys ( Object p0 ) {
/* .locals 4 */
/* .param p1, "key" # C */
/* .prologue */
/* .line 160 */
/* const/16 v2, 0x39 */
/* if-gt p1, v2, :cond_0 */
/* .line 161 */
/* shr-int/lit8 v0, p1, 0x5 */
/* .line 162 */
/* .local v0, "ki":I */
int v2 = 1; // const/4 v2, 0x1
/* and-int/lit8 v3, p1, 0x1f */
/* shl-int v1, v2, v3 */
/* .line 163 */
/* .local v1, "km":I */
v2 = this.m_keydn;
/* aget v3, v2, v0 */
/* or-int/2addr v3, v1 */
/* aput v3, v2, v0 */
/* .line 166 */
} // .end local v0 # "ki":I
} // .end local v1 # "km":I
} // :cond_0
(( v.Viewport ) p0 ).keyAddSys ( p1 ); // invoke-virtual {p0, p1}, Lv/Viewport;->keyAddSys(C)V
/* .line 167 */
return;
} // .end method
public Object keyGet ( ) {
/* .locals 3 */
/* .prologue */
/* .line 171 */
/* iget v0, p0, Lv/Viewport;->m_keyhd:I */
/* .line 172 */
/* .local v0, "i":I */
/* iget v2, p0, Lv/Viewport;->m_keytl:I */
/* if-ne v0, v2, :cond_0 */
/* .line 174 */
int v2 = 0; // const/4 v2, 0x0
/* .line 182 */
} // :goto_0
/* .line 177 */
} // :cond_0
v2 = this.m_keyq;
/* aget-char v1, v2, v0 */
/* .line 178 */
/* .local v1, "key":C */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 179 */
/* const/16 v2, 0xa */
/* if-ne v0, v2, :cond_1 */
/* .line 180 */
int v0 = 0; // const/4 v0, 0x0
/* .line 181 */
} // :cond_1
/* iput v0, p0, Lv/Viewport;->m_keyhd:I */
/* move v2, v1 */
/* .line 182 */
} // .end method
public Boolean keyPress ( Object p0, Object p1 ) {
/* .locals 1 */
/* .param p1, "key" # C */
/* .param p2, "key2" # C */
/* .prologue */
/* .line 186 */
/* if-eq p1, p2, :cond_0 */
v0 = (( v.Viewport ) p0 ).keyDown ( p2 ); // invoke-virtual {p0, p2}, Lv/Viewport;->keyDown(C)Z
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void keyUpSys ( Object p0 ) {
/* .locals 5 */
/* .param p1, "key" # C */
/* .prologue */
/* .line 194 */
/* const/16 v2, 0x39 */
/* if-gt p1, v2, :cond_0 */
/* .line 195 */
/* shr-int/lit8 v0, p1, 0x5 */
/* .line 196 */
/* .local v0, "ki":I */
int v2 = 1; // const/4 v2, 0x1
/* and-int/lit8 v3, p1, 0x1f */
/* shl-int v1, v2, v3 */
/* .line 197 */
/* .local v1, "km":I */
v2 = this.m_keydn;
/* aget v3, v2, v0 */
/* xor-int/lit8 v4, v1, -0x1 */
/* and-int/2addr v3, v4 */
/* aput v3, v2, v0 */
/* .line 199 */
} // .end local v0 # "ki":I
} // .end local v1 # "km":I
} // :cond_0
return;
} // .end method
public Boolean keyWaiting ( ) {
/* .locals 2 */
/* .prologue */
/* .line 204 */
/* iget v0, p0, Lv/Viewport;->m_keyhd:I */
/* iget v1, p0, Lv/Viewport;->m_keytl:I */
/* if-eq v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void redraw ( ) {
/* .locals 4 */
/* .prologue */
/* .line 209 */
/* iget v0, p0, Lv/Viewport;->m_sx0:I */
/* iget v1, p0, Lv/Viewport;->m_sy0:I */
/* iget v2, p0, Lv/Viewport;->m_sx1:I */
/* iget v3, p0, Lv/Viewport;->m_sy1:I */
(( v.Viewport ) p0 ).redraw ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lv/Viewport;->redraw(IIII)V
/* .line 210 */
return;
} // .end method
public void redraw ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 20 */
/* .param p1, "x0" # I */
/* .param p2, "y0" # I */
/* .param p3, "x1" # I */
/* .param p4, "y1" # I */
/* .prologue */
/* .line 240 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Viewport;->m_sx0:I */
/* move/from16 v18, v0 */
/* move/from16 v0, p1 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_0 */
/* .line 241 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Viewport;->m_sx0:I */
/* move/from16 p1, v0 */
/* .line 242 */
} // :cond_0
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Viewport;->m_sx1:I */
/* move/from16 v18, v0 */
/* move/from16 v0, p3 */
/* move/from16 v1, v18 */
/* if-le v0, v1, :cond_1 */
/* .line 243 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Viewport;->m_sx1:I */
/* move/from16 p3, v0 */
/* .line 244 */
} // :cond_1
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Viewport;->m_sy0:I */
/* move/from16 v18, v0 */
/* move/from16 v0, p2 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_2 */
/* .line 245 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Viewport;->m_sy0:I */
/* move/from16 p2, v0 */
/* .line 246 */
} // :cond_2
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Viewport;->m_sy1:I */
/* move/from16 v18, v0 */
/* move/from16 v0, p4 */
/* move/from16 v1, v18 */
/* if-le v0, v1, :cond_3 */
/* .line 247 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Viewport;->m_sy1:I */
/* move/from16 p4, v0 */
/* .line 250 */
} // :cond_3
/* move/from16 v0, p1 */
/* move/from16 v1, p3 */
/* if-ge v0, v1, :cond_11 */
/* move/from16 v0, p2 */
/* move/from16 v1, p4 */
/* if-ge v0, v1, :cond_11 */
/* .line 252 */
/* move-object/from16 v0, p0 */
v0 = this.m_up;
/* move-object v9, v0 */
/* .line 253 */
/* .local v9, "up":[I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Viewport;->m_upn:I */
/* move v7, v0 */
/* .line 255 */
/* .local v7, "n":I */
int v5 = 0; // const/4 v5, 0x0
/* .local v5, "i":I */
/* move v6, v5 */
} // .end local v5 # "i":I
/* .local v6, "i":I */
/* move v8, v7 */
/* .line 256 */
} // .end local v7 # "n":I
/* .local v8, "n":I */
} // :cond_4
} // :goto_0
/* if-lt v6, v8, :cond_6 */
/* .line 313 */
/* move-object v0, v9 */
/* array-length v0, v0 */
/* move/from16 v18, v0 */
/* const/16 v19, 0x4 */
/* sub-int v18, v18, v19 */
/* move v0, v8 */
/* move/from16 v1, v18 */
/* if-gt v0, v1, :cond_5 */
/* .line 315 */
/* add-int/lit8 v7, v8, 0x1 */
} // .end local v8 # "n":I
/* .restart local v7 # "n":I */
/* aput p1, v9, v8 */
/* .line 316 */
/* add-int/lit8 v8, v7, 0x1 */
} // .end local v7 # "n":I
/* .restart local v8 # "n":I */
/* aput p2, v9, v7 */
/* .line 317 */
/* add-int/lit8 v7, v8, 0x1 */
} // .end local v8 # "n":I
/* .restart local v7 # "n":I */
/* aput p3, v9, v8 */
/* .line 318 */
/* add-int/lit8 v8, v7, 0x1 */
} // .end local v7 # "n":I
/* .restart local v8 # "n":I */
/* aput p4, v9, v7 */
} // :cond_5
/* move v7, v8 */
/* .line 326 */
} // .end local v8 # "n":I
/* .restart local v7 # "n":I */
/* move v0, v7 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lv/Viewport;->m_upn:I */
/* .line 331 */
} // .end local v6 # "i":I
} // .end local v7 # "n":I
} // .end local v9 # "up":[I
} // :goto_1
return;
/* .line 257 */
/* .restart local v6 # "i":I */
/* .restart local v8 # "n":I */
/* .restart local v9 # "up":[I */
} // :cond_6
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "i":I
/* .restart local v5 # "i":I */
/* aget v10, v9, v6 */
/* .line 258 */
/* .local v10, "x00":I */
/* add-int/lit8 v6, v5, 0x1 */
} // .end local v5 # "i":I
/* .restart local v6 # "i":I */
/* aget v14, v9, v5 */
/* .line 259 */
/* .local v14, "y00":I */
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "i":I
/* .restart local v5 # "i":I */
/* aget v11, v9, v6 */
/* .line 260 */
/* .local v11, "x01":I */
/* add-int/lit8 v6, v5, 0x1 */
} // .end local v5 # "i":I
/* .restart local v6 # "i":I */
/* aget v15, v9, v5 */
/* .line 262 */
/* .local v15, "y01":I */
/* move v12, v10 */
/* .line 263 */
/* .local v12, "xa":I */
/* move/from16 v16, v14 */
/* .line 264 */
/* .local v16, "ya":I */
/* move v13, v11 */
/* .line 265 */
/* .local v13, "xb":I */
/* move/from16 v17, v15 */
/* .line 268 */
/* .local v17, "yb":I */
/* move v0, v10 */
/* move/from16 v1, p1 */
/* if-ge v0, v1, :cond_7 */
/* .line 269 */
/* move/from16 v10, p1 */
/* .line 270 */
} // :cond_7
/* move v0, v14 */
/* move/from16 v1, p2 */
/* if-ge v0, v1, :cond_8 */
/* .line 271 */
/* move/from16 v14, p2 */
/* .line 272 */
} // :cond_8
/* move v0, v11 */
/* move/from16 v1, p3 */
/* if-le v0, v1, :cond_9 */
/* .line 273 */
/* move/from16 v11, p3 */
/* .line 274 */
} // :cond_9
/* move v0, v15 */
/* move/from16 v1, p4 */
/* if-le v0, v1, :cond_a */
/* .line 275 */
/* move/from16 v15, p4 */
/* .line 286 */
} // :cond_a
/* sub-int v18, v10, v11 */
/* const/16 v19, 0x8 */
/* move/from16 v0, v18 */
/* move/from16 v1, v19 */
/* if-gt v0, v1, :cond_4 */
/* sub-int v18, v14, v15 */
/* const/16 v19, 0x8 */
/* move/from16 v0, v18 */
/* move/from16 v1, v19 */
/* if-gt v0, v1, :cond_4 */
/* .line 289 */
/* move/from16 v0, p1 */
/* move v1, v12 */
/* if-lt v0, v1, :cond_b */
/* move/from16 v0, p3 */
/* move v1, v13 */
/* if-gt v0, v1, :cond_b */
/* move/from16 v0, p2 */
/* move/from16 v1, v16 */
/* if-lt v0, v1, :cond_b */
/* move/from16 v0, p4 */
/* move/from16 v1, v17 */
/* if-gt v0, v1, :cond_b */
/* .line 290 */
/* move v0, v8 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lv/Viewport;->m_upn:I */
/* .line 295 */
} // :cond_b
/* move/from16 v0, p1 */
/* move v1, v12 */
/* if-le v0, v1, :cond_c */
/* .line 296 */
/* move/from16 p1, v12 */
/* .line 297 */
} // :cond_c
/* move/from16 v0, p2 */
/* move/from16 v1, v16 */
/* if-le v0, v1, :cond_d */
/* .line 298 */
/* move/from16 p2, v16 */
/* .line 299 */
} // :cond_d
/* move/from16 v0, p3 */
/* move v1, v13 */
/* if-ge v0, v1, :cond_e */
/* .line 300 */
/* move/from16 p3, v13 */
/* .line 301 */
} // :cond_e
/* move/from16 v0, p4 */
/* move/from16 v1, v17 */
/* if-ge v0, v1, :cond_f */
/* .line 302 */
/* move/from16 p4, v17 */
/* .line 305 */
} // :cond_f
/* if-ge v6, v8, :cond_10 */
/* .line 306 */
/* const/16 v18, 0x4 */
/* sub-int v18, v6, v18 */
/* sub-int v19, v8, v6 */
/* move-object v0, v9 */
/* move v1, v6 */
/* move-object v2, v9 */
/* move/from16 v3, v18 */
/* move/from16 v4, v19 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
/* .line 308 */
} // :cond_10
/* add-int/lit8 v7, v8, -0x4 */
/* .line 309 */
} // .end local v8 # "n":I
/* .restart local v7 # "n":I */
int v5 = 0; // const/4 v5, 0x0
} // .end local v6 # "i":I
/* .restart local v5 # "i":I */
/* move v6, v5 */
} // .end local v5 # "i":I
/* .restart local v6 # "i":I */
/* move v8, v7 */
} // .end local v7 # "n":I
/* .restart local v8 # "n":I */
/* goto/16 :goto_0 */
/* .line 329 */
} // .end local v6 # "i":I
} // .end local v8 # "n":I
} // .end local v9 # "up":[I
} // .end local v10 # "x00":I
} // .end local v11 # "x01":I
} // .end local v12 # "xa":I
} // .end local v13 # "xb":I
} // .end local v14 # "y00":I
} // .end local v15 # "y01":I
} // .end local v16 # "ya":I
} // .end local v17 # "yb":I
} // :cond_11
/* const/16 v18, 0x1 */
/* move/from16 v0, v18 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lv/Viewport;->m_offscreen:Z */
/* goto/16 :goto_1 */
} // .end method
public void render ( ) {
/* .locals 15 */
/* .prologue */
int v14 = 0; // const/4 v14, 0x0
/* .line 335 */
v0 = (( v.Viewport ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/Viewport;->isRunning()Z
/* if-nez v0, :cond_0 */
/* .line 405 */
} // :goto_0
return;
/* .line 338 */
} // :cond_0
/* const v0, 0x8000 */
(( v.Viewport ) p0 ).renderChangeDetect ( v14, v14, v0 ); // invoke-virtual {p0, v14, v14, v0}, Lv/Viewport;->renderChangeDetect(III)V
/* .line 340 */
v12 = this.m_up;
/* .line 342 */
/* .local v12, "up":[I */
int v9 = 0; // const/4 v9, 0x0
/* .line 343 */
/* .local v9, "ui":I */
/* iget v11, p0, Lv/Viewport;->m_upn:I */
/* .local v11, "un":I */
/* move v10, v9 */
/* .line 348 */
} // .end local v9 # "ui":I
/* .local v10, "ui":I */
} // :cond_1
} // :goto_1
/* if-lt v10, v11, :cond_3 */
/* .line 398 */
v0 = this.m_display;
if ( v0 != null) { // if-eqz v0, :cond_2
if ( v11 != null) { // if-eqz v11, :cond_2
/* .line 399 */
v0 = this.m_display;
/* .line 404 */
} // :cond_2
/* iput v14, p0, Lv/Viewport;->m_upn:I */
/* .line 350 */
} // :cond_3
/* add-int/lit8 v9, v10, 0x1 */
} // .end local v10 # "ui":I
/* .restart local v9 # "ui":I */
/* aget v4, v12, v10 */
/* .line 351 */
/* .local v4, "x0":I */
/* add-int/lit8 v10, v9, 0x1 */
} // .end local v9 # "ui":I
/* .restart local v10 # "ui":I */
/* aget v5, v12, v9 */
/* .line 352 */
/* .local v5, "y0":I */
/* add-int/lit8 v9, v10, 0x1 */
} // .end local v10 # "ui":I
/* .restart local v9 # "ui":I */
/* aget v6, v12, v10 */
/* .line 353 */
/* .local v6, "x1":I */
/* add-int/lit8 v10, v9, 0x1 */
} // .end local v9 # "ui":I
/* .restart local v10 # "ui":I */
/* aget v7, v12, v9 */
/* .line 355 */
/* .local v7, "y1":I */
/* if-ge v4, v6, :cond_1 */
/* if-ge v5, v7, :cond_1 */
/* .line 361 */
int v8 = 0; // const/4 v8, 0x0
/* .line 367 */
/* .local v8, "t0":I */
v1 = this.m_rgb;
/* iget v2, p0, Lv/Viewport;->m_width:I */
/* iget v3, p0, Lv/Viewport;->m_height:I */
/* move-object v0, p0 */
/* invoke-super/range {v0 ..v7}, Lv/Vsprite;->draw([IIIIIII)V */
/* .line 379 */
v0 = this.m_display;
/* if-nez v0, :cond_1 */
/* .line 391 */
v0 = this.m_parent;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 393 */
v0 = this.m_parent;
/* iget v1, p0, Lv/Viewport;->m_sx0:I */
/* add-int/2addr v1, v4 */
/* iget v2, p0, Lv/Viewport;->m_sy0:I */
/* add-int/2addr v2, v5 */
/* iget v3, p0, Lv/Viewport;->m_sx0:I */
/* add-int/2addr v3, v6 */
/* iget v13, p0, Lv/Viewport;->m_sy0:I */
/* add-int/2addr v13, v7 */
(( v.Vsprite ) v0 ).redraw ( v1, v2, v3, v13 ); // invoke-virtual {v0, v1, v2, v3, v13}, Lv/Vsprite;->redraw(IIII)V
} // .end method
public void renderWait ( ) {
/* .locals 1 */
/* .prologue */
/* .line 408 */
(( v.Viewport ) p0 ).render ( ); // invoke-virtual {p0}, Lv/Viewport;->render()V
/* .line 409 */
/* const/16 v0, 0x40 */
(( v.Viewport ) p0 ).waitMs ( v0 ); // invoke-virtual {p0, v0}, Lv/Viewport;->waitMs(I)V
/* .line 422 */
return;
} // .end method
public void run ( ) {
/* .locals 0 */
/* .prologue */
/* .line 426 */
return;
} // .end method
public void setWidthHeight ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 429 */
/* iget v0, p0, Lv/Viewport;->m_width:I */
/* if-ne p1, v0, :cond_0 */
/* iget v0, p0, Lv/Viewport;->m_height:I */
/* if-eq p2, v0, :cond_2 */
/* .line 435 */
} // :cond_0
v0 = this.m_rgb;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 436 */
v0 = this.m_rgb;
v.Viewport .deleteInt ( v0 );
/* .line 437 */
int v0 = 0; // const/4 v0, 0x0
this.m_rgb = v0;
/* .line 440 */
} // :cond_1
/* mul-int v0, p1, p2 */
v.Viewport .allocInt ( v0 );
this.m_rgb = v0;
/* .line 442 */
/* iput p1, p0, Lv/Viewport;->m_width:I */
/* .line 443 */
/* iput p2, p0, Lv/Viewport;->m_height:I */
/* .line 445 */
/* iput v1, p0, Lv/Viewport;->m_sx0:I */
/* .line 446 */
/* iput v1, p0, Lv/Viewport;->m_sy0:I */
/* .line 447 */
/* iput p1, p0, Lv/Viewport;->m_sx1:I */
/* .line 448 */
/* iput p2, p0, Lv/Viewport;->m_sy1:I */
/* .line 450 */
/* iput v1, p0, Lv/Viewport;->m_upn:I */
/* .line 451 */
(( v.Viewport ) p0 ).redraw ( v1, v1, p1, p2 ); // invoke-virtual {p0, v1, v1, p1, p2}, Lv/Viewport;->redraw(IIII)V
/* .line 453 */
} // :cond_2
return;
} // .end method
public void sound ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 456 */
/* iget-boolean v0, p0, Lv/Viewport;->m_soundOff:Z */
/* if-nez v0, :cond_0 */
v0 = (( v.Viewport ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/Viewport;->isRunning()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 457 */
v0 = this.m_display;
int v1 = 0; // const/4 v1, 0x0
/* .line 464 */
} // :cond_0
return;
} // .end method
public void soundBkg ( java.lang.String p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "name" # Ljava/lang/String; */
/* .param p2, "ms" # I */
/* .prologue */
/* .line 467 */
/* iget-boolean v2, p0, Lv/Viewport;->m_soundOff:Z */
/* if-nez v2, :cond_1 */
v2 = (( v.Viewport ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/Viewport;->isRunning()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 477 */
v1 = v2 = this.m_display;
/* .line 478 */
/* .local v1, "tnow":I */
/* iget v2, p0, Lv/Viewport;->m_soundtime:I */
/* sub-int v0, v1, v2 */
/* .line 482 */
/* .local v0, "t":I */
/* if-ltz v0, :cond_0 */
/* if-lt v0, p2, :cond_1 */
/* .line 483 */
} // :cond_0
v2 = this.m_display;
int v3 = 1; // const/4 v3, 0x1
/* .line 484 */
/* iput v1, p0, Lv/Viewport;->m_soundtime:I */
/* .line 488 */
} // .end local v0 # "t":I
} // .end local v1 # "tnow":I
} // :cond_1
return;
} // .end method
public Boolean visible ( v.Vsprite p0 ) {
/* .locals 4 */
/* .param p1, "ps" # Lv/Vsprite; */
/* .prologue */
/* .line 492 */
/* iget v0, p1, Lv/Vsprite;->m_sx0:I */
/* .line 493 */
/* .local v0, "x0":I */
/* iget v1, p1, Lv/Vsprite;->m_sx1:I */
/* .line 494 */
/* .local v1, "x1":I */
/* if-ge v0, v1, :cond_0 */
/* iget v2, p0, Lv/Viewport;->m_sx0:I */
/* if-le v1, v2, :cond_0 */
/* iget v2, p0, Lv/Viewport;->m_sx1:I */
/* if-ge v0, v2, :cond_0 */
/* iget v2, p1, Lv/Vsprite;->m_sy1:I */
/* iget v3, p0, Lv/Viewport;->m_sy0:I */
/* if-le v2, v3, :cond_0 */
/* iget v2, p1, Lv/Vsprite;->m_sy0:I */
/* iget v3, p0, Lv/Viewport;->m_sy1:I */
/* if-ge v2, v3, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :goto_0
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // .end method
public void waitMs ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "ms" # I */
/* .prologue */
/* .line 499 */
v2 = (( v.Viewport ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/Viewport;->isRunning()Z
/* if-nez v2, :cond_0 */
/* .line 528 */
} // :goto_0
return;
/* .line 505 */
} // :cond_0
/* iget v2, p0, Lv/Viewport;->m_t0:I */
/* add-int v0, v2, p1 */
/* .line 506 */
/* .local v0, "t1":I */
v1 = v2 = this.m_display;
/* .line 507 */
/* .local v1, "tnow":I */
/* sub-int p1, v0, v1 */
/* .line 513 */
/* if-lez p1, :cond_1 */
/* .line 514 */
v2 = this.m_display;
/* .line 519 */
/* move v1, v0 */
/* .line 526 */
} // :cond_1
/* iget v2, p0, Lv/Viewport;->m_t0:I */
/* sub-int v2, v1, v2 */
/* iput v2, p0, Lv/Viewport;->m_tlast:I */
/* .line 527 */
/* iput v1, p0, Lv/Viewport;->m_t0:I */
} // .end method
public void wipeLeftToRight ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 542 */
/* const/16 v0, 0x14 */
/* .line 545 */
/* .local v0, "step":I */
/* sget-boolean v2, Lv/Viewport;->m_motorola:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 546 */
/* iget v2, p0, Lv/Viewport;->m_width:I */
/* shr-int/lit8 v0, v2, 0x3 */
/* .line 548 */
} // :cond_0
/* const v2, 0x8000 */
(( v.Viewport ) p0 ).renderChangeDetect ( v4, v4, v2 ); // invoke-virtual {p0, v4, v4, v2}, Lv/Viewport;->renderChangeDetect(III)V
/* .line 549 */
/* iget v2, p0, Lv/Viewport;->m_upn:I */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 550 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* iget v2, p0, Lv/Viewport;->m_width:I */
/* if-ge v1, v2, :cond_1 */
v2 = (( v.Viewport ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/Viewport;->isRunning()Z
/* if-nez v2, :cond_3 */
/* .line 552 */
} // :cond_1
v2 = (( v.Viewport ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/Viewport;->isRunning()Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 553 */
/* iput v4, p0, Lv/Viewport;->m_upn:I */
/* .line 555 */
} // .end local v1 # "x":I
} // :cond_2
return;
/* .line 551 */
/* .restart local v1 # "x":I */
} // :cond_3
/* add-int v2, v1, v0 */
/* iget v3, p0, Lv/Viewport;->m_height:I */
(( v.Viewport ) p0 ).wipeRect ( v1, v4, v2, v3 ); // invoke-virtual {p0, v1, v4, v2, v3}, Lv/Viewport;->wipeRect(IIII)V
/* .line 550 */
/* add-int/2addr v1, v0 */
} // .end method
final void wipeRect ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 8 */
/* .param p1, "x0" # I */
/* .param p2, "y0" # I */
/* .param p3, "x1" # I */
/* .param p4, "y1" # I */
/* .prologue */
/* .line 531 */
/* iget v0, p0, Lv/Viewport;->m_width:I */
/* if-le p3, v0, :cond_0 */
/* .line 532 */
/* iget p3, p0, Lv/Viewport;->m_width:I */
/* .line 533 */
} // :cond_0
/* iget v0, p0, Lv/Viewport;->m_height:I */
/* if-le p4, v0, :cond_1 */
/* .line 534 */
/* iget p4, p0, Lv/Viewport;->m_height:I */
/* .line 535 */
} // :cond_1
v1 = this.m_rgb;
/* iget v2, p0, Lv/Viewport;->m_width:I */
/* iget v3, p0, Lv/Viewport;->m_height:I */
/* move-object v0, p0 */
/* move v4, p1 */
/* move v5, p2 */
/* move v6, p3 */
/* move v7, p4 */
/* invoke-super/range {v0 ..v7}, Lv/Vsprite;->draw([IIIIIII)V */
/* .line 536 */
v0 = this.m_display;
/* .line 537 */
/* const/16 v0, 0xa */
(( v.Viewport ) p0 ).waitMs ( v0 ); // invoke-virtual {p0, v0}, Lv/Viewport;->waitMs(I)V
/* .line 538 */
return;
} // .end method
public void wipeTopToBottom ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 559 */
/* const v1, 0x8000 */
(( v.Viewport ) p0 ).renderChangeDetect ( v3, v3, v1 ); // invoke-virtual {p0, v3, v3, v1}, Lv/Viewport;->renderChangeDetect(III)V
/* .line 560 */
/* iget v1, p0, Lv/Viewport;->m_upn:I */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 561 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "y":I */
} // :goto_0
/* iget v1, p0, Lv/Viewport;->m_height:I */
/* if-ge v0, v1, :cond_0 */
v1 = (( v.Viewport ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/Viewport;->isRunning()Z
/* if-nez v1, :cond_2 */
/* .line 563 */
} // :cond_0
v1 = (( v.Viewport ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/Viewport;->isRunning()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 564 */
/* iput v3, p0, Lv/Viewport;->m_upn:I */
/* .line 566 */
} // .end local v0 # "y":I
} // :cond_1
return;
/* .line 562 */
/* .restart local v0 # "y":I */
} // :cond_2
/* iget v1, p0, Lv/Viewport;->m_width:I */
/* add-int/lit8 v2, v0, 0x14 */
(( v.Viewport ) p0 ).wipeRect ( v3, v0, v1, v2 ); // invoke-virtual {p0, v3, v0, v1, v2}, Lv/Viewport;->wipeRect(IIII)V
/* .line 561 */
/* add-int/lit8 v0, v0, 0x14 */
} // .end method
