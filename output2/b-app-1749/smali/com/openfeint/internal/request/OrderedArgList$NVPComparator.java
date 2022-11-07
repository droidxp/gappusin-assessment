class com.openfeint.internal.request.OrderedArgList$NVPComparator implements java.util.Comparator {
	 /* .source "OrderedArgList.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/request/OrderedArgList; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "NVPComparator" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Comparator", */
/* "<", */
/* "Lorg/apache/http/NameValuePair;", */
/* ">;" */
/* } */
} // .end annotation
/* # direct methods */
 com.openfeint.internal.request.OrderedArgList$NVPComparator ( ) {
/* .locals 0 */
/* .prologue */
/* .line 151 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 1 */
/* .param p1, "x0" # Ljava/lang/Object; */
/* .param p2, "x1" # Ljava/lang/Object; */
/* .prologue */
/* .line 151 */
/* check-cast p1, Lorg/apache/http/NameValuePair; */
} // .end local p1 # "x0":Ljava/lang/Object;
/* check-cast p2, Lorg/apache/http/NameValuePair; */
} // .end local p2 # "x1":Ljava/lang/Object;
v0 = (( com.openfeint.internal.request.OrderedArgList$NVPComparator ) p0 ).compare ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/openfeint/internal/request/OrderedArgList$NVPComparator;->compare(Lorg/apache/http/NameValuePair;Lorg/apache/http/NameValuePair;)I
} // .end method
public Integer compare ( org.apache.http.NameValuePair p0, org.apache.http.NameValuePair p1 ) {
/* .locals 3 */
/* .param p1, "a" # Lorg/apache/http/NameValuePair; */
/* .param p2, "b" # Lorg/apache/http/NameValuePair; */
/* .prologue */
/* .line 155 */
v0 = (( java.lang.String ) v1 ).compareTo ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* .line 156 */
/* .local v0, "r":I */
/* if-nez v0, :cond_0 */
/* .line 157 */
v0 = (( java.lang.String ) v1 ).compareTo ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* .line 159 */
} // .end local v0 # "r":I
} // :cond_0
} // .end method
