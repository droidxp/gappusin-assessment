public class com.wiyun.engine.box2d.common.Matrix22 {
	 /* .source "Matrix22.java" */
	 /* # instance fields */
	 public Float col1X;
	 public Float col1Y;
	 public Float col2X;
	 public Float col2Y;
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.common.Matrix22 ( ) {
		 /* .locals 0 */
		 /* .param p1, "col1X" # F */
		 /* .param p2, "col1Y" # F */
		 /* .param p3, "col2X" # F */
		 /* .param p4, "col2Y" # F */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 20 */
		 /* iput p1, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col1X:F */
		 /* .line 21 */
		 /* iput p2, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col1Y:F */
		 /* .line 22 */
		 /* iput p3, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col2X:F */
		 /* .line 23 */
		 /* iput p4, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col2Y:F */
		 /* .line 24 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.common.Matrix22 make ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 1 */
		 /* .param p0, "col1X" # F */
		 /* .param p1, "col1Y" # F */
		 /* .param p2, "col2X" # F */
		 /* .param p3, "col2Y" # F */
		 /* .prologue */
		 /* .line 16 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/common/Matrix22; */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/box2d/common/Matrix22;-><init>(FFFF)V */
	 } // .end method
	 public static com.wiyun.engine.box2d.common.Matrix22 makeZero ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 12 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/common/Matrix22; */
		 /* invoke-direct {v0, v1, v1, v1, v1}, Lcom/wiyun/engine/box2d/common/Matrix22;-><init>(FFFF)V */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint mul ( com.wiyun.engine.types.WYPoint p0 ) {
		 /* .locals 4 */
		 /* .param p1, "v" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 36 */
		 /* iget v0, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col1X:F */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col2X:F */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col1Y:F */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v1, v2 */
		 /* iget v2, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col2Y:F */
		 /* iget v3, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public void set ( Float p0 ) {
		 /* .locals 4 */
		 /* .param p1, "angle" # F */
		 /* .prologue */
		 /* .line 27 */
		 /* float-to-double v2, p1 */
		 java.lang.Math .cos ( v2,v3 );
		 /* move-result-wide v2 */
		 /* double-to-float v0, v2 */
		 /* .line 28 */
		 /* .local v0, "c":F */
		 /* float-to-double v2, p1 */
		 java.lang.Math .sin ( v2,v3 );
		 /* move-result-wide v2 */
		 /* double-to-float v1, v2 */
		 /* .line 29 */
		 /* .local v1, "s":F */
		 /* iput v0, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col1X:F */
		 /* .line 30 */
		 /* neg-float v2, v1 */
		 /* iput v2, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col2X:F */
		 /* .line 31 */
		 /* iput v1, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col1Y:F */
		 /* .line 32 */
		 /* iput v0, p0, Lcom/wiyun/engine/box2d/common/Matrix22;->col2Y:F */
		 /* .line 33 */
		 return;
	 } // .end method
