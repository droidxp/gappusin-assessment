public abstract class org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier extends org.anddev.andengine.util.modifier.BaseDurationModifier {
	 /* # instance fields */
	 protected final org.anddev.andengine.util.modifier.ease.IEaseFunction mEaseFunction;
	 private final Float mFromValue;
	 private final Float mValueSpan;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier ( ) {
		 /* .locals 6 */
		 int v4 = 0; // const/4 v4, 0x0
		 v5 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;-><init>(FFFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier ( ) {
		 /* .locals 6 */
		 v5 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move-object v4, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;-><init>(FFFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p4}, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;-><init>(FLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 /* iput p2, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mFromValue:F */
		 /* sub-float v0, p3, p2 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mValueSpan:F */
		 this.mEaseFunction = p5;
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier ( ) {
		 /* .locals 6 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move-object v5, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;-><init>(FFFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 protected org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;-><init>(Lorg/anddev/andengine/util/modifier/BaseDurationModifier;)V */
		 /* iget v0, p1, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mFromValue:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mFromValue:F */
		 /* iget v0, p1, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mValueSpan:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mValueSpan:F */
		 v0 = this.mEaseFunction;
		 this.mEaseFunction = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onManagedInitialize ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mFromValue:F */
		 (( org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier ) p0 ).onSetInitialValue ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->onSetInitialValue(Ljava/lang/Object;F)V
		 return;
	 } // .end method
	 protected void onManagedUpdate ( Float p0, java.lang.Object p1 ) {
		 /* .locals 5 */
		 v0 = this.mEaseFunction;
		 v1 = 		 (( org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier ) p0 ).getSecondsElapsed ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->getSecondsElapsed()F
		 /* iget v2, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mDuration:F */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = 		 /* const/high16 v4, 0x3f800000 # 1.0f */
		 /* iget v1, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mFromValue:F */
		 /* iget v2, p0, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->mValueSpan:F */
		 /* mul-float/2addr v2, v0 */
		 /* add-float/2addr v1, v2 */
		 (( org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier ) p0 ).onSetValue ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;->onSetValue(Ljava/lang/Object;FF)V
		 return;
	 } // .end method
	 protected abstract void onSetInitialValue ( java.lang.Object p0, Float p1 ) {
	 } // .end method
	 protected abstract void onSetValue ( java.lang.Object p0, Float p1, Float p2 ) {
	 } // .end method
