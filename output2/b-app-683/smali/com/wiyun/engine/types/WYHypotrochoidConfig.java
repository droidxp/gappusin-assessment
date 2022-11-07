public class com.wiyun.engine.types.WYHypotrochoidConfig {
	 /* .source "WYHypotrochoidConfig.java" */
	 /* # instance fields */
	 public Float R;
	 public Float centreX;
	 public Float centreY;
	 public Float d;
	 private Float deltaAngle;
	 public Float endAngle;
	 public Float r;
	 public Float startAngle;
	 private Float temp1;
	 private Float temp2;
	 /* # direct methods */
	 public com.wiyun.engine.types.WYHypotrochoidConfig ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYHypotrochoidConfig makeCircle ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
		 /* .locals 2 */
		 /* .param p0, "r" # F */
		 /* .param p1, "startAngle" # F */
		 /* .param p2, "endAngle" # F */
		 /* .param p3, "centreX" # F */
		 /* .param p4, "centreY" # F */
		 /* .prologue */
		 /* .line 95 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYHypotrochoidConfig;-><init>()V */
		 /* .line 96 */
		 /* .local v0, "c":Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 /* mul-float/2addr v1, p0 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->R:F */
		 /* .line 97 */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->r:F */
		 /* .line 98 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* .line 99 */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->startAngle:F */
		 /* .line 100 */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->endAngle:F */
		 /* .line 101 */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreX:F */
		 /* .line 102 */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreY:F */
		 /* .line 103 */
		 /* sub-float v1, p2, p1 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->deltaAngle:F */
		 /* .line 104 */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* .line 105 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
		 /* .line 106 */
	 } // .end method
	 public static com.wiyun.engine.types.WYHypotrochoidConfig makeEllipse ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 2 */
		 /* .param p0, "r" # F */
		 /* .param p1, "d" # F */
		 /* .param p2, "startAngle" # F */
		 /* .param p3, "endAngle" # F */
		 /* .param p4, "centreX" # F */
		 /* .param p5, "centreY" # F */
		 /* .prologue */
		 /* .line 70 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYHypotrochoidConfig;-><init>()V */
		 /* .line 71 */
		 /* .local v0, "c":Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 /* mul-float/2addr v1, p0 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->R:F */
		 /* .line 72 */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->r:F */
		 /* .line 73 */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* .line 74 */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->startAngle:F */
		 /* .line 75 */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->endAngle:F */
		 /* .line 76 */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreX:F */
		 /* .line 77 */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreY:F */
		 /* .line 78 */
		 /* sub-float v1, p3, p2 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->deltaAngle:F */
		 /* .line 79 */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* .line 80 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
		 /* .line 81 */
	 } // .end method
	 public static com.wiyun.engine.types.WYHypotrochoidConfig makeQuad ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6 ) {
		 /* .locals 2 */
		 /* .param p0, "R" # F */
		 /* .param p1, "r" # F */
		 /* .param p2, "d" # F */
		 /* .param p3, "startAngle" # F */
		 /* .param p4, "endAngle" # F */
		 /* .param p5, "centreX" # F */
		 /* .param p6, "centreY" # F */
		 /* .prologue */
		 /* .line 44 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYHypotrochoidConfig;-><init>()V */
		 /* .line 45 */
		 /* .local v0, "c":Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->R:F */
		 /* .line 46 */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->r:F */
		 /* .line 47 */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* .line 48 */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->startAngle:F */
		 /* .line 49 */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->endAngle:F */
		 /* .line 50 */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreX:F */
		 /* .line 51 */
		 /* iput p6, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreY:F */
		 /* .line 52 */
		 /* sub-float v1, p4, p3 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->deltaAngle:F */
		 /* .line 53 */
		 /* sub-float v1, p0, p1 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* .line 54 */
		 /* iget v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* div-float/2addr v1, p1 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
		 /* .line 55 */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint pointAt ( Float p0 ) {
		 /* .locals 9 */
		 /* .param p1, "t" # F */
		 /* .prologue */
		 /* .line 117 */
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->startAngle:F */
		 /* iget v4, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->deltaAngle:F */
		 /* mul-float/2addr v4, p1 */
		 /* add-float/2addr v3, v4 */
		 v0 = 		 com.wiyun.engine.utils.Utilities .d2r ( v3 );
		 /* .line 118 */
		 /* .local v0, "radian":F */
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreX:F */
		 /* float-to-double v3, v3 */
		 /* iget v5, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* float-to-double v5, v5 */
		 /* float-to-double v7, v0 */
		 java.lang.Math .cos ( v7,v8 );
		 /* move-result-wide v7 */
		 /* mul-double/2addr v5, v7 */
		 /* add-double/2addr v3, v5 */
		 /* iget v5, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* float-to-double v5, v5 */
		 /* iget v7, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
		 /* mul-float/2addr v7, v0 */
		 /* float-to-double v7, v7 */
		 java.lang.Math .cos ( v7,v8 );
		 /* move-result-wide v7 */
		 /* mul-double/2addr v5, v7 */
		 /* add-double/2addr v3, v5 */
		 /* double-to-float v1, v3 */
		 /* .line 119 */
		 /* .local v1, "x":F */
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreY:F */
		 /* float-to-double v3, v3 */
		 /* iget v5, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* float-to-double v5, v5 */
		 /* float-to-double v7, v0 */
		 java.lang.Math .sin ( v7,v8 );
		 /* move-result-wide v7 */
		 /* mul-double/2addr v5, v7 */
		 /* add-double/2addr v3, v5 */
		 /* iget v5, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* float-to-double v5, v5 */
		 /* iget v7, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
		 /* mul-float/2addr v7, v0 */
		 /* float-to-double v7, v7 */
		 java.lang.Math .sin ( v7,v8 );
		 /* move-result-wide v7 */
		 /* mul-double/2addr v5, v7 */
		 /* sub-double/2addr v3, v5 */
		 /* double-to-float v2, v3 */
		 /* .line 120 */
		 /* .local v2, "y":F */
		 com.wiyun.engine.types.WYPoint .make ( v1,v2 );
	 } // .end method
