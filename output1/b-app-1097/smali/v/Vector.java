public class v.Vector extends v.V {
	 /* .source "Vector.java" */
	 /* # static fields */
	 static final Integer TOL;
	 /* # instance fields */
	 public Integer m_x;
	 public Integer m_y;
	 public Integer m_z;
	 /* # direct methods */
	 public v.Vector ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 242 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 /* .line 243 */
		 return;
	 } // .end method
	 public v.Vector ( ) {
		 /* .locals 0 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .param p3, "z" # I */
		 /* .prologue */
		 /* .line 245 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 /* .line 246 */
		 (( v.Vector ) p0 ).set ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lv/Vector;->set(III)V
		 /* .line 247 */
		 return;
	 } // .end method
	 public static Integer magnitudeApprox ( Integer p0, Integer p1, Integer p2 ) {
		 /* .locals 6 */
		 /* .param p0, "max" # I */
		 /* .param p1, "med" # I */
		 /* .param p2, "min" # I */
		 /* .prologue */
		 /* .line 134 */
		 /* if-gez p0, :cond_0 */
		 /* .line 135 */
		 /* neg-int p0, p0 */
		 /* .line 138 */
	 } // :cond_0
	 /* if-gez p1, :cond_1 */
	 /* .line 139 */
	 /* neg-int p1, p1 */
	 /* .line 142 */
} // :cond_1
/* if-gez p2, :cond_2 */
/* .line 143 */
/* neg-int p2, p2 */
/* .line 146 */
} // :cond_2
/* if-ge p0, p1, :cond_3 */
/* .line 147 */
/* move v1, p0 */
/* .line 148 */
/* .local v1, "t":I */
/* move p0, p1 */
/* .line 149 */
/* move p1, v1 */
/* .line 151 */
} // .end local v1 # "t":I
} // :cond_3
/* if-ge p1, p2, :cond_4 */
/* .line 152 */
/* move v1, p1 */
/* .line 153 */
/* .restart local v1 # "t":I */
/* move p1, p2 */
/* .line 154 */
/* move p2, v1 */
/* .line 156 */
} // .end local v1 # "t":I
} // :cond_4
/* if-ge p0, p2, :cond_5 */
/* .line 157 */
/* move v1, p0 */
/* .line 158 */
/* .restart local v1 # "t":I */
/* move p0, p2 */
/* .line 159 */
/* move p2, v1 */
/* .line 163 */
} // .end local v1 # "t":I
} // :cond_5
/* mul-int/lit8 v2, p1, 0xb */
/* shr-int/lit8 v0, v2, 0x5 */
/* .line 164 */
/* .local v0, "m1132":I */
/* if-gez v0, :cond_6 */
/* .line 165 */
/* int-to-long v2, p1 */
/* const-wide/16 v4, 0xb */
/* mul-long/2addr v2, v4 */
int v4 = 5; // const/4 v4, 0x5
/* shr-long/2addr v2, v4 */
/* long-to-int v0, v2 */
/* .line 167 */
} // :cond_6
/* add-int v2, p0, v0 */
/* shr-int/lit8 v3, p2, 0x2 */
/* add-int/2addr v2, v3 */
} // .end method
/* # virtual methods */
public void add ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "dx" # I */
/* .param p2, "dy" # I */
/* .param p3, "dz" # I */
/* .prologue */
/* .line 16 */
/* iget v0, p0, Lv/Vector;->m_x:I */
/* add-int/2addr v0, p1 */
/* iput v0, p0, Lv/Vector;->m_x:I */
/* .line 17 */
/* iget v0, p0, Lv/Vector;->m_y:I */
/* add-int/2addr v0, p2 */
/* iput v0, p0, Lv/Vector;->m_y:I */
/* .line 18 */
/* iget v0, p0, Lv/Vector;->m_z:I */
/* add-int/2addr v0, p3 */
/* iput v0, p0, Lv/Vector;->m_z:I */
/* .line 19 */
return;
} // .end method
public void add ( v.Vector p0 ) {
/* .locals 3 */
/* .param p1, "v" # Lv/Vector; */
/* .prologue */
/* .line 12 */
/* iget v0, p1, Lv/Vector;->m_x:I */
/* iget v1, p1, Lv/Vector;->m_y:I */
/* iget v2, p1, Lv/Vector;->m_z:I */
(( v.Vector ) p0 ).add ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lv/Vector;->add(III)V
/* .line 13 */
return;
} // .end method
public void crossProduct ( v.Vector p0, v.Vector p1 ) {
/* .locals 5 */
/* .param p1, "u" # Lv/Vector; */
/* .param p2, "v" # Lv/Vector; */
/* .prologue */
/* .line 23 */
/* iget v0, p1, Lv/Vector;->m_y:I */
/* iget v1, p2, Lv/Vector;->m_z:I */
v0 = v.Vector .fmul ( v0,v1 );
/* iget v1, p1, Lv/Vector;->m_z:I */
/* iget v2, p2, Lv/Vector;->m_y:I */
v1 = v.Vector .fmul ( v1,v2 );
/* sub-int/2addr v0, v1 */
/* .line 24 */
/* iget v1, p1, Lv/Vector;->m_x:I */
/* neg-int v1, v1 */
/* iget v2, p2, Lv/Vector;->m_z:I */
v1 = v.Vector .fmul ( v1,v2 );
/* iget v2, p1, Lv/Vector;->m_z:I */
/* iget v3, p2, Lv/Vector;->m_x:I */
v2 = v.Vector .fmul ( v2,v3 );
/* add-int/2addr v1, v2 */
/* .line 25 */
/* iget v2, p1, Lv/Vector;->m_x:I */
/* iget v3, p2, Lv/Vector;->m_y:I */
v2 = v.Vector .fmul ( v2,v3 );
/* iget v3, p1, Lv/Vector;->m_y:I */
/* iget v4, p2, Lv/Vector;->m_x:I */
v3 = v.Vector .fmul ( v3,v4 );
/* sub-int/2addr v2, v3 */
/* .line 23 */
(( v.Vector ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lv/Vector;->set(III)V
/* .line 27 */
return;
} // .end method
public void crossProductNormalized ( v.Vector p0, v.Vector p1 ) {
/* .locals 10 */
/* .param p1, "u" # Lv/Vector; */
/* .param p2, "v" # Lv/Vector; */
/* .prologue */
/* .line 37 */
/* iget v6, p1, Lv/Vector;->m_y:I */
/* iget v7, p2, Lv/Vector;->m_z:I */
v.Vector .fmul_lii ( v6,v7 );
/* move-result-wide v6 */
/* iget v8, p1, Lv/Vector;->m_z:I */
/* iget v9, p2, Lv/Vector;->m_y:I */
v.Vector .fmul_lii ( v8,v9 );
/* move-result-wide v8 */
/* sub-long v0, v6, v8 */
/* .line 38 */
/* .local v0, "x":J */
/* iget v6, p1, Lv/Vector;->m_x:I */
/* neg-int v6, v6 */
/* iget v7, p2, Lv/Vector;->m_z:I */
v.Vector .fmul_lii ( v6,v7 );
/* move-result-wide v6 */
/* iget v8, p1, Lv/Vector;->m_z:I */
/* iget v9, p2, Lv/Vector;->m_x:I */
v.Vector .fmul_lii ( v8,v9 );
/* move-result-wide v8 */
/* add-long v2, v6, v8 */
/* .line 39 */
/* .local v2, "y":J */
/* iget v6, p1, Lv/Vector;->m_x:I */
/* iget v7, p2, Lv/Vector;->m_y:I */
v.Vector .fmul_lii ( v6,v7 );
/* move-result-wide v6 */
/* iget v8, p1, Lv/Vector;->m_y:I */
/* iget v9, p2, Lv/Vector;->m_x:I */
v.Vector .fmul_lii ( v8,v9 );
/* move-result-wide v8 */
/* sub-long v4, v6, v8 */
/* .line 49 */
/* .local v4, "z":J */
} // :goto_0
/* const-wide/32 v6, -0x40000000 */
/* cmp-long v6, v0, v6 */
/* if-ltz v6, :cond_0 */
/* const-wide/32 v6, 0x40000000 */
/* cmp-long v6, v0, v6 */
/* if-gtz v6, :cond_0 */
/* const-wide/32 v6, -0x40000000 */
/* cmp-long v6, v2, v6 */
/* if-ltz v6, :cond_0 */
/* const-wide/32 v6, 0x40000000 */
/* cmp-long v6, v2, v6 */
/* if-gtz v6, :cond_0 */
/* const-wide/32 v6, -0x40000000 */
/* cmp-long v6, v4, v6 */
/* if-ltz v6, :cond_0 */
/* const-wide/32 v6, 0x40000000 */
/* cmp-long v6, v4, v6 */
/* if-gtz v6, :cond_0 */
/* .line 64 */
/* long-to-int v6, v0 */
/* iput v6, p0, Lv/Vector;->m_x:I */
/* .line 65 */
/* long-to-int v6, v2 */
/* iput v6, p0, Lv/Vector;->m_y:I */
/* .line 66 */
/* long-to-int v6, v4 */
/* iput v6, p0, Lv/Vector;->m_z:I */
/* .line 68 */
(( v.Vector ) p0 ).normalize ( ); // invoke-virtual {p0}, Lv/Vector;->normalize()V
/* .line 69 */
return;
/* .line 50 */
} // :cond_0
int v6 = 1; // const/4 v6, 0x1
/* shr-long/2addr v0, v6 */
/* .line 51 */
int v6 = 1; // const/4 v6, 0x1
/* shr-long/2addr v2, v6 */
/* .line 52 */
int v6 = 1; // const/4 v6, 0x1
/* shr-long/2addr v4, v6 */
} // .end method
public void divide ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "d" # I */
/* .prologue */
/* .line 72 */
/* iget v0, p0, Lv/Vector;->m_x:I */
v0 = v.Vector .fdiv ( v0,p1 );
/* iget v1, p0, Lv/Vector;->m_y:I */
v1 = v.Vector .fdiv ( v1,p1 );
/* iget v2, p0, Lv/Vector;->m_z:I */
v2 = v.Vector .fdiv ( v2,p1 );
(( v.Vector ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lv/Vector;->set(III)V
/* .line 73 */
return;
} // .end method
public Integer dotProduct ( v.Vector p0 ) {
/* .locals 2 */
/* .param p1, "v" # Lv/Vector; */
/* .prologue */
/* .line 78 */
(( v.Vector ) p0 ).dotProductLong ( p1 ); // invoke-virtual {p0, p1}, Lv/Vector;->dotProductLong(Lv/Vector;)J
/* move-result-wide v0 */
v0 = v.Vector .fl2i ( v0,v1 );
} // .end method
public Long dotProductLong ( v.Vector p0 ) {
/* .locals 4 */
/* .param p1, "v" # Lv/Vector; */
/* .prologue */
/* .line 84 */
/* iget v0, p0, Lv/Vector;->m_x:I */
/* iget v1, p1, Lv/Vector;->m_x:I */
v.Vector .fmul_lii ( v0,v1 );
/* move-result-wide v0 */
/* iget v2, p0, Lv/Vector;->m_y:I */
/* iget v3, p1, Lv/Vector;->m_y:I */
v.Vector .fmul_lii ( v2,v3 );
/* move-result-wide v2 */
/* add-long/2addr v0, v2 */
/* iget v2, p0, Lv/Vector;->m_z:I */
/* iget v3, p1, Lv/Vector;->m_z:I */
v.Vector .fmul_lii ( v2,v3 );
/* move-result-wide v2 */
/* add-long/2addr v0, v2 */
/* const/16 v2, 0xf */
/* shr-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public Boolean equals ( v.Vector p0 ) {
/* .locals 2 */
/* .param p1, "v" # Lv/Vector; */
/* .prologue */
/* .line 88 */
/* iget v0, p0, Lv/Vector;->m_x:I */
/* iget v1, p1, Lv/Vector;->m_x:I */
/* if-ne v0, v1, :cond_0 */
/* iget v0, p0, Lv/Vector;->m_y:I */
/* iget v1, p1, Lv/Vector;->m_y:I */
/* if-ne v0, v1, :cond_0 */
/* iget v0, p0, Lv/Vector;->m_z:I */
/* iget v1, p1, Lv/Vector;->m_z:I */
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean isZero ( ) {
/* .locals 1 */
/* .prologue */
/* .line 92 */
/* iget v0, p0, Lv/Vector;->m_x:I */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lv/Vector;->m_y:I */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lv/Vector;->m_z:I */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void lsh ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "nbits" # I */
/* .prologue */
/* .line 97 */
/* iget v0, p0, Lv/Vector;->m_x:I */
/* shl-int/2addr v0, p1 */
/* iput v0, p0, Lv/Vector;->m_x:I */
/* .line 98 */
/* iget v0, p0, Lv/Vector;->m_y:I */
/* shl-int/2addr v0, p1 */
/* iput v0, p0, Lv/Vector;->m_y:I */
/* .line 99 */
/* iget v0, p0, Lv/Vector;->m_z:I */
/* shl-int/2addr v0, p1 */
/* iput v0, p0, Lv/Vector;->m_z:I */
/* .line 100 */
return;
} // .end method
public Integer magnitude ( ) {
/* .locals 2 */
/* .prologue */
/* .line 120 */
(( v.Vector ) p0 ).magnitudeSquaredLong ( ); // invoke-virtual {p0}, Lv/Vector;->magnitudeSquaredLong()J
/* move-result-wide v0 */
v0 = v.Vector .fsqrtl ( v0,v1 );
} // .end method
public Integer magnitudeApprox ( ) {
/* .locals 3 */
/* .prologue */
/* .line 125 */
/* iget v0, p0, Lv/Vector;->m_x:I */
/* iget v1, p0, Lv/Vector;->m_y:I */
/* iget v2, p0, Lv/Vector;->m_z:I */
v0 = v.Vector .magnitudeApprox ( v0,v1,v2 );
} // .end method
public Long magnitudeSquaredLong ( ) {
/* .locals 6 */
/* .prologue */
/* .line 103 */
/* iget v4, p0, Lv/Vector;->m_x:I */
/* int-to-long v0, v4 */
/* .line 104 */
/* .local v0, "sum":J */
/* mul-long/2addr v0, v0 */
/* .line 106 */
/* iget v4, p0, Lv/Vector;->m_y:I */
/* int-to-long v2, v4 */
/* .line 107 */
/* .local v2, "t":J */
/* mul-long/2addr v2, v2 */
/* .line 108 */
/* add-long/2addr v0, v2 */
/* .line 110 */
/* iget v4, p0, Lv/Vector;->m_z:I */
/* int-to-long v2, v4 */
/* .line 111 */
/* mul-long/2addr v2, v2 */
/* .line 112 */
/* add-long/2addr v0, v2 */
/* .line 114 */
/* const/16 v4, 0xf */
/* shr-long v4, v0, v4 */
/* return-wide v4 */
} // .end method
public void mulAdd ( v.Vector p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "v" # Lv/Vector; */
/* .param p2, "m" # I */
/* .prologue */
/* .line 171 */
/* iget v0, p0, Lv/Vector;->m_x:I */
/* iget v1, p1, Lv/Vector;->m_x:I */
v1 = v.Vector .fmul ( v1,p2 );
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lv/Vector;->m_x:I */
/* .line 172 */
/* iget v0, p0, Lv/Vector;->m_y:I */
/* iget v1, p1, Lv/Vector;->m_y:I */
v1 = v.Vector .fmul ( v1,p2 );
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lv/Vector;->m_y:I */
/* .line 173 */
/* iget v0, p0, Lv/Vector;->m_z:I */
/* iget v1, p1, Lv/Vector;->m_z:I */
v1 = v.Vector .fmul ( v1,p2 );
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lv/Vector;->m_z:I */
/* .line 174 */
return;
} // .end method
public void multiply ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "m" # I */
/* .prologue */
/* .line 177 */
/* iget v0, p0, Lv/Vector;->m_x:I */
v0 = v.Vector .fmul ( p1,v0 );
/* iget v1, p0, Lv/Vector;->m_y:I */
v1 = v.Vector .fmul ( p1,v1 );
/* iget v2, p0, Lv/Vector;->m_z:I */
v2 = v.Vector .fmul ( p1,v2 );
(( v.Vector ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lv/Vector;->set(III)V
/* .line 178 */
return;
} // .end method
public void negate ( ) {
/* .locals 3 */
/* .prologue */
/* .line 181 */
/* iget v0, p0, Lv/Vector;->m_x:I */
/* neg-int v0, v0 */
/* iget v1, p0, Lv/Vector;->m_y:I */
/* neg-int v1, v1 */
/* iget v2, p0, Lv/Vector;->m_z:I */
/* neg-int v2, v2 */
(( v.Vector ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lv/Vector;->set(III)V
/* .line 182 */
return;
} // .end method
public void normalize ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 185 */
v0 = (( v.Vector ) p0 ).magnitude ( ); // invoke-virtual {p0}, Lv/Vector;->magnitude()I
/* .line 187 */
/* .local v0, "m":I */
int v1 = 1; // const/4 v1, 0x1
/* if-le v0, v1, :cond_0 */
/* .line 190 */
(( v.Vector ) p0 ).divide ( v0 ); // invoke-virtual {p0, v0}, Lv/Vector;->divide(I)V
/* .line 198 */
} // :goto_0
return;
/* .line 196 */
} // :cond_0
(( v.Vector ) p0 ).set ( v2, v2, v2 ); // invoke-virtual {p0, v2, v2, v2}, Lv/Vector;->set(III)V
} // .end method
public void print ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 207 */
return;
} // .end method
public final void set ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "z" # I */
/* .prologue */
/* .line 226 */
/* iput p1, p0, Lv/Vector;->m_x:I */
/* .line 227 */
/* iput p2, p0, Lv/Vector;->m_y:I */
/* .line 228 */
/* iput p3, p0, Lv/Vector;->m_z:I */
/* .line 229 */
return;
} // .end method
public void set ( v.Vector p0 ) {
/* .locals 3 */
/* .param p1, "v" # Lv/Vector; */
/* .prologue */
/* .line 210 */
/* iget v0, p1, Lv/Vector;->m_x:I */
/* iget v1, p1, Lv/Vector;->m_y:I */
/* iget v2, p1, Lv/Vector;->m_z:I */
(( v.Vector ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lv/Vector;->set(III)V
/* .line 211 */
return;
} // .end method
public final void set_l ( Long p0, Long p1, Long p2 ) {
/* .locals 1 */
/* .param p1, "x" # J */
/* .param p3, "y" # J */
/* .param p5, "z" # J */
/* .prologue */
/* .line 215 */
/* long-to-int v0, p1 */
/* iput v0, p0, Lv/Vector;->m_x:I */
/* .line 216 */
/* long-to-int v0, p3 */
/* iput v0, p0, Lv/Vector;->m_y:I */
/* .line 217 */
/* long-to-int v0, p5 */
/* iput v0, p0, Lv/Vector;->m_z:I */
/* .line 223 */
return;
} // .end method
public final void shr ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "nbits" # I */
/* .prologue */
/* .line 233 */
/* iget v0, p0, Lv/Vector;->m_x:I */
/* shr-int/2addr v0, p1 */
/* iput v0, p0, Lv/Vector;->m_x:I */
/* .line 234 */
/* iget v0, p0, Lv/Vector;->m_y:I */
/* shr-int/2addr v0, p1 */
/* iput v0, p0, Lv/Vector;->m_y:I */
/* .line 235 */
/* iget v0, p0, Lv/Vector;->m_z:I */
/* shr-int/2addr v0, p1 */
/* iput v0, p0, Lv/Vector;->m_z:I */
/* .line 236 */
return;
} // .end method
public void sub ( v.Vector p0 ) {
/* .locals 3 */
/* .param p1, "v" # Lv/Vector; */
/* .prologue */
/* .line 239 */
/* iget v0, p1, Lv/Vector;->m_x:I */
/* neg-int v0, v0 */
/* iget v1, p1, Lv/Vector;->m_y:I */
/* neg-int v1, v1 */
/* iget v2, p1, Lv/Vector;->m_z:I */
/* neg-int v2, v2 */
(( v.Vector ) p0 ).add ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lv/Vector;->add(III)V
/* .line 240 */
return;
} // .end method
