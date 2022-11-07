public class com.wiyun.engine.types.WYBezierConfig {
	 /* .source "WYBezierConfig.java" */
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
	 /* # direct methods */
	 public com.wiyun.engine.types.WYBezierConfig ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static Float bezierAt ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
		 /* .locals 11 */
		 /* .param p0, "a" # F */
		 /* .param p1, "b" # F */
		 /* .param p2, "c" # F */
		 /* .param p3, "d" # F */
		 /* .param p4, "t" # F */
		 /* .prologue */
		 /* const-wide/high16 v9, 0x4000000000000000L # 2.0 */
		 /* const/high16 v8, 0x3f800000 # 1.0f */
		 /* const-wide/high16 v6, 0x4008000000000000L # 3.0 */
		 /* .line 82 */
		 /* sub-float v0, v8, p4 */
		 /* float-to-double v0, v0 */
		 java.lang.Math .pow ( v0,v1,v6,v7 );
		 /* move-result-wide v0 */
		 /* float-to-double v2, p0 */
		 /* mul-double/2addr v0, v2 */
		 /* const/high16 v2, 0x40400000 # 3.0f */
		 /* mul-float/2addr v2, p4 */
		 /* float-to-double v2, v2 */
		 /* sub-float v4, v8, p4 */
		 /* float-to-double v4, v4 */
		 java.lang.Math .pow ( v4,v5,v9,v10 );
		 /* move-result-wide v4 */
		 /* mul-double/2addr v2, v4 */
		 /* float-to-double v4, p1 */
		 /* mul-double/2addr v2, v4 */
		 /* add-double/2addr v0, v2 */
		 /* float-to-double v2, p4 */
		 java.lang.Math .pow ( v2,v3,v9,v10 );
		 /* move-result-wide v2 */
		 /* mul-double/2addr v2, v6 */
		 /* sub-float v4, v8, p4 */
		 /* float-to-double v4, v4 */
		 /* mul-double/2addr v2, v4 */
		 /* float-to-double v4, p2 */
		 /* mul-double/2addr v2, v4 */
		 /* add-double/2addr v0, v2 */
		 /* float-to-double v2, p4 */
		 java.lang.Math .pow ( v2,v3,v6,v7 );
		 /* move-result-wide v2 */
		 /* float-to-double v4, p3 */
		 /* mul-double/2addr v2, v4 */
		 /* add-double/2addr v0, v2 */
		 /* double-to-float v0, v0 */
	 } // .end method
	 public static com.wiyun.engine.types.WYBezierConfig makeCubic ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
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
		 /* .line 68 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYBezierConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYBezierConfig;-><init>()V */
		 /* .line 69 */
		 /* .local v0, "c":Lcom/wiyun/engine/types/WYBezierConfig; */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYBezierConfig;->startX:F */
		 /* .line 70 */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYBezierConfig;->startY:F */
		 /* .line 71 */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYBezierConfig;->endX:F */
		 /* .line 72 */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYBezierConfig;->endY:F */
		 /* .line 73 */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1X:F */
		 /* .line 74 */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1Y:F */
		 /* .line 75 */
		 /* iput p6, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp2X:F */
		 /* .line 76 */
		 /* iput p7, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp2Y:F */
		 /* .line 77 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput-boolean v1, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cubic:Z */
		 /* .line 78 */
	 } // .end method
	 public static com.wiyun.engine.types.WYBezierConfig makeQuad ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 2 */
		 /* .param p0, "startX" # F */
		 /* .param p1, "startY" # F */
		 /* .param p2, "endX" # F */
		 /* .param p3, "endY" # F */
		 /* .param p4, "cp1X" # F */
		 /* .param p5, "cp1Y" # F */
		 /* .prologue */
		 /* .line 43 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYBezierConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYBezierConfig;-><init>()V */
		 /* .line 44 */
		 /* .local v0, "c":Lcom/wiyun/engine/types/WYBezierConfig; */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYBezierConfig;->startX:F */
		 /* .line 45 */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYBezierConfig;->startY:F */
		 /* .line 46 */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYBezierConfig;->endX:F */
		 /* .line 47 */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYBezierConfig;->endY:F */
		 /* .line 48 */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1X:F */
		 /* .line 49 */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1Y:F */
		 /* .line 50 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput-boolean v1, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cubic:Z */
		 /* .line 51 */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint pointAt ( Float p0 ) {
		 /* .locals 5 */
		 /* .param p1, "t" # F */
		 /* .prologue */
		 /* .line 92 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYBezierConfig;->startX:F */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1X:F */
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYBezierConfig;->cp2X:F */
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYBezierConfig;->endX:F */
		 v0 = 		 com.wiyun.engine.types.WYBezierConfig .bezierAt ( v0,v1,v2,v3,p1 );
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYBezierConfig;->startY:F */
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1Y:F */
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYBezierConfig;->cp2Y:F */
		 /* iget v4, p0, Lcom/wiyun/engine/types/WYBezierConfig;->endY:F */
		 v1 = 		 com.wiyun.engine.types.WYBezierConfig .bezierAt ( v1,v2,v3,v4,p1 );
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
