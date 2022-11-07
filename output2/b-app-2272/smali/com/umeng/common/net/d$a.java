class com.umeng.common.net.d$a {
	 /* .source "DownloadTool.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/d; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "a" */
} // .end annotation
/* # instance fields */
com.umeng.common.net.DownloadingService$b a;
android.app.Notification b;
Integer c;
Integer d;
com.umeng.common.net.a$a e;
 f;
/* # direct methods */
public com.umeng.common.net.d$a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 66 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 63 */
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [J */
this.f = v0;
/* .line 67 */
/* iput p2, p0, Lcom/umeng/common/net/d$a;->c:I */
/* .line 68 */
this.e = p1;
/* .line 69 */
return;
} // .end method
/* # virtual methods */
public void a ( android.util.SparseArray p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/util/SparseArray", */
/* "<", */
/* "Lcom/umeng/common/net/d$a;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 72 */
/* iget v0, p0, Lcom/umeng/common/net/d$a;->c:I */
(( android.util.SparseArray ) p1 ).put ( v0, p0 ); // invoke-virtual {p1, v0, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
/* .line 73 */
return;
} // .end method
public void b ( android.util.SparseArray p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/util/SparseArray", */
/* "<", */
/* "Lcom/umeng/common/net/d$a;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 76 */
/* iget v0, p0, Lcom/umeng/common/net/d$a;->c:I */
v0 = (( android.util.SparseArray ) p1 ).indexOfKey ( v0 ); // invoke-virtual {p1, v0}, Landroid/util/SparseArray;->indexOfKey(I)I
/* if-ltz v0, :cond_0 */
/* .line 77 */
/* iget v0, p0, Lcom/umeng/common/net/d$a;->c:I */
(( android.util.SparseArray ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Landroid/util/SparseArray;->remove(I)V
/* .line 78 */
} // :cond_0
return;
} // .end method
