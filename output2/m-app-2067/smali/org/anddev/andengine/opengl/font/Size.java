class org.anddev.andengine.opengl.font.Size {
	 /* # instance fields */
	 private Float mHeight;
	 private Float mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.font.Size ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, v0}, Lorg/anddev/andengine/opengl/font/Size;-><init>(FF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.font.Size ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 (( org.anddev.andengine.opengl.font.Size ) p0 ).setWidth ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/font/Size;->setWidth(F)V
		 (( org.anddev.andengine.opengl.font.Size ) p0 ).setHeight ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/opengl/font/Size;->setHeight(F)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/font/Size;->mHeight:F */
	 } // .end method
	 public Float getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/font/Size;->mWidth:F */
	 } // .end method
	 public void set ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* int-to-float v0, p1 */
		 (( org.anddev.andengine.opengl.font.Size ) p0 ).setWidth ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/opengl/font/Size;->setWidth(F)V
		 /* int-to-float v0, p2 */
		 (( org.anddev.andengine.opengl.font.Size ) p0 ).setHeight ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/opengl/font/Size;->setHeight(F)V
		 return;
	 } // .end method
	 public void setHeight ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/font/Size;->mHeight:F */
		 return;
	 } // .end method
	 public void setWidth ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/font/Size;->mWidth:F */
		 return;
	 } // .end method
