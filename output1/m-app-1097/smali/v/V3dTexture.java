public class v.V3dTexture {
	 /* .source "V3dTexture.java" */
	 /* # instance fields */
	 public java.lang.String m_filename;
	 public Integer m_height;
	 public Integer m_pow2;
	 public m_rgb;
	 public Integer m_scaleBits;
	 public Boolean m_trans;
	 public Integer m_width;
	 /* # direct methods */
	 public v.V3dTexture ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 56 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 57 */
		 return;
	 } // .end method
	 static final Integer shade ( Integer p0, Integer p1 ) {
		 /* .locals 5 */
		 /* .param p0, "co" # I */
		 /* .param p1, "shade" # I */
		 /* .prologue */
		 /* .line 37 */
		 /* shr-int/lit8 v3, p0, 0x10 */
		 /* and-int/lit16 v2, v3, 0xff */
		 /* .line 38 */
		 /* .local v2, "r":I */
		 /* shr-int/lit8 v3, p0, 0x8 */
		 /* and-int/lit16 v1, v3, 0xff */
		 /* .line 39 */
		 /* .local v1, "g":I */
		 /* and-int/lit16 v0, p0, 0xff */
		 /* .line 41 */
		 /* .local v0, "bl":I */
		 /* mul-int v3, v2, p1 */
		 /* shr-int/lit8 v3, v3, 0xf */
		 /* add-int/2addr v2, v3 */
		 /* .line 45 */
		 /* mul-int v3, v1, p1 */
		 /* shr-int/lit8 v3, v3, 0xf */
		 /* add-int/2addr v1, v3 */
		 /* .line 49 */
		 /* mul-int v3, v0, p1 */
		 /* shr-int/lit8 v3, v3, 0xf */
		 /* add-int/2addr v0, v3 */
		 /* .line 53 */
		 /* shl-int/lit8 v3, v2, 0x10 */
		 /* shl-int/lit8 v4, v1, 0x8 */
		 /* add-int/2addr v3, v4 */
		 /* add-int/2addr v3, v0 */
	 } // .end method
	 /* # virtual methods */
	 public void set ( java.lang.String p0, Integer[] p1, Integer p2, Integer p3, Boolean p4 ) {
		 /* .locals 3 */
		 /* .param p1, "filename" # Ljava/lang/String; */
		 /* .param p2, "rgb" # [I */
		 /* .param p3, "width" # I */
		 /* .param p4, "height" # I */
		 /* .param p5, "trans" # Z */
		 /* .prologue */
		 /* .line 15 */
		 this.m_filename = p1;
		 /* .line 16 */
		 this.m_rgb = p2;
		 /* .line 17 */
		 /* iput p3, p0, Lv/V3dTexture;->m_width:I */
		 /* .line 18 */
		 /* iput p4, p0, Lv/V3dTexture;->m_height:I */
		 /* .line 19 */
		 /* iput-boolean p5, p0, Lv/V3dTexture;->m_trans:Z */
		 /* .line 21 */
		 /* if-ne p3, p4, :cond_0 */
		 /* .line 22 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 24 */
		 /* .local v0, "pow2":I */
		 /* move v1, p3 */
		 /* .line 25 */
		 /* .local v1, "w":I */
	 } // :goto_0
	 /* if-nez v1, :cond_1 */
	 /* .line 31 */
	 int v2 = 1; // const/4 v2, 0x1
	 /* shl-int/2addr v2, v0 */
	 /* if-ne v2, p3, :cond_0 */
	 /* .line 32 */
	 /* iput v0, p0, Lv/V3dTexture;->m_pow2:I */
	 /* .line 34 */
} // .end local v0 # "pow2":I
} // .end local v1 # "w":I
} // :cond_0
return;
/* .line 26 */
/* .restart local v0 # "pow2":I */
/* .restart local v1 # "w":I */
} // :cond_1
/* shr-int/lit8 v1, v1, 0x1 */
/* .line 27 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
