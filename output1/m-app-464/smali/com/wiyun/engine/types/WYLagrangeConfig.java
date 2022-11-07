public class com.wiyun.engine.types.WYLagrangeConfig {
	 /* # instance fields */
	 public Float cp1X;
	 public Float cp1Y;
	 public Float cp2X;
	 public Float cp2Y;
	 Boolean cubic;
	 public Float endX;
	 public Float endY;
	 public Float startX;
	 public Float startY;
	 public Float t0;
	 public Float t1;
	 public Float t2;
	 public Float t3;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYLagrangeConfig ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYLagrangeConfig makeCubic ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
		 /* .locals 2 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYLagrangeConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYLagrangeConfig;-><init>()V */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startX:F */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startY:F */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endX:F */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endY:F */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1X:F */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1Y:F */
		 /* iput p6, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp2X:F */
		 /* iput p7, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp2Y:F */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput-boolean v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cubic:Z */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t0:F */
		 /* const v1, 0x3eaaaa3b # 0.33333f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t1:F */
		 /* const v1, 0x3f2aaa3b */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t2:F */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t3:F */
	 } // .end method
	 public static com.wiyun.engine.types.WYLagrangeConfig makeQuad ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v0, Lcom/wiyun/engine/types/WYLagrangeConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYLagrangeConfig;-><init>()V */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startX:F */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startY:F */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endX:F */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endY:F */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1X:F */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1Y:F */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput-boolean v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cubic:Z */
		 /* iput v2, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t0:F */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t1:F */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t2:F */
		 /* iput v2, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t3:F */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint pointAt ( Float p0 ) {
		 /* .locals 12 */
		 int v11 = 4; // const/4 v11, 0x4
		 int v10 = 2; // const/4 v10, 0x2
		 int v9 = 1; // const/4 v9, 0x1
		 int v8 = 3; // const/4 v8, 0x3
		 int v2 = 0; // const/4 v2, 0x0
		 /* iget-boolean v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cubic:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* new-array v4, v11, [F */
			 /* iget v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t0:F */
			 /* aput v0, v4, v2 */
			 /* iget v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t1:F */
			 /* aput v0, v4, v9 */
			 /* iget v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t2:F */
			 /* aput v0, v4, v10 */
			 /* iget v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t3:F */
			 /* aput v0, v4, v8 */
			 /* new-array v5, v11, [F */
			 /* fill-array-data v5, :array_0 */
			 /* move v3, v2 */
		 } // :goto_0
		 /* if-lt v3, v11, :cond_0 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startX:F */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startY:F */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
		 /* aget v1, v5, v2 */
		 com.wiyun.engine.types.WYPoint .mul ( v0,v1 );
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1X:F */
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1Y:F */
		 com.wiyun.engine.types.WYPoint .make ( v1,v2 );
		 /* aget v2, v5, v9 */
		 com.wiyun.engine.types.WYPoint .mul ( v1,v2 );
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp2X:F */
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp2Y:F */
		 com.wiyun.engine.types.WYPoint .make ( v2,v3 );
		 /* aget v3, v5, v10 */
		 com.wiyun.engine.types.WYPoint .mul ( v2,v3 );
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endX:F */
		 /* iget v4, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endY:F */
		 com.wiyun.engine.types.WYPoint .make ( v3,v4 );
		 /* aget v4, v5, v8 */
		 com.wiyun.engine.types.WYPoint .mul ( v3,v4 );
		 com.wiyun.engine.types.WYPoint .add ( v0,v1 );
		 com.wiyun.engine.types.WYPoint .add ( v0,v2 );
		 com.wiyun.engine.types.WYPoint .add ( v0,v3 );
	 } // :goto_1
} // :cond_0
/* const/high16 v0, 0x3f800000 # 1.0f */
/* move v1, v2 */
} // :goto_2
/* if-lt v1, v11, :cond_1 */
/* aput v0, v5, v3 */
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // :cond_1
/* if-eq v1, v3, :cond_2 */
/* aget v6, v4, v1 */
/* sub-float v6, p1, v6 */
/* mul-float/2addr v0, v6 */
/* aget v6, v4, v3 */
/* aget v7, v4, v1 */
/* sub-float/2addr v6, v7 */
/* div-float/2addr v0, v6 */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
/* new-array v4, v8, [F */
/* iget v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t0:F */
/* aput v0, v4, v2 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t1:F */
/* aput v0, v4, v9 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t2:F */
/* aput v0, v4, v10 */
/* new-array v5, v8, [F */
/* fill-array-data v5, :array_1 */
/* move v3, v2 */
} // :goto_3
/* if-lt v3, v8, :cond_4 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startX:F */
/* iget v1, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startY:F */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
/* aget v1, v5, v2 */
com.wiyun.engine.types.WYPoint .mul ( v0,v1 );
/* iget v1, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1X:F */
/* iget v2, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1Y:F */
com.wiyun.engine.types.WYPoint .make ( v1,v2 );
/* aget v2, v5, v9 */
com.wiyun.engine.types.WYPoint .mul ( v1,v2 );
/* iget v2, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endX:F */
/* iget v3, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endY:F */
com.wiyun.engine.types.WYPoint .make ( v2,v3 );
/* aget v3, v5, v10 */
com.wiyun.engine.types.WYPoint .mul ( v2,v3 );
com.wiyun.engine.types.WYPoint .add ( v0,v1 );
com.wiyun.engine.types.WYPoint .add ( v0,v2 );
} // :cond_4
/* const/high16 v0, 0x3f800000 # 1.0f */
/* move v1, v2 */
} // :goto_4
/* if-lt v1, v8, :cond_5 */
/* aput v0, v5, v3 */
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // :cond_5
/* if-eq v1, v3, :cond_6 */
/* aget v6, v4, v1 */
/* sub-float v6, p1, v6 */
/* mul-float/2addr v0, v6 */
/* aget v6, v4, v3 */
/* aget v7, v4, v1 */
/* sub-float/2addr v6, v7 */
/* div-float/2addr v0, v6 */
} // :cond_6
/* add-int/lit8 v1, v1, 0x1 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
/* 0x0 */
/* 0x0 */
} // .end array-data
/* :array_1 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
/* 0x0 */
} // .end array-data
} // .end method
