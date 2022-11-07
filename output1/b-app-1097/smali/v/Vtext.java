public class v.Vtext extends v.Vsprite {
	 /* .source "Vtext.java" */
	 /* # static fields */
	 private static final Integer LM;
	 static v.Vfont m_fontDefault;
	 public static Integer m_textcolorDefault;
	 /* # instance fields */
	 m_buf;
	 Integer m_bufn;
	 Integer m_bufw;
	 v.Vfont m_font;
	 java.lang.String m_s;
	 Integer m_textcolor;
	 Integer m_textsum;
	 /* # direct methods */
	 public v.Vtext ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 324 */
		 /* invoke-direct {p0}, Lv/Vsprite;-><init>()V */
		 /* .line 325 */
		 v0 = v.Vtext.m_fontDefault;
		 this.m_font = v0;
		 /* .line 326 */
		 /* iput v0, p0, Lv/Vtext;->m_textcolor:I */
		 /* .line 327 */
		 return;
	 } // .end method
	 public v.Vtext ( ) {
		 /* .locals 1 */
		 /* .param p1, "s" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 335 */
		 /* invoke-direct {p0}, Lv/Vsprite;-><init>()V */
		 /* .line 336 */
		 v0 = v.Vtext.m_fontDefault;
		 this.m_font = v0;
		 /* .line 337 */
		 /* iput v0, p0, Lv/Vtext;->m_textcolor:I */
		 /* .line 338 */
		 (( v.Vtext ) p0 ).setText ( p1 ); // invoke-virtual {p0, p1}, Lv/Vtext;->setText(Ljava/lang/String;)V
		 /* .line 339 */
		 return;
	 } // .end method
	 public v.Vtext ( ) {
		 /* .locals 1 */
		 /* .param p1, "f" # Lv/Vfont; */
		 /* .param p2, "s" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 329 */
		 /* invoke-direct {p0}, Lv/Vsprite;-><init>()V */
		 /* .line 330 */
		 this.m_font = p1;
		 /* .line 331 */
		 /* iput v0, p0, Lv/Vtext;->m_textcolor:I */
		 /* .line 332 */
		 (( v.Vtext ) p0 ).setText ( p2 ); // invoke-virtual {p0, p2}, Lv/Vtext;->setText(Ljava/lang/String;)V
		 /* .line 333 */
		 return;
	 } // .end method
	 public static v.Vfont getFontDefault ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 104 */
		 v0 = v.Vtext.m_fontDefault;
	 } // .end method
	 public static void setFontDefault ( v.Vfont p0 ) {
		 /* .locals 0 */
		 /* .param p0, "font" # Lv/Vfont; */
		 /* .prologue */
		 /* .line 212 */
		 /* .line 213 */
		 return;
	 } // .end method
	 public static void setTextColorDefault ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p0, "c" # I */
		 /* .prologue */
		 /* .line 317 */
		 /* .line 318 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected Integer checksum ( Integer p0, Integer p1, Integer p2 ) {
		 /* .locals 2 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .param p3, "scale" # I */
		 /* .prologue */
		 /* .line 28 */
		 v0 = 		 /* invoke-super {p0, p1, p2, p3}, Lv/Vsprite;->checksum(III)I */
		 /* iget v1, p0, Lv/Vtext;->m_textsum:I */
		 /* shl-int/lit8 v1, v1, 0x3 */
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p0, Lv/Vtext;->m_textcolor:I */
		 /* add-int/2addr v0, v1 */
	 } // .end method
	 public void decrement ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 32 */
		 v0 = 		 (( v.Vtext ) p0 ).getNumber ( ); // invoke-virtual {p0}, Lv/Vtext;->getNumber()I
		 int v1 = 1; // const/4 v1, 0x1
		 /* sub-int/2addr v0, v1 */
		 (( v.Vtext ) p0 ).setNumber ( v0 ); // invoke-virtual {p0, v0}, Lv/Vtext;->setNumber(I)V
		 /* .line 33 */
		 return;
	 } // .end method
	 protected void draw ( Integer[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
		 /* .locals 36 */
		 /* .param p1, "rgb" # [I */
		 /* .param p2, "width" # I */
		 /* .param p3, "height" # I */
		 /* .param p4, "x0" # I */
		 /* .param p5, "y0" # I */
		 /* .param p6, "x1" # I */
		 /* .param p7, "y1" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vtext;->m_alpha:I */
		 /* move v14, v0 */
		 /* .line 43 */
		 /* .local v14, "alpha":I */
		 /* move-object/from16 v0, p0 */
		 v0 = this.m_parent;
		 /* move-object v2, v0 */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* move-object/from16 v0, p0 */
			 v0 = this.m_parent;
			 /* move-object v2, v0 */
			 /* iget v2, v2, Lv/Vsprite;->m_alpha:I */
			 /* const v3, 0x8000 */
			 /* if-eq v2, v3, :cond_0 */
			 /* .line 44 */
			 /* const v2, 0x8000 */
			 /* if-ne v14, v2, :cond_2 */
			 /* .line 45 */
			 /* move-object/from16 v0, p0 */
			 v0 = this.m_parent;
			 /* move-object v2, v0 */
			 /* iget v14, v2, Lv/Vsprite;->m_alpha:I */
			 /* .line 50 */
		 } // :cond_0
	 } // :goto_0
	 /* move-object/from16 v0, p0 */
	 /* iget v0, v0, Lv/Vtext;->m_color:I */
	 /* move v10, v0 */
	 /* move-object/from16 v0, p0 */
	 /* iget v0, v0, Lv/Vtext;->m_color:I */
	 /* move v2, v0 */
	 /* shr-int/lit8 v11, v2, 0x18 */
	 /* move-object/from16 v2, p0 */
	 /* move-object/from16 v3, p1 */
	 /* move/from16 v4, p2 */
	 /* move/from16 v5, p3 */
	 /* move/from16 v6, p4 */
	 /* move/from16 v7, p5 */
	 /* move/from16 v8, p6 */
	 /* move/from16 v9, p7 */
	 /* invoke-virtual/range {v2 ..v11}, Lv/Vtext;->drawRect([IIIIIIIII)V */
	 /* .line 52 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.m_s;
	 /* move-object v2, v0 */
	 v31 = 	 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
	 /* .line 54 */
	 /* .local v31, "n":I */
	 /* move-object/from16 v0, p0 */
	 /* iget v0, v0, Lv/Vtext;->m_sx0f:I */
	 /* move v2, v0 */
	 /* const v3, 0x8000 */
	 /* add-int v30, v2, v3 */
	 /* .line 55 */
	 /* .local v30, "lm":I */
	 /* move/from16 v11, v30 */
	 /* .line 57 */
	 /* .local v11, "x":I */
	 /* move-object/from16 v0, p0 */
	 /* iget v0, v0, Lv/Vtext;->m_sy0f:I */
	 /* move v12, v0 */
	 /* .line 58 */
	 /* .local v12, "y":I */
	 /* move-object/from16 v0, p0 */
	 v0 = this.m_font;
	 /* move-object v2, v0 */
	 /* iget v2, v2, Lv/Vfont;->m_height:I */
	 /* shl-int/lit8 v28, v2, 0xf */
	 /* .line 60 */
	 /* .local v28, "fh":I */
	 /* shl-int/lit8 v2, p5, 0xf */
	 /* sub-int v35, v2, v28 */
	 /* .line 62 */
	 /* .local v35, "y0fh":I */
	 /* const/16 v29, 0x0 */
	 /* .local v29, "i":I */
} // :goto_1
/* move/from16 v0, v29 */
/* move/from16 v1, v31 */
/* if-lt v0, v1, :cond_3 */
/* .line 94 */
} // :cond_1
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vtext;->m_bufn:I */
/* move v2, v0 */
int v3 = 1; // const/4 v3, 0x1
/* sub-int v29, v2, v3 */
} // :goto_2
/* if-gez v29, :cond_a */
/* .line 101 */
return;
/* .line 47 */
} // .end local v11 # "x":I
} // .end local v12 # "y":I
} // .end local v28 # "fh":I
} // .end local v29 # "i":I
} // .end local v30 # "lm":I
} // .end local v31 # "n":I
} // .end local v35 # "y0fh":I
} // :cond_2
/* move-object/from16 v0, p0 */
v0 = this.m_parent;
/* move-object v2, v0 */
/* iget v2, v2, Lv/Vsprite;->m_alpha:I */
v14 = v.Vtext .fmul ( v14,v2 );
/* .line 63 */
/* .restart local v11 # "x":I */
/* .restart local v12 # "y":I */
/* .restart local v28 # "fh":I */
/* .restart local v29 # "i":I */
/* .restart local v30 # "lm":I */
/* .restart local v31 # "n":I */
/* .restart local v35 # "y0fh":I */
} // :cond_3
/* move-object/from16 v0, p0 */
v0 = this.m_s;
/* move-object v2, v0 */
/* move-object v0, v2 */
/* move/from16 v1, v29 */
v3 = (( java.lang.String ) v0 ).charAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C
/* .line 64 */
/* .local v3, "c":C */
/* const/16 v2, 0xa */
/* if-ne v3, v2, :cond_5 */
/* .line 65 */
/* add-int v12, v12, v28 */
/* .line 66 */
/* move/from16 v11, v30 */
/* .line 67 */
/* shr-int/lit8 v2, v12, 0xf */
/* move v0, v2 */
/* move/from16 v1, p7 */
/* if-gt v0, v1, :cond_1 */
/* .line 62 */
} // .end local v3 # "c":C
} // :cond_4
} // :goto_3
/* add-int/lit8 v29, v29, 0x1 */
/* .line 70 */
/* .restart local v3 # "c":C */
} // :cond_5
/* const/16 v2, 0x9 */
/* if-ne v3, v2, :cond_6 */
/* .line 71 */
/* move-object/from16 v0, p0 */
v0 = this.m_font;
/* move-object v2, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vtext;->m_sx0f:I */
/* move v3, v0 */
} // .end local v3 # "c":C
/* sub-int v3, v11, v3 */
/* shr-int/lit8 v3, v3, 0xf */
v2 = (( v.Vfont ) v2 ).tab ( v3 ); // invoke-virtual {v2, v3}, Lv/Vfont;->tab(I)I
/* shl-int/lit8 v2, v2, 0xf */
/* add-int/2addr v11, v2 */
/* .line 74 */
/* .restart local v3 # "c":C */
} // :cond_6
/* move-object/from16 v0, p0 */
v0 = this.m_font;
/* move-object v2, v0 */
v32 = (( v.Vfont ) v2 ).charWidth ( v3 ); // invoke-virtual {v2, v3}, Lv/Vfont;->charWidth(C)I
/* .line 75 */
/* .local v32, "w":I */
if ( v32 != null) { // if-eqz v32, :cond_4
/* .line 76 */
/* const/16 v2, 0x20 */
/* if-eq v3, v2, :cond_9 */
/* .line 78 */
/* shr-int/lit8 v33, v11, 0xf */
/* .line 79 */
/* .local v33, "xa":I */
/* add-int v34, v33, v32 */
/* .line 80 */
/* .local v34, "xb":I */
/* move/from16 v0, v33 */
/* move/from16 v1, p4 */
/* if-ge v0, v1, :cond_7 */
/* .line 81 */
/* move/from16 v33, p4 */
/* .line 82 */
} // :cond_7
/* move/from16 v0, v34 */
/* move/from16 v1, p6 */
/* if-le v0, v1, :cond_8 */
/* .line 83 */
/* move/from16 v34, p6 */
/* .line 85 */
} // :cond_8
/* move/from16 v0, v33 */
/* move/from16 v1, v34 */
/* if-ge v0, v1, :cond_9 */
/* move v0, v12 */
/* move/from16 v1, v35 */
/* if-le v0, v1, :cond_9 */
/* .line 86 */
/* move-object/from16 v0, p0 */
v0 = this.m_font;
/* move-object v2, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vtext;->m_textcolor:I */
/* move v13, v0 */
/* move-object/from16 v4, p1 */
/* move/from16 v5, p2 */
/* move/from16 v6, p3 */
/* move/from16 v7, p4 */
/* move/from16 v8, p5 */
/* move/from16 v9, p6 */
/* move/from16 v10, p7 */
/* invoke-virtual/range {v2 ..v14}, Lv/Vfont;->draw(I[IIIIIIIIIII)V */
/* .line 88 */
} // .end local v33 # "xa":I
} // .end local v34 # "xb":I
} // :cond_9
/* shl-int/lit8 v2, v32, 0xf */
/* add-int/2addr v11, v2 */
/* .line 95 */
} // .end local v3 # "c":C
} // .end local v32 # "w":I
} // :cond_a
/* move-object/from16 v0, p0 */
v0 = this.m_buf;
/* move-object v2, v0 */
/* aget-byte v2, v2, v29 */
/* int-to-char v3, v2 */
/* .line 96 */
/* .restart local v3 # "c":C */
/* move-object/from16 v0, p0 */
v0 = this.m_font;
/* move-object v2, v0 */
v2 = (( v.Vfont ) v2 ).charWidth ( v3 ); // invoke-virtual {v2, v3}, Lv/Vfont;->charWidth(C)I
/* shl-int/lit8 v32, v2, 0xf */
/* .line 97 */
/* .restart local v32 # "w":I */
if ( v32 != null) { // if-eqz v32, :cond_b
/* const/16 v2, 0x20 */
/* if-eq v3, v2, :cond_b */
/* .line 98 */
/* move-object/from16 v0, p0 */
v0 = this.m_font;
/* move-object v15, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vtext;->m_textcolor:I */
/* move/from16 v26, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vtext;->m_alpha:I */
/* move/from16 v27, v0 */
/* move/from16 v16, v3 */
/* move-object/from16 v17, p1 */
/* move/from16 v18, p2 */
/* move/from16 v19, p3 */
/* move/from16 v20, p4 */
/* move/from16 v21, p5 */
/* move/from16 v22, p6 */
/* move/from16 v23, p7 */
/* move/from16 v24, v11 */
/* move/from16 v25, v12 */
/* invoke-virtual/range {v15 ..v27}, Lv/Vfont;->draw(I[IIIIIIIIIII)V */
/* .line 99 */
} // :cond_b
/* add-int v11, v11, v32 */
/* .line 94 */
/* add-int/lit8 v29, v29, -0x1 */
/* goto/16 :goto_2 */
} // .end method
public Integer getNumber ( ) {
/* .locals 5 */
/* .prologue */
/* .line 109 */
int v1 = 0; // const/4 v1, 0x0
/* .line 110 */
/* .local v1, "n":I */
/* iget v2, p0, Lv/Vtext;->m_bufn:I */
int v3 = 1; // const/4 v3, 0x1
/* sub-int v0, v2, v3 */
/* .local v0, "i":I */
} // :goto_0
/* if-gez v0, :cond_0 */
/* .line 113 */
/* .line 111 */
} // :cond_0
/* mul-int/lit8 v2, v1, 0xa */
v3 = this.m_buf;
/* aget-byte v3, v3, v0 */
/* const/16 v4, 0x30 */
/* sub-int/2addr v3, v4 */
/* add-int v1, v2, v3 */
/* .line 110 */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public void increment ( ) {
/* .locals 4 */
/* .prologue */
/* const/16 v3, 0x30 */
/* .line 118 */
int v1 = 0; // const/4 v1, 0x0
/* .line 119 */
/* .local v1, "i":I */
} // :cond_0
} // :goto_0
/* iget v2, p0, Lv/Vtext;->m_bufn:I */
/* if-lt v1, v2, :cond_2 */
/* .line 135 */
} // :cond_1
} // :goto_1
(( v.Vtext ) p0 ).recalc ( ); // invoke-virtual {p0}, Lv/Vtext;->recalc()V
/* .line 136 */
return;
/* .line 120 */
} // :cond_2
v2 = this.m_buf;
/* aget-byte v2, v2, v1 */
/* add-int/lit8 v2, v2, 0x1 */
/* int-to-byte v0, v2 */
/* .line 121 */
/* .local v0, "c":B */
/* const/16 v2, 0x39 */
/* if-gt v0, v2, :cond_3 */
/* .line 122 */
v2 = this.m_buf;
/* aput-byte v0, v2, v1 */
/* .line 125 */
} // :cond_3
v2 = this.m_buf;
/* aput-byte v3, v2, v1 */
/* .line 126 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 128 */
/* iget v2, p0, Lv/Vtext;->m_bufn:I */
/* if-ne v1, v2, :cond_0 */
/* .line 129 */
/* iget v2, p0, Lv/Vtext;->m_bufw:I */
/* if-eq v1, v2, :cond_1 */
/* .line 131 */
v2 = this.m_buf;
/* aput-byte v3, v2, v1 */
/* .line 132 */
/* iget v2, p0, Lv/Vtext;->m_bufn:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lv/Vtext;->m_bufn:I */
} // .end method
public void recalc ( ) {
/* .locals 11 */
/* .prologue */
/* .line 141 */
v9 = this.m_child;
if ( v9 != null) { // if-eqz v9, :cond_1
/* .line 143 */
v9 = this.m_child;
/* iget v9, v9, Lv/Vsprite;->m_width:I */
/* iput v9, p0, Lv/Vtext;->m_width:I */
/* .line 144 */
v9 = this.m_child;
/* iget v9, v9, Lv/Vsprite;->m_height:I */
/* iput v9, p0, Lv/Vtext;->m_height:I */
/* .line 195 */
} // :cond_0
} // :goto_0
return;
/* .line 148 */
} // :cond_1
int v9 = 0; // const/4 v9, 0x0
/* iput v9, p0, Lv/Vtext;->m_textsum:I */
/* .line 149 */
v9 = this.m_s;
if ( v9 != null) { // if-eqz v9, :cond_0
v9 = this.m_font;
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 152 */
int v7 = 0; // const/4 v7, 0x0
/* .line 154 */
/* .local v7, "width":I */
int v8 = 1; // const/4 v8, 0x1
/* .line 155 */
/* .local v8, "x":I */
v9 = this.m_font;
/* iget v1, v9, Lv/Vfont;->m_height:I */
/* .line 156 */
/* .local v1, "fh":I */
/* move v2, v1 */
/* .line 158 */
/* .local v2, "height":I */
v5 = this.m_s;
/* .line 160 */
/* .local v5, "s":Ljava/lang/String; */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 161 */
v4 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* .line 163 */
/* .local v4, "n":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_1
/* if-lt v3, v4, :cond_4 */
/* .line 184 */
} // .end local v3 # "i":I
} // .end local v4 # "n":I
} // :cond_2
/* iget v9, p0, Lv/Vtext;->m_bufn:I */
int v10 = 1; // const/4 v10, 0x1
/* sub-int v3, v9, v10 */
/* .restart local v3 # "i":I */
} // :goto_2
/* if-gez v3, :cond_8 */
/* .line 190 */
/* if-le v8, v7, :cond_3 */
/* .line 191 */
/* move v7, v8 */
/* .line 193 */
} // :cond_3
/* iput v7, p0, Lv/Vtext;->m_width:I */
/* .line 194 */
/* iput v2, p0, Lv/Vtext;->m_height:I */
/* .line 164 */
/* .restart local v4 # "n":I */
} // :cond_4
v0 = (( java.lang.String ) v5 ).charAt ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C
/* .line 165 */
/* .local v0, "c":C */
/* iget v9, p0, Lv/Vtext;->m_textsum:I */
/* add-int/2addr v9, v0 */
/* iput v9, p0, Lv/Vtext;->m_textsum:I */
/* .line 167 */
/* const/16 v9, 0xa */
/* if-ne v0, v9, :cond_6 */
/* .line 168 */
/* add-int/2addr v2, v1 */
/* .line 169 */
/* if-le v8, v7, :cond_5 */
/* .line 170 */
/* move v7, v8 */
/* .line 171 */
} // :cond_5
int v8 = 1; // const/4 v8, 0x1
/* .line 163 */
} // :goto_3
/* add-int/lit8 v3, v3, 0x1 */
/* .line 173 */
} // :cond_6
/* const/16 v9, 0x9 */
/* if-ne v0, v9, :cond_7 */
/* .line 174 */
v9 = this.m_font;
v9 = (( v.Vfont ) v9 ).tab ( v8 ); // invoke-virtual {v9, v8}, Lv/Vfont;->tab(I)I
/* add-int/2addr v8, v9 */
/* .line 177 */
} // :cond_7
v9 = this.m_font;
v6 = (( v.Vfont ) v9 ).charWidth ( v0 ); // invoke-virtual {v9, v0}, Lv/Vfont;->charWidth(C)I
/* .line 178 */
/* .local v6, "w":I */
/* add-int/2addr v8, v6 */
/* .line 185 */
} // .end local v0 # "c":C
} // .end local v4 # "n":I
} // .end local v6 # "w":I
} // :cond_8
v9 = this.m_buf;
/* aget-byte v9, v9, v3 */
/* int-to-char v0, v9 */
/* .line 186 */
/* .restart local v0 # "c":C */
/* iget v9, p0, Lv/Vtext;->m_textsum:I */
/* add-int/2addr v9, v0 */
/* iput v9, p0, Lv/Vtext;->m_textsum:I */
/* .line 187 */
v9 = this.m_font;
v9 = (( v.Vfont ) v9 ).charWidth ( v0 ); // invoke-virtual {v9, v0}, Lv/Vfont;->charWidth(C)I
/* add-int/2addr v8, v9 */
/* .line 184 */
/* add-int/lit8 v3, v3, -0x1 */
} // .end method
public void setField ( java.lang.StringBuffer p0 ) {
/* .locals 5 */
/* .param p1, "s" # Ljava/lang/StringBuffer; */
/* .prologue */
/* .line 199 */
int v2 = 0; // const/4 v2, 0x0
/* iput v2, p0, Lv/Vtext;->m_bufn:I */
/* .line 200 */
/* if-nez p1, :cond_0 */
/* .line 209 */
} // :goto_0
return;
/* .line 202 */
} // :cond_0
v1 = (( java.lang.StringBuffer ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I
/* .line 203 */
/* .local v1, "n":I */
int v2 = 1; // const/4 v2, 0x1
/* sub-int v0, v1, v2 */
/* .local v0, "i":I */
} // :goto_1
/* if-gez v0, :cond_2 */
/* .line 208 */
} // :cond_1
(( v.Vtext ) p0 ).recalc ( ); // invoke-virtual {p0}, Lv/Vtext;->recalc()V
/* .line 204 */
} // :cond_2
v2 = this.m_buf;
/* iget v3, p0, Lv/Vtext;->m_bufn:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lv/Vtext;->m_bufn:I */
v4 = (( java.lang.StringBuffer ) p1 ).charAt ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->charAt(I)C
/* int-to-byte v4, v4 */
/* aput-byte v4, v2, v3 */
/* .line 205 */
/* iget v2, p0, Lv/Vtext;->m_bufn:I */
/* iget v3, p0, Lv/Vtext;->m_bufw:I */
/* if-eq v2, v3, :cond_1 */
/* .line 203 */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public void setFieldWidth ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "n" # I */
/* .prologue */
/* .line 230 */
/* iput p1, p0, Lv/Vtext;->m_bufw:I */
/* .line 231 */
/* new-array v0, p1, [B */
this.m_buf = v0;
/* .line 234 */
/* iget v0, p0, Lv/Vtext;->m_width:I */
v1 = this.m_font;
/* const/16 v2, 0x30 */
v1 = (( v.Vfont ) v1 ).charWidth ( v2 ); // invoke-virtual {v1, v2}, Lv/Vfont;->charWidth(C)I
/* mul-int/2addr v1, p1 */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lv/Vtext;->m_width:I */
/* .line 235 */
return;
} // .end method
public void setFile ( v.Vdisplay p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p1, "sys" # Lv/Vdisplay; */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 238 */
/* new-instance v2, Ljava/lang/StringBuffer; */
final String v3 = "/"; // const-string v3, "/"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 239 */
/* .local v2, "sb":Ljava/lang/StringBuffer; */
(( java.lang.StringBuffer ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 240 */
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 243 */
/* .line 245 */
/* .local v1, "in":Ljava/io/InputStream; */
/* if-nez v1, :cond_0 */
/* .line 261 */
} // :goto_0
return;
/* .line 248 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuffer; */
} // .end local v2 # "sb":Ljava/lang/StringBuffer;
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 251 */
/* .restart local v2 # "sb":Ljava/lang/StringBuffer; */
} // :goto_1
try { // :try_start_0
v0 = (( java.io.InputStream ) v1 ).read ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->read()I
/* .line 252 */
/* .local v0, "c":I */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v0, v3, :cond_1 */
/* .line 256 */
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 260 */
} // .end local v0 # "c":I
} // :goto_2
(( v.Vtext ) p0 ).setTextWrap ( v2 ); // invoke-virtual {p0, v2}, Lv/Vtext;->setTextWrap(Ljava/lang/StringBuffer;)V
/* .line 254 */
/* .restart local v0 # "c":I */
} // :cond_1
/* int-to-char v3, v0 */
try { // :try_start_1
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 258 */
} // .end local v0 # "c":I
/* :catch_0 */
/* move-exception v3 */
} // .end method
public void setNumber ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "n" # I */
/* .prologue */
/* .line 218 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lv/Vtext;->m_bufn:I */
/* .line 221 */
} // :cond_0
v0 = this.m_buf;
/* iget v1, p0, Lv/Vtext;->m_bufn:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lv/Vtext;->m_bufn:I */
/* rem-int/lit8 v2, p1, 0xa */
/* add-int/lit8 v2, v2, 0x30 */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* .line 222 */
/* div-int/lit8 p1, p1, 0xa */
/* .line 224 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* iget v0, p0, Lv/Vtext;->m_bufn:I */
/* iget v1, p0, Lv/Vtext;->m_bufw:I */
/* if-lt v0, v1, :cond_0 */
/* .line 226 */
} // :cond_1
(( v.Vtext ) p0 ).recalc ( ); // invoke-virtual {p0}, Lv/Vtext;->recalc()V
/* .line 227 */
return;
} // .end method
public void setText ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 264 */
this.m_s = p1;
/* .line 265 */
(( v.Vtext ) p0 ).recalc ( ); // invoke-virtual {p0}, Lv/Vtext;->recalc()V
/* .line 266 */
return;
} // .end method
public void setText ( v.Vfont p0, java.lang.String p1 ) {
/* .locals 0 */
/* .param p1, "font" # Lv/Vfont; */
/* .param p2, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 308 */
this.m_font = p1;
/* .line 309 */
(( v.Vtext ) p0 ).setText ( p2 ); // invoke-virtual {p0, p2}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 310 */
return;
} // .end method
public void setTextColor ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "c" # I */
/* .prologue */
/* .line 313 */
/* iput p1, p0, Lv/Vtext;->m_textcolor:I */
/* .line 314 */
return;
} // .end method
public void setTextWrap ( java.lang.StringBuffer p0 ) {
/* .locals 10 */
/* .param p1, "s" # Ljava/lang/StringBuffer; */
/* .prologue */
/* const/16 v9, 0xa */
/* .line 270 */
v8 = this.m_font;
/* if-nez v8, :cond_0 */
/* .line 271 */
v8 = v.Vtext.m_fontDefault;
this.m_font = v8;
/* .line 273 */
} // :cond_0
int v7 = 1; // const/4 v7, 0x1
/* .line 274 */
/* .local v7, "x":I */
/* iget v6, p0, Lv/Vtext;->m_width:I */
/* .line 276 */
/* .local v6, "width":I */
v2 = (( java.lang.StringBuffer ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I
/* .line 278 */
/* .local v2, "n":I */
int v3 = -1; // const/4 v3, -0x1
/* .line 279 */
/* .local v3, "spacei":I */
int v4 = 0; // const/4 v4, 0x0
/* .line 281 */
/* .local v4, "spacex":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, v2, :cond_1 */
/* .line 304 */
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( v.Vtext ) p0 ).setText ( v8 ); // invoke-virtual {p0, v8}, Lv/Vtext;->setText(Ljava/lang/String;)V
/* .line 305 */
return;
/* .line 282 */
} // :cond_1
v0 = (( java.lang.StringBuffer ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->charAt(I)C
/* .line 283 */
/* .local v0, "c":C */
/* if-ne v0, v9, :cond_3 */
/* .line 284 */
int v7 = 1; // const/4 v7, 0x1
/* .line 281 */
} // :cond_2
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 287 */
} // :cond_3
v8 = this.m_font;
v5 = (( v.Vfont ) v8 ).charWidth ( v0 ); // invoke-virtual {v8, v0}, Lv/Vfont;->charWidth(C)I
/* .line 288 */
/* .local v5, "w":I */
/* add-int/2addr v7, v5 */
/* .line 290 */
/* const/16 v8, 0x20 */
/* if-ne v0, v8, :cond_4 */
/* .line 291 */
/* move v3, v1 */
/* .line 292 */
/* move v4, v7 */
/* .line 295 */
} // :cond_4
/* if-le v7, v6, :cond_2 */
/* .line 296 */
/* sub-int/2addr v7, v4 */
/* .line 297 */
int v8 = -1; // const/4 v8, -0x1
/* if-eq v3, v8, :cond_5 */
/* .line 298 */
(( java.lang.StringBuffer ) p1 ).setCharAt ( v3, v9 ); // invoke-virtual {p1, v3, v9}, Ljava/lang/StringBuffer;->setCharAt(IC)V
/* .line 299 */
} // :cond_5
int v3 = -1; // const/4 v3, -0x1
/* .line 300 */
int v4 = 0; // const/4 v4, 0x0
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .prologue */
/* .line 321 */
v0 = this.m_s;
} // .end method
