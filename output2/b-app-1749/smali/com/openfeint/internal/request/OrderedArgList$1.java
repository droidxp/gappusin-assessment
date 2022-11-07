class com.openfeint.internal.request.OrderedArgList$1 implements java.lang.Iterable {
	 /* .source "OrderedArgList.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/request/OrderedArgList;->accumulate(Lorg/json/JSONObject;Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Iterable", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.request.OrderedArgList this$0; //synthetic
final org.json.JSONObject val$jsonObject; //synthetic
/* # direct methods */
 com.openfeint.internal.request.OrderedArgList$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 111 */
this.this$0 = p1;
this.val$jsonObject = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.util.Iterator iterator ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 115 */
v0 = this.val$jsonObject;
(( org.json.JSONObject ) v0 ).keys ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
} // .end method
