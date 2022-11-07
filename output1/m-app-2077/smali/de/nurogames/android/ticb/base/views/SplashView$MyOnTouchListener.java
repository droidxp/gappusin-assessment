class de.nurogames.android.ticb.base.views.SplashView$MyOnTouchListener implements android.view.View$OnTouchListener {
	 /* .source "SplashView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/views/SplashView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "MyOnTouchListener" */
} // .end annotation
/* # instance fields */
Float lastTouchX;
Float lastTouchY;
Boolean moved;
final de.nurogames.android.ticb.base.views.SplashView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.SplashView$MyOnTouchListener ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 150 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 152 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/views/SplashView$MyOnTouchListener;->moved:Z */
/* .line 153 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/SplashView$MyOnTouchListener;->lastTouchX:F */
/* .line 154 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/SplashView$MyOnTouchListener;->lastTouchY:F */
return;
} // .end method
/* # virtual methods */
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 2 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .param p2, "arg1" # Landroid/view/MotionEvent; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 161 */
v0 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 166 */
	 v0 = 	 (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
	 /* if-eq v0, v1, :cond_0 */
	 /* .line 171 */
	 (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
	 /* .line 173 */
} // :cond_0
} // .end method
