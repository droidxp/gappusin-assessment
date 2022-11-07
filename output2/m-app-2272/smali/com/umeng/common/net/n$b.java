class com.umeng.common.net.n$b extends android.os.AsyncTask {
	 /* .source "ReportClient.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/n; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "b" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* "Lcom/umeng/common/net/p$a;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
final com.umeng.common.net.n a; //synthetic
private com.umeng.common.net.o b;
private com.umeng.common.net.n$a c;
/* # direct methods */
public com.umeng.common.net.n$b ( ) {
/* .locals 0 */
/* .prologue */
/* .line 75 */
this.a = p1;
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
/* .line 76 */
this.b = p2;
/* .line 77 */
this.c = p3;
/* .line 78 */
return;
} // .end method
/* # virtual methods */
protected com.umeng.common.net.p$a a ( java.lang.Integer...p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 94 */
v0 = this.a;
v1 = this.b;
(( com.umeng.common.net.n ) v0 ).send ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/common/net/n;->send(Lcom/umeng/common/net/o;)Lcom/umeng/common/net/p$a;
} // .end method
protected void a ( com.umeng.common.net.p$a p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 87 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 88 */
v0 = this.c;
/* .line 90 */
} // :cond_0
return;
} // .end method
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Ljava/lang/Integer; */
(( com.umeng.common.net.n$b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/net/n$b;->a([Ljava/lang/Integer;)Lcom/umeng/common/net/p$a;
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* check-cast p1, Lcom/umeng/common/net/p$a; */
(( com.umeng.common.net.n$b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/net/n$b;->a(Lcom/umeng/common/net/p$a;)V
return;
} // .end method
protected void onPreExecute ( ) {
/* .locals 1 */
/* .prologue */
/* .line 81 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 82 */
v0 = this.c;
/* .line 84 */
} // :cond_0
return;
} // .end method
