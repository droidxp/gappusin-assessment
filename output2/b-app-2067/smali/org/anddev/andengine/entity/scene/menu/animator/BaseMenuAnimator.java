public abstract class org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator implements org.anddev.andengine.entity.scene.menu.animator.IMenuAnimator {
	 /* # interfaces */
	 /* # static fields */
	 protected static final Float DURATION;
	 private static final org.anddev.andengine.util.HorizontalAlign HORIZONTALALIGN_DEFAULT;
	 private static final Float MENUITEMSPACING_DEFAULT;
	 /* # instance fields */
	 protected final org.anddev.andengine.util.modifier.ease.IEaseFunction mEaseFunction;
	 protected final org.anddev.andengine.util.HorizontalAlign mHorizontalAlign;
	 protected final Float mMenuItemSpacing;
	 /* # direct methods */
	 static org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.HorizontalAlign.CENTER;
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(F)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator.HORIZONTALALIGN_DEFAULT;
		 /* invoke-direct {p0, v0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;F)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator.HORIZONTALALIGN_DEFAULT;
		 /* invoke-direct {p0, v0, p1, p2}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;FLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1, v0}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;F)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
		 /* invoke-direct {p0, p1, p2, v0}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;FLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mHorizontalAlign = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;->mMenuItemSpacing:F */
		 this.mEaseFunction = p3;
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1, v0, p2}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;FLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, v0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(FLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected Float getMaximumWidth ( java.util.ArrayList p0 ) {
		 /* .locals 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 v1 = 		 (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* sub-int/2addr v1, v2 */
		 /* move v3, v1 */
		 /* move v1, v0 */
		 /* move v0, v3 */
	 } // :goto_0
	 /* if-gez v0, :cond_0 */
} // :cond_0
(( java.util.ArrayList ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
v2 = /* check-cast p0, Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem; */
v1 = java.lang.Math .max ( v1,v2 );
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
protected Float getOverallHeight ( java.util.ArrayList p0 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v0 = 0; // const/4 v0, 0x0
v1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v1, v3 */
/* move v2, v0 */
} // :goto_0
/* if-gez v1, :cond_0 */
v0 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v0, v3 */
/* int-to-float v0, v0 */
/* iget v1, p0, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;->mMenuItemSpacing:F */
/* mul-float/2addr v0, v1 */
/* add-float/2addr v0, v2 */
} // :cond_0
(( java.util.ArrayList ) p1 ).get ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
v0 = /* check-cast v0, Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem; */
/* add-float/2addr v0, v2 */
/* add-int/lit8 v1, v1, -0x1 */
/* move v2, v0 */
} // .end method
