class com.ansca.corona.CoronaActivity$2 implements android.view.animation.Animation$AnimationListener {
	 /* .source "CoronaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaActivity;->hideSplashScreen()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaActivity this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaActivity$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 848 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onAnimationEnd ( android.view.animation.Animation p0 ) {
/* .locals 2 */
/* .param p1, "animation" # Landroid/view/animation/Animation; */
/* .prologue */
/* .line 859 */
v0 = this.this$0;
com.ansca.corona.CoronaActivity .access$400 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 860 */
	 v0 = this.this$0;
	 com.ansca.corona.CoronaActivity .access$400 ( v0 );
	 /* new-instance v1, Lcom/ansca/corona/CoronaActivity$2$1; */
	 /* invoke-direct {v1, p0}, Lcom/ansca/corona/CoronaActivity$2$1;-><init>(Lcom/ansca/corona/CoronaActivity$2;)V */
	 (( android.widget.ImageView ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z
	 /* .line 873 */
} // :cond_0
return;
} // .end method
public void onAnimationRepeat ( android.view.animation.Animation p0 ) {
/* .locals 0 */
/* .param p1, "animation" # Landroid/view/animation/Animation; */
/* .prologue */
/* .line 854 */
return;
} // .end method
public void onAnimationStart ( android.view.animation.Animation p0 ) {
/* .locals 0 */
/* .param p1, "animation" # Landroid/view/animation/Animation; */
/* .prologue */
/* .line 851 */
return;
} // .end method
