public abstract class com.badlogic.gdx.physics.box2d.Shape {
	 /* # instance fields */
	 protected Long addr;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.Shape ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private native void jniDispose ( Long p0 ) {
	 } // .end method
	 private native Integer jniGetChildCount ( Long p0 ) {
	 } // .end method
	 private native Float jniGetRadius ( Long p0 ) {
	 } // .end method
	 protected static native Integer jniGetType ( Long p0 ) {
	 } // .end method
	 private native void jniSetRadius ( Long p0, Float p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public void dispose ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Shape;->addr:J */
		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Shape;->jniDispose(J)V */
		 return;
	 } // .end method
	 public Integer getChildCount ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Shape;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Shape;->jniGetChildCount(J)I */
	 } // .end method
	 public Float getRadius ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Shape;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Shape;->jniGetRadius(J)F */
	 } // .end method
	 public abstract com.badlogic.gdx.physics.box2d.Shape$Type getType ( ) {
	 } // .end method
	 public void setRadius ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Shape;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Shape;->jniSetRadius(JF)V */
		 return;
	 } // .end method
