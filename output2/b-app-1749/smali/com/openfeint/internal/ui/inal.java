class inal implements java.util.Comparator {
	 /* .source "WebViewCache.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache;->testOnlyManifestItems()[Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Comparator", */
/* "<", */
/* "Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem;", */
/* ">;" */
/* } */
} // .end annotation
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1181 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer compare ( com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem p0, com.openfeint.internal.ui.WebViewCache$TestOnlyManifestItem p1 ) {
/* .locals 2 */
/* .param p1, "lhs" # Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem; */
/* .param p2, "rhs" # Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem; */
/* .prologue */
/* .line 1183 */
v0 = this.path;
v1 = this.path;
v0 = (( java.lang.String ) v0 ).compareTo ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 1 */
/* .param p1, "x0" # Ljava/lang/Object; */
/* .param p2, "x1" # Ljava/lang/Object; */
/* .prologue */
/* .line 1181 */
/* check-cast p1, Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem; */
} // .end local p1 # "x0":Ljava/lang/Object;
/* check-cast p2, Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem; */
} // .end local p2 # "x1":Ljava/lang/Object;
v0 = (( com.openfeint.internal.ui.WebViewCache$8 ) p0 ).compare ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/openfeint/internal/ui/WebViewCache$8;->compare(Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem;Lcom/openfeint/internal/ui/WebViewCache$TestOnlyManifestItem;)I
} // .end method
