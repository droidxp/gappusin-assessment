public class org.anddev.andengine.entity.scene.background.AutoParallaxBackground extends org.anddev.andengine.entity.scene.background.ParallaxBackground {
	 /* # instance fields */
	 private Float mParallaxChangePerSecond;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.background.AutoParallaxBackground ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;-><init>(FFF)V */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/scene/background/AutoParallaxBackground;->mParallaxChangePerSecond:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onUpdate ( Float p0 ) {
		 /* .locals 2 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->onUpdate(F)V */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/scene/background/AutoParallaxBackground;->mParallaxValue:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/scene/background/AutoParallaxBackground;->mParallaxChangePerSecond:F */
		 /* mul-float/2addr v1, p1 */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/AutoParallaxBackground;->mParallaxValue:F */
		 return;
	 } // .end method
	 public void setParallaxChangePerSecond ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/scene/background/AutoParallaxBackground;->mParallaxChangePerSecond:F */
		 return;
	 } // .end method
