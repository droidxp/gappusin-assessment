public class com.wiyun.engine.box2d.common.Transform {
	 /* .source "Transform.java" */
	 /* # instance fields */
	 public com.wiyun.engine.types.WYPoint p;
	 public com.wiyun.engine.box2d.common.Rotation q;
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.common.Transform ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 18 */
		 com.wiyun.engine.box2d.common.Rotation .makeIdentity ( );
		 this.q = v0;
		 /* .line 19 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 this.p = v0;
		 /* .line 20 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.common.Transform make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/common/Transform; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/common/Transform;-><init>()V */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint mul ( com.wiyun.engine.types.WYPoint p0 ) {
		 /* .locals 5 */
		 /* .param p1, "v" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 40 */
		 v2 = this.q;
		 /* iget v2, v2, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* iget v3, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v2, v3 */
		 v3 = this.q;
		 /* iget v3, v3, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* iget v4, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v3, v4 */
		 /* sub-float/2addr v2, v3 */
		 v3 = this.p;
		 /* iget v3, v3, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* add-float v0, v2, v3 */
		 /* .line 41 */
		 /* .local v0, "x":F */
		 v2 = this.q;
		 /* iget v2, v2, Lcom/wiyun/engine/box2d/common/Rotation;->s:F */
		 /* iget v3, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v2, v3 */
		 v3 = this.q;
		 /* iget v3, v3, Lcom/wiyun/engine/box2d/common/Rotation;->c:F */
		 /* iget v4, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v3, v4 */
		 /* add-float/2addr v2, v3 */
		 v3 = this.p;
		 /* iget v3, v3, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* add-float v1, v2, v3 */
		 /* .line 43 */
		 /* .local v1, "y":F */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public void set ( Float p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 /* .param p1, "x" # F */
		 /* .param p2, "y" # F */
		 /* .param p3, "angle" # F */
		 /* .prologue */
		 /* .line 28 */
		 v0 = this.p;
		 /* iput p1, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* .line 29 */
		 v0 = this.p;
		 /* iput p2, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* .line 30 */
		 v0 = this.q;
		 (( com.wiyun.engine.box2d.common.Rotation ) v0 ).set ( p3 ); // invoke-virtual {v0, p3}, Lcom/wiyun/engine/box2d/common/Rotation;->set(F)V
		 /* .line 31 */
		 return;
	 } // .end method
	 public void set ( com.wiyun.engine.types.WYPoint p0, Float p1 ) {
		 /* .locals 2 */
		 /* .param p1, "position" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p2, "angle" # F */
		 /* .prologue */
		 /* .line 34 */
		 v0 = this.p;
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* .line 35 */
		 v0 = this.p;
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iput v1, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* .line 36 */
		 v0 = this.q;
		 (( com.wiyun.engine.box2d.common.Rotation ) v0 ).set ( p2 ); // invoke-virtual {v0, p2}, Lcom/wiyun/engine/box2d/common/Rotation;->set(F)V
		 /* .line 37 */
		 return;
	 } // .end method
	 public void setIdentity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 com.wiyun.engine.box2d.common.Rotation .makeIdentity ( );
		 this.q = v0;
		 /* .line 24 */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 this.p = v0;
		 /* .line 25 */
		 return;
	 } // .end method
