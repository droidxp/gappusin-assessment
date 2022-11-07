class inal extends java.lang.Enum {
	 /* .source "Compression.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/request/Compression; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x401a */
/* name = "CompressionMethod" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/openfeint/internal/request/Compression$CompressionMethod;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static final com.openfeint.internal.request.Compression$CompressionMethod $VALUES; //synthetic
public static final com.openfeint.internal.request.Compression$CompressionMethod Default;
public static final com.openfeint.internal.request.Compression$CompressionMethod LegacyHeaderless;
public static final com.openfeint.internal.request.Compression$CompressionMethod Uncompressed;
/* # direct methods */
static inal ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 93 */
/* new-instance v0, Lcom/openfeint/internal/request/Compression$CompressionMethod; */
final String v1 = "Default"; // const-string v1, "Default"
/* invoke-direct {v0, v1, v2}, Lcom/openfeint/internal/request/Compression$CompressionMethod;-><init>(Ljava/lang/String;I)V */
/* .line 94 */
/* new-instance v0, Lcom/openfeint/internal/request/Compression$CompressionMethod; */
final String v1 = "Uncompressed"; // const-string v1, "Uncompressed"
/* invoke-direct {v0, v1, v3}, Lcom/openfeint/internal/request/Compression$CompressionMethod;-><init>(Ljava/lang/String;I)V */
/* .line 95 */
/* new-instance v0, Lcom/openfeint/internal/request/Compression$CompressionMethod; */
final String v1 = "LegacyHeaderless"; // const-string v1, "LegacyHeaderless"
/* invoke-direct {v0, v1, v4}, Lcom/openfeint/internal/request/Compression$CompressionMethod;-><init>(Ljava/lang/String;I)V */
/* .line 92 */
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [Lcom/openfeint/internal/request/Compression$CompressionMethod; */
v1 = com.openfeint.internal.request.Compression$CompressionMethod.Default;
/* aput-object v1, v0, v2 */
v1 = com.openfeint.internal.request.Compression$CompressionMethod.Uncompressed;
/* aput-object v1, v0, v3 */
v1 = com.openfeint.internal.request.Compression$CompressionMethod.LegacyHeaderless;
/* aput-object v1, v0, v4 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 92 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.openfeint.internal.request.Compression$CompressionMethod valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 92 */
/* const-class v0, Lcom/openfeint/internal/request/Compression$CompressionMethod; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/openfeint/internal/request/Compression$CompressionMethod; */
} // .end method
public static com.openfeint.internal.request.Compression$CompressionMethod values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 92 */
v0 = com.openfeint.internal.request.Compression$CompressionMethod.$VALUES;
(( com.openfeint.internal.request.Compression$CompressionMethod ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/openfeint/internal/request/Compression$CompressionMethod;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/openfeint/internal/request/Compression$CompressionMethod; */
} // .end method
