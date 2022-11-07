public class com.wiyun.engine.types.WYHypotrochoidConfig {
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
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYHypotrochoidConfig makeCircle ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
		 /* .locals 2 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYHypotrochoidConfig;-><init>()V */
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 /* mul-float/2addr v1, p0 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->R:F */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->r:F */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->startAngle:F */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->endAngle:F */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreX:F */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreY:F */
		 /* sub-float v1, p2, p1 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->deltaAngle:F */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
	 } // .end method
	 public static com.wiyun.engine.types.WYHypotrochoidConfig makeEllipse ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 2 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYHypotrochoidConfig;-><init>()V */
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 /* mul-float/2addr v1, p0 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->R:F */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->r:F */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->startAngle:F */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->endAngle:F */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreX:F */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreY:F */
		 /* sub-float v1, p3, p2 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->deltaAngle:F */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
	 } // .end method
	 public static com.wiyun.engine.types.WYHypotrochoidConfig makeQuad ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6 ) {
		 /* .locals 2 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYHypotrochoidConfig;-><init>()V */
		 /* iput p0, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->R:F */
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->r:F */
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* iput p3, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->startAngle:F */
		 /* iput p4, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->endAngle:F */
		 /* iput p5, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreX:F */
		 /* iput p6, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreY:F */
		 /* sub-float v1, p4, p3 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->deltaAngle:F */
		 /* sub-float v1, p0, p1 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* iget v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* div-float/2addr v1, p1 */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint pointAt ( Float p0 ) {
		 /* .locals 8 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->startAngle:F */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->deltaAngle:F */
		 /* mul-float/2addr v1, p1 */
		 /* add-float/2addr v0, v1 */
		 v0 = 		 com.wiyun.engine.utils.Utilities .d2r ( v0 );
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreX:F */
		 /* float-to-double v1, v1 */
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* float-to-double v3, v3 */
		 /* float-to-double v5, v0 */
		 java.lang.Math .cos ( v5,v6 );
		 /* move-result-wide v5 */
		 /* mul-double/2addr v3, v5 */
		 /* add-double/2addr v1, v3 */
		 /* iget v3, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* float-to-double v3, v3 */
		 /* iget v5, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
		 /* mul-float/2addr v5, v0 */
		 /* float-to-double v5, v5 */
		 java.lang.Math .cos ( v5,v6 );
		 /* move-result-wide v5 */
		 /* mul-double/2addr v3, v5 */
		 /* add-double/2addr v1, v3 */
		 /* double-to-float v1, v1 */
		 /* iget v2, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->centreY:F */
		 /* float-to-double v2, v2 */
		 /* iget v4, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp1:F */
		 /* float-to-double v4, v4 */
		 /* float-to-double v6, v0 */
		 java.lang.Math .sin ( v6,v7 );
		 /* move-result-wide v6 */
		 /* mul-double/2addr v4, v6 */
		 /* add-double/2addr v2, v4 */
		 /* iget v4, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->d:F */
		 /* float-to-double v4, v4 */
		 /* iget v6, p0, Lcom/wiyun/engine/types/WYHypotrochoidConfig;->temp2:F */
		 /* mul-float/2addr v0, v6 */
		 /* float-to-double v6, v0 */
		 java.lang.Math .sin ( v6,v7 );
		 /* move-result-wide v6 */
		 /* mul-double/2addr v4, v6 */
		 /* sub-double/2addr v2, v4 */
		 /* double-to-float v0, v2 */
		 com.wiyun.engine.types.WYPoint .make ( v1,v0 );
	 } // .end method
