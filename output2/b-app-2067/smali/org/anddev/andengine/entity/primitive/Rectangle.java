public class org.anddev.andengine.entity.primitive.Rectangle extends org.anddev.andengine.entity.primitive.BaseRectangle {
	 /* # direct methods */
	 public org.anddev.andengine.entity.primitive.Rectangle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;-><init>(FFFF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.primitive.Rectangle ( ) {
		 /* .locals 0 */
		 /* invoke-direct/range {p0 ..p5}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;-><init>(FFFFLorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onInitDraw ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 0 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->onInitDraw(Ljavax/microedition/khronos/opengles/GL10;)V */
		 org.anddev.andengine.opengl.util.GLHelper .disableTextures ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .disableTexCoordArray ( p1 );
		 return;
	 } // .end method
