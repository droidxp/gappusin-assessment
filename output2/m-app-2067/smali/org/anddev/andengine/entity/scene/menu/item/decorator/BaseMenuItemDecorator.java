public abstract class org.anddev.andengine.entity.scene.menu.item.decorator.BaseMenuItemDecorator implements org.anddev.andengine.entity.scene.menu.item.IMenuItem {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.entity.scene.menu.item.IMenuItem mMenuItem;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.menu.item.decorator.BaseMenuItemDecorator ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mMenuItem = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void attachChild ( org.anddev.andengine.entity.IEntity p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public Boolean attachChild ( org.anddev.andengine.entity.IEntity p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public void callOnChildren ( org.anddev.andengine.entity.IEntity$IEntityCallable p0 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.entity.scene.menu.item.decorator.BaseMenuItemDecorator ) p0 ).callOnChildren ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/item/decorator/BaseMenuItemDecorator;->callOnChildren(Lorg/anddev/andengine/entity/IEntity$IEntityCallable;)V
		 return;
	 } // .end method
	 public void callOnChildren ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0, org.anddev.andengine.entity.IEntity$IEntityCallable p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void clearEntityModifiers ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void clearUpdateHandlers ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public Boolean collidesWith ( org.anddev.andengine.entity.shape.IShape p0 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean contains ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public convertLocalToSceneCoordinates ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public convertLocalToSceneCoordinates ( Float p0, Float p1, Float[] p2 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public convertLocalToSceneCoordinates ( Float[] p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public convertLocalToSceneCoordinates ( Float[] p0, Float[] p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public convertSceneToLocalCoordinates ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public convertSceneToLocalCoordinates ( Float p0, Float p1, Float[] p2 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public convertSceneToLocalCoordinates ( Float[] p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public convertSceneToLocalCoordinates ( Float[] p0, Float[] p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public org.anddev.andengine.entity.IEntity detachChild ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean detachChild ( org.anddev.andengine.entity.IEntity p0 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public void detachChildren ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public Boolean detachChildren ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean detachSelf ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public org.anddev.andengine.entity.IEntity findChild ( org.anddev.andengine.entity.IEntity$IEntityMatcher p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getAlpha ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getBaseHeight ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getBaseWidth ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getBlue ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public org.anddev.andengine.entity.IEntity getChild ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public Integer getChildCount ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Integer getChildIndex ( org.anddev.andengine.entity.IEntity p0 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public org.anddev.andengine.entity.IEntity getFirstChild ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getGreen ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getHeight ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getHeightScaled ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Integer getID ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getInitialX ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getInitialY ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public org.anddev.andengine.entity.IEntity getLastChild ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public org.anddev.andengine.util.Transformation getLocalToSceneTransformation ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public org.anddev.andengine.entity.IEntity getParent ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getRed ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getRotation ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getRotationCenterX ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getRotationCenterY ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getScaleCenterX ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getScaleCenterY ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getScaleX ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getScaleY ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public getSceneCenterCoordinates ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public org.anddev.andengine.util.Transformation getSceneToLocalTransformation ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public java.lang.Object getUserData ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getWidth ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getWidthScaled ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getX ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Float getY ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Integer getZIndex ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean hasParent ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean isChildrenIgnoreUpdate ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean isChildrenVisible ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean isCullingEnabled ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean isIgnoreUpdate ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean isRotated ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean isScaled ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean isVisible ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean onAreaTouched ( org.anddev.andengine.input.touch.TouchEvent p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public void onAttached ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void onDetached ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void onDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 protected abstract void onMenuItemReset ( org.anddev.andengine.entity.scene.menu.item.IMenuItem p0 ) {
	 } // .end method
	 protected abstract void onMenuItemSelected ( org.anddev.andengine.entity.scene.menu.item.IMenuItem p0 ) {
	 } // .end method
	 protected abstract void onMenuItemUnselected ( org.anddev.andengine.entity.scene.menu.item.IMenuItem p0 ) {
	 } // .end method
	 public final void onSelected ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 v0 = this.mMenuItem;
		 (( org.anddev.andengine.entity.scene.menu.item.decorator.BaseMenuItemDecorator ) p0 ).onMenuItemSelected ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/menu/item/decorator/BaseMenuItemDecorator;->onMenuItemSelected(Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem;)V
		 return;
	 } // .end method
	 public final void onUnselected ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 v0 = this.mMenuItem;
		 (( org.anddev.andengine.entity.scene.menu.item.decorator.BaseMenuItemDecorator ) p0 ).onMenuItemUnselected ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/menu/item/decorator/BaseMenuItemDecorator;->onMenuItemUnselected(Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem;)V
		 return;
	 } // .end method
	 public void onUpdate ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void registerEntityModifier ( org.anddev.andengine.entity.modifier.IEntityModifier p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void registerUpdateHandler ( org.anddev.andengine.engine.handler.IUpdateHandler p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void reset ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 v0 = this.mMenuItem;
		 (( org.anddev.andengine.entity.scene.menu.item.decorator.BaseMenuItemDecorator ) p0 ).onMenuItemReset ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/menu/item/decorator/BaseMenuItemDecorator;->onMenuItemReset(Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem;)V
		 return;
	 } // .end method
	 public void setAlpha ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setBlendFunction ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public Boolean setChildIndex ( org.anddev.andengine.entity.IEntity p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public void setChildrenIgnoreUpdate ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setChildrenVisible ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setColor ( Float p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setColor ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setCullingEnabled ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setIgnoreUpdate ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setInitialPosition ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setParent ( org.anddev.andengine.entity.IEntity p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setPosition ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setPosition ( org.anddev.andengine.entity.IEntity p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setRotation ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setRotationCenter ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setRotationCenterX ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setRotationCenterY ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setScale ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setScale ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setScaleCenter ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setScaleCenterX ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setScaleCenterY ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setScaleX ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setScaleY ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setUserData ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setVisible ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void setZIndex ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void sortChildren ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public void sortChildren ( java.util.Comparator p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItem;
		 return;
	 } // .end method
	 public Boolean swapChildren ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean swapChildren ( org.anddev.andengine.entity.IEntity p0, org.anddev.andengine.entity.IEntity p1 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean unregisterEntityModifier ( org.anddev.andengine.entity.modifier.IEntityModifier p0 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean unregisterEntityModifiers ( org.anddev.andengine.entity.modifier.IEntityModifier$IEntityModifierMatcher p0 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean unregisterUpdateHandler ( org.anddev.andengine.engine.handler.IUpdateHandler p0 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
	 public Boolean unregisterUpdateHandlers ( org.anddev.andengine.engine.handler.IUpdateHandler$IUpdateHandlerMatcher p0 ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mMenuItem;
	 } // .end method
