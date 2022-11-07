class inal extends java.lang.Enum {
	 /* .source "WYRect.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/wiyun/engine/types/WYRect; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x401a */
/* name = "Edge" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/wiyun/engine/types/WYRect$Edge;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static final com.wiyun.engine.types.WYRect$Edge ENUM$VALUES; //synthetic
public static final com.wiyun.engine.types.WYRect$Edge MaxXEdge;
public static final com.wiyun.engine.types.WYRect$Edge MaxYEdge;
public static final com.wiyun.engine.types.WYRect$Edge MinXEdge;
public static final com.wiyun.engine.types.WYRect$Edge MinYEdge;
/* # direct methods */
static inal ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 174 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect$Edge; */
final String v1 = "MinXEdge"; // const-string v1, "MinXEdge"
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYRect$Edge;-><init>(Ljava/lang/String;I)V */
/* .line 175 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect$Edge; */
final String v1 = "MinYEdge"; // const-string v1, "MinYEdge"
/* invoke-direct {v0, v1, v3}, Lcom/wiyun/engine/types/WYRect$Edge;-><init>(Ljava/lang/String;I)V */
/* .line 176 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect$Edge; */
final String v1 = "MaxXEdge"; // const-string v1, "MaxXEdge"
/* invoke-direct {v0, v1, v4}, Lcom/wiyun/engine/types/WYRect$Edge;-><init>(Ljava/lang/String;I)V */
/* .line 177 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect$Edge; */
final String v1 = "MaxYEdge"; // const-string v1, "MaxYEdge"
/* invoke-direct {v0, v1, v5}, Lcom/wiyun/engine/types/WYRect$Edge;-><init>(Ljava/lang/String;I)V */
/* .line 173 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [Lcom/wiyun/engine/types/WYRect$Edge; */
v1 = com.wiyun.engine.types.WYRect$Edge.MinXEdge;
/* aput-object v1, v0, v2 */
v1 = com.wiyun.engine.types.WYRect$Edge.MinYEdge;
/* aput-object v1, v0, v3 */
v1 = com.wiyun.engine.types.WYRect$Edge.MaxXEdge;
/* aput-object v1, v0, v4 */
v1 = com.wiyun.engine.types.WYRect$Edge.MaxYEdge;
/* aput-object v1, v0, v5 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 173 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.wiyun.engine.types.WYRect$Edge valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* const-class v0, Lcom/wiyun/engine/types/WYRect$Edge; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/wiyun/engine/types/WYRect$Edge; */
} // .end method
public static com.wiyun.engine.types.WYRect$Edge values ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1 */
v0 = com.wiyun.engine.types.WYRect$Edge.ENUM$VALUES;
/* array-length v1, v0 */
/* new-array v2, v1, [Lcom/wiyun/engine/types/WYRect$Edge; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
