public abstract class org.anddev.andengine.util.modifier.BaseSingleValueChangeModifier extends org.anddev.andengine.util.modifier.BaseDurationModifier {
	 /* # instance fields */
	 private final Float mValueChangePerSecond;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.BaseSingleValueChangeModifier ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Lorg/anddev/andengine/util/modifier/BaseSingleValueChangeModifier;-><init>(FFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseSingleValueChangeModifier ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p3}, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;-><init>(FLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 /* div-float v0, p2, p1 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueChangeModifier;->mValueChangePerSecond:F */
		 return;
	 } // .end method
	 protected org.anddev.andengine.util.modifier.BaseSingleValueChangeModifier ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;-><init>(Lorg/anddev/andengine/util/modifier/BaseDurationModifier;)V */
		 /* iget v0, p1, Lorg/anddev/andengine/util/modifier/BaseSingleValueChangeModifier;->mValueChangePerSecond:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueChangeModifier;->mValueChangePerSecond:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected abstract void onChangeValue ( java.lang.Object p0, Float p1 ) {
	 } // .end method
	 protected void onManagedInitialize ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 protected void onManagedUpdate ( Float p0, java.lang.Object p1 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueChangeModifier;->mValueChangePerSecond:F */
		 /* mul-float/2addr v0, p1 */
		 (( org.anddev.andengine.util.modifier.BaseSingleValueChangeModifier ) p0 ).onChangeValue ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lorg/anddev/andengine/util/modifier/BaseSingleValueChangeModifier;->onChangeValue(Ljava/lang/Object;F)V
		 return;
	 } // .end method
