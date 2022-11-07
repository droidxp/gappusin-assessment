public abstract class org.anddev.andengine.util.modifier.BaseDoubleValueSpanModifier extends org.anddev.andengine.util.modifier.BaseSingleValueSpanModifier {
	 /* # instance fields */
	 private final Float mFromValueB;
	 private final Float mValueSpanB;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.BaseDoubleValueSpanModifier ( ) {
		 /* .locals 8 */
		 int v6 = 0; // const/4 v6, 0x0
		 v7 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;-><init>(FFFFFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseDoubleValueSpanModifier ( ) {
		 /* .locals 8 */
		 v7 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move-object v6, p6 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;-><init>(FFFFFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseDoubleValueSpanModifier ( ) {
		 /* .locals 6 */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move-object v4, p6 */
		 /* move-object v5, p7 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;-><init>(FFFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 /* iput p4, p0, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->mFromValueB:F */
		 /* sub-float v0, p5, p4 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->mValueSpanB:F */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseDoubleValueSpanModifier ( ) {
		 /* .locals 8 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move-object v7, p6 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;-><init>(FFFFFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 protected org.anddev.andengine.util.modifier.BaseDoubleValueSpanModifier ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;-><init>(Lorg/anddev/andengine/util/modifier/BaseSingleValueSpanModifier;)V */
		 /* iget v0, p1, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->mFromValueB:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->mFromValueB:F */
		 /* iget v0, p1, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->mValueSpanB:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->mValueSpanB:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onSetInitialValue ( java.lang.Object p0, Float p1 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->mFromValueB:F */
		 (( org.anddev.andengine.util.modifier.BaseDoubleValueSpanModifier ) p0 ).onSetInitialValues ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->onSetInitialValues(Ljava/lang/Object;FF)V
		 return;
	 } // .end method
	 protected abstract void onSetInitialValues ( java.lang.Object p0, Float p1, Float p2 ) {
	 } // .end method
	 protected void onSetValue ( java.lang.Object p0, Float p1, Float p2 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->mFromValueB:F */
		 /* iget v1, p0, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->mValueSpanB:F */
		 /* mul-float/2addr v1, p2 */
		 /* add-float/2addr v0, v1 */
		 (( org.anddev.andengine.util.modifier.BaseDoubleValueSpanModifier ) p0 ).onSetValues ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;->onSetValues(Ljava/lang/Object;FFF)V
		 return;
	 } // .end method
	 protected abstract void onSetValues ( java.lang.Object p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
