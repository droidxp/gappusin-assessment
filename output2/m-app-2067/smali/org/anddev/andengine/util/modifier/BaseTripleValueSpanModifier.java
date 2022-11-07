public abstract class org.anddev.andengine.util.modifier.BaseTripleValueSpanModifier extends org.anddev.andengine.util.modifier.BaseDoubleValueSpanModifier {
	 /* # instance fields */
	 private final Float mFromValueC;
	 private final Float mValueSpanC;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.BaseTripleValueSpanModifier ( ) {
		 /* .locals 8 */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move-object/from16 v6, p8 */
		 /* move-object/from16 v7, p9 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;-><init>(FFFFFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 /* iput p6, p0, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->mFromValueC:F */
		 /* sub-float v0, p7, p6 */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->mValueSpanC:F */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseTripleValueSpanModifier ( ) {
		 /* .locals 10 */
		 int v8 = 0; // const/4 v8, 0x0
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move/from16 v6, p6 */
		 /* move/from16 v7, p7 */
		 /* move-object/from16 v9, p8 */
		 /* invoke-direct/range {v0 ..v9}, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;-><init>(FFFFFFFLorg/anddev/andengine/util/modifier/IModifier$IModifierListener;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 protected org.anddev.andengine.util.modifier.BaseTripleValueSpanModifier ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;-><init>(Lorg/anddev/andengine/util/modifier/BaseDoubleValueSpanModifier;)V */
		 /* iget v0, p1, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->mFromValueC:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->mFromValueC:F */
		 /* iget v0, p1, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->mValueSpanC:F */
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->mValueSpanC:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onSetInitialValues ( java.lang.Object p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->mFromValueC:F */
		 (( org.anddev.andengine.util.modifier.BaseTripleValueSpanModifier ) p0 ).onSetInitialValues ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->onSetInitialValues(Ljava/lang/Object;FFF)V
		 return;
	 } // .end method
	 protected abstract void onSetInitialValues ( java.lang.Object p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 protected void onSetValues ( java.lang.Object p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 6 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->mFromValueC:F */
		 /* iget v1, p0, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->mValueSpanC:F */
		 /* mul-float/2addr v1, p2 */
		 /* add-float v5, v0, v1 */
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/util/modifier/BaseTripleValueSpanModifier;->onSetValues(Ljava/lang/Object;FFFF)V */
		 return;
	 } // .end method
	 protected abstract void onSetValues ( java.lang.Object p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
