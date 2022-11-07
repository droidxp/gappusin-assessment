class de.nurogames.android.ticb.base.views.CreditsView$MyOnTouchListener implements android.view.View$OnTouchListener {
	 /* .source "CreditsView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/views/CreditsView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "MyOnTouchListener" */
} // .end annotation
/* # instance fields */
Float lastTouchX;
Float lastTouchY;
Boolean moved;
final de.nurogames.android.ticb.base.views.CreditsView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.CreditsView$MyOnTouchListener ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 276 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 278 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->moved:Z */
/* .line 279 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchX:F */
/* .line 280 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchY:F */
return;
} // .end method
/* # virtual methods */
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 7 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .param p2, "arg1" # Landroid/view/MotionEvent; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 288 */
v0 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v0, :cond_5 */
/* .line 290 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->moved:Z */
/* .line 292 */
v0 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchX:F */
/* .line 293 */
v0 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchY:F */
/* .line 297 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchX:F */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$0 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).X ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_1 */
/* .line 298 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchX:F */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$0 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).X ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v2 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Width ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_1 */
/* .line 300 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchY:F */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$0 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).Y ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_1 */
/* .line 301 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchY:F */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$0 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).Y ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v2 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Height ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_1 */
/* .line 304 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = de.nurogames.android.ticb.base.tinysanta.vibrator;
	 /* const-wide/16 v1, 0x28 */
	 (( android.os.Vibrator ) v0 ).vibrate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V
	 /* .line 305 */
} // :cond_0
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v4 );
/* .line 306 */
v0 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$0 ( v0 );
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isClicked ( v5 ); // invoke-virtual {v0, v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 311 */
} // :cond_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchX:F */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).X ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_2 */
/* .line 312 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchX:F */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).X ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v2 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Width ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_2 */
/* .line 314 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchY:F */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).Y ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_2 */
/* .line 315 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchY:F */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).Y ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v2 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Height ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_2 */
/* .line 318 */
v0 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$2 ( v0 );
/* .line 323 */
} // :cond_2
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchX:F */
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_3 */
/* .line 324 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchX:F */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$3 ( v1 );
v2 = de.nurogames.android.ticb.base.core.AppResources.sHumanReadableLanguages;
/* aget-object v2, v2, v3 */
v1 = (( android.graphics.Paint ) v1 ).measureText ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* const/high16 v2, 0x40000000 # 2.0f */
/* mul-float/2addr v1, v2 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_3 */
/* .line 326 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchY:F */
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_3 */
/* .line 327 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchY:F */
/* const/high16 v1, 0x42400000 # 48.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_3 */
/* .line 330 */
/* if-ge v0, v1, :cond_4 */
/* .line 331 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 364 */
} // :cond_3
} // :goto_0
/* .line 333 */
} // :cond_4
/* .line 342 */
} // :cond_5
v0 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne v0, v5, :cond_6 */
/* .line 344 */
v0 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$0 ( v0 );
v0 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isClicked ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 345 */
v0 = this.this$0;
de.nurogames.android.ticb.base.views.CreditsView .access$0 ( v0 );
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isClicked ( v4 ); // invoke-virtual {v0, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 346 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v5 );
/* .line 355 */
} // :cond_6
v0 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_3 */
/* .line 357 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->moved:Z */
/* .line 359 */
v0 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchX:F */
/* .line 360 */
v0 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;->lastTouchY:F */
} // .end method
