public class org.anddev.andengine.util.modifier.LoopModifier extends org.anddev.andengine.util.modifier.BaseModifier implements org.anddev.andengine.util.modifier.IModifier$IModifierListener {
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer LOOP_CONTINUOUS;
	 /* # instance fields */
	 private final Float mDuration;
	 private Boolean mFinishedCached;
	 private Integer mLoop;
	 private final Integer mLoopCount;
	 private org.anddev.andengine.util.modifier.LoopModifier$ILoopModifierListener mLoopModifierListener;
	 private final org.anddev.andengine.util.modifier.IModifier mModifier;
	 private Boolean mModifierStartedCalled;
	 private Float mSecondsElapsed;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.LoopModifier ( ) {
		 /* .locals 1 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* invoke-direct {p0, p1, v0}, Lorg/anddev/andengine/util/modifier/LoopModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier;I)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.LoopModifier ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0, v0}, Lorg/anddev/andengine/util/modifier/LoopModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier;ILorg/anddev/andengine/util/modifier/LoopModifier$ILoopModifierListener;Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.LoopModifier ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0, p3}, Lorg/anddev/andengine/util/modifier/LoopModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier;ILorg/anddev/andengine/util/modifier/LoopModifier$ILoopModifierListener;Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.LoopModifier ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/util/modifier/LoopModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier;ILorg/anddev/andengine/util/modifier/LoopModifier$ILoopModifierListener;Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.LoopModifier ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p4}, Lorg/anddev/andengine/util/modifier/BaseModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 this.mModifier = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoopCount:I */
		 this.mLoopModifierListener = p3;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoop:I */
		 int v0 = -1; // const/4 v0, -0x1
		 /* if-ne p2, v0, :cond_0 */
		 /* const/high16 v0, 0x7f800000 # Float.POSITIVE_INFINITY */
	 } // :goto_0
	 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mDuration:F */
	 v0 = this.mModifier;
	 return;
v0 = } // :cond_0
/* int-to-float v1, p2 */
/* mul-float/2addr v0, v1 */
} // .end method
protected org.anddev.andengine.util.modifier.LoopModifier ( ) {
/* .locals 2 */
v0 = this.mModifier;
/* iget v1, p1, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoopCount:I */
/* invoke-direct {p0, v0, v1}, Lorg/anddev/andengine/util/modifier/LoopModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier;I)V */
return;
} // .end method
/* # virtual methods */
public org.anddev.andengine.util.modifier.IModifier clone ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.util.modifier.LoopModifier ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/modifier/LoopModifier;->clone()Lorg/anddev/andengine/util/modifier/LoopModifier;
} // .end method
public org.anddev.andengine.util.modifier.LoopModifier clone ( ) {
/* .locals 1 */
/* new-instance v0, Lorg/anddev/andengine/util/modifier/LoopModifier; */
/* invoke-direct {v0, p0}, Lorg/anddev/andengine/util/modifier/LoopModifier;-><init>(Lorg/anddev/andengine/util/modifier/LoopModifier;)V */
} // .end method
public Float getDuration ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mDuration:F */
} // .end method
public org.anddev.andengine.util.modifier.LoopModifier$ILoopModifierListener getLoopModifierListener ( ) {
/* .locals 1 */
v0 = this.mLoopModifierListener;
} // .end method
public Float getSecondsElapsed ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mSecondsElapsed:F */
} // .end method
public void onModifierFinished ( org.anddev.andengine.util.modifier.IModifier p0, java.lang.Object p1 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.mLoopModifierListener;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.mLoopModifierListener;
	 /* iget v1, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoop:I */
	 /* iget v2, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoopCount:I */
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoopCount:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_1 */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoop:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoop:I */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoop:I */
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoopCount:I */
/* if-lt v0, v1, :cond_1 */
/* iput-boolean v3, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mFinished:Z */
/* iput-boolean v3, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mFinishedCached:Z */
(( org.anddev.andengine.util.modifier.LoopModifier ) p0 ).onModifierFinished ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/modifier/LoopModifier;->onModifierFinished(Ljava/lang/Object;)V
} // :goto_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mSecondsElapsed:F */
v0 = this.mModifier;
} // .end method
public void onModifierStarted ( org.anddev.andengine.util.modifier.IModifier p0, java.lang.Object p1 ) {
/* .locals 3 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mModifierStartedCalled:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mModifierStartedCalled:Z */
(( org.anddev.andengine.util.modifier.LoopModifier ) p0 ).onModifierStarted ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/modifier/LoopModifier;->onModifierStarted(Ljava/lang/Object;)V
} // :cond_0
v0 = this.mLoopModifierListener;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mLoopModifierListener;
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoop:I */
/* iget v2, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoopCount:I */
} // :cond_1
return;
} // .end method
public Float onUpdate ( Float p0, java.lang.Object p1 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
int v2 = 0; // const/4 v2, 0x0
/* iget-boolean v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mFinished:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v2 */
} // :goto_0
} // :cond_0
/* iput-boolean v3, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mFinishedCached:Z */
/* move v0, p1 */
} // :goto_1
/* cmpl-float v1, v0, v2 */
/* if-lez v1, :cond_1 */
/* iget-boolean v1, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mFinishedCached:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_1
/* iput-boolean v3, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mFinishedCached:Z */
/* sub-float v0, p1, v0 */
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mSecondsElapsed:F */
/* add-float/2addr v1, v0 */
/* iput v1, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mSecondsElapsed:F */
} // :cond_2
v1 = v1 = this.mModifier;
/* sub-float/2addr v0, v1 */
} // .end method
public void reset ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mLoop:I */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mSecondsElapsed:F */
/* iput-boolean v1, p0, Lorg/anddev/andengine/util/modifier/LoopModifier;->mModifierStartedCalled:Z */
v0 = this.mModifier;
return;
} // .end method
public void setLoopModifierListener ( org.anddev.andengine.util.modifier.LoopModifier$ILoopModifierListener p0 ) {
/* .locals 0 */
this.mLoopModifierListener = p1;
return;
} // .end method
