public abstract class com.openfeint.internal.resource.ArrayResourceProperty extends com.openfeint.internal.resource.ResourceProperty {
	 /* .source "ArrayResourceProperty.java" */
	 /* # instance fields */
	 private java.lang.Class mElementType;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class", */
	 /* "<+", */
	 /* "Lcom/openfeint/internal/resource/Resource;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.openfeint.internal.resource.ArrayResourceProperty ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<+", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 7 */
/* .local p1, "elementType":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/openfeint/internal/resource/Resource;>;" */
/* invoke-direct {p0}, Lcom/openfeint/internal/resource/ResourceProperty;-><init>()V */
/* .line 8 */
this.mElementType = p1;
/* .line 9 */
return;
} // .end method
/* # virtual methods */
public java.lang.Class elementType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<+", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 11 */
v0 = this.mElementType;
} // .end method
public abstract java.util.List get ( com.openfeint.internal.resource.Resource p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ")", */
/* "Ljava/util/List", */
/* "<+", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ">;" */
/* } */
} // .end annotation
} // .end method
public abstract void set ( com.openfeint.internal.resource.Resource p0, java.util.List p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* "Ljava/util/List", */
/* "<*>;)V" */
/* } */
} // .end annotation
} // .end method
