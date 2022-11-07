public class v.Vdecal extends v.V3dModel {
	 /* .source "Vdecal.java" */
	 /* # direct methods */
	 public v.Vdecal ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Lv/V3dModel;-><init>()V */
		 /* .line 8 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lv/Vdecal;->m_decal:Z */
		 /* .line 9 */
		 /* const/16 v0, 0xc */
		 (( v.Vdecal ) p0 ).allocVertices ( v0 ); // invoke-virtual {p0, v0}, Lv/Vdecal;->allocVertices(I)V
		 /* .line 10 */
		 int v0 = 2; // const/4 v0, 0x2
		 (( v.Vdecal ) p0 ).allocFaces ( v0 ); // invoke-virtual {p0, v0}, Lv/Vdecal;->allocFaces(I)V
		 /* .line 11 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 void set ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 2 */
		 /* .param p1, "i" # I */
		 /* .param p2, "x" # I */
		 /* .param p3, "y" # I */
		 /* .param p4, "z" # I */
		 /* .param p5, "scale" # I */
		 /* .prologue */
		 /* .line 14 */
		 v0 = this.m_x;
		 v1 = 		 v.Vdecal .fmul ( p2,p5 );
		 /* int-to-short v1, v1 */
		 /* aput-short v1, v0, p1 */
		 /* .line 15 */
		 v0 = this.m_y;
		 v1 = 		 v.Vdecal .fmul ( p3,p5 );
		 /* int-to-short v1, v1 */
		 /* aput-short v1, v0, p1 */
		 /* .line 16 */
		 v0 = this.m_z;
		 v1 = 		 v.Vdecal .fmul ( p4,p5 );
		 /* int-to-short v1, v1 */
		 /* aput-short v1, v0, p1 */
		 /* .line 17 */
		 return;
	 } // .end method
	 public void set ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10, Integer p11, Integer p12, Integer p13 ) {
		 /* .locals 6 */
		 /* .param p1, "scale" # I */
		 /* .param p2, "material" # I */
		 /* .param p3, "x0" # I */
		 /* .param p4, "y0" # I */
		 /* .param p5, "z0" # I */
		 /* .param p6, "x1" # I */
		 /* .param p7, "y1" # I */
		 /* .param p8, "z1" # I */
		 /* .param p9, "x2" # I */
		 /* .param p10, "y2" # I */
		 /* .param p11, "z2" # I */
		 /* .param p12, "x3" # I */
		 /* .param p13, "y3" # I */
		 /* .param p14, "z3" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* iput p1, p0, Lv/Vdecal;->m_vscale:I */
		 /* .line 35 */
		 p1 = 		 v.Vdecal .finv ( p1 );
		 /* .line 37 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* move-object v0, p0 */
		 /* move v2, p3 */
		 /* move v3, p4 */
		 /* move v4, p5 */
		 /* move v5, p1 */
		 /* invoke-virtual/range {v0 ..v5}, Lv/Vdecal;->set(IIIII)V */
		 /* .line 38 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* move-object v0, p0 */
		 /* move v2, p6 */
		 /* move v3, p7 */
		 /* move v4, p8 */
		 /* move v5, p1 */
		 /* invoke-virtual/range {v0 ..v5}, Lv/Vdecal;->set(IIIII)V */
		 /* .line 39 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* move-object v0, p0 */
		 /* move v2, p9 */
		 /* move/from16 v3, p10 */
		 /* move/from16 v4, p11 */
		 /* move v5, p1 */
		 /* invoke-virtual/range {v0 ..v5}, Lv/Vdecal;->set(IIIII)V */
		 /* .line 40 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* move-object v0, p0 */
		 /* move/from16 v2, p12 */
		 /* move/from16 v3, p13 */
		 /* move/from16 v4, p14 */
		 /* move v5, p1 */
		 /* invoke-virtual/range {v0 ..v5}, Lv/Vdecal;->set(IIIII)V */
		 /* .line 42 */
		 (( v.Vdecal ) p0 ).calcExtent ( ); // invoke-virtual {p0}, Lv/Vdecal;->calcExtent()V
		 /* .line 44 */
		 v0 = this.m_a;
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-short v2, v0, v1 */
		 /* .line 45 */
		 v0 = this.m_b;
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput-short v2, v0, v1 */
		 /* .line 46 */
		 v0 = this.m_c;
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 2; // const/4 v2, 0x2
		 /* aput-short v2, v0, v1 */
		 /* .line 48 */
		 v0 = this.m_a;
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-short v2, v0, v1 */
		 /* .line 49 */
		 v0 = this.m_b;
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 2; // const/4 v2, 0x2
		 /* aput-short v2, v0, v1 */
		 /* .line 50 */
		 v0 = this.m_c;
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 3; // const/4 v2, 0x3
		 /* aput-short v2, v0, v1 */
		 /* .line 52 */
		 v0 = this.m_mati;
		 int v1 = 0; // const/4 v1, 0x0
		 /* int-to-byte v2, p2 */
		 /* aput-byte v2, v0, v1 */
		 /* .line 53 */
		 v0 = this.m_mati;
		 int v1 = 1; // const/4 v1, 0x1
		 /* int-to-byte v2, p2 */
		 /* aput-byte v2, v0, v1 */
		 /* .line 55 */
		 v0 = this.m_u;
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-short v2, v0, v1 */
		 /* .line 56 */
		 v0 = this.m_u;
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-short v2, v0, v1 */
		 /* .line 57 */
		 v0 = this.m_u;
		 int v1 = 2; // const/4 v1, 0x2
		 /* const/16 v2, 0x200 */
		 /* aput-short v2, v0, v1 */
		 /* .line 58 */
		 v0 = this.m_u;
		 int v1 = 3; // const/4 v1, 0x3
		 /* const/16 v2, 0x200 */
		 /* aput-short v2, v0, v1 */
		 /* .line 60 */
		 v0 = this.m_v;
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-short v2, v0, v1 */
		 /* .line 61 */
		 v0 = this.m_v;
		 int v1 = 1; // const/4 v1, 0x1
		 /* const/16 v2, 0x200 */
		 /* aput-short v2, v0, v1 */
		 /* .line 62 */
		 v0 = this.m_v;
		 int v1 = 2; // const/4 v1, 0x2
		 /* const/16 v2, 0x200 */
		 /* aput-short v2, v0, v1 */
		 /* .line 63 */
		 v0 = this.m_v;
		 int v1 = 3; // const/4 v1, 0x3
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-short v2, v0, v1 */
		 /* .line 64 */
		 return;
	 } // .end method
