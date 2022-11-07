public abstract class org.anddev.andengine.util.modifier.BaseDurationModifier extends org.anddev.andengine.util.modifier.BaseModifier {
	 /* # instance fields */
	 protected final Float mDuration;
	 private Float mSecondsElapsed;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.BaseDurationModifier ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/modifier/BaseModifier;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mDuration:F */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseDurationModifier ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p2}, Lorg/anddev/andengine/util/modifier/BaseModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 /* iput p1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mDuration:F */
		 return;
	 } // .end method
	 protected org.anddev.andengine.util.modifier.BaseDurationModifier ( ) {
		 /* .locals 1 */
		 /* iget v0, p1, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mDuration:F */
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;-><init>(F)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getDuration ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mDuration:F */
	 } // .end method
	 public Float getSecondsElapsed ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mSecondsElapsed:F */
	 } // .end method
	 protected abstract void onManagedInitialize ( java.lang.Object p0 ) {
	 } // .end method
	 protected abstract void onManagedUpdate ( Float p0, java.lang.Object p1 ) {
	 } // .end method
	 public final Float onUpdate ( Float p0, java.lang.Object p1 ) {
		 /* .locals 3 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mFinished:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* move v0, v1 */
		 } // :cond_0
	 } // :goto_0
} // :cond_1
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mSecondsElapsed:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_2 */
(( org.anddev.andengine.util.modifier.BaseDurationModifier ) p0 ).onManagedInitialize ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->onManagedInitialize(Ljava/lang/Object;)V
(( org.anddev.andengine.util.modifier.BaseDurationModifier ) p0 ).onModifierStarted ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->onModifierStarted(Ljava/lang/Object;)V
} // :cond_2
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mSecondsElapsed:F */
/* add-float/2addr v0, p1 */
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mDuration:F */
/* cmpg-float v0, v0, v1 */
/* if-ltz v0, :cond_3 */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mDuration:F */
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mSecondsElapsed:F */
/* sub-float/2addr v0, v1 */
} // :goto_1
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mSecondsElapsed:F */
/* add-float/2addr v1, v0 */
/* iput v1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mSecondsElapsed:F */
(( org.anddev.andengine.util.modifier.BaseDurationModifier ) p0 ).onManagedUpdate ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->onManagedUpdate(FLjava/lang/Object;)V
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mDuration:F */
/* const/high16 v2, -0x40800000 # -1.0f */
/* cmpl-float v1, v1, v2 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mSecondsElapsed:F */
/* iget v2, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mDuration:F */
/* cmpl-float v1, v1, v2 */
/* if-ltz v1, :cond_0 */
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mDuration:F */
/* iput v1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mSecondsElapsed:F */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mFinished:Z */
(( org.anddev.andengine.util.modifier.BaseDurationModifier ) p0 ).onModifierFinished ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->onModifierFinished(Ljava/lang/Object;)V
} // :cond_3
/* move v0, p1 */
} // .end method
public void reset ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mFinished:Z */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/util/modifier/BaseDurationModifier;->mSecondsElapsed:F */
return;
} // .end method
