public class org.anddev.andengine.util.modifier.ParallelModifier extends org.anddev.andengine.util.modifier.BaseModifier implements org.anddev.andengine.util.modifier.IModifier$IModifierListener {
	 /* # interfaces */
	 /* # instance fields */
	 private final Float mDuration;
	 private Boolean mFinishedCached;
	 private final org.anddev.andengine.util.modifier.IModifier mModifiers;
	 private Float mSecondsElapsed;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.ParallelModifier ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/modifier/BaseModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V */
		 /* array-length v0, p2 */
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "pModifiers must not be empty!"; // const-string v1, "pModifiers must not be empty!"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ParallelModifier.MODIFIER_COMPARATOR_DURATION_DESCENDING;
	 java.util.Arrays .sort ( p2,v0 );
	 this.mModifiers = p2;
	 int v0 = 0; // const/4 v0, 0x0
	 v1 = 	 /* aget-object v0, p2, v0 */
	 /* iput v1, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mDuration:F */
	 return;
} // .end method
protected org.anddev.andengine.util.modifier.ParallelModifier ( ) {
	 /* .locals 4 */
	 /* invoke-direct {p0}, Lorg/anddev/andengine/util/modifier/BaseModifier;-><init>()V */
	 v0 = this.mModifiers;
	 /* array-length v1, v0 */
	 /* new-array v1, v1, [Lorg/anddev/andengine/util/modifier/IModifier; */
	 this.mModifiers = v1;
	 v1 = this.mModifiers;
	 /* array-length v2, v1 */
	 int v3 = 1; // const/4 v3, 0x1
	 /* sub-int/2addr v2, v3 */
} // :goto_0
/* if-gez v2, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
v1 = /* aget-object v0, v1, v0 */
/* iput v1, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mDuration:F */
return;
} // :cond_0
/* aget-object v3, v0, v2 */
/* aput-object v3, v1, v2 */
/* add-int/lit8 v2, v2, -0x1 */
} // .end method
public org.anddev.andengine.util.modifier.ParallelModifier ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0, p1}, Lorg/anddev/andengine/util/modifier/ParallelModifier;-><init>(Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;[Lorg/anddev/andengine/util/modifier/IModifier;)V */
return;
} // .end method
/* # virtual methods */
public org.anddev.andengine.util.modifier.IModifier clone ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.util.modifier.ParallelModifier ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/modifier/ParallelModifier;->clone()Lorg/anddev/andengine/util/modifier/ParallelModifier;
} // .end method
public org.anddev.andengine.util.modifier.ParallelModifier clone ( ) {
/* .locals 1 */
/* new-instance v0, Lorg/anddev/andengine/util/modifier/ParallelModifier; */
/* invoke-direct {v0, p0}, Lorg/anddev/andengine/util/modifier/ParallelModifier;-><init>(Lorg/anddev/andengine/util/modifier/ParallelModifier;)V */
} // .end method
public Float getDuration ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mDuration:F */
} // .end method
public Float getSecondsElapsed ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mSecondsElapsed:F */
} // .end method
public void onModifierFinished ( org.anddev.andengine.util.modifier.IModifier p0, java.lang.Object p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mFinished:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mFinishedCached:Z */
(( org.anddev.andengine.util.modifier.ParallelModifier ) p0 ).onModifierFinished ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/modifier/ParallelModifier;->onModifierFinished(Ljava/lang/Object;)V
return;
} // .end method
public void onModifierStarted ( org.anddev.andengine.util.modifier.IModifier p0, java.lang.Object p1 ) {
/* .locals 0 */
(( org.anddev.andengine.util.modifier.ParallelModifier ) p0 ).onModifierStarted ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/util/modifier/ParallelModifier;->onModifierStarted(Ljava/lang/Object;)V
return;
} // .end method
public Float onUpdate ( Float p0, java.lang.Object p1 ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
/* iget-boolean v0, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mFinished:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v5 */
} // :goto_0
} // :cond_0
v0 = this.mModifiers;
/* iput-boolean v6, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mFinishedCached:Z */
/* move v1, p1 */
} // :goto_1
/* cmpl-float v2, v1, v5 */
/* if-lez v2, :cond_1 */
/* iget-boolean v2, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mFinishedCached:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
} // :cond_1
/* iput-boolean v6, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mFinishedCached:Z */
/* sub-float v0, p1, v1 */
/* iget v1, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mSecondsElapsed:F */
/* add-float/2addr v1, v0 */
/* iput v1, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mSecondsElapsed:F */
} // :cond_2
/* array-length v2, v0 */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
/* move v3, v5 */
} // :goto_2
/* if-gez v2, :cond_3 */
/* sub-float/2addr v1, v3 */
} // :cond_3
v4 = /* aget-object v4, v0, v2 */
v3 = java.lang.Math .max ( v3,v4 );
/* add-int/lit8 v2, v2, -0x1 */
} // .end method
public void reset ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mFinished:Z */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/util/modifier/ParallelModifier;->mSecondsElapsed:F */
v0 = this.mModifiers;
/* array-length v1, v0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
} // :goto_0
/* if-gez v1, :cond_0 */
return;
} // :cond_0
/* aget-object v2, v0, v1 */
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
