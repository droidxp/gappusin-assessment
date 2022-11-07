public class org.anddev.andengine.entity.Entity implements org.anddev.andengine.entity.IEntity {
	 /* # interfaces */
	 /* # static fields */
	 private static final Integer CHILDREN_CAPACITY_DEFAULT;
	 private static final Integer ENTITYMODIFIERS_CAPACITY_DEFAULT;
	 private static final org.anddev.andengine.util.ParameterCallable PARAMETERCALLABLE_DETACHCHILD;
	 private static final Integer UPDATEHANDLERS_CAPACITY_DEFAULT;
	 private static final VERTICES_LOCAL_TO_SCENE_TMP;
	 private static final VERTICES_SCENE_TO_LOCAL_TMP;
	 /* # instance fields */
	 protected Float mAlpha;
	 protected Float mBlue;
	 protected org.anddev.andengine.util.SmartList mChildren;
	 protected Boolean mChildrenIgnoreUpdate;
	 protected Boolean mChildrenVisible;
	 private org.anddev.andengine.entity.modifier.EntityModifierList mEntityModifiers;
	 protected Float mGreen;
	 protected Boolean mIgnoreUpdate;
	 private final Float mInitialX;
	 private final Float mInitialY;
	 private final org.anddev.andengine.util.Transformation mLocalToParentTransformation;
	 private Boolean mLocalToParentTransformationDirty;
	 private final org.anddev.andengine.util.Transformation mLocalToSceneTransformation;
	 private org.anddev.andengine.entity.IEntity mParent;
	 private final org.anddev.andengine.util.Transformation mParentToLocalTransformation;
	 private Boolean mParentToLocalTransformationDirty;
	 protected Float mRed;
	 protected Float mRotation;
	 protected Float mRotationCenterX;
	 protected Float mRotationCenterY;
	 protected Float mScaleCenterX;
	 protected Float mScaleCenterY;
	 protected Float mScaleX;
	 protected Float mScaleY;
	 private final org.anddev.andengine.util.Transformation mSceneToLocalTransformation;
	 private org.anddev.andengine.engine.handler.UpdateHandlerList mUpdateHandlers;
	 private java.lang.Object mUserData;
	 protected Boolean mVisible;
	 protected Float mX;
	 protected Float mY;
	 protected Integer mZIndex;
	 /* # direct methods */
	 static org.anddev.andengine.entity.Entity ( ) {
		 /* .locals 2 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-array v0, v1, [F */
		 /* new-array v0, v1, [F */
		 /* new-instance v0, Lorg/anddev/andengine/entity/Entity$1; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/entity/Entity$1;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.Entity ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, v0}, Lorg/anddev/andengine/entity/Entity;-><init>(FF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.Entity ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/Entity;->mVisible:Z */
		 /* iput-boolean v3, p0, Lorg/anddev/andengine/entity/Entity;->mIgnoreUpdate:Z */
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenVisible:Z */
		 /* iput-boolean v3, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenIgnoreUpdate:Z */
		 /* iput v3, p0, Lorg/anddev/andengine/entity/Entity;->mZIndex:I */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mRed:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mGreen:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mBlue:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mAlpha:F */
		 /* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mRotation:F */
		 /* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterX:F */
		 /* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterY:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
		 /* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterX:F */
		 /* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterY:F */
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
		 /* new-instance v0, Lorg/anddev/andengine/util/Transformation; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/Transformation;-><init>()V */
		 this.mLocalToParentTransformation = v0;
		 /* new-instance v0, Lorg/anddev/andengine/util/Transformation; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/Transformation;-><init>()V */
		 this.mParentToLocalTransformation = v0;
		 /* new-instance v0, Lorg/anddev/andengine/util/Transformation; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/Transformation;-><init>()V */
		 this.mLocalToSceneTransformation = v0;
		 /* new-instance v0, Lorg/anddev/andengine/util/Transformation; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/Transformation;-><init>()V */
		 this.mSceneToLocalTransformation = v0;
		 /* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mInitialX:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/Entity;->mInitialY:F */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mX:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/Entity;->mY:F */
		 return;
	 } // .end method
	 private void allocateChildren ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lorg/anddev/andengine/util/SmartList; */
		 int v1 = 4; // const/4 v1, 0x4
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/util/SmartList;-><init>(I)V */
		 this.mChildren = v0;
		 return;
	 } // .end method
	 private void allocateEntityModifiers ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lorg/anddev/andengine/entity/modifier/EntityModifierList; */
		 int v1 = 4; // const/4 v1, 0x4
		 /* invoke-direct {v0, p0, v1}, Lorg/anddev/andengine/entity/modifier/EntityModifierList;-><init>(Lorg/anddev/andengine/entity/IEntity;I)V */
		 this.mEntityModifiers = v0;
		 return;
	 } // .end method
	 private void allocateUpdateHandlers ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/UpdateHandlerList; */
		 int v1 = 4; // const/4 v1, 0x4
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;-><init>(I)V */
		 this.mUpdateHandlers = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void applyRotation ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mRotation:F */
		 /* cmpl-float v1, v0, v4 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* iget v1, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterX:F */
			 /* iget v2, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterY:F */
			 /* const/high16 v3, 0x3f800000 # 1.0f */
			 /* neg-float v0, v1 */
			 /* neg-float v1, v2 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected void applyScale ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 6 */
		 int v5 = 0; // const/4 v5, 0x0
		 /* const/high16 v4, 0x3f800000 # 1.0f */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
		 /* cmpl-float v2, v0, v4 */
		 /* if-nez v2, :cond_0 */
		 /* cmpl-float v2, v1, v4 */
		 if ( v2 != null) { // if-eqz v2, :cond_1
		 } // :cond_0
		 /* iget v2, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterX:F */
		 /* iget v3, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterY:F */
		 /* neg-float v0, v2 */
		 /* neg-float v1, v3 */
	 } // :cond_1
	 return;
} // .end method
protected void applyTranslation ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 3 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mX:F */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/Entity;->mY:F */
	 int v2 = 0; // const/4 v2, 0x0
	 return;
} // .end method
public void attachChild ( org.anddev.andengine.entity.IEntity p0 ) {
	 v0 = 	 /* .locals 2 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* new-instance v0, Ljava/lang/IllegalStateException; */
		 final String v1 = "pEntity already has a parent!"; // const-string v1, "pEntity already has a parent!"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 v0 = this.mChildren;
	 /* if-nez v0, :cond_1 */
	 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/Entity;->allocateChildren()V */
} // :cond_1
v0 = this.mChildren;
(( org.anddev.andengine.util.SmartList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public Boolean attachChild ( org.anddev.andengine.entity.IEntity p0, Integer p1 ) {
v0 = /* .locals 2 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 final String v1 = "pEntity already has a parent!"; // const-string v1, "pEntity already has a parent!"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
v0 = this.mChildren;
/* if-nez v0, :cond_1 */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/Entity;->allocateChildren()V */
} // :cond_1
try { // :try_start_0
v0 = this.mChildren;
(( org.anddev.andengine.util.SmartList ) v0 ).add ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Lorg/anddev/andengine/util/SmartList;->add(ILjava/lang/Object;)V
/* :try_end_0 */
/* .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void callOnChildren ( org.anddev.andengine.entity.IEntity$IEntityCallable p0 ) {
/* .locals 1 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = this.mChildren;
(( org.anddev.andengine.util.SmartList ) v0 ).call ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->call(Lorg/anddev/andengine/util/ParameterCallable;)V
} // .end method
public void callOnChildren ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0, org.anddev.andengine.entity.IEntity$IEntityCallable p1 ) {
/* .locals 1 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = this.mChildren;
(( org.anddev.andengine.util.SmartList ) v0 ).call ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/util/SmartList;->call(Lorg/anddev/andengine/util/IMatcher;Lorg/anddev/andengine/util/ParameterCallable;)V
} // .end method
public void clearEntityModifiers ( ) {
/* .locals 1 */
v0 = this.mEntityModifiers;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = this.mEntityModifiers;
(( org.anddev.andengine.entity.modifier.EntityModifierList ) v0 ).clear ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/modifier/EntityModifierList;->clear()V
} // .end method
public void clearUpdateHandlers ( ) {
/* .locals 1 */
v0 = this.mUpdateHandlers;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = this.mUpdateHandlers;
(( org.anddev.andengine.engine.handler.UpdateHandlerList ) v0 ).clear ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->clear()V
} // .end method
public convertLocalToSceneCoordinates ( Float p0, Float p1 ) {
/* .locals 1 */
v0 = org.anddev.andengine.entity.Entity.VERTICES_LOCAL_TO_SCENE_TMP;
(( org.anddev.andengine.entity.Entity ) p0 ).convertLocalToSceneCoordinates ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/entity/Entity;->convertLocalToSceneCoordinates(FF[F)[F
} // .end method
public convertLocalToSceneCoordinates ( Float p0, Float p1, Float[] p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* aput p1, p3, v0 */
int v0 = 1; // const/4 v0, 0x1
/* aput p2, p3, v0 */
(( org.anddev.andengine.entity.Entity ) p0 ).getLocalToSceneTransformation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/Entity;->getLocalToSceneTransformation()Lorg/anddev/andengine/util/Transformation;
(( org.anddev.andengine.util.Transformation ) v0 ).transform ( p3 ); // invoke-virtual {v0, p3}, Lorg/anddev/andengine/util/Transformation;->transform([F)V
} // .end method
public convertLocalToSceneCoordinates ( Float[] p0 ) {
/* .locals 1 */
v0 = org.anddev.andengine.entity.Entity.VERTICES_LOCAL_TO_SCENE_TMP;
(( org.anddev.andengine.entity.Entity ) p0 ).convertSceneToLocalCoordinates ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/Entity;->convertSceneToLocalCoordinates([F[F)[F
} // .end method
public convertLocalToSceneCoordinates ( Float[] p0, Float[] p1 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* aget v0, p1, v1 */
/* aput v0, p2, v1 */
/* aget v0, p1, v2 */
/* aput v0, p2, v2 */
(( org.anddev.andengine.entity.Entity ) p0 ).getLocalToSceneTransformation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/Entity;->getLocalToSceneTransformation()Lorg/anddev/andengine/util/Transformation;
(( org.anddev.andengine.util.Transformation ) v0 ).transform ( p2 ); // invoke-virtual {v0, p2}, Lorg/anddev/andengine/util/Transformation;->transform([F)V
} // .end method
public convertSceneToLocalCoordinates ( Float p0, Float p1 ) {
/* .locals 1 */
v0 = org.anddev.andengine.entity.Entity.VERTICES_SCENE_TO_LOCAL_TMP;
(( org.anddev.andengine.entity.Entity ) p0 ).convertSceneToLocalCoordinates ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/entity/Entity;->convertSceneToLocalCoordinates(FF[F)[F
} // .end method
public convertSceneToLocalCoordinates ( Float p0, Float p1, Float[] p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* aput p1, p3, v0 */
int v0 = 1; // const/4 v0, 0x1
/* aput p2, p3, v0 */
(( org.anddev.andengine.entity.Entity ) p0 ).getSceneToLocalTransformation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/Entity;->getSceneToLocalTransformation()Lorg/anddev/andengine/util/Transformation;
(( org.anddev.andengine.util.Transformation ) v0 ).transform ( p3 ); // invoke-virtual {v0, p3}, Lorg/anddev/andengine/util/Transformation;->transform([F)V
} // .end method
public convertSceneToLocalCoordinates ( Float[] p0 ) {
/* .locals 1 */
v0 = org.anddev.andengine.entity.Entity.VERTICES_SCENE_TO_LOCAL_TMP;
(( org.anddev.andengine.entity.Entity ) p0 ).convertSceneToLocalCoordinates ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/Entity;->convertSceneToLocalCoordinates([F[F)[F
} // .end method
public convertSceneToLocalCoordinates ( Float[] p0, Float[] p1 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* aget v0, p1, v1 */
/* aput v0, p2, v1 */
/* aget v0, p1, v2 */
/* aput v0, p2, v2 */
(( org.anddev.andengine.entity.Entity ) p0 ).getSceneToLocalTransformation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/Entity;->getSceneToLocalTransformation()Lorg/anddev/andengine/util/Transformation;
(( org.anddev.andengine.util.Transformation ) v0 ).transform ( p2 ); // invoke-virtual {v0, p2}, Lorg/anddev/andengine/util/Transformation;->transform([F)V
} // .end method
public org.anddev.andengine.entity.IEntity detachChild ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0 ) {
/* .locals 2 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mChildren;
v1 = org.anddev.andengine.entity.Entity.PARAMETERCALLABLE_DETACHCHILD;
(( org.anddev.andengine.util.SmartList ) v0 ).remove ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lorg/anddev/andengine/util/SmartList;->remove(Lorg/anddev/andengine/util/IMatcher;Lorg/anddev/andengine/util/ParameterCallable;)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/IEntity; */
/* move-object v0, p0 */
} // .end method
public Boolean detachChild ( org.anddev.andengine.entity.IEntity p0 ) {
/* .locals 2 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mChildren;
v1 = org.anddev.andengine.entity.Entity.PARAMETERCALLABLE_DETACHCHILD;
v0 = (( org.anddev.andengine.util.SmartList ) v0 ).remove ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lorg/anddev/andengine/util/SmartList;->remove(Ljava/lang/Object;Lorg/anddev/andengine/util/ParameterCallable;)Z
} // .end method
public void detachChildren ( ) {
/* .locals 2 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = this.mChildren;
v1 = org.anddev.andengine.entity.Entity.PARAMETERCALLABLE_DETACHCHILD;
(( org.anddev.andengine.util.SmartList ) v0 ).clear ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/SmartList;->clear(Lorg/anddev/andengine/util/ParameterCallable;)V
} // .end method
public Boolean detachChildren ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0 ) {
/* .locals 2 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mChildren;
v1 = org.anddev.andengine.entity.Entity.PARAMETERCALLABLE_DETACHCHILD;
v0 = (( org.anddev.andengine.util.SmartList ) v0 ).removeAll ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lorg/anddev/andengine/util/SmartList;->removeAll(Lorg/anddev/andengine/util/IMatcher;Lorg/anddev/andengine/util/ParameterCallable;)Z
} // .end method
public Boolean detachSelf ( ) {
/* .locals 1 */
v0 = this.mParent;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected void doDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 0 */
return;
} // .end method
public org.anddev.andengine.entity.IEntity findChild ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0 ) {
/* .locals 1 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mChildren;
(( org.anddev.andengine.util.SmartList ) v0 ).find ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->find(Lorg/anddev/andengine/util/IMatcher;)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/IEntity; */
/* move-object v0, p0 */
} // .end method
public Float getAlpha ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mAlpha:F */
} // .end method
public Float getBlue ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mBlue:F */
} // .end method
public org.anddev.andengine.entity.IEntity getChild ( Integer p0 ) {
/* .locals 1 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mChildren;
(( org.anddev.andengine.util.SmartList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/IEntity; */
/* move-object v0, p0 */
} // .end method
public Integer getChildCount ( ) {
/* .locals 1 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mChildren;
v0 = (( org.anddev.andengine.util.SmartList ) v0 ).size ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/SmartList;->size()I
} // .end method
public Integer getChildIndex ( org.anddev.andengine.entity.IEntity p0 ) {
/* .locals 1 */
v0 = this.mChildren;
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-eq v0, p0, :cond_1 */
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
} // :cond_1
v0 = this.mChildren;
v0 = (( org.anddev.andengine.util.SmartList ) v0 ).indexOf ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->indexOf(Ljava/lang/Object;)I
} // .end method
public org.anddev.andengine.entity.IEntity getFirstChild ( ) {
/* .locals 2 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mChildren;
int v1 = 0; // const/4 v1, 0x0
(( org.anddev.andengine.util.SmartList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/IEntity; */
/* move-object v0, p0 */
} // .end method
public Float getGreen ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mGreen:F */
} // .end method
public Float getInitialX ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mInitialX:F */
} // .end method
public Float getInitialY ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mInitialY:F */
} // .end method
public org.anddev.andengine.entity.IEntity getLastChild ( ) {
/* .locals 3 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mChildren;
v1 = this.mChildren;
v1 = (( org.anddev.andengine.util.SmartList ) v1 ).size ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/SmartList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
(( org.anddev.andengine.util.SmartList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/SmartList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/IEntity; */
/* move-object v0, p0 */
} // .end method
public org.anddev.andengine.util.Transformation getLocalToParentTransformation ( ) {
/* .locals 7 */
/* const/high16 v4, 0x3f800000 # 1.0f */
v0 = this.mLocalToParentTransformation;
/* iget-boolean v1, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
(( org.anddev.andengine.util.Transformation ) v0 ).setToIdentity ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/Transformation;->setToIdentity()V
/* iget v1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
/* cmpl-float v3, v1, v4 */
/* if-nez v3, :cond_0 */
/* cmpl-float v3, v2, v4 */
if ( v3 != null) { // if-eqz v3, :cond_1
} // :cond_0
/* iget v3, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterX:F */
/* iget v4, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterY:F */
/* neg-float v5, v3 */
/* neg-float v6, v4 */
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
(( org.anddev.andengine.util.Transformation ) v0 ).postScale ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/util/Transformation;->postScale(FF)V
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
} // :cond_1
/* iget v1, p0, Lorg/anddev/andengine/entity/Entity;->mRotation:F */
int v2 = 0; // const/4 v2, 0x0
/* cmpl-float v2, v1, v2 */
if ( v2 != null) { // if-eqz v2, :cond_2
/* iget v2, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterX:F */
/* iget v3, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterY:F */
/* neg-float v4, v2 */
/* neg-float v5, v3 */
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
(( org.anddev.andengine.util.Transformation ) v0 ).postRotate ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/Transformation;->postRotate(F)V
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
} // :cond_2
/* iget v1, p0, Lorg/anddev/andengine/entity/Entity;->mX:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/Entity;->mY:F */
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
} // :cond_3
} // .end method
public org.anddev.andengine.util.Transformation getLocalToSceneTransformation ( ) {
/* .locals 2 */
v0 = this.mLocalToSceneTransformation;
(( org.anddev.andengine.entity.Entity ) p0 ).getLocalToParentTransformation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/Entity;->getLocalToParentTransformation()Lorg/anddev/andengine/util/Transformation;
(( org.anddev.andengine.util.Transformation ) v0 ).setTo ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/Transformation;->setTo(Lorg/anddev/andengine/util/Transformation;)V
v1 = this.mParent;
if ( v1 != null) { // if-eqz v1, :cond_0
(( org.anddev.andengine.util.Transformation ) v0 ).postConcat ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/Transformation;->postConcat(Lorg/anddev/andengine/util/Transformation;)V
} // :cond_0
} // .end method
public org.anddev.andengine.entity.IEntity getParent ( ) {
/* .locals 1 */
v0 = this.mParent;
} // .end method
public org.anddev.andengine.util.Transformation getParentToLocalTransformation ( ) {
/* .locals 8 */
/* const/high16 v7, 0x3f800000 # 1.0f */
v0 = this.mParentToLocalTransformation;
/* iget-boolean v1, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
(( org.anddev.andengine.util.Transformation ) v0 ).setToIdentity ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/Transformation;->setToIdentity()V
/* iget v1, p0, Lorg/anddev/andengine/entity/Entity;->mX:F */
/* neg-float v1, v1 */
/* iget v2, p0, Lorg/anddev/andengine/entity/Entity;->mY:F */
/* neg-float v2, v2 */
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
/* iget v1, p0, Lorg/anddev/andengine/entity/Entity;->mRotation:F */
int v2 = 0; // const/4 v2, 0x0
/* cmpl-float v2, v1, v2 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* iget v2, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterX:F */
/* iget v3, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterY:F */
/* neg-float v4, v2 */
/* neg-float v5, v3 */
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
/* neg-float v1, v1 */
(( org.anddev.andengine.util.Transformation ) v0 ).postRotate ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/Transformation;->postRotate(F)V
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
} // :cond_0
/* iget v1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
/* cmpl-float v3, v1, v7 */
/* if-nez v3, :cond_1 */
/* cmpl-float v3, v2, v7 */
if ( v3 != null) { // if-eqz v3, :cond_2
} // :cond_1
/* iget v3, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterX:F */
/* iget v4, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterY:F */
/* neg-float v5, v3 */
/* neg-float v6, v4 */
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
/* div-float v1, v7, v1 */
/* div-float v2, v7, v2 */
(( org.anddev.andengine.util.Transformation ) v0 ).postScale ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/util/Transformation;->postScale(FF)V
(( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
} // :cond_3
} // .end method
public Float getRed ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mRed:F */
} // .end method
public Float getRotation ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mRotation:F */
} // .end method
public Float getRotationCenterX ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterX:F */
} // .end method
public Float getRotationCenterY ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterY:F */
} // .end method
public Float getScaleCenterX ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterX:F */
} // .end method
public Float getScaleCenterY ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterY:F */
} // .end method
public Float getScaleX ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
} // .end method
public Float getScaleY ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
} // .end method
public getSceneCenterCoordinates ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( org.anddev.andengine.entity.Entity ) p0 ).convertLocalToSceneCoordinates ( v0, v0 ); // invoke-virtual {p0, v0, v0}, Lorg/anddev/andengine/entity/Entity;->convertLocalToSceneCoordinates(FF)[F
} // .end method
public org.anddev.andengine.util.Transformation getSceneToLocalTransformation ( ) {
/* .locals 2 */
v0 = this.mSceneToLocalTransformation;
(( org.anddev.andengine.entity.Entity ) p0 ).getParentToLocalTransformation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/Entity;->getParentToLocalTransformation()Lorg/anddev/andengine/util/Transformation;
(( org.anddev.andengine.util.Transformation ) v0 ).setTo ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/Transformation;->setTo(Lorg/anddev/andengine/util/Transformation;)V
v1 = this.mParent;
if ( v1 != null) { // if-eqz v1, :cond_0
(( org.anddev.andengine.util.Transformation ) v0 ).postConcat ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/Transformation;->postConcat(Lorg/anddev/andengine/util/Transformation;)V
} // :cond_0
} // .end method
public java.lang.Object getUserData ( ) {
/* .locals 1 */
v0 = this.mUserData;
} // .end method
public Float getX ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mX:F */
} // .end method
public Float getY ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mY:F */
} // .end method
public Integer getZIndex ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mZIndex:I */
} // .end method
public Boolean hasParent ( ) {
/* .locals 1 */
v0 = this.mParent;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isChildrenIgnoreUpdate ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenIgnoreUpdate:Z */
} // .end method
public Boolean isChildrenVisible ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenVisible:Z */
} // .end method
public Boolean isIgnoreUpdate ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mIgnoreUpdate:Z */
} // .end method
public Boolean isRotated ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mRotation:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isScaled ( ) {
/* .locals 2 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean isVisible ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mVisible:Z */
} // .end method
protected void onApplyTransformations ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 0 */
(( org.anddev.andengine.entity.Entity ) p0 ).applyTranslation ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/Entity;->applyTranslation(Ljavax/microedition/khronos/opengles/GL10;)V
(( org.anddev.andengine.entity.Entity ) p0 ).applyRotation ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/Entity;->applyRotation(Ljavax/microedition/khronos/opengles/GL10;)V
(( org.anddev.andengine.entity.Entity ) p0 ).applyScale ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/Entity;->applyScale(Ljavax/microedition/khronos/opengles/GL10;)V
return;
} // .end method
public void onAttached ( ) {
/* .locals 0 */
return;
} // .end method
public void onDetached ( ) {
/* .locals 0 */
return;
} // .end method
public final void onDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mVisible:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( org.anddev.andengine.entity.Entity ) p0 ).onManagedDraw ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/entity/Entity;->onManagedDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
} // :cond_0
return;
} // .end method
protected void onDrawChildren ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 1 */
v0 = this.mChildren;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenVisible:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( org.anddev.andengine.entity.Entity ) p0 ).onManagedDrawChildren ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/entity/Entity;->onManagedDrawChildren(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
} // :cond_0
return;
} // .end method
protected void onManagedDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 0 */
(( org.anddev.andengine.entity.Entity ) p0 ).onApplyTransformations ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/Entity;->onApplyTransformations(Ljavax/microedition/khronos/opengles/GL10;)V
(( org.anddev.andengine.entity.Entity ) p0 ).doDraw ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/entity/Entity;->doDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
(( org.anddev.andengine.entity.Entity ) p0 ).onDrawChildren ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/entity/Entity;->onDrawChildren(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
return;
} // .end method
public void onManagedDrawChildren ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 3 */
v0 = this.mChildren;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-lt v2, v1, :cond_0 */
return;
} // :cond_0
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/IEntity; */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
protected void onManagedUpdate ( Float p0 ) {
/* .locals 3 */
v0 = this.mEntityModifiers;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mEntityModifiers;
(( org.anddev.andengine.entity.modifier.EntityModifierList ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/modifier/EntityModifierList;->onUpdate(F)V
} // :cond_0
v0 = this.mUpdateHandlers;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mUpdateHandlers;
(( org.anddev.andengine.engine.handler.UpdateHandlerList ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->onUpdate(F)V
} // :cond_1
v0 = this.mChildren;
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenIgnoreUpdate:Z */
/* if-nez v0, :cond_2 */
v0 = this.mChildren;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-lt v2, v1, :cond_3 */
} // :cond_2
return;
} // :cond_3
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/IEntity; */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public final void onUpdate ( Float p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mIgnoreUpdate:Z */
/* if-nez v0, :cond_0 */
(( org.anddev.andengine.entity.Entity ) p0 ).onManagedUpdate ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/Entity;->onManagedUpdate(F)V
} // :cond_0
return;
} // .end method
public void registerEntityModifier ( org.anddev.andengine.entity.modifier.IEntityModifier p0 ) {
/* .locals 1 */
v0 = this.mEntityModifiers;
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/Entity;->allocateEntityModifiers()V */
} // :cond_0
v0 = this.mEntityModifiers;
(( org.anddev.andengine.entity.modifier.EntityModifierList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/modifier/EntityModifierList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public void registerUpdateHandler ( org.anddev.andengine.engine.handler.IUpdateHandler p0 ) {
/* .locals 1 */
v0 = this.mUpdateHandlers;
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/Entity;->allocateUpdateHandlers()V */
} // :cond_0
v0 = this.mUpdateHandlers;
(( org.anddev.andengine.engine.handler.UpdateHandlerList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public void reset ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
int v2 = 1; // const/4 v2, 0x1
/* const/high16 v1, 0x3f800000 # 1.0f */
/* iput-boolean v2, p0, Lorg/anddev/andengine/entity/Entity;->mVisible:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mIgnoreUpdate:Z */
/* iput-boolean v2, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenVisible:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenIgnoreUpdate:Z */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mInitialX:F */
/* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mX:F */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mInitialY:F */
/* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mY:F */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mRotation:F */
/* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
/* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
/* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mRed:F */
/* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mGreen:F */
/* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mBlue:F */
/* iput v1, p0, Lorg/anddev/andengine/entity/Entity;->mAlpha:F */
v0 = this.mEntityModifiers;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mEntityModifiers;
(( org.anddev.andengine.entity.modifier.EntityModifierList ) v0 ).reset ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/modifier/EntityModifierList;->reset()V
} // :cond_0
v0 = this.mChildren;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mChildren;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v1, v2 */
} // :goto_0
/* if-gez v1, :cond_2 */
} // :cond_1
return;
} // :cond_2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/IEntity; */
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public void setAlpha ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mAlpha:F */
return;
} // .end method
public Boolean setChildIndex ( org.anddev.andengine.entity.IEntity p0, Integer p1 ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
v0 = this.mChildren;
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-eq v0, p0, :cond_1 */
} // :cond_0
/* move v0, v1 */
} // :goto_0
} // :cond_1
try { // :try_start_0
v0 = this.mChildren;
(( org.anddev.andengine.util.SmartList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/SmartList;->remove(Ljava/lang/Object;)Z
v0 = this.mChildren;
(( org.anddev.andengine.util.SmartList ) v0 ).add ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Lorg/anddev/andengine/util/SmartList;->add(ILjava/lang/Object;)V
/* :try_end_0 */
/* .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
int v0 = 1; // const/4 v0, 0x1
/* :catch_0 */
/* move-exception v0 */
/* move v0, v1 */
} // .end method
public void setChildrenIgnoreUpdate ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenIgnoreUpdate:Z */
return;
} // .end method
public void setChildrenVisible ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/entity/Entity;->mChildrenVisible:Z */
return;
} // .end method
public void setColor ( Float p0, Float p1, Float p2 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mRed:F */
/* iput p2, p0, Lorg/anddev/andengine/entity/Entity;->mGreen:F */
/* iput p3, p0, Lorg/anddev/andengine/entity/Entity;->mBlue:F */
return;
} // .end method
public void setColor ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mRed:F */
/* iput p2, p0, Lorg/anddev/andengine/entity/Entity;->mGreen:F */
/* iput p3, p0, Lorg/anddev/andengine/entity/Entity;->mBlue:F */
/* iput p4, p0, Lorg/anddev/andengine/entity/Entity;->mAlpha:F */
return;
} // .end method
public void setIgnoreUpdate ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/entity/Entity;->mIgnoreUpdate:Z */
return;
} // .end method
public void setInitialPosition ( ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mInitialX:F */
/* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mX:F */
/* iget v0, p0, Lorg/anddev/andengine/entity/Entity;->mInitialY:F */
/* iput v0, p0, Lorg/anddev/andengine/entity/Entity;->mY:F */
/* iput-boolean v1, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v1, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setParent ( org.anddev.andengine.entity.IEntity p0 ) {
/* .locals 0 */
this.mParent = p1;
return;
} // .end method
public void setPosition ( Float p0, Float p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mX:F */
/* iput p2, p0, Lorg/anddev/andengine/entity/Entity;->mY:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setPosition ( org.anddev.andengine.entity.IEntity p0 ) {
v1 = v0 = /* .locals 2 */
(( org.anddev.andengine.entity.Entity ) p0 ).setPosition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/entity/Entity;->setPosition(FF)V
return;
} // .end method
public void setRotation ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mRotation:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setRotationCenter ( Float p0, Float p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterX:F */
/* iput p2, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterY:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setRotationCenterX ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterX:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setRotationCenterY ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mRotationCenterY:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setScale ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setScale ( Float p0, Float p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
/* iput p2, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setScaleCenter ( Float p0, Float p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterX:F */
/* iput p2, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterY:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setScaleCenterX ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterX:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setScaleCenterY ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleCenterY:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setScaleX ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleX:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setScaleY ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mScaleY:F */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mLocalToParentTransformationDirty:Z */
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/Entity;->mParentToLocalTransformationDirty:Z */
return;
} // .end method
public void setUserData ( java.lang.Object p0 ) {
/* .locals 0 */
this.mUserData = p1;
return;
} // .end method
public void setVisible ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/entity/Entity;->mVisible:Z */
return;
} // .end method
public void setZIndex ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/Entity;->mZIndex:I */
return;
} // .end method
public void sortChildren ( ) {
/* .locals 2 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
org.anddev.andengine.entity.ZIndexSorter .getInstance ( );
v1 = this.mChildren;
(( org.anddev.andengine.entity.ZIndexSorter ) v0 ).sort ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/ZIndexSorter;->sort(Ljava/util/List;)V
} // .end method
public void sortChildren ( java.util.Comparator p0 ) {
/* .locals 2 */
v0 = this.mChildren;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
org.anddev.andengine.entity.ZIndexSorter .getInstance ( );
v1 = this.mChildren;
(( org.anddev.andengine.entity.ZIndexSorter ) v0 ).sort ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lorg/anddev/andengine/entity/ZIndexSorter;->sort(Ljava/util/List;Ljava/util/Comparator;)V
} // .end method
public Boolean swapChildren ( Integer p0, Integer p1 ) {
/* .locals 1 */
try { // :try_start_0
v0 = this.mChildren;
java.util.Collections .swap ( v0,p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean swapChildren ( org.anddev.andengine.entity.IEntity p0, org.anddev.andengine.entity.IEntity p1 ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.entity.Entity ) p0 ).getChildIndex ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/Entity;->getChildIndex(Lorg/anddev/andengine/entity/IEntity;)I
v1 = (( org.anddev.andengine.entity.Entity ) p0 ).getChildIndex ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/entity/Entity;->getChildIndex(Lorg/anddev/andengine/entity/IEntity;)I
v0 = (( org.anddev.andengine.entity.Entity ) p0 ).swapChildren ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/entity/Entity;->swapChildren(II)Z
} // .end method
public Boolean unregisterEntityModifier ( org.anddev.andengine.entity.modifier.IEntityModifier p0 ) {
/* .locals 1 */
v0 = this.mEntityModifiers;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mEntityModifiers;
v0 = (( org.anddev.andengine.entity.modifier.EntityModifierList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/modifier/EntityModifierList;->remove(Ljava/lang/Object;)Z
} // .end method
public Boolean unregisterEntityModifiers ( org.anddev.andengine.entity.modifier.IEntityModifier$IEntityModifierMatcher p0 ) {
/* .locals 1 */
v0 = this.mEntityModifiers;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mEntityModifiers;
v0 = (( org.anddev.andengine.entity.modifier.EntityModifierList ) v0 ).removeAll ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/modifier/EntityModifierList;->removeAll(Lorg/anddev/andengine/util/IMatcher;)Z
} // .end method
public Boolean unregisterUpdateHandler ( org.anddev.andengine.engine.handler.IUpdateHandler p0 ) {
/* .locals 1 */
v0 = this.mUpdateHandlers;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mUpdateHandlers;
v0 = (( org.anddev.andengine.engine.handler.UpdateHandlerList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->remove(Ljava/lang/Object;)Z
} // .end method
public Boolean unregisterUpdateHandlers ( org.anddev.andengine.engine.handler.IUpdateHandler$IUpdateHandlerMatcher p0 ) {
/* .locals 1 */
v0 = this.mUpdateHandlers;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.mUpdateHandlers;
v0 = (( org.anddev.andengine.engine.handler.UpdateHandlerList ) v0 ).removeAll ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->removeAll(Lorg/anddev/andengine/util/IMatcher;)Z
} // .end method
