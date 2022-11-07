public class com.wiyun.engine.types.WYBezierConfig {
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
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static Float bezierAt ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
		 /* .locals 11 */
		 /* const-wide/high16 v9, 0x4000000000000000L # 2.0 */
		 /* const/high16 v8, 0x3f800000 # 1.0f */
		 /* const-wide/high16 v6, 0x4008000000000000L # 3.0 */
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
		 /* new-instance v0, Lcom/wiyun/engine/types/WYBezierConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYBezierConfig;-><init>()V */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYBezierConfig;->startX:F */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYBezierConfig;->startY:F */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYBezierConfig;->endX:F */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYBezierConfig;->endY:F */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1X:F */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1Y:F */
		 /* iput p6, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp2X:F */
		 /* iput p7, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp2Y:F */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput-boolean v1, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cubic:Z */
	 } // .end method
	 public static com.wiyun.engine.types.WYBezierConfig makeQuad ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 2 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYBezierConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYBezierConfig;-><init>()V */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYBezierConfig;->startX:F */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYBezierConfig;->startY:F */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYBezierConfig;->endX:F */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYBezierConfig;->endY:F */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1X:F */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cp1Y:F */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput-boolean v1, v0, Lcom/wiyun/engine/types/WYBezierConfig;->cubic:Z */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint pointAt ( Float p0 ) {
		 /* .locals 5 */
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
