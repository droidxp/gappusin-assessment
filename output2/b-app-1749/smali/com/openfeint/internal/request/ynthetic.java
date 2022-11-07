class ynthetic {
	 /* .source "Compression.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/request/Compression; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1008 */
/* name = null */
} // .end annotation
/* # static fields */
static final $SwitchMap$com$openfeint$internal$request$Compression$CompressionMethod; //synthetic
/* # direct methods */
static ynthetic ( ) {
/* .locals 3 */
/* .prologue */
/* .line 22 */
com.openfeint.internal.request.Compression$CompressionMethod .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
	 v0 = com.openfeint.internal.request.Compression$1.$SwitchMap$com$openfeint$internal$request$Compression$CompressionMethod;
	 v1 = com.openfeint.internal.request.Compression$CompressionMethod.Default;
	 v1 = 	 (( com.openfeint.internal.request.Compression$CompressionMethod ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/Compression$CompressionMethod;->ordinal()I
	 int v2 = 1; // const/4 v2, 0x1
	 /* aput v2, v0, v1 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_1 */
} // :goto_0
try { // :try_start_1
	 v0 = com.openfeint.internal.request.Compression$1.$SwitchMap$com$openfeint$internal$request$Compression$CompressionMethod;
	 v1 = com.openfeint.internal.request.Compression$CompressionMethod.LegacyHeaderless;
	 v1 = 	 (( com.openfeint.internal.request.Compression$CompressionMethod ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/Compression$CompressionMethod;->ordinal()I
	 int v2 = 2; // const/4 v2, 0x2
	 /* aput v2, v0, v1 */
	 /* :try_end_1 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_0 */
} // :goto_1
return;
/* :catch_0 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
} // .end method
