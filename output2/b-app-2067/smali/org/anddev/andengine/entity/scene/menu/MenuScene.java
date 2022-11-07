public class org.anddev.andengine.entity.scene.menu.MenuScene extends org.anddev.andengine.entity.scene.CameraScene implements org.anddev.andengine.entity.scene.Scene$IOnAreaTouchListener implements org.anddev.andengine.entity.scene.Scene$IOnSceneTouchListener {
	 /* # interfaces */
	 /* # instance fields */
	 private org.anddev.andengine.entity.scene.menu.animator.IMenuAnimator mMenuAnimator;
	 private final java.util.ArrayList mMenuItems;
	 private org.anddev.andengine.entity.scene.menu.MenuScene$IOnMenuItemClickListener mOnMenuItemClickListener;
	 private org.anddev.andengine.entity.scene.menu.item.IMenuItem mSelectedMenuItem;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.menu.MenuScene ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, v0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/entity/scene/menu/MenuScene$IOnMenuItemClickListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.MenuScene ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/entity/scene/menu/MenuScene$IOnMenuItemClickListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.MenuScene ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/scene/CameraScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;)V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mMenuItems = v0;
		 v0 = org.anddev.andengine.entity.scene.menu.animator.IMenuAnimator.DEFAULT;
		 this.mMenuAnimator = v0;
		 this.mOnMenuItemClickListener = p2;
		 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).setOnSceneTouchListener ( p0 ); // invoke-virtual {p0, p0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->setOnSceneTouchListener(Lorg/anddev/andengine/entity/scene/Scene$IOnSceneTouchListener;)V
		 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).setOnAreaTouchListener ( p0 ); // invoke-virtual {p0, p0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->setOnAreaTouchListener(Lorg/anddev/andengine/entity/scene/Scene$IOnAreaTouchListener;)V
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.MenuScene ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, p1}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/entity/scene/menu/MenuScene$IOnMenuItemClickListener;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void addMenuItem ( org.anddev.andengine.entity.scene.menu.item.IMenuItem p0 ) {
		 /* .locals 1 */
		 v0 = this.mMenuItems;
		 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).attachChild ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->attachChild(Lorg/anddev/andengine/entity/IEntity;)V
		 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).registerTouchArea ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->registerTouchArea(Lorg/anddev/andengine/entity/scene/Scene$ITouchArea;)V
		 return;
	 } // .end method
	 public void back ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/entity/scene/CameraScene;->back()V */
		 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).reset ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->reset()V
		 return;
	 } // .end method
	 public void buildAnimations ( ) {
		 /* .locals 4 */
		 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).prepareAnimations ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->prepareAnimations()V
		 v0 = this.mCamera;
		 v0 = 		 (( org.anddev.andengine.engine.camera.Camera ) v0 ).getWidthRaw ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/camera/Camera;->getWidthRaw()F
		 v1 = this.mCamera;
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) v1 ).getHeightRaw ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/engine/camera/Camera;->getHeightRaw()F
		 v2 = this.mMenuAnimator;
		 v3 = this.mMenuItems;
		 return;
	 } // .end method
	 public void clearChildScene ( ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).getChildScene ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->getChildScene()Lorg/anddev/andengine/entity/scene/menu/MenuScene;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).getChildScene ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->getChildScene()Lorg/anddev/andengine/entity/scene/menu/MenuScene;
			 (( org.anddev.andengine.entity.scene.menu.MenuScene ) v0 ).reset ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->reset()V
			 /* invoke-super {p0}, Lorg/anddev/andengine/entity/scene/CameraScene;->clearChildScene()V */
		 } // :cond_0
		 return;
	 } // .end method
	 public void closeMenuScene ( ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).back ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->back()V
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.Scene getChildScene ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).getChildScene ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->getChildScene()Lorg/anddev/andengine/entity/scene/menu/MenuScene;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.MenuScene getChildScene ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/entity/scene/CameraScene;->getChildScene()Lorg/anddev/andengine/entity/scene/Scene; */
		 /* check-cast p0, Lorg/anddev/andengine/entity/scene/menu/MenuScene; */
	 } // .end method
	 public Integer getMenuItemCount ( ) {
		 /* .locals 1 */
		 v0 = this.mMenuItems;
		 v0 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.MenuScene$IOnMenuItemClickListener getOnMenuItemClickListener ( ) {
		 /* .locals 1 */
		 v0 = this.mOnMenuItemClickListener;
	 } // .end method
	 public Boolean onAreaTouched ( org.anddev.andengine.input.touch.TouchEvent p0, org.anddev.andengine.entity.scene.Scene$ITouchArea p1, Float p2, Float p3 ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* check-cast p2, Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem; */
		 v0 = 		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getAction()I
		 /* packed-switch v0, :pswitch_data_0 */
	 } // :cond_0
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* :pswitch_0 */
v0 = this.mSelectedMenuItem;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mSelectedMenuItem;
/* if-eq v0, p2, :cond_1 */
v0 = this.mSelectedMenuItem;
} // :cond_1
this.mSelectedMenuItem = p2;
v0 = this.mSelectedMenuItem;
/* :pswitch_1 */
v0 = this.mOnMenuItemClickListener;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = v0 = this.mOnMenuItemClickListener;
this.mSelectedMenuItem = v1;
/* :pswitch_2 */
this.mSelectedMenuItem = v1;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public Boolean onSceneTouchEvent ( org.anddev.andengine.entity.scene.Scene p0, org.anddev.andengine.input.touch.TouchEvent p1 ) {
/* .locals 1 */
v0 = this.mSelectedMenuItem;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mSelectedMenuItem;
int v0 = 0; // const/4 v0, 0x0
this.mSelectedMenuItem = v0;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void prepareAnimations ( ) {
/* .locals 4 */
v0 = this.mCamera;
v0 = (( org.anddev.andengine.engine.camera.Camera ) v0 ).getWidthRaw ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/camera/Camera;->getWidthRaw()F
v1 = this.mCamera;
v1 = (( org.anddev.andengine.engine.camera.Camera ) v1 ).getHeightRaw ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/engine/camera/Camera;->getHeightRaw()F
v2 = this.mMenuAnimator;
v3 = this.mMenuItems;
return;
} // .end method
public void reset ( ) {
/* .locals 3 */
/* invoke-super {p0}, Lorg/anddev/andengine/entity/scene/CameraScene;->reset()V */
v1 = this.mMenuItems;
v0 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
/* move v2, v0 */
} // :goto_0
/* if-gez v2, :cond_0 */
(( org.anddev.andengine.entity.scene.menu.MenuScene ) p0 ).prepareAnimations ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/scene/menu/MenuScene;->prepareAnimations()V
return;
} // :cond_0
(( java.util.ArrayList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem; */
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
} // .end method
public void setChildScene ( org.anddev.andengine.entity.scene.Scene p0, Boolean p1, Boolean p2, Boolean p3 ) {
/* .locals 2 */
/* instance-of v0, p1, Lorg/anddev/andengine/entity/scene/menu/MenuScene; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-super {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/scene/CameraScene;->setChildScene(Lorg/anddev/andengine/entity/scene/Scene;ZZZ)V */
return;
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "MenuScene accepts only MenuScenes as a ChildScene."; // const-string v1, "MenuScene accepts only MenuScenes as a ChildScene."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void setMenuAnimator ( org.anddev.andengine.entity.scene.menu.animator.IMenuAnimator p0 ) {
/* .locals 0 */
this.mMenuAnimator = p1;
return;
} // .end method
public void setOnMenuItemClickListener ( org.anddev.andengine.entity.scene.menu.MenuScene$IOnMenuItemClickListener p0 ) {
/* .locals 0 */
this.mOnMenuItemClickListener = p1;
return;
} // .end method
