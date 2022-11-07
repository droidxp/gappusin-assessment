public class v.V3dModel extends v.V {
	 /* .source "V3dModel.java" */
	 /* # static fields */
	 static final Integer AFFINEX;
	 static final Boolean GREYOUT;
	 static final Integer NEXTENTV;
	 static final Integer SHBITS;
	 static final Integer SHEXTRA;
	 static final Integer UFBITS;
	 static final Integer UFMASK;
	 static final Integer UFONE;
	 static final Integer UFXTRA;
	 static final Boolean USE3DS;
	 static final Integer UWBITS;
	 public static v.V3dModel m_all;
	 static m_buf;
	 static Integer m_bufi;
	 static Integer m_bufn;
	 static java.io.InputStream m_in;
	 static v.V3dMaterial m_material;
	 static Integer m_materialn;
	 static java.lang.StringBuffer m_sb;
	 /* # instance fields */
	 m_a;
	 m_b;
	 m_c;
	 Boolean m_decal;
	 public Integer m_extentRadius;
	 Integer m_lightx;
	 Integer m_lighty;
	 Integer m_lightz;
	 m_mati;
	 public java.lang.String m_name;
	 public v.V3dModel m_next;
	 m_nmap;
	 Integer m_nv;
	 m_nx;
	 m_ny;
	 m_nz;
	 m_shade;
	 public Boolean m_specular;
	 m_u;
	 m_v;
	 public Integer m_vscale;
	 public Integer m_wx;
	 public Integer m_wy;
	 public Integer m_wz;
	 m_x;
	 m_y;
	 m_z;
	 /* # direct methods */
	 public v.V3dModel ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 702 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 /* .line 703 */
		 return;
	 } // .end method
	 public static v.V3dMaterial addMaterial ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 101 */
		 v1 = v.V3dModel.m_material;
		 /* if-nez v1, :cond_0 */
		 /* .line 102 */
		 /* const/16 v1, 0x20 */
		 /* new-array v1, v1, [Lv/V3dMaterial; */
		 /* .line 105 */
	 } // :cond_0
	 /* new-instance v0, Lv/V3dMaterial; */
	 /* invoke-direct {v0}, Lv/V3dMaterial;-><init>()V */
	 /* .line 106 */
	 /* .local v0, "m":Lv/V3dMaterial; */
	 this.m_name = p0;
	 /* .line 107 */
	 /* iput v1, v0, Lv/V3dMaterial;->m_mati:I */
	 /* .line 108 */
	 v1 = v.V3dModel.m_material;
	 /* add-int/lit8 v3, v2, 0x1 */
	 /* aput-object v0, v1, v2 */
	 /* .line 109 */
} // .end method
public static void destroy ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 216 */
	 /* .line 217 */
	 /* .line 218 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 219 */
	 return;
} // .end method
public static void init ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 223 */
	 v.V3dModel .destroy ( );
	 /* .line 225 */
	 v0 = v.V.m_finv;
	 /* if-nez v0, :cond_0 */
	 /* .line 226 */
	 v.V .finvInit ( );
	 /* .line 227 */
} // :cond_0
v0 = v.V.m_fsin;
/* if-nez v0, :cond_1 */
/* .line 228 */
v.V .fsinInit ( );
/* .line 230 */
} // :cond_1
v0 = v.V3dModel.m_sb;
/* if-nez v0, :cond_2 */
/* .line 231 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 233 */
} // :cond_2
v0 = v.V3dModel.m_buf;
/* if-nez v0, :cond_3 */
/* .line 234 */
/* const/16 v0, 0x200 */
/* new-array v0, v0, [B */
/* .line 235 */
} // :cond_3
/* .line 236 */
/* .line 237 */
return;
} // .end method
public static v.V3dMaterial lookupMaterial ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 240 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, v2, :cond_0 */
/* .line 245 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* .line 241 */
} // :cond_0
v2 = v.V3dModel.m_material;
/* aget-object v1, v2, v0 */
/* .line 242 */
/* .local v1, "m":Lv/V3dMaterial; */
v2 = this.m_name;
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.m_name;
v2 = (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* move-object v2, v1 */
/* .line 243 */
/* .line 240 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static v.V3dModel lookupModel ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 249 */
v0 = v.V3dModel.m_all;
/* .line 250 */
/* .local v0, "p":Lv/V3dModel; */
} // :goto_0
/* if-nez v0, :cond_0 */
/* .line 255 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* .line 251 */
} // :cond_0
v1 = this.m_name;
v1 = (( java.lang.String ) v1 ).equals ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* move-object v1, v0 */
/* .line 252 */
/* .line 253 */
} // :cond_1
v0 = this.m_next;
} // .end method
static v.V3dModel newObject ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 262 */
/* new-instance v0, Lv/V3dModel; */
/* invoke-direct {v0}, Lv/V3dModel;-><init>()V */
/* .line 263 */
/* .local v0, "p":Lv/V3dModel; */
this.m_name = p0;
/* .line 280 */
v1 = v.V3dModel.m_all;
this.m_next = v1;
/* .line 281 */
/* .line 283 */
} // .end method
public static void open ( java.lang.String p0, v.Vilib p1 ) {
/* .locals 7 */
/* .param p0, "filename" # Ljava/lang/String; */
/* .param p1, "lib" # Lv/Vilib; */
/* .prologue */
/* .line 481 */
v.V3dModel .init ( );
/* .line 485 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 486 */
/* .local v0, "fn":Ljava/lang/StringBuffer; */
/* const/16 v1, 0x2f */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 487 */
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 488 */
final String v1 = ".bin"; // const-string v1, ".bin"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 489 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 492 */
v0 = this.m_sys;
} // .end local v0 # "fn":Ljava/lang/StringBuffer;
/* .line 494 */
v0 = v.V3dModel.m_in;
/* if-nez v0, :cond_0 */
/* .line 495 */
p1 = java.lang.System.out;
} // .end local p1 # "lib":Lv/Vilib;
final String v0 = "V3dModel open error"; // const-string v0, "V3dModel open error"
(( java.io.PrintStream ) p1 ).println ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 620 */
} // :goto_0
return;
/* .line 500 */
/* .restart local p1 # "lib":Lv/Vilib; */
} // :cond_0
v0 = v.V3dModel .read ( );
/* .line 503 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 504 */
/* .local v0, "nm":I */
/* new-array v0, v0, [Lv/V3dMaterial; */
} // .end local v0 # "nm":I
/* .line 506 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "mi":I */
/* move v1, v0 */
} // .end local v0 # "mi":I
/* .local v1, "mi":I */
} // :goto_1
/* if-lt v1, v0, :cond_1 */
/* .line 547 */
} // .end local v1 # "mi":I
} // :goto_2
v.V3dModel .readString ( );
/* .line 549 */
/* .local v1, "name":Ljava/lang/String; */
/* if-nez v1, :cond_4 */
/* .line 590 */
v0 = v.V3dModel.m_in;
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
/* .line 591 */
int v0 = 0; // const/4 v0, 0x0
/* .line 594 */
int v0 = 0; // const/4 v0, 0x0
/* .restart local v0 # "mi":I */
/* move v6, v0 */
} // .end local v0 # "mi":I
} // .end local v1 # "name":Ljava/lang/String;
/* .local v6, "mi":I */
} // :goto_3
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-lt v6, v0, :cond_5 */
/* .line 618 */
} // .end local v6 # "mi":I
} // .end local p1 # "lib":Lv/Vilib;
} // :goto_4
int p1 = 0; // const/4 p1, 0x0
/* .line 619 */
int p1 = 0; // const/4 p1, 0x0
/* .line 507 */
/* .local v1, "mi":I */
/* .restart local p1 # "lib":Lv/Vilib; */
} // :cond_1
try { // :try_start_1
/* new-instance v0, Lv/V3dMaterial; */
/* invoke-direct {v0}, Lv/V3dMaterial;-><init>()V */
/* .line 508 */
/* .local v0, "m":Lv/V3dMaterial; */
v2 = v.V3dModel.m_material;
/* aput-object v0, v2, v1 */
/* .line 510 */
v.V3dModel .readString ( );
this.m_name = v2;
/* .line 512 */
v.V3dModel .readString ( );
/* .line 514 */
/* .local v2, "name":Ljava/lang/String; */
/* if-nez v2, :cond_2 */
/* .line 515 */
v2 = v.V3dModel .readInt ( );
} // .end local v2 # "name":Ljava/lang/String;
/* iput v2, v0, Lv/V3dMaterial;->m_diffuse:I */
/* .line 506 */
} // .end local v0 # "m":Lv/V3dMaterial;
} // :goto_5
/* add-int/lit8 v0, v1, 0x1 */
} // .end local v1 # "mi":I
/* .local v0, "mi":I */
/* move v1, v0 */
} // .end local v0 # "mi":I
/* .restart local v1 # "mi":I */
/* .line 537 */
/* .local v0, "m":Lv/V3dMaterial; */
/* .restart local v2 # "name":Ljava/lang/String; */
} // :cond_2
/* new-instance v3, Lv/V3dTexture; */
/* invoke-direct {v3}, Lv/V3dTexture;-><init>()V */
this.m_texture = v3;
/* .line 538 */
v3 = this.m_texture;
this.m_filename = v2;
/* .line 540 */
v2 = v.V3dModel .read ( );
} // .end local v2 # "name":Ljava/lang/String;
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_3 */
int v2 = 1; // const/4 v2, 0x1
} // :goto_6
/* iput-boolean v2, v0, Lv/V3dMaterial;->m_selfIlluminated:Z */
/* .line 541 */
v0 = this.m_texture;
} // .end local v0 # "m":Lv/V3dMaterial;
v2 = v.V3dModel .read ( );
/* iput v2, v0, Lv/V3dTexture;->m_scaleBits:I */
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 614 */
} // .end local v1 # "mi":I
} // .end local p1 # "lib":Lv/Vilib;
/* :catch_0 */
/* move-exception p1 */
/* .line 615 */
/* .local p1, "e":Ljava/io/IOException; */
p1 = java.lang.System.out;
} // .end local p1 # "e":Ljava/io/IOException;
final String v0 = "V3dModel open error"; // const-string v0, "V3dModel open error"
(( java.io.PrintStream ) p1 ).println ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 540 */
/* .restart local v0 # "m":Lv/V3dMaterial; */
/* .restart local v1 # "mi":I */
/* .local p1, "lib":Lv/Vilib; */
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
/* .line 555 */
} // .end local v0 # "m":Lv/V3dMaterial;
/* .local v1, "name":Ljava/lang/String; */
} // :cond_4
try { // :try_start_2
/* new-instance v0, Lv/V3dModel; */
/* invoke-direct {v0}, Lv/V3dModel;-><init>()V */
/* .line 556 */
/* .local v0, "m":Lv/V3dModel; */
v2 = v.V3dModel.m_all;
this.m_next = v2;
/* .line 557 */
/* .line 559 */
this.m_name = v1;
/* .line 560 */
v1 = v.V3dModel .readInt ( );
} // .end local v1 # "name":Ljava/lang/String;
/* iput v1, v0, Lv/V3dModel;->m_vscale:I */
/* .line 561 */
v1 = v.V3dModel .readInt ( );
/* iput v1, v0, Lv/V3dModel;->m_wx:I */
/* .line 562 */
v1 = v.V3dModel .readInt ( );
/* iput v1, v0, Lv/V3dModel;->m_wy:I */
/* .line 563 */
v1 = v.V3dModel .readInt ( );
/* iput v1, v0, Lv/V3dModel;->m_wz:I */
/* .line 568 */
v1 = v.V3dModel .readShort ( );
/* .line 569 */
/* .local v1, "n":I */
(( v.V3dModel ) v0 ).allocVertices ( v1 ); // invoke-virtual {v0, v1}, Lv/V3dModel;->allocVertices(I)V
/* .line 570 */
v2 = this.m_x;
v.V3dModel .readShortArray ( v2,v1 );
/* .line 571 */
v2 = this.m_y;
v.V3dModel .readShortArray ( v2,v1 );
/* .line 572 */
v2 = this.m_z;
v.V3dModel .readShortArray ( v2,v1 );
/* .line 573 */
v2 = this.m_u;
v.V3dModel .readShortArray ( v2,v1 );
/* .line 574 */
v2 = this.m_v;
v.V3dModel .readShortArray ( v2,v1 );
/* .line 577 */
v1 = v.V3dModel .readShort ( );
/* .line 578 */
/* new-array v2, v1, [S */
this.m_nmap = v2;
/* .line 579 */
v2 = this.m_nmap;
v.V3dModel .readShortArray ( v2,v1 );
/* .line 581 */
v1 = v.V3dModel .readShort ( );
/* .line 582 */
(( v.V3dModel ) v0 ).allocFaces ( v1 ); // invoke-virtual {v0, v1}, Lv/V3dModel;->allocFaces(I)V
/* .line 583 */
v2 = this.m_a;
v.V3dModel .readShortArray ( v2,v1 );
/* .line 584 */
v2 = this.m_b;
v.V3dModel .readShortArray ( v2,v1 );
/* .line 585 */
v2 = this.m_c;
v.V3dModel .readShortArray ( v2,v1 );
/* .line 586 */
v0 = this.m_mati;
} // .end local v0 # "m":Lv/V3dModel;
v.V3dModel .readByteArray ( v0,v1 );
/* goto/16 :goto_2 */
/* .line 595 */
} // .end local v1 # "n":I
/* .restart local v6 # "mi":I */
} // :cond_5
v0 = v.V3dModel.m_material;
/* aget-object v2, v0, v6 */
/* .line 596 */
/* .local v2, "m":Lv/V3dMaterial; */
v0 = this.m_texture;
/* .line 597 */
/* .local v0, "t":Lv/V3dTexture; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 598 */
v1 = this.m_filename;
v1 = (( v.Vilib ) p1 ).lookup ( v1 ); // invoke-virtual {p1, v1}, Lv/Vilib;->lookup(Ljava/lang/String;)I
/* .line 599 */
/* .local v1, "i":I */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v1, v3, :cond_7 */
/* .line 594 */
} // .end local v0 # "t":Lv/V3dTexture;
} // .end local v1 # "i":I
} // .end local v2 # "m":Lv/V3dMaterial;
} // :cond_6
} // :goto_7
/* add-int/lit8 v0, v6, 0x1 */
} // .end local v6 # "mi":I
/* .local v0, "mi":I */
/* move v6, v0 */
} // .end local v0 # "mi":I
/* .restart local v6 # "mi":I */
/* goto/16 :goto_3 */
/* .line 604 */
/* .local v0, "t":Lv/V3dTexture; */
/* .restart local v1 # "i":I */
/* .restart local v2 # "m":Lv/V3dMaterial; */
} // :cond_7
(( v.Vilib ) p1 ).loadPicture ( v1 ); // invoke-virtual {p1, v1}, Lv/Vilib;->loadPicture(I)Lv/Vpicture;
/* .line 605 */
/* .local v5, "pic":Lv/Vpicture; */
/* if-nez v5, :cond_8 */
/* .line 606 */
int v0 = 0; // const/4 v0, 0x0
this.m_texture = v0;
/* .line 608 */
} // :cond_8
v1 = this.m_filename;
} // .end local v1 # "i":I
v2 = this.m_rgb;
} // .end local v2 # "m":Lv/V3dMaterial;
/* iget-short v3, v5, Lv/Vpicture;->m_width:S */
/* iget-short v4, v5, Lv/Vpicture;->m_height:S */
/* iget-boolean v5, v5, Lv/Vpicture;->m_opaque:Z */
} // .end local v5 # "pic":Lv/Vpicture;
if ( v5 != null) { // if-eqz v5, :cond_9
int v5 = 0; // const/4 v5, 0x0
} // :goto_8
/* invoke-virtual/range {v0 ..v5}, Lv/V3dTexture;->set(Ljava/lang/String;[IIIZ)V */
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
} // :cond_9
int v5 = 1; // const/4 v5, 0x1
} // .end method
static Integer read ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 623 */
/* if-lt v0, v1, :cond_0 */
/* .line 624 */
/* .line 625 */
v0 = v.V3dModel.m_in;
v1 = v.V3dModel.m_buf;
v2 = v.V3dModel.m_buf;
/* array-length v2, v2 */
v0 = (( java.io.InputStream ) v0 ).read ( v1, v3, v2 ); // invoke-virtual {v0, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I
/* .line 626 */
/* if-gez v0, :cond_0 */
/* .line 627 */
int v0 = -1; // const/4 v0, -0x1
/* .line 629 */
} // :goto_0
} // :cond_0
v0 = v.V3dModel.m_buf;
/* add-int/lit8 v2, v1, 0x1 */
/* aget-byte v0, v0, v1 */
/* and-int/lit16 v0, v0, 0xff */
} // .end method
static void readByteArray ( Object[] p0, Integer p1 ) {
/* .locals 2 */
/* .param p0, "a" # [B */
/* .param p1, "n" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 633 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, p1, :cond_0 */
/* .line 635 */
return;
/* .line 634 */
} // :cond_0
v1 = v.V3dModel .read ( );
/* int-to-byte v1, v1 */
/* aput-byte v1, p0, v0 */
/* .line 633 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
static Integer readInt ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 638 */
v1 = v.V3dModel .readShort ( );
/* shl-int/lit8 v0, v1, 0x10 */
/* .line 639 */
/* .local v0, "s":I */
v1 = v.V3dModel .readShort ( );
/* or-int/2addr v1, v0 */
} // .end method
static Integer readShort ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 643 */
v1 = v.V3dModel .read ( );
/* shl-int/lit8 v0, v1, 0x8 */
/* .line 644 */
/* .local v0, "s":I */
v1 = v.V3dModel .read ( );
/* or-int/2addr v1, v0 */
} // .end method
static void readShortArray ( Object[] p0, Integer p1 ) {
/* .locals 7 */
/* .param p0, "a" # [S */
/* .param p1, "n" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v6 = 1; // const/4 v6, 0x1
/* .line 649 */
/* .line 650 */
/* .local v0, "bi":I */
/* sub-int v2, v5, v6 */
/* .line 652 */
/* .local v2, "bn":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
/* move v1, v0 */
} // .end local v0 # "bi":I
/* .local v1, "bi":I */
} // :goto_0
/* if-lt v3, p1, :cond_0 */
/* .line 669 */
/* .line 670 */
return;
/* .line 656 */
} // :cond_0
/* if-ge v1, v2, :cond_1 */
/* .line 657 */
v5 = v.V3dModel.m_buf;
/* add-int/lit8 v0, v1, 0x1 */
} // .end local v1 # "bi":I
/* .restart local v0 # "bi":I */
/* aget-byte v5, v5, v1 */
/* shl-int/lit8 v4, v5, 0x8 */
/* .line 658 */
/* .local v4, "s":I */
v5 = v.V3dModel.m_buf;
/* add-int/lit8 v1, v0, 0x1 */
} // .end local v0 # "bi":I
/* .restart local v1 # "bi":I */
/* aget-byte v5, v5, v0 */
/* and-int/lit16 v5, v5, 0xff */
/* or-int/2addr v5, v4 */
/* int-to-short v5, v5 */
/* aput-short v5, p0, v3 */
/* move v0, v1 */
/* .line 652 */
} // .end local v1 # "bi":I
/* .restart local v0 # "bi":I */
} // :goto_1
/* add-int/lit8 v3, v3, 0x1 */
/* move v1, v0 */
} // .end local v0 # "bi":I
/* .restart local v1 # "bi":I */
/* .line 661 */
} // .end local v4 # "s":I
} // :cond_1
/* .line 662 */
v5 = v.V3dModel .read ( );
/* shl-int/lit8 v4, v5, 0x8 */
/* .line 663 */
/* .restart local v4 # "s":I */
v5 = v.V3dModel .read ( );
/* or-int/2addr v5, v4 */
/* int-to-short v5, v5 */
/* aput-short v5, p0, v3 */
/* .line 665 */
/* .line 666 */
} // .end local v1 # "bi":I
/* .restart local v0 # "bi":I */
/* sub-int v2, v5, v6 */
} // .end method
static java.lang.String readString ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 675 */
v0 = v.V3dModel .readShort ( );
/* .line 676 */
/* .local v0, "nc":I */
/* if-nez v0, :cond_0 */
/* .line 677 */
int v1 = 0; // const/4 v1, 0x0
/* .line 685 */
} // :goto_0
/* .line 680 */
} // :cond_0
v1 = v.V3dModel.m_sb;
int v2 = 0; // const/4 v2, 0x0
(( java.lang.StringBuffer ) v1 ).setLength ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 681 */
} // :goto_1
/* if-nez v0, :cond_1 */
/* .line 685 */
v1 = v.V3dModel.m_sb;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 682 */
} // :cond_1
v1 = v.V3dModel.m_sb;
v2 = v.V3dModel .read ( );
/* int-to-char v2, v2 */
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 683 */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
/* # virtual methods */
void allocFaces ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "nf" # I */
/* .prologue */
/* .line 113 */
v.V3dModel .allocShort ( p1 );
this.m_a = v0;
/* .line 114 */
v.V3dModel .allocShort ( p1 );
this.m_b = v0;
/* .line 115 */
v.V3dModel .allocShort ( p1 );
this.m_c = v0;
/* .line 116 */
v.V3dModel .allocByte ( p1 );
this.m_mati = v0;
/* .line 122 */
return;
} // .end method
void allocVertices ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "nv" # I */
/* .prologue */
/* .line 126 */
/* const/16 v0, 0x8 */
/* sub-int v0, p1, v0 */
/* iput v0, p0, Lv/V3dModel;->m_nv:I */
/* .line 133 */
v.V3dModel .allocShort ( p1 );
this.m_u = v0;
/* .line 134 */
v.V3dModel .allocShort ( p1 );
this.m_v = v0;
/* .line 136 */
v.V3dModel .allocShort ( p1 );
this.m_x = v0;
/* .line 137 */
v.V3dModel .allocShort ( p1 );
this.m_y = v0;
/* .line 138 */
v.V3dModel .allocShort ( p1 );
this.m_z = v0;
/* .line 139 */
return;
} // .end method
void calcExtent ( ) {
/* .locals 15 */
/* .prologue */
/* const/16 v14, 0x8 */
/* .line 148 */
v5 = this.m_x;
/* .line 149 */
/* .local v5, "xw":[S */
v9 = this.m_y;
/* .line 150 */
/* .local v9, "yw":[S */
v13 = this.m_z;
/* .line 152 */
/* .local v13, "zw":[S */
/* const/16 v4, 0x7fff */
/* .line 153 */
/* .local v4, "xmin":S */
/* const/16 v3, -0x8000 */
/* .line 154 */
/* .local v3, "xmax":S */
/* const/16 v8, 0x7fff */
/* .line 155 */
/* .local v8, "ymin":S */
/* const/16 v7, -0x8000 */
/* .line 156 */
/* .local v7, "ymax":S */
/* const/16 v12, 0x7fff */
/* .line 157 */
/* .local v12, "zmin":S */
/* const/16 v11, -0x8000 */
/* .line 159 */
/* .local v11, "zmax":S */
/* array-length v1, v5 */
/* .line 161 */
/* .local v1, "nv":I */
/* sub-int v0, v1, v14 */
/* .local v0, "i":I */
} // :goto_0
/* if-gez v0, :cond_0 */
/* .line 188 */
/* sub-int v0, v1, v14 */
/* .line 190 */
/* add-int/lit8 v14, v0, 0x0 */
/* aput-short v3, v5, v14 */
/* .line 191 */
/* add-int/lit8 v14, v0, 0x1 */
/* aput-short v3, v5, v14 */
/* .line 192 */
/* add-int/lit8 v14, v0, 0x2 */
/* aput-short v3, v5, v14 */
/* .line 193 */
/* add-int/lit8 v14, v0, 0x3 */
/* aput-short v3, v5, v14 */
/* .line 194 */
/* add-int/lit8 v14, v0, 0x4 */
/* aput-short v4, v5, v14 */
/* .line 195 */
/* add-int/lit8 v14, v0, 0x5 */
/* aput-short v4, v5, v14 */
/* .line 196 */
/* add-int/lit8 v14, v0, 0x6 */
/* aput-short v4, v5, v14 */
/* .line 197 */
/* add-int/lit8 v14, v0, 0x7 */
/* aput-short v4, v5, v14 */
/* .line 199 */
/* add-int/lit8 v14, v0, 0x0 */
/* aput-short v7, v9, v14 */
/* .line 200 */
/* add-int/lit8 v14, v0, 0x1 */
/* aput-short v7, v9, v14 */
/* .line 201 */
/* add-int/lit8 v14, v0, 0x2 */
/* aput-short v8, v9, v14 */
/* .line 202 */
/* add-int/lit8 v14, v0, 0x3 */
/* aput-short v8, v9, v14 */
/* .line 203 */
/* add-int/lit8 v14, v0, 0x4 */
/* aput-short v7, v9, v14 */
/* .line 204 */
/* add-int/lit8 v14, v0, 0x5 */
/* aput-short v7, v9, v14 */
/* .line 205 */
/* add-int/lit8 v14, v0, 0x6 */
/* aput-short v8, v9, v14 */
/* .line 206 */
/* add-int/lit8 v14, v0, 0x7 */
/* aput-short v8, v9, v14 */
/* .line 208 */
} // :goto_1
/* if-lt v0, v1, :cond_7 */
/* .line 212 */
return;
/* .line 162 */
} // :cond_0
/* aget-short v2, v5, v0 */
/* .line 163 */
/* .local v2, "x":S */
/* if-le v4, v2, :cond_1 */
/* .line 164 */
/* move v4, v2 */
/* .line 165 */
} // :cond_1
/* if-ge v3, v2, :cond_2 */
/* .line 166 */
/* move v3, v2 */
/* .line 167 */
} // :cond_2
/* aget-short v6, v9, v0 */
/* .line 168 */
/* .local v6, "y":S */
/* if-le v8, v6, :cond_3 */
/* .line 169 */
/* move v8, v6 */
/* .line 170 */
} // :cond_3
/* if-ge v7, v6, :cond_4 */
/* .line 171 */
/* move v7, v6 */
/* .line 172 */
} // :cond_4
/* aget-short v10, v13, v0 */
/* .line 173 */
/* .local v10, "z":S */
/* if-le v12, v10, :cond_5 */
/* .line 174 */
/* move v12, v10 */
/* .line 175 */
} // :cond_5
/* if-ge v11, v10, :cond_6 */
/* .line 176 */
/* move v11, v2 */
/* .line 161 */
} // :cond_6
/* add-int/lit8 v0, v0, -0x1 */
/* .line 209 */
} // .end local v2 # "x":S
} // .end local v6 # "y":S
} // .end local v10 # "z":S
} // :cond_7
/* aput-short v11, v13, v0 */
/* .line 210 */
/* add-int/lit8 v14, v0, 0x1 */
/* aput-short v12, v13, v14 */
/* .line 208 */
/* add-int/lit8 v0, v0, 0x2 */
} // .end method
final void normals ( ) {
/* .locals 42 */
/* .prologue */
/* .line 288 */
/* move-object/from16 v0, p0 */
v0 = this.m_nmap;
/* move-object/from16 v19, v0 */
/* .line 290 */
/* .local v19, "nmap":[S */
/* if-nez v19, :cond_0 */
/* .line 294 */
/* const/16 v39, 0x0 */
/* move/from16 v0, v39 */
/* new-array v0, v0, [S */
/* move-object/from16 v19, v0 */
/* .line 295 */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p0 */
this.m_nmap = v0;
/* .line 298 */
} // :cond_0
/* move-object/from16 v0, p0 */
v0 = this.m_a;
/* move-object v12, v0 */
/* .line 299 */
/* .local v12, "ma":[S */
/* move-object/from16 v0, p0 */
v0 = this.m_b;
/* move-object v14, v0 */
/* .line 300 */
/* .local v14, "mb":[S */
/* move-object/from16 v0, p0 */
v0 = this.m_c;
/* move-object v15, v0 */
/* .line 301 */
/* .local v15, "mc":[S */
/* move-object/from16 v0, p0 */
v0 = this.m_mati;
/* move-object v13, v0 */
/* .line 304 */
/* .local v13, "mati":[B */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dModel;->m_nv:I */
/* move/from16 v21, v0 */
/* .line 305 */
/* .local v21, "nv":I */
/* move-object/from16 v0, p0 */
v0 = this.m_nmap;
/* move-object/from16 v39, v0 */
/* move-object/from16 v0, v39 */
/* array-length v0, v0 */
/* move/from16 v39, v0 */
/* add-int v20, v21, v39 */
/* .line 307 */
/* .local v20, "nn":I */
/* move/from16 v0, v20 */
/* new-array v0, v0, [S */
/* move-object/from16 v23, v0 */
/* .line 308 */
/* .local v23, "nxa":[S */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, p0 */
this.m_nx = v0;
/* .line 310 */
/* move/from16 v0, v20 */
/* new-array v0, v0, [S */
/* move-object/from16 v26, v0 */
/* .line 311 */
/* .local v26, "nya":[S */
/* move-object/from16 v0, v26 */
/* move-object/from16 v1, p0 */
this.m_ny = v0;
/* .line 313 */
/* move/from16 v0, v20 */
/* new-array v0, v0, [S */
/* move-object/from16 v29, v0 */
/* .line 314 */
/* .local v29, "nza":[S */
/* move-object/from16 v0, v29 */
/* move-object/from16 v1, p0 */
this.m_nz = v0;
/* .line 316 */
/* move/from16 v0, v20 */
/* new-array v0, v0, [S */
/* move-object/from16 v39, v0 */
/* move-object/from16 v0, v39 */
/* move-object/from16 v1, p0 */
this.m_shade = v0;
/* .line 320 */
/* const/16 v39, 0x0 */
/* aget-byte v10, v13, v39 */
/* .line 321 */
/* .local v10, "fma":I */
v39 = v.V3dModel.m_material;
/* aget-object v16, v39, v10 */
/* .line 322 */
/* .local v16, "mt":Lv/V3dMaterial; */
/* move-object/from16 v0, v16 */
/* iget-boolean v0, v0, Lv/V3dMaterial;->m_selfIlluminated:Z */
/* move/from16 v39, v0 */
/* if-nez v39, :cond_1 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lv/V3dModel;->m_decal:Z */
/* move/from16 v39, v0 */
if ( v39 != null) { // if-eqz v39, :cond_4
/* .line 323 */
} // :cond_1
/* move/from16 v11, v20 */
/* .line 324 */
/* .local v11, "i":I */
} // :goto_0
/* add-int/lit8 v11, v11, -0x1 */
/* if-gez v11, :cond_3 */
/* .line 472 */
} // :cond_2
return;
/* .line 325 */
} // :cond_3
/* const/16 v39, 0x7fff */
/* aput-short v39, v26, v11 */
/* .line 332 */
} // .end local v11 # "i":I
} // :cond_4
/* move/from16 v0, v20 */
/* new-array v0, v0, [B */
/* move-object/from16 v18, v0 */
/* .line 333 */
/* .local v18, "nca":[B */
/* move/from16 v0, v20 */
/* new-array v0, v0, [I */
/* move-object/from16 v24, v0 */
/* .line 334 */
/* .local v24, "nxt":[I */
/* move/from16 v0, v20 */
/* new-array v0, v0, [I */
/* move-object/from16 v27, v0 */
/* .line 335 */
/* .local v27, "nyt":[I */
/* move/from16 v0, v20 */
/* new-array v0, v0, [I */
/* move-object/from16 v30, v0 */
/* .line 337 */
/* .local v30, "nzt":[I */
/* move-object/from16 v0, p0 */
v0 = this.m_x;
/* move-object/from16 v34, v0 */
/* .line 338 */
/* .local v34, "xw":[S */
/* move-object/from16 v0, p0 */
v0 = this.m_y;
/* move-object/from16 v36, v0 */
/* .line 339 */
/* .local v36, "yw":[S */
/* move-object/from16 v0, p0 */
v0 = this.m_z;
/* move-object/from16 v38, v0 */
/* .line 343 */
/* .local v38, "zw":[S */
/* new-instance v31, Lv/Vector; */
/* invoke-direct/range {v31 ..v31}, Lv/Vector;-><init>()V */
/* .line 344 */
/* .local v31, "u":Lv/Vector; */
/* new-instance v32, Lv/Vector; */
/* invoke-direct/range {v32 ..v32}, Lv/Vector;-><init>()V */
/* .line 346 */
/* .local v32, "v":Lv/Vector; */
/* array-length v11, v12 */
/* .line 347 */
/* .restart local v11 # "i":I */
} // :goto_1
/* add-int/lit8 v11, v11, -0x1 */
/* if-gez v11, :cond_9 */
/* .line 431 */
/* move/from16 v11, v20 */
/* .line 432 */
} // :goto_2
/* add-int/lit8 v11, v11, -0x1 */
/* if-ltz v11, :cond_2 */
/* .line 433 */
/* aget-byte v17, v18, v11 */
/* .line 434 */
/* .local v17, "n":I */
if ( v17 != null) { // if-eqz v17, :cond_10
/* .line 438 */
/* aget v39, v24, v11 */
/* aget v40, v27, v11 */
/* aget v41, v30, v11 */
/* move-object/from16 v0, v32 */
/* move/from16 v1, v39 */
/* move/from16 v2, v40 */
/* move/from16 v3, v41 */
(( v.Vector ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vector;->set(III)V
/* .line 440 */
/* const/16 v39, 0x1 */
/* move/from16 v0, v17 */
/* move/from16 v1, v39 */
/* if-le v0, v1, :cond_5 */
/* .line 441 */
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v39, v0 */
/* div-int v39, v39, v17 */
/* move/from16 v0, v39 */
/* move-object/from16 v1, v32 */
/* iput v0, v1, Lv/Vector;->m_x:I */
/* .line 442 */
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_y:I */
/* move/from16 v39, v0 */
/* div-int v39, v39, v17 */
/* move/from16 v0, v39 */
/* move-object/from16 v1, v32 */
/* iput v0, v1, Lv/Vector;->m_y:I */
/* .line 443 */
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v39, v0 */
/* div-int v39, v39, v17 */
/* move/from16 v0, v39 */
/* move-object/from16 v1, v32 */
/* iput v0, v1, Lv/Vector;->m_z:I */
/* .line 446 */
} // :cond_5
/* invoke-virtual/range {v32 ..v32}, Lv/Vector;->normalize()V */
/* .line 449 */
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v39, v0 */
/* const v40, 0x8000 */
/* move/from16 v0, v39 */
/* move/from16 v1, v40 */
/* if-lt v0, v1, :cond_d */
/* .line 450 */
/* const/16 v39, 0x7fff */
/* move/from16 v0, v39 */
/* move-object/from16 v1, v32 */
/* iput v0, v1, Lv/Vector;->m_x:I */
/* .line 454 */
} // :cond_6
} // :goto_3
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_y:I */
/* move/from16 v39, v0 */
/* const v40, 0x8000 */
/* move/from16 v0, v39 */
/* move/from16 v1, v40 */
/* if-lt v0, v1, :cond_e */
/* .line 455 */
/* const/16 v39, 0x7fff */
/* move/from16 v0, v39 */
/* move-object/from16 v1, v32 */
/* iput v0, v1, Lv/Vector;->m_y:I */
/* .line 459 */
} // :cond_7
} // :goto_4
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v39, v0 */
/* const v40, 0x8000 */
/* move/from16 v0, v39 */
/* move/from16 v1, v40 */
/* if-lt v0, v1, :cond_f */
/* .line 460 */
/* const/16 v39, 0x7fff */
/* move/from16 v0, v39 */
/* move-object/from16 v1, v32 */
/* iput v0, v1, Lv/Vector;->m_z:I */
/* .line 464 */
} // :cond_8
} // :goto_5
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v39, v0 */
/* move/from16 v0, v39 */
/* int-to-short v0, v0 */
/* move/from16 v39, v0 */
/* aput-short v39, v23, v11 */
/* .line 465 */
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_y:I */
/* move/from16 v39, v0 */
/* move/from16 v0, v39 */
/* int-to-short v0, v0 */
/* move/from16 v39, v0 */
/* aput-short v39, v26, v11 */
/* .line 466 */
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v39, v0 */
/* move/from16 v0, v39 */
/* int-to-short v0, v0 */
/* move/from16 v39, v0 */
/* aput-short v39, v29, v11 */
/* goto/16 :goto_2 */
/* .line 348 */
} // .end local v17 # "n":I
} // :cond_9
/* aget-short v4, v12, v11 */
/* .line 351 */
/* .local v4, "a":I */
/* move v5, v4 */
/* .line 352 */
/* .local v5, "ai":I */
/* move v0, v5 */
/* move/from16 v1, v21 */
/* if-lt v0, v1, :cond_a */
/* .line 353 */
/* sub-int v39, v5, v21 */
/* aget-short v5, v19, v39 */
/* .line 355 */
} // :cond_a
/* aget-short v6, v14, v11 */
/* .line 357 */
/* .local v6, "b":I */
/* move v7, v6 */
/* .line 358 */
/* .local v7, "bi":I */
/* move v0, v7 */
/* move/from16 v1, v21 */
/* if-lt v0, v1, :cond_b */
/* .line 359 */
/* sub-int v39, v7, v21 */
/* aget-short v7, v19, v39 */
/* .line 361 */
} // :cond_b
/* aget-short v8, v15, v11 */
/* .line 363 */
/* .local v8, "c":I */
/* move v9, v8 */
/* .line 364 */
/* .local v9, "ci":I */
/* move v0, v9 */
/* move/from16 v1, v21 */
/* if-lt v0, v1, :cond_c */
/* .line 365 */
/* sub-int v39, v9, v21 */
/* aget-short v9, v19, v39 */
/* .line 376 */
} // :cond_c
/* aget-short v33, v34, v7 */
/* .line 377 */
/* .local v33, "xb":I */
/* aget-short v35, v36, v7 */
/* .line 378 */
/* .local v35, "yb":I */
/* aget-short v37, v38, v7 */
/* .line 385 */
/* .local v37, "zb":I */
/* aget-short v39, v34, v5 */
/* sub-int v39, v39, v33 */
/* aget-short v40, v36, v5 */
/* sub-int v40, v40, v35 */
/* aget-short v41, v38, v5 */
/* sub-int v41, v41, v37 */
/* move-object/from16 v0, v31 */
/* move/from16 v1, v39 */
/* move/from16 v2, v40 */
/* move/from16 v3, v41 */
(( v.Vector ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vector;->set(III)V
/* .line 386 */
/* aget-short v39, v34, v9 */
/* sub-int v39, v39, v33 */
/* aget-short v40, v36, v9 */
/* sub-int v40, v40, v35 */
/* aget-short v41, v38, v9 */
/* sub-int v41, v41, v37 */
/* move-object/from16 v0, v32 */
/* move/from16 v1, v39 */
/* move/from16 v2, v40 */
/* move/from16 v3, v41 */
(( v.Vector ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vector;->set(III)V
/* .line 388 */
/* const/16 v39, 0xf */
/* move-object/from16 v0, v31 */
/* move/from16 v1, v39 */
(( v.Vector ) v0 ).lsh ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->lsh(I)V
/* .line 389 */
/* const/16 v39, 0xf */
/* move-object/from16 v0, v32 */
/* move/from16 v1, v39 */
(( v.Vector ) v0 ).lsh ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->lsh(I)V
/* .line 391 */
/* move-object/from16 v0, v32 */
/* move-object/from16 v1, v31 */
/* move-object/from16 v2, v32 */
(( v.Vector ) v0 ).crossProductNormalized ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vector;->crossProductNormalized(Lv/Vector;Lv/Vector;)V
/* .line 393 */
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v22, v0 */
/* .line 394 */
/* .local v22, "nx":I */
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_y:I */
/* move/from16 v25, v0 */
/* .line 395 */
/* .local v25, "ny":I */
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v28, v0 */
/* .line 414 */
/* .local v28, "nz":I */
/* aget-byte v39, v18, v4 */
/* add-int/lit8 v39, v39, 0x1 */
/* move/from16 v0, v39 */
/* int-to-byte v0, v0 */
/* move/from16 v39, v0 */
/* aput-byte v39, v18, v4 */
/* .line 415 */
/* aget v39, v24, v4 */
/* add-int v39, v39, v22 */
/* aput v39, v24, v4 */
/* .line 416 */
/* aget v39, v27, v4 */
/* add-int v39, v39, v25 */
/* aput v39, v27, v4 */
/* .line 417 */
/* aget v39, v30, v4 */
/* add-int v39, v39, v28 */
/* aput v39, v30, v4 */
/* .line 419 */
/* aget-byte v39, v18, v6 */
/* add-int/lit8 v39, v39, 0x1 */
/* move/from16 v0, v39 */
/* int-to-byte v0, v0 */
/* move/from16 v39, v0 */
/* aput-byte v39, v18, v6 */
/* .line 420 */
/* aget v39, v24, v6 */
/* add-int v39, v39, v22 */
/* aput v39, v24, v6 */
/* .line 421 */
/* aget v39, v27, v6 */
/* add-int v39, v39, v25 */
/* aput v39, v27, v6 */
/* .line 422 */
/* aget v39, v30, v6 */
/* add-int v39, v39, v28 */
/* aput v39, v30, v6 */
/* .line 424 */
/* aget-byte v39, v18, v8 */
/* add-int/lit8 v39, v39, 0x1 */
/* move/from16 v0, v39 */
/* int-to-byte v0, v0 */
/* move/from16 v39, v0 */
/* aput-byte v39, v18, v8 */
/* .line 425 */
/* aget v39, v24, v8 */
/* add-int v39, v39, v22 */
/* aput v39, v24, v8 */
/* .line 426 */
/* aget v39, v27, v8 */
/* add-int v39, v39, v25 */
/* aput v39, v27, v8 */
/* .line 427 */
/* aget v39, v30, v8 */
/* add-int v39, v39, v28 */
/* aput v39, v30, v8 */
/* goto/16 :goto_1 */
/* .line 451 */
} // .end local v4 # "a":I
} // .end local v5 # "ai":I
} // .end local v6 # "b":I
} // .end local v7 # "bi":I
} // .end local v8 # "c":I
} // .end local v9 # "ci":I
} // .end local v22 # "nx":I
} // .end local v25 # "ny":I
} // .end local v28 # "nz":I
} // .end local v33 # "xb":I
} // .end local v35 # "yb":I
} // .end local v37 # "zb":I
/* .restart local v17 # "n":I */
} // :cond_d
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v39, v0 */
/* const/16 v40, -0x8000 */
/* move/from16 v0, v39 */
/* move/from16 v1, v40 */
/* if-ge v0, v1, :cond_6 */
/* .line 452 */
/* const/16 v39, -0x8000 */
/* move/from16 v0, v39 */
/* move-object/from16 v1, v32 */
/* iput v0, v1, Lv/Vector;->m_x:I */
/* goto/16 :goto_3 */
/* .line 456 */
} // :cond_e
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_y:I */
/* move/from16 v39, v0 */
/* const/16 v40, -0x8000 */
/* move/from16 v0, v39 */
/* move/from16 v1, v40 */
/* if-ge v0, v1, :cond_7 */
/* .line 457 */
/* const/16 v39, -0x8000 */
/* move/from16 v0, v39 */
/* move-object/from16 v1, v32 */
/* iput v0, v1, Lv/Vector;->m_y:I */
/* goto/16 :goto_4 */
/* .line 461 */
} // :cond_f
/* move-object/from16 v0, v32 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v39, v0 */
/* const/16 v40, -0x8000 */
/* move/from16 v0, v39 */
/* move/from16 v1, v40 */
/* if-ge v0, v1, :cond_8 */
/* .line 462 */
/* const/16 v39, -0x8000 */
/* move/from16 v0, v39 */
/* move-object/from16 v1, v32 */
/* iput v0, v1, Lv/Vector;->m_z:I */
/* goto/16 :goto_5 */
/* .line 469 */
} // :cond_10
/* const/16 v39, 0x7fff */
/* aput-short v39, v26, v11 */
/* goto/16 :goto_2 */
} // .end method
public void scale ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "s" # I */
/* .prologue */
/* .line 690 */
/* iget v0, p0, Lv/V3dModel;->m_vscale:I */
v0 = v.V3dModel .fmul ( v0,p1 );
/* iput v0, p0, Lv/V3dModel;->m_vscale:I */
/* .line 691 */
/* iget v0, p0, Lv/V3dModel;->m_wx:I */
v0 = v.V3dModel .fmul ( v0,p1 );
/* iput v0, p0, Lv/V3dModel;->m_wx:I */
/* .line 692 */
/* iget v0, p0, Lv/V3dModel;->m_wy:I */
v0 = v.V3dModel .fmul ( v0,p1 );
/* iput v0, p0, Lv/V3dModel;->m_wy:I */
/* .line 693 */
/* iget v0, p0, Lv/V3dModel;->m_wz:I */
v0 = v.V3dModel .fmul ( v0,p1 );
/* iput v0, p0, Lv/V3dModel;->m_wz:I */
/* .line 694 */
return;
} // .end method
public void setWxyz ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "z" # I */
/* .prologue */
/* .line 697 */
/* iput p1, p0, Lv/V3dModel;->m_wx:I */
/* .line 698 */
/* iput p2, p0, Lv/V3dModel;->m_wy:I */
/* .line 699 */
/* iput p3, p0, Lv/V3dModel;->m_wz:I */
/* .line 700 */
return;
} // .end method
