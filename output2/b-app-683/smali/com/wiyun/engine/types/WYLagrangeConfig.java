public class com.wiyun.engine.types.WYLagrangeConfig {
	 /* .source "WYLagrangeConfig.java" */
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
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYLagrangeConfig makeCubic ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
		 /* .locals 2 */
		 /* .param p0, "startX" # F */
		 /* .param p1, "startY" # F */
		 /* .param p2, "endX" # F */
		 /* .param p3, "endY" # F */
		 /* .param p4, "cp1X" # F */
		 /* .param p5, "cp1Y" # F */
		 /* .param p6, "cp2X" # F */
		 /* .param p7, "cp2Y" # F */
		 /* .prologue */
		 /* .line 77 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYLagrangeConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYLagrangeConfig;-><init>()V */
		 /* .line 78 */
		 /* .local v0, "c":Lcom/wiyun/engine/types/WYLagrangeConfig; */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startX:F */
		 /* .line 79 */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startY:F */
		 /* .line 80 */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endX:F */
		 /* .line 81 */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endY:F */
		 /* .line 82 */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1X:F */
		 /* .line 83 */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1Y:F */
		 /* .line 84 */
		 /* iput p6, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp2X:F */
		 /* .line 85 */
		 /* iput p7, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp2Y:F */
		 /* .line 86 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput-boolean v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cubic:Z */
		 /* .line 87 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t0:F */
		 /* .line 88 */
		 /* const v1, 0x3eaaaa3b # 0.33333f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t1:F */
		 /* .line 89 */
		 /* const v1, 0x3f2aaa3b */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t2:F */
		 /* .line 90 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t3:F */
		 /* .line 91 */
	 } // .end method
	 public static com.wiyun.engine.types.WYLagrangeConfig makeQuad ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 3 */
		 /* .param p0, "startX" # F */
		 /* .param p1, "startY" # F */
		 /* .param p2, "endX" # F */
		 /* .param p3, "endY" # F */
		 /* .param p4, "cp1X" # F */
		 /* .param p5, "cp1Y" # F */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 48 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYLagrangeConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYLagrangeConfig;-><init>()V */
		 /* .line 49 */
		 /* .local v0, "c":Lcom/wiyun/engine/types/WYLagrangeConfig; */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startX:F */
		 /* .line 50 */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startY:F */
		 /* .line 51 */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endX:F */
		 /* .line 52 */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endY:F */
		 /* .line 53 */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1X:F */
		 /* .line 54 */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1Y:F */
		 /* .line 55 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput-boolean v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cubic:Z */
		 /* .line 56 */
		 /* iput v2, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t0:F */
		 /* .line 57 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t1:F */
		 /* .line 58 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t2:F */
		 /* .line 59 */
		 /* iput v2, v0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t3:F */
		 /* .line 60 */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint pointAt ( Float p0 ) {
		 /* .locals 12 */
		 /* .param p1, "t" # F */
		 /* .prologue */
		 /* .line 101 */
		 /* iget-boolean v9, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cubic:Z */
		 if ( v9 != null) { // if-eqz v9, :cond_3
			 /* .line 102 */
			 int v9 = 4; // const/4 v9, 0x4
			 /* new-array v8, v9, [F */
			 int v9 = 0; // const/4 v9, 0x0
			 /* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t0:F */
			 /* aput v10, v8, v9 */
			 int v9 = 1; // const/4 v9, 0x1
			 /* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t1:F */
			 /* aput v10, v8, v9 */
			 int v9 = 2; // const/4 v9, 0x2
			 /* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t2:F */
			 /* aput v10, v8, v9 */
			 int v9 = 3; // const/4 v9, 0x3
			 /* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t3:F */
			 /* aput v10, v8, v9 */
			 /* .line 103 */
			 /* .local v8, "ti":[F */
			 int v9 = 4; // const/4 v9, 0x4
			 /* new-array v1, v9, [F */
			 /* fill-array-data v1, :array_0 */
			 /* .line 104 */
			 /* .local v1, "bF":[F */
			 int v6 = 0; // const/4 v6, 0x0
			 /* .local v6, "j":I */
		 } // :goto_0
		 int v9 = 4; // const/4 v9, 0x4
		 /* if-lt v6, v9, :cond_0 */
		 /* .line 113 */
		 /* iget v9, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startX:F */
		 /* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startY:F */
		 com.wiyun.engine.types.WYPoint .make ( v9,v10 );
		 /* .line 114 */
		 /* .local v7, "start":Lcom/wiyun/engine/types/WYPoint; */
		 int v9 = 0; // const/4 v9, 0x0
		 /* aget v9, v1, v9 */
		 com.wiyun.engine.types.WYPoint .mul ( v7,v9 );
		 /* .line 115 */
		 /* iget v9, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1X:F */
		 /* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1Y:F */
		 com.wiyun.engine.types.WYPoint .make ( v9,v10 );
		 /* .line 116 */
		 /* .local v2, "cp1":Lcom/wiyun/engine/types/WYPoint; */
		 int v9 = 1; // const/4 v9, 0x1
		 /* aget v9, v1, v9 */
		 com.wiyun.engine.types.WYPoint .mul ( v2,v9 );
		 /* .line 117 */
		 /* iget v9, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp2X:F */
		 /* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp2Y:F */
		 com.wiyun.engine.types.WYPoint .make ( v9,v10 );
		 /* .line 118 */
		 /* .local v3, "cp2":Lcom/wiyun/engine/types/WYPoint; */
		 int v9 = 2; // const/4 v9, 0x2
		 /* aget v9, v1, v9 */
		 com.wiyun.engine.types.WYPoint .mul ( v3,v9 );
		 /* .line 119 */
		 /* iget v9, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endX:F */
		 /* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endY:F */
		 com.wiyun.engine.types.WYPoint .make ( v9,v10 );
		 /* .line 120 */
		 /* .local v4, "end":Lcom/wiyun/engine/types/WYPoint; */
		 int v9 = 3; // const/4 v9, 0x3
		 /* aget v9, v1, v9 */
		 com.wiyun.engine.types.WYPoint .mul ( v4,v9 );
		 /* .line 121 */
		 com.wiyun.engine.types.WYPoint .add ( v7,v2 );
		 com.wiyun.engine.types.WYPoint .add ( v9,v3 );
		 com.wiyun.engine.types.WYPoint .add ( v9,v4 );
		 /* .line 140 */
	 } // .end local v3 # "cp2":Lcom/wiyun/engine/types/WYPoint;
} // :goto_1
/* .line 105 */
} // .end local v2 # "cp1":Lcom/wiyun/engine/types/WYPoint;
} // .end local v4 # "end":Lcom/wiyun/engine/types/WYPoint;
} // .end local v7 # "start":Lcom/wiyun/engine/types/WYPoint;
} // :cond_0
/* const/high16 v0, 0x3f800000 # 1.0f */
/* .line 106 */
/* .local v0, "P":F */
int v5 = 0; // const/4 v5, 0x0
/* .local v5, "i":I */
} // :goto_2
int v9 = 4; // const/4 v9, 0x4
/* if-lt v5, v9, :cond_1 */
/* .line 110 */
/* aput v0, v1, v6 */
/* .line 104 */
/* add-int/lit8 v6, v6, 0x1 */
/* .line 107 */
} // :cond_1
/* if-eq v5, v6, :cond_2 */
/* .line 108 */
/* aget v9, v8, v5 */
/* sub-float v9, p1, v9 */
/* mul-float/2addr v9, v0 */
/* aget v10, v8, v6 */
/* aget v11, v8, v5 */
/* sub-float/2addr v10, v11 */
/* div-float v0, v9, v10 */
/* .line 106 */
} // :cond_2
/* add-int/lit8 v5, v5, 0x1 */
/* .line 123 */
} // .end local v0 # "P":F
} // .end local v1 # "bF":[F
} // .end local v5 # "i":I
} // .end local v6 # "j":I
} // .end local v8 # "ti":[F
} // :cond_3
int v9 = 3; // const/4 v9, 0x3
/* new-array v8, v9, [F */
int v9 = 0; // const/4 v9, 0x0
/* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t0:F */
/* aput v10, v8, v9 */
int v9 = 1; // const/4 v9, 0x1
/* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t1:F */
/* aput v10, v8, v9 */
int v9 = 2; // const/4 v9, 0x2
/* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->t2:F */
/* aput v10, v8, v9 */
/* .line 124 */
/* .restart local v8 # "ti":[F */
int v9 = 3; // const/4 v9, 0x3
/* new-array v1, v9, [F */
/* fill-array-data v1, :array_1 */
/* .line 125 */
/* .restart local v1 # "bF":[F */
int v6 = 0; // const/4 v6, 0x0
/* .restart local v6 # "j":I */
} // :goto_3
int v9 = 3; // const/4 v9, 0x3
/* if-lt v6, v9, :cond_4 */
/* .line 134 */
/* iget v9, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startX:F */
/* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->startY:F */
com.wiyun.engine.types.WYPoint .make ( v9,v10 );
/* .line 135 */
/* .restart local v7 # "start":Lcom/wiyun/engine/types/WYPoint; */
int v9 = 0; // const/4 v9, 0x0
/* aget v9, v1, v9 */
com.wiyun.engine.types.WYPoint .mul ( v7,v9 );
/* .line 136 */
/* iget v9, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1X:F */
/* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->cp1Y:F */
com.wiyun.engine.types.WYPoint .make ( v9,v10 );
/* .line 137 */
/* .restart local v2 # "cp1":Lcom/wiyun/engine/types/WYPoint; */
int v9 = 1; // const/4 v9, 0x1
/* aget v9, v1, v9 */
com.wiyun.engine.types.WYPoint .mul ( v2,v9 );
/* .line 138 */
/* iget v9, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endX:F */
/* iget v10, p0, Lcom/wiyun/engine/types/WYLagrangeConfig;->endY:F */
com.wiyun.engine.types.WYPoint .make ( v9,v10 );
/* .line 139 */
/* .restart local v4 # "end":Lcom/wiyun/engine/types/WYPoint; */
int v9 = 2; // const/4 v9, 0x2
/* aget v9, v1, v9 */
com.wiyun.engine.types.WYPoint .mul ( v4,v9 );
/* .line 140 */
com.wiyun.engine.types.WYPoint .add ( v7,v2 );
com.wiyun.engine.types.WYPoint .add ( v9,v4 );
/* .line 126 */
} // .end local v2 # "cp1":Lcom/wiyun/engine/types/WYPoint;
} // .end local v4 # "end":Lcom/wiyun/engine/types/WYPoint;
} // .end local v7 # "start":Lcom/wiyun/engine/types/WYPoint;
} // :cond_4
/* const/high16 v0, 0x3f800000 # 1.0f */
/* .line 127 */
/* .restart local v0 # "P":F */
int v5 = 0; // const/4 v5, 0x0
/* .restart local v5 # "i":I */
} // :goto_4
int v9 = 3; // const/4 v9, 0x3
/* if-lt v5, v9, :cond_5 */
/* .line 131 */
/* aput v0, v1, v6 */
/* .line 125 */
/* add-int/lit8 v6, v6, 0x1 */
/* .line 128 */
} // :cond_5
/* if-eq v5, v6, :cond_6 */
/* .line 129 */
/* aget v9, v8, v5 */
/* sub-float v9, p1, v9 */
/* mul-float/2addr v9, v0 */
/* aget v10, v8, v6 */
/* aget v11, v8, v5 */
/* sub-float/2addr v10, v11 */
/* div-float v0, v9, v10 */
/* .line 127 */
} // :cond_6
/* add-int/lit8 v5, v5, 0x1 */
/* .line 103 */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
/* 0x0 */
/* 0x0 */
} // .end array-data
/* .line 124 */
/* :array_1 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
/* 0x0 */
} // .end array-data
} // .end method
