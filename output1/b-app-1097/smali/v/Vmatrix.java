public class v.Vmatrix extends v.V {
	 /* .source "Vmatrix.java" */
	 /* # instance fields */
	 Integer m_11;
	 Integer m_12;
	 Integer m_13;
	 Integer m_21;
	 Integer m_22;
	 Integer m_23;
	 Integer m_31;
	 Integer m_32;
	 Integer m_33;
	 /* # direct methods */
	 public v.Vmatrix ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 72 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 /* .line 73 */
		 (( v.Vmatrix ) p0 ).identity ( ); // invoke-virtual {p0}, Lv/Vmatrix;->identity()V
		 /* .line 74 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 final Integer checksum ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 12 */
		 /* iget v0, p0, Lv/Vmatrix;->m_11:I */
		 /* iget v1, p0, Lv/Vmatrix;->m_12:I */
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p0, Lv/Vmatrix;->m_13:I */
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p0, Lv/Vmatrix;->m_21:I */
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p0, Lv/Vmatrix;->m_22:I */
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p0, Lv/Vmatrix;->m_23:I */
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p0, Lv/Vmatrix;->m_31:I */
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p0, Lv/Vmatrix;->m_32:I */
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p0, Lv/Vmatrix;->m_33:I */
		 /* add-int/2addr v0, v1 */
	 } // .end method
	 final void concat ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8 ) {
		 /* .locals 12 */
		 /* .param p1, "a" # I */
		 /* .param p2, "d" # I */
		 /* .param p3, "g" # I */
		 /* .param p4, "b" # I */
		 /* .param p5, "e" # I */
		 /* .param p6, "h" # I */
		 /* .param p7, "c" # I */
		 /* .param p8, "f" # I */
		 /* .param p9, "i" # I */
		 /* .prologue */
		 /* .line 21 */
		 /* .line 22 */
		 /* iget v2, p0, Lv/Vmatrix;->m_11:I */
		 v2 = 		 v.Vmatrix .fmul ( p1,v2 );
		 /* iget v3, p0, Lv/Vmatrix;->m_21:I */
		 v3 = 		 v.Vmatrix .fmul ( p2,v3 );
		 /* add-int/2addr v2, v3 */
		 /* iget v3, p0, Lv/Vmatrix;->m_31:I */
		 v3 = 		 v.Vmatrix .fmul ( p3,v3 );
		 /* add-int/2addr v3, v2 */
		 /* .line 23 */
		 /* iget v2, p0, Lv/Vmatrix;->m_12:I */
		 v2 = 		 v.Vmatrix .fmul ( p1,v2 );
		 /* iget v4, p0, Lv/Vmatrix;->m_22:I */
		 v4 = 		 v.Vmatrix .fmul ( p2,v4 );
		 /* add-int/2addr v2, v4 */
		 /* iget v4, p0, Lv/Vmatrix;->m_32:I */
		 v4 = 		 v.Vmatrix .fmul ( p3,v4 );
		 /* add-int/2addr v4, v2 */
		 /* .line 24 */
		 /* iget v2, p0, Lv/Vmatrix;->m_13:I */
		 v2 = 		 v.Vmatrix .fmul ( p1,v2 );
		 /* iget v5, p0, Lv/Vmatrix;->m_23:I */
		 v5 = 		 v.Vmatrix .fmul ( p2,v5 );
		 /* add-int/2addr v2, v5 */
		 /* iget v5, p0, Lv/Vmatrix;->m_33:I */
		 v5 = 		 v.Vmatrix .fmul ( p3,v5 );
		 /* add-int/2addr v5, v2 */
		 /* .line 26 */
		 /* iget v2, p0, Lv/Vmatrix;->m_11:I */
		 /* move/from16 v0, p4 */
		 /* move v1, v2 */
		 v2 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* iget v6, p0, Lv/Vmatrix;->m_21:I */
		 /* move/from16 v0, p5 */
		 /* move v1, v6 */
		 v6 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v2, v6 */
		 /* iget v6, p0, Lv/Vmatrix;->m_31:I */
		 /* move/from16 v0, p6 */
		 /* move v1, v6 */
		 v6 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v6, v2 */
		 /* .line 27 */
		 /* iget v2, p0, Lv/Vmatrix;->m_12:I */
		 /* move/from16 v0, p4 */
		 /* move v1, v2 */
		 v2 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* iget v7, p0, Lv/Vmatrix;->m_22:I */
		 /* move/from16 v0, p5 */
		 /* move v1, v7 */
		 v7 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v2, v7 */
		 /* iget v7, p0, Lv/Vmatrix;->m_32:I */
		 /* move/from16 v0, p6 */
		 /* move v1, v7 */
		 v7 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v7, v2 */
		 /* .line 28 */
		 /* iget v2, p0, Lv/Vmatrix;->m_13:I */
		 /* move/from16 v0, p4 */
		 /* move v1, v2 */
		 v2 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* iget v8, p0, Lv/Vmatrix;->m_23:I */
		 /* move/from16 v0, p5 */
		 /* move v1, v8 */
		 v8 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v2, v8 */
		 /* iget v8, p0, Lv/Vmatrix;->m_33:I */
		 /* move/from16 v0, p6 */
		 /* move v1, v8 */
		 v8 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v8, v2 */
		 /* .line 30 */
		 /* iget v2, p0, Lv/Vmatrix;->m_11:I */
		 /* move/from16 v0, p7 */
		 /* move v1, v2 */
		 v2 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* iget v9, p0, Lv/Vmatrix;->m_21:I */
		 /* move/from16 v0, p8 */
		 /* move v1, v9 */
		 v9 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v2, v9 */
		 /* iget v9, p0, Lv/Vmatrix;->m_31:I */
		 /* move/from16 v0, p9 */
		 /* move v1, v9 */
		 v9 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v9, v2 */
		 /* .line 31 */
		 /* iget v2, p0, Lv/Vmatrix;->m_12:I */
		 /* move/from16 v0, p7 */
		 /* move v1, v2 */
		 v2 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* iget v10, p0, Lv/Vmatrix;->m_22:I */
		 /* move/from16 v0, p8 */
		 /* move v1, v10 */
		 v10 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v2, v10 */
		 /* iget v10, p0, Lv/Vmatrix;->m_32:I */
		 /* move/from16 v0, p9 */
		 /* move v1, v10 */
		 v10 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v10, v2 */
		 /* .line 32 */
		 /* iget v2, p0, Lv/Vmatrix;->m_13:I */
		 /* move/from16 v0, p7 */
		 /* move v1, v2 */
		 v2 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* iget v11, p0, Lv/Vmatrix;->m_23:I */
		 /* move/from16 v0, p8 */
		 /* move v1, v11 */
		 v11 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v2, v11 */
		 /* iget v11, p0, Lv/Vmatrix;->m_33:I */
		 /* move/from16 v0, p9 */
		 /* move v1, v11 */
		 v11 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* add-int/2addr v11, v2 */
		 /* move-object v2, p0 */
		 /* .line 21 */
		 /* invoke-virtual/range {v2 ..v11}, Lv/Vmatrix;->set(IIIIIIIII)V */
		 /* .line 34 */
		 return;
	 } // .end method
	 public void identity ( ) {
		 /* .locals 10 */
		 /* .prologue */
		 /* const v1, 0x8000 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 37 */
		 /* move-object v0, p0 */
		 /* move v3, v2 */
		 /* move v4, v2 */
		 /* move v5, v1 */
		 /* move v6, v2 */
		 /* move v7, v2 */
		 /* move v8, v2 */
		 /* move v9, v1 */
		 /* invoke-virtual/range {v0 ..v9}, Lv/Vmatrix;->set(IIIIIIIII)V */
		 /* .line 40 */
		 return;
	 } // .end method
	 public void multiply ( v.Vector p0, v.Vector p1 ) {
		 /* .locals 5 */
		 /* .param p1, "vd" # Lv/Vector; */
		 /* .param p2, "vs" # Lv/Vector; */
		 /* .prologue */
		 /* .line 65 */
		 /* .line 66 */
		 /* iget v0, p2, Lv/Vector;->m_x:I */
		 /* iget v1, p0, Lv/Vmatrix;->m_11:I */
		 v0 = 		 v.Vmatrix .fmul ( v0,v1 );
		 /* iget v1, p2, Lv/Vector;->m_y:I */
		 /* iget v2, p0, Lv/Vmatrix;->m_21:I */
		 v1 = 		 v.Vmatrix .fmul ( v1,v2 );
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p2, Lv/Vector;->m_z:I */
		 /* iget v2, p0, Lv/Vmatrix;->m_31:I */
		 v1 = 		 v.Vmatrix .fmul ( v1,v2 );
		 /* add-int/2addr v0, v1 */
		 /* .line 67 */
		 /* iget v1, p2, Lv/Vector;->m_x:I */
		 /* iget v2, p0, Lv/Vmatrix;->m_12:I */
		 v1 = 		 v.Vmatrix .fmul ( v1,v2 );
		 /* iget v2, p2, Lv/Vector;->m_y:I */
		 /* iget v3, p0, Lv/Vmatrix;->m_22:I */
		 v2 = 		 v.Vmatrix .fmul ( v2,v3 );
		 /* add-int/2addr v1, v2 */
		 /* iget v2, p2, Lv/Vector;->m_z:I */
		 /* iget v3, p0, Lv/Vmatrix;->m_32:I */
		 v2 = 		 v.Vmatrix .fmul ( v2,v3 );
		 /* add-int/2addr v1, v2 */
		 /* .line 68 */
		 /* iget v2, p2, Lv/Vector;->m_x:I */
		 /* iget v3, p0, Lv/Vmatrix;->m_13:I */
		 v2 = 		 v.Vmatrix .fmul ( v2,v3 );
		 /* iget v3, p2, Lv/Vector;->m_y:I */
		 /* iget v4, p0, Lv/Vmatrix;->m_23:I */
		 v3 = 		 v.Vmatrix .fmul ( v3,v4 );
		 /* add-int/2addr v2, v3 */
		 /* iget v3, p2, Lv/Vector;->m_z:I */
		 /* iget v4, p0, Lv/Vmatrix;->m_33:I */
		 v3 = 		 v.Vmatrix .fmul ( v3,v4 );
		 /* add-int/2addr v2, v3 */
		 /* .line 65 */
		 (( v.Vector ) p1 ).set ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lv/Vector;->set(III)V
		 /* .line 70 */
		 return;
	 } // .end method
	 void rotateZ ( Integer p0 ) {
		 /* .locals 10 */
		 /* .param p1, "rot" # I */
		 /* .prologue */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 44 */
		 v2 = 		 v.Vmatrix .fsin ( p1 );
		 /* .line 45 */
		 /* .local v2, "s":I */
		 v1 = 		 v.Vmatrix .fcos ( p1 );
		 /* .line 48 */
		 /* .local v1, "c":I */
		 /* neg-int v4, v2 */
		 /* .line 49 */
		 /* const v9, 0x8000 */
		 /* move-object v0, p0 */
		 /* move v5, v1 */
		 /* move v6, v3 */
		 /* move v7, v3 */
		 /* move v8, v3 */
		 /* .line 46 */
		 /* invoke-virtual/range {v0 ..v9}, Lv/Vmatrix;->concat(IIIIIIIII)V */
		 /* .line 51 */
		 return;
	 } // .end method
	 public void set ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8 ) {
		 /* .locals 0 */
		 /* .param p1, "e11" # I */
		 /* .param p2, "e12" # I */
		 /* .param p3, "e13" # I */
		 /* .param p4, "e21" # I */
		 /* .param p5, "e22" # I */
		 /* .param p6, "e23" # I */
		 /* .param p7, "e31" # I */
		 /* .param p8, "e32" # I */
		 /* .param p9, "e33" # I */
		 /* .prologue */
		 /* .line 58 */
		 /* iput p1, p0, Lv/Vmatrix;->m_11:I */
		 /* iput p2, p0, Lv/Vmatrix;->m_12:I */
		 /* iput p3, p0, Lv/Vmatrix;->m_13:I */
		 /* .line 59 */
		 /* iput p4, p0, Lv/Vmatrix;->m_21:I */
		 /* iput p5, p0, Lv/Vmatrix;->m_22:I */
		 /* iput p6, p0, Lv/Vmatrix;->m_23:I */
		 /* .line 60 */
		 /* iput p7, p0, Lv/Vmatrix;->m_31:I */
		 /* iput p8, p0, Lv/Vmatrix;->m_32:I */
		 /* iput p9, p0, Lv/Vmatrix;->m_33:I */
		 /* .line 61 */
		 return;
	 } // .end method
