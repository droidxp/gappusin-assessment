class com.Ina.Notegre.MoreAppActivity$1 implements android.view.View$OnClickListener {
	 /* .source "MoreAppActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/Ina/Notegre/MoreAppActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.MoreAppActivity this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.MoreAppActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 53 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 3 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 57 */
v0 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* packed-switch v0, :pswitch_data_0 */
/* .line 68 */
} // :goto_0
return;
/* .line 60 */
/* :pswitch_0 */
v0 = this.this$0;
(( com.Ina.Notegre.MoreAppActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/Ina/Notegre/MoreAppActivity;->finish()V
/* .line 61 */
v0 = this.this$0;
/* const/high16 v1, 0x7f040000 */
/* const v2, 0x7f040004 */
(( com.Ina.Notegre.MoreAppActivity ) v0 ).overridePendingTransition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/Ina/Notegre/MoreAppActivity;->overridePendingTransition(II)V
/* .line 57 */
/* :pswitch_data_0 */
/* .packed-switch 0x7f090000 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
