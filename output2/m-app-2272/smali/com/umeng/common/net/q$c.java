class com.umeng.common.net.q$c extends android.os.AsyncTask {
	 /* .source "ResUtil.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/q; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "c" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Integer;", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
private android.content.Context a;
private java.lang.String b;
private android.widget.ImageView c;
private com.umeng.common.net.q$b d;
private Boolean e;
private com.umeng.common.net.q$a f;
private android.view.animation.Animation g;
private Boolean h;
private java.io.File i;
/* # direct methods */
public com.umeng.common.net.q$c ( ) {
/* .locals 0 */
/* .prologue */
/* .line 503 */
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
/* .line 506 */
this.i = p5;
/* .line 507 */
this.a = p1;
/* .line 508 */
this.b = p3;
/* .line 509 */
this.f = p7;
/* .line 510 */
this.d = p4;
/* .line 511 */
/* iput-boolean p6, p0, Lcom/umeng/common/net/q$c;->e:Z */
/* .line 512 */
this.g = p8;
/* .line 513 */
this.c = p2;
/* .line 514 */
/* iput-boolean p9, p0, Lcom/umeng/common/net/q$c;->h:Z */
/* .line 515 */
return;
} // .end method
/* # virtual methods */
protected android.graphics.drawable.Drawable a ( java.lang.Object...p0 ) {
/* .locals 4 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 533 */
/* sget-boolean v0, Lcom/umeng/common/net/q;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 535 */
/* const-wide/16 v2, 0xbb8 */
try { // :try_start_0
	 java.lang.Thread .sleep ( v2,v3 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 541 */
} // :cond_0
} // :goto_0
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.i;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 542 */
	 v0 = this.i;
	 (( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
	 com.umeng.common.net.q .a ( v0 );
	 /* .line 543 */
	 /* if-nez v0, :cond_1 */
	 /* .line 544 */
	 v1 = this.i;
	 (( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
	 /* .line 545 */
} // :cond_1
com.umeng.common.net.q .a ( );
final String v2 = "get drawable from cacheFile."; // const-string v2, "get drawable from cacheFile."
com.umeng.common.Log .c ( v1,v2 );
/* .line 561 */
} // :goto_1
/* .line 536 */
/* :catch_0 */
/* move-exception v0 */
/* .line 537 */
(( java.lang.InterruptedException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
/* .line 549 */
} // :cond_2
try { // :try_start_1
v0 = this.a;
v2 = this.b;
com.umeng.common.net.q .a ( v0,v2 );
/* .line 552 */
v0 = this.a;
v2 = this.b;
com.umeng.common.net.q .b ( v0,v2 );
/* .line 553 */
if ( v0 != null) { // if-eqz v0, :cond_3
v2 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v2 != null) { // if-eqz v2, :cond_3
	 /* .line 554 */
	 (( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
	 /* .line 553 */
	 com.umeng.common.net.q .a ( v0 );
	 /* .line 555 */
} // :goto_2
com.umeng.common.net.q .a ( );
final String v3 = "get drawable from net else file."; // const-string v3, "get drawable from net else file."
com.umeng.common.Log .c ( v2,v3 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 557 */
/* :catch_1 */
/* move-exception v0 */
/* .line 558 */
com.umeng.common.net.q .a ( );
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
com.umeng.common.Log .e ( v2,v3,v0 );
/* move-object v0, v1 */
/* .line 561 */
} // :cond_3
/* move-object v0, v1 */
} // .end method
protected void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 8 */
/* .prologue */
/* .line 527 */
v0 = this.a;
v1 = this.c;
/* iget-boolean v3, p0, Lcom/umeng/common/net/q$c;->e:Z */
v4 = this.f;
v5 = this.g;
/* iget-boolean v6, p0, Lcom/umeng/common/net/q$c;->h:Z */
v7 = this.b;
/* move-object v2, p1 */
/* invoke-static/range {v0 ..v7}, Lcom/umeng/common/net/q;->a(Landroid/content/Context;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;ZLcom/umeng/common/net/q$a;Landroid/view/animation/Animation;ZLjava/lang/String;)V */
/* .line 528 */
return;
} // .end method
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Ljava/lang/Object; */
(( com.umeng.common.net.q$c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/net/q$c;->a([Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* check-cast p1, Landroid/graphics/drawable/Drawable; */
(( com.umeng.common.net.q$c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/net/q$c;->a(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
protected void onPreExecute ( ) {
/* .locals 2 */
/* .prologue */
/* .line 519 */
/* invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V */
/* .line 520 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 521 */
v0 = this.f;
v1 = this.d;
/* .line 523 */
} // :cond_0
return;
} // .end method
