class de.nurogames.android.ticb.base.views.InAppPurchaseView$MyOnTouchListener implements android.view.View$OnTouchListener {
	 /* .source "InAppPurchaseView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/views/InAppPurchaseView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "MyOnTouchListener" */
} // .end annotation
/* # instance fields */
Float lastTouchX;
Float lastTouchY;
Boolean moved;
final de.nurogames.android.ticb.base.views.InAppPurchaseView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.InAppPurchaseView$MyOnTouchListener ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 178 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 180 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->moved:Z */
/* .line 181 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
/* .line 182 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchY:F */
return;
} // .end method
/* # virtual methods */
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 9 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .param p2, "arg1" # Landroid/view/MotionEvent; */
/* .prologue */
/* const-wide/16 v7, 0x28 */
int v3 = -1; // const/4 v3, -0x1
int v6 = 0; // const/4 v6, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* .line 190 */
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v1, :cond_5 */
/* .line 192 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->moved:Z */
/* .line 194 */
v1 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
/* .line 195 */
v1 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchY:F */
/* .line 199 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_2 */
/* .line 200 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$0 ( v3 );
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_2 */
/* .line 202 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_2 */
/* .line 203 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$0 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$0 ( v3 );
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_2 */
/* .line 206 */
v1 = de.nurogames.android.ticb.base.tinysanta.market_timer;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 207 */
	 v1 = de.nurogames.android.ticb.base.tinysanta.market_timer;
	 (( java.util.Timer ) v1 ).cancel ( ); // invoke-virtual {v1}, Ljava/util/Timer;->cancel()V
	 /* .line 208 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 210 */
} // :cond_0
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
	 v1 = de.nurogames.android.ticb.base.tinysanta.vibrator;
	 (( android.os.Vibrator ) v1 ).vibrate ( v7, v8 ); // invoke-virtual {v1, v7, v8}, Landroid/os/Vibrator;->vibrate(J)V
	 /* .line 211 */
} // :cond_1
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v4 );
/* .line 212 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$0 ( v1 );
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( v5 ); // invoke-virtual {v1, v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 216 */
} // :cond_2
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).Left ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->Left()F
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_4 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).Right ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->Right()F
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_4 */
/* .line 218 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).Top ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->Top()F
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_4 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchY:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).Bottom ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->Bottom()F
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_4 */
/* .line 221 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = de.nurogames.android.ticb.base.tinysanta.vibrator;
(( android.os.Vibrator ) v1 ).vibrate ( v7, v8 ); // invoke-virtual {v1, v7, v8}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 223 */
} // :cond_3
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
(( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).Hit ( v5 ); // invoke-virtual {v1, v5}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->Hit(Z)V
/* .line 225 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).x_offset ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset()F
/* sub-float/2addr v1, v2 */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).Left ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->Left()F
/* sub-float/2addr v1, v2 */
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).item_spacing ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing()I
/* int-to-float v2, v2 */
/* div-float/2addr v1, v2 */
/* float-to-int v0, v1 */
/* .line 227 */
/* .local v0, "item_nr":I */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
(( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).selectedItem ( v0 ); // invoke-virtual {v1, v0}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->selectedItem(I)V
/* .line 277 */
} // .end local v0 # "item_nr":I
} // :cond_4
} // :goto_0
/* .line 237 */
} // :cond_5
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne v1, v5, :cond_8 */
/* .line 239 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
(( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).Hit ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->Hit(Z)V
/* .line 241 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$0 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked()Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 242 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$0 ( v1 );
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 243 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v5 );
/* .line 246 */
} // :cond_6
/* iget-boolean v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->moved:Z */
/* if-nez v1, :cond_7 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).selectedItem ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->selectedItem()I
/* if-eq v1, v3, :cond_7 */
/* .line 247 */
v1 = this.this$0;
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).selectedItem ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->selectedItem()I
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$2 ( v1,v2 );
/* .line 250 */
} // :cond_7
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
(( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).selectedItem ( v3 ); // invoke-virtual {v1, v3}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->selectedItem(I)V
/* .line 257 */
} // :cond_8
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_4 */
/* .line 259 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
v2 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* sub-float/2addr v1, v2 */
v1 = java.lang.Math .abs ( v1 );
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.views.InAppPurchaseView .access$3 ( v2 );
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_b */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->moved:Z */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
(( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).selectedItem ( v3 ); // invoke-virtual {v1, v3}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->selectedItem(I)V
/* .line 262 */
} // :goto_1
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).Hit ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->Hit()Z
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 264 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).x_offset ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset()F
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).max_offset ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->max_offset()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-gtz v1, :cond_9 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).x_offset ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset()F
/* cmpg-float v1, v1, v6 */
/* if-gez v1, :cond_a */
/* .line 267 */
} // :cond_9
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).x_offset ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset()F
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
v4 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* sub-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
(( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).x_offset ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset(F)V
/* .line 268 */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).x_offset ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset()F
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).max_offset ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->max_offset()I
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_c */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
v2 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v2 );
v2 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v2 ).max_offset ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->max_offset()I
/* int-to-float v2, v2 */
(( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).x_offset ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset(F)V
/* .line 272 */
} // :cond_a
} // :goto_2
v1 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchX:F */
/* .line 273 */
v1 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->lastTouchY:F */
/* goto/16 :goto_0 */
/* .line 260 */
} // :cond_b
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;->moved:Z */
/* goto/16 :goto_1 */
/* .line 269 */
} // :cond_c
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
v1 = (( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).x_offset ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset()F
/* cmpl-float v1, v1, v6 */
/* if-lez v1, :cond_a */
v1 = this.this$0;
de.nurogames.android.ticb.base.views.InAppPurchaseView .access$1 ( v1 );
(( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v1 ).x_offset ( v6 ); // invoke-virtual {v1, v6}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset(F)V
} // .end method
