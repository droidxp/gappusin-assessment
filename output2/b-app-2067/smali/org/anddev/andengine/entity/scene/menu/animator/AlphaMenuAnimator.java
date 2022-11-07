public class org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator extends org.anddev.andengine.entity.scene.menu.animator.BaseMenuAnimator {
	 /* # static fields */
	 private static $SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign; //synthetic
	 private static final Float ALPHA_FROM;
	 private static final Float ALPHA_TO;
	 /* # direct methods */
	 static $SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign ( ) { //synthethic
		 /* .locals 3 */
		 v0 = org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator.$SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign;
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
public org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>()V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(F)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(FLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;F)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;FLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/HorizontalAlign;Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
	 return;
} // .end method
public org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/BaseMenuAnimator;-><init>(Lorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
	 return;
} // .end method
/* # virtual methods */
public void buildAnimations ( java.util.ArrayList p0, Float p1, Float p2 ) {
	 /* .locals 5 */
	 /* const/high16 v4, 0x3f800000 # 1.0f */
	 v0 = this.mEaseFunction;
	 v1 = 	 (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
	 int v2 = 1; // const/4 v2, 0x1
	 /* sub-int/2addr v1, v2 */
} // :goto_0
/* if-gez v1, :cond_0 */
return;
} // :cond_0
/* new-instance v2, Lorg/anddev/andengine/entity/modifier/AlphaModifier; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, v4, v3, v4, v0}, Lorg/anddev/andengine/entity/modifier/AlphaModifier;-><init>(FFFLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
int v3 = 0; // const/4 v3, 0x0
(( org.anddev.andengine.entity.modifier.AlphaModifier ) v2 ).setRemoveWhenFinished ( v3 ); // invoke-virtual {v2, v3}, Lorg/anddev/andengine/entity/modifier/AlphaModifier;->setRemoveWhenFinished(Z)V
(( java.util.ArrayList ) p1 ).get ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem; */
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public void prepareAnimations ( java.util.ArrayList p0, Float p1, Float p2 ) {
/* .locals 12 */
/* const/high16 v11, 0x3f000000 # 0.5f */
int v10 = 0; // const/4 v10, 0x0
v1 = (( org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ) p0 ).getMaximumWidth ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/AlphaMenuAnimator;->getMaximumWidth(Ljava/util/ArrayList;)F
v0 = (( org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator ) p0 ).getOverallHeight ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/animator/AlphaMenuAnimator;->getOverallHeight(Ljava/util/ArrayList;)F
/* sub-float v2, p2, v1 */
/* mul-float/2addr v2, v11 */
/* sub-float v0, p3, v0 */
/* mul-float v3, v0, v11 */
/* iget v4, p0, Lorg/anddev/andengine/entity/scene/menu/animator/AlphaMenuAnimator;->mMenuItemSpacing:F */
v5 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
int v0 = 0; // const/4 v0, 0x0
/* move v6, v0 */
/* move v7, v10 */
} // :goto_0
/* if-lt v6, v5, :cond_0 */
return;
} // :cond_0
(( java.util.ArrayList ) p1 ).get ( v6 ); // invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem; */
org.anddev.andengine.entity.scene.menu.animator.AlphaMenuAnimator .$SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign ( );
v9 = this.mHorizontalAlign;
v9 = (( org.anddev.andengine.util.HorizontalAlign ) v9 ).ordinal ( ); // invoke-virtual {v9}, Lorg/anddev/andengine/util/HorizontalAlign;->ordinal()I
/* aget v8, v8, v9 */
/* packed-switch v8, :pswitch_data_0 */
v8 = /* :pswitch_0 */
/* sub-float v8, v1, v8 */
/* mul-float/2addr v8, v11 */
} // :goto_1
/* add-float/2addr v8, v2 */
v0 = /* add-float v9, v3, v7 */
/* add-float/2addr v0, v4 */
/* add-float/2addr v0, v7 */
/* add-int/lit8 v6, v6, 0x1 */
/* move v7, v0 */
/* :pswitch_1 */
/* move v8, v10 */
v8 = /* :pswitch_2 */
/* sub-float v8, v1, v8 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
