public class org.anddev.andengine.util.modifier.SequenceModifier extends org.anddev.andengine.util.modifier.BaseModifier implements org.anddev.andengine.util.modifier.IModifier$IModifierListener {
	 /* # interfaces */
	 /* # instance fields */
	 private Integer mCurrentSubSequenceModifierIndex;
	 private final Float mDuration;
	 private Boolean mFinishedCached;
	 private Float mSecondsElapsed;
	 private org.anddev.andengine.util.modifier.SequenceModifier$ISubSequenceModifierListener mSubSequenceModifierListener;
	 private final org.anddev.andengine.util.modifier.IModifier mSubSequenceModifiers;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.SequenceModifier ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, p1, p2}, Lorg/anddev/andengine/util/modifier/SequenceModifier;-><init>(Lorg/anddev/andengine/util/modifier/SequenceModifier$ISubSequenceModifierListener;Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;[Lorg/anddev/andengine/util/modifier/IModifier;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.SequenceModifier ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p2}, Lorg/anddev/andengine/util/modifier/BaseModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 /* array-length v0, p3 */
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "pModifiers must not be empty!"; // const-string v1, "pModifiers must not be empty!"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 this.mSubSequenceModifierListener = p1;
	 this.mSubSequenceModifiers = p3;
	 v0 = 	 org.anddev.andengine.util.modifier.util.ModifierUtils .getSequenceDurationOfModifier ( p3 );
	 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mDuration:F */
	 int v0 = 0; // const/4 v0, 0x0
	 /* aget-object v0, p3, v0 */
	 return;
} // .end method
public org.anddev.andengine.util.modifier.SequenceModifier ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0, p2}, Lorg/anddev/andengine/util/modifier/SequenceModifier;-><init>(Lorg/anddev/andengine/util/modifier/SequenceModifier$ISubSequenceModifierListener;Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;[Lorg/anddev/andengine/util/modifier/IModifier;)V */
	 return;
} // .end method
protected org.anddev.andengine.util.modifier.SequenceModifier ( ) {
	 /* .locals 4 */
	 /* invoke-direct {p0}, Lorg/anddev/andengine/util/modifier/BaseModifier;-><init>()V */
	 /* iget v0, p1, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mDuration:F */
	 /* iput v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mDuration:F */
	 v0 = this.mSubSequenceModifiers;
	 /* array-length v1, v0 */
	 /* new-array v1, v1, [Lorg/anddev/andengine/util/modifier/IModifier; */
	 this.mSubSequenceModifiers = v1;
	 v1 = this.mSubSequenceModifiers;
	 /* array-length v2, v1 */
	 int v3 = 1; // const/4 v3, 0x1
	 /* sub-int/2addr v2, v3 */
} // :goto_0
/* if-gez v2, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* aget-object v0, v1, v0 */
return;
} // :cond_0
/* aget-object v3, v0, v2 */
/* aput-object v3, v1, v2 */
/* add-int/lit8 v2, v2, -0x1 */
} // .end method
public org.anddev.andengine.util.modifier.SequenceModifier ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0, v0, p1}, Lorg/anddev/andengine/util/modifier/SequenceModifier;-><init>(Lorg/anddev/andengine/util/modifier/SequenceModifier$ISubSequenceModifierListener;Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;[Lorg/anddev/andengine/util/modifier/IModifier;)V */
return;
} // .end method
/* # virtual methods */
public org.anddev.andengine.util.modifier.IModifier clone ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.util.modifier.SequenceModifier ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->clone()Lorg/anddev/andengine/util/modifier/SequenceModifier;
} // .end method
public org.anddev.andengine.util.modifier.SequenceModifier clone ( ) {
/* .locals 1 */
/* new-instance v0, Lorg/anddev/andengine/util/modifier/SequenceModifier; */
/* invoke-direct {v0, p0}, Lorg/anddev/andengine/util/modifier/SequenceModifier;-><init>(Lorg/anddev/andengine/util/modifier/SequenceModifier;)V */
} // .end method
public Float getDuration ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mDuration:F */
} // .end method
public Float getSecondsElapsed ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mSecondsElapsed:F */
} // .end method
public org.anddev.andengine.util.modifier.SequenceModifier$ISubSequenceModifierListener getSubSequenceModifierListener ( ) {
/* .locals 1 */
v0 = this.mSubSequenceModifierListener;
} // .end method
public void onModifierFinished ( org.anddev.andengine.util.modifier.IModifier p0, java.lang.Object p1 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
v0 = this.mSubSequenceModifierListener;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mSubSequenceModifierListener;
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
v1 = this.mSubSequenceModifiers;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_1 */
v0 = this.mSubSequenceModifiers;
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
/* aget-object v0, v0, v1 */
} // :goto_0
return;
} // :cond_1
/* iput-boolean v2, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mFinished:Z */
/* iput-boolean v2, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mFinishedCached:Z */
(( org.anddev.andengine.util.modifier.SequenceModifier ) p0 ).onModifierFinished ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->onModifierFinished(Ljava/lang/Object;)V
} // .end method
public void onModifierStarted ( org.anddev.andengine.util.modifier.IModifier p0, java.lang.Object p1 ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
/* if-nez v0, :cond_0 */
(( org.anddev.andengine.util.modifier.SequenceModifier ) p0 ).onModifierStarted ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->onModifierStarted(Ljava/lang/Object;)V
} // :cond_0
v0 = this.mSubSequenceModifierListener;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mSubSequenceModifierListener;
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
} // :cond_1
return;
} // .end method
public Float onUpdate ( Float p0, java.lang.Object p1 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
int v3 = 0; // const/4 v3, 0x0
/* iget-boolean v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mFinished:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v3 */
} // :goto_0
} // :cond_0
/* iput-boolean v4, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mFinishedCached:Z */
/* move v0, p1 */
} // :goto_1
/* cmpl-float v1, v0, v3 */
/* if-lez v1, :cond_1 */
/* iget-boolean v1, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mFinishedCached:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_1
/* iput-boolean v4, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mFinishedCached:Z */
/* sub-float v0, p1, v0 */
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mSecondsElapsed:F */
/* add-float/2addr v1, v0 */
/* iput v1, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mSecondsElapsed:F */
} // :cond_2
v1 = this.mSubSequenceModifiers;
/* iget v2, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
v1 = /* aget-object v1, v1, v2 */
/* sub-float/2addr v0, v1 */
} // .end method
public void reset ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = (( org.anddev.andengine.util.modifier.SequenceModifier ) p0 ).isFinished ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/modifier/SequenceModifier;->isFinished()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mSubSequenceModifiers;
v1 = this.mSubSequenceModifiers;
/* array-length v1, v1 */
/* sub-int/2addr v1, v3 */
/* aget-object v0, v0, v1 */
} // :goto_0
/* iput v2, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
/* iput-boolean v2, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mFinished:Z */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mSecondsElapsed:F */
v0 = this.mSubSequenceModifiers;
/* aget-object v0, v0, v2 */
v0 = this.mSubSequenceModifiers;
/* array-length v1, v0 */
/* sub-int/2addr v1, v3 */
} // :goto_1
/* if-gez v1, :cond_1 */
return;
} // :cond_0
v0 = this.mSubSequenceModifiers;
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/SequenceModifier;->mCurrentSubSequenceModifierIndex:I */
/* aget-object v0, v0, v1 */
} // :cond_1
/* aget-object v2, v0, v1 */
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public void setSubSequenceModifierListener ( org.anddev.andengine.util.modifier.SequenceModifier$ISubSequenceModifierListener p0 ) {
/* .locals 0 */
this.mSubSequenceModifierListener = p1;
return;
} // .end method
