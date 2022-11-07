class de.nurogames.android.ticb.base.views.HelpView$MyOnTouchListener implements android.view.View$OnTouchListener {
	 /* .source "HelpView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/views/HelpView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "MyOnTouchListener" */
} // .end annotation
/* # instance fields */
Float lastTouchX;
Float lastTouchY;
Boolean moved;
final de.nurogames.android.ticb.base.views.HelpView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.HelpView$MyOnTouchListener ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 294 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 296 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->moved:Z */
/* .line 297 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchX:F */
/* .line 298 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchY:F */
return;
} // .end method
/* # virtual methods */
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 8 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .param p2, "arg1" # Landroid/view/MotionEvent; */
/* .prologue */
/* const-wide/16 v6, 0x28 */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 306 */
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v1, :cond_6 */
/* .line 308 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->moved:Z */
/* .line 310 */
v1 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchX:F */
/* .line 311 */
v1 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchY:F */
/* .line 315 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_1 */
/* .line 316 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$0 ( v3 );
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
/* .line 318 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_1 */
/* .line 319 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$0 ( v3 );
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
/* .line 322 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
	 v1 = de.nurogames.android.ticb.base.tinysanta.vibrator;
	 (( android.os.Vibrator ) v1 ).vibrate ( v6, v7 ); // invoke-virtual {v1, v6, v7}, Landroid/os/Vibrator;->vibrate(J)V
	 /* .line 323 */
} // :cond_0
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v4 );
/* .line 324 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$0 ( v1 );
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( v5 ); // invoke-virtual {v1, v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 328 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "x":I */
} // :goto_0
v1 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$1 ( v1 );
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_3 */
/* .line 373 */
} // .end local v0 # "x":I
} // :cond_2
} // :goto_1
/* .line 330 */
/* .restart local v0 # "x":I */
} // :cond_3
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$1 ( v2 );
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_5 */
/* .line 331 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$1 ( v2 );
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$1 ( v3 );
/* aget-object v3, v3, v0 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_5 */
/* .line 333 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$1 ( v2 );
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_5 */
/* .line 334 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$1 ( v2 );
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$1 ( v3 );
/* aget-object v3, v3, v0 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_5 */
/* .line 337 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = de.nurogames.android.ticb.base.tinysanta.vibrator;
(( android.os.Vibrator ) v1 ).vibrate ( v6, v7 ); // invoke-virtual {v1, v6, v7}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 338 */
} // :cond_4
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v4 );
/* .line 339 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$1 ( v1 );
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.views.HelpView .access$2 ( v2 );
/* aget-object v1, v1, v2 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isToggled ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 340 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$3 ( v1,v0 );
/* .line 341 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$1 ( v1 );
/* aget-object v1, v1, v0 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isToggled ( v5 ); // invoke-virtual {v1, v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 328 */
} // :cond_5
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_0 */
/* .line 351 */
} // .end local v0 # "x":I
} // :cond_6
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne v1, v5, :cond_7 */
/* .line 353 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$0 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 354 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.HelpView .access$0 ( v1 );
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 355 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v5 );
/* goto/16 :goto_1 */
/* .line 364 */
} // :cond_7
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_2 */
/* .line 366 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->moved:Z */
/* .line 368 */
v1 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchX:F */
/* .line 369 */
v1 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;->lastTouchY:F */
/* goto/16 :goto_1 */
} // .end method
