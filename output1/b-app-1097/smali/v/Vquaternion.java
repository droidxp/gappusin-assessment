public class v.Vquaternion extends v.V {
	 /* .source "Vquaternion.java" */
	 /* # instance fields */
	 Integer m_n;
	 Integer m_x;
	 Integer m_y;
	 Integer m_z;
	 /* # direct methods */
	 public v.Vquaternion ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 103 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 /* .line 104 */
		 /* const v0, 0x8000 */
		 /* iput v0, p0, Lv/Vquaternion;->m_n:I */
		 /* .line 106 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( v.Vquaternion p0 ) {
		 /* .locals 2 */
		 /* .param p1, "q" # Lv/Vquaternion; */
		 /* .prologue */
		 /* .line 13 */
		 /* iget v0, p0, Lv/Vquaternion;->m_n:I */
		 /* iget v1, p1, Lv/Vquaternion;->m_n:I */
		 /* add-int/2addr v0, v1 */
		 /* iput v0, p0, Lv/Vquaternion;->m_n:I */
		 /* .line 14 */
		 /* iget v0, p0, Lv/Vquaternion;->m_x:I */
		 /* iget v1, p1, Lv/Vquaternion;->m_x:I */
		 /* add-int/2addr v0, v1 */
		 /* iput v0, p0, Lv/Vquaternion;->m_x:I */
		 /* .line 15 */
		 /* iget v0, p0, Lv/Vquaternion;->m_y:I */
		 /* iget v1, p1, Lv/Vquaternion;->m_y:I */
		 /* add-int/2addr v0, v1 */
		 /* iput v0, p0, Lv/Vquaternion;->m_y:I */
		 /* .line 16 */
		 /* iget v0, p0, Lv/Vquaternion;->m_z:I */
		 /* iget v1, p1, Lv/Vquaternion;->m_z:I */
		 /* add-int/2addr v0, v1 */
		 /* iput v0, p0, Lv/Vquaternion;->m_z:I */
		 /* .line 17 */
		 return;
	 } // .end method
	 void multiply ( Integer p0 ) {
		 /* .locals 4 */
		 /* .param p1, "s" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* iget v0, p0, Lv/Vquaternion;->m_n:I */
		 v0 = 		 v.Vquaternion .fmul ( v0,p1 );
		 /* iget v1, p0, Lv/Vquaternion;->m_x:I */
		 v1 = 		 v.Vquaternion .fmul ( v1,p1 );
		 /* iget v2, p0, Lv/Vquaternion;->m_y:I */
		 v2 = 		 v.Vquaternion .fmul ( v2,p1 );
		 /* iget v3, p0, Lv/Vquaternion;->m_z:I */
		 v3 = 		 v.Vquaternion .fmul ( v3,p1 );
		 (( v.Vquaternion ) p0 ).set ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lv/Vquaternion;->set(IIII)V
		 /* .line 46 */
		 return;
	 } // .end method
	 public void multiply ( v.Vquaternion p0, v.Vector p1 ) {
		 /* .locals 6 */
		 /* .param p1, "q" # Lv/Vquaternion; */
		 /* .param p2, "v" # Lv/Vector; */
		 /* .prologue */
		 /* .line 49 */
		 /* .line 50 */
		 /* iget v0, p1, Lv/Vquaternion;->m_x:I */
		 /* iget v1, p2, Lv/Vector;->m_x:I */
		 v0 = 		 v.Vquaternion .fmul ( v0,v1 );
		 /* iget v1, p1, Lv/Vquaternion;->m_y:I */
		 /* iget v2, p2, Lv/Vector;->m_y:I */
		 v1 = 		 v.Vquaternion .fmul ( v1,v2 );
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p1, Lv/Vquaternion;->m_z:I */
		 /* iget v2, p2, Lv/Vector;->m_z:I */
		 v1 = 		 v.Vquaternion .fmul ( v1,v2 );
		 /* add-int/2addr v0, v1 */
		 /* neg-int v0, v0 */
		 /* .line 51 */
		 /* iget v1, p1, Lv/Vquaternion;->m_n:I */
		 /* iget v2, p2, Lv/Vector;->m_x:I */
		 v1 = 		 v.Vquaternion .fmul ( v1,v2 );
		 /* iget v2, p1, Lv/Vquaternion;->m_y:I */
		 /* iget v3, p2, Lv/Vector;->m_z:I */
		 v2 = 		 v.Vquaternion .fmul ( v2,v3 );
		 /* add-int/2addr v1, v2 */
		 /* iget v2, p1, Lv/Vquaternion;->m_z:I */
		 /* iget v3, p2, Lv/Vector;->m_y:I */
		 v2 = 		 v.Vquaternion .fmul ( v2,v3 );
		 /* sub-int/2addr v1, v2 */
		 /* .line 52 */
		 /* iget v2, p1, Lv/Vquaternion;->m_n:I */
		 /* iget v3, p2, Lv/Vector;->m_y:I */
		 v2 = 		 v.Vquaternion .fmul ( v2,v3 );
		 /* iget v3, p1, Lv/Vquaternion;->m_z:I */
		 /* iget v4, p2, Lv/Vector;->m_x:I */
		 v3 = 		 v.Vquaternion .fmul ( v3,v4 );
		 /* add-int/2addr v2, v3 */
		 /* iget v3, p1, Lv/Vquaternion;->m_x:I */
		 /* iget v4, p2, Lv/Vector;->m_z:I */
		 v3 = 		 v.Vquaternion .fmul ( v3,v4 );
		 /* sub-int/2addr v2, v3 */
		 /* .line 53 */
		 /* iget v3, p1, Lv/Vquaternion;->m_n:I */
		 /* iget v4, p2, Lv/Vector;->m_z:I */
		 v3 = 		 v.Vquaternion .fmul ( v3,v4 );
		 /* iget v4, p1, Lv/Vquaternion;->m_x:I */
		 /* iget v5, p2, Lv/Vector;->m_y:I */
		 v4 = 		 v.Vquaternion .fmul ( v4,v5 );
		 /* add-int/2addr v3, v4 */
		 /* iget v4, p1, Lv/Vquaternion;->m_y:I */
		 /* iget v5, p2, Lv/Vector;->m_x:I */
		 v4 = 		 v.Vquaternion .fmul ( v4,v5 );
		 /* sub-int/2addr v3, v4 */
		 /* .line 49 */
		 (( v.Vquaternion ) p0 ).set ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lv/Vquaternion;->set(IIII)V
		 /* .line 55 */
		 return;
	 } // .end method
	 void normalize ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 /* .line 58 */
		 /* iget v1, p0, Lv/Vquaternion;->m_n:I */
		 /* int-to-long v1, v1 */
		 /* iget v3, p0, Lv/Vquaternion;->m_n:I */
		 /* int-to-long v3, v3 */
		 /* mul-long/2addr v1, v3 */
		 /* iget v3, p0, Lv/Vquaternion;->m_x:I */
		 /* int-to-long v3, v3 */
		 /* iget v5, p0, Lv/Vquaternion;->m_x:I */
		 /* int-to-long v5, v5 */
		 /* mul-long/2addr v3, v5 */
		 /* add-long/2addr v1, v3 */
		 /* iget v3, p0, Lv/Vquaternion;->m_y:I */
		 /* int-to-long v3, v3 */
		 /* iget v5, p0, Lv/Vquaternion;->m_y:I */
		 /* int-to-long v5, v5 */
		 /* mul-long/2addr v3, v5 */
		 /* add-long/2addr v1, v3 */
		 /* iget v3, p0, Lv/Vquaternion;->m_z:I */
		 /* int-to-long v3, v3 */
		 /* iget v5, p0, Lv/Vquaternion;->m_z:I */
		 /* int-to-long v5, v5 */
		 /* mul-long/2addr v3, v5 */
		 /* add-long/2addr v1, v3 */
		 /* const/16 v3, 0xf */
		 /* shr-long/2addr v1, v3 */
		 v0 = 		 v.Vquaternion .fsqrtl ( v1,v2 );
		 /* .line 59 */
		 /* .local v0, "mag":I */
		 /* if-lez v0, :cond_0 */
		 /* .line 60 */
		 v1 = 		 v.Vquaternion .finv ( v0 );
		 (( v.Vquaternion ) p0 ).multiply ( v1 ); // invoke-virtual {p0, v1}, Lv/Vquaternion;->multiply(I)V
		 /* .line 62 */
	 } // :cond_0
	 return;
} // .end method
void print ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .param p1, "s" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 72 */
	 return;
} // .end method
public void set ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 0 */
	 /* .param p1, "n" # I */
	 /* .param p2, "x" # I */
	 /* .param p3, "y" # I */
	 /* .param p4, "z" # I */
	 /* .prologue */
	 /* .line 75 */
	 /* iput p1, p0, Lv/Vquaternion;->m_n:I */
	 /* .line 76 */
	 /* iput p2, p0, Lv/Vquaternion;->m_x:I */
	 /* .line 77 */
	 /* iput p3, p0, Lv/Vquaternion;->m_y:I */
	 /* .line 78 */
	 /* iput p4, p0, Lv/Vquaternion;->m_z:I */
	 /* .line 79 */
	 return;
} // .end method
public void setHeadingBankPitch ( Integer p0, Integer p1, Integer p2 ) {
	 /* .locals 12 */
	 /* .param p1, "yaw" # I */
	 /* .param p2, "roll" # I */
	 /* .param p3, "pitch" # I */
	 /* .prologue */
	 /* .line 85 */
	 /* shr-int/lit8 v10, p1, 0x1 */
	 v2 = 	 v.Vquaternion .fcos ( v10 );
	 /* .line 86 */
	 /* .local v2, "cyaw":I */
	 /* shr-int/lit8 v10, p3, 0x1 */
	 v0 = 	 v.Vquaternion .fcos ( v10 );
	 /* .line 87 */
	 /* .local v0, "cpitch":I */
	 /* shr-int/lit8 v10, p2, 0x1 */
	 v1 = 	 v.Vquaternion .fcos ( v10 );
	 /* .line 88 */
	 /* .local v1, "croll":I */
	 /* shr-int/lit8 v10, p1, 0x1 */
	 v7 = 	 v.Vquaternion .fsin ( v10 );
	 /* .line 89 */
	 /* .local v7, "syaw":I */
	 /* shr-int/lit8 v10, p3, 0x1 */
	 v5 = 	 v.Vquaternion .fsin ( v10 );
	 /* .line 90 */
	 /* .local v5, "spitch":I */
	 /* shr-int/lit8 v10, p2, 0x1 */
	 v6 = 	 v.Vquaternion .fsin ( v10 );
	 /* .line 92 */
	 /* .local v6, "sroll":I */
	 v3 = 	 v.Vquaternion .fmul ( v2,v0 );
	 /* .line 93 */
	 /* .local v3, "cyawcpitch":I */
	 v9 = 	 v.Vquaternion .fmul ( v7,v5 );
	 /* .line 94 */
	 /* .local v9, "syawspitch":I */
	 v4 = 	 v.Vquaternion .fmul ( v2,v5 );
	 /* .line 95 */
	 /* .local v4, "cyawspitch":I */
	 v8 = 	 v.Vquaternion .fmul ( v7,v0 );
	 /* .line 97 */
	 /* .local v8, "syawcpitch":I */
	 v10 = 	 v.Vquaternion .fmul ( v3,v1 );
	 v11 = 	 v.Vquaternion .fmul ( v9,v6 );
	 /* add-int/2addr v10, v11 */
	 /* iput v10, p0, Lv/Vquaternion;->m_n:I */
	 /* .line 98 */
	 v10 = 	 v.Vquaternion .fmul ( v3,v6 );
	 v11 = 	 v.Vquaternion .fmul ( v9,v1 );
	 /* sub-int/2addr v10, v11 */
	 /* iput v10, p0, Lv/Vquaternion;->m_x:I */
	 /* .line 99 */
	 v10 = 	 v.Vquaternion .fmul ( v4,v1 );
	 v11 = 	 v.Vquaternion .fmul ( v8,v6 );
	 /* add-int/2addr v10, v11 */
	 /* iput v10, p0, Lv/Vquaternion;->m_y:I */
	 /* .line 100 */
	 v10 = 	 v.Vquaternion .fmul ( v8,v1 );
	 v11 = 	 v.Vquaternion .fmul ( v4,v6 );
	 /* sub-int/2addr v10, v11 */
	 /* iput v10, p0, Lv/Vquaternion;->m_z:I */
	 /* .line 101 */
	 return;
} // .end method
void setMatrix ( v.Vmat p0 ) {
	 /* .locals 7 */
	 /* .param p1, "m" # Lv/Vmat; */
	 /* .prologue */
	 /* .line 25 */
	 /* iget v4, p0, Lv/Vquaternion;->m_n:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_n:I */
	 v0 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* .line 26 */
	 /* .local v0, "q00":I */
	 /* iget v4, p0, Lv/Vquaternion;->m_x:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_x:I */
	 v1 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* .line 27 */
	 /* .local v1, "q11":I */
	 /* iget v4, p0, Lv/Vquaternion;->m_y:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_y:I */
	 v2 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* .line 28 */
	 /* .local v2, "q22":I */
	 /* iget v4, p0, Lv/Vquaternion;->m_z:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_z:I */
	 v3 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* .line 30 */
	 /* .local v3, "q33":I */
	 /* add-int v4, v0, v1 */
	 /* sub-int/2addr v4, v2 */
	 /* sub-int/2addr v4, v3 */
	 /* iput v4, p1, Lv/Vmat;->m_11:I */
	 /* .line 31 */
	 /* iget v4, p0, Lv/Vquaternion;->m_x:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_y:I */
	 v4 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* iget v5, p0, Lv/Vquaternion;->m_n:I */
	 /* iget v6, p0, Lv/Vquaternion;->m_z:I */
	 v5 = 	 v.Vquaternion .fmul ( v5,v6 );
	 /* add-int/2addr v4, v5 */
	 /* shl-int/lit8 v4, v4, 0x1 */
	 /* iput v4, p1, Lv/Vmat;->m_21:I */
	 /* .line 32 */
	 /* iget v4, p0, Lv/Vquaternion;->m_x:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_z:I */
	 v4 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* iget v5, p0, Lv/Vquaternion;->m_n:I */
	 /* iget v6, p0, Lv/Vquaternion;->m_y:I */
	 v5 = 	 v.Vquaternion .fmul ( v5,v6 );
	 /* sub-int/2addr v4, v5 */
	 /* shl-int/lit8 v4, v4, 0x1 */
	 /* iput v4, p1, Lv/Vmat;->m_31:I */
	 /* .line 34 */
	 /* iget v4, p0, Lv/Vquaternion;->m_x:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_y:I */
	 v4 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* iget v5, p0, Lv/Vquaternion;->m_n:I */
	 /* iget v6, p0, Lv/Vquaternion;->m_z:I */
	 v5 = 	 v.Vquaternion .fmul ( v5,v6 );
	 /* sub-int/2addr v4, v5 */
	 /* shl-int/lit8 v4, v4, 0x1 */
	 /* iput v4, p1, Lv/Vmat;->m_12:I */
	 /* .line 35 */
	 /* sub-int v4, v0, v1 */
	 /* add-int/2addr v4, v2 */
	 /* sub-int/2addr v4, v3 */
	 /* iput v4, p1, Lv/Vmat;->m_22:I */
	 /* .line 36 */
	 /* iget v4, p0, Lv/Vquaternion;->m_y:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_z:I */
	 v4 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* iget v5, p0, Lv/Vquaternion;->m_n:I */
	 /* iget v6, p0, Lv/Vquaternion;->m_x:I */
	 v5 = 	 v.Vquaternion .fmul ( v5,v6 );
	 /* add-int/2addr v4, v5 */
	 /* shl-int/lit8 v4, v4, 0x1 */
	 /* iput v4, p1, Lv/Vmat;->m_32:I */
	 /* .line 38 */
	 /* iget v4, p0, Lv/Vquaternion;->m_x:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_z:I */
	 v4 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* iget v5, p0, Lv/Vquaternion;->m_n:I */
	 /* iget v6, p0, Lv/Vquaternion;->m_y:I */
	 v5 = 	 v.Vquaternion .fmul ( v5,v6 );
	 /* add-int/2addr v4, v5 */
	 /* shl-int/lit8 v4, v4, 0x1 */
	 /* iput v4, p1, Lv/Vmat;->m_13:I */
	 /* .line 39 */
	 /* iget v4, p0, Lv/Vquaternion;->m_y:I */
	 /* iget v5, p0, Lv/Vquaternion;->m_z:I */
	 v4 = 	 v.Vquaternion .fmul ( v4,v5 );
	 /* iget v5, p0, Lv/Vquaternion;->m_n:I */
	 /* iget v6, p0, Lv/Vquaternion;->m_x:I */
	 v5 = 	 v.Vquaternion .fmul ( v5,v6 );
	 /* sub-int/2addr v4, v5 */
	 /* shl-int/lit8 v4, v4, 0x1 */
	 /* iput v4, p1, Lv/Vmat;->m_23:I */
	 /* .line 40 */
	 /* sub-int v4, v0, v1 */
	 /* sub-int/2addr v4, v2 */
	 /* add-int/2addr v4, v3 */
	 /* iput v4, p1, Lv/Vmat;->m_33:I */
	 /* .line 41 */
	 return;
} // .end method
