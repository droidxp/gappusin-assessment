public abstract class org.anddev.andengine.util.modifier.BaseModifier implements org.anddev.andengine.util.modifier.IModifier {
	 /* # interfaces */
	 /* # instance fields */
	 protected Boolean mFinished;
	 private final org.anddev.andengine.util.SmartList mModifierListeners;
	 private Boolean mRemoveWhenFinished;
	 /* # direct methods */
	 public org.anddev.andengine.util.modifier.BaseModifier ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/util/modifier/BaseModifier;->mRemoveWhenFinished:Z */
		 /* new-instance v0, Lorg/anddev/andengine/util/SmartList; */
		 int v1 = 2; // const/4 v1, 0x2
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/util/SmartList;-><init>(I)V */
		 this.mModifierListeners = v0;
		 return;
	 } // .end method
	 public org.anddev.andengine.util.modifier.BaseModifier ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/util/modifier/BaseModifier;->mRemoveWhenFinished:Z */
		 /* new-instance v0, Lorg/anddev/andengine/util/SmartList; */
		 int v1 = 2; // const/4 v1, 0x2
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/util/SmartList;-><init>(I)V */
		 this.mModifierListeners = v0;
		 (( org.anddev.andengine.util.modifier.BaseModifier ) p0 ).addModifierListener ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/modifier/BaseModifier;->addModifierListener(Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void addModifierListener ( org.anddev.andengine.util.modifier.IModifier$IModifierListener p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 v0 = this.mModifierListeners;
			 (( org.anddev.andengine.util.SmartList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->add(Ljava/lang/Object;)Z
		 } // :cond_0
		 return;
	 } // .end method
	 public java.lang.Object clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.util.modifier.BaseModifier ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/modifier/BaseModifier;->clone()Lorg/anddev/andengine/util/modifier/IModifier;
	 } // .end method
	 public abstract org.anddev.andengine.util.modifier.IModifier clone ( ) {
	 } // .end method
	 public Boolean isFinished ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/util/modifier/BaseModifier;->mFinished:Z */
	 } // .end method
	 public final Boolean isRemoveWhenFinished ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/util/modifier/BaseModifier;->mRemoveWhenFinished:Z */
	 } // .end method
	 protected void onModifierFinished ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 v1 = this.mModifierListeners;
		 v0 = 		 (( org.anddev.andengine.util.SmartList ) v1 ).size ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/SmartList;->size()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* sub-int/2addr v0, v2 */
		 /* move v2, v0 */
	 } // :goto_0
	 /* if-gez v2, :cond_0 */
	 return;
} // :cond_0
(( org.anddev.andengine.util.SmartList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener; */
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
} // .end method
protected void onModifierStarted ( java.lang.Object p0 ) {
/* .locals 3 */
v1 = this.mModifierListeners;
v0 = (( org.anddev.andengine.util.SmartList ) v1 ).size ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/SmartList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
/* move v2, v0 */
} // :goto_0
/* if-gez v2, :cond_0 */
return;
} // :cond_0
(( org.anddev.andengine.util.SmartList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/util/modifier/IModifier$IModifierListener; */
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
} // .end method
public Boolean removeModifierListener ( org.anddev.andengine.util.modifier.IModifier$IModifierListener p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mModifierListeners;
v0 = (( org.anddev.andengine.util.SmartList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->remove(Ljava/lang/Object;)Z
} // .end method
public final void setRemoveWhenFinished ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/util/modifier/BaseModifier;->mRemoveWhenFinished:Z */
return;
} // .end method
