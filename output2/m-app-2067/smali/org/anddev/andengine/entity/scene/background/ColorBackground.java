public class org.anddev.andengine.entity.scene.background.ColorBackground extends org.anddev.andengine.entity.scene.background.BaseBackground {
	 /* # instance fields */
	 private Float mAlpha;
	 private Float mBlue;
	 private Boolean mColorEnabled;
	 private Float mGreen;
	 private Float mRed;
	 /* # direct methods */
	 protected org.anddev.andengine.entity.scene.background.ColorBackground ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/scene/background/BaseBackground;-><init>()V */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mRed:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mGreen:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mBlue:F */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mAlpha:F */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mColorEnabled:Z */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.background.ColorBackground ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/scene/background/BaseBackground;-><init>()V */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mRed:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mGreen:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mBlue:F */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mAlpha:F */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mColorEnabled:Z */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mRed:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mGreen:F */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mBlue:F */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.background.ColorBackground ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/scene/background/BaseBackground;-><init>()V */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mRed:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mGreen:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mBlue:F */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mAlpha:F */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mColorEnabled:Z */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mRed:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mGreen:F */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mBlue:F */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mAlpha:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean isColorEnabled ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mColorEnabled:Z */
	 } // .end method
	 public void onDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
		 /* .locals 4 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mColorEnabled:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget v0, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mRed:F */
			 /* iget v1, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mGreen:F */
			 /* iget v2, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mBlue:F */
			 /* iget v3, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mAlpha:F */
			 /* const/16 v0, 0x4000 */
		 } // :cond_0
		 return;
	 } // .end method
	 public void setColor ( Float p0, Float p1, Float p2 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mRed:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mGreen:F */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mBlue:F */
		 return;
	 } // .end method
	 public void setColor ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.entity.scene.background.ColorBackground ) p0 ).setColor ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->setColor(FFF)V
		 /* iput p4, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mAlpha:F */
		 return;
	 } // .end method
	 public void setColor ( Integer p0, Integer p1, Integer p2 ) {
		 /* .locals 4 */
		 /* const/high16 v3, 0x437f0000 # 255.0f */
		 /* int-to-float v0, p1 */
		 /* div-float/2addr v0, v3 */
		 /* int-to-float v1, p2 */
		 /* div-float/2addr v1, v3 */
		 /* int-to-float v2, p3 */
		 /* div-float/2addr v2, v3 */
		 (( org.anddev.andengine.entity.scene.background.ColorBackground ) p0 ).setColor ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->setColor(FFF)V
		 return;
	 } // .end method
	 public void setColor ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 5 */
		 /* const/high16 v4, 0x437f0000 # 255.0f */
		 /* int-to-float v0, p1 */
		 /* div-float/2addr v0, v4 */
		 /* int-to-float v1, p2 */
		 /* div-float/2addr v1, v4 */
		 /* int-to-float v2, p3 */
		 /* div-float/2addr v2, v4 */
		 /* int-to-float v3, p4 */
		 /* div-float/2addr v3, v4 */
		 (( org.anddev.andengine.entity.scene.background.ColorBackground ) p0 ).setColor ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->setColor(FFFF)V
		 return;
	 } // .end method
	 public void setColorEnabled ( Boolean p0 ) {
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->mColorEnabled:Z */
		 return;
	 } // .end method
