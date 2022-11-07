public class v.V {
	 /* .source "V.java" */
	 /* # static fields */
	 static final Integer AG_CONST;
	 public static final Boolean ANDROID;
	 protected static final Boolean AUTOTEST;
	 public static final Boolean BB;
	 public static final Integer BIGNUM;
	 public static final Boolean BLACKBERRY;
	 public static final Integer CBLACK;
	 static final Integer CORDIC_BITS;
	 static final Integer CORDIC_I;
	 public static final Boolean CPP;
	 public static final Integer CTRANSPARENT;
	 public static final Integer CWHITE;
	 static final Integer C_STEPS;
	 public static final Integer DBITS;
	 public static final Boolean DEBUG;
	 public static final Integer DEG180;
	 public static final Integer DEG360;
	 public static final Integer DEG90;
	 public static final Integer DEGREES;
	 public static final Boolean FAST;
	 public static final Integer FBITS;
	 public static final Integer FEET;
	 public static final Integer FMASK;
	 public static final Integer FRAMETIME;
	 public static final Integer FTPERSEC;
	 public static final Boolean HOVER;
	 public static final Integer I;
	 public static final Integer II;
	 public static final Integer INCHES;
	 public static final Boolean INSTINCT;
	 public static final Boolean IPHONE;
	 public static final Boolean JAVAVERIFIED;
	 public static final Object KEYA;
	 public static final Object KEYB;
	 public static final Object KEYBACK;
	 public static final Object KEYDOWN;
	 public static final Object KEYENTER;
	 public static final Object KEYLEFT;
	 public static final Integer KEYN;
	 public static final Object KEYRIGHT;
	 public static final Object KEYUP;
	 public static final Boolean LITE;
	 public static final Boolean MIDP;
	 static final Integer MSLOP;
	 public static final Integer PI;
	 private static final Integer RANN;
	 public static final Boolean REGDAY;
	 public static final Boolean SCREENSHOT;
	 static final Integer SINCONST;
	 static final Integer SINCONST2;
	 public static final Boolean SMALL;
	 static final Integer SQRTTOLERANCE;
	 public static final Boolean TIME;
	 public static final Boolean TRACE;
	 protected static final Boolean TRACE2;
	 protected static final Boolean TRACEALLOC;
	 public static final Boolean TRIAL;
	 public static final Boolean UNLOCKED;
	 static final Boolean USEDIVIDE;
	 static final Boolean USEFLOAT;
	 public static final Boolean VPALM;
	 public static final Boolean WINMAC;
	 public static final Boolean WM;
	 static final Boolean ZBUF;
	 public static Integer m_avail;
	 static final m_cangles;
	 public static m_finv;
	 public static m_fsin;
	 public static Boolean m_motorola;
	 static m_ranbuf;
	 static Integer m_ranj;
	 static Integer m_rank;
	 public static Boolean m_sonyHeap;
	 static Long m_tracetime0;
	 /* # direct methods */
	 static v.V ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 136 */
		 /* const/16 v0, 0x10 */
		 /* new-array v0, v0, [I */
		 /* fill-array-data v0, :array_0 */
		 /* .line 5 */
		 return;
		 /* .line 136 */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x8000 */
		 /* 0x4b90 */
		 /* 0x27ec */
		 /* 0x1444 */
		 /* 0xa2c */
		 /* 0x517 */
		 /* 0x28b */
		 /* 0x145 */
		 /* 0xa2 */
		 /* 0x51 */
		 /* 0x28 */
		 /* 0x14 */
		 /* 0xa */
		 /* 0x5 */
		 /* 0x2 */
		 /* 0x1 */
	 } // .end array-data
} // .end method
public v.V ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 5 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
static final allocByte ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "n" # I */
	 /* .prologue */
	 /* .line 212 */
	 v.V .allocate ( p0 );
	 /* .line 213 */
	 /* new-array v0, p0, [B */
} // .end method
static final allocInt ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "n" # I */
	 /* .prologue */
	 /* .line 226 */
	 /* shl-int/lit8 v0, p0, 0x2 */
	 v.V .allocate ( v0 );
	 /* .line 227 */
	 /* new-array v0, p0, [I */
} // .end method
static final allocShort ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "n" # I */
	 /* .prologue */
	 /* .line 219 */
	 /* shl-int/lit8 v0, p0, 0x1 */
	 v.V .allocate ( v0 );
	 /* .line 220 */
	 /* new-array v0, p0, [S */
} // .end method
static final void allocate ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "n" # I */
	 /* .prologue */
	 /* .line 159 */
	 /* sub-int/2addr v0, p0 */
	 /* .line 206 */
	 return;
} // .end method
public static final Integer bilurpRgb ( Integer p0, Integer p1, Integer p2 ) {
	 /* .locals 8 */
	 /* .param p0, "c0" # I */
	 /* .param p1, "c1" # I */
	 /* .param p2, "frac" # I */
	 /* .prologue */
	 /* .line 234 */
	 /* if-ne p0, p1, :cond_0 */
	 /* move v6, p0 */
	 /* .line 249 */
} // :goto_0
/* .line 237 */
} // :cond_0
/* shr-int/lit8 v6, p0, 0x10 */
/* and-int/lit16 v4, v6, 0xff */
/* .line 238 */
/* .local v4, "r0":I */
/* shr-int/lit8 v6, p0, 0x8 */
/* and-int/lit16 v2, v6, 0xff */
/* .line 239 */
/* .local v2, "g0":I */
/* and-int/lit16 v0, p0, 0xff */
/* .line 241 */
/* .local v0, "b0":I */
/* shr-int/lit8 v6, p1, 0x10 */
/* and-int/lit16 v5, v6, 0xff */
/* .line 242 */
/* .local v5, "r1":I */
/* shr-int/lit8 v6, p1, 0x8 */
/* and-int/lit16 v3, v6, 0xff */
/* .line 243 */
/* .local v3, "g1":I */
/* and-int/lit16 v1, p1, 0xff */
/* .line 245 */
/* .local v1, "b1":I */
/* sub-int v6, v5, v4 */
/* mul-int/2addr v6, p2 */
/* shr-int/lit8 v6, v6, 0xf */
/* add-int/2addr v4, v6 */
/* .line 246 */
/* sub-int v6, v3, v2 */
/* mul-int/2addr v6, p2 */
/* shr-int/lit8 v6, v6, 0xf */
/* add-int/2addr v2, v6 */
/* .line 247 */
/* sub-int v6, v1, v0 */
/* mul-int/2addr v6, p2 */
/* shr-int/lit8 v6, v6, 0xf */
/* add-int/2addr v0, v6 */
/* .line 249 */
/* const/high16 v6, -0x1000000 */
/* shl-int/lit8 v7, v4, 0x10 */
/* add-int/2addr v6, v7 */
/* shl-int/lit8 v7, v2, 0x8 */
/* add-int/2addr v6, v7 */
/* add-int/2addr v6, v0 */
} // .end method
public static final void deleteByte ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "p" # [B */
/* .prologue */
/* .line 254 */
/* array-length v1, p0 */
/* add-int/2addr v0, v1 */
/* .line 255 */
return;
} // .end method
public static final void deleteInt ( Integer[] p0 ) {
/* .locals 2 */
/* .param p0, "p" # [I */
/* .prologue */
/* .line 264 */
/* array-length v1, p0 */
/* shl-int/lit8 v1, v1, 0x2 */
/* add-int/2addr v0, v1 */
/* .line 265 */
return;
} // .end method
public static final void deleteShort ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "p" # [S */
/* .prologue */
/* .line 259 */
/* array-length v1, p0 */
/* shl-int/lit8 v1, v1, 0x1 */
/* add-int/2addr v0, v1 */
/* .line 260 */
return;
} // .end method
public static void error ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 301 */
return;
} // .end method
public static void error ( java.lang.String p0, java.lang.Throwable p1 ) {
/* .locals 0 */
/* .param p0, "s" # Ljava/lang/String; */
/* .param p1, "e" # Ljava/lang/Throwable; */
/* .prologue */
/* .line 309 */
return;
} // .end method
public static final Integer fabs ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "n" # I */
/* .prologue */
/* .line 313 */
/* if-gez p0, :cond_0 */
/* .line 314 */
/* neg-int v0, p0 */
/* .line 316 */
} // :goto_0
} // :cond_0
/* move v0, p0 */
} // .end method
public static Integer fcos ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "a" # I */
/* .prologue */
/* .line 457 */
/* add-int/lit16 v0, p0, 0x2000 */
v0 = v.V .fsin ( v0 );
} // .end method
public static final Integer fdist ( Integer p0, Integer p1 ) {
/* .locals 7 */
/* .param p0, "x" # I */
/* .param p1, "y" # I */
/* .prologue */
/* .line 462 */
/* int-to-long v0, p0 */
/* .line 463 */
/* .local v0, "t":J */
/* int-to-long v4, p0 */
/* mul-long/2addr v0, v4 */
/* .line 464 */
/* int-to-long v2, p1 */
/* .line 465 */
/* .local v2, "u":J */
/* int-to-long v4, p1 */
/* mul-long/2addr v2, v4 */
/* .line 466 */
/* add-long v4, v0, v2 */
/* const/16 v6, 0xf */
/* shr-long/2addr v4, v6 */
v4 = v.V .fsqrtl ( v4,v5 );
} // .end method
public static final Integer fdiv ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "n1" # I */
/* .param p1, "n2" # I */
/* .prologue */
/* .line 470 */
/* int-to-long v0, p0 */
/* .line 471 */
/* .local v0, "t":J */
/* const/16 v2, 0xf */
/* shl-long/2addr v0, v2 */
/* .line 472 */
/* int-to-long v2, p1 */
/* div-long/2addr v0, v2 */
/* .line 473 */
/* long-to-int v2, v0 */
} // .end method
public static final Integer finv ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "w" # I */
/* .prologue */
/* .line 488 */
int v1 = 0; // const/4 v1, 0x0
/* .line 491 */
/* .local v1, "bits":I */
/* move v0, p0 */
/* .line 492 */
/* .local v0, "a":I */
} // :goto_0
/* const v2, 0x8000 */
/* if-ge v0, v2, :cond_0 */
/* .line 505 */
v2 = v.V.m_finv;
/* aget v0, v2, v0 */
/* .line 507 */
/* shr-int/2addr v0, v1 */
/* .line 511 */
/* .line 493 */
} // :cond_0
/* shr-int/lit8 v0, v0, 0x1 */
/* .line 494 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static void finvInit ( ) {
/* .locals 4 */
/* .prologue */
/* const/high16 v3, 0x40000000 # 2.0f */
/* .line 621 */
v2 = v.V.m_finv;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 631 */
} // :goto_0
return;
/* .line 624 */
} // :cond_0
/* const v2, 0x8000 */
v.V .allocInt ( v2 );
/* .line 625 */
/* .local v1, "inv":[I */
/* .line 627 */
/* const/16 v0, 0x7fff */
/* .local v0, "i":I */
} // :goto_1
/* if-gtz v0, :cond_1 */
/* .line 630 */
int v2 = 0; // const/4 v2, 0x0
/* aput v3, v1, v2 */
/* .line 628 */
} // :cond_1
/* div-int v2, v3, v0 */
/* aput v2, v1, v0 */
/* .line 627 */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public static final Integer finvd ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "w" # I */
/* .prologue */
/* .line 529 */
/* shr-int/lit8 v2, p0, 0x1e */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 530 */
v2 = java.lang.System.out;
final String v3 = "finvd arg out of range"; // const-string v3, "finvd arg out of range"
(( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 532 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 535 */
/* .local v1, "bits":I */
/* move v0, p0 */
/* .line 539 */
/* .local v0, "a":I */
/* const/high16 v2, 0x200000 */
/* if-lt v0, v2, :cond_1 */
/* .line 541 */
/* shr-int/lit8 v0, v0, 0x6 */
/* .line 542 */
int v1 = 6; // const/4 v1, 0x6
/* .line 545 */
} // :cond_1
} // :goto_0
/* const v2, 0x8000 */
/* if-ge v0, v2, :cond_2 */
/* .line 562 */
v2 = v.V.m_finv;
/* aget v0, v2, v0 */
/* .line 564 */
/* const/16 v2, 0xf */
/* sub-int/2addr v2, v1 */
/* shl-int/2addr v0, v2 */
/* .line 568 */
/* .line 546 */
} // :cond_2
/* shr-int/lit8 v0, v0, 0x1 */
/* .line 547 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static final Integer fl2i ( Long p0 ) {
/* .locals 1 */
/* .param p0, "a" # J */
/* .prologue */
/* .line 670 */
/* long-to-int v0, p0 */
} // .end method
public static java.lang.String flt ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "f" # I */
/* .prologue */
/* .line 653 */
/* shr-int/lit8 v0, p0, 0xf */
java.lang.String .valueOf ( v0 );
} // .end method
public static final Integer fmul ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "a" # I */
/* .param p1, "b" # I */
/* .prologue */
/* .line 717 */
/* int-to-long v0, p0 */
/* .line 718 */
/* .local v0, "t":J */
/* int-to-long v2, p1 */
/* mul-long/2addr v0, v2 */
/* .line 719 */
/* const/16 v2, 0xf */
/* shr-long/2addr v0, v2 */
/* .line 727 */
/* long-to-int v2, v0 */
} // .end method
public static final Long fmul_lii ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "a" # I */
/* .param p1, "b" # I */
/* .prologue */
/* .line 658 */
/* int-to-long v0, p0 */
/* .line 659 */
/* .local v0, "t":J */
/* int-to-long v2, p1 */
/* mul-long/2addr v0, v2 */
/* .line 660 */
/* return-wide v0 */
} // .end method
public static final Integer fmuli ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "a" # I */
/* .param p1, "b" # I */
/* .prologue */
/* .line 737 */
/* mul-int v0, p0, p1 */
/* shr-int/lit8 v0, v0, 0xf */
} // .end method
public static void fprint ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "f" # I */
/* .prologue */
/* .line 743 */
v0 = java.lang.System.out;
/* const/16 v1, 0x20 */
(( java.io.PrintStream ) v0 ).print ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(C)V
/* .line 744 */
v0 = java.lang.System.out;
/* int-to-float v1, p0 */
/* const/high16 v2, 0x47000000 # 32768.0f */
/* div-float/2addr v1, v2 */
(( java.io.PrintStream ) v0 ).print ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(F)V
/* .line 746 */
return;
} // .end method
public static void fprintln ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "f" # I */
/* .prologue */
/* .line 749 */
v.V .fprint ( p0 );
/* .line 750 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).println ( ); // invoke-virtual {v0}, Ljava/io/PrintStream;->println()V
/* .line 751 */
return;
} // .end method
public static Integer fran ( ) {
/* .locals 10 */
/* .prologue */
/* const/16 v9, 0x35 */
int v8 = 1; // const/4 v8, 0x1
/* const/16 v6, 0x36 */
/* .line 762 */
v4 = v.V.m_ranbuf;
/* if-nez v4, :cond_0 */
/* .line 763 */
/* new-array v4, v6, [B */
/* .line 764 */
/* const/16 v3, 0x35 */
/* .line 765 */
/* .local v3, "rank":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "ranj":I */
} // :goto_0
/* if-lt v2, v6, :cond_1 */
/* .line 769 */
/* const/16 v4, 0x17 */
/* .line 770 */
/* .line 773 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* const-wide/16 v6, 0x1f */
/* and-long/2addr v4, v6 */
/* long-to-int v4, v4 */
/* add-int/lit8 v0, v4, 0x36 */
/* .local v0, "n":I */
/* move v1, v0 */
/* .line 774 */
} // .end local v0 # "n":I
/* .local v1, "n":I */
} // :goto_1
/* add-int/lit8 v0, v1, -0x1 */
} // .end local v1 # "n":I
/* .restart local v0 # "n":I */
/* if-gtz v1, :cond_2 */
/* .line 778 */
} // .end local v0 # "n":I
} // .end local v2 # "ranj":I
} // .end local v3 # "rank":I
} // :cond_0
/* if-nez v4, :cond_3 */
/* .line 779 */
/* .line 783 */
} // :goto_2
/* if-nez v4, :cond_4 */
/* .line 784 */
/* .line 788 */
} // :goto_3
v4 = v.V.m_ranbuf;
/* aget-byte v6, v4, v5 */
v7 = v.V.m_ranbuf;
/* aget-byte v7, v7, v8 */
/* add-int/2addr v6, v7 */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v5 */
/* .line 790 */
v4 = v.V.m_ranbuf;
/* aget-byte v4, v4, v5 */
/* and-int/lit16 v4, v4, 0xff */
/* shl-int/lit8 v4, v4, 0x7 */
/* .line 766 */
/* .restart local v2 # "ranj":I */
/* .restart local v3 # "rank":I */
} // :cond_1
/* add-int/lit8 v3, v3, 0x15 */
/* .line 767 */
v4 = v.V.m_ranbuf;
/* int-to-byte v5, v3 */
/* aput-byte v5, v4, v2 */
/* .line 765 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 775 */
/* .restart local v0 # "n":I */
} // :cond_2
v.V .fran ( );
/* move v1, v0 */
} // .end local v0 # "n":I
/* .restart local v1 # "n":I */
/* .line 781 */
} // .end local v1 # "n":I
} // .end local v2 # "ranj":I
} // .end local v3 # "rank":I
} // :cond_3
/* sub-int/2addr v4, v8 */
/* .line 786 */
} // :cond_4
/* sub-int/2addr v4, v8 */
} // .end method
public static Integer franRange ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .param p0, "lo" # I */
/* .param p1, "hi" # I */
/* .prologue */
/* .line 795 */
v0 = v.V .fran ( );
/* sub-int v1, p1, p0 */
/* add-int/lit8 v1, v1, 0x1 */
v0 = v.V .fmul ( v0,v1 );
/* add-int/2addr v0, p0 */
} // .end method
public static Integer fsin ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "a" # I */
/* .prologue */
/* .line 805 */
/* and-int/lit16 v0, p0, 0x1fff */
/* .line 807 */
/* .local v0, "i":I */
/* and-int/lit16 v2, p0, 0x2000 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 808 */
/* const/16 v2, 0x2000 */
/* sub-int v0, v2, v0 */
/* .line 810 */
} // :cond_0
v2 = v.V.m_fsin;
/* aget-short v1, v2, v0 */
/* .line 815 */
/* .local v1, "s":I */
/* and-int/lit16 v2, p0, 0x4000 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 816 */
/* neg-int v1, v1 */
/* .line 818 */
} // :cond_1
} // .end method
public static Integer fsinFast ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "a" # I */
/* .prologue */
/* .line 938 */
/* and-int/lit16 v0, p0, 0x1fff */
/* .line 940 */
/* .local v0, "i":I */
/* and-int/lit16 v3, p0, 0x2000 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 941 */
/* const/16 v3, 0x2000 */
/* sub-int v0, v3, v0 */
/* .line 943 */
} // :cond_0
/* shl-int/lit8 v3, v0, 0x2 */
/* add-int/lit16 v2, v3, -0x4000 */
/* .line 949 */
/* .local v2, "x":I */
/* mul-int v3, v2, v2 */
/* shr-int/lit8 v3, v3, 0xf */
/* mul-int/lit16 v3, v3, -0x6cd5 */
/* shr-int/lit8 v3, v3, 0xf */
/* add-int/lit16 v3, v3, 0x5b35 */
/* add-int v1, v3, v2 */
/* .line 955 */
/* .local v1, "s":I */
/* and-int/lit16 v3, p0, 0x4000 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 956 */
/* neg-int v1, v1 */
/* .line 958 */
} // :cond_1
} // .end method
public static Integer fsinFastCordic ( Integer p0 ) {
/* .locals 6 */
/* .param p0, "targetAngle" # I */
/* .prologue */
/* .line 966 */
/* shl-int/lit8 p0, p0, 0x3 */
/* .line 968 */
/* const/16 v3, 0x4dba */
/* .line 969 */
/* .local v3, "x":I */
int v4 = 0; // const/4 v4, 0x0
/* .line 970 */
/* .local v4, "y":I */
int v0 = 0; // const/4 v0, 0x0
/* .line 972 */
/* .local v0, "currAngle":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "step":I */
} // :goto_0
/* const/16 v5, 0x10 */
/* if-lt v2, v5, :cond_1 */
/* .line 994 */
/* const/16 v5, 0x7fff */
/* if-le v4, v5, :cond_0 */
/* .line 995 */
/* const/16 v4, 0x7fff */
/* .line 997 */
} // :cond_0
/* .line 974 */
} // :cond_1
/* if-le p0, v0, :cond_2 */
/* .line 975 */
/* shr-int v5, v4, v2 */
/* sub-int v1, v3, v5 */
/* .line 976 */
/* .local v1, "newx":I */
/* shr-int v5, v3, v2 */
/* add-int/2addr v4, v5 */
/* .line 977 */
/* move v3, v1 */
/* .line 978 */
v5 = v.V.m_cangles;
/* aget v5, v5, v2 */
/* add-int/2addr v0, v5 */
/* .line 972 */
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 981 */
} // .end local v1 # "newx":I
} // :cond_2
/* shr-int v5, v4, v2 */
/* add-int v1, v3, v5 */
/* .line 982 */
/* .restart local v1 # "newx":I */
/* shr-int v5, v3, v2 */
/* neg-int v5, v5 */
/* add-int/2addr v4, v5 */
/* .line 983 */
/* move v3, v1 */
/* .line 984 */
v5 = v.V.m_cangles;
/* aget v5, v5, v2 */
/* sub-int/2addr v0, v5 */
} // .end method
public static void fsinInit ( ) {
/* .locals 11 */
/* .prologue */
/* const/16 v10, 0x2000 */
/* .line 835 */
/* const/16 v2, 0x2001 */
/* .line 836 */
/* .local v2, "n":I */
v.V .allocShort ( v2 );
/* .line 839 */
/* .local v3, "t":[S */
int v1 = 1; // const/4 v1, 0x1
/* .line 849 */
/* .local v1, "make":Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 850 */
int v0 = 1; // const/4 v0, 0x1
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, v10, :cond_1 */
/* .line 862 */
/* const/16 v4, 0x7fff */
/* aput-short v4, v3, v10 */
/* .line 873 */
} // .end local v0 # "i":I
} // :cond_0
/* .line 874 */
return;
/* .line 856 */
/* .restart local v0 # "i":I */
} // :cond_1
/* const-wide/high16 v4, 0x40e0000000000000L # 32768.0 */
/* int-to-double v6, v0 */
/* const-wide v8, 0x3f2921fb54442d18L # 1.9174759848570515E-4 */
/* mul-double/2addr v6, v8 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v4, v6 */
/* double-to-int v4, v4 */
/* int-to-short v4, v4 */
/* aput-short v4, v3, v0 */
/* .line 850 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static final Integer fsqrtl ( Long p0 ) {
/* .locals 11 */
/* .param p0, "input" # J */
/* .prologue */
/* const-wide/16 v9, 0x0 */
int v8 = 1; // const/4 v8, 0x1
/* .line 1058 */
/* cmp-long v6, p0, v9 */
/* if-nez v6, :cond_0 */
/* .line 1059 */
int v6 = 0; // const/4 v6, 0x0
/* .line 1075 */
} // :goto_0
/* .line 1063 */
} // :cond_0
/* cmp-long v6, p0, v9 */
/* if-gez v6, :cond_1 */
/* .line 1064 */
/* neg-long p0, p0 */
/* .line 1067 */
} // :cond_1
/* const-wide/32 v6, 0x8000 */
/* add-long/2addr v6, p0 */
/* shr-long v4, v6, v8 */
/* .line 1069 */
/* .local v4, "x":J */
/* const/16 v6, 0xf */
/* shl-long/2addr p0, v6 */
/* .line 1072 */
} // :goto_1
/* div-long v6, p0, v4 */
/* add-long/2addr v6, v4 */
/* shr-long v2, v6, v8 */
/* .line 1073 */
/* .local v2, "newx":J */
/* sub-long v0, v4, v2 */
/* .line 1074 */
/* .local v0, "dx":J */
/* const-wide/16 v6, 0x4 */
/* cmp-long v6, v0, v6 */
/* if-gez v6, :cond_2 */
/* .line 1075 */
/* long-to-int v6, v2 */
/* .line 1076 */
} // :cond_2
/* move-wide v4, v2 */
/* .line 1071 */
} // .end method
static final Long lmul ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "a" # I */
/* .param p1, "b" # I */
/* .prologue */
/* .line 1138 */
/* int-to-long v0, p0 */
/* .line 1139 */
/* .local v0, "t":J */
/* int-to-long v2, p1 */
/* mul-long/2addr v2, v0 */
/* return-wide v2 */
} // .end method
protected static void trace ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 1223 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).println ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1224 */
return;
} // .end method
protected static void trace ( java.lang.String p0, Integer p1 ) {
/* .locals 2 */
/* .param p0, "s" # Ljava/lang/String; */
/* .param p1, "n" # I */
/* .prologue */
/* .line 1233 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).print ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
/* .line 1234 */
v0 = java.lang.System.out;
final String v1 = " "; // const-string v1, " "
(( java.io.PrintStream ) v0 ).print ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
/* .line 1235 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).println ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(I)V
/* .line 1236 */
return;
} // .end method
protected static void trace ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p0, "s" # Ljava/lang/String; */
/* .param p1, "n1" # I */
/* .param p2, "n2" # I */
/* .prologue */
final String v2 = " "; // const-string v2, " "
/* .line 1239 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).print ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
/* .line 1240 */
v0 = java.lang.System.out;
final String v1 = " "; // const-string v1, " "
(( java.io.PrintStream ) v0 ).print ( v2 ); // invoke-virtual {v0, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
/* .line 1241 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).print ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/PrintStream;->print(I)V
/* .line 1242 */
v0 = java.lang.System.out;
final String v1 = " "; // const-string v1, " "
(( java.io.PrintStream ) v0 ).print ( v2 ); // invoke-virtual {v0, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
/* .line 1243 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).println ( p2 ); // invoke-virtual {v0, p2}, Ljava/io/PrintStream;->println(I)V
/* .line 1244 */
return;
} // .end method
protected static void trace ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p0, "s1" # Ljava/lang/String; */
/* .param p1, "s2" # Ljava/lang/String; */
/* .prologue */
/* .line 1227 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).print ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
/* .line 1228 */
v0 = java.lang.System.out;
final String v1 = " "; // const-string v1, " "
(( java.io.PrintStream ) v0 ).print ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V
/* .line 1229 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).println ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1230 */
return;
} // .end method
/* # virtual methods */
public Integer fasin ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "sin" # I */
/* .prologue */
int v8 = 1; // const/4 v8, 0x1
/* .line 324 */
/* if-gez p1, :cond_1 */
/* move v4, v8 */
/* .line 325 */
/* .local v4, "neg":Z */
} // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 326 */
/* neg-int p1, p1 */
/* .line 328 */
} // :cond_0
/* const v7, 0x8000 */
/* if-lt p1, v7, :cond_3 */
/* .line 329 */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 330 */
/* const/16 v7, -0x2000 */
/* .line 367 */
} // :goto_1
/* .line 324 */
} // .end local v4 # "neg":Z
} // :cond_1
int v7 = 0; // const/4 v7, 0x0
/* move v4, v7 */
/* .line 332 */
/* .restart local v4 # "neg":Z */
} // :cond_2
/* const/16 v7, 0x2000 */
/* .line 335 */
} // :cond_3
/* int-to-short v0, p1 */
/* .line 336 */
/* .local v0, "a":S */
v5 = v.V.m_fsin;
/* .line 341 */
/* .local v5, "s":[S */
int v3 = 0; // const/4 v3, 0x0
/* .line 342 */
/* .local v3, "l":I */
/* array-length v7, v5 */
/* sub-int v6, v7, v8 */
/* .line 346 */
/* .local v6, "u":I */
} // :goto_2
/* if-gt v6, v3, :cond_5 */
/* .line 347 */
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 348 */
/* neg-int v7, v3 */
} // :cond_4
/* move v7, v3 */
/* .line 350 */
/* .line 353 */
} // :cond_5
/* add-int v7, v3, v6 */
/* shr-int/lit8 v2, v7, 0x1 */
/* .line 356 */
/* .local v2, "i":I */
/* aget-short v7, v5, v2 */
/* sub-int v1, v0, v7 */
/* .line 357 */
/* .local v1, "dif":I */
/* if-gez v1, :cond_6 */
/* .line 358 */
/* sub-int v6, v2, v8 */
/* .line 359 */
} // :cond_6
/* if-lez v1, :cond_7 */
/* .line 360 */
/* add-int/lit8 v3, v2, 0x1 */
/* .line 364 */
} // :cond_7
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 365 */
/* neg-int v7, v2 */
} // :cond_8
/* move v7, v2 */
/* .line 367 */
} // .end method
public Integer fatan2 ( Integer p0, Integer p1 ) {
/* .locals 8 */
/* .param p1, "y" # I */
/* .param p2, "x" # I */
/* .prologue */
/* .line 379 */
/* int-to-long v2, p2 */
/* int-to-long v4, p2 */
/* mul-long/2addr v2, v4 */
/* int-to-long v4, p1 */
/* int-to-long v6, p1 */
/* mul-long/2addr v4, v6 */
/* add-long/2addr v2, v4 */
/* const/16 v4, 0xf */
/* shr-long/2addr v2, v4 */
v1 = v.V .fsqrtl ( v2,v3 );
/* .line 380 */
/* .local v1, "r":I */
/* if-nez v1, :cond_0 */
/* .line 381 */
int v2 = 0; // const/4 v2, 0x0
/* .line 394 */
} // :goto_0
/* .line 383 */
} // :cond_0
v2 = v.V .fdiv ( p1,v1 );
v0 = (( v.V ) p0 ).fasin ( v2 ); // invoke-virtual {p0, v2}, Lv/V;->fasin(I)I
/* .line 385 */
/* .local v0, "angle":I */
/* if-gez p2, :cond_1 */
/* .line 386 */
/* if-ltz v0, :cond_2 */
/* .line 387 */
/* const/16 v2, 0x4000 */
/* sub-int v0, v2, v0 */
} // :cond_1
} // :goto_1
/* move v2, v0 */
/* .line 394 */
/* .line 389 */
} // :cond_2
/* const/16 v2, -0x4000 */
/* sub-int v0, v2, v0 */
} // .end method
public Integer finvs ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "x" # I */
/* .prologue */
/* .line 635 */
/* if-gez p1, :cond_0 */
/* .line 636 */
/* neg-int v0, p1 */
v0 = v.V .finv ( v0 );
/* neg-int v0, v0 */
/* .line 638 */
} // :goto_0
} // :cond_0
v0 = v.V .finv ( p1 );
} // .end method
Integer ushr ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "a" # I */
/* .param p2, "b" # I */
/* .prologue */
/* .line 1248 */
/* ushr-int v0, p1, p2 */
} // .end method
