public class de.nurogames.android.ticb.base.views.SplashView extends de.nurogames.android.ticb.base.views.ViewPlus {
	 /* .source "SplashView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/views/SplashView$MyOnTouchListener;, */
	 /* Lde/nurogames/android/ticb/base/views/SplashView$RefreshHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer mFPS;
private Integer mMode;
private de.nurogames.android.ticb.base.views.SplashView$RefreshHandler mRedrawHandler;
private Integer nCurSplash;
private Integer runtime;
private Integer visible_time;
/* # direct methods */
public de.nurogames.android.ticb.base.views.SplashView ( ) {
	 /* .locals 2 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 54 */
	 /* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/ViewPlus;-><init>(Landroid/content/Context;)V */
	 /* .line 30 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->mMode:I */
	 /* .line 33 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/views/SplashView$RefreshHandler; */
	 /* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/views/SplashView$RefreshHandler;-><init>(Lde/nurogames/android/ticb/base/views/SplashView;)V */
	 this.mRedrawHandler = v0;
	 /* .line 36 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->runtime:I */
	 /* .line 37 */
	 /* const/16 v0, 0x28 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->mFPS:I */
	 /* .line 40 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->nCurSplash:I */
	 /* .line 43 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->mFPS:I */
	 /* mul-int/lit8 v0, v0, 0x3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->visible_time:I */
	 /* .line 55 */
	 return;
} // .end method
private void initView ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 61 */
	 int v1 = 1; // const/4 v1, 0x1
	 (( de.nurogames.android.ticb.base.views.SplashView ) p0 ).setFocusable ( v1 ); // invoke-virtual {p0, v1}, Lde/nurogames/android/ticb/base/views/SplashView;->setFocusable(Z)V
	 /* .line 63 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/views/SplashView$MyOnTouchListener; */
	 /* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/views/SplashView$MyOnTouchListener;-><init>(Lde/nurogames/android/ticb/base/views/SplashView;)V */
	 /* .line 64 */
	 /* .local v0, "tlistn":Lde/nurogames/android/ticb/base/views/SplashView$MyOnTouchListener; */
	 (( de.nurogames.android.ticb.base.views.SplashView ) p0 ).setOnTouchListener ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/views/SplashView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
	 /* .line 66 */
	 /* if-ne v1, v2, :cond_0 */
	 /* .line 67 */
	 /* const/high16 v1, 0x40600000 # 3.5f */
	 /* iget v2, p0, Lde/nurogames/android/ticb/base/views/SplashView;->mFPS:I */
	 /* int-to-float v2, v2 */
	 /* mul-float/2addr v1, v2 */
	 /* float-to-int v1, v1 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->visible_time:I */
	 /* .line 71 */
} // :goto_0
return;
/* .line 69 */
} // :cond_0
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->mFPS:I */
/* mul-int/lit8 v1, v1, 0x3 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->visible_time:I */
} // .end method
private void nextScreen ( ) {
/* .locals 1 */
/* .prologue */
/* .line 121 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->nCurSplash:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->nCurSplash:I */
/* .line 123 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->runtime:I */
/* .line 124 */
v0 = de.nurogames.android.ticb.base.tinysanta.fade_splash_in;
(( de.nurogames.android.ticb.base.views.SplashView ) p0 ).startAnimation ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/views/SplashView;->startAnimation(Landroid/view/animation/Animation;)V
/* .line 126 */
return;
} // .end method
/* # virtual methods */
public Integer getState ( ) {
/* .locals 1 */
/* .prologue */
/* .line 186 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->mMode:I */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 5 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 84 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgSplashBG;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 85 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgSplashBG;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->nCurSplash:I */
/* aget-object v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 87 */
	 v0 = de.nurogames.android.ticb.base.core.AppResources.imgSplashBG;
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->nCurSplash:I */
	 /* aget-object v0, v0, v1 */
	 /* .line 88 */
	 v2 = de.nurogames.android.ticb.base.core.AppResources.imgSplashBG;
	 /* iget v3, p0, Lde/nurogames/android/ticb/base/views/SplashView;->nCurSplash:I */
	 /* aget-object v2, v2, v3 */
	 v2 = 	 (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
	 /* div-int/lit8 v2, v2, 0x2 */
	 /* sub-int/2addr v1, v2 */
	 /* int-to-float v1, v1 */
	 /* .line 89 */
	 v3 = de.nurogames.android.ticb.base.core.AppResources.imgSplashBG;
	 /* iget v4, p0, Lde/nurogames/android/ticb/base/views/SplashView;->nCurSplash:I */
	 /* aget-object v3, v3, v4 */
	 v3 = 	 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
	 /* div-int/lit8 v3, v3, 0x2 */
	 /* sub-int/2addr v2, v3 */
	 /* int-to-float v2, v2 */
	 /* .line 90 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 86 */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
	 /* .line 92 */
} // :cond_0
return;
} // .end method
public void setState ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "state" # I */
/* .prologue */
/* .line 179 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->mMode:I */
/* .line 180 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/SplashView;->initView()V */
/* .line 181 */
(( de.nurogames.android.ticb.base.views.SplashView ) p0 ).update ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/SplashView;->update()V
/* .line 182 */
return;
} // .end method
public void update ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 100 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->mMode:I */
/* if-ne v0, v2, :cond_1 */
/* .line 102 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->runtime:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->runtime:I */
/* .line 103 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->runtime:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/SplashView;->visible_time:I */
/* if-ne v0, v1, :cond_0 */
/* .line 104 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/SplashView;->nCurSplash:I */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgSplashBG;
/* array-length v1, v1 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-ne v0, v1, :cond_2 */
/* .line 105 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v2 );
/* .line 110 */
} // :cond_0
} // :goto_0
v0 = this.mRedrawHandler;
/* const-wide/16 v1, 0x19 */
(( de.nurogames.android.ticb.base.views.SplashView$RefreshHandler ) v0 ).sleep ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/nurogames/android/ticb/base/views/SplashView$RefreshHandler;->sleep(J)V
/* .line 113 */
} // :cond_1
return;
/* .line 107 */
} // :cond_2
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/SplashView;->nextScreen()V */
} // .end method
