public class v.Vmat extends v.V {
	 /* .source "Vmat.java" */
	 /* # instance fields */
	 Integer m_11;
	 Integer m_12;
	 Integer m_13;
	 Integer m_14;
	 Integer m_21;
	 Integer m_22;
	 Integer m_23;
	 Integer m_24;
	 Integer m_31;
	 Integer m_32;
	 Integer m_33;
	 Integer m_34;
	 Integer m_41;
	 Integer m_42;
	 Integer m_43;
	 Integer m_44;
	 /* # direct methods */
	 public v.Vmat ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 229 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 /* .line 230 */
		 (( v.Vmat ) p0 ).identity ( ); // invoke-virtual {p0}, Lv/Vmat;->identity()V
		 /* .line 231 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 Integer checksumMatrix ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 26 */
		 /* iget v0, p0, Lv/Vmat;->m_11:I */
		 /* iget v1, p0, Lv/Vmat;->m_12:I */
		 /* add-int/2addr v0, v1 */
		 /* iget v1, p0, Lv/Vmat;->m_13:I */
		 /* add-int/2addr v0, v1 */
		 /* .line 27 */
		 /* iget v1, p0, Lv/Vmat;->m_21:I */
		 /* .line 26 */
		 /* add-int/2addr v0, v1 */
		 /* .line 27 */
		 /* iget v1, p0, Lv/Vmat;->m_22:I */
		 /* .line 26 */
		 /* add-int/2addr v0, v1 */
		 /* .line 27 */
		 /* iget v1, p0, Lv/Vmat;->m_23:I */
		 /* .line 26 */
		 /* add-int/2addr v0, v1 */
		 /* .line 28 */
		 /* iget v1, p0, Lv/Vmat;->m_31:I */
		 /* .line 26 */
		 /* add-int/2addr v0, v1 */
		 /* .line 28 */
		 /* iget v1, p0, Lv/Vmat;->m_32:I */
		 /* .line 26 */
		 /* add-int/2addr v0, v1 */
		 /* .line 28 */
		 /* iget v1, p0, Lv/Vmat;->m_33:I */
		 /* .line 26 */
		 /* add-int/2addr v0, v1 */
		 /* .line 29 */
		 /* iget v1, p0, Lv/Vmat;->m_41:I */
		 /* .line 26 */
		 /* add-int/2addr v0, v1 */
		 /* .line 29 */
		 /* iget v1, p0, Lv/Vmat;->m_42:I */
		 /* .line 26 */
		 /* add-int/2addr v0, v1 */
		 /* .line 29 */
		 /* iget v1, p0, Lv/Vmat;->m_43:I */
		 /* .line 25 */
		 /* add-int/2addr v0, v1 */
	 } // .end method
	 void concat ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10, Integer p11, Integer p12, Integer p13, Integer p14, Integer p15 ) {
		 /* .locals 38 */
		 /* .param p1, "b11" # I */
		 /* .param p2, "b12" # I */
		 /* .param p3, "b13" # I */
		 /* .param p4, "b14" # I */
		 /* .param p5, "b21" # I */
		 /* .param p6, "b22" # I */
		 /* .param p7, "b23" # I */
		 /* .param p8, "b24" # I */
		 /* .param p9, "b31" # I */
		 /* .param p10, "b32" # I */
		 /* .param p11, "b33" # I */
		 /* .param p12, "b34" # I */
		 /* .param p13, "b41" # I */
		 /* .param p14, "b42" # I */
		 /* .param p15, "b43" # I */
		 /* .param p16, "b44" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_11:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide v2, v0 */
		 /* .local v2, "a11":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_12:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide v4, v0 */
		 /* .local v4, "a12":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_13:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide v6, v0 */
		 /* .local v6, "a13":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_14:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide v8, v0 */
		 /* .line 40 */
		 /* .local v8, "a14":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_21:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide v10, v0 */
		 /* .local v10, "a21":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_22:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide v12, v0 */
		 /* .local v12, "a22":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_23:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide v14, v0 */
		 /* .local v14, "a23":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_24:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v16, v0 */
		 /* .line 41 */
		 /* .local v16, "a24":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_31:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v18, v0 */
		 /* .local v18, "a31":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_32:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v20, v0 */
		 /* .local v20, "a32":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_33:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v22, v0 */
		 /* .local v22, "a33":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_34:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v24, v0 */
		 /* .line 42 */
		 /* .local v24, "a34":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_41:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v26, v0 */
		 /* .local v26, "a41":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_42:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v28, v0 */
		 /* .local v28, "a42":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_43:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v30, v0 */
		 /* .local v30, "a43":J */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/Vmat;->m_44:I */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v32, v0 */
		 /* .line 46 */
		 /* .local v32, "a44":J */
		 /* move/from16 v0, p1 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v2 */
		 /* move/from16 v0, p5 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v4 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p9 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v6 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p13 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v8 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_11:I */
		 /* .line 47 */
		 /* move/from16 v0, p2 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v2 */
		 /* move/from16 v0, p6 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v4 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p10 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v6 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p14 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v8 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_12:I */
		 /* .line 48 */
		 /* move/from16 v0, p3 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v2 */
		 /* move/from16 v0, p7 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v4 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p11 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v6 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p15 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v8 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_13:I */
		 /* .line 49 */
		 /* move/from16 v0, p4 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v2 */
		 /* move/from16 v0, p8 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v4 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p12 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v6 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p16 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v8 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_14:I */
		 /* .line 51 */
		 /* move/from16 v0, p1 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v10 */
		 /* move/from16 v0, p5 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v12 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p9 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v14 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p13 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v16 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_21:I */
		 /* .line 52 */
		 /* move/from16 v0, p2 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v10 */
		 /* move/from16 v0, p6 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v12 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p10 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v14 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p14 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v16 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_22:I */
		 /* .line 53 */
		 /* move/from16 v0, p3 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v10 */
		 /* move/from16 v0, p7 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v12 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p11 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v14 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p15 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v16 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_23:I */
		 /* .line 54 */
		 /* move/from16 v0, p4 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v10 */
		 /* move/from16 v0, p8 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v12 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p12 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v14 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p16 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v16 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_24:I */
		 /* .line 56 */
		 /* move/from16 v0, p1 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v18 */
		 /* move/from16 v0, p5 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v20 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p9 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v22 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p13 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v24 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_31:I */
		 /* .line 57 */
		 /* move/from16 v0, p2 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v18 */
		 /* move/from16 v0, p6 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v20 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p10 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v22 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p14 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v24 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_32:I */
		 /* .line 58 */
		 /* move/from16 v0, p3 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v18 */
		 /* move/from16 v0, p7 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v20 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p11 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v22 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p15 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v24 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_33:I */
		 /* .line 59 */
		 /* move/from16 v0, p4 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v18 */
		 /* move/from16 v0, p8 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v20 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p12 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v22 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p16 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v24 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_34:I */
		 /* .line 61 */
		 /* move/from16 v0, p1 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v26 */
		 /* move/from16 v0, p5 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v28 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p9 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v30 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p13 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v32 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_41:I */
		 /* .line 62 */
		 /* move/from16 v0, p2 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v26 */
		 /* move/from16 v0, p6 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v28 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p10 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v30 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p14 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v32 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_42:I */
		 /* .line 63 */
		 /* move/from16 v0, p3 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v26 */
		 /* move/from16 v0, p7 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v28 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p11 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v30 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p15 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v32 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_43:I */
		 /* .line 64 */
		 /* move/from16 v0, p4 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v34, v0 */
		 /* mul-long v34, v34, v26 */
		 /* move/from16 v0, p8 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v28 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p12 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v30 */
		 /* add-long v34, v34, v36 */
		 /* move/from16 v0, p16 */
		 /* int-to-long v0, v0 */
		 /* move-wide/from16 v36, v0 */
		 /* mul-long v36, v36, v32 */
		 /* add-long v34, v34, v36 */
		 /* const/16 v36, 0xf */
		 /* shr-long v34, v34, v36 */
		 /* move-wide/from16 v0, v34 */
		 /* long-to-int v0, v0 */
		 /* move/from16 v34, v0 */
		 /* move/from16 v0, v34 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lv/Vmat;->m_44:I */
		 /* .line 65 */
		 return;
	 } // .end method
	 public void identity ( ) {
		 /* .locals 17 */
		 /* .prologue */
		 /* .line 68 */
		 /* const v1, 0x8000 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 69 */
		 int v5 = 0; // const/4 v5, 0x0
		 /* const v6, 0x8000 */
		 int v7 = 0; // const/4 v7, 0x0
		 int v8 = 0; // const/4 v8, 0x0
		 /* .line 70 */
		 int v9 = 0; // const/4 v9, 0x0
		 int v10 = 0; // const/4 v10, 0x0
		 /* const v11, 0x8000 */
		 int v12 = 0; // const/4 v12, 0x0
		 /* .line 71 */
		 int v13 = 0; // const/4 v13, 0x0
		 int v14 = 0; // const/4 v14, 0x0
		 int v15 = 0; // const/4 v15, 0x0
		 /* const v16, 0x8000 */
		 /* move-object/from16 v0, p0 */
		 /* .line 68 */
		 /* invoke-virtual/range {v0 ..v16}, Lv/Vmat;->set(IIIIIIIIIIIIIIII)V */
		 /* .line 72 */
		 return;
	 } // .end method
	 void multiply ( v.Vmat p0 ) {
		 /* .locals 18 */
		 /* .param p1, "m" # Lv/Vmat; */
		 /* .prologue */
		 /* .line 75 */
		 /* .line 76 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_11:I */
		 /* move v2, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_12:I */
		 /* move v3, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_13:I */
		 /* move v4, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_14:I */
		 /* move v5, v0 */
		 /* .line 77 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_21:I */
		 /* move v6, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_22:I */
		 /* move v7, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_23:I */
		 /* move v8, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_24:I */
		 /* move v9, v0 */
		 /* .line 78 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_31:I */
		 /* move v10, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_32:I */
		 /* move v11, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_33:I */
		 /* move v12, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_34:I */
		 /* move v13, v0 */
		 /* .line 79 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_41:I */
		 /* move v14, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_42:I */
		 /* move v15, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_43:I */
		 /* move/from16 v16, v0 */
		 /* move-object/from16 v0, p1 */
		 /* iget v0, v0, Lv/Vmat;->m_44:I */
		 /* move/from16 v17, v0 */
		 /* move-object/from16 v1, p0 */
		 /* .line 75 */
		 /* invoke-virtual/range {v1 ..v17}, Lv/Vmat;->concat(IIIIIIIIIIIIIIII)V */
		 /* .line 81 */
		 return;
	 } // .end method
	 void print ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p1, "s" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 84 */
		 v0 = java.lang.System.out;
		 (( java.io.PrintStream ) v0 ).println ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* .line 85 */
		 /* iget v0, p0, Lv/Vmat;->m_11:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_12:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_13:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_14:I */
		 v.Vmat .fprintln ( v0 );
		 /* .line 86 */
		 /* iget v0, p0, Lv/Vmat;->m_21:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_22:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_23:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_24:I */
		 v.Vmat .fprintln ( v0 );
		 /* .line 87 */
		 /* iget v0, p0, Lv/Vmat;->m_31:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_32:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_33:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_34:I */
		 v.Vmat .fprintln ( v0 );
		 /* .line 88 */
		 /* iget v0, p0, Lv/Vmat;->m_41:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_42:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_43:I */
		 v.Vmat .fprint ( v0 );
		 /* iget v0, p0, Lv/Vmat;->m_44:I */
		 v.Vmat .fprintln ( v0 );
		 /* .line 89 */
		 return;
	 } // .end method
	 public void rotate ( v.Vector p0 ) {
		 /* .locals 0 */
		 /* .param p1, "d" # Lv/Vector; */
		 /* .prologue */
		 /* .line 92 */
		 (( v.Vmat ) p0 ).rotate ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lv/Vmat;->rotate(Lv/Vector;Lv/Vector;)V
		 /* .line 93 */
		 return;
	 } // .end method
	 void rotate ( v.Vector p0, v.Vector p1 ) {
		 /* .locals 7 */
		 /* .param p1, "d" # Lv/Vector; */
		 /* .param p2, "s" # Lv/Vector; */
		 /* .prologue */
		 /* .line 97 */
		 /* iget v0, p2, Lv/Vector;->m_x:I */
		 /* .line 98 */
		 /* .local v0, "x":I */
		 /* iget v1, p2, Lv/Vector;->m_y:I */
		 /* .line 99 */
		 /* .local v1, "y":I */
		 /* iget v2, p2, Lv/Vector;->m_z:I */
		 /* .line 102 */
		 /* .local v2, "z":I */
		 /* iget v3, p0, Lv/Vmat;->m_11:I */
		 v3 = 		 v.Vmat .fmul ( v3,v0 );
		 /* iget v4, p0, Lv/Vmat;->m_21:I */
		 v4 = 		 v.Vmat .fmul ( v4,v1 );
		 /* add-int/2addr v3, v4 */
		 /* iget v4, p0, Lv/Vmat;->m_31:I */
		 v4 = 		 v.Vmat .fmul ( v4,v2 );
		 /* add-int/2addr v3, v4 */
		 /* .line 103 */
		 /* iget v4, p0, Lv/Vmat;->m_12:I */
		 v4 = 		 v.Vmat .fmul ( v4,v0 );
		 /* iget v5, p0, Lv/Vmat;->m_22:I */
		 v5 = 		 v.Vmat .fmul ( v5,v1 );
		 /* add-int/2addr v4, v5 */
		 /* iget v5, p0, Lv/Vmat;->m_32:I */
		 v5 = 		 v.Vmat .fmul ( v5,v2 );
		 /* add-int/2addr v4, v5 */
		 /* .line 104 */
		 /* iget v5, p0, Lv/Vmat;->m_13:I */
		 v5 = 		 v.Vmat .fmul ( v5,v0 );
		 /* iget v6, p0, Lv/Vmat;->m_23:I */
		 v6 = 		 v.Vmat .fmul ( v6,v1 );
		 /* add-int/2addr v5, v6 */
		 /* iget v6, p0, Lv/Vmat;->m_33:I */
		 v6 = 		 v.Vmat .fmul ( v6,v2 );
		 /* add-int/2addr v5, v6 */
		 /* .line 101 */
		 (( v.Vector ) p1 ).set ( v3, v4, v5 ); // invoke-virtual {p1, v3, v4, v5}, Lv/Vector;->set(III)V
		 /* .line 106 */
		 return;
	 } // .end method
	 public void rotateInverse ( v.Vector p0, v.Vector p1 ) {
		 /* .locals 7 */
		 /* .param p1, "d" # Lv/Vector; */
		 /* .param p2, "s" # Lv/Vector; */
		 /* .prologue */
		 /* .line 110 */
		 /* iget v0, p2, Lv/Vector;->m_x:I */
		 /* .line 111 */
		 /* .local v0, "x":I */
		 /* iget v1, p2, Lv/Vector;->m_y:I */
		 /* .line 112 */
		 /* .local v1, "y":I */
		 /* iget v2, p2, Lv/Vector;->m_z:I */
		 /* .line 115 */
		 /* .local v2, "z":I */
		 /* iget v3, p0, Lv/Vmat;->m_11:I */
		 v3 = 		 v.Vmat .fmul ( v3,v0 );
		 /* iget v4, p0, Lv/Vmat;->m_12:I */
		 v4 = 		 v.Vmat .fmul ( v4,v1 );
		 /* add-int/2addr v3, v4 */
		 /* iget v4, p0, Lv/Vmat;->m_13:I */
		 v4 = 		 v.Vmat .fmul ( v4,v2 );
		 /* add-int/2addr v3, v4 */
		 /* .line 116 */
		 /* iget v4, p0, Lv/Vmat;->m_21:I */
		 v4 = 		 v.Vmat .fmul ( v4,v0 );
		 /* iget v5, p0, Lv/Vmat;->m_22:I */
		 v5 = 		 v.Vmat .fmul ( v5,v1 );
		 /* add-int/2addr v4, v5 */
		 /* iget v5, p0, Lv/Vmat;->m_23:I */
		 v5 = 		 v.Vmat .fmul ( v5,v2 );
		 /* add-int/2addr v4, v5 */
		 /* .line 117 */
		 /* iget v5, p0, Lv/Vmat;->m_31:I */
		 v5 = 		 v.Vmat .fmul ( v5,v0 );
		 /* iget v6, p0, Lv/Vmat;->m_32:I */
		 v6 = 		 v.Vmat .fmul ( v6,v1 );
		 /* add-int/2addr v5, v6 */
		 /* iget v6, p0, Lv/Vmat;->m_33:I */
		 v6 = 		 v.Vmat .fmul ( v6,v2 );
		 /* add-int/2addr v5, v6 */
		 /* .line 114 */
		 (( v.Vector ) p1 ).set ( v3, v4, v5 ); // invoke-virtual {p1, v3, v4, v5}, Lv/Vector;->set(III)V
		 /* .line 119 */
		 return;
	 } // .end method
	 public void rotateX ( Integer p0 ) {
		 /* .locals 17 */
		 /* .param p1, "rot" # I */
		 /* .prologue */
		 /* .line 124 */
		 /* if-nez p1, :cond_0 */
		 /* .line 135 */
	 } // :goto_0
	 return;
	 /* .line 127 */
} // :cond_0
v10 = /* invoke-static/range {p1 ..p1}, Lv/Vmat;->fsin(I)I */
/* .line 128 */
/* .local v10, "s":I */
v6 = /* invoke-static/range {p1 ..p1}, Lv/Vmat;->fcos(I)I */
/* .line 130 */
/* .local v6, "c":I */
/* const v1, 0x8000 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* .line 131 */
int v5 = 0; // const/4 v5, 0x0
/* neg-int v7, v10 */
int v8 = 0; // const/4 v8, 0x0
/* .line 132 */
int v9 = 0; // const/4 v9, 0x0
int v12 = 0; // const/4 v12, 0x0
/* .line 133 */
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
/* const v16, 0x8000 */
/* move-object/from16 v0, p0 */
/* move v11, v6 */
/* .line 129 */
/* invoke-virtual/range {v0 ..v16}, Lv/Vmat;->concat(IIIIIIIIIIIIIIII)V */
} // .end method
public void rotateY ( Integer p0 ) {
/* .locals 17 */
/* .param p1, "rot" # I */
/* .prologue */
/* .line 139 */
/* if-nez p1, :cond_0 */
/* .line 149 */
} // :goto_0
return;
/* .line 141 */
} // :cond_0
v3 = /* invoke-static/range {p1 ..p1}, Lv/Vmat;->fsin(I)I */
/* .line 142 */
/* .local v3, "s":I */
v1 = /* invoke-static/range {p1 ..p1}, Lv/Vmat;->fcos(I)I */
/* .line 144 */
/* .local v1, "c":I */
int v2 = 0; // const/4 v2, 0x0
int v4 = 0; // const/4 v4, 0x0
/* .line 145 */
int v5 = 0; // const/4 v5, 0x0
/* const v6, 0x8000 */
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* .line 146 */
/* neg-int v9, v3 */
int v10 = 0; // const/4 v10, 0x0
int v12 = 0; // const/4 v12, 0x0
/* .line 147 */
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
/* const v16, 0x8000 */
/* move-object/from16 v0, p0 */
/* move v11, v1 */
/* .line 143 */
/* invoke-virtual/range {v0 ..v16}, Lv/Vmat;->concat(IIIIIIIIIIIIIIII)V */
} // .end method
public void rotateZ ( Integer p0 ) {
/* .locals 17 */
/* .param p1, "rot" # I */
/* .prologue */
/* .line 153 */
/* if-nez p1, :cond_0 */
/* .line 163 */
} // :goto_0
return;
/* .line 155 */
} // :cond_0
v5 = /* invoke-static/range {p1 ..p1}, Lv/Vmat;->fsin(I)I */
/* .line 156 */
/* .local v5, "s":I */
v1 = /* invoke-static/range {p1 ..p1}, Lv/Vmat;->fcos(I)I */
/* .line 158 */
/* .local v1, "c":I */
/* neg-int v2, v5 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* .line 159 */
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* .line 160 */
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
/* const v11, 0x8000 */
int v12 = 0; // const/4 v12, 0x0
/* .line 161 */
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
/* const v16, 0x8000 */
/* move-object/from16 v0, p0 */
/* move v6, v1 */
/* .line 157 */
/* invoke-virtual/range {v0 ..v16}, Lv/Vmat;->concat(IIIIIIIIIIIIIIII)V */
} // .end method
void scale ( Integer p0 ) {
/* .locals 19 */
/* .param p1, "scale" # I */
/* .prologue */
/* .line 166 */
/* const v2, 0x8000 */
/* move/from16 v0, p1 */
/* move v1, v2 */
/* if-eq v0, v1, :cond_0 */
/* .line 168 */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* .line 169 */
int v7 = 0; // const/4 v7, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
/* .line 170 */
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
int v14 = 0; // const/4 v14, 0x0
/* .line 171 */
int v15 = 0; // const/4 v15, 0x0
/* const/16 v16, 0x0 */
/* const/16 v17, 0x0 */
/* const v18, 0x8000 */
/* move-object/from16 v2, p0 */
/* move/from16 v3, p1 */
/* move/from16 v8, p1 */
/* move/from16 v13, p1 */
/* .line 167 */
/* invoke-virtual/range {v2 ..v18}, Lv/Vmat;->concat(IIIIIIIIIIIIIIII)V */
/* .line 172 */
} // :cond_0
return;
} // .end method
public void set ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10, Integer p11, Integer p12, Integer p13, Integer p14, Integer p15 ) {
/* .locals 2 */
/* .param p1, "e11" # I */
/* .param p2, "e12" # I */
/* .param p3, "e13" # I */
/* .param p4, "e14" # I */
/* .param p5, "e21" # I */
/* .param p6, "e22" # I */
/* .param p7, "e23" # I */
/* .param p8, "e24" # I */
/* .param p9, "e31" # I */
/* .param p10, "e32" # I */
/* .param p11, "e33" # I */
/* .param p12, "e34" # I */
/* .param p13, "e41" # I */
/* .param p14, "e42" # I */
/* .param p15, "e43" # I */
/* .param p16, "e44" # I */
/* .prologue */
/* .line 180 */
/* iput p1, p0, Lv/Vmat;->m_11:I */
/* iput p2, p0, Lv/Vmat;->m_12:I */
/* iput p3, p0, Lv/Vmat;->m_13:I */
/* iput p4, p0, Lv/Vmat;->m_14:I */
/* .line 181 */
/* iput p5, p0, Lv/Vmat;->m_21:I */
/* iput p6, p0, Lv/Vmat;->m_22:I */
/* iput p7, p0, Lv/Vmat;->m_23:I */
/* iput p8, p0, Lv/Vmat;->m_24:I */
/* .line 182 */
/* iput p9, p0, Lv/Vmat;->m_31:I */
/* iput p10, p0, Lv/Vmat;->m_32:I */
/* iput p11, p0, Lv/Vmat;->m_33:I */
/* iput p12, p0, Lv/Vmat;->m_34:I */
/* .line 183 */
/* iput p13, p0, Lv/Vmat;->m_41:I */
/* move/from16 v0, p14 */
/* move-object v1, p0 */
/* iput v0, v1, Lv/Vmat;->m_42:I */
/* move/from16 v0, p15 */
/* move-object v1, p0 */
/* iput v0, v1, Lv/Vmat;->m_43:I */
/* move/from16 v0, p16 */
/* move-object v1, p0 */
/* iput v0, v1, Lv/Vmat;->m_44:I */
/* .line 184 */
return;
} // .end method
void set ( v.Vmat p0 ) {
/* .locals 18 */
/* .param p1, "m" # Lv/Vmat; */
/* .prologue */
/* .line 187 */
/* .line 188 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_11:I */
/* move v2, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_12:I */
/* move v3, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_13:I */
/* move v4, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_14:I */
/* move v5, v0 */
/* .line 189 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_21:I */
/* move v6, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_22:I */
/* move v7, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_23:I */
/* move v8, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_24:I */
/* move v9, v0 */
/* .line 190 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_31:I */
/* move v10, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_32:I */
/* move v11, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_33:I */
/* move v12, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_34:I */
/* move v13, v0 */
/* .line 191 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_41:I */
/* move v14, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_42:I */
/* move v15, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_43:I */
/* move/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_44:I */
/* move/from16 v17, v0 */
/* move-object/from16 v1, p0 */
/* .line 187 */
/* invoke-virtual/range {v1 ..v17}, Lv/Vmat;->set(IIIIIIIIIIIIIIII)V */
/* .line 192 */
return;
} // .end method
void setRotation ( v.Vmat p0 ) {
/* .locals 18 */
/* .param p1, "m" # Lv/Vmat; */
/* .prologue */
/* .line 196 */
/* .line 197 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_11:I */
/* move v2, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_12:I */
/* move v3, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_13:I */
/* move v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vmat;->m_14:I */
/* move v5, v0 */
/* .line 198 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_21:I */
/* move v6, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_22:I */
/* move v7, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_23:I */
/* move v8, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vmat;->m_24:I */
/* move v9, v0 */
/* .line 199 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_31:I */
/* move v10, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_32:I */
/* move v11, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vmat;->m_33:I */
/* move v12, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vmat;->m_34:I */
/* move v13, v0 */
/* .line 200 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vmat;->m_41:I */
/* move v14, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vmat;->m_42:I */
/* move v15, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vmat;->m_43:I */
/* move/from16 v16, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vmat;->m_44:I */
/* move/from16 v17, v0 */
/* move-object/from16 v1, p0 */
/* .line 196 */
/* invoke-virtual/range {v1 ..v17}, Lv/Vmat;->set(IIIIIIIIIIIIIIII)V */
/* .line 201 */
return;
} // .end method
public void transform ( v.Vector p0 ) {
/* .locals 0 */
/* .param p1, "d" # Lv/Vector; */
/* .prologue */
/* .line 213 */
(( v.Vmat ) p0 ).transform ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lv/Vmat;->transform(Lv/Vector;Lv/Vector;)V
/* .line 214 */
return;
} // .end method
void transform ( v.Vector p0, v.Vector p1 ) {
/* .locals 7 */
/* .param p1, "d" # Lv/Vector; */
/* .param p2, "s" # Lv/Vector; */
/* .prologue */
/* .line 218 */
/* iget v0, p2, Lv/Vector;->m_x:I */
/* .line 219 */
/* .local v0, "x":I */
/* iget v1, p2, Lv/Vector;->m_y:I */
/* .line 220 */
/* .local v1, "y":I */
/* iget v2, p2, Lv/Vector;->m_z:I */
/* .line 223 */
/* .local v2, "z":I */
/* iget v3, p0, Lv/Vmat;->m_11:I */
v3 = v.Vmat .fmul ( v3,v0 );
/* iget v4, p0, Lv/Vmat;->m_21:I */
v4 = v.Vmat .fmul ( v4,v1 );
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lv/Vmat;->m_31:I */
v4 = v.Vmat .fmul ( v4,v2 );
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lv/Vmat;->m_41:I */
/* add-int/2addr v3, v4 */
/* .line 224 */
/* iget v4, p0, Lv/Vmat;->m_12:I */
v4 = v.Vmat .fmul ( v4,v0 );
/* iget v5, p0, Lv/Vmat;->m_22:I */
v5 = v.Vmat .fmul ( v5,v1 );
/* add-int/2addr v4, v5 */
/* iget v5, p0, Lv/Vmat;->m_32:I */
v5 = v.Vmat .fmul ( v5,v2 );
/* add-int/2addr v4, v5 */
/* iget v5, p0, Lv/Vmat;->m_42:I */
/* add-int/2addr v4, v5 */
/* .line 225 */
/* iget v5, p0, Lv/Vmat;->m_13:I */
v5 = v.Vmat .fmul ( v5,v0 );
/* iget v6, p0, Lv/Vmat;->m_23:I */
v6 = v.Vmat .fmul ( v6,v1 );
/* add-int/2addr v5, v6 */
/* iget v6, p0, Lv/Vmat;->m_33:I */
v6 = v.Vmat .fmul ( v6,v2 );
/* add-int/2addr v5, v6 */
/* iget v6, p0, Lv/Vmat;->m_43:I */
/* add-int/2addr v5, v6 */
/* .line 222 */
(( v.Vector ) p1 ).set ( v3, v4, v5 ); // invoke-virtual {p1, v3, v4, v5}, Lv/Vector;->set(III)V
/* .line 227 */
return;
} // .end method
public void translate ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 17 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "z" # I */
/* .prologue */
/* .line 204 */
/* if-nez p1, :cond_0 */
/* if-nez p2, :cond_0 */
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 206 */
} // :cond_0
/* const v1, 0x8000 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* .line 207 */
int v5 = 0; // const/4 v5, 0x0
/* const v6, 0x8000 */
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* .line 208 */
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
/* const v11, 0x8000 */
int v12 = 0; // const/4 v12, 0x0
/* .line 209 */
/* const v16, 0x8000 */
/* move-object/from16 v0, p0 */
/* move/from16 v13, p1 */
/* move/from16 v14, p2 */
/* move/from16 v15, p3 */
/* .line 205 */
/* invoke-virtual/range {v0 ..v16}, Lv/Vmat;->concat(IIIIIIIIIIIIIIII)V */
/* .line 210 */
} // :cond_1
return;
} // .end method
