public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( android.view.View p0 ) {
		 /* .locals 3 */
		 (( android.view.View ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 (( android.view.View ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
			 int v2 = 0; // const/4 v2, 0x0
			 (( android.graphics.drawable.Drawable ) v1 ).setCallback ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
		 } // :cond_0
		 /* instance-of v1, p0, Landroid/view/ViewGroup; */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 int v1 = 0; // const/4 v1, 0x0
			 /* move v2, v1 */
		 } // :goto_0
		 /* move-object v0, p0 */
		 /* check-cast v0, Landroid/view/ViewGroup; */
		 /* move-object v1, v0 */
		 v1 = 		 (( android.view.ViewGroup ) v1 ).getChildCount ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I
		 /* if-lt v2, v1, :cond_2 */
		 /* check-cast p0, Landroid/view/ViewGroup; */
		 (( android.view.ViewGroup ) p0 ).removeAllViews ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V
	 } // :cond_1
	 return;
} // :cond_2
/* move-object v0, p0 */
/* check-cast v0, Landroid/view/ViewGroup; */
/* move-object v1, v0 */
(( android.view.ViewGroup ) v1 ).getChildAt ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
com.tgb.bg.jevcyxq.refurbished.a .a ( v1 );
/* add-int/lit8 v1, v2, 0x1 */
/* move v2, v1 */
} // .end method
t/high16 v1, 0x42940000 # 74.0f */
		 /* add-float/2addr v0, v1 */
		 /* sub-float/2addr v0, v4 */
		 /* iput v0, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->c:F */
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p3 ).m ( ); // invoke-virtual {p3}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
		 (( com.tgb.bg.jevcyxq.c.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
		 v0 = 		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileY ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileY()I
		 /* int-to-float v0, v0 */
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p3 ).m ( ); // invoke-virtual {p3}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
		 (( com.tgb.bg.jevcyxq.c.aa ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
		 v1 = 		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v1 ).getY ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getY()F
		 /* add-float/2addr v0, v1 */
		 /* const/high16 v1, 0x42140000 # 37.0f */
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->d:F */
		 /* new-instance v0, Lcom/tgb/bg/jevcyxq/refurbished/k; */
		 /* iget v1, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->c:F */
		 /* iget v2, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->d:F */
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p3 ).g ( ); // invoke-virtual {p3}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
		 v3 = this.h;
		 v3 = 		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v3 ).getHeight ( ); // invoke-virtual {v3}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getHeight()I
		 /* div-int/lit8 v3, v3, 0x3 */
		 /* int-to-float v3, v3 */
		 /* sub-float/2addr v2, v3 */
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p3 ).g ( ); // invoke-virtual {p3}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
		 v3 = this.h;
		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v3 ).clone ( ); // invoke-virtual {v3}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/tgb/bg/jevcyxq/refurbished/k;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 this.e = v0;
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) p3 ).e ( ); // invoke-virtual {p3}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
		 /* const/16 v1, 0x8 */
		 (( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
		 v1 = this.e;
		 /* iget v0, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->c:F */
		 /* add-float/2addr v0, v4 */
		 /* iget v1, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->d:F */
		 /* const/high16 v2, 0x41200000 # 10.0f */
		 /* sub-float/2addr v1, v2 */
		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).setPosition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/tgb/bg/jevcyxq/refurbished/j;->setPosition(FF)V
		 v0 = this.e;
		 v1 = 		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getWidth()F
		 /* const/high16 v2, 0x42200000 # 40.0f */
		 /* add-float/2addr v1, v2 */
		 (( com.tgb.bg.jevcyxq.refurbished.k ) v0 ).setWidth ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/refurbished/k;->setWidth(F)V
		 /* iput p1, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->a:I */
		 /* iput p2, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->b:I */
		 return;
	 } // .end method
	 static com.tgb.bg.jevcyxq.refurbished.k a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.e;
	 } // .end method
	 static void a ( Object p0, Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/text/Text;->setVisible(Z)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->a:I */
	 } // .end method
	 public final void a ( Boolean p0 ) {
		 /* .locals 9 */
		 /* const/high16 v8, 0x43c80000 # 400.0f */
		 /* const/high16 v7, 0x43af0000 # 350.0f */
		 /* const/high16 v6, 0x3f800000 # 1.0f */
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v5, 0x44480000 # 800.0f */
		 /* if-nez p1, :cond_2 */
		 v0 = 		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getX()F
		 /* cmpl-float v0, v0, v8 */
		 /* if-lez v0, :cond_0 */
		 v0 = 		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getX()F
		 /* sub-float/2addr v0, v5 */
		 v0 = 		 java.lang.Math .abs ( v0 );
		 /* div-float/2addr v0, v7 */
		 /* new-instance v1, Lorg/anddev/andengine/entity/modifier/MoveXModifier; */
		 v2 = 		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getX()F
		 /* new-instance v3, Lcom/tgb/bg/jevcyxq/refurbished/g; */
		 /* invoke-direct {v3, p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/g;-><init>(Lcom/tgb/bg/jevcyxq/refurbished/j;Z)V */
		 /* invoke-direct {v1, v0, v2, v5, v3}, Lorg/anddev/andengine/entity/modifier/MoveXModifier;-><init>(FFFLorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;)V */
		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).registerEntityModifier ( v1 ); // invoke-virtual {p0, v1}, Lcom/tgb/bg/jevcyxq/refurbished/j;->registerEntityModifier(Lorg/anddev/andengine/entity/modifier/IEntityModifier;)V
		 v1 = this.e;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = this.e;
			 /* new-instance v2, Lorg/anddev/andengine/entity/modifier/MoveXModifier; */
			 v3 = 			 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getX()F
			 /* new-instance v4, Lcom/tgb/bg/jevcyxq/refurbished/d; */
			 /* invoke-direct {v4, p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/d;-><init>(Lcom/tgb/bg/jevcyxq/refurbished/j;Z)V */
			 /* invoke-direct {v2, v0, v3, v5, v4}, Lorg/anddev/andengine/entity/modifier/MoveXModifier;-><init>(FFFLorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;)V */
			 (( com.tgb.bg.jevcyxq.refurbished.k ) v1 ).registerEntityModifier ( v2 ); // invoke-virtual {v1, v2}, Lcom/tgb/bg/jevcyxq/refurbished/k;->registerEntityModifier(Lorg/anddev/andengine/entity/modifier/IEntityModifier;)V
		 } // :cond_0
		 v0 = 		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getX()F
		 /* cmpg-float v0, v0, v8 */
		 /* if-gez v0, :cond_1 */
		 v0 = 		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getX()F
		 v1 = 		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getWidth()F
		 /* add-float/2addr v0, v1 */
		 v0 = 		 java.lang.Math .abs ( v0 );
		 /* div-float/2addr v0, v7 */
		 /* new-instance v1, Lorg/anddev/andengine/entity/modifier/MoveXModifier; */
		 v2 = 		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getX()F
		 v3 = 		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getWidth()F
		 /* neg-float v3, v3 */
		 /* new-instance v4, Lcom/tgb/bg/jevcyxq/refurbished/e; */
		 /* invoke-direct {v4, p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/e;-><init>(Lcom/tgb/bg/jevcyxq/refurbished/j;Z)V */
		 /* invoke-direct {v1, v0, v2, v3, v4}, Lorg/anddev/andengine/entity/modifier/MoveXModifier;-><init>(FFFLorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;)V */
		 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).registerEntityModifier ( v1 ); // invoke-virtual {p0, v1}, Lcom/tgb/bg/jevcyxq/refurbished/j;->registerEntityModifier(Lorg/anddev/andengine/entity/modifier/IEntityModifier;)V
		 v1 = this.e;
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 v1 = this.e;
			 /* new-instance v2, Lorg/anddev/andengine/entity/modifier/MoveXModifier; */
			 v3 = 			 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getX()F
			 v4 = 			 (( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->getWidth()F
			 /* neg-float v4, v4 */
			 /* new-instance v5, Lcom/tgb/bg/jevcyxq/refurbished/c; */
			 /* invoke-direct {v5, p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/c;-><init>(Lcom/tgb/bg/jevcyxq/refurbished/j;Z)V */
			 /* invoke-direct {v2, v0, v3, v4, v5}, Lorg/anddev/andengine/entity/modifier/MoveXModifier;-><init>(FFFLorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;)V */
			 (( com.tgb.bg.jevcyxq.refurbished.k ) v1 ).registerEntityModifier ( v2 ); // invoke-virtual {v1, v2}, Lcom/tgb/bg/jevcyxq/refurbished/k;->registerEntityModifier(Lorg/anddev/andengine/entity/modifier/IEntityModifier;)V
		 } // :cond_1
	 } // :goto_0
	 return;
} // :cond_2
/* new-instance v0, Lorg/anddev/andengine/entity/modifier/AlphaModifier; */
/* const/high16 v1, 0x40000000 # 2.0f */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/refurbished/h; */
/* invoke-direct {v2, p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/h;-><init>(Lcom/tgb/bg/jevcyxq/refurbished/j;Z)V */
/* invoke-direct {v0, v1, v4, v6, v2}, Lorg/anddev/andengine/entity/modifier/AlphaModifier;-><init>(FFFLorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;)V */
(( com.tgb.bg.jevcyxq.refurbished.j ) p0 ).registerEntityModifier ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/refurbished/j;->registerEntityModifier(Lorg/anddev/andengine/entity/modifier/IEntityModifier;)V
v0 = this.e;
/* new-instance v1, Lorg/anddev/andengine/entity/modifier/AlphaModifier; */
/* const/high16 v2, 0x40200000 # 2.5f */
/* new-instance v3, Lcom/tgb/bg/jevcyxq/refurbished/f; */
/* invoke-direct {v3, p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/f;-><init>(Lcom/tgb/bg/jevcyxq/refurbished/j;Z)V */
/* invoke-direct {v1, v2, v4, v6, v3}, Lorg/anddev/andengine/entity/modifier/AlphaModifier;-><init>(FFFLorg/anddev/andengine/entity/modifier/IEntityModifier$IEntityModifierListener;)V */
(( com.tgb.bg.jevcyxq.refurbished.k ) v0 ).registerEntityModifier ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/refurbished/k;->registerEntityModifier(Lorg/anddev/andengine/entity/modifier/IEntityModifier;)V
} // .end method
public final Integer b ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/refurbished/j;->b:I */
} // .end method
public final void setVisible ( Boolean p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/text/Text;->setVisible(Z)V */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.e;
	 (( com.tgb.bg.jevcyxq.refurbished.k ) v0 ).setVisible ( p1 ); // invoke-virtual {v0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/k;->setVisible(Z)V
} // :cond_0
return;
} // .end method
