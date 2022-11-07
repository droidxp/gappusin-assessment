public class v.Vfont extends v.V {
	 /* .source "Vfont.java" */
	 /* # static fields */
	 public static final Integer ALPHABITS;
	 public static final Integer ALPHABITSMASK;
	 static final Integer ALPHAONE;
	 public static final Integer ALPHARUNMAX;
	 public static final Integer ALPHASHIFT;
	 /* # instance fields */
	 m_b;
	 Integer m_baseline;
	 Integer m_height;
	 Integer m_hi;
	 java.io.InputStream m_in;
	 Integer m_lo;
	 m_off;
	 Integer m_space;
	 Integer m_tab;
	 m_width;
	 /* # direct methods */
	 public v.Vfont ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 251 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 /* .line 252 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 Integer charWidth ( Object p0 ) {
		 /* .locals 2 */
		 /* .param p1, "c" # C */
		 /* .prologue */
		 /* .line 28 */
		 /* const/16 v1, 0x20 */
		 /* if-ne p1, v1, :cond_0 */
		 /* .line 29 */
		 /* iget v1, p0, Lv/Vfont;->m_space:I */
		 /* .line 34 */
	 } // :goto_0
	 /* .line 31 */
} // :cond_0
/* iget v1, p0, Lv/Vfont;->m_lo:I */
/* if-lt p1, v1, :cond_1 */
/* iget v1, p0, Lv/Vfont;->m_hi:I */
/* if-le p1, v1, :cond_2 */
/* .line 32 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 33 */
} // :cond_2
/* iget v1, p0, Lv/Vfont;->m_lo:I */
/* sub-int v0, p1, v1 */
/* .line 34 */
/* .local v0, "i":I */
v1 = this.m_width;
/* aget-short v1, v1, v0 */
} // .end method
void draw ( Integer p0, Integer[] p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10, Integer p11 ) {
/* .locals 29 */
/* .param p1, "idx" # I */
/* .param p2, "drgb" # [I */
/* .param p3, "dwidth" # I */
/* .param p4, "dheight" # I */
/* .param p5, "x0" # I */
/* .param p6, "y0" # I */
/* .param p7, "x1" # I */
/* .param p8, "y1" # I */
/* .param p9, "sx0" # I */
/* .param p10, "sy0" # I */
/* .param p11, "color" # I */
/* .param p12, "alpha" # I */
/* .prologue */
/* .line 47 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vfont;->m_lo:I */
/* move/from16 v26, v0 */
/* move/from16 v0, p1 */
/* move/from16 v1, v26 */
/* if-lt v0, v1, :cond_0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vfont;->m_hi:I */
/* move/from16 v26, v0 */
/* move/from16 v0, p1 */
/* move/from16 v1, v26 */
/* if-le v0, v1, :cond_1 */
/* .line 148 */
} // :cond_0
return;
/* .line 51 */
} // :cond_1
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vfont;->m_lo:I */
/* move/from16 v26, v0 */
/* sub-int p1, p1, v26 */
/* .line 52 */
/* move-object/from16 v0, p0 */
v0 = this.m_off;
/* move-object/from16 v26, v0 */
/* aget v18, v26, p1 */
/* .line 53 */
/* .local v18, "si":I */
/* move-object/from16 v0, p0 */
v0 = this.m_off;
/* move-object/from16 v26, v0 */
/* add-int/lit8 v27, p1, 0x1 */
/* aget v20, v26, v27 */
/* .line 55 */
/* .local v20, "si1":I */
/* move/from16 v0, v18 */
/* move/from16 v1, v20 */
/* if-eq v0, v1, :cond_0 */
/* .line 58 */
/* const/16 v26, 0x1 */
/* sub-int v23, p7, v26 */
/* .line 59 */
/* .local v23, "x11":I */
/* const/16 v26, 0x1 */
/* sub-int v25, p8, v26 */
/* .line 61 */
/* .local v25, "y11":I */
/* shr-int/lit8 v26, p11, 0x10 */
/* move/from16 v0, v26 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v16, v0 */
/* .line 62 */
/* .local v16, "r":I */
/* shr-int/lit8 v26, p11, 0x8 */
/* move/from16 v0, v26 */
/* and-int/lit16 v0, v0, 0xff */
/* move v11, v0 */
/* .line 63 */
/* .local v11, "g":I */
/* move/from16 v0, p11 */
/* and-int/lit16 v0, v0, 0xff */
/* move v3, v0 */
/* .line 65 */
/* .local v3, "b":I */
/* shr-int/lit8 v26, p11, 0x1 */
/* const v27, 0x7f7f7f */
/* and-int v8, v26, v27 */
/* .line 67 */
/* .local v8, "color50":I */
/* move-object/from16 v0, p0 */
v0 = this.m_width;
/* move-object/from16 v26, v0 */
/* aget-short v10, v26, p1 */
/* .line 69 */
/* .local v10, "fw":I */
/* move-object/from16 v0, p0 */
v0 = this.m_b;
/* move-object v5, v0 */
/* .line 71 */
/* .local v5, "bu":[B */
/* shr-int/lit8 p9, p9, 0xf */
/* .line 72 */
/* add-int v22, p9, v10 */
/* .line 73 */
/* .local v22, "sx1":I */
/* move/from16 v21, p9 */
/* .line 75 */
/* .local v21, "sx":I */
/* shr-int/lit8 v24, p10, 0xf */
/* .local v24, "y":I */
/* move/from16 v19, v18 */
/* .line 77 */
} // .end local v18 # "si":I
/* .local v19, "si":I */
} // :goto_0
/* move/from16 v0, v19 */
/* move/from16 v1, v20 */
/* if-ge v0, v1, :cond_0 */
/* .line 78 */
/* add-int/lit8 v18, v19, 0x1 */
} // .end local v19 # "si":I
/* .restart local v18 # "si":I */
/* aget-byte v26, v5, v19 */
/* move/from16 v0, v26 */
/* and-int/lit16 v0, v0, 0xff */
/* move v2, v0 */
/* .line 79 */
/* .local v2, "a":I */
/* shr-int/lit8 v14, v2, 0x4 */
/* .line 80 */
/* .local v14, "n":I */
/* if-nez v14, :cond_2 */
/* .line 81 */
/* const/16 v14, 0x10 */
/* .line 83 */
} // :cond_2
/* and-int/lit8 v2, v2, 0xf */
/* .line 85 */
if ( v2 != null) { // if-eqz v2, :cond_3
/* const v26, 0x8000 */
/* move/from16 v0, p12 */
/* move/from16 v1, v26 */
/* if-eq v0, v1, :cond_3 */
/* .line 86 */
/* add-int/lit8 v26, v2, 0x1 */
/* mul-int v26, v26, p12 */
/* shr-int/lit8 v2, v26, 0xf */
/* .line 88 */
} // :cond_3
/* if-nez v2, :cond_a */
/* .line 90 */
/* add-int v21, v21, v14 */
/* .line 91 */
} // :goto_1
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* if-ge v0, v1, :cond_4 */
/* move/from16 v19, v18 */
} // .end local v18 # "si":I
/* .restart local v19 # "si":I */
/* .line 92 */
} // .end local v19 # "si":I
/* .restart local v18 # "si":I */
} // :cond_4
/* sub-int v21, v21, v10 */
/* .line 93 */
/* add-int/lit8 v24, v24, 0x1 */
/* .line 99 */
} // :cond_5
/* move/from16 v0, v21 */
/* move/from16 v1, p5 */
/* if-lt v0, v1, :cond_6 */
/* move/from16 v0, v21 */
/* move/from16 v1, p7 */
/* if-ge v0, v1, :cond_6 */
/* move/from16 v0, v24 */
/* move/from16 v1, p6 */
/* if-lt v0, v1, :cond_6 */
/* move/from16 v0, v24 */
/* move/from16 v1, p8 */
/* if-ge v0, v1, :cond_6 */
/* .line 102 */
/* mul-int v26, v24, p3 */
/* add-int v9, v26, v21 */
/* .line 104 */
/* .local v9, "di":I */
/* const/16 v26, 0xf */
/* move v0, v2 */
/* move/from16 v1, v26 */
/* if-ne v0, v1, :cond_7 */
/* .line 106 */
/* aput p11, p2, v9 */
/* .line 129 */
} // :goto_2
/* const v26, 0x8000 */
/* move/from16 v0, p12 */
/* move/from16 v1, v26 */
/* if-ne v0, v1, :cond_6 */
/* .line 130 */
/* move/from16 v0, v21 */
/* move/from16 v1, v23 */
/* if-ge v0, v1, :cond_6 */
/* move/from16 v0, v24 */
/* move/from16 v1, v25 */
/* if-ge v0, v1, :cond_6 */
/* .line 131 */
/* add-int v26, v9, p3 */
/* add-int/lit8 v13, v26, 0x1 */
/* .line 132 */
/* .local v13, "i":I */
/* aget v6, p2, v13 */
/* .line 133 */
/* .local v6, "c":I */
/* const/16 v26, 0x7 */
/* move v0, v2 */
/* move/from16 v1, v26 */
/* if-le v0, v1, :cond_9 */
/* .line 134 */
/* shr-int/lit8 v26, v6, 0x1 */
/* const v27, 0x7f7f7f */
/* and-int v26, v26, v27 */
/* aput v26, p2, v13 */
/* .line 140 */
} // .end local v6 # "c":I
} // .end local v9 # "di":I
} // .end local v13 # "i":I
} // :cond_6
} // :goto_3
/* add-int/lit8 v21, v21, 0x1 */
/* .line 141 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* if-ne v0, v1, :cond_a */
/* .line 142 */
/* add-int/lit8 v24, v24, 0x1 */
/* .line 143 */
/* move/from16 v21, p9 */
/* move v15, v14 */
/* .line 98 */
} // .end local v14 # "n":I
/* .local v15, "n":I */
} // :goto_4
/* add-int/lit8 v14, v15, -0x1 */
} // .end local v15 # "n":I
/* .restart local v14 # "n":I */
/* if-nez v15, :cond_5 */
/* move/from16 v19, v18 */
} // .end local v18 # "si":I
/* .restart local v19 # "si":I */
/* goto/16 :goto_0 */
/* .line 108 */
} // .end local v19 # "si":I
/* .restart local v9 # "di":I */
/* .restart local v18 # "si":I */
} // :cond_7
/* const/16 v26, 0x8 */
/* move v0, v2 */
/* move/from16 v1, v26 */
/* if-ne v0, v1, :cond_8 */
/* .line 112 */
/* aget v26, p2, v9 */
/* shr-int/lit8 v26, v26, 0x1 */
/* const v27, 0x7f7f7f */
/* and-int v26, v26, v27 */
/* add-int v26, v26, v8 */
/* aput v26, p2, v9 */
/* .line 115 */
} // :cond_8
/* aget v7, p2, v9 */
/* .line 117 */
/* .local v7, "c1":I */
/* shr-int/lit8 v26, v7, 0x10 */
/* move/from16 v0, v26 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v17, v0 */
/* .line 118 */
/* .local v17, "r1":I */
/* shr-int/lit8 v26, v7, 0x8 */
/* move/from16 v0, v26 */
/* and-int/lit16 v0, v0, 0xff */
/* move v12, v0 */
/* .line 119 */
/* .local v12, "g1":I */
/* and-int/lit16 v4, v7, 0xff */
/* .line 121 */
/* .local v4, "b1":I */
/* sub-int v26, v16, v17 */
/* mul-int v26, v26, v2 */
/* shr-int/lit8 v26, v26, 0x4 */
/* add-int v17, v17, v26 */
/* .line 122 */
/* sub-int v26, v11, v12 */
/* mul-int v26, v26, v2 */
/* shr-int/lit8 v26, v26, 0x4 */
/* add-int v12, v12, v26 */
/* .line 123 */
/* sub-int v26, v3, v4 */
/* mul-int v26, v26, v2 */
/* shr-int/lit8 v26, v26, 0x4 */
/* add-int v4, v4, v26 */
/* .line 125 */
/* shl-int/lit8 v26, v17, 0x10 */
/* shl-int/lit8 v27, v12, 0x8 */
/* or-int v26, v26, v27 */
/* or-int v26, v26, v4 */
/* aput v26, p2, v9 */
/* goto/16 :goto_2 */
/* .line 136 */
} // .end local v4 # "b1":I
} // .end local v7 # "c1":I
} // .end local v12 # "g1":I
} // .end local v17 # "r1":I
/* .restart local v6 # "c":I */
/* .restart local v13 # "i":I */
} // :cond_9
/* const v26, 0xffffff */
/* and-int v26, v26, v6 */
/* shr-int/lit8 v27, v6, 0x2 */
/* const v28, 0x3f3f3f */
/* and-int v27, v27, v28 */
/* sub-int v26, v26, v27 */
/* aput v26, p2, v13 */
} // .end local v6 # "c":I
} // .end local v9 # "di":I
} // .end local v13 # "i":I
} // :cond_a
/* move v15, v14 */
} // .end local v14 # "n":I
/* .restart local v15 # "n":I */
} // .end method
public Integer getHeight ( ) {
/* .locals 1 */
/* .prologue */
/* .line 151 */
/* iget v0, p0, Lv/Vfont;->m_height:I */
} // .end method
public Boolean open ( v.Vdisplay p0, java.lang.String p1 ) {
/* .locals 10 */
/* .param p1, "sys" # Lv/Vdisplay; */
/* .param p2, "fontname" # Ljava/lang/String; */
/* .prologue */
int v9 = 0; // const/4 v9, 0x0
/* .line 157 */
try { // :try_start_0
/* new-instance v6, Ljava/lang/StringBuffer; */
final String v7 = "/"; // const-string v7, "/"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 158 */
/* .local v6, "sb":Ljava/lang/StringBuffer; */
(( java.lang.StringBuffer ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 160 */
(( java.lang.StringBuffer ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
this.m_in = v7;
/* .line 161 */
v7 = this.m_in;
/* if-nez v7, :cond_0 */
/* move v7, v9 */
/* .line 207 */
} // .end local v6 # "sb":Ljava/lang/StringBuffer;
} // :goto_0
/* .line 164 */
/* .restart local v6 # "sb":Ljava/lang/StringBuffer; */
} // :cond_0
v7 = (( v.Vfont ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vfont;->rv()I
/* iput v7, p0, Lv/Vfont;->m_space:I */
/* .line 165 */
/* iget v7, p0, Lv/Vfont;->m_space:I */
/* shl-int/lit8 v7, v7, 0x3 */
/* iput v7, p0, Lv/Vfont;->m_tab:I */
/* .line 166 */
v7 = (( v.Vfont ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vfont;->rv()I
/* iput v7, p0, Lv/Vfont;->m_height:I */
/* .line 167 */
v7 = (( v.Vfont ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vfont;->rv()I
/* iput v7, p0, Lv/Vfont;->m_baseline:I */
/* .line 168 */
v7 = (( v.Vfont ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vfont;->rv()I
/* iput v7, p0, Lv/Vfont;->m_lo:I */
/* .line 169 */
v7 = (( v.Vfont ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vfont;->rv()I
/* iput v7, p0, Lv/Vfont;->m_hi:I */
/* .line 171 */
/* iget v7, p0, Lv/Vfont;->m_hi:I */
/* iget v8, p0, Lv/Vfont;->m_lo:I */
/* sub-int/2addr v7, v8 */
/* add-int/lit8 v2, v7, 0x1 */
/* .line 172 */
/* .local v2, "n":I */
/* add-int/lit8 v7, v2, 0x1 */
v.Vfont .allocInt ( v7 );
this.m_off = v7;
/* .line 173 */
v.Vfont .allocShort ( v2 );
this.m_width = v7;
/* .line 174 */
int v5 = 0; // const/4 v5, 0x0
/* .line 176 */
/* .local v5, "off":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
/* if-lt v1, v2, :cond_2 */
/* .line 184 */
v7 = this.m_off;
/* aput v5, v7, v2 */
/* .line 187 */
v2 = (( v.Vfont ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vfont;->rv()I
/* .line 188 */
v.Vfont .allocByte ( v2 );
this.m_b = v7;
/* .line 190 */
int v5 = 0; // const/4 v5, 0x0
/* .line 192 */
} // :cond_1
v7 = this.m_in;
v8 = this.m_b;
v4 = (( java.io.InputStream ) v7 ).read ( v8, v5, v2 ); // invoke-virtual {v7, v8, v5, v2}, Ljava/io/InputStream;->read([BII)I
/* .line 193 */
/* .local v4, "nread":I */
int v7 = -1; // const/4 v7, -0x1
/* if-ne v4, v7, :cond_4 */
/* .line 194 */
/* new-instance v7, Ljava/io/IOException; */
final String v8 = "eof"; // const-string v8, "eof"
/* invoke-direct {v7, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v7 */
/* .line 205 */
} // .end local v1 # "i":I
} // .end local v2 # "n":I
} // .end local v4 # "nread":I
} // .end local v5 # "off":I
} // .end local v6 # "sb":Ljava/lang/StringBuffer;
/* :catch_0 */
/* move-exception v7 */
/* move-object v0, v7 */
/* .local v0, "e":Ljava/io/IOException; */
/* move v7, v9 */
/* .line 207 */
/* .line 177 */
} // .end local v0 # "e":Ljava/io/IOException;
/* .restart local v1 # "i":I */
/* .restart local v2 # "n":I */
/* .restart local v5 # "off":I */
/* .restart local v6 # "sb":Ljava/lang/StringBuffer; */
} // :cond_2
v7 = this.m_off;
/* aput v5, v7, v1 */
/* .line 178 */
v3 = (( v.Vfont ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vfont;->rv()I
/* .line 179 */
/* .local v3, "nb":I */
/* add-int/2addr v5, v3 */
/* .line 180 */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 181 */
v7 = this.m_width;
v8 = (( v.Vfont ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vfont;->rv()I
/* int-to-short v8, v8 */
/* aput-short v8, v7, v1 */
/* .line 176 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
/* .line 196 */
} // .end local v3 # "nb":I
/* .restart local v4 # "nread":I */
} // :cond_4
/* add-int/2addr v5, v4 */
/* .line 197 */
/* sub-int/2addr v2, v4 */
/* .line 199 */
/* if-nez v2, :cond_1 */
/* .line 201 */
v7 = this.m_in;
(( java.io.InputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->close()V
/* .line 202 */
int v7 = 0; // const/4 v7, 0x0
this.m_in = v7;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 203 */
int v7 = 1; // const/4 v7, 0x1
/* goto/16 :goto_0 */
} // .end method
Integer read ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 212 */
v1 = this.m_in;
v0 = (( java.io.InputStream ) v1 ).read ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->read()I
/* .line 213 */
/* .local v0, "n":I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* .line 214 */
/* new-instance v1, Ljava/io/IOException; */
final String v2 = "eof"; // const-string v2, "eof"
/* invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 216 */
} // :cond_0
} // .end method
Integer rv ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0x80 */
/* .line 221 */
v1 = (( v.Vfont ) p0 ).read ( ); // invoke-virtual {p0}, Lv/Vfont;->read()I
/* .line 222 */
/* .local v1, "n":I */
/* if-lt v1, v4, :cond_1 */
/* .line 224 */
/* and-int/lit8 v1, v1, 0x7f */
/* .line 226 */
} // :cond_0
v0 = (( v.Vfont ) p0 ).read ( ); // invoke-virtual {p0}, Lv/Vfont;->read()I
/* .line 227 */
/* .local v0, "b":I */
/* shl-int/lit8 v2, v1, 0x7 */
/* and-int/lit8 v3, v0, 0x7f */
/* or-int v1, v2, v3 */
/* .line 229 */
/* if-ge v0, v4, :cond_0 */
/* .line 231 */
} // .end local v0 # "b":I
} // :cond_1
} // .end method
public Integer stringWidth ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 235 */
int v2 = 0; // const/4 v2, 0x0
/* .line 236 */
/* .local v2, "w":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
v3 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-lt v1, v3, :cond_0 */
/* .line 243 */
/* .line 237 */
} // :cond_0
v0 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
/* .line 238 */
/* .local v0, "c":C */
/* const/16 v3, 0x9 */
/* if-ne v0, v3, :cond_1 */
/* .line 239 */
v3 = (( v.Vfont ) p0 ).tab ( v2 ); // invoke-virtual {p0, v2}, Lv/Vfont;->tab(I)I
/* add-int/2addr v2, v3 */
/* .line 236 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 241 */
} // :cond_1
v3 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
v3 = (( v.Vfont ) p0 ).charWidth ( v3 ); // invoke-virtual {p0, v3}, Lv/Vfont;->charWidth(C)I
/* add-int/2addr v2, v3 */
} // .end method
Integer tab ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "x" # I */
/* .prologue */
/* .line 248 */
/* iget v0, p0, Lv/Vfont;->m_tab:I */
/* iget v1, p0, Lv/Vfont;->m_tab:I */
/* rem-int v1, p1, v1 */
/* sub-int/2addr v0, v1 */
} // .end method
