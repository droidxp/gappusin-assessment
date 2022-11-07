public class org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator extends org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator {
	 /* # static fields */
	 private static $SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign; //synthetic
	 /* # direct methods */
	 static $SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign ( ) { //synthethic
		 /* .locals 3 */
		 v0 = org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator.$SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
	 } // :cond_0
	 org.anddev.andengine.util.HorizontalAlign .values ( );
	 /* array-length v0, v0 */
	 /* new-array v0, v0, [I */
	 try { // :try_start_0
		 v1 = org.anddev.andengine.util.HorizontalAlign.CENTER;
		 v1 = 		 (( org.anddev.andengine.util.HorizontalAlign ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/HorizontalAlign;->ordinal()I
		 int v2 = 2; // const/4 v2, 0x2
		 /* aput v2, v0, v1 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_2 */
	 } // :goto_1
	 try { // :try_start_1
		 v1 = org.anddev.andengine.util.HorizontalAlign.LEFT;
		 v1 = 		 (( org.anddev.andengine.util.HorizontalAlign ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/HorizontalAlign;->ordinal()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput v2, v0, v1 */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
	 } // :goto_2
	 try { // :try_start_2
		 v1 = org.anddev.andengine.util.HorizontalAlign.RIGHT;
		 v1 = 		 (( org.anddev.andengine.util.HorizontalAlign ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/HorizontalAlign;->ordinal()I
		 int v2 = 3; // const/4 v2, 0x3
		 /* aput v2, v0, v1 */
		 /* :try_end_2 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_0 */
	 } // :goto_3
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* :catch_1 */
	 /* move-exception v1 */
	 /* :catch_2 */
	 /* move-exception v1 */
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>()V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(F)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(FLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;F)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;FLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
	 return;
} // .end method
/* # virtual methods */
public void buildAnimations ( java.util.ArrayList p0, Float p1, Float p2 ) {
	 /* .locals 13 */
	 v6 = this.mEaseFunction;
	 v7 = 	 (( org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ) p0 ).getMaximumWidth ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/SlideMenuAnimator;->getMaximumWidth(Ljava/util/ArrayList;)F
	 v0 = 	 (( org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ) p0 ).getOverallHeight ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/SlideMenuAnimator;->getOverallHeight(Ljava/util/ArrayList;)F
	 /* sub-float v1, p2, v7 */
	 /* const/high16 v2, 0x3f000000 # 0.5f */
	 /* mul-float v8, v1, v2 */
	 /* sub-float v0, p3, v0 */
	 /* const/high16 v1, 0x3f000000 # 0.5f */
	 /* mul-float v9, v0, v1 */
	 int v0 = 0; // const/4 v0, 0x0
	 v10 = 	 (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
	 int v1 = 0; // const/4 v1, 0x0
	 /* move v11, v1 */
	 /* move v12, v0 */
} // :goto_0
/* if-lt v11, v10, :cond_0 */
return;
} // :cond_0
(( java.util.ArrayList ) p1 ).get ( v11 ); // invoke-virtual {p1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p2, Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem; */
org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator .$SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign ( );
v1 = this.mHorizontalAlign;
v1 = (( org.anddev.andengine.util.HorizontalAlign ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/HorizontalAlign;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
v0 = /* :pswitch_0 */
/* sub-float v0, v7, v0 */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* mul-float/2addr v0, v1 */
/* move v3, v0 */
} // :goto_1
/* new-instance v0, Lorg/anddev/andengine/entity/modifier/MoveModifier; */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* neg-float v2, v7 */
/* add-float/2addr v3, v8 */
/* add-float v4, v9, v12 */
/* add-float v5, v9, v12 */
/* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/entity/modifier/MoveModifier;-><init>(FFFFFLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
int v1 = 0; // const/4 v1, 0x0
v0 = (( org.anddev.andengine.entity.modifier.MoveModifier ) v0 ).setRemoveWhenFinished ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/modifier/MoveModifier;->setRemoveWhenFinished(Z)V
/* iget v1, p0, Lorg/anddev/andengine/entity/scene/menu/animator/SlideMenuAnimator;->mMenuItemSpacing:F */
/* add-float/2addr v0, v1 */
/* add-float/2addr v0, v12 */
/* add-int/lit8 v1, v11, 0x1 */
/* move v11, v1 */
/* move v12, v0 */
/* :pswitch_1 */
int v0 = 0; // const/4 v0, 0x0
/* move v3, v0 */
v0 = /* :pswitch_2 */
/* sub-float v0, v7, v0 */
/* move v3, v0 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public void prepareAnimations ( java.util.ArrayList p0, Float p1, Float p2 ) {
/* .locals 9 */
v0 = (( org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ) p0 ).getMaximumWidth ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/SlideMenuAnimator;->getMaximumWidth(Ljava/util/ArrayList;)F
v1 = (( org.anddev.andengine.entity.scene.menu.animator.SlideMenuAnimator ) p0 ).getOverallHeight ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/SlideMenuAnimator;->getOverallHeight(Ljava/util/ArrayList;)F
/* sub-float v1, p3, v1 */
/* const/high16 v2, 0x3f000000 # 0.5f */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lorg/anddev/andengine/entity/scene/menu/animator/SlideMenuAnimator;->mMenuItemSpacing:F */
int v3 = 0; // const/4 v3, 0x0
v4 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
int v5 = 0; // const/4 v5, 0x0
/* move v8, v5 */
/* move v5, v3 */
/* move v3, v8 */
} // :goto_0
/* if-lt v3, v4, :cond_0 */
return;
} // :cond_0
(( java.util.ArrayList ) p1 ).get ( v3 ); // invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem; */
/* neg-float v6, v0 */
v6 = /* add-float v7, v1, v5 */
/* add-float/2addr v6, v2 */
/* add-float/2addr v5, v6 */
/* add-int/lit8 v3, v3, 0x1 */
} // .end method
