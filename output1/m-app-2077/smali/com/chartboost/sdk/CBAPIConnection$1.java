class com.chartboost.sdk.CBAPIConnection$1 implements android.content.DialogInterface$OnCancelListener {
	 /* .source "CBAPIConnection.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/chartboost/sdk/CBAPIConnection;->onPreExecute()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.chartboost.sdk.CBAPIConnection this$0; //synthetic
/* # direct methods */
 com.chartboost.sdk.CBAPIConnection$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 86 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCancel ( android.content.DialogInterface p0 ) {
/* .locals 2 */
/* .param p1, "arg0" # Landroid/content/DialogInterface; */
/* .prologue */
/* .line 89 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
(( com.chartboost.sdk.CBAPIConnection ) v0 ).cancel ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/CBAPIConnection;->cancel(Z)Z
/* .line 90 */
return;
} // .end method
