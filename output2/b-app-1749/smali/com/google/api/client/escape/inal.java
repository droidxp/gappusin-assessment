class inal {
	 /* .source "Platform.java" */
	 /* # static fields */
	 private static final java.lang.ThreadLocal DEST_TL;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ThreadLocal", */
	 /* "<[C>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
static inal ( ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
/* new-instance v0, Lcom/google/api/client/escape/Platform$1; */
/* invoke-direct {v0}, Lcom/google/api/client/escape/Platform$1;-><init>()V */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 23 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 24 */
return;
} // .end method
static charBufferFromThreadLocal ( ) {
/* .locals 1 */
/* .prologue */
/* .line 29 */
v0 = com.google.api.client.escape.Platform.DEST_TL;
(( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, [C */
} // .end method
