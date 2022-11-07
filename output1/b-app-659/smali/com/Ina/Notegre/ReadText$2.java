class com.Ina.Notegre.ReadText$2 implements android.view.animation.Animation$AnimationListener {
	 /* .source "ReadText.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/Ina/Notegre/ReadText; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.ReadText this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.ReadText$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 264 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onAnimationEnd ( android.view.animation.Animation p0 ) {
/* .locals 2 */
/* .param p1, "animation" # Landroid/view/animation/Animation; */
/* .prologue */
/* .line 285 */
v0 = this.this$0;
com.Ina.Notegre.ReadText .access$11 ( v0 );
(( android.widget.LinearLayout ) v0 ).getTag ( ); // invoke-virtual {v0}, Landroid/widget/LinearLayout;->getTag()Ljava/lang/Object;
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
final String v1 = "1"; // const-string v1, "1"
v0 = (( java.lang.String ) v0 ).endsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 287 */
	 v0 = this.this$0;
	 com.Ina.Notegre.ReadText .access$12 ( v0 );
	 /* const/16 v1, 0x8 */
	 (( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
	 /* .line 295 */
} // :cond_0
} // :goto_0
return;
/* .line 289 */
} // :cond_1
v0 = this.this$0;
com.Ina.Notegre.ReadText .access$11 ( v0 );
(( android.widget.LinearLayout ) v0 ).getTag ( ); // invoke-virtual {v0}, Landroid/widget/LinearLayout;->getTag()Ljava/lang/Object;
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
final String v1 = "0"; // const-string v1, "0"
v0 = (( java.lang.String ) v0 ).endsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 291 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
com.Ina.Notegre.ReadText .access$2 ( v0,v1 );
} // .end method
public void onAnimationRepeat ( android.view.animation.Animation p0 ) {
/* .locals 0 */
/* .param p1, "animation" # Landroid/view/animation/Animation; */
/* .prologue */
/* .line 279 */
return;
} // .end method
public void onAnimationStart ( android.view.animation.Animation p0 ) {
/* .locals 0 */
/* .param p1, "animation" # Landroid/view/animation/Animation; */
/* .prologue */
/* .line 272 */
return;
} // .end method
