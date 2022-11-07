public abstract class org.anddev.andengine.entity.IEntity implements org.anddev.andengine.engine.handler.IUpdateHandler implements org.anddev.andengine.opengl.IDrawable {
	 /* # interfaces */
	 /* # virtual methods */
	 public abstract void attachChild ( org.anddev.andengine.entity.IEntity p0 ) {
	 } // .end method
	 public abstract Boolean attachChild ( org.anddev.andengine.entity.IEntity p0, Integer p1 ) {
	 } // .end method
	 public abstract void callOnChildren ( org.anddev.andengine.entity.IEntity$IEntityCallable p0 ) {
	 } // .end method
	 public abstract void callOnChildren ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0, org.anddev.andengine.entity.IEntity$IEntityCallable p1 ) {
	 } // .end method
	 public abstract void clearEntityModifiers ( ) {
	 } // .end method
	 public abstract void clearUpdateHandlers ( ) {
	 } // .end method
	 public abstract convertLocalToSceneCoordinates ( Float p0, Float p1 ) {
	 } // .end method
	 public abstract convertLocalToSceneCoordinates ( Float p0, Float p1, Float[] p2 ) {
	 } // .end method
	 public abstract convertLocalToSceneCoordinates ( Float[] p0 ) {
	 } // .end method
	 public abstract convertLocalToSceneCoordinates ( Float[] p0, Float[] p1 ) {
	 } // .end method
	 public abstract convertSceneToLocalCoordinates ( Float p0, Float p1 ) {
	 } // .end method
	 public abstract convertSceneToLocalCoordinates ( Float p0, Float p1, Float[] p2 ) {
	 } // .end method
	 public abstract convertSceneToLocalCoordinates ( Float[] p0 ) {
	 } // .end method
	 public abstract convertSceneToLocalCoordinates ( Float[] p0, Float[] p1 ) {
	 } // .end method
	 public abstract org.anddev.andengine.entity.IEntity detachChild ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0 ) {
	 } // .end method
	 public abstract Boolean detachChild ( org.anddev.andengine.entity.IEntity p0 ) {
	 } // .end method
	 public abstract void detachChildren ( ) {
	 } // .end method
	 public abstract Boolean detachChildren ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0 ) {
	 } // .end method
	 public abstract Boolean detachSelf ( ) {
	 } // .end method
	 public abstract org.anddev.andengine.entity.IEntity findChild ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0 ) {
	 } // .end method
	 public abstract Float getAlpha ( ) {
	 } // .end method
	 public abstract Float getBlue ( ) {
	 } // .end method
	 public abstract org.anddev.andengine.entity.IEntity getChild ( Integer p0 ) {
	 } // .end method
	 public abstract Integer getChildCount ( ) {
	 } // .end method
	 public abstract Integer getChildIndex ( org.anddev.andengine.entity.IEntity p0 ) {
	 } // .end method
	 public abstract org.anddev.andengine.entity.IEntity getFirstChild ( ) {
	 } // .end method
	 public abstract Float getGreen ( ) {
	 } // .end method
	 public abstract Float getInitialX ( ) {
	 } // .end method
	 public abstract Float getInitialY ( ) {
	 } // .end method
	 public abstract org.anddev.andengine.entity.IEntity getLastChild ( ) {
	 } // .end method
	 public abstract org.anddev.andengine.util.Transformation getLocalToSceneTransformation ( ) {
	 } // .end method
	 public abstract org.anddev.andengine.entity.IEntity getParent ( ) {
	 } // .end method
	 public abstract Float getRed ( ) {
	 } // .end method
	 public abstract Float getRotation ( ) {
	 } // .end method
	 public abstract Float getRotationCenterX ( ) {
	 } // .end method
	 public abstract Float getRotationCenterY ( ) {
	 } // .end method
	 public abstract Float getScaleCenterX ( ) {
	 } // .end method
	 public abstract Float getScaleCenterY ( ) {
	 } // .end method
	 public abstract Float getScaleX ( ) {
	 } // .end method
	 public abstract Float getScaleY ( ) {
	 } // .end method
	 public abstract getSceneCenterCoordinates ( ) {
	 } // .end method
	 public abstract org.anddev.andengine.util.Transformation getSceneToLocalTransformation ( ) {
	 } // .end method
	 public abstract java.lang.Object getUserData ( ) {
	 } // .end method
	 public abstract Float getX ( ) {
	 } // .end method
	 public abstract Float getY ( ) {
	 } // .end method
	 public abstract Integer getZIndex ( ) {
	 } // .end method
	 public abstract Boolean hasParent ( ) {
	 } // .end method
	 public abstract Boolean isChildrenIgnoreUpdate ( ) {
	 } // .end method
	 public abstract Boolean isChildrenVisible ( ) {
	 } // .end method
	 public abstract Boolean isIgnoreUpdate ( ) {
	 } // .end method
	 public abstract Boolean isRotated ( ) {
	 } // .end method
	 public abstract Boolean isScaled ( ) {
	 } // .end method
	 public abstract Boolean isVisible ( ) {
	 } // .end method
	 public abstract void onAttached ( ) {
	 } // .end method
	 public abstract void onDetached ( ) {
	 } // .end method
	 public abstract void registerEntityModifier ( org.anddev.andengine.entity.modifier.IEntityModifier p0 ) {
	 } // .end method
	 public abstract void registerUpdateHandler ( org.anddev.andengine.engine.handler.IUpdateHandler p0 ) {
	 } // .end method
	 public abstract void setAlpha ( Float p0 ) {
	 } // .end method
	 public abstract Boolean setChildIndex ( org.anddev.andengine.entity.IEntity p0, Integer p1 ) {
	 } // .end method
	 public abstract void setChildrenIgnoreUpdate ( Boolean p0 ) {
	 } // .end method
	 public abstract void setChildrenVisible ( Boolean p0 ) {
	 } // .end method
	 public abstract void setColor ( Float p0, Float p1, Float p2 ) {
	 } // .end method
	 public abstract void setColor ( Float p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 public abstract void setIgnoreUpdate ( Boolean p0 ) {
	 } // .end method
	 public abstract void setInitialPosition ( ) {
	 } // .end method
	 public abstract void setParent ( org.anddev.andengine.entity.IEntity p0 ) {
	 } // .end method
	 public abstract void setPosition ( Float p0, Float p1 ) {
	 } // .end method
	 public abstract void setPosition ( org.anddev.andengine.entity.IEntity p0 ) {
	 } // .end method
	 public abstract void setRotation ( Float p0 ) {
	 } // .end method
	 public abstract void setRotationCenter ( Float p0, Float p1 ) {
	 } // .end method
	 public abstract void setRotationCenterX ( Float p0 ) {
	 } // .end method
	 public abstract void setRotationCenterY ( Float p0 ) {
	 } // .end method
	 public abstract void setScale ( Float p0 ) {
	 } // .end method
	 public abstract void setScale ( Float p0, Float p1 ) {
	 } // .end method
	 public abstract void setScaleCenter ( Float p0, Float p1 ) {
	 } // .end method
	 public abstract void setScaleCenterX ( Float p0 ) {
	 } // .end method
	 public abstract void setScaleCenterY ( Float p0 ) {
	 } // .end method
	 public abstract void setScaleX ( Float p0 ) {
	 } // .end method
	 public abstract void setScaleY ( Float p0 ) {
	 } // .end method
	 public abstract void setUserData ( java.lang.Object p0 ) {
	 } // .end method
	 public abstract void setVisible ( Boolean p0 ) {
	 } // .end method
	 public abstract void setZIndex ( Integer p0 ) {
	 } // .end method
	 public abstract void sortChildren ( ) {
	 } // .end method
	 public abstract void sortChildren ( java.util.Comparator p0 ) {
	 } // .end method
	 public abstract Boolean swapChildren ( Integer p0, Integer p1 ) {
	 } // .end method
	 public abstract Boolean swapChildren ( org.anddev.andengine.entity.IEntity p0, org.anddev.andengine.entity.IEntity p1 ) {
	 } // .end method
	 public abstract Boolean unregisterEntityModifier ( org.anddev.andengine.entity.modifier.IEntityModifier p0 ) {
	 } // .end method
	 public abstract Boolean unregisterEntityModifiers ( org.anddev.andengine.entity.modifier.IEntityModifier$IEntityModifierMatcher p0 ) {
	 } // .end method
	 public abstract Boolean unregisterUpdateHandler ( org.anddev.andengine.engine.handler.IUpdateHandler p0 ) {
	 } // .end method
	 public abstract Boolean unregisterUpdateHandlers ( org.anddev.andengine.engine.handler.IUpdateHandler$IUpdateHandlerMatcher p0 ) {
	 } // .end method
