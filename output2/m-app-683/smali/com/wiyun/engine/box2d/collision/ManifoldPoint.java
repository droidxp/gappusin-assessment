public class com.wiyun.engine.box2d.collision.ManifoldPoint {
	 /* .source "ManifoldPoint.java" */
	 /* # static fields */
	 public static final Integer TYPE_FACE;
	 public static final Integer TYPE_VERTEX;
	 /* # instance fields */
	 public Integer indexA;
	 public Integer indexB;
	 public com.wiyun.engine.types.WYPoint localPoint;
	 public Float normalImpulse;
	 public Float tangentImpulse;
	 public Integer typeA;
	 public Integer typeB;
	 /* # direct methods */
	 public com.wiyun.engine.box2d.collision.ManifoldPoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getContactId ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 51 */
		 /* iget v0, p0, Lcom/wiyun/engine/box2d/collision/ManifoldPoint;->indexA:I */
		 /* and-int/lit16 v0, v0, 0xff */
		 /* shl-int/lit8 v0, v0, 0x18 */
		 /* iget v1, p0, Lcom/wiyun/engine/box2d/collision/ManifoldPoint;->indexB:I */
		 /* and-int/lit16 v1, v1, 0xff */
		 /* shl-int/lit8 v1, v1, 0x10 */
		 /* or-int/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/box2d/collision/ManifoldPoint;->typeA:I */
		 /* and-int/lit16 v1, v1, 0xff */
		 /* shl-int/lit8 v1, v1, 0x8 */
		 /* or-int/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/box2d/collision/ManifoldPoint;->typeB:I */
		 /* and-int/lit16 v1, v1, 0xff */
		 /* or-int/2addr v0, v1 */
	 } // .end method
