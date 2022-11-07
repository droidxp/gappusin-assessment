class de.nurogames.android.ticb.base.views.ScoresView$MyOnTouchListener implements android.view.View$OnTouchListener {
	 /* .source "ScoresView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/views/ScoresView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "MyOnTouchListener" */
} // .end annotation
/* # instance fields */
Float lastTouchX;
Float lastTouchY;
Boolean moved;
final de.nurogames.android.ticb.base.views.ScoresView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.ScoresView$MyOnTouchListener ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 464 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 466 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->moved:Z */
/* .line 467 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
/* .line 468 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
return;
} // .end method
/* # virtual methods */
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 10 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .param p2, "arg1" # Landroid/view/MotionEvent; */
/* .prologue */
/* const-wide/16 v8, 0x28 */
int v7 = 4; // const/4 v7, 0x4
int v6 = 1; // const/4 v6, 0x1
int v5 = 3; // const/4 v5, 0x3
int v4 = 0; // const/4 v4, 0x0
/* .line 476 */
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v1, :cond_a */
/* .line 478 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->moved:Z */
/* .line 480 */
v1 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
/* .line 481 */
v1 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
/* .line 485 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_1 */
/* .line 486 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$0 ( v3 );
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
/* .line 488 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_1 */
/* .line 489 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$0 ( v3 );
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
/* .line 492 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
	 v1 = de.nurogames.android.ticb.base.tinysanta.vibrator;
	 (( android.os.Vibrator ) v1 ).vibrate ( v8, v9 ); // invoke-virtual {v1, v8, v9}, Landroid/os/Vibrator;->vibrate(J)V
	 /* .line 493 */
} // :cond_0
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v4 );
/* .line 494 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$0 ( v1 );
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( v6 ); // invoke-virtual {v1, v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 498 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "x":I */
} // :goto_0
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v1 );
/* array-length v1, v1 */
/* add-int/lit8 v1, v1, -0x2 */
/* if-lt v0, v1, :cond_6 */
/* .line 514 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v1 );
/* aget-object v1, v1, v5 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 516 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v5 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_3 */
/* .line 517 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v5 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v3 );
/* aget-object v3, v3, v5 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_3 */
/* .line 519 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v5 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_3 */
/* .line 520 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v5 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v3 );
/* aget-object v3, v3, v5 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_3 */
/* .line 523 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = de.nurogames.android.ticb.base.tinysanta.vibrator;
(( android.os.Vibrator ) v1 ).vibrate ( v8, v9 ); // invoke-virtual {v1, v8, v9}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 524 */
} // :cond_2
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v4 );
/* .line 525 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v1 );
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.views.ScoresView .access$2 ( v2 );
/* aget-object v1, v1, v2 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isToggled ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 526 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v1 );
/* aget-object v1, v1, v5 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isToggled ( v6 ); // invoke-virtual {v1, v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 527 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$4 ( v1 );
/* .line 530 */
} // :cond_3
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v1 );
/* aget-object v1, v1, v7 */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 532 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v7 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_5 */
/* .line 533 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v7 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v3 );
/* aget-object v3, v3, v7 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_5 */
/* .line 535 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v7 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_5 */
/* .line 536 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v7 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v3 );
/* aget-object v3, v3, v7 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_5 */
/* .line 539 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = de.nurogames.android.ticb.base.tinysanta.vibrator;
(( android.os.Vibrator ) v1 ).vibrate ( v8, v9 ); // invoke-virtual {v1, v8, v9}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 540 */
} // :cond_4
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v4 );
/* .line 542 */
/* if-nez v1, :cond_9 */
/* .line 543 */
/* .line 577 */
} // .end local v0 # "x":I
} // :cond_5
} // :goto_1
/* .line 500 */
/* .restart local v0 # "x":I */
} // :cond_6
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_8 */
/* .line 501 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v3 );
/* aget-object v3, v3, v0 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_8 */
/* .line 503 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_8 */
/* .line 504 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v2 );
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v3 );
/* aget-object v3, v3, v0 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_8 */
/* .line 507 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v1 != null) { // if-eqz v1, :cond_7
v1 = de.nurogames.android.ticb.base.tinysanta.vibrator;
(( android.os.Vibrator ) v1 ).vibrate ( v8, v9 ); // invoke-virtual {v1, v8, v9}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 508 */
} // :cond_7
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v4 );
/* .line 509 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v1 );
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.views.ScoresView .access$2 ( v2 );
/* aget-object v1, v1, v2 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isToggled ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 510 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$3 ( v1,v0 );
/* .line 511 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$1 ( v1 );
/* aget-object v1, v1, v0 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isToggled ( v6 ); // invoke-virtual {v1, v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 498 */
} // :cond_8
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_0 */
/* .line 545 */
} // :cond_9
/* goto/16 :goto_1 */
/* .line 555 */
} // .end local v0 # "x":I
} // :cond_a
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne v1, v6, :cond_b */
/* .line 557 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$0 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 558 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.ScoresView .access$0 ( v1 );
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 559 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v6 );
/* goto/16 :goto_1 */
/* .line 568 */
} // :cond_b
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_5 */
/* .line 570 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->moved:Z */
/* .line 572 */
v1 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchX:F */
/* .line 573 */
v1 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;->lastTouchY:F */
/* goto/16 :goto_1 */
} // .end method
