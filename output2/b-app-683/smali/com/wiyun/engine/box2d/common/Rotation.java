public class com.wiyun.engine.box2d.common.Rotation {
	 /* .source "Rotation.java" */
	 /* # instance fields */
	 public Float c;
	 public Float s;
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.common.Rotation ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 32 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.common.Rotation make ( Float p0 ) {
		 /* .locals 3 */
		 /* .param p0, "angle" # F */
		 /* .prologue */
		 /* .line 25 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/common/Rotation; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/common/Rotation;-><init>()V */
		 /* .line 26 */
		 /* .local v0, "r":Lcom/wiyun/engine/box2d/common/Rotation; */
		 /* float-to-double v1, p0 */
		 java.lang.Math .sin ( v1,v2 );
		 /* move-result-wide v1 */
		 /* double-to-float v1, v1 */
		 /* iput v1, v0, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* .line 27 */
		 /* float-to-double v1, p0 */
		 java.lang.Math .cos ( v1,v2 );
		 /* move-result-wide v1 */
		 /* double-to-float v1, v1 */
		 /* iput v1, v0, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* .line 28 */
	 } // .end method
	 public static com.wiyun.engine.box2d.common.Rotation makeIdentity ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 18 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/common/Rotation; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/common/Rotation;-><init>()V */
		 /* .line 19 */
		 /* .local v0, "r":Lcom/wiyun/engine/box2d/common/Rotation; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput v1, v0, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* .line 20 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* .line 21 */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint GetYAxis ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 62 */
		 /* iget v0, p0, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* neg-float v0, v0 */
		 /* iget v1, p0, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public Float getAngle ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 48 */
		 /* iget v0, p0, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* float-to-double v0, v0 */
		 /* iget v2, p0, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* float-to-double v2, v2 */
		 java.lang.Math .atan2 ( v0,v1,v2,v3 );
		 /* move-result-wide v0 */
		 /* double-to-float v0, v0 */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getXAxis ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 55 */
		 /* iget v0, p0, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* iget v1, p0, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public com.wiyun.engine.types.WYPoint mul ( com.wiyun.engine.types.WYPoint p0 ) {
		 /* .locals 4 */
		 /* .param p1, "v" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 66 */
		 /* iget v0, p0, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v1, v2 */
		 /* iget v2, p0, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* iget v3, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public void set ( Float p0 ) {
		 /* .locals 2 */
		 /* .param p1, "angle" # F */
		 /* .prologue */
		 /* .line 35 */
		 /* float-to-double v0, p1 */
		 java.lang.Math .sin ( v0,v1 );
		 /* move-result-wide v0 */
		 /* double-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* .line 36 */
		 /* float-to-double v0, p1 */
		 java.lang.Math .cos ( v0,v1 );
		 /* move-result-wide v0 */
		 /* double-to-float v0, v0 */
		 /* iput v0, p0, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* .line 37 */
		 return;
	 } // .end method
	 public void setIdentity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 40 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* .line 41 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* .line 42 */
		 return;
	 } // .end method
