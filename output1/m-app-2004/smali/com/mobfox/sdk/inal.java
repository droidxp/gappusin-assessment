public class inal extends java.lang.Enum {
	 /* .source "Mode.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum", */
	 /* "<", */
	 /* "Lcom/mobfox/sdk/Mode;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
private static final com.mobfox.sdk.Mode $VALUES; //synthetic
public static final com.mobfox.sdk.Mode LIVE;
public static final com.mobfox.sdk.Mode TEST;
/* # direct methods */
static inal ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v3 = 1; // const/4 v3, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 4 */
	 /* new-instance v0, Lcom/mobfox/sdk/Mode; */
	 final String v1 = "LIVE"; // const-string v1, "LIVE"
	 /* invoke-direct {v0, v1, v2}, Lcom/mobfox/sdk/Mode;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/mobfox/sdk/Mode; */
	 final String v1 = "TEST"; // const-string v1, "TEST"
	 /* invoke-direct {v0, v1, v3}, Lcom/mobfox/sdk/Mode;-><init>(Ljava/lang/String;I)V */
	 /* .line 3 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* new-array v0, v0, [Lcom/mobfox/sdk/Mode; */
	 v1 = com.mobfox.sdk.Mode.LIVE;
	 /* aput-object v1, v0, v2 */
	 v1 = com.mobfox.sdk.Mode.TEST;
	 /* aput-object v1, v0, v3 */
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
/* .line 3 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.mobfox.sdk.Mode valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 3 */
/* const-class v0, Lcom/mobfox/sdk/Mode; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/mobfox/sdk/Mode; */
} // .end method
public static com.mobfox.sdk.Mode values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 3 */
v0 = com.mobfox.sdk.Mode.$VALUES;
(( com.mobfox.sdk.Mode ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/mobfox/sdk/Mode;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/mobfox/sdk/Mode; */
} // .end method
